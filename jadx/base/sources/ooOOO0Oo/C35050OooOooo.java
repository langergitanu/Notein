package ooOOO0Oo;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0Ooo0.C33361OooO0Oo;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33480OooO0o0;

/* JADX INFO: renamed from: ooOOO0Oo.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35050OooOooo<T> implements InterfaceC35049OooOooO<T> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f125870OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C33361OooO0Oo.OooOO0 f125871OooO0OO = new C33361OooO0Oo("Java nullability annotation states").OooO0o0(new OooO00o(this));

    /* JADX INFO: renamed from: ooOOO0Oo.OooOooo$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C33477OooO0OO, T> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C35050OooOooo<T> f125872OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C35050OooOooo<T> c35050OooOooo) {
            super(1);
            this.f125872OooOo0o = c35050OooOooo;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Object invoke(C33477OooO0OO c33477OooO0OO) {
            T next;
            C33477OooO0OO it = c33477OooO0OO;
            kotlin.jvm.internal.OooOOO0.OooO0o(it, "it");
            ?? r0 = this.f125872OooOo0o.f125870OooO0O0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = r0.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                C33477OooO0OO packageName = (C33477OooO0OO) entry.getKey();
                if (!it.equals(packageName)) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(packageName, "packageName");
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(it.OooO0Oo() ? null : it.OooO0o0(), packageName)) {
                    }
                }
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            if (linkedHashMap.isEmpty()) {
                linkedHashMap = null;
            }
            if (linkedHashMap != null) {
                Iterator<T> it3 = linkedHashMap.entrySet().iterator();
                if (it3.hasNext()) {
                    next = it3.next();
                    if (it3.hasNext()) {
                        int length = C33480OooO0o0.OooO00o((C33477OooO0OO) ((Map.Entry) next).getKey(), it).OooO0O0().length();
                        do {
                            T next2 = it3.next();
                            int length2 = C33480OooO0o0.OooO00o((C33477OooO0OO) ((Map.Entry) next2).getKey(), it).OooO0O0().length();
                            if (length > length2) {
                                next = next2;
                                length = length2;
                            }
                        } while (it3.hasNext());
                    }
                } else {
                    next = null;
                }
                Map.Entry entry2 = (Map.Entry) next;
                if (entry2 != null) {
                    return entry2.getValue();
                }
            }
            return null;
        }
    }

    public C35050OooOooo(Map<C33477OooO0OO, ? extends T> map) {
        this.f125870OooO0O0 = map;
    }
}
