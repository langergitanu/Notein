package o00o00;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.fragment.app.C21929Ooooo0o;
import java.security.MessageDigest;
import o00Ooo0o.InterfaceC25123OooOOO0;
import o00OooO.InterfaceC25145OooOo0o;
import o00o000.C25213OooO0o0;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0o implements InterfaceC25123OooOOO0<OooO0OO> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC25123OooOOO0<Bitmap> f85830OooO0O0;

    public OooO0o(InterfaceC25123OooOOO0<Bitmap> interfaceC25123OooOOO0) {
        C21929Ooooo0o.OooO0OO(interfaceC25123OooOOO0, "Argument must not be null");
        this.f85830OooO0O0 = interfaceC25123OooOOO0;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final void OooO00o(MessageDigest messageDigest) {
        this.f85830OooO0O0.OooO00o(messageDigest);
    }

    @Override // o00Ooo0o.InterfaceC25123OooOOO0
    public final InterfaceC25145OooOo0o<OooO0OO> OooO0O0(Context context, InterfaceC25145OooOo0o<OooO0OO> interfaceC25145OooOo0o, int i, int i2) {
        OooO0OO oooO0OO = interfaceC25145OooOo0o.get();
        InterfaceC25145OooOo0o<Bitmap> c25213OooO0o0 = new C25213OooO0o0(oooO0OO.f85820OooOo0o.f85829OooO00o.f85842OooOO0o, com.bumptech.glide.OooO0OO.OooO00o(context).f67114OooOo0o);
        InterfaceC25123OooOOO0<Bitmap> interfaceC25123OooOOO0 = this.f85830OooO0O0;
        InterfaceC25145OooOo0o<Bitmap> interfaceC25145OooOo0oOooO0O0 = interfaceC25123OooOOO0.OooO0O0(context, c25213OooO0o0, i, i2);
        if (!c25213OooO0o0.equals(interfaceC25145OooOo0oOooO0O0)) {
            c25213OooO0o0.recycle();
        }
        oooO0OO.f85820OooOo0o.f85829OooO00o.OooO0OO(interfaceC25123OooOOO0, interfaceC25145OooOo0oOooO0O0.get());
        return interfaceC25145OooOo0o;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final boolean equals(Object obj) {
        if (obj instanceof OooO0o) {
            return this.f85830OooO0O0.equals(((OooO0o) obj).f85830OooO0O0);
        }
        return false;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final int hashCode() {
        return this.f85830OooO0O0.hashCode();
    }
}
