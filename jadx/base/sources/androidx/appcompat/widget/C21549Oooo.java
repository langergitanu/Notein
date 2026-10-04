package androidx.appcompat.widget;

import OooO0oo.C20441OooO00o;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.ColorUtils;

/* JADX INFO: renamed from: androidx.appcompat.widget.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21549Oooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f63000OooO00o = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f63001OooO0O0 = {-16842910};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f63002OooO0OO = {R.attr.state_focused};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int[] f63003OooO0Oo = {R.attr.state_pressed};

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int[] f63005OooO0o0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final int[] f63004OooO0o = new int[0];

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final int[] f63006OooO0oO = new int[1];

    public static void OooO00o(Context context, View view) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C20441OooO00o.f58287OooOO0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int OooO0O0(Context context, int i) {
        ColorStateList colorStateListOooO0Oo = OooO0Oo(context, i);
        if (colorStateListOooO0Oo != null && colorStateListOooO0Oo.isStateful()) {
            return colorStateListOooO0Oo.getColorForState(f63001OooO0O0, colorStateListOooO0Oo.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f63000OooO00o;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return ColorUtils.setAlphaComponent(OooO0OO(context, i), Math.round(Color.alpha(r4) * f));
    }

    public static int OooO0OO(Context context, int i) {
        int[] iArr = f63006OooO0oO;
        iArr[0] = i;
        C21565OoooOO0 c21565OoooOO0OooO0o0 = C21565OoooOO0.OooO0o0(context, null, iArr);
        try {
            return c21565OoooOO0OooO0o0.f63093OooO0O0.getColor(0, 0);
        } finally {
            c21565OoooOO0OooO0o0.OooO0oO();
        }
    }

    public static ColorStateList OooO0Oo(Context context, int i) {
        int[] iArr = f63006OooO0oO;
        iArr[0] = i;
        C21565OoooOO0 c21565OoooOO0OooO0o0 = C21565OoooOO0.OooO0o0(context, null, iArr);
        try {
            return c21565OoooOO0OooO0o0.OooO00o(0);
        } finally {
            c21565OoooOO0OooO0o0.OooO0oO();
        }
    }
}
