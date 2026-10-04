package o0ooO0oO;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31445OooOOO0;
import o0ooO0Oo.C31447OooOOOo;
import o0ooO0Oo.C31448OooOOo;
import o0ooO0Oo.C31449OooOOo0;
import o0ooO0o.C31455OooO00o;
import o0ooO0o.C31460OooO0o0;
import o0ooOO0o.C31611OooO00o;
import o0ooOoo.InterfaceC31671OooO0OO;

/* JADX INFO: renamed from: o0ooO0oO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31482OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C31611OooO00o f112608OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f112609OooO0O0 = new HashMap();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashSet f112610OooO0OO = new HashSet();

    public C31482OooO00o(C31611OooO00o c31611OooO00o) {
        this.f112608OooO00o = c31611OooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v20, types: [o0ooO0Oo.OooO00o] */
    /* JADX WARN: Type inference failed for: r1v24, types: [o0ooO0Oo.OooO0O0] */
    /* JADX WARN: Type inference failed for: r1v28, types: [o0ooO0Oo.OooO0O0] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, o0ooO0Oo.OooO0O0] */
    /* JADX WARN: Type inference failed for: r1v30, types: [o0ooO0Oo.OooO00o] */
    /* JADX WARN: Type inference failed for: r1v8, types: [o0ooO0Oo.OooO0O0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, o0ooO0Oo.OooO0Oo] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, o0ooO0Oo.OooO0Oo, o0ooO0Oo.OooOOo] */
    public final AbstractC31434OooO0O0 OooO00o(Object obj) throws IOException {
        ?? c31433OooO00o;
        ?? c31436OooO0Oo;
        if (obj == null) {
            return null;
        }
        HashMap map = this.f112609OooO0O0;
        AbstractC31434OooO0O0 abstractC31434OooO0O0 = (AbstractC31434OooO0O0) map.get(obj);
        if (abstractC31434OooO0O0 != null) {
            return abstractC31434OooO0O0;
        }
        boolean z = obj instanceof AbstractC31434OooO0O0;
        HashSet hashSet = this.f112610OooO0OO;
        if (z && hashSet.contains(obj)) {
            return (AbstractC31434OooO0O0) obj;
        }
        if (obj instanceof List) {
            c31433OooO00o = new C31433OooO00o();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c31433OooO00o.OooOooo(OooO00o(it.next()));
            }
        } else if ((obj instanceof InterfaceC31671OooO0OO) && !z) {
            c31433OooO00o = OooO00o(((InterfaceC31671OooO0OO) obj).OooOOo0());
        } else if (obj instanceof C31445OooOOO0) {
            c31433OooO00o = OooO00o(((C31445OooOOO0) obj).f112467OooOo);
        } else if (obj instanceof C31433OooO00o) {
            c31433OooO00o = new C31433OooO00o();
            C31433OooO00o c31433OooO00o2 = (C31433OooO00o) obj;
            for (int i = 0; i < c31433OooO00o2.f112214OooOo.size(); i++) {
                c31433OooO00o.OooOooo(OooO00o(c31433OooO00o2.Oooo0(i)));
            }
        } else {
            if (obj instanceof C31448OooOOo) {
                C31448OooOOo c31448OooOOo = (C31448OooOOo) obj;
                c31436OooO0Oo = this.f112608OooO00o.f113008OooOo0o.OooOooo();
                C31449OooOOo0 c31449OooOOo0O000o0O0 = c31436OooO0Oo.o000o0O0();
                C31460OooO0o0 c31460OooO0o0Oooo00o = c31448OooOOo.oooo00o();
                C31455OooO00o.OooO0OO(c31460OooO0o0Oooo00o, c31449OooOOo0O000o0O0);
                c31460OooO0o0Oooo00o.close();
                c31449OooOOo0O000o0O0.close();
                map.put(obj, c31436OooO0Oo);
                for (Map.Entry entry : c31448OooOOo.f112222OooOoO0.entrySet()) {
                    c31436OooO0Oo.o000OoOO((C31441OooOO0) entry.getKey(), OooO00o(entry.getValue()));
                }
            } else if (obj instanceof C31436OooO0Oo) {
                c31436OooO0Oo = new C31436OooO0Oo();
                map.put(obj, c31436OooO0Oo);
                for (Map.Entry entry2 : ((C31436OooO0Oo) obj).f112222OooOoO0.entrySet()) {
                    c31436OooO0Oo.o000OoOO((C31441OooOO0) entry2.getKey(), OooO00o(entry2.getValue()));
                }
            } else {
                c31433OooO00o = (AbstractC31434OooO0O0) obj;
            }
            c31433OooO00o = c31436OooO0Oo;
        }
        map.put(obj, c31433OooO00o);
        hashSet.add(c31433OooO00o);
        return c31433OooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o0ooO0Oo.OooO0O0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [o0ooO0Oo.OooO0O0] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, o0ooO0Oo.OooO0Oo, o0ooO0Oo.OooOOo] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    public final void OooO0O0(InterfaceC31671OooO0OO interfaceC31671OooO0OO, InterfaceC31671OooO0OO interfaceC31671OooO0OO2) throws IOException {
        if (interfaceC31671OooO0OO == null || interfaceC31671OooO0OO == interfaceC31671OooO0OO2) {
            return;
        }
        HashMap map = this.f112609OooO0O0;
        ?? OooOooo2 = (AbstractC31434OooO0O0) map.get(interfaceC31671OooO0OO);
        if (OooOooo2 != 0) {
            return;
        }
        if (!(interfaceC31671OooO0OO instanceof AbstractC31434OooO0O0)) {
            OooO0O0(interfaceC31671OooO0OO.OooOOo0(), interfaceC31671OooO0OO2.OooOOo0());
        } else if (interfaceC31671OooO0OO instanceof C31445OooOOO0) {
            if (interfaceC31671OooO0OO2 instanceof C31445OooOOO0) {
                OooO0O0(((C31445OooOOO0) interfaceC31671OooO0OO).f112467OooOo, ((C31445OooOOO0) interfaceC31671OooO0OO2).f112467OooOo);
            } else if ((interfaceC31671OooO0OO2 instanceof C31436OooO0Oo) || (interfaceC31671OooO0OO2 instanceof C31433OooO00o)) {
                OooO0O0(((C31445OooOOO0) interfaceC31671OooO0OO).f112467OooOo, interfaceC31671OooO0OO2);
            }
        } else if (interfaceC31671OooO0OO instanceof C31433OooO00o) {
            if (interfaceC31671OooO0OO2 instanceof C31445OooOOO0) {
                OooO0O0(interfaceC31671OooO0OO, ((C31445OooOOO0) interfaceC31671OooO0OO2).f112467OooOo);
            } else {
                C31433OooO00o c31433OooO00o = (C31433OooO00o) interfaceC31671OooO0OO;
                for (int i = 0; i < c31433OooO00o.f112214OooOo.size(); i++) {
                    ((C31433OooO00o) interfaceC31671OooO0OO2).OooOooo(OooO00o(c31433OooO00o.Oooo0(i)));
                }
            }
        } else if (interfaceC31671OooO0OO instanceof C31448OooOOo) {
            C31448OooOOo c31448OooOOo = (C31448OooOOo) interfaceC31671OooO0OO;
            OooOooo2 = this.f112608OooO00o.f113008OooOo0o.OooOooo();
            C31447OooOOOo c31447OooOOOoO000o00o = OooOooo2.o000o00o(c31448OooOOo.o0000O0O(C31441OooOO0.f112295o0000OOo));
            C31455OooO00o.OooO0OO(c31448OooOOo.o000o00O(), c31447OooOOOoO000o00o);
            c31447OooOOOoO000o00o.close();
            map.put(interfaceC31671OooO0OO, OooOooo2);
            for (Map.Entry entry : c31448OooOOo.f112222OooOoO0.entrySet()) {
                OooOooo2.o000OoOO((C31441OooOO0) entry.getKey(), OooO00o(entry.getValue()));
            }
        } else if (!(interfaceC31671OooO0OO instanceof C31436OooO0Oo)) {
            OooOooo2 = (AbstractC31434OooO0O0) interfaceC31671OooO0OO;
        } else if (interfaceC31671OooO0OO2 instanceof C31445OooOOO0) {
            OooO0O0(interfaceC31671OooO0OO, ((C31445OooOOO0) interfaceC31671OooO0OO2).f112467OooOo);
        } else {
            map.put(interfaceC31671OooO0OO, OooOooo2);
            for (Map.Entry entry2 : ((C31436OooO0Oo) interfaceC31671OooO0OO).f112222OooOoO0.entrySet()) {
                C31441OooOO0 c31441OooOO0 = (C31441OooOO0) entry2.getKey();
                AbstractC31434OooO0O0 abstractC31434OooO0O0 = (AbstractC31434OooO0O0) entry2.getValue();
                C31436OooO0Oo c31436OooO0Oo = (C31436OooO0Oo) interfaceC31671OooO0OO2;
                if (c31436OooO0Oo.o0OoO0o(c31441OooOO0) != null) {
                    OooO0O0(abstractC31434OooO0O0, c31436OooO0Oo.o0OoO0o(c31441OooOO0));
                } else {
                    c31436OooO0Oo.o000OoOO(c31441OooOO0, OooO00o(abstractC31434OooO0O0));
                }
            }
        }
        map.put(interfaceC31671OooO0OO, OooOooo2);
        this.f112610OooO0OO.add(OooOooo2);
    }
}
