package o00OOOo;

import android.util.Log;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import o00Oo.C25025OooO00o;
import oO0o0ooO.InterfaceC33910OooO0O0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.AbstractC33934OooO0O0;
import oO0oO000.InterfaceC34004OooO0Oo;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {
    public static String OooO00o(String str) {
        return com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("SecurityComp10200303: ", str);
    }

    public static byte[] OooO0O0(int i) {
        return new byte[]{(byte) ((i >> 24) % 256), (byte) ((i >> 16) % 256), (byte) ((i >> 8) % 256), (byte) (i % 256)};
    }

    public static void OooO0OO(String str, String str2) {
        Log.e(OooO00o(str), str2);
    }

    public static void OooO0Oo(String str, String str2) {
        Log.i(OooO00o(str), str2);
    }

    public static final InterfaceC33911OooO0OO OooO0o(AbstractC33934OooO0O0 abstractC33934OooO0O0, InterfaceC34004OooO0Oo encoder, Object value) {
        OooOOO0.OooO0oO(abstractC33934OooO0O0, "<this>");
        OooOOO0.OooO0oO(encoder, "encoder");
        OooOOO0.OooO0oO(value, "value");
        abstractC33934OooO0O0.getClass();
        OooOOO0.OooO0oO(encoder, "encoder");
        OooOOO0.OooO0oO(value, "value");
        InterfaceC33911OooO0OO interfaceC33911OooO0OOOooOo00 = encoder.OooO0OO().OooOo00(abstractC33934OooO0O0.OooO00o(), value);
        if (interfaceC33911OooO0OOOooOo00 != null) {
            return interfaceC33911OooO0OOOooOo00;
        }
        InterfaceC34595OooO0Oo interfaceC34595OooO0OoOooO0O0 = C24035Oooo00o.f80943OooO00o.OooO0O0(value.getClass());
        InterfaceC34595OooO0Oo baseClass = abstractC33934OooO0O0.OooO00o();
        OooOOO0.OooO0oO(baseClass, "baseClass");
        String strOooOO0 = interfaceC34595OooO0OoOooO0O0.OooOO0();
        if (strOooOO0 == null) {
            strOooOO0 = String.valueOf(interfaceC34595OooO0OoOooO0O0);
        }
        C25025OooO00o.OooO0o(strOooOO0, baseClass);
        throw null;
    }

    public static final InterfaceC33910OooO0O0 OooO0o0(AbstractC33934OooO0O0 abstractC33934OooO0O0, oO0oO000.OooO00o oooO00o, String str) {
        OooOOO0.OooO0oO(abstractC33934OooO0O0, "<this>");
        abstractC33934OooO0O0.getClass();
        InterfaceC33910OooO0O0 interfaceC33910OooO0O0OooOOo = oooO00o.OooO0OO().OooOOo(str, abstractC33934OooO0O0.OooO00o());
        if (interfaceC33910OooO0O0OooOOo != null) {
            return interfaceC33910OooO0O0OooOOo;
        }
        C25025OooO00o.OooO0o(str, abstractC33934OooO0O0.OooO00o());
        throw null;
    }
}
