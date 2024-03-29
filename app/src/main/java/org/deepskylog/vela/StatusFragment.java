package org.deepskylog.vela;

import android.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.deepskylog.vela.telescopecontrol.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * StatusFragment.OnFragmentInteractionListener interface
 * to handle interaction events.
 * Use the {@link StatusFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StatusFragment extends Fragment {
    public StatusFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment StatusFragment.
     */
    public static StatusFragment newInstance() {
        return new StatusFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        
        // Read the preference for the fan.
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this.getActivity());
        boolean fanAvailable = sharedPref.getBoolean("fan_checkbox", false);
        System.out.println("TEST : " + fanAvailable);

        return inflater.inflate(R.layout.fragment_status, container, false);
    }
}
