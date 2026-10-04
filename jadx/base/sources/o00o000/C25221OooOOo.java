package o00o000;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import o00Ooo0o.InterfaceC25116OooO0o;
import o00OooOO.InterfaceC25155OooO0O0;

/* JADX INFO: renamed from: o00o000.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25221OooOOo extends OooO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f85903OooO0O0 = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC25116OooO0o.f85383OooO00o);

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final void OooO00o(MessageDigest messageDigest) {
        messageDigest.update(f85903OooO0O0);
    }

    @Override // o00o000.OooO0o
    public final Bitmap OooO0OO(InterfaceC25155OooO0O0 interfaceC25155OooO0O0, Bitmap bitmap, int i, int i2) {
        return C25231OooOoo0.OooO0O0(interfaceC25155OooO0O0, bitmap, i, i2);
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final boolean equals(Object obj) {
        return obj instanceof C25221OooOOo;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final int hashCode() {
        return 1572326941;
    }
}
