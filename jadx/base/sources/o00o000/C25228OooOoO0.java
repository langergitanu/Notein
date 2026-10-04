package o00o000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.IOException;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.InterfaceC25121OooOO0O;
import o00OooO.InterfaceC25145OooOo0o;
import o00OooOO.InterfaceC25155OooO0O0;
import o00o000o.C25249OooO0oo;

/* JADX INFO: renamed from: o00o000.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25228OooOoO0 implements InterfaceC25121OooOO0O<Uri, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25249OooO0oo f85933OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC25155OooO0O0 f85934OooO0O0;

    public C25228OooOoO0(C25249OooO0oo c25249OooO0oo, InterfaceC25155OooO0O0 interfaceC25155OooO0O0) {
        this.f85933OooO00o = c25249OooO0oo;
        this.f85934OooO0O0 = interfaceC25155OooO0O0;
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final InterfaceC25145OooOo0o<Bitmap> OooO00o(Uri uri, int i, int i2, C25111OooO c25111OooO) throws IOException {
        InterfaceC25145OooOo0o interfaceC25145OooOo0oOooO0OO = this.f85933OooO00o.OooO0OO(uri, c25111OooO);
        if (interfaceC25145OooOo0oOooO0OO == null) {
            return null;
        }
        return OooOOOO.OooO00o(this.f85934OooO0O0, (Drawable) ((o00o000o.OooO0o) interfaceC25145OooOo0oOooO0OO).get(), i, i2);
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final boolean OooO0O0(Uri uri, C25111OooO c25111OooO) throws IOException {
        return "android.resource".equals(uri.getScheme());
    }
}
