package o0ooo0O;

import java.util.HashMap;
import o0ooO0Oo.C31441OooOO0;
import o0ooOoo.InterfaceC31671OooO0OO;

/* JADX INFO: renamed from: o0ooo0O.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31753OooO0OO implements InterfaceC31671OooO0OO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final HashMap f113392OooOo0o = new HashMap(250);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final HashMap f113391OooOo = new HashMap(250);

    public static AbstractC31753OooO0OO OooO0OO(C31441OooOO0 c31441OooOO0) {
        if (C31441OooOO0.f112392o00O0o.equals(c31441OooOO0)) {
            return C31758OooO0oo.f113404OooOoO;
        }
        if (C31441OooOO0.f112425o00OOoo.equals(c31441OooOO0)) {
            return C31760OooOO0O.f113406OooOoO;
        }
        if (C31441OooOO0.f112347o000o0O0.equals(c31441OooOO0)) {
            return C31757OooO0oO.f113402OooOoO;
        }
        if (C31441OooOO0.f112460oooo00o.equals(c31441OooOO0)) {
            return C31756OooO0o0.f113400OooOoO;
        }
        return null;
    }

    public final void OooO00o(int i, String str) {
        this.f113392OooOo0o.put(Integer.valueOf(i), str);
        HashMap map = this.f113391OooOo;
        if (map.containsKey(str)) {
            return;
        }
        map.put(str, Integer.valueOf(i));
    }

    public abstract String OooO0O0();

    public final String OooO0Oo(int i) {
        String str = (String) this.f113392OooOo0o.get(Integer.valueOf(i));
        return str != null ? str : ".notdef";
    }
}
