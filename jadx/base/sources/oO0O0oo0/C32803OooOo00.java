package oO0O0oo0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32632OoooOO0;
import oO0OOOo.C32998OooOOo;
import oO0Ooo0.C33361OooO0Oo;
import oO0OooO0.C33479OooO0o;
import oOo00OOo.C34499OooO0oO;

/* JADX INFO: renamed from: oO0O0oo0.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32803OooOo00 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C33479OooO0o, Collection<? extends InterfaceC32632OoooOO0>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC32796OooOOOO f117868OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32803OooOo00(AbstractC32796OooOOOO abstractC32796OooOOOO) {
        super(1);
        this.f117868OooOo0o = abstractC32796OooOOOO;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Collection<? extends InterfaceC32632OoooOO0> invoke(C33479OooO0o c33479OooO0o) {
        C33479OooO0o name = c33479OooO0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        AbstractC32796OooOOOO abstractC32796OooOOOO = this.f117868OooOo0o;
        LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) ((C33361OooO0Oo.OooOO0O) abstractC32796OooOOOO.f117849OooO0o).invoke(name));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : linkedHashSet) {
            String strOooO00o = ooo0o.OooOo00.OooO00o((InterfaceC32632OoooOO0) obj, 2);
            Object arrayList = linkedHashMap.get(strOooO00o);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strOooO00o, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                List list2 = list;
                Collection collectionOooO00o = C32998OooOOo.OooO00o(list2, C32801OooOo.f117866OooOo0o);
                linkedHashSet.removeAll(list2);
                linkedHashSet.addAll(collectionOooO00o);
            }
        }
        abstractC32796OooOOOO.OooOOO0(linkedHashSet, name);
        C34499OooO0oO c34499OooO0oO = abstractC32796OooOOOO.f117846OooO0O0;
        return oOo000Oo.OooOo.o0ooOO0(c34499OooO0oO.f123639OooO00o.f123621OooOOo.OooO0OO(c34499OooO0oO, linkedHashSet));
    }
}
