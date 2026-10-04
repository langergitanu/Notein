package o0o0Oo;

import OooooO0.C21289OooO0o;
import java.security.SecureRandom;
import java.util.Arrays;

/* JADX INFO: renamed from: o0o0Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C30597OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f109481OooO00o;

    public C30597OooO00o(byte[] bArr) {
        this.f109481OooO00o = bArr;
    }

    public static C30597OooO00o OooO00o(String str, long j, AbstractC30598OooO0O0 abstractC30598OooO0O0, short s, C21289OooO0o c21289OooO0o) throws Exception {
        SecureRandom secureRandom = o00OOO0.OooO00o.f84854OooO00o;
        char cCharAt = str.charAt(0);
        byte[] bArr = new byte[2];
        o00OOO0.OooO00o.OooO00o().nextBytes(bArr);
        abstractC30598OooO0O0.OooO00o();
        byte[] bArr2 = new byte[2];
        o00OOO0.OooO00o.OooO00o().nextBytes(bArr2);
        byte[] bArr3 = (byte[]) new byte[0].clone();
        byte[] bArr4 = new byte[4];
        o00OOO0.OooO00o.OooO00o().nextBytes(bArr4);
        byte[][] bArr5 = {new byte[]{1}, new byte[]{(byte) (cCharAt & 255), (byte) (str.charAt(1) & 255)}, new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24), (byte) (j >> 32), (byte) (j >> 40), (byte) (j >> 48), (byte) (j >> 56)}, bArr, new byte[]{abstractC30598OooO0O0.f109482OooO00o}, new byte[]{abstractC30598OooO0O0.f109483OooO0O0}, (byte[]) abstractC30598OooO0O0.f109484OooO0OO.clone(), new byte[]{(byte) s, (byte) (s >> 8)}, bArr2, new byte[]{0}, bArr3, bArr4};
        int length = 0;
        for (int i = 0; i < 12; i++) {
            length += bArr5[i].length;
        }
        byte[] bArrCopyOf = null;
        int length2 = 0;
        for (int i2 = 0; i2 < 12; i2++) {
            byte[] bArr6 = bArr5[i2];
            if (bArrCopyOf == null) {
                bArrCopyOf = Arrays.copyOf(bArr6, length);
                length2 = bArr6.length;
            } else {
                System.arraycopy(bArr6, 0, bArrCopyOf, length2, bArr6.length);
                length2 += bArr6.length;
            }
        }
        return new C30597OooO00o(bArrCopyOf);
    }
}
