package o00Ooo0O;

import android.graphics.Bitmap;
import com.bumptech.glide.integration.webp.OooO0OO;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.InterfaceC25121OooOO0O;
import o00OooO.InterfaceC25145OooOo0o;
import o00o0O0.C25308OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0OO implements InterfaceC25121OooOO0O<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO f85302OooO00o;

    public OooO0OO(OooO oooO) {
        this.f85302OooO00o = oooO;
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final InterfaceC25145OooOo0o<Bitmap> OooO00o(ByteBuffer byteBuffer, int i, int i2, C25111OooO c25111OooO) throws IOException {
        AtomicReference<byte[]> atomicReference = C25308OooO00o.f86137OooO00o;
        return this.f85302OooO00o.OooO00o(new C25308OooO00o.C19693OooO00o(byteBuffer), i, i2, c25111OooO);
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final boolean OooO0O0(ByteBuffer byteBuffer, C25111OooO c25111OooO) throws IOException {
        ByteBuffer byteBuffer2 = byteBuffer;
        if (((Boolean) c25111OooO.OooO0OO(OooO.f85290OooO0o0)).booleanValue() || ((Boolean) c25111OooO.OooO0OO(OooO.f85289OooO0o)).booleanValue()) {
            return false;
        }
        return com.bumptech.glide.integration.webp.OooO0OO.OooO0OO(byteBuffer2 == null ? OooO0OO.EnumC22254OooO0o0.f67189OooOoo : com.bumptech.glide.integration.webp.OooO0OO.OooO00o(new OooO0OO.OooO0O0(byteBuffer2)));
    }
}
