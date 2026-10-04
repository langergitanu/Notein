package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C22049OooOo0O;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
class SmoothCalendarLayoutManager extends LinearLayoutManager {
    private static final float MILLISECONDS_PER_INCH = 100.0f;

    public SmoothCalendarLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C22075OooOoOO c22075OooOoOO, int i) {
        C22049OooOo0O c22049OooOo0O = new C22049OooOo0O(recyclerView.getContext()) { // from class: com.google.android.material.datepicker.SmoothCalendarLayoutManager.1
            @Override // androidx.recyclerview.widget.C22049OooOo0O
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return SmoothCalendarLayoutManager.MILLISECONDS_PER_INCH / displayMetrics.densityDpi;
            }
        };
        c22049OooOo0O.setTargetPosition(i);
        startSmoothScroll(c22049OooOo0O);
    }
}
