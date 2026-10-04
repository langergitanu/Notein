package oO0O0O0o;

import Oooo0.OooOo00;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o00OO0o0.C24999OooO0OO;
import oO00ooO.C32443OooOOO;
import oO0O0O0o.OooOOO;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0o.EnumC32713OooO0OO;
import oO0OOo.AbstractC33038OooO0oO;
import oO0OOo.C33047OooOo0o;
import oO0Oo00.C33194OooO0O0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.C33322OooOooO;
import oO0Ooo.InterfaceC33348OooooOO;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33478OooO0Oo;
import oO0OooO0.C33479OooO0o;
import oO0o000.C33538OooO0OO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.OooOo;
import oOo000Oo.Oooo0;
import oOo0oooO.C34589OooO0oo;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o {
    public static final boolean OooO(AbstractC33320OooOoo abstractC33320OooOoo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC33320OooOoo, "<this>");
        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = abstractC33320OooOoo.o00000().OooO0OO();
        return (interfaceC32598OooO0ooOooO0OO != null ? OooO0o0(interfaceC32598OooO0ooOooO0OO) : null) == EnumC32713OooO0OO.f117631OooOoOO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int OooO00o(AbstractC33320OooOoo abstractC33320OooOoo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC33320OooOoo, "<this>");
        oOo0oooO.OooO0OO oooO0OOOooOOO0 = abstractC33320OooOoo.getAnnotations().OooOOO0(OooOOO.OooO00o.f117166OooOOo0);
        if (oooO0OOOooOOO0 == null) {
            return 0;
        }
        AbstractC33038OooO0oO abstractC33038OooO0oO = (AbstractC33038OooO0oO) C34444Oooo0O0.OooO0oO(OooOOO.f117137OooO0Oo, oooO0OOOooOOO0.OooO0O0());
        kotlin.jvm.internal.OooOOO0.OooO0o0(abstractC33038OooO0oO, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((oO0OOo.OooOOO) abstractC33038OooO0oO).f119483OooO00o).intValue();
    }

    public static final AbstractC33328Oooo0O0 OooO0O0(OooOO0 oooOO02, InterfaceC34588OooO0oO interfaceC34588OooO0oO, AbstractC33320OooOoo abstractC33320OooOoo, List list, ArrayList arrayList, AbstractC33320OooOoo abstractC33320OooOoo2, boolean z) {
        InterfaceC32596OooO0o0 interfaceC32596OooO0o0OooOO0;
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (abstractC33320OooOoo != null ? 1 : 0) + 1);
        List list2 = list;
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList3.add(C33538OooO0OO.OooO00o((AbstractC33320OooOoo) it.next()));
        }
        arrayList2.addAll(arrayList3);
        OooOo00.OooOO0(arrayList2, abstractC33320OooOoo != null ? C33538OooO0OO.OooO00o(abstractC33320OooOoo) : null);
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (true) {
            boolean zHasNext = it2.hasNext();
            InterfaceC34588OooO0oO c34589OooO0oo = InterfaceC34588OooO0oO.OooO00o.f123919OooO00o;
            if (!zHasNext) {
                arrayList2.add(C33538OooO0OO.OooO00o(abstractC33320OooOoo2));
                int size = list.size() + arrayList.size() + (abstractC33320OooOoo == null ? 0 : 1);
                if (z) {
                    interfaceC32596OooO0o0OooOO0 = oooOO02.OooOo0(size);
                } else {
                    C33479OooO0o c33479OooO0o = OooOOO.f117134OooO00o;
                    interfaceC32596OooO0o0OooOO0 = oooOO02.OooOO0("Function" + size);
                }
                if (abstractC33320OooOoo != null) {
                    C33477OooO0OO c33477OooO0OO = OooOOO.OooO00o.f117164OooOOOo;
                    if (!interfaceC34588OooO0oO.Oooo000(c33477OooO0OO)) {
                        ArrayList arrayListOooooO0 = OooOo.OooooO0(interfaceC34588OooO0oO, new oOo0oooO.OooO(oooOO02, c33477OooO0OO, C34436OooOoOO.f123455OooOo0o));
                        interfaceC34588OooO0oO = arrayListOooooO0.isEmpty() ? c34589OooO0oo : new C34589OooO0oo(arrayListOooooO0);
                    }
                }
                if (!list.isEmpty()) {
                    int size2 = list.size();
                    C33477OooO0OO c33477OooO0OO2 = OooOOO.OooO00o.f117166OooOOo0;
                    if (!interfaceC34588OooO0oO.Oooo000(c33477OooO0OO2)) {
                        ArrayList arrayListOooooO02 = OooOo.OooooO0(interfaceC34588OooO0oO, new oOo0oooO.OooO(oooOO02, c33477OooO0OO2, Oooo0.OooO0o0(new C32443OooOOO(OooOOO.f117137OooO0Oo, new oO0OOo.OooOOO(size2)))));
                        if (!arrayListOooooO02.isEmpty()) {
                            c34589OooO0oo = new C34589OooO0oo(arrayListOooooO02);
                        }
                        interfaceC34588OooO0oO = c34589OooO0oo;
                    }
                }
                return C33322OooOooO.OooO0Oo(C24999OooO0OO.OooO0o0(interfaceC34588OooO0oO), interfaceC32596OooO0o0OooOO0, arrayList2);
            }
            Object next = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            arrayList2.add(C33538OooO0OO.OooO00o((AbstractC33320OooOoo) next));
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C33479OooO0o OooO0OO(AbstractC33320OooOoo abstractC33320OooOoo) {
        String str;
        oOo0oooO.OooO0OO oooO0OOOooOOO0 = abstractC33320OooOoo.getAnnotations().OooOOO0(OooOOO.OooO00o.f117165OooOOo);
        if (oooO0OOOooOOO0 != null) {
            Object objOoooooo = OooOo.Ooooooo(oooO0OOOooOOO0.OooO0O0().values());
            C33047OooOo0o c33047OooOo0o = objOoooooo instanceof C33047OooOo0o ? (C33047OooOo0o) objOoooooo : null;
            if (c33047OooOo0o != null && (str = (String) c33047OooOo0o.f119483OooO00o) != null) {
                if (!C33479OooO0o.OooO0o(str)) {
                    str = null;
                }
                if (str != null) {
                    return C33479OooO0o.OooO0o0(str);
                }
            }
        }
        return null;
    }

    public static final List<AbstractC33320OooOoo> OooO0Oo(AbstractC33320OooOoo abstractC33320OooOoo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC33320OooOoo, "<this>");
        OooO0oo(abstractC33320OooOoo);
        int iOooO00o = OooO00o(abstractC33320OooOoo);
        if (iOooO00o == 0) {
            return C34434OooOoO.f123453OooOo0o;
        }
        List<InterfaceC33348OooooOO> listSubList = abstractC33320OooOoo.o000000O().subList(0, iOooO00o);
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listSubList, 10));
        Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            AbstractC33320OooOoo type = ((InterfaceC33348OooooOO) it.next()).getType();
            kotlin.jvm.internal.OooOOO0.OooO0o(type, "it.type");
            arrayList.add(type);
        }
        return arrayList;
    }

    public static final AbstractC33320OooOoo OooO0o(AbstractC33320OooOoo abstractC33320OooOoo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC33320OooOoo, "<this>");
        OooO0oo(abstractC33320OooOoo);
        if (abstractC33320OooOoo.getAnnotations().OooOOO0(OooOOO.OooO00o.f117164OooOOOo) == null) {
            return null;
        }
        return abstractC33320OooOoo.o000000O().get(OooO00o(abstractC33320OooOoo)).getType();
    }

    public static final EnumC32713OooO0OO OooO0o0(InterfaceC32598OooO0oo interfaceC32598OooO0oo) {
        if (!(interfaceC32598OooO0oo instanceof InterfaceC32596OooO0o0) || !OooOO0.Oooo0(interfaceC32598OooO0oo)) {
            return null;
        }
        C33478OooO0Oo c33478OooO0OoOooO0oo = C33194OooO0O0.OooO0oo(interfaceC32598OooO0oo);
        if (!c33478OooO0OoOooO0oo.OooO0Oo() || c33478OooO0OoOooO0oo.f120976OooO00o.isEmpty()) {
            return null;
        }
        EnumC32713OooO0OO.OooO00o oooO00o = EnumC32713OooO0OO.f117630OooOoO0;
        String strOooO0O0 = c33478OooO0OoOooO0oo.OooO0o().OooO0O0();
        kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0O0, "shortName().asString()");
        C33477OooO0OO c33477OooO0OOOooO0o0 = c33478OooO0OoOooO0oo.OooO0oO().OooO0o0();
        kotlin.jvm.internal.OooOOO0.OooO0o(c33477OooO0OOOooO0o0, "toSafe().parent()");
        oooO00o.getClass();
        EnumC32713OooO0OO.OooO00o.C20251OooO00o c20251OooO00oOooO00o = EnumC32713OooO0OO.OooO00o.OooO00o(strOooO0O0, c33477OooO0OOOooO0o0);
        if (c20251OooO00oOooO00o != null) {
            return c20251OooO00oOooO00o.f117637OooO00o;
        }
        return null;
    }

    public static final List<InterfaceC33348OooooOO> OooO0oO(AbstractC33320OooOoo abstractC33320OooOoo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC33320OooOoo, "<this>");
        OooO0oo(abstractC33320OooOoo);
        List<InterfaceC33348OooooOO> listO000000O = abstractC33320OooOoo.o000000O();
        return listO000000O.subList(((!OooO0oo(abstractC33320OooOoo) || abstractC33320OooOoo.getAnnotations().OooOOO0(OooOOO.OooO00o.f117164OooOOOo) == null) ? 0 : 1) + OooO00o(abstractC33320OooOoo), listO000000O.size() - 1);
    }

    public static final boolean OooO0oo(AbstractC33320OooOoo abstractC33320OooOoo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC33320OooOoo, "<this>");
        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = abstractC33320OooOoo.o00000().OooO0OO();
        if (interfaceC32598OooO0ooOooO0OO == null) {
            return false;
        }
        EnumC32713OooO0OO enumC32713OooO0OOOooO0o0 = OooO0o0(interfaceC32598OooO0ooOooO0OO);
        return enumC32713OooO0OOOooO0o0 == EnumC32713OooO0OO.f117629OooOoO || enumC32713OooO0OOOooO0o0 == EnumC32713OooO0OO.f117631OooOoOO;
    }
}
