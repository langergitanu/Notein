package androidx.constraintlayout.helper.widget;

import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.VirtualLayout;
import o0000oo.C24352OooOO0O;
import o0000oo.C24353OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public class MotionPlaceholder extends VirtualLayout {
    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void OooO(AttributeSet attributeSet) {
        super.OooO(attributeSet);
        this.f63869OooOoO = new C24352OooOO0O();
        OooOOO0();
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public final void OooOOO(C24353OooOO0o c24353OooOO0o, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (c24353OooOO0o == null) {
            setMeasuredDimension(0, 0);
        } else {
            c24353OooOO0o.OoooO(mode, size, mode2, size2);
            setMeasuredDimension(c24353OooOO0o.f82126oo0o0Oo, c24353OooOO0o.f82119o0O0O00);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onMeasure(int i, int i2) {
        OooOOO(null, i, i2);
    }
}
