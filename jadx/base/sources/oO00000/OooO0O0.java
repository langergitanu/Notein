package oO00000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f113731OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f113732OooO0O0;

    static {
        Charset charset = StandardCharsets.UTF_8;
        f113731OooO00o = "my.yubico.com".getBytes(charset);
        f113732OooO0O0 = "/neo/".getBytes(charset);
    }

    public static String OooO00o(byte[] bArr) {
        byte[] bArrCopyOfRange;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byte b = byteBufferWrap.get();
        byte b2 = byteBufferWrap.get();
        int i = (byteBufferWrap.get() - b2) & 255;
        byte b3 = byteBufferWrap.get();
        byte b4 = byteBufferWrap.get();
        if (b != -47 || b2 != 1 || b3 != 85 || b4 != 4) {
            throw new IllegalArgumentException("Not a HTTPS URL NDEF record");
        }
        byte[] bArr2 = f113731OooO00o;
        byte[] bArr3 = new byte[bArr2.length];
        byteBufferWrap.get(bArr3);
        if (!Arrays.equals(bArr2, bArr3)) {
            throw new IllegalArgumentException("Incorrect URL domain");
        }
        int length = i - bArr2.length;
        byte[] bArr4 = new byte[length];
        byteBufferWrap.get(bArr4);
        byte[] bArr5 = f113732OooO0O0;
        if (!Arrays.equals(bArr5, Arrays.copyOf(bArr4, bArr5.length))) {
            for (int i2 = 0; i2 < length; i2++) {
                if (bArr4[i2] == 35) {
                    bArrCopyOfRange = Arrays.copyOfRange(bArr4, i2 + 1, length);
                }
            }
            throw new IllegalArgumentException("Incorrect URL format");
        }
        bArrCopyOfRange = Arrays.copyOfRange(bArr4, bArr5.length, length);
        return new String(bArrCopyOfRange, StandardCharsets.UTF_8);
    }
}
