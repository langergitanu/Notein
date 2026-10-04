package o00000;

import java.util.Arrays;
import oO0o0O0o.C33582OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public class OooOo00 {
    public static final void OooO00o(int i, String str) {
        if (str.charAt(i) == '-') {
            return;
        }
        StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Expected '-' (hyphen) at index ", ", but was '");
        sbOooO0OO.append(str.charAt(i));
        sbOooO0OO.append('\'');
        throw new IllegalArgumentException(sbOooO0OO.toString().toString());
    }

    public static final void OooO0O0(long j, int i, int i2, int i3, byte[] bArr) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = C33582OooO0OO.f121241OooO00o[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    public static final String OooO0OO(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static String OooO0Oo(int i) {
        return i == 1 ? "Text" : i == 2 ? "Ascii" : i == 3 ? "Number" : i == 4 ? "Phone" : i == 5 ? "Uri" : i == 6 ? "Email" : i == 7 ? "Password" : i == 8 ? "NumberPassword" : i == 9 ? "Decimal" : "Invalid";
    }
}
