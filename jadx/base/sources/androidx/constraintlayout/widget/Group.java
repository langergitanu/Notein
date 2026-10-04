package androidx.constraintlayout.widget;

import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public class Group extends ConstraintHelper {
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooO(AttributeSet attributeSet) {
        super.OooO(attributeSet);
        this.f63871OooOoOO = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooO0o(ConstraintLayout constraintLayout) {
        OooO0o0(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOO0O() {
        ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) getLayoutParams();
        oooO00o.f63942o00ooo.Oooo0oo(0);
        oooO00o.f63942o00ooo.Oooo0o0(0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooO0Oo();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        OooO0Oo();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        OooO0Oo();
    }
}
