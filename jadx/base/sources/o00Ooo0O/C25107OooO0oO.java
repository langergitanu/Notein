package o00Ooo0O;

import OooooO0.C21294OooOO0O;
import com.bumptech.glide.integration.webp.OooO0OO;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.C25119OooO0oo;
import o00Ooo0o.InterfaceC25121OooOO0O;
import o00OooO.InterfaceC25145OooOo0o;
import o00OooOO.C25159OooO0oO;

/* JADX INFO: renamed from: o00Ooo0O.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25107OooO0oO implements InterfaceC25121OooOO0O<InputStream, OooOO0> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C25119OooO0oo<Boolean> f85309OooO0OO = C25119OooO0oo.OooO00o(Boolean.FALSE, "com.bumptech.glide.integration.webp.decoder.StreamWebpDecoder.DisableAnimation");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25105OooO0Oo f85310OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25159OooO0oO f85311OooO0O0;

    public C25107OooO0oO(C25105OooO0Oo c25105OooO0Oo, C25159OooO0oO c25159OooO0oO) {
        this.f85310OooO00o = c25105OooO0Oo;
        this.f85311OooO0O0 = c25159OooO0oO;
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final InterfaceC25145OooOo0o<OooOO0> OooO00o(InputStream inputStream, int i, int i2, C25111OooO c25111OooO) throws IOException {
        byte[] bArrOooO0OO = C21294OooOO0O.OooO0OO(inputStream);
        if (bArrOooO0OO == null) {
            return null;
        }
        return this.f85310OooO00o.OooO00o(ByteBuffer.wrap(bArrOooO0OO), i, i2, c25111OooO);
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final boolean OooO0O0(InputStream inputStream, C25111OooO c25111OooO) throws IOException {
        return !((Boolean) c25111OooO.OooO0OO(f85309OooO0OO)).booleanValue() && com.bumptech.glide.integration.webp.OooO0OO.OooO0O0(inputStream, this.f85311OooO0O0) == OooO0OO.EnumC22254OooO0o0.f67190OooOoo0;
    }
}
