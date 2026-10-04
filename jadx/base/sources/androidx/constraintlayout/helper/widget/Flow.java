package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.OooO0o;
import androidx.constraintlayout.widget.VirtualLayout;
import o0000oo.C24348OooO0o0;
import o0000oo.C24349OooO0oO;
import o0000oo.C24353OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends VirtualLayout {

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public C24349OooO0oO f63625Oooo00o;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void OooO(AttributeSet attributeSet) {
        super.OooO(attributeSet);
        this.f63625Oooo00o = new C24349OooO0oO();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, OooO0o.f64131OooO0O0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f63625Oooo00o.f82078o0000O = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C24349OooO0oO c24349OooO0oO = this.f63625Oooo00o;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c24349OooO0oO.f82118o00oO0O = dimensionPixelSize;
                    c24349OooO0oO.f82123o0ooOO0 = dimensionPixelSize;
                    c24349OooO0oO.f82124o0ooOOo = dimensionPixelSize;
                    c24349OooO0oO.f82125o0ooOoO = dimensionPixelSize;
                } else if (index == 18) {
                    C24349OooO0oO c24349OooO0oO2 = this.f63625Oooo00o;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c24349OooO0oO2.f82124o0ooOOo = dimensionPixelSize2;
                    c24349OooO0oO2.f82121o0OOO0o = dimensionPixelSize2;
                    c24349OooO0oO2.f82122o0Oo0oo = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f63625Oooo00o.f82125o0ooOoO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f63625Oooo00o.f82121o0OOO0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f63625Oooo00o.f82118o00oO0O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f63625Oooo00o.f82122o0Oo0oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f63625Oooo00o.f82123o0ooOO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f63625Oooo00o.f82080o0000O0O = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f63625Oooo00o.f82069o000000O = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f63625Oooo00o.f82070o000000o = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f63625Oooo00o.f82068o00000 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f63625Oooo00o.f82071o00000O = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f63625Oooo00o.f82072o00000O0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f63625Oooo00o.f82073o00000OO = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f63625Oooo00o.f82074o00000Oo = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f63625Oooo00o.f82087o0000Ooo = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f63625Oooo00o.f82077o00000oo = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f63625Oooo00o.f82076o00000oO = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f63625Oooo00o.f82067o0000 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f63625Oooo00o.f82075o00000o0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f63625Oooo00o.f82088o0000oO = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f63625Oooo00o.o0000O0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f63625Oooo00o.f82079o0000O00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f63625Oooo00o.f82089o0000oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f63625Oooo00o.f82090o000OO = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f63869OooOoO = this.f63625Oooo00o;
        OooOOO0();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOO0(C24348OooO0o0 c24348OooO0o0, boolean z) {
        C24349OooO0oO c24349OooO0oO = this.f63625Oooo00o;
        int i = c24349OooO0oO.f82124o0ooOOo;
        if (i > 0 || c24349OooO0oO.f82125o0ooOoO > 0) {
            if (z) {
                c24349OooO0oO.f82121o0OOO0o = c24349OooO0oO.f82125o0ooOoO;
                c24349OooO0oO.f82122o0Oo0oo = i;
            } else {
                c24349OooO0oO.f82121o0OOO0o = i;
                c24349OooO0oO.f82122o0Oo0oo = c24349OooO0oO.f82125o0ooOoO;
            }
        }
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
        OooOOO(this.f63625Oooo00o, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f63625Oooo00o.f82087o0000Ooo = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f63625Oooo00o.f82068o00000 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f63625Oooo00o.f82076o00000oO = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f63625Oooo00o.f82072o00000O0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f63625Oooo00o.f82088o0000oO = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f63625Oooo00o.f82074o00000Oo = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f63625Oooo00o.f82079o0000O00 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f63625Oooo00o.f82069o000000O = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.f63625Oooo00o.f82077o00000oo = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f63625Oooo00o.f82071o00000O = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.f63625Oooo00o.f82067o0000 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f63625Oooo00o.f82073o00000OO = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f63625Oooo00o.f82090o000OO = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f63625Oooo00o.f82078o0000O = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C24349OooO0oO c24349OooO0oO = this.f63625Oooo00o;
        c24349OooO0oO.f82118o00oO0O = i;
        c24349OooO0oO.f82123o0ooOO0 = i;
        c24349OooO0oO.f82124o0ooOOo = i;
        c24349OooO0oO.f82125o0ooOoO = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f63625Oooo00o.f82123o0ooOO0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f63625Oooo00o.f82121o0OOO0o = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f63625Oooo00o.f82122o0Oo0oo = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f63625Oooo00o.f82118o00oO0O = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f63625Oooo00o.o0000O0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f63625Oooo00o.f82075o00000o0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f63625Oooo00o.f82089o0000oo = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f63625Oooo00o.f82070o000000o = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f63625Oooo00o.f82080o0000O0O = i;
        requestLayout();
    }
}
