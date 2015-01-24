package com.allen.stickytable;

import android.widget.HorizontalScrollView;


public interface CHScrollViewListener {
	public void onScrollChanged(int l, int t, int oldl, int oldt);
	public void addHViews(final CHScrollView hScrollView);
	public HorizontalScrollView getTouchView();
	public void setTouchView(HorizontalScrollView mTouchView);
}
