package androidx.constraintlayout.helper.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.OooO0o;
import o0000oo.C24348OooO0o0;

/* JADX INFO: loaded from: classes.dex */
public class Layer extends ConstraintHelper {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public float f63642Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public ConstraintLayout f63643Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public float f63644Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public float f63645Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public float f63646Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public float f63647Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public float f63648Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public float f63649Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public float f63650Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public float f63651Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public float f63652Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public float f63653OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public View[] f63654OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f63655OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public float f63656OoooO0O;

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooO(AttributeSet attributeSet) {
        super.OooO(attributeSet);
        this.f63871OooOoOO = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, OooO0o.f64131OooO0O0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                typedArrayObtainStyledAttributes.getIndex(i);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooO0o(ConstraintLayout constraintLayout) {
        OooO0o0(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOO0O() {
        OooOOOO();
        this.f63650Oooo0o0 = Float.NaN;
        this.f63649Oooo0o = Float.NaN;
        C24348OooO0o0 c24348OooO0o0 = ((ConstraintLayout.OooO00o) getLayoutParams()).f63942o00ooo;
        c24348OooO0o0.Oooo0oo(0);
        c24348OooO0o0.Oooo0o0(0);
        OooOOO();
        layout(((int) this.f63642Oooo) - getPaddingLeft(), ((int) this.f63655OoooO00) - getPaddingTop(), getPaddingRight() + ((int) this.f63651Oooo0oO), getPaddingBottom() + ((int) this.f63652Oooo0oo));
        OooOOOo();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOO0o(ConstraintLayout constraintLayout) {
        this.f63643Oooo0 = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f63646Oooo00o = rotation;
        } else {
            if (Float.isNaN(this.f63646Oooo00o)) {
                return;
            }
            this.f63646Oooo00o = rotation;
        }
    }

    public final void OooOOO() {
        if (this.f63643Oooo0 == null) {
            return;
        }
        if (Float.isNaN(this.f63650Oooo0o0) || Float.isNaN(this.f63649Oooo0o)) {
            if (!Float.isNaN(this.f63644Oooo000) && !Float.isNaN(this.f63645Oooo00O)) {
                this.f63649Oooo0o = this.f63645Oooo00O;
                this.f63650Oooo0o0 = this.f63644Oooo000;
                return;
            }
            View[] viewArrOooO0oo = OooO0oo(this.f63643Oooo0);
            int left = viewArrOooO0oo[0].getLeft();
            int top = viewArrOooO0oo[0].getTop();
            int right = viewArrOooO0oo[0].getRight();
            int bottom = viewArrOooO0oo[0].getBottom();
            for (int i = 0; i < this.f63867OooOo; i++) {
                View view = viewArrOooO0oo[i];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.f63651Oooo0oO = right;
            this.f63652Oooo0oo = bottom;
            this.f63642Oooo = left;
            this.f63655OoooO00 = top;
            if (Float.isNaN(this.f63644Oooo000)) {
                this.f63650Oooo0o0 = (left + right) / 2;
            } else {
                this.f63650Oooo0o0 = this.f63644Oooo000;
            }
            if (Float.isNaN(this.f63645Oooo00O)) {
                this.f63649Oooo0o = (top + bottom) / 2;
            } else {
                this.f63649Oooo0o = this.f63645Oooo00O;
            }
        }
    }

    public final void OooOOOO() {
        int i;
        if (this.f63643Oooo0 == null || (i = this.f63867OooOo) == 0) {
            return;
        }
        View[] viewArr = this.f63654OoooO0;
        if (viewArr == null || viewArr.length != i) {
            this.f63654OoooO0 = new View[i];
        }
        for (int i2 = 0; i2 < this.f63867OooOo; i2++) {
            this.f63654OoooO0[i2] = this.f63643Oooo0.getViewById(this.f63868OooOo0o[i2]);
        }
    }

    public final void OooOOOo() {
        if (this.f63643Oooo0 == null) {
            return;
        }
        if (this.f63654OoooO0 == null) {
            OooOOOO();
        }
        OooOOO();
        double radians = Float.isNaN(this.f63646Oooo00o) ? 0.0d : Math.toRadians(this.f63646Oooo00o);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f = this.f63647Oooo0O0;
        float f2 = f * fCos;
        float f3 = this.f63648Oooo0OO;
        float f4 = (-f3) * fSin;
        float f5 = f * fSin;
        float f6 = f3 * fCos;
        for (int i = 0; i < this.f63867OooOo; i++) {
            View view = this.f63654OoooO0[i];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f7 = right - this.f63650Oooo0o0;
            float f8 = bottom - this.f63649Oooo0o;
            float f9 = (((f4 * f8) + (f2 * f7)) - f7) + this.f63656OoooO0O;
            float f10 = (((f6 * f8) + (f7 * f5)) - f8) + this.f63653OoooO;
            view.setTranslationX(f9);
            view.setTranslationY(f10);
            view.setScaleY(this.f63648Oooo0OO);
            view.setScaleX(this.f63647Oooo0O0);
            if (!Float.isNaN(this.f63646Oooo00o)) {
                view.setRotation(this.f63646Oooo00o);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f63643Oooo0 = (ConstraintLayout) getParent();
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f63867OooOo; i++) {
            View viewById = this.f63643Oooo0.getViewById(this.f63868OooOo0o[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        OooO0Oo();
    }

    @Override // android.view.View
    public void setPivotX(float f) {
        this.f63644Oooo000 = f;
        OooOOOo();
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        this.f63645Oooo00O = f;
        OooOOOo();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.f63646Oooo00o = f;
        OooOOOo();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.f63647Oooo0O0 = f;
        OooOOOo();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.f63648Oooo0OO = f;
        OooOOOo();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        this.f63656OoooO0O = f;
        OooOOOo();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        this.f63653OoooO = f;
        OooOOOo();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        OooO0Oo();
    }
}
