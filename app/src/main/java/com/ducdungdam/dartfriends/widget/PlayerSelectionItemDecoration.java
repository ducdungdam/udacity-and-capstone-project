package com.ducdungdam.dartfriends.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.view.View;
import com.ducdungdam.dartfriends.R;

public class PlayerSelectionItemDecoration extends ItemDecoration {

  private final int paddingHorizontal;

  public PlayerSelectionItemDecoration(Context context) {
    this.paddingHorizontal = (int) context.getResources().getDimension(R.dimen.spacing_medium);
  }


  @Override
  public void getItemOffsets(Rect outRect, View view, RecyclerView parent,
      RecyclerView.State state) {
    outRect.set(paddingHorizontal, paddingHorizontal, paddingHorizontal, paddingHorizontal);
  }
}
