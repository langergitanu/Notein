package oO0ooooo;

import androidx.appcompat.widget.C21532OooOOo;
import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.util.HashMap;
import oO0oO0Oo.C34032OooOo0O;
import oO0oO0Oo.o00Oo0;
import oO0oOO0O.InterfaceC34105OooO00o;
import oO0oOOO.InterfaceC34107OooO00o;
import oO0oOo0.C34142OooO00o;
import oO0oOoOo.InterfaceC34201OooO0Oo;
import oO0oOoo0.C34214OooO0oO;
import oO0oOoo0.C34216OooOO0;
import oO0oOoo0.C34217OooOO0O;
import oO0oooO.C34288OooO0oo;
import oO0oooO.InterfaceC34286OooO0o0;

/* JADX INFO: renamed from: oO0ooooo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34317OooO0o0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final HashMap f123185OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C34142OooO00o f123186OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C34142OooO00o f123187OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C34142OooO00o f123188OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C34142OooO00o f123189OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final C34142OooO00o f123190OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C34142OooO00o f123191OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final C34142OooO00o f123192OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final C34142OooO00o f123193OooO0oo;

    static {
        C34032OooOo0O c34032OooOo0O = InterfaceC34286OooO0o0.f123098OooO0oo;
        f123186OooO00o = new C34142OooO00o(c34032OooOo0O);
        C34032OooOo0O c34032OooOo0O2 = InterfaceC34286OooO0o0.f123090OooO;
        f123187OooO0O0 = new C34142OooO00o(c34032OooOo0O2);
        f123188OooO0OO = new C34142OooO00o(InterfaceC34105OooO00o.f122529OooO0oO);
        f123189OooO0Oo = new C34142OooO00o(InterfaceC34105OooO00o.f122528OooO0o0);
        f123191OooO0o0 = new C34142OooO00o(InterfaceC34105OooO00o.f122523OooO00o);
        f123190OooO0o = new C34142OooO00o(InterfaceC34105OooO00o.f122525OooO0OO);
        f123192OooO0oO = new C34142OooO00o(InterfaceC34105OooO00o.f122531OooOO0);
        f123193OooO0oo = new C34142OooO00o(InterfaceC34105OooO00o.f122532OooOO0O);
        HashMap map = new HashMap();
        f123185OooO = map;
        map.put(c34032OooOo0O, 5);
        map.put(c34032OooOo0O2, 6);
    }

    public static C34142OooO00o OooO00o(String str) {
        if (str.equals(IDevicePopManager.SHA_1)) {
            return new C34142OooO00o(InterfaceC34107OooO00o.f122558OooO0O0, o00Oo0.f122442OooOo);
        }
        if (str.equals("SHA-224")) {
            return new C34142OooO00o(InterfaceC34105OooO00o.f122526OooO0Oo);
        }
        if (str.equals(KeyUtil.HMAC_KEY_HASH_ALGORITHM)) {
            return new C34142OooO00o(InterfaceC34105OooO00o.f122523OooO00o);
        }
        if (str.equals("SHA-384")) {
            return new C34142OooO00o(InterfaceC34105OooO00o.f122524OooO0O0);
        }
        if (str.equals("SHA-512")) {
            return new C34142OooO00o(InterfaceC34105OooO00o.f122525OooO0OO);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: ".concat(str));
    }

    public static InterfaceC34201OooO0Oo OooO0O0(C34032OooOo0O c34032OooOo0O) {
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

    public static String OooO0OO(C34032OooOo0O c34032OooOo0O) {
        if (c34032OooOo0O.OooOO0o(InterfaceC34107OooO00o.f122558OooO0O0)) {
            return IDevicePopManager.SHA_1;
        }
        if (c34032OooOo0O.OooOO0o(InterfaceC34105OooO00o.f122526OooO0Oo)) {
            return "SHA-224";
        }
        if (c34032OooOo0O.OooOO0o(InterfaceC34105OooO00o.f122523OooO00o)) {
            return KeyUtil.HMAC_KEY_HASH_ALGORITHM;
        }
        if (c34032OooOo0O.OooOO0o(InterfaceC34105OooO00o.f122524OooO0O0)) {
            return "SHA-384";
        }
        if (c34032OooOo0O.OooOO0o(InterfaceC34105OooO00o.f122525OooO0OO)) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + c34032OooOo0O);
    }

    public static C34142OooO00o OooO0Oo(int i) {
        if (i == 5) {
            return f123186OooO00o;
        }
        if (i == 6) {
            return f123187OooO0O0;
        }
        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "unknown security category: "));
    }

    public static String OooO0o(C34288OooO0oo c34288OooO0oo) {
        C34142OooO00o c34142OooO00o = c34288OooO0oo.f123105OooOo;
        if (c34142OooO00o.f122685OooOo0o.OooOO0o(f123188OooO0OO.f122685OooOo0o)) {
            return "SHA3-256";
        }
        C34032OooOo0O c34032OooOo0O = f123189OooO0Oo.f122685OooOo0o;
        C34032OooOo0O c34032OooOo0O2 = c34142OooO00o.f122685OooOo0o;
        if (c34032OooOo0O2.OooOO0o(c34032OooOo0O)) {
            return "SHA-512/256";
        }
        throw new IllegalArgumentException("unknown tree digest: " + c34032OooOo0O2);
    }

    public static C34142OooO00o OooO0o0(String str) {
        if (str.equals("SHA3-256")) {
            return f123188OooO0OO;
        }
        if (str.equals("SHA-512/256")) {
            return f123189OooO0Oo;
        }
        throw new IllegalArgumentException("unknown tree digest: ".concat(str));
    }

    public static C34142OooO00o OooO0oO(String str) {
        if (str.equals(KeyUtil.HMAC_KEY_HASH_ALGORITHM)) {
            return f123191OooO0o0;
        }
        if (str.equals("SHA-512")) {
            return f123190OooO0o;
        }
        if (str.equals("SHAKE128")) {
            return f123192OooO0oO;
        }
        if (str.equals("SHAKE256")) {
            return f123193OooO0oo;
        }
        throw new IllegalArgumentException("unknown tree digest: ".concat(str));
    }
}
