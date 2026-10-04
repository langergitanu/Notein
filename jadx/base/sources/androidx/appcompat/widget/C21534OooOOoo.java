package androidx.appcompat.widget;

import OooO0oo.C20441OooO00o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.TypedValueCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: androidx.appcompat.widget.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21534OooOOoo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C21536OooOo0 f62939OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TextView f62940OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C21564OoooO0O f62941OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C21564OoooO0O f62942OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C21564OoooO0O f62943OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C21564OoooO0O f62944OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public C21564OoooO0O f62945OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public C21564OoooO0O f62946OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public C21564OoooO0O f62947OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f62948OooOO0 = 0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f62949OooOO0O = -1;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Typeface f62950OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f62951OooOOO0;

    /* JADX INFO: renamed from: androidx.appcompat.widget.OooOOoo$OooO00o */
    public class OooO00o extends ResourcesCompat.FontCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ int f62952OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ int f62953OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ WeakReference f62954OooO0OO;

        public OooO00o(int i, int i2, WeakReference weakReference) {
            this.f62952OooO00o = i;
            this.f62953OooO0O0 = i2;
            this.f62954OooO0OO = weakReference;
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        /* JADX INFO: renamed from: onFontRetrievalFailed */
        public final void lambda$callbackFailAsync$1(int i) {
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        /* JADX INFO: renamed from: onFontRetrieved */
        public final void lambda$callbackSuccessAsync$0(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f62952OooO00o) != -1) {
                typeface = C21535OooO0Oo.OooO00o(typeface, i, (this.f62953OooO0O0 & 2) != 0);
            }
            C21534OooOOoo c21534OooOOoo = C21534OooOOoo.this;
            if (c21534OooOOoo.f62951OooOOO0) {
                c21534OooOOoo.f62950OooOO0o = typeface;
                TextView textView = (TextView) this.f62954OooO0OO.get();
                if (textView != null) {
                    if (textView.isAttachedToWindow()) {
                        textView.post(new OooOo00(textView, typeface, c21534OooOOoo.f62948OooOO0));
                    } else {
                        textView.setTypeface(typeface, c21534OooOOoo.f62948OooOO0);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.OooOOoo$OooO0O0 */
    public static class OooO0O0 {
        public static LocaleList OooO00o(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void OooO0O0(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.OooOOoo$OooO0OO */
    public static class OooO0OO {
        public static int OooO00o(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void OooO0O0(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        public static void OooO0OO(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        public static boolean OooO0Oo(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.OooOOoo$OooO0Oo, reason: case insensitive filesystem */
    public static class C21535OooO0Oo {
        public static Typeface OooO00o(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public C21534OooOOoo(TextView textView) {
        this.f62940OooO00o = textView;
        this.f62939OooO = new C21536OooOo0(textView);
    }

    public static C21564OoooO0O OooO0OO(Context context, C21528OooO0oO c21528OooO0oO, int i) {
        ColorStateList colorStateListOooO0o;
        synchronized (c21528OooO0oO) {
            colorStateListOooO0o = c21528OooO0oO.f62912OooO00o.OooO0o(context, i);
        }
        if (colorStateListOooO0o == null) {
            return null;
        }
        C21564OoooO0O c21564OoooO0O = new C21564OoooO0O();
        c21564OoooO0O.f63091OooO0Oo = true;
        c21564OoooO0O.f63088OooO00o = colorStateListOooO0o;
        return c21564OoooO0O;
    }

    public final void OooO(int[] iArr, int i) throws IllegalArgumentException {
        C21536OooOo0 c21536OooOo0 = this.f62939OooO;
        if (c21536OooOo0.OooOO0()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c21536OooOo0.f62967OooOO0.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                c21536OooOo0.f62963OooO0o = C21536OooOo0.OooO0O0(iArrCopyOf);
                if (!c21536OooOo0.OooO()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c21536OooOo0.f62965OooO0oO = false;
            }
            if (c21536OooOo0.OooO0oo()) {
                c21536OooOo0.OooO00o();
            }
        }
    }

    public final void OooO00o(Drawable drawable, C21564OoooO0O c21564OoooO0O) {
        if (drawable == null || c21564OoooO0O == null) {
            return;
        }
        C21528OooO0oO.OooO0o0(drawable, c21564OoooO0O, this.f62940OooO00o.getDrawableState());
    }

    public final void OooO0O0() {
        C21564OoooO0O c21564OoooO0O = this.f62941OooO0O0;
        TextView textView = this.f62940OooO00o;
        if (c21564OoooO0O != null || this.f62942OooO0OO != null || this.f62943OooO0Oo != null || this.f62945OooO0o0 != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            OooO00o(compoundDrawables[0], this.f62941OooO0O0);
            OooO00o(compoundDrawables[1], this.f62942OooO0OO);
            OooO00o(compoundDrawables[2], this.f62943OooO0Oo);
            OooO00o(compoundDrawables[3], this.f62945OooO0o0);
        }
        if (this.f62944OooO0o == null && this.f62946OooO0oO == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        OooO00o(compoundDrawablesRelative[0], this.f62944OooO0o);
        OooO00o(compoundDrawablesRelative[2], this.f62946OooO0oO);
    }

    public final ColorStateList OooO0Oo() {
        C21564OoooO0O c21564OoooO0O = this.f62947OooO0oo;
        if (c21564OoooO0O != null) {
            return c21564OoooO0O.f63088OooO00o;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:239:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0o(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        String string2;
        int i2;
        int i3;
        float dimensionPixelSize;
        int unitFromComplexDimension;
        ColorStateList colorStateList;
        int resourceId;
        int i4;
        int resourceId2;
        TextView textView = this.f62940OooO00o;
        Context context = textView.getContext();
        C21528OooO0oO c21528OooO0oOOooO00o = C21528OooO0oO.OooO00o();
        int[] iArr = C20441OooO00o.f58286OooO0oo;
        C21565OoooOO0 c21565OoooOO0OooO0o = C21565OoooOO0.OooO0o(context, attributeSet, iArr, i, 0);
        ViewCompat.saveAttributeDataForStyleable(textView, textView.getContext(), iArr, attributeSet, c21565OoooOO0OooO0o.f63093OooO0O0, i, 0);
        TypedArray typedArray = c21565OoooOO0OooO0o.f63093OooO0O0;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f62941OooO0O0 = OooO0OO(context, c21528OooO0oOOooO00o, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f62942OooO0OO = OooO0OO(context, c21528OooO0oOOooO00o, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f62943OooO0Oo = OooO0OO(context, c21528OooO0oOOooO00o, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f62945OooO0o0 = OooO0OO(context, c21528OooO0oOOooO00o, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f62944OooO0o = OooO0OO(context, c21528OooO0oOOooO00o, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f62946OooO0oO = OooO0OO(context, c21528OooO0oOOooO00o, typedArray.getResourceId(6, 0));
        }
        c21565OoooOO0OooO0o.OooO0oO();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = C20441OooO00o.f58303OooOoO0;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C21565OoooOO0 c21565OoooOO0 = new C21565OoooOO0(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            OooOOO0(context, c21565OoooOO0);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = typedArrayObtainStyledAttributes.hasValue(13) ? typedArrayObtainStyledAttributes.getString(13) : null;
            c21565OoooOO0.OooO0oO();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C21565OoooOO0 c21565OoooOO02 = new C21565OoooOO0(context, typedArrayObtainStyledAttributes2);
        if (!z3 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z2 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        int i5 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i5 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        OooOOO0(context, c21565OoooOO02);
        c21565OoooOO02.OooO0oO();
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.f62950OooOO0o;
        if (typeface != null) {
            if (this.f62949OooOO0O == -1) {
                textView.setTypeface(typeface, this.f62948OooOO0);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            OooO0OO.OooO0Oo(textView, string);
        }
        if (string2 != null) {
            OooO0O0.OooO0O0(textView, OooO0O0.OooO00o(string2));
        }
        int[] iArr3 = C20441OooO00o.f58278OooO;
        C21536OooOo0 c21536OooOo0 = this.f62939OooO;
        Context context2 = c21536OooOo0.f62967OooOO0;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c21536OooOo0.f62958OooO;
        ViewCompat.saveAttributeDataForStyleable(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i, 0);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c21536OooOo0.f62959OooO00o = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i6 = 0; i6 < length; i6++) {
                    iArr4[i6] = typedArrayObtainTypedArray.getDimensionPixelSize(i6, -1);
                }
                c21536OooOo0.f62963OooO0o = C21536OooOo0.OooO0O0(iArr4);
                c21536OooOo0.OooO();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c21536OooOo0.OooOO0()) {
            c21536OooOo0.f62959OooO00o = 0;
        } else if (c21536OooOo0.f62959OooO00o == 1) {
            if (!c21536OooOo0.f62965OooO0oO) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i4 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c21536OooOo0.OooOO0O(dimension2, dimension3, dimension);
            }
            c21536OooOo0.OooO0oo();
        }
        if (C21572Ooooo0o.f63120OooO0OO && c21536OooOo0.f62959OooO00o != 0) {
            int[] iArr5 = c21536OooOo0.f62963OooO0o;
            if (iArr5.length > 0) {
                if (OooO0OO.OooO00o(textView) != -1.0f) {
                    OooO0OO.OooO0O0(textView, Math.round(c21536OooOo0.f62962OooO0Oo), Math.round(c21536OooOo0.f62964OooO0o0), Math.round(c21536OooOo0.f62961OooO0OO), 0);
                } else {
                    OooO0OO.OooO0OO(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableOooO0O0 = resourceId4 != -1 ? c21528OooO0oOOooO00o.OooO0O0(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableOooO0O02 = resourceId5 != -1 ? c21528OooO0oOOooO00o.OooO0O0(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableOooO0O03 = resourceId6 != -1 ? c21528OooO0oOOooO00o.OooO0O0(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableOooO0O04 = resourceId7 != -1 ? c21528OooO0oOOooO00o.OooO0O0(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableOooO0O05 = resourceId8 != -1 ? c21528OooO0oOOooO00o.OooO0O0(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableOooO0O06 = resourceId9 != -1 ? c21528OooO0oOOooO00o.OooO0O0(context, resourceId9) : null;
        if (drawableOooO0O05 != null || drawableOooO0O06 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableOooO0O05 == null) {
                drawableOooO0O05 = compoundDrawablesRelative[0];
            }
            if (drawableOooO0O02 == null) {
                drawableOooO0O02 = compoundDrawablesRelative[1];
            }
            if (drawableOooO0O06 == null) {
                drawableOooO0O06 = compoundDrawablesRelative[2];
            }
            if (drawableOooO0O04 == null) {
                drawableOooO0O04 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableOooO0O05, drawableOooO0O02, drawableOooO0O06, drawableOooO0O04);
        } else if (drawableOooO0O0 != null || drawableOooO0O02 != null || drawableOooO0O03 != null || drawableOooO0O04 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableOooO0O0 == null) {
                    drawableOooO0O0 = compoundDrawables[0];
                }
                if (drawableOooO0O02 == null) {
                    drawableOooO0O02 = compoundDrawables[1];
                }
                if (drawableOooO0O03 == null) {
                    drawableOooO0O03 = compoundDrawables[2];
                }
                if (drawableOooO0O04 == null) {
                    drawableOooO0O04 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableOooO0O0, drawableOooO0O02, drawableOooO0O03, drawableOooO0O04);
            } else {
                if (drawableOooO0O02 == null) {
                    drawableOooO0O02 = compoundDrawablesRelative2[1];
                }
                if (drawableOooO0O04 == null) {
                    drawableOooO0O04 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableOooO0O02, compoundDrawablesRelative2[2], drawableOooO0O04);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = ContextCompat.getColorStateList(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            TextViewCompat.setCompoundDrawableTintList(textView, colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            i2 = -1;
            TextViewCompat.setCompoundDrawableTintMode(textView, C21545OooOooO.OooO0OO(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i2 = -1;
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, i2);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, i2);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue != null && typedValuePeekValue.type == 5) {
                unitFromComplexDimension = TypedValueCompat.getUnitFromComplexDimension(typedValuePeekValue.data);
                dimensionPixelSize = TypedValue.complexToFloat(typedValuePeekValue.data);
                i3 = -1;
                typedArrayObtainStyledAttributes4.recycle();
                if (dimensionPixelSize2 != i3) {
                    TextViewCompat.setFirstBaselineToTopHeight(textView, dimensionPixelSize2);
                }
                if (dimensionPixelSize3 != i3) {
                    TextViewCompat.setLastBaselineToBottomHeight(textView, dimensionPixelSize3);
                }
                if (dimensionPixelSize == -1.0f) {
                    if (unitFromComplexDimension == i3) {
                        TextViewCompat.setLineHeight(textView, (int) dimensionPixelSize);
                        return;
                    } else {
                        TextViewCompat.setLineHeight(textView, unitFromComplexDimension, dimensionPixelSize);
                        return;
                    }
                }
                return;
            }
            i3 = -1;
            dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            i3 = -1;
            dimensionPixelSize = -1.0f;
        }
        unitFromComplexDimension = i3;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i3) {
        }
        if (dimensionPixelSize3 != i3) {
        }
        if (dimensionPixelSize == -1.0f) {
        }
    }

    public final PorterDuff.Mode OooO0o0() {
        C21564OoooO0O c21564OoooO0O = this.f62947OooO0oo;
        if (c21564OoooO0O != null) {
            return c21564OoooO0O.f63089OooO0O0;
        }
        return null;
    }

    public final void OooO0oO(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C20441OooO00o.f58303OooOoO0);
        C21565OoooOO0 c21565OoooOO0 = new C21565OoooOO0(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f62940OooO00o;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        OooOOO0(context, c21565OoooOO0);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            OooO0OO.OooO0Oo(textView, string);
        }
        c21565OoooOO0.OooO0oO();
        Typeface typeface = this.f62950OooOO0o;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f62948OooOO0);
        }
    }

    public final void OooO0oo(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        C21536OooOo0 c21536OooOo0 = this.f62939OooO;
        if (c21536OooOo0.OooOO0()) {
            DisplayMetrics displayMetrics = c21536OooOo0.f62967OooOO0.getResources().getDisplayMetrics();
            c21536OooOo0.OooOO0O(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c21536OooOo0.OooO0oo()) {
                c21536OooOo0.OooO00o();
            }
        }
    }

    public final void OooOO0(int i) {
        C21536OooOo0 c21536OooOo0 = this.f62939OooO;
        if (c21536OooOo0.OooOO0()) {
            if (i == 0) {
                c21536OooOo0.f62959OooO00o = 0;
                c21536OooOo0.f62962OooO0Oo = -1.0f;
                c21536OooOo0.f62964OooO0o0 = -1.0f;
                c21536OooOo0.f62961OooO0OO = -1.0f;
                c21536OooOo0.f62963OooO0o = new int[0];
                c21536OooOo0.f62960OooO0O0 = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c21536OooOo0.f62967OooOO0.getResources().getDisplayMetrics();
            c21536OooOo0.OooOO0O(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c21536OooOo0.OooO0oo()) {
                c21536OooOo0.OooO00o();
            }
        }
    }

    public final void OooOO0O(ColorStateList colorStateList) {
        if (this.f62947OooO0oo == null) {
            this.f62947OooO0oo = new C21564OoooO0O();
        }
        C21564OoooO0O c21564OoooO0O = this.f62947OooO0oo;
        c21564OoooO0O.f63088OooO00o = colorStateList;
        c21564OoooO0O.f63091OooO0Oo = colorStateList != null;
        this.f62941OooO0O0 = c21564OoooO0O;
        this.f62942OooO0OO = c21564OoooO0O;
        this.f62943OooO0Oo = c21564OoooO0O;
        this.f62945OooO0o0 = c21564OoooO0O;
        this.f62944OooO0o = c21564OoooO0O;
        this.f62946OooO0oO = c21564OoooO0O;
    }

    public final void OooOO0o(PorterDuff.Mode mode) {
        if (this.f62947OooO0oo == null) {
            this.f62947OooO0oo = new C21564OoooO0O();
        }
        C21564OoooO0O c21564OoooO0O = this.f62947OooO0oo;
        c21564OoooO0O.f63089OooO0O0 = mode;
        c21564OoooO0O.f63090OooO0OO = mode != null;
        this.f62941OooO0O0 = c21564OoooO0O;
        this.f62942OooO0OO = c21564OoooO0O;
        this.f62943OooO0Oo = c21564OoooO0O;
        this.f62945OooO0o0 = c21564OoooO0O;
        this.f62944OooO0o = c21564OoooO0O;
        this.f62946OooO0oO = c21564OoooO0O;
    }

    public final void OooOOO0(Context context, C21565OoooOO0 c21565OoooOO0) {
        String string;
        int i = this.f62948OooOO0;
        TypedArray typedArray = c21565OoooOO0.f63093OooO0O0;
        this.f62948OooOO0 = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.f62949OooOO0O = i3;
            if (i3 != -1) {
                this.f62948OooOO0 &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f62951OooOOO0 = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.f62950OooOO0o = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.f62950OooOO0o = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.f62950OooOO0o = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f62950OooOO0o = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.f62949OooOO0O;
        int i7 = this.f62948OooOO0;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceOooO0Oo = c21565OoooOO0.OooO0Oo(i5, this.f62948OooOO0, new OooO00o(i6, i7, new WeakReference(this.f62940OooO00o)));
                if (typefaceOooO0Oo != null) {
                    if (i2 < 28 || this.f62949OooOO0O == -1) {
                        this.f62950OooOO0o = typefaceOooO0Oo;
                    } else {
                        this.f62950OooOO0o = C21535OooO0Oo.OooO00o(Typeface.create(typefaceOooO0Oo, 0), this.f62949OooOO0O, (this.f62948OooOO0 & 2) != 0);
                    }
                }
                this.f62951OooOOO0 = this.f62950OooOO0o == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f62950OooOO0o != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f62949OooOO0O == -1) {
            this.f62950OooOO0o = Typeface.create(string, this.f62948OooOO0);
        } else {
            this.f62950OooOO0o = C21535OooO0Oo.OooO00o(Typeface.create(string, 0), this.f62949OooOO0O, (this.f62948OooOO0 & 2) != 0);
        }
    }
}
