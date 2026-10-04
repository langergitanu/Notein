package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.C21532OooOOo;
import com.google.firebase.inappmessaging.display.C17126R;
import com.google.firebase.inappmessaging.display.internal.Logging;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class BaseModalLayout extends FrameLayout {
    private static final float DEFAULT_MAX_HEIGHT_PCT = -1.0f;
    private static final float DEFAULT_MAX_WIDTH_PCT = -1.0f;
    private DisplayMetrics mDisplay;
    private float mMaxHeightPct;
    private float mMaxWidthPct;
    private List<View> mVisibleChildren;

    public BaseModalLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mVisibleChildren = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C17126R.styleable.ModalLayout, 0, 0);
        try {
            this.mMaxWidthPct = typedArrayObtainStyledAttributes.getFloat(C17126R.styleable.ModalLayout_maxWidthPct, -1.0f);
            this.mMaxHeightPct = typedArrayObtainStyledAttributes.getFloat(C17126R.styleable.ModalLayout_maxHeightPct, -1.0f);
            typedArrayObtainStyledAttributes.recycle();
            this.mDisplay = context.getResources().getDisplayMetrics();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public int calculateBaseHeight(int i) {
        if (getMaxHeightPct() <= 0.0f) {
            Logging.logd("Height: restrict by spec");
            return View.MeasureSpec.getSize(i);
        }
        Logging.logd("Height: restrict by pct");
        return roundToNearest((int) (getMaxHeightPct() * getDisplayMetrics().heightPixels), 4);
    }

    public int calculateBaseWidth(int i) {
        if (getMaxWidthPct() <= 0.0f) {
            Logging.logd("Width: restrict by spec");
            return View.MeasureSpec.getSize(i);
        }
        Logging.logd("Width: restrict by pct");
        return roundToNearest((int) (getMaxWidthPct() * getDisplayMetrics().widthPixels), 4);
    }

    public int dpToPixels(int i) {
        return (int) Math.floor(TypedValue.applyDimension(1, i, this.mDisplay));
    }

    public View findChildById(int i) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalStateException(C21532OooOOo.OooO0OO(i, "No such child: "));
    }

    public int getDesiredHeight(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredHeight();
    }

    public int getDesiredWidth(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredWidth();
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.mDisplay;
    }

    public int getHeightWithMargins(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        FrameLayout.LayoutParams layoutParams = getLayoutParams(view);
        return getDesiredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public FrameLayout.LayoutParams getLayoutParams(View view) {
        return (FrameLayout.LayoutParams) view.getLayoutParams();
    }

    public int getMarginBottom(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return getLayoutParams(view).bottomMargin;
    }

    public int getMarginTop(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return getLayoutParams(view).topMargin;
    }

    public float getMaxHeightPct() {
        return this.mMaxHeightPct;
    }

    public float getMaxWidthPct() {
        return this.mMaxWidthPct;
    }

    public List<View> getVisibleChildren() {
        return this.mVisibleChildren;
    }

    public int getWidthWithMargins(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        FrameLayout.LayoutParams layoutParams = getLayoutParams(view);
        return getDesiredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin;
    }

    public void layoutChild(View view, int i, int i2) {
        layoutChild(view, i, i2, getDesiredWidth(view) + i, getDesiredHeight(view) + i2);
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        Logging.logdPair("\tdesired (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
        super.measureChildWithMargins(view, i, i2, i3, i4);
        Logging.logdPair("\tactual  (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Logging.logdHeader("BEGIN LAYOUT");
        Logging.logd("onLayout: l: " + i + ", t: " + i2 + ", r: " + i3 + ", b: " + i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Logging.logdHeader("BEGIN MEASURE");
        Logging.logdPair("Display", getDisplayMetrics().widthPixels, getDisplayMetrics().heightPixels);
        this.mVisibleChildren.clear();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                this.mVisibleChildren.add(childAt);
            } else {
                Logging.logdNumber("Skipping GONE child", i3);
            }
        }
    }

    public int roundToNearest(int i, int i2) {
        return Math.round(i / i2) * i2;
    }

    public void layoutChild(View view, int i, int i2, int i3, int i4) {
        Logging.logdPair("\tleft, right", i, i3);
        Logging.logdPair("\ttop, bottom", i2, i4);
        view.layout(i, i2, i3, i4);
    }
}
