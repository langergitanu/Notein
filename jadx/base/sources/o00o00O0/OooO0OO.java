package o00o00O0;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import o00Ooo0o.C25111OooO;
import o00OooO.InterfaceC25145OooOo0o;
import o00OooOO.InterfaceC25155OooO0O0;
import o00o000.C25213OooO0o0;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0OO implements InterfaceC25253OooO0o0<Drawable, byte[]> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25155OooO0O0 f85977OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25250OooO00o f85978OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C25252OooO0Oo f85979OooO0OO;

    public OooO0OO(InterfaceC25155OooO0O0 interfaceC25155OooO0O0, C25250OooO00o c25250OooO00o, C25252OooO0Oo c25252OooO0Oo) {
        this.f85977OooO00o = interfaceC25155OooO0O0;
        this.f85978OooO0O0 = c25250OooO00o;
        this.f85979OooO0OO = c25252OooO0Oo;
    }

    @Override // o00o00O0.InterfaceC25253OooO0o0
    public final InterfaceC25145OooOo0o<byte[]> OooO00o(InterfaceC25145OooOo0o<Drawable> interfaceC25145OooOo0o, C25111OooO c25111OooO) {
        Drawable drawable = interfaceC25145OooOo0o.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f85978OooO0O0.OooO00o(C25213OooO0o0.OooO0O0(((BitmapDrawable) drawable).getBitmap(), this.f85977OooO00o), c25111OooO);
        }
        if (drawable instanceof o00o00.OooO0OO) {
            return this.f85979OooO0OO.OooO00o(interfaceC25145OooOo0o, c25111OooO);
        }
        return null;
    }
}
