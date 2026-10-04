package p619oO;

import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.util.HashMap;
import oO0oO0Oo.C34032OooOo0O;
import oO0oOO0O.InterfaceC34105OooO00o;
import oO0oOoOo.InterfaceC34201OooO0Oo;
import oO0oOoo0.C34214OooO0oO;
import oO0oOoo0.C34216OooOO0;
import oO0oOoo0.C34217OooOO0O;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final HashMap f113627OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final HashMap f113628OooO0O0;

    static {
        HashMap map = new HashMap();
        f113627OooO00o = map;
        HashMap map2 = new HashMap();
        f113628OooO0O0 = map2;
        C34032OooOo0O c34032OooOo0O = InterfaceC34105OooO00o.f122523OooO00o;
        map.put(KeyUtil.HMAC_KEY_HASH_ALGORITHM, c34032OooOo0O);
        C34032OooOo0O c34032OooOo0O2 = InterfaceC34105OooO00o.f122525OooO0OO;
        map.put("SHA-512", c34032OooOo0O2);
        C34032OooOo0O c34032OooOo0O3 = InterfaceC34105OooO00o.f122531OooOO0;
        map.put("SHAKE128", c34032OooOo0O3);
        C34032OooOo0O c34032OooOo0O4 = InterfaceC34105OooO00o.f122532OooOO0O;
        map.put("SHAKE256", c34032OooOo0O4);
        map2.put(c34032OooOo0O, KeyUtil.HMAC_KEY_HASH_ALGORITHM);
        map2.put(c34032OooOo0O2, "SHA-512");
        map2.put(c34032OooOo0O3, "SHAKE128");
        map2.put(c34032OooOo0O4, "SHAKE256");
    }

    public static InterfaceC34201OooO0Oo OooO00o(C34032OooOo0O c34032OooOo0O) {
        if (c34032OooOo0O.OooOO0o(InterfaceC34105OooO00o.f122523OooO00o)) {
            return new C34214OooO0oO();
        }
        if (c34032OooOo0O.OooOO0o(InterfaceC34105OooO00o.f122525OooO0OO)) {
            return new C34216OooOO0();
        }
        if (c34032OooOo0O.OooOO0o(InterfaceC34105OooO00o.f122531OooOO0)) {
            return new C34217OooOO0O(128);
        }
        if (c34032OooOo0O.OooOO0o(InterfaceC34105OooO00o.f122532OooOO0O)) {
            return new C34217OooOO0O();
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + c34032OooOo0O);
    }

    public static C34032OooOo0O OooO0O0(String str) {
        C34032OooOo0O c34032OooOo0O = (C34032OooOo0O) f113627OooO00o.get(str);
        if (c34032OooOo0O != null) {
            return c34032OooOo0O;
        }
        throw new IllegalArgumentException(OooO00o.OooO00o("unrecognized digest name: ", str));
    }
}
