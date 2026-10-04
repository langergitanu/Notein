package o00Ooo0O;

import OooooO0.C21294OooOO0O;
import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.integration.webp.OooO0OO;
import com.bumptech.glide.integration.webp.WebpImage;
import java.io.IOException;
import java.nio.ByteBuffer;
import o00Ooo0O.OooOO0;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.C25119OooO0oo;
import o00Ooo0o.InterfaceC25121OooOO0O;
import o00OooO.InterfaceC25145OooOo0o;
import o00OooOO.C25159OooO0oO;
import o00OooOO.InterfaceC25155OooO0O0;
import o00o0000.C25240OooO0OO;

/* JADX INFO: renamed from: o00Ooo0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25105OooO0Oo implements InterfaceC25121OooOO0O<ByteBuffer, OooOO0> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C25119OooO0oo<Boolean> f85303OooO0Oo = C25119OooO0oo.OooO00o(Boolean.FALSE, "com.bumptech.glide.integration.webp.decoder.ByteBufferWebpDecoder.DisableAnimation");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f85304OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC25155OooO0O0 f85305OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00o00.OooO0O0 f85306OooO0OO;

    public C25105OooO0Oo(Context context, C25159OooO0oO c25159OooO0oO, InterfaceC25155OooO0O0 interfaceC25155OooO0O0) {
        this.f85304OooO00o = context.getApplicationContext();
        this.f85305OooO0O0 = interfaceC25155OooO0O0;
        this.f85306OooO0OO = new o00o00.OooO0O0(interfaceC25155OooO0O0, c25159OooO0oO);
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final InterfaceC25145OooOo0o<OooOO0> OooO00o(ByteBuffer byteBuffer, int i, int i2, C25111OooO c25111OooO) throws IOException {
        ByteBuffer byteBuffer2 = byteBuffer;
        int iRemaining = byteBuffer2.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer2.get(bArr, 0, iRemaining);
        WebpImage webpImageCreate = WebpImage.create(bArr);
        C25108OooO0oo c25108OooO0oo = new C25108OooO0oo(this.f85306OooO0OO, webpImageCreate, byteBuffer2, C21294OooOO0O.OooO0O0(webpImageCreate.getWidth(), webpImageCreate.getHeight(), i, i2), (C25109OooOO0o) c25111OooO.OooO0OO(OooOOO0.f85344OooOOo0));
        c25108OooO0oo.OooO0O0();
        Bitmap bitmapOooO00o = c25108OooO0oo.OooO00o();
        return new OooOO0O(new OooOO0(new OooOO0.OooO00o(this.f85305OooO0O0, new OooOOO0(com.bumptech.glide.OooO0OO.OooO00o(this.f85304OooO00o), c25108OooO0oo, i, i2, C25240OooO0OO.f85962OooO0O0, bitmapOooO00o))));
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final boolean OooO0O0(ByteBuffer byteBuffer, C25111OooO c25111OooO) throws IOException {
        ByteBuffer byteBuffer2 = byteBuffer;
        if (((Boolean) c25111OooO.OooO0OO(f85303OooO0Oo)).booleanValue()) {
            return false;
        }
        return (byteBuffer2 == null ? OooO0OO.EnumC22254OooO0o0.f67189OooOoo : com.bumptech.glide.integration.webp.OooO0OO.OooO00o(new OooO0OO.OooO0O0(byteBuffer2))) == OooO0OO.EnumC22254OooO0o0.f67190OooOoo0;
    }
}
