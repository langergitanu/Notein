package o00o000;

import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.InterfaceC25121OooOO0O;
import o00OooO.InterfaceC25145OooOo0o;
import o00o000.OooOo00;

/* JADX INFO: renamed from: o00o000.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25214OooO0oO implements InterfaceC25121OooOO0O<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO f85868OooO00o;

    public C25214OooO0oO(OooOOO oooOOO) {
        this.f85868OooO00o = oooOOO;
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final InterfaceC25145OooOo0o<Bitmap> OooO00o(ByteBuffer byteBuffer, int i, int i2, C25111OooO c25111OooO) throws IOException {
        OooOOO oooOOO = this.f85868OooO00o;
        return oooOOO.OooO00o(new OooOo00.OooO00o(byteBuffer, oooOOO.f85888OooO0Oo, oooOOO.f85887OooO0OO), i, i2, c25111OooO, OooOOO.f85882OooOO0o);
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final boolean OooO0O0(ByteBuffer byteBuffer, C25111OooO c25111OooO) throws IOException {
        return true;
    }
}
