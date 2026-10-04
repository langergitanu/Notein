package o00o000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;
import o00Ooo0o.InterfaceC25123OooOOO0;
import o00OooO.InterfaceC25145OooOo0o;
import o00OooOO.InterfaceC25155OooO0O0;

/* JADX INFO: renamed from: o00o000.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25220OooOOOo implements InterfaceC25123OooOOO0<Drawable> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC25123OooOOO0<Bitmap> f85901OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f85902OooO0OO;

    public C25220OooOOOo(InterfaceC25123OooOOO0<Bitmap> interfaceC25123OooOOO0, boolean z) {
        this.f85901OooO0O0 = interfaceC25123OooOOO0;
        this.f85902OooO0OO = z;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final void OooO00o(MessageDigest messageDigest) {
        this.f85901OooO0O0.OooO00o(messageDigest);
    }

    @Override // o00Ooo0o.InterfaceC25123OooOOO0
    public final InterfaceC25145OooOo0o<Drawable> OooO0O0(Context context, InterfaceC25145OooOo0o<Drawable> interfaceC25145OooOo0o, int i, int i2) {
        InterfaceC25155OooO0O0 interfaceC25155OooO0O0 = com.bumptech.glide.OooO0OO.OooO00o(context).f67114OooOo0o;
        Drawable drawable = interfaceC25145OooOo0o.get();
        C25213OooO0o0 c25213OooO0o0OooO00o = OooOOOO.OooO00o(interfaceC25155OooO0O0, drawable, i, i2);
        if (c25213OooO0o0OooO00o != null) {
            InterfaceC25145OooOo0o<Bitmap> interfaceC25145OooOo0oOooO0O0 = this.f85901OooO0O0.OooO0O0(context, c25213OooO0o0OooO00o, i, i2);
            if (!interfaceC25145OooOo0oOooO0O0.equals(c25213OooO0o0OooO00o)) {
                return new C25225OooOo0O(context.getResources(), interfaceC25145OooOo0oOooO0O0);
            }
            interfaceC25145OooOo0oOooO0O0.recycle();
            return interfaceC25145OooOo0o;
        }
        if (!this.f85902OooO0OO) {
            return interfaceC25145OooOo0o;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final boolean equals(Object obj) {
        if (obj instanceof C25220OooOOOo) {
            return this.f85901OooO0O0.equals(((C25220OooOOOo) obj).f85901OooO0O0);
        }
        return false;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final int hashCode() {
        return this.f85901OooO0O0.hashCode();
    }
}
