package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.core.view.ActionProvider;

/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup {

    public static class InnerLayout extends LinearLayout {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final int[] f62817OooOo0o = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C21565OoooOO0 c21565OoooOO0OooO0o0 = C21565OoooOO0.OooO0o0(context, attributeSet, f62817OooOo0o);
            setBackgroundDrawable(c21565OoooOO0OooO0o0.OooO0O0(0));
            c21565OoooOO0OooO0o0.OooO0oO();
        }
    }

    public OooO0OO getDataModel() {
        throw null;
    }

    public Oooo0 getListPopupWindow() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        throw null;
    }

    public void setActivityChooserModel(OooO0OO oooO0OO) {
        throw null;
    }

    public void setDefaultActionButtonContentDescription(int i) {
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        getContext().getString(i);
        throw null;
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        throw null;
    }

    public void setInitialActivityCount(int i) {
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
    }

    public void setProvider(ActionProvider actionProvider) {
    }
}
