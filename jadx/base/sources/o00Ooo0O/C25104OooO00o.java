package o00Ooo0O;

import OooooO0.C21294OooOO0O;
import com.bumptech.glide.integration.webp.WebpImage;
import java.io.IOException;
import java.nio.ByteBuffer;
import o00Ooo0o.C25119OooO0oo;
import o00OooOO.C25159OooO0oO;
import o00OooOO.InterfaceC25155OooO0O0;
import o00o000.C25213OooO0o0;

/* JADX INFO: renamed from: o00Ooo0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25104OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C25119OooO0oo<Boolean> f85297OooO0Oo = C25119OooO0oo.OooO00o(Boolean.FALSE, "com.bumptech.glide.integration.webp.decoder.AnimatedWebpBitmapDecoder.DisableBitmap");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25159OooO0oO f85298OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC25155OooO0O0 f85299OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00o00.OooO0O0 f85300OooO0OO;

    public C25104OooO00o(InterfaceC25155OooO0O0 interfaceC25155OooO0O0, C25159OooO0oO c25159OooO0oO) {
        this.f85298OooO00o = c25159OooO0oO;
        this.f85299OooO0O0 = interfaceC25155OooO0O0;
        this.f85300OooO0OO = new o00o00.OooO0O0(interfaceC25155OooO0O0, c25159OooO0oO);
    }

    public final C25213OooO0o0 OooO00o(ByteBuffer byteBuffer, int i, int i2) throws IOException {
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr, 0, iRemaining);
        WebpImage webpImageCreate = WebpImage.create(bArr);
        C25108OooO0oo c25108OooO0oo = new C25108OooO0oo(this.f85300OooO0OO, webpImageCreate, byteBuffer, C21294OooOO0O.OooO0O0(webpImageCreate.getWidth(), webpImageCreate.getHeight(), i, i2), C25109OooOO0o.f85337OooO0O0);
        try {
            c25108OooO0oo.OooO0O0();
            return C25213OooO0o0.OooO0O0(c25108OooO0oo.OooO00o(), this.f85299OooO0O0);
        } finally {
            c25108OooO0oo.OooO0OO();
        }
    }
}
