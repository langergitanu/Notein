package oO0OooO0;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.Oooo0;

/* JADX INFO: renamed from: oO0OooO0.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33483OooOO0 {
    static {
        new C33477OooO0OO("java.lang").OooO0OO(C33479OooO0o.OooO0o0("annotation"));
    }

    public static final C33476OooO0O0 OooO00o(String str) {
        C33477OooO0OO c33477OooO0OO = C33474OooO.f120945OooO00o;
        return new C33476OooO0O0(C33474OooO.f120945OooO00o, C33479OooO0o.OooO0o0(str));
    }

    public static final C33476OooO0O0 OooO0O0(String str) {
        C33477OooO0OO c33477OooO0OO = C33474OooO.f120945OooO00o;
        return new C33476OooO0O0(C33474OooO.f120947OooO0OO, C33479OooO0o.OooO0o0(str));
    }

    public static final LinkedHashMap OooO0OO(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iOooO0Oo = Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(setEntrySet, 10));
        if (iOooO0Oo < 16) {
            iOooO0Oo = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iOooO0Oo);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
        return linkedHashMap2;
    }

    public static final C33476OooO0O0 OooO0Oo(C33479OooO0o c33479OooO0o) {
        C33477OooO0OO c33477OooO0OO = C33474OooO.f120945OooO00o;
        C33476OooO0O0 c33476OooO0O0 = C33474OooO.f120944OooO;
        return new C33476OooO0O0(c33476OooO0O0.OooO0oO(), C33479OooO0o.OooO0o0(c33479OooO0o.OooO0OO().concat(c33476OooO0O0.OooO().OooO0OO())));
    }

    public static final C33476OooO0O0 OooO0o(C33476OooO0O0 c33476OooO0O0) {
        C33477OooO0OO c33477OooO0OO = C33474OooO.f120945OooO00o;
        return new C33476OooO0O0(C33474OooO.f120945OooO00o, C33479OooO0o.OooO0o0("U".concat(c33476OooO0O0.OooO().OooO0OO())));
    }

    public static final C33476OooO0O0 OooO0o0(String str) {
        C33477OooO0OO c33477OooO0OO = C33474OooO.f120945OooO00o;
        return new C33476OooO0O0(C33474OooO.f120946OooO0O0, C33479OooO0o.OooO0o0(str));
    }
}
