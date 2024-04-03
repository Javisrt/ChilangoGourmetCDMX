package Controlador;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chilangogourmetcdmx.Bebidas;
import com.example.chilangogourmetcdmx.Comida;
import com.example.chilangogourmetcdmx.Complementos;

import java.util.ArrayList;
import java.util.List;

public class PagerController extends FragmentPagerAdapter {
    private int numoftabs;

    public PagerController(@NonNull FragmentManager fm, int numoftabs) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.numoftabs = numoftabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Comida();
            case 1:
                return new Bebidas();
            case 2:
                return new Complementos();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }
}
