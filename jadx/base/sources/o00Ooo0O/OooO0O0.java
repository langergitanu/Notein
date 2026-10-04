package o00Ooo0O;

import android.graphics.Bitmap;
import com.bumptech.glide.integration.webp.OooO0OO;
import java.io.IOException;
import java.nio.ByteBuffer;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.InterfaceC25121OooOO0O;
import o00OooO.InterfaceC25145OooOo0o;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0O0 implements InterfaceC25121OooOO0O<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25104OooO00o f85301OooO00o;

    public OooO0O0(C25104OooO00o c25104OooO00o) {
        this.f85301OooO00o = c25104OooO00o;
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final InterfaceC25145OooOo0o<Bitmap> OooO00o(ByteBuffer byteBuffer, int i, int i2, C25111OooO c25111OooO) throws IOException {
        return this.f85301OooO00o.OooO00o(byteBuffer, i, i2);
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final boolean OooO0O0(ByteBuffer byteBuffer, C25111OooO c25111OooO) throws IOException {
        ByteBuffer byteBuffer2 = byteBuffer;
        if (((Boolean) c25111OooO.OooO0OO(C25104OooO00o.f85297OooO0Oo)).booleanValue()) {
            return false;
        }
        return (byteBuffer2 == null ? OooO0OO.EnumC22254OooO0o0.f67189OooOoo : com.bumptech.glide.integration.webp.OooO0OO.OooO00o(new OooO0OO.OooO0O0(byteBuffer2))) == OooO0OO.EnumC22254OooO0o0.f67190OooOoo0;
    }
}
