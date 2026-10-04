package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.C21488OooOOOo;
import androidx.core.view.ViewPropertyAnimatorCompat;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public TypedValue f62864OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public TypedValue f62865OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public TypedValue f62866OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public TypedValue f62867OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public TypedValue f62868OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final Rect f62869OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public TypedValue f62870OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public OooO00o f62871OooOooO;

    public interface OooO00o {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f62869OooOoo = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f62868OooOoOO == null) {
            this.f62868OooOoOO = new TypedValue();
        }
        return this.f62868OooOoOO;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f62870OooOoo0 == null) {
            this.f62870OooOoo0 = new TypedValue();
        }
        return this.f62870OooOoo0;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f62867OooOoO0 == null) {
            this.f62867OooOoO0 = new TypedValue();
        }
        return this.f62867OooOoO0;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f62866OooOoO == null) {
            this.f62866OooOoO = new TypedValue();
        }
        return this.f62866OooOoO;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f62865OooOo0o == null) {
            this.f62865OooOo0o = new TypedValue();
        }
        return this.f62865OooOo0o;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f62864OooOo == null) {
            this.f62864OooOo = new TypedValue();
        }
        return this.f62864OooOo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooO00o oooO00o = this.f62871OooOooO;
        if (oooO00o != null) {
            oooO00o.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooO00o oooO00o = this.f62871OooOooO;
        if (oooO00o != null) {
            AppCompatDelegateImpl appCompatDelegateImpl = ((C21488OooOOOo) oooO00o).f62460OooO00o;
            OooOo oooOo = appCompatDelegateImpl.f62343Oooo0oO;
            if (oooOo != null) {
                oooOo.OooO();
            }
            if (appCompatDelegateImpl.f62348OoooO0O != null) {
                appCompatDelegateImpl.f62338Oooo00o.getDecorView().removeCallbacks(appCompatDelegateImpl.f62345OoooO);
                if (appCompatDelegateImpl.f62348OoooO0O.isShowing()) {
                    try {
                        appCompatDelegateImpl.f62348OoooO0O.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                appCompatDelegateImpl.f62348OoooO0O = null;
            }
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = appCompatDelegateImpl.f62349OoooOO0;
            if (viewPropertyAnimatorCompat != null) {
                viewPropertyAnimatorCompat.cancel();
            }
            androidx.appcompat.view.menu.OooO oooO = appCompatDelegateImpl.OoooO(0).f62412OooO0oo;
            if (oooO != null) {
                oooO.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int iMakeMeasureSpec2;
        int i3;
        int i4;
        float fraction;
        int i5;
        int i6;
        float fraction2;
        int i7;
        int i8;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z2 = true;
        boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Rect rect = this.f62869OooOoo;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            TypedValue typedValue = z3 ? this.f62866OooOoO : this.f62867OooOoO0;
            if (typedValue != null && (i7 = typedValue.type) != 0) {
                if (i7 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else if (i7 == 6) {
                    int i9 = displayMetrics.widthPixels;
                    fraction3 = typedValue.getFraction(i9, i9);
                } else {
                    i8 = 0;
                    if (i8 <= 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z = true;
                    }
                }
                i8 = (int) fraction3;
                if (i8 <= 0) {
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i2;
        } else {
            TypedValue typedValue2 = z3 ? this.f62868OooOoOO : this.f62870OooOoo0;
            if (typedValue2 != null && (i5 = typedValue2.type) != 0) {
                if (i5 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else if (i5 == 6) {
                    int i10 = displayMetrics.heightPixels;
                    fraction2 = typedValue2.getFraction(i10, i10);
                } else {
                    i6 = 0;
                    if (i6 <= 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                    }
                }
                i6 = (int) fraction2;
                if (i6 <= 0) {
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z || mode != Integer.MIN_VALUE) {
            z2 = false;
        } else {
            TypedValue typedValue3 = z3 ? this.f62864OooOo : this.f62865OooOo0o;
            if (typedValue3 != null && (i3 = typedValue3.type) != 0) {
                if (i3 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else if (i3 == 6) {
                    int i11 = displayMetrics.widthPixels;
                    fraction = typedValue3.getFraction(i11, i11);
                } else {
                    i4 = 0;
                    if (i4 > 0) {
                        i4 -= rect.left + rect.right;
                    }
                    if (measuredWidth >= i4) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    }
                }
                i4 = (int) fraction;
                if (i4 > 0) {
                }
                if (measuredWidth >= i4) {
                }
            }
        }
        if (z2) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(OooO00o oooO00o) {
        this.f62871OooOooO = oooO00o;
    }
}
