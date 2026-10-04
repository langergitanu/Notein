package oOO00Oo;

import java.util.HashMap;
import java.util.Map;
import ooooOoOo.InterfaceC35245OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 implements InterfaceC35245OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f123320OooO00o;

    public class OooO00o extends InheritableThreadLocal<Map<String, String>> {
        @Override // java.lang.InheritableThreadLocal
        public final Map<String, String> childValue(Map<String, String> map) {
            Map<String, String> map2 = map;
            if (map2 == null) {
                return null;
            }
            return new HashMap(map2);
        }
    }

    public OooO0O0() {
        new ThreadLocal();
        this.f123320OooO00o = new OooO00o();
    }

    @Override // ooooOoOo.InterfaceC35245OooO00o
    public final Map<String, String> OooO00o() {
        Map<String, String> map = this.f123320OooO00o.get();
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    @Override // ooooOoOo.InterfaceC35245OooO00o
    public final void OooO0O0(Map<String, String> map) {
        this.f123320OooO00o.set(map != null ? new HashMap(map) : null);
    }

    @Override // ooooOoOo.InterfaceC35245OooO00o
    public final void clear() {
        OooO00o oooO00o = this.f123320OooO00o;
        Map<String, String> map = oooO00o.get();
        if (map != null) {
            map.clear();
            oooO00o.remove();
        }
    }
}
