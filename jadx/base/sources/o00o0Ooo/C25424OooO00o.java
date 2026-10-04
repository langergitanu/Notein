package o00o0Ooo;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: o00o0Ooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25424OooO00o {
    public static int OooO00o(InputStream inputStream, byte[] bArr, int i) throws IOException {
        inputStream.getClass();
        if (i < 0) {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                break;
            }
            i2 += i3;
        }
        return i2;
    }
}
