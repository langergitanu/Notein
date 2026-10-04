package oO0oo0oo;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import oO0oO0Oo.C34032OooOo0O;
import oO0oOOo0.InterfaceC34131OooO00o;
import oO0oOoo.C34206OooO0O0;
import oOO000oO.C34332OooO00o;
import oOO000oO.C34336OooO0o;
import oOooo.InterfaceC34616OooO00o;

/* JADX INFO: renamed from: oO0oo0oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34250OooO00o implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final HashMap f123002OooOo0o;

    static {
        HashMap map = new HashMap();
        f123002OooOo0o = map;
        map.put(InterfaceC34616OooO00o.f124003OooO0o0, "E-A");
        map.put(InterfaceC34616OooO00o.f124002OooO0o, "E-B");
        map.put(InterfaceC34616OooO00o.f124004OooO0oO, "E-C");
        map.put(InterfaceC34616OooO00o.f124005OooO0oo, "E-D");
        map.put(InterfaceC34131OooO00o.f122651OooO, "Param-Z");
    }

    public C34250OooO00o(C34032OooOo0O c34032OooOo0O, byte[] bArr) {
        String str = (String) f123002OooOo0o.get(c34032OooOo0O);
        if (str == null) {
            throw new IllegalArgumentException("unknown OID: " + c34032OooOo0O);
        }
        byte[] bArr2 = (byte[]) C34206OooO0O0.f122865OooO00o.get(C34336OooO0o.OooO0OO(str));
        if (bArr2 == null) {
            throw new IllegalArgumentException("Unknown S-Box - possible types: \"Default\", \"E-Test\", \"E-A\", \"E-B\", \"E-C\", \"E-D\", \"Param-Z\", \"D-Test\", \"D-A\".");
        }
        C34332OooO00o.OooO00o(bArr2);
        C34332OooO00o.OooO00o(bArr);
    }
}
