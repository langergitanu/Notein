package o00oO0O0;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: o00oO0O0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25554OooO0o0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f87153OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public ColorFilter f87154OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f87152OooO00o = -1;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f87155OooO0Oo = -1;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f87156OooO0o0 = -1;

    public final void OooO00o(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i = this.f87152OooO00o;
        if (i != -1) {
            drawable.setAlpha(i);
        }
        if (this.f87153OooO0O0) {
            drawable.setColorFilter(this.f87154OooO0OO);
        }
        int i2 = this.f87155OooO0Oo;
        if (i2 != -1) {
            drawable.setDither(i2 != 0);
        }
        int i3 = this.f87156OooO0o0;
        if (i3 != -1) {
            drawable.setFilterBitmap(i3 != 0);
        }
    }
}
