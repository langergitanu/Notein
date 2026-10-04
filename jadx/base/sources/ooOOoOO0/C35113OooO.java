package ooOOoOO0;

import com.google.common.base.Ascii;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: ooOOoOO0.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35113OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final char[] f126097OooO00o = new char[117];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f126098OooO0O0 = new byte[126];

    static {
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
        }
        OooO00o(8, 'b');
        OooO00o(9, 't');
        OooO00o(10, 'n');
        OooO00o(12, 'f');
        OooO00o(13, 'r');
        OooO00o(47, IOUtils.DIR_SEPARATOR_UNIX);
        OooO00o(34, '\"');
        OooO00o(92, IOUtils.DIR_SEPARATOR_WINDOWS);
        while (true) {
            byte[] bArr = f126098OooO0O0;
            if (i >= 33) {
                bArr[9] = 3;
                bArr[10] = 3;
                bArr[13] = 3;
                bArr[32] = 3;
                bArr[44] = 4;
                bArr[58] = 5;
                bArr[123] = 6;
                bArr[125] = 7;
                bArr[91] = 8;
                bArr[93] = 9;
                bArr[34] = 1;
                bArr[92] = 2;
                return;
            }
            bArr[i] = Ascii.DEL;
            i++;
        }
    }

    public static void OooO00o(int i, char c) {
        if (c != 'u') {
            f126097OooO00o[c] = (char) i;
        }
    }
}
