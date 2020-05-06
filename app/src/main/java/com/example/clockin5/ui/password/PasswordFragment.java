package com.example.clockin5.ui.password;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.clockin5.R;

public class PasswordFragment extends Fragment {

    private PasswordViewModel passwordViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        passwordViewModel =
                ViewModelProviders.of(this).get(PasswordViewModel.class);
        View root = inflater.inflate(R.layout.fragment_password, container, false);
        
        passwordViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}
