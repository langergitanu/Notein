package oO000Oo;

import com.google.common.base.Charsets;
import java.util.logging.Logger;

/* JADX INFO: renamed from: oO000Oo.o0000oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32052o0000oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Logger f114574OooO00o = Logger.getLogger(C32052o0000oo0.class.getName());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f114575OooO0O0 = "-bin".getBytes(Charsets.US_ASCII);

    public static boolean OooO00o(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }
}
