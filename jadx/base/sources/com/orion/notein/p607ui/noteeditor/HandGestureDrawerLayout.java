package com.orion.notein.p607ui.noteeditor;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.drawerlayout.widget.DrawerLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/HandGestureDrawerLayout;", "Landroidx/drawerlayout/widget/DrawerLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class HandGestureDrawerLayout extends DrawerLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandGestureDrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OooOOO0.OooO0oO(context, "context");
        "samsung".equalsIgnoreCase(Build.MANUFACTURER);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        super.onDraw(canvas);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        OooOOO0.OooO0oO(ev, "ev");
        if (ev.getToolType(0) == 2) {
            return false;
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.View
    public final boolean onTouchEvent(MotionEvent ev) {
        OooOOO0.OooO0oO(ev, "ev");
        if (ev.getToolType(0) == 2) {
            return false;
        }
        super.onTouchEvent(ev);
        return true;
    }
}
