package o00o0oo0;

import com.microsoft.identity.common.java.AuthenticationConstants;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: o00o0oo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25471OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static boolean f86780OooO00o = false;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f86781OooO0O0 = OooO00o("RIFF");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final byte[] f86782OooO0OO = OooO00o("WEBP");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final byte[] f86783OooO0Oo = OooO00o("VP8 ");

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final byte[] f86785OooO0o0 = OooO00o("VP8L");

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final byte[] f86784OooO0o = OooO00o("VP8X");

    public static byte[] OooO00o(String str) {
        try {
            return str.getBytes(AuthenticationConstants.ENCODING_ASCII_STRING);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    public static boolean OooO0O0(int i, byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr2.length + i <= bArr.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2 + i] == bArr2[i2]) {
                }
            }
            return true;
        }
        return false;
    }
}
