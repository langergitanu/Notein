package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.OooO0OO;
import androidx.core.view.ViewCompat;
import com.google.android.material.C15966R;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
class RadialViewGroup extends ConstraintLayout {
    static final int LEVEL_1 = 1;
    static final int LEVEL_2 = 2;
    static final float LEVEL_RADIUS_RATIO = 0.66f;
    private static final String SKIP_TAG = "skip";
    private MaterialShapeDrawable background;
    private int radius;
    private final Runnable updateLayoutParametersRunnable;

    public RadialViewGroup(Context context) {
        this(context, null);
    }

    private void addConstraints(List<View> list, androidx.constraintlayout.widget.OooO0OO oooO0OO, int i) {
        Iterator<View> it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            int id = it.next().getId();
            int i2 = C15966R.id.circle_center;
            OooO0OO.OooO0O0 oooO0O0 = oooO0OO.OooOO0(id).f64014OooO0o0;
            oooO0O0.f64056OooOoOO = i2;
            oooO0O0.f64058OooOoo0 = i;
            oooO0O0.f64057OooOoo = size;
            size += 360.0f / list.size();
        }
    }

    private Drawable createBackground() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.background = materialShapeDrawable;
        materialShapeDrawable.setCornerSize(new RelativeCornerSize(0.5f));
        this.background.setFillColor(ColorStateList.valueOf(-1));
        return this.background;
    }

    private static boolean shouldSkipView(View view) {
        return SKIP_TAG.equals(view.getTag());
    }

    private void updateLayoutParamsAsync() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.updateLayoutParametersRunnable);
            handler.post(this.updateLayoutParametersRunnable);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(ViewCompat.generateViewId());
        }
        updateLayoutParamsAsync();
    }

    public int getLeveledRadius(int i) {
        return i == 2 ? Math.round(this.radius * LEVEL_RADIUS_RATIO) : this.radius;
    }

    public int getRadius() {
        return this.radius;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        updateLayoutParams();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        updateLayoutParamsAsync();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.background.setFillColor(ColorStateList.valueOf(i));
    }

    public void setRadius(int i) {
        this.radius = i;
        updateLayoutParams();
    }

    public void updateLayoutParams() {
        androidx.constraintlayout.widget.OooO0OO oooO0OO = new androidx.constraintlayout.widget.OooO0OO();
        oooO0OO.OooO0o0(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != C15966R.id.circle_center && !shouldSkipView(childAt)) {
                int i2 = (Integer) childAt.getTag(C15966R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            addConstraints((List) entry.getValue(), oooO0OO, getLeveledRadius(((Integer) entry.getKey()).intValue()));
        }
        oooO0OO.OooO0O0(this);
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C15966R.layout.material_radial_view_group, this);
        ViewCompat.setBackground(this, createBackground());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15966R.styleable.RadialViewGroup, i, 0);
        this.radius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C15966R.styleable.RadialViewGroup_materialCircleRadius, 0);
        this.updateLayoutParametersRunnable = new Runnable() { // from class: com.google.android.material.timepicker.OooO0OO
            @Override // java.lang.Runnable
            public final void run() {
                this.f67777OooOo0o.updateLayoutParams();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }
}
