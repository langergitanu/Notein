package androidx.appcompat.widget;

import OooO0oo.C20441OooO00o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: androidx.appcompat.widget.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21526OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f62892OooO00o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C21564OoooO0O f62895OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C21564OoooO0O f62896OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public C21564OoooO0O f62897OooO0o0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f62894OooO0OO = -1;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C21528OooO0oO f62893OooO0O0 = C21528OooO0oO.OooO00o();

    public C21526OooO0Oo(View view) {
        this.f62892OooO00o = view;
    }

    public final void OooO(PorterDuff.Mode mode) {
        if (this.f62897OooO0o0 == null) {
            this.f62897OooO0o0 = new C21564OoooO0O();
        }
        C21564OoooO0O c21564OoooO0O = this.f62897OooO0o0;
        c21564OoooO0O.f63089OooO0O0 = mode;
        c21564OoooO0O.f63090OooO0OO = true;
        OooO00o();
    }

    public final void OooO00o() {
        View view = this.f62892OooO00o;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f62895OooO0Oo != null) {
                if (this.f62896OooO0o == null) {
                    this.f62896OooO0o = new C21564OoooO0O();
                }
                C21564OoooO0O c21564OoooO0O = this.f62896OooO0o;
                c21564OoooO0O.f63088OooO00o = null;
                c21564OoooO0O.f63091OooO0Oo = false;
                c21564OoooO0O.f63089OooO0O0 = null;
                c21564OoooO0O.f63090OooO0OO = false;
                ColorStateList backgroundTintList = ViewCompat.getBackgroundTintList(view);
                if (backgroundTintList != null) {
                    c21564OoooO0O.f63091OooO0Oo = true;
                    c21564OoooO0O.f63088OooO00o = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = ViewCompat.getBackgroundTintMode(view);
                if (backgroundTintMode != null) {
                    c21564OoooO0O.f63090OooO0OO = true;
                    c21564OoooO0O.f63089OooO0O0 = backgroundTintMode;
                }
                if (c21564OoooO0O.f63091OooO0Oo || c21564OoooO0O.f63090OooO0OO) {
                    C21528OooO0oO.OooO0o0(background, c21564OoooO0O, view.getDrawableState());
                    return;
                }
            }
            C21564OoooO0O c21564OoooO0O2 = this.f62897OooO0o0;
            if (c21564OoooO0O2 != null) {
                C21528OooO0oO.OooO0o0(background, c21564OoooO0O2, view.getDrawableState());
                return;
            }
            C21564OoooO0O c21564OoooO0O3 = this.f62895OooO0Oo;
            if (c21564OoooO0O3 != null) {
                C21528OooO0oO.OooO0o0(background, c21564OoooO0O3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList OooO0O0() {
        C21564OoooO0O c21564OoooO0O = this.f62897OooO0o0;
        if (c21564OoooO0O != null) {
            return c21564OoooO0O.f63088OooO00o;
        }
        return null;
    }

    public final PorterDuff.Mode OooO0OO() {
        C21564OoooO0O c21564OoooO0O = this.f62897OooO0o0;
        if (c21564OoooO0O != null) {
            return c21564OoooO0O.f63089OooO0O0;
        }
        return null;
    }

    public final void OooO0Oo(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListOooO0o;
        View view = this.f62892OooO00o;
        Context context = view.getContext();
        int[] iArr = C20441OooO00o.f58306OooOoo0;
        C21565OoooOO0 c21565OoooOO0OooO0o = C21565OoooOO0.OooO0o(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = c21565OoooOO0OooO0o.f63093OooO0O0;
        View view2 = this.f62892OooO00o;
        ViewCompat.saveAttributeDataForStyleable(view2, view2.getContext(), iArr, attributeSet, c21565OoooOO0OooO0o.f63093OooO0O0, i, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.f62894OooO0OO = typedArray.getResourceId(0, -1);
                C21528OooO0oO c21528OooO0oO = this.f62893OooO0O0;
                Context context2 = view.getContext();
                int i2 = this.f62894OooO0OO;
                synchronized (c21528OooO0oO) {
                    colorStateListOooO0o = c21528OooO0oO.f62912OooO00o.OooO0o(context2, i2);
                }
                if (colorStateListOooO0o != null) {
                    OooO0oO(colorStateListOooO0o);
                }
            }
            if (typedArray.hasValue(1)) {
                ViewCompat.setBackgroundTintList(view, c21565OoooOO0OooO0o.OooO00o(1));
            }
            if (typedArray.hasValue(2)) {
                ViewCompat.setBackgroundTintMode(view, C21545OooOooO.OooO0OO(typedArray.getInt(2, -1), null));
            }
            c21565OoooOO0OooO0o.OooO0oO();
        } catch (Throwable th) {
            c21565OoooOO0OooO0o.OooO0oO();
            throw th;
        }
    }

    public final void OooO0o(int i) {
        ColorStateList colorStateListOooO0o;
        this.f62894OooO0OO = i;
        C21528OooO0oO c21528OooO0oO = this.f62893OooO0O0;
        if (c21528OooO0oO != null) {
            Context context = this.f62892OooO00o.getContext();
            synchronized (c21528OooO0oO) {
                colorStateListOooO0o = c21528OooO0oO.f62912OooO00o.OooO0o(context, i);
            }
        } else {
            colorStateListOooO0o = null;
        }
        OooO0oO(colorStateListOooO0o);
        OooO00o();
    }

    public final void OooO0o0() {
        this.f62894OooO0OO = -1;
        OooO0oO(null);
        OooO00o();
    }

    public final void OooO0oO(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f62895OooO0Oo == null) {
                this.f62895OooO0Oo = new C21564OoooO0O();
            }
            C21564OoooO0O c21564OoooO0O = this.f62895OooO0Oo;
            c21564OoooO0O.f63088OooO00o = colorStateList;
            c21564OoooO0O.f63091OooO0Oo = true;
        } else {
            this.f62895OooO0Oo = null;
        }
        OooO00o();
    }

    public final void OooO0oo(ColorStateList colorStateList) {
        if (this.f62897OooO0o0 == null) {
            this.f62897OooO0o0 = new C21564OoooO0O();
        }
        C21564OoooO0O c21564OoooO0O = this.f62897OooO0o0;
        c21564OoooO0O.f63088OooO00o = colorStateList;
        c21564OoooO0O.f63091OooO0Oo = true;
        OooO00o();
    }
}
