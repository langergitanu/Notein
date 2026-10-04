package oO0Oo0o0;

import Oooo0.OooOo00;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import oO0O0OO.InterfaceC32609OooOo0;
import oO0OOOo.C32995OooOOO0;
import oO0Oo0o0.OooOOO0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: oO0Oo0o0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33217OooO0o0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<List<? extends oO0O0OO.OooOO0O>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC33218OooO0oO f120213OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33217OooO0o0(AbstractC33218OooO0oO abstractC33218OooO0oO) {
        super(0);
        this.f120213OooOo0o = abstractC33218OooO0oO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [oOo000Oo.OooOoO] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
    @Override // oO0O000o.OooO00o
    public final List<? extends oO0O0OO.OooOO0O> invoke() {
        ?? arrayList;
        AbstractC33218OooO0oO abstractC33218OooO0oO = this.f120213OooOo0o;
        List<InterfaceC32609OooOo0> listOooO0oo = abstractC33218OooO0oO.OooO0oo();
        List<InterfaceC32609OooOo0> list = listOooO0oo;
        ArrayList arrayList2 = new ArrayList(3);
        Collection<AbstractC33320OooOoo> collectionOooO0Oo = abstractC33218OooO0oO.f120215OooO0O0.OooO().OooO0Oo();
        kotlin.jvm.internal.OooOOO0.OooO0o(collectionOooO0Oo, "containingClass.typeConstructor.supertypes");
        ArrayList arrayList3 = new ArrayList();
        Iterator it = collectionOooO0Oo.iterator();
        while (it.hasNext()) {
            C34431OooOo0.OooOo0o(arrayList3, OooOOO0.OooO00o.OooO00o(((AbstractC33320OooOoo) it.next()).OooOOO0(), null, 3));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (obj instanceof oO0O0OO.OooO0O0) {
                arrayList4.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList4) {
            C33479OooO0o name = ((oO0O0OO.OooO0O0) obj2).getName();
            Object arrayList5 = linkedHashMap.get(name);
            if (arrayList5 == null) {
                arrayList5 = new ArrayList();
                linkedHashMap.put(name, arrayList5);
            }
            ((List) arrayList5).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C33479OooO0o c33479OooO0o = (C33479OooO0o) entry.getKey();
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                Boolean boolValueOf = Boolean.valueOf(((oO0O0OO.OooO0O0) obj3) instanceof InterfaceC32609OooOo0);
                Object arrayList6 = linkedHashMap2.get(boolValueOf);
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                    linkedHashMap2.put(boolValueOf, arrayList6);
                }
                ((List) arrayList6).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                C32995OooOOO0 c32995OooOOO0 = C32995OooOOO0.f119372OooO0o0;
                List list4 = list3;
                if (zBooleanValue) {
                    arrayList = new ArrayList();
                    for (Object obj4 : listOooO0oo) {
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((InterfaceC32609OooOo0) obj4).getName(), c33479OooO0o)) {
                            arrayList.add(obj4);
                        }
                    }
                } else {
                    arrayList = C34434OooOoO.f123453OooOo0o;
                }
                c32995OooOOO0.OooO0oo(c33479OooO0o, list4, (Collection) arrayList, abstractC33218OooO0oO.f120215OooO0O0, new OooO0o(arrayList2, abstractC33218OooO0oO));
            }
        }
        return OooOo.OooooOO(list, OooOo00.OooOO0O(arrayList2));
    }
}
