package oO0oOoO;

import java.io.IOException;
import java.util.HashMap;
import oO0oO0Oo.C34032OooOo0O;
import oO0oO0oo.C34098OooOOOo;
import oO0oOo0.C34142OooO00o;
import oO0oOooo.C34225OooO0o0;

/* JADX INFO: renamed from: oO0oOoO.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34189OooOOo extends AbstractC34193OooOo00 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final HashMap f122827OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public C34098OooOOOo f122828OooO0o0;

    static {
        HashMap map = new HashMap();
        f122827OooO0o = map;
        HashMap map2 = new HashMap();
        C34032OooOo0O c34032OooOo0O = C34174OooO00o.f122797OooO0O0;
        map2.put(c34032OooOo0O, 8);
        C34032OooOo0O c34032OooOo0O2 = C34174OooO00o.f122801OooO0o0;
        map2.put(c34032OooOo0O2, 16);
        C34032OooOo0O c34032OooOo0O3 = C34174OooO00o.f122800OooO0o;
        map2.put(c34032OooOo0O3, 16);
        C34032OooOo0O c34032OooOo0O4 = C34174OooO00o.f122802OooO0oO;
        map2.put(c34032OooOo0O4, 16);
        map.put(c34032OooOo0O, 192);
        map.put(c34032OooOo0O2, 128);
        map.put(c34032OooOo0O3, 192);
        map.put(c34032OooOo0O4, 256);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0oOoO.AbstractC34193OooOo00
    public final C34194OooOo0O OooO0O0(C34225OooO0o0 c34225OooO0o0) throws C34179OooO0o0, IOException {
        InterfaceC34188OooOOOo interfaceC34188OooOOOo = (InterfaceC34188OooOOOo) c34225OooO0o0;
        C34098OooOOOo c34098OooOOOo = this.f122828OooO0o0;
        ((Integer) f122827OooO0o.get(C34142OooO00o.OooO0oo(C34142OooO00o.OooO0oo(c34098OooOOOo.f122510OooOoO0).f122684OooOo).f122685OooOo0o)).getClass();
        interfaceC34188OooOOOo.OooO0O0();
        interfaceC34188OooOOOo.OooO00o();
        byte[] bArr = c34098OooOOOo.f122509OooOoO.f122362OooOo0o;
        return interfaceC34188OooOOOo.OooO0OO();
    }
}
