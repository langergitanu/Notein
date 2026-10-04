package o00Ooo0O;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.InterfaceC25121OooOO0O;
import o00OooO.InterfaceC25145OooOo0o;
import o00OooOO.C25159OooO0oO;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0o implements InterfaceC25121OooOO0O<InputStream, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO f85307OooO00o;

    public OooO0o(OooO oooO, C25159OooO0oO c25159OooO0oO) {
        this.f85307OooO00o = oooO;
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final InterfaceC25145OooOo0o<Bitmap> OooO00o(InputStream inputStream, int i, int i2, C25111OooO c25111OooO) throws IOException {
        return this.f85307OooO00o.OooO00o(inputStream, i, i2, c25111OooO);
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final boolean OooO0O0(InputStream inputStream, C25111OooO c25111OooO) throws IOException {
        InputStream inputStream2 = inputStream;
        OooO oooO = this.f85307OooO00o;
        if (((Boolean) c25111OooO.OooO0OO(OooO.f85290OooO0o0)).booleanValue() || ((Boolean) c25111OooO.OooO0OO(OooO.f85289OooO0o)).booleanValue()) {
            return false;
        }
        return com.bumptech.glide.integration.webp.OooO0OO.OooO0OO(com.bumptech.glide.integration.webp.OooO0OO.OooO0O0(inputStream2, oooO.f85295OooO0OO));
    }
}
