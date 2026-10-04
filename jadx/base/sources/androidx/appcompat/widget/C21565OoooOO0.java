package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C21534OooOOoo;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* JADX INFO: renamed from: androidx.appcompat.widget.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21565OoooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f63092OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TypedArray f63093OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public TypedValue f63094OooO0OO;

    public C21565OoooOO0(Context context, TypedArray typedArray) {
        this.f63092OooO00o = context;
        this.f63093OooO0O0 = typedArray;
    }

    public static C21565OoooOO0 OooO0o(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C21565OoooOO0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static C21565OoooOO0 OooO0o0(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C21565OoooOO0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public final ColorStateList OooO00o(int i) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = this.f63093OooO0O0;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = ContextCompat.getColorStateList(this.f63092OooO00o, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
    }

    public final Drawable OooO0O0(int i) {
        int resourceId;
        TypedArray typedArray = this.f63093OooO0O0;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : OooO.OooO00o.OooO0OO(this.f63092OooO00o, resourceId);
    }

    public final Drawable OooO0OO(int i) {
        int resourceId;
        Drawable drawableOooO0Oo;
        if (!this.f63093OooO0O0.hasValue(i) || (resourceId = this.f63093OooO0O0.getResourceId(i, 0)) == 0) {
            return null;
        }
        C21528OooO0oO c21528OooO0oOOooO00o = C21528OooO0oO.OooO00o();
        Context context = this.f63092OooO00o;
        synchronized (c21528OooO0oOOooO00o) {
            drawableOooO0Oo = c21528OooO0oOOooO00o.f62912OooO00o.OooO0Oo(context, resourceId, true);
        }
        return drawableOooO0Oo;
    }

    public final Typeface OooO0Oo(int i, int i2, C21534OooOOoo.OooO00o oooO00o) {
        int resourceId = this.f63093OooO0O0.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f63094OooO0OO == null) {
            this.f63094OooO0OO = new TypedValue();
        }
        return ResourcesCompat.getFont(this.f63092OooO00o, resourceId, this.f63094OooO0OO, i2, oooO00o);
    }

    public final void OooO0oO() {
        this.f63093OooO0O0.recycle();
    }
}
