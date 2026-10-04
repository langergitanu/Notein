package androidx.appcompat.widget;

import OooO0oo.C20441OooO00o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ImageView f62923OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C21564OoooO0O f62924OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f62925OooO0OO = 0;

    public OooOO0O(ImageView imageView) {
        this.f62923OooO00o = imageView;
    }

    public final void OooO00o() {
        C21564OoooO0O c21564OoooO0O;
        ImageView imageView = this.f62923OooO00o;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            C21545OooOooO.OooO00o(drawable);
        }
        if (drawable == null || (c21564OoooO0O = this.f62924OooO0O0) == null) {
            return;
        }
        C21528OooO0oO.OooO0o0(drawable, c21564OoooO0O, imageView.getDrawableState());
    }

    public final void OooO0O0(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = this.f62923OooO00o;
        Context context = imageView.getContext();
        int[] iArr = C20441OooO00o.f58283OooO0o;
        C21565OoooOO0 c21565OoooOO0OooO0o = C21565OoooOO0.OooO0o(context, attributeSet, iArr, i, 0);
        ImageView imageView2 = this.f62923OooO00o;
        ViewCompat.saveAttributeDataForStyleable(imageView2, imageView2.getContext(), iArr, attributeSet, c21565OoooOO0OooO0o.f63093OooO0O0, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = c21565OoooOO0OooO0o.f63093OooO0O0;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = OooO.OooO00o.OooO0OO(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C21545OooOooO.OooO00o(drawable);
            }
            if (typedArray.hasValue(2)) {
                ImageViewCompat.setImageTintList(imageView, c21565OoooOO0OooO0o.OooO00o(2));
            }
            if (typedArray.hasValue(3)) {
                ImageViewCompat.setImageTintMode(imageView, C21545OooOooO.OooO0OO(typedArray.getInt(3, -1), null));
            }
            c21565OoooOO0OooO0o.OooO0oO();
        } catch (Throwable th) {
            c21565OoooOO0OooO0o.OooO0oO();
            throw th;
        }
    }

    public final void OooO0OO(int i) {
        ImageView imageView = this.f62923OooO00o;
        if (i != 0) {
            Drawable drawableOooO0OO = OooO.OooO00o.OooO0OO(imageView.getContext(), i);
            if (drawableOooO0OO != null) {
                C21545OooOooO.OooO00o(drawableOooO0OO);
            }
            imageView.setImageDrawable(drawableOooO0OO);
        } else {
            imageView.setImageDrawable(null);
        }
        OooO00o();
    }
}
