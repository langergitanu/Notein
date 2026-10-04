package o0ooOO0;

import OoooOOO.C21179OooO0OO;
import OoooOOO.C21183OooO0oO;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o000ooo0.OooO0OO;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O implements OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C21183OooO0oO f112900OooO00o;

    public o00O0O(C21183OooO0oO c21183OooO0oO) {
        this.f112900OooO00o = c21183OooO0oO;
    }

    @Override // o000ooo0.OooO0OO.OooO0O0
    public final Bundle OooO00o() {
        C21183OooO0oO c21183OooO0oO = this.f112900OooO00o;
        LinkedHashMap linkedHashMapOooOOOO = C34444Oooo0O0.OooOOOO(c21183OooO0oO.f61441OooO0O0);
        for (Map.Entry entry : c21183OooO0oO.f61442OooO0OO.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object objInvoke = ((oO0O000o.OooO00o) list.get(0)).invoke();
                if (objInvoke == null) {
                    continue;
                } else {
                    if (!c21183OooO0oO.OooO00o(objInvoke)) {
                        throw new IllegalStateException(C21179OooO0OO.OooO00o(objInvoke).toString());
                    }
                    linkedHashMapOooOOOO.put(str, C34429OooOOo0.OooO0oo(objInvoke));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object objInvoke2 = ((oO0O000o.OooO00o) list.get(i)).invoke();
                    if (objInvoke2 != null && !c21183OooO0oO.OooO00o(objInvoke2)) {
                        throw new IllegalStateException(C21179OooO0OO.OooO00o(objInvoke2).toString());
                    }
                    arrayList.add(objInvoke2);
                }
                linkedHashMapOooOOOO.put(str, arrayList);
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry2 : linkedHashMapOooOOOO.entrySet()) {
            String str2 = (String) entry2.getKey();
            List list2 = (List) entry2.getValue();
            bundle.putParcelableArrayList(str2, list2 instanceof ArrayList ? (ArrayList) list2 : new ArrayList<>(list2));
        }
        return bundle;
    }
}
