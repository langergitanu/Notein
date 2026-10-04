package ooOOO0Oo;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oO00ooO.C32443OooOOO;
import oO0O0O0o.OooOOO;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33478OooO0Oo;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Object f125794OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final LinkedHashMap f125795OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Set<C33477OooO0OO> f125796OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Set<C33479OooO0o> f125797OooO0Oo;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Map] */
    static {
        C33478OooO0Oo c33478OooO0Oo = OooOOO.OooO00o.f117158OooOO0;
        C33477OooO0OO c33477OooO0OOOooO0oO = c33478OooO0Oo.OooO0O0(C33479OooO0o.OooO0o0("name")).OooO0oO();
        kotlin.jvm.internal.OooOOO0.OooO0o(c33477OooO0OOOooO0oO, "child(Name.identifier(name)).toSafe()");
        C32443OooOOO c32443OooOOO = new C32443OooOOO(c33477OooO0OOOooO0oO, C33479OooO0o.OooO0o0("name"));
        C33477OooO0OO c33477OooO0OOOooO0oO2 = c33478OooO0Oo.OooO0O0(C33479OooO0o.OooO0o0("ordinal")).OooO0oO();
        kotlin.jvm.internal.OooOOO0.OooO0o(c33477OooO0OOOooO0oO2, "child(Name.identifier(name)).toSafe()");
        C32443OooOOO c32443OooOOO2 = new C32443OooOOO(c33477OooO0OOOooO0oO2, C33479OooO0o.OooO0o0("ordinal"));
        C32443OooOOO c32443OooOOO3 = new C32443OooOOO(OooOOO.OooO00o.f117177OooOoo0.OooO0OO(C33479OooO0o.OooO0o0("size")), C33479OooO0o.OooO0o0("size"));
        C33477OooO0OO c33477OooO0OO = OooOOO.OooO00o.f117182Oooo000;
        C32443OooOOO c32443OooOOO4 = new C32443OooOOO(c33477OooO0OO.OooO0OO(C33479OooO0o.OooO0o0("size")), C33479OooO0o.OooO0o0("size"));
        C33477OooO0OO c33477OooO0OOOooO0oO3 = OooOOO.OooO00o.f117155OooO0o0.OooO0O0(C33479OooO0o.OooO0o0("length")).OooO0oO();
        kotlin.jvm.internal.OooOOO0.OooO0o(c33477OooO0OOOooO0oO3, "child(Name.identifier(name)).toSafe()");
        Map mapOooO0oo = C34444Oooo0O0.OooO0oo(c32443OooOOO, c32443OooOOO2, c32443OooOOO3, c32443OooOOO4, new C32443OooOOO(c33477OooO0OOOooO0oO3, C33479OooO0o.OooO0o0("length")), new C32443OooOOO(c33477OooO0OO.OooO0OO(C33479OooO0o.OooO0o0(UserMetadata.KEYDATA_FILENAME)), C33479OooO0o.OooO0o0("keySet")), new C32443OooOOO(c33477OooO0OO.OooO0OO(C33479OooO0o.OooO0o0(C18437z2.f56756j)), C33479OooO0o.OooO0o0(C18437z2.f56756j)), new C32443OooOOO(c33477OooO0OO.OooO0OO(C33479OooO0o.OooO0o0(RemoteConfigConstants.ResponseFieldKey.ENTRIES)), C33479OooO0o.OooO0o0("entrySet")));
        f125794OooO00o = mapOooO0oo;
        Set<Map.Entry> setEntrySet = mapOooO0oo.entrySet();
        ArrayList<C32443OooOOO> arrayList = new ArrayList(C34428OooOOo.OooOOoo(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new C32443OooOOO(((C33477OooO0OO) entry.getKey()).OooO0o(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C32443OooOOO c32443OooOOO5 : arrayList) {
            C33479OooO0o c33479OooO0o = (C33479OooO0o) c32443OooOOO5.f116637OooOo;
            Object arrayList2 = linkedHashMap.get(c33479OooO0o);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(c33479OooO0o, arrayList2);
            }
            ((List) arrayList2).add((C33479OooO0o) c32443OooOOO5.f116638OooOo0o);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(oOo000Oo.Oooo0.OooO0Oo(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), oOo000Oo.OooOo.Oooo0((Iterable) entry2.getValue()));
        }
        f125795OooO0O0 = linkedHashMap2;
        Set<C33477OooO0OO> setKeySet = f125794OooO00o.keySet();
        f125796OooO0OO = setKeySet;
        Set<C33477OooO0OO> set = setKeySet;
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C33477OooO0OO) it.next()).OooO0o());
        }
        f125797OooO0Oo = oOo000Oo.OooOo.o0OO00O(arrayList3);
    }
}
