package org.mithril.core;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;

public class ButtonGroup extends ViewGroup {

    public ButtonGroup(Context context) {
        super(context);
    }

    public ButtonGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ButtonGroup(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onLayout(boolean b, int i, int i2, int i3, int i4) {

        int childCount = getChildCount();

        Log.d(ButtonGroup.class.toString(), "childCount=" + childCount);
    }
}
