package oO0oO00;

import oO0o.AbstractC33526OooO0Oo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0O0o.C33582OooO0OO;
import oO0o0OO0.C33679OooO00o;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000OOO implements InterfaceC33911OooO0OO<C33679OooO00o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0000OOO f122249OooO00o = new o0000OOO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final oo0o0Oo f122250OooO0O0 = new oo0o0Oo("kotlin.uuid.Uuid", AbstractC33526OooO0Oo.OooO.f121105OooO00o);

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
        String strConcat;
        String uuidString = oooO0OO.OooOO0();
        kotlin.jvm.internal.OooOOO0.OooO0oO(uuidString, "uuidString");
        int length = uuidString.length();
        C33679OooO00o c33679OooO00o = C33679OooO00o.f121415OooOoO0;
        if (length == 32) {
            long jOooO0O0 = C33582OooO0OO.OooO0O0(0, 16, uuidString);
            long jOooO0O02 = C33582OooO0OO.OooO0O0(16, 32, uuidString);
            if (jOooO0O0 != 0 || jOooO0O02 != 0) {
                return new C33679OooO00o(jOooO0O0, jOooO0O02);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (uuidString.length() <= 64) {
                    strConcat = uuidString;
                } else {
                    String strSubstring = uuidString.substring(0, 64);
                    kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
                    strConcat = strSubstring.concat("...");
                }
                sb.append(strConcat);
                sb.append("\" of length ");
                sb.append(uuidString.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long jOooO0O03 = C33582OooO0OO.OooO0O0(0, 8, uuidString);
            o00000.OooOo00.OooO00o(8, uuidString);
            long jOooO0O04 = C33582OooO0OO.OooO0O0(9, 13, uuidString);
            o00000.OooOo00.OooO00o(13, uuidString);
            long jOooO0O05 = C33582OooO0OO.OooO0O0(14, 18, uuidString);
            o00000.OooOo00.OooO00o(18, uuidString);
            long jOooO0O06 = C33582OooO0OO.OooO0O0(19, 23, uuidString);
            o00000.OooOo00.OooO00o(23, uuidString);
            long j = (jOooO0O04 << 16) | (jOooO0O03 << 32) | jOooO0O05;
            long jOooO0O07 = C33582OooO0OO.OooO0O0(24, 36, uuidString) | (jOooO0O06 << 48);
            if (j != 0 || jOooO0O07 != 0) {
                return new C33679OooO00o(j, jOooO0O07);
            }
        }
        return c33679OooO00o;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return f122250OooO0O0;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
        C33679OooO00o value = (C33679OooO00o) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        encoder.OooOOoo(value.toString());
    }
}
