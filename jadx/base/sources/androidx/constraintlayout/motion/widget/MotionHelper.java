package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.OooO0o;

/* JADX INFO: loaded from: classes.dex */
public class MotionHelper extends ConstraintHelper implements MotionLayout.InterfaceC21622OooO0o0 {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View[] f63657Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f63658Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f63659Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public float f63660Oooo00o;

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooO(AttributeSet attributeSet) {
        super.OooO(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, OooO0o.f64141OooOOO);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f63658Oooo000 = typedArrayObtainStyledAttributes.getBoolean(index, this.f63658Oooo000);
                } else if (index == 0) {
                    this.f63659Oooo00O = typedArrayObtainStyledAttributes.getBoolean(index, this.f63659Oooo00O);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public float getProgress() {
        return this.f63660Oooo00o;
    }

    public void setProgress(float f) {
        this.f63660Oooo00o = f;
        int i = 0;
        if (this.f63867OooOo > 0) {
            this.f63657Oooo0 = OooO0oo((ConstraintLayout) getParent());
            while (i < this.f63867OooOo) {
                View view = this.f63657Oooo0[i];
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            boolean z = viewGroup.getChildAt(i) instanceof MotionHelper;
            i++;
        }
    }
}
