package ooOOoOO0;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o000OO00.C24452OooO0o0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o.OooOOO0;
import oO0o0ooO.C33917OooOO0;
import oOo00O0O.AbstractC34457OooO0OO;
import ooOOoOO0.OooOOO;

/* JADX INFO: renamed from: ooOOoOO0.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35129OooOo0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooOOO.OooO00o<Map<String, Integer>> f126137OooO00o = new OooOOO.OooO00o<>();

    public static final int OooO00o(InterfaceC33531OooO0o0 interfaceC33531OooO0o0, AbstractC34457OooO0OO json, String name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33531OooO0o0, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(json, "json");
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        OooO0OO(interfaceC33531OooO0o0, json);
        int iOooO0OO = interfaceC33531OooO0o0.OooO0OO(name);
        if (iOooO0OO != -3 || !json.f123491OooO00o.f123511OooO) {
            return iOooO0OO;
        }
        OooOOO.OooO00o<Map<String, Integer>> oooO00o = f126137OooO00o;
        C24452OooO0o0 c24452OooO0o0 = new C24452OooO0o0(2, interfaceC33531OooO0o0, json);
        OooOOO oooOOO = json.f123493OooO0OO;
        oooOOO.getClass();
        Object objOooO00o = oooOOO.OooO00o(interfaceC33531OooO0o0, oooO00o);
        if (objOooO00o == null) {
            objOooO00o = c24452OooO0o0.invoke();
            ConcurrentHashMap concurrentHashMap = oooOOO.f126122OooO00o;
            Object concurrentHashMap2 = concurrentHashMap.get(interfaceC33531OooO0o0);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(interfaceC33531OooO0o0, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(oooO00o, objOooO00o);
        }
        Integer num = (Integer) ((Map) objOooO00o).get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int OooO0O0(InterfaceC33531OooO0o0 interfaceC33531OooO0o0, AbstractC34457OooO0OO json, String name, String suffix) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33531OooO0o0, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(json, "json");
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(suffix, "suffix");
        int iOooO00o = OooO00o(interfaceC33531OooO0o0, json, name);
        if (iOooO00o != -3) {
            return iOooO00o;
        }
        throw new C33917OooOO0(interfaceC33531OooO0o0.OooO0oo() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static final void OooO0OO(InterfaceC33531OooO0o0 interfaceC33531OooO0o0, AbstractC34457OooO0OO json) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33531OooO0o0, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(json, "json");
        kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC33531OooO0o0.getKind(), OooOOO0.OooO00o.f121132OooO00o);
    }
}
