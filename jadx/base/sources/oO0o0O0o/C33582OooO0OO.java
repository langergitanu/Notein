package oO0o0O0o;

import Oooo0o0.C21009OooOooO;
import oOo000Oo.AbstractC34421OooO0Oo;

/* JADX INFO: renamed from: oO0o0O0o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33582OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f121241OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final long[] f121242OooO0O0;

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = "0123456789abcdef".charAt(i2 & 15) | ("0123456789abcdef".charAt(i2 >> 4) << '\b');
        }
        f121241OooO00o = iArr;
        int[] iArr2 = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = "0123456789ABCDEF".charAt(i3 & 15) | ("0123456789ABCDEF".charAt(i3 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr3[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i7)] = i8;
            i7++;
            i8++;
        }
        long[] jArr = new long[256];
        for (int i9 = 0; i9 < 256; i9++) {
            jArr[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i)] = i12;
            i++;
            i12++;
        }
        f121242OooO0O0 = jArr;
    }

    public static final void OooO00o(int i, int i2, String str) {
        int i3 = i2 - i;
        if (i3 < 1) {
            String strSubstring = str.substring(i, i2);
            kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
            StringBuilder sbOooO0OO = C21009OooOooO.OooO0OO(i, "Expected at least 1 hexadecimal digits at index ", ", but was \"", strSubstring, "\" of length ");
            sbOooO0OO.append(i3);
            throw new NumberFormatException(sbOooO0OO.toString());
        }
        if (i3 > 16) {
            int i4 = (i3 + i) - 16;
            while (i < i4) {
                if (str.charAt(i) != '0') {
                    StringBuilder sbOooO0OO2 = OooO0O0.OooO0o.OooO0OO(i, "Expected the hexadecimal digit '0' at index ", ", but was '");
                    sbOooO0OO2.append(str.charAt(i));
                    sbOooO0OO2.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(sbOooO0OO2.toString());
                }
                i++;
            }
        }
    }

    public static long OooO0O0(int i, int i2, String str) {
        C33583OooO0Oo format = C33583OooO0Oo.f121243OooO0Oo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(format, "format");
        AbstractC34421OooO0Oo.OooO00o.OooO00o(i, i2, str.length());
        if (format.f121246OooO0OO.f121249OooO00o) {
            OooO00o(i, i2, str);
            return OooO0OO(i, i2, str);
        }
        if (i2 - i > 0) {
            OooO00o(i, i2, str);
            return OooO0OO(i, i2, str);
        }
        String strSubstring = str.substring(i, i2);
        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(strSubstring));
    }

    public static final long OooO0OO(int i, int i2, String str) {
        long j = 0;
        while (i < i2) {
            long j2 = j << 4;
            char cCharAt = str.charAt(i);
            if ((cCharAt >>> '\b') == 0) {
                long j3 = f121242OooO0O0[cCharAt];
                if (j3 >= 0) {
                    j = j2 | j3;
                    i++;
                }
            }
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Expected a hexadecimal digit at index ", ", but was ");
            sbOooO0OO.append(str.charAt(i));
            throw new NumberFormatException(sbOooO0OO.toString());
        }
        return j;
    }
}
