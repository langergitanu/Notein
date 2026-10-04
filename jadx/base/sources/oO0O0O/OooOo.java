package oO0O0O;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.AbstractC33344OoooOoo;
import oO0Ooo.C33343OoooOoO;
import oO0o000.C33538OooO0OO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOo {
    public static final C33343OoooOoO OooO00o(InterfaceC32596OooO0o0 from, InterfaceC32596OooO0o0 to) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(from, "from");
        kotlin.jvm.internal.OooOOO0.OooO0oO(to, "to");
        from.OooOOOO().size();
        to.OooOOOO().size();
        AbstractC33344OoooOoo.OooO00o oooO00o = AbstractC33344OoooOoo.f120613OooO0O0;
        List<InterfaceC32637OoooOoo> listOooOOOO = from.OooOOOO();
        kotlin.jvm.internal.OooOOO0.OooO0o(listOooOOOO, "from.declaredTypeParameters");
        List<InterfaceC32637OoooOoo> list = listOooOOOO;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC32637OoooOoo) it.next()).OooO());
        }
        List<InterfaceC32637OoooOoo> listOooOOOO2 = to.OooOOOO();
        kotlin.jvm.internal.OooOOO0.OooO0o(listOooOOOO2, "to.declaredTypeParameters");
        List<InterfaceC32637OoooOoo> list2 = listOooOOOO2;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooOOO = ((InterfaceC32637OoooOoo) it2.next()).OooOOO();
            kotlin.jvm.internal.OooOOO0.OooO0o(abstractC33328Oooo0O0OooOOO, "it.defaultType");
            arrayList2.add(C33538OooO0OO.OooO00o(abstractC33328Oooo0O0OooOOO));
        }
        return new C33343OoooOoO(C34444Oooo0O0.OooOO0o(oOo000Oo.OooOo.o000OOo(arrayList, arrayList2)));
    }
}
