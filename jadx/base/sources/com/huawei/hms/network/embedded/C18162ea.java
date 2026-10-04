package com.huawei.hms.network.embedded;

import androidx.concurrent.futures.OooO00o;
import com.aspose.words.ControlChar;
import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.ea */
/* JADX INFO: loaded from: classes9.dex */
public final class C18162ea {

    /* JADX INFO: renamed from: b */
    public static final int f54638b = 16384;

    /* JADX INFO: renamed from: c */
    public static final byte f54639c = 0;

    /* JADX INFO: renamed from: d */
    public static final byte f54640d = 1;

    /* JADX INFO: renamed from: e */
    public static final byte f54641e = 2;

    /* JADX INFO: renamed from: f */
    public static final byte f54642f = 3;

    /* JADX INFO: renamed from: g */
    public static final byte f54643g = 4;

    /* JADX INFO: renamed from: h */
    public static final byte f54644h = 5;

    /* JADX INFO: renamed from: i */
    public static final byte f54645i = 6;

    /* JADX INFO: renamed from: j */
    public static final byte f54646j = 7;

    /* JADX INFO: renamed from: k */
    public static final byte f54647k = 8;

    /* JADX INFO: renamed from: l */
    public static final byte f54648l = 9;

    /* JADX INFO: renamed from: m */
    public static final byte f54649m = 0;

    /* JADX INFO: renamed from: n */
    public static final byte f54650n = 1;

    /* JADX INFO: renamed from: o */
    public static final byte f54651o = 1;

    /* JADX INFO: renamed from: p */
    public static final byte f54652p = 4;

    /* JADX INFO: renamed from: q */
    public static final byte f54653q = 4;

    /* JADX INFO: renamed from: r */
    public static final byte f54654r = 8;

    /* JADX INFO: renamed from: s */
    public static final byte f54655s = 32;

    /* JADX INFO: renamed from: t */
    public static final byte f54656t = 32;

    /* JADX INFO: renamed from: a */
    public static final C18303ob f54637a = C18303ob.m79299d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: u */
    public static final String[] f54657u = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: v */
    public static final String[] f54658v = new String[64];

    /* JADX INFO: renamed from: w */
    public static final String[] f54659w = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f54659w;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = C18313p8.m79366a("%8s", Integer.toBinaryString(i2)).replace(ControlChar.SPACE_CHAR, '0');
            i2++;
        }
        String[] strArr2 = f54658v;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[i3 | 8] = OooO00o.OooO0OO(new StringBuilder(), strArr2[i3], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            int i6 = iArr[0];
            String[] strArr3 = f54658v;
            int i7 = i6 | i5;
            strArr3[i7] = strArr3[i6] + '|' + strArr3[i5];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i6]);
            sb.append('|');
            strArr3[i7 | 8] = OooO00o.OooO0OO(sb, strArr3[i5], "|PADDED");
        }
        while (true) {
            String[] strArr4 = f54658v;
            if (i >= strArr4.length) {
                return;
            }
            if (strArr4[i] == null) {
                strArr4[i] = f54659w[i];
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static IllegalArgumentException m78336a(String str, Object... objArr) {
        throw new IllegalArgumentException(C18313p8.m79366a(str, objArr));
    }

    /* JADX INFO: renamed from: b */
    public static IOException m78339b(String str, Object... objArr) throws IOException {
        throw new IOException(C18313p8.m79366a(str, objArr));
    }

    /* JADX INFO: renamed from: a */
    public static String m78337a(byte b, byte b2) {
        if (b2 == 0) {
            return "";
        }
        if (b != 2 && b != 3) {
            if (b == 4 || b == 6) {
                return b2 == 1 ? "ACK" : f54659w[b2];
            }
            if (b != 7 && b != 8) {
                String[] strArr = f54658v;
                String str = b2 < strArr.length ? strArr[b2] : f54659w[b2];
                return (b != 5 || (b2 & 4) == 0) ? (b != 0 || (b2 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f54659w[b2];
    }

    /* JADX INFO: renamed from: a */
    public static String m78338a(boolean z, int i, int i2, byte b, byte b2) {
        String[] strArr = f54657u;
        return C18313p8.m79366a("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), b < strArr.length ? strArr[b] : C18313p8.m79366a("0x%02x", Byte.valueOf(b)), m78337a(b, b2));
    }
}
