package com.huawei.hms.drive;

import com.aspose.words.ControlChar;
import java.io.IOException;
import oOo00OoO.C34527OooO0oO;

/* JADX INFO: renamed from: com.huawei.hms.drive.cw */
/* JADX INFO: loaded from: classes6.dex */
public final class C17840cw {

    /* JADX INFO: renamed from: a */
    static final C34527OooO0oO f53206a;

    /* JADX INFO: renamed from: b */
    static final String[] f53207b;

    /* JADX INFO: renamed from: c */
    static final String[] f53208c;

    /* JADX INFO: renamed from: d */
    private static final String[] f53209d;

    static {
        C34527OooO0oO c34527OooO0oO = C34527OooO0oO.f123734OooOoO;
        f53206a = C34527OooO0oO.OooO00o.OooO0O0("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f53209d = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f53207b = new String[64];
        f53208c = new String[256];
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f53208c;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = C17806bp.m76330a("%8s", Integer.toBinaryString(i2)).replace(ControlChar.SPACE_CHAR, '0');
            i2++;
        }
        String[] strArr2 = f53207b;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[i3 | 8] = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), strArr2[i3], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            int i6 = iArr[0];
            String[] strArr3 = f53207b;
            int i7 = i6 | i5;
            strArr3[i7] = strArr3[i6] + '|' + strArr3[i5];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i6]);
            sb.append('|');
            strArr3[i7 | 8] = androidx.concurrent.futures.OooO00o.OooO0OO(sb, strArr3[i5], "|PADDED");
        }
        while (true) {
            String[] strArr4 = f53207b;
            if (i >= strArr4.length) {
                return;
            }
            if (strArr4[i] == null) {
                strArr4[i] = f53208c[i];
            }
            i++;
        }
    }

    private C17840cw() {
    }

    /* JADX INFO: renamed from: a */
    public static IllegalArgumentException m76555a(String str, Object... objArr) {
        throw new IllegalArgumentException(C17806bp.m76330a(str, objArr));
    }

    /* JADX INFO: renamed from: b */
    public static IOException m76558b(String str, Object... objArr) throws IOException {
        throw new IOException(C17806bp.m76330a(str, objArr));
    }

    /* JADX INFO: renamed from: a */
    public static String m76557a(boolean z, int i, int i2, byte b, byte b2) {
        String[] strArr = f53209d;
        return C17806bp.m76330a("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), b < strArr.length ? strArr[b] : C17806bp.m76330a("0x%02x", Byte.valueOf(b)), m76556a(b, b2));
    }

    /* JADX INFO: renamed from: a */
    public static String m76556a(byte b, byte b2) {
        if (b2 == 0) {
            return "";
        }
        if (b != 2 && b != 3) {
            if (b == 4 || b == 6) {
                return b2 == 1 ? "ACK" : f53208c[b2];
            }
            if (b != 7 && b != 8) {
                String[] strArr = f53207b;
                String str = b2 < strArr.length ? strArr[b2] : f53208c[b2];
                if (b != 5 || (b2 & 4) == 0) {
                    return (b != 0 || (b2 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                }
                return str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f53208c[b2];
    }
}
