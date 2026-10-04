package OoooOOO;

import OoooOOO.C21180OooO0Oo;
import OoooOOO.InterfaceC21182OooO0o0;
import io.ktor.utils.p616io.Oooo000;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import o0ooOO0.o00Oo0;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: OoooOOO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21183OooO0oO implements InterfaceC21182OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Oo0 f61440OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LinkedHashMap f61441OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LinkedHashMap f61442OooO0OO;

    public C21183OooO0oO(LinkedHashMap linkedHashMap, o00Oo0 o00oo02) {
        this.f61440OooO00o = o00oo02;
        this.f61441OooO0O0 = linkedHashMap != null ? C34444Oooo0O0.OooOOOO(linkedHashMap) : new LinkedHashMap();
        this.f61442OooO0OO = new LinkedHashMap();
    }

    @Override // OoooOOO.InterfaceC21182OooO0o0
    public final boolean OooO00o(Object obj) {
        return ((Boolean) this.f61440OooO00o.invoke(obj)).booleanValue();
    }

    @Override // OoooOOO.InterfaceC21182OooO0o0
    public final InterfaceC21182OooO0o0.OooO00o OooO0O0(String str, C21180OooO0Oo.OooO00o oooO00o) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Oooo000.OooO0o0(str.charAt(i))) {
                LinkedHashMap linkedHashMap = this.f61442OooO0OO;
                Object arrayList = linkedHashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(str, arrayList);
                }
                ((List) arrayList).add(oooO00o);
                return new C21181OooO0o(this, str, oooO00o);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }

    @Override // OoooOOO.InterfaceC21182OooO0o0
    public final Object OooO0OO(String str) {
        LinkedHashMap linkedHashMap = this.f61441OooO0O0;
        List list = (List) linkedHashMap.remove(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
            linkedHashMap.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }
}
