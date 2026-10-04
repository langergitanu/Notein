package o00o00;

import android.graphics.Bitmap;
import java.io.IOException;
import o00Ooo0.InterfaceC25097OooO00o;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.InterfaceC25121OooOO0O;
import o00OooO.InterfaceC25145OooOo0o;
import o00OooOO.InterfaceC25155OooO0O0;
import o00o000.C25213OooO0o0;

/* JADX INFO: renamed from: o00o00.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25209OooO0oo implements InterfaceC25121OooOO0O<InterfaceC25097OooO00o, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25155OooO0O0 f85853OooO00o;

    public C25209OooO0oo(InterfaceC25155OooO0O0 interfaceC25155OooO0O0) {
        this.f85853OooO00o = interfaceC25155OooO0O0;
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final InterfaceC25145OooOo0o<Bitmap> OooO00o(InterfaceC25097OooO00o interfaceC25097OooO00o, int i, int i2, C25111OooO c25111OooO) throws IOException {
        return C25213OooO0o0.OooO0O0(interfaceC25097OooO00o.OooO00o(), this.f85853OooO00o);
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final /* bridge */ /* synthetic */ boolean OooO0O0(InterfaceC25097OooO00o interfaceC25097OooO00o, C25111OooO c25111OooO) throws IOException {
        return true;
    }
}
