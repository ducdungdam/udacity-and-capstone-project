package com.ducdungdam.dartfriends.view.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ducdungdam.dartfriends.R;
import com.ducdungdam.dartfriends.databinding.FragmentMainImprintBinding;


public class MainImprintFragment extends Fragment {
  private FragmentMainImprintBinding rootView;

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      Bundle savedInstanceState) {
    rootView = DataBindingUtil.inflate(inflater, R.layout.fragment_main_imprint, container, false);
    return rootView.getRoot();
  }
}
