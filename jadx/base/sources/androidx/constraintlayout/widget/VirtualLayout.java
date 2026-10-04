package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import o0000oo.C24353OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public abstract class VirtualLayout extends ConstraintHelper {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f64170Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f64171Oooo00O;

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void OooO(AttributeSet attributeSet) {
        super.OooO(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, OooO0o.f64131OooO0O0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f64170Oooo000 = true;
                } else if (index == 22) {
                    this.f64171Oooo00O = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooO0o(ConstraintLayout constraintLayout) {
        OooO0o0(constraintLayout);
    }

    public void OooOOO(C24353OooOO0o c24353OooOO0o, int i, int i2) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f64170Oooo000 || this.f64171Oooo00O) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f63867OooOo; i++) {
                    View viewById = constraintLayout.getViewById(this.f63868OooOo0o[i]);
                    if (viewById != null) {
                        if (this.f64170Oooo000) {
                            viewById.setVisibility(visibility);
                        }
                        if (this.f64171Oooo00O && elevation > 0.0f) {
                            viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                        }
                    }
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
    public void setVisibility(int i) {
        super.setVisibility(i);
        OooO0Oo();
    }
}
