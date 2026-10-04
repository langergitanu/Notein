package o00o000;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import o000Ooo.C24545OooO00o;
import o00OooOO.C25159OooO0oO;
import o00o0O0.C25308OooO00o;

/* JADX INFO: renamed from: o00o000.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25222OooOOo0 implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int OooO00o(InputStream inputStream, C25159OooO0oO c25159OooO0oO) throws IOException {
        int iOooO0OO = new C24545OooO00o(inputStream).OooO0OO(1);
        if (iOooO0OO == 0) {
            return -1;
        }
        return iOooO0OO;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType OooO0O0(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType OooO0OO(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int OooO0Oo(ByteBuffer byteBuffer, C25159OooO0oO c25159OooO0oO) throws IOException {
        AtomicReference<byte[]> atomicReference = C25308OooO00o.f86137OooO00o;
        return OooO00o(new C25308OooO00o.C19693OooO00o(byteBuffer), c25159OooO0oO);
    }
}
