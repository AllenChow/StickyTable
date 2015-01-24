package com.allen.stickytable;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

public class CHScrollView extends HorizontalScrollView {
	

	private CHScrollViewListener chScrollViewListener;
	public CHScrollView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		this.chScrollViewListener = (CHScrollViewListener) context;
	}

	
	public CHScrollView(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.chScrollViewListener = (CHScrollViewListener) context;
	}

	public CHScrollView(Context context) {
		super(context);
		this.chScrollViewListener = (CHScrollViewListener) context;
	}
	@Override
	public boolean onTouchEvent(MotionEvent ev) {
		//���д�����ֵ
		chScrollViewListener.setTouchView(this);
		return super.onTouchEvent(ev);
	}
	
	
	@Override
	protected void onScrollChanged(int l, int t, int oldl, int oldt) {
		if(chScrollViewListener.getTouchView() == this) {
			this.chScrollViewListener.onScrollChanged(l, t, oldl, oldt);
		}else{
			super.onScrollChanged(l, t, oldl, oldt);
		}
	}
}
