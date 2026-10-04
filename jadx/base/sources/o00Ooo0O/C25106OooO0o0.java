package o00Ooo0O;

import OooooO0.C21294OooOO0O;
import android.graphics.Bitmap;
import com.bumptech.glide.integration.webp.OooO0OO;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.InterfaceC25121OooOO0O;
import o00OooO.InterfaceC25145OooOo0o;

/* JADX INFO: renamed from: o00Ooo0O.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25106OooO0o0 implements InterfaceC25121OooOO0O<InputStream, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25104OooO00o f85308OooO00o;

    public C25106OooO0o0(C25104OooO00o c25104OooO00o) {
        this.f85308OooO00o = c25104OooO00o;
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final InterfaceC25145OooOo0o<Bitmap> OooO00o(InputStream inputStream, int i, int i2, C25111OooO c25111OooO) throws IOException {
        C25104OooO00o c25104OooO00o = this.f85308OooO00o;
        byte[] bArrOooO0OO = C21294OooOO0O.OooO0OO(inputStream);
        if (bArrOooO0OO == null) {
            return null;
        }
        return c25104OooO00o.OooO00o(ByteBuffer.wrap(bArrOooO0OO), i, i2);
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final boolean OooO0O0(InputStream inputStream, C25111OooO c25111OooO) throws IOException {
        return !((Boolean) c25111OooO.OooO0OO(C25104OooO00o.f85297OooO0Oo)).booleanValue() && com.bumptech.glide.integration.webp.OooO0OO.OooO0O0(inputStream, this.f85308OooO00o.f85298OooO00o) == OooO0OO.EnumC22254OooO0o0.f67190OooOoo0;
    }
}
