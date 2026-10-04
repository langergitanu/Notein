package oO0o000;

import Oooo0oO.C21091o0000o;
import com.aspose.slides.C22220Oooo00o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.OooOOO0;
import o00OO0o0.C24999OooO0OO;
import oO00ooO.C32442OooOO0o;
import oO0O0O0o.OooOO0;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0O0OO.OooO;
import oO0O0OO.OooO0o;
import oO0Ooo.AbstractC33316OooOo0o;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.AbstractC33354o00o0O;
import oO0Ooo.C33322OooOooO;
import oO0Ooo.C33325Oooo;
import oO0Ooo.C33351Oooooo0;
import oO0Ooo.C33353Ooooooo;
import oO0Ooo.InterfaceC33342OoooOo0;
import oO0Ooo.InterfaceC33348OooooOO;
import oO0Ooo.o00Oo0;
import oO0OooO.InterfaceC33454OooO0Oo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34437OooOoo;
import oOo000Oo.C34440OooOooo;
import oOo000Oo.OooOo;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0o000.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33538OooO0OO {
    public static final AbstractC33354o00o0O OooO(AbstractC33320OooOoo abstractC33320OooOoo) {
        OooOOO0.OooO0oO(abstractC33320OooOoo, "<this>");
        AbstractC33354o00o0O abstractC33354o00o0OOooO0oo = o00Oo0.OooO0oo(abstractC33320OooOoo, true);
        OooOOO0.OooO0o(abstractC33354o00o0OOooO0oo, "makeNullable(this)");
        return abstractC33354o00o0OOooO0oo;
    }

    public static final C33351Oooooo0 OooO00o(AbstractC33320OooOoo abstractC33320OooOoo) {
        OooOOO0.OooO0oO(abstractC33320OooOoo, "<this>");
        return new C33351Oooooo0(1, abstractC33320OooOoo);
    }

    public static final boolean OooO0O0(AbstractC33320OooOoo abstractC33320OooOoo, InterfaceC33342OoooOo0 interfaceC33342OoooOo0, Set<? extends InterfaceC32637OoooOoo> set) {
        boolean zOooO0O0;
        if (OooOOO0.OooO0O0(abstractC33320OooOoo.o00000(), interfaceC33342OoooOo0)) {
            return true;
        }
        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = abstractC33320OooOoo.o00000().OooO0OO();
        OooO oooO = interfaceC32598OooO0ooOooO0OO instanceof OooO ? (OooO) interfaceC32598OooO0ooOooO0OO : null;
        List<InterfaceC32637OoooOoo> listOooOOOO = oooO != null ? oooO.OooOOOO() : null;
        Iterable iterableO0O0O00 = OooOo.o0O0O00(abstractC33320OooOoo.o000000O());
        if (!(iterableO0O0O00 instanceof Collection) || !((Collection) iterableO0O0O00).isEmpty()) {
            Iterator it = iterableO0O0O00.iterator();
            do {
                C34440OooOooo c34440OooOooo = (C34440OooOooo) it;
                if (c34440OooOooo.f123461OooOo0o.hasNext()) {
                    C34437OooOoo c34437OooOoo = (C34437OooOoo) c34440OooOooo.next();
                    int i = c34437OooOoo.f123456OooO00o;
                    InterfaceC33348OooooOO interfaceC33348OooooOO = (InterfaceC33348OooooOO) c34437OooOoo.f123457OooO0O0;
                    InterfaceC32637OoooOoo interfaceC32637OoooOoo = listOooOOOO != null ? (InterfaceC32637OoooOoo) OooOo.OoooO00(i, listOooOOOO) : null;
                    if ((interfaceC32637OoooOoo == null || set == null || !set.contains(interfaceC32637OoooOoo)) && !interfaceC33348OooooOO.OooO00o()) {
                        AbstractC33320OooOoo type = interfaceC33348OooooOO.getType();
                        OooOOO0.OooO0o(type, "argument.type");
                        zOooO0O0 = OooO0O0(type, interfaceC33342OoooOo0, set);
                    } else {
                        zOooO0O0 = false;
                    }
                }
            } while (!zOooO0O0);
            return true;
        }
        return false;
    }

    public static final C33351Oooooo0 OooO0OO(AbstractC33320OooOoo type, int i, InterfaceC32637OoooOoo interfaceC32637OoooOoo) {
        OooOOO0.OooO0oO(type, "type");
        C22220Oooo00o.OooO0OO(i, "projectionKind");
        if ((interfaceC32637OoooOoo != null ? interfaceC32637OoooOoo.OooOo0() : 0) == i) {
            i = 1;
        }
        return new C33351Oooooo0(i, type);
    }

    public static final void OooO0Oo(AbstractC33320OooOoo abstractC33320OooOoo, AbstractC33328Oooo0O0 abstractC33328Oooo0O0, LinkedHashSet linkedHashSet, Set set) {
        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = abstractC33320OooOoo.o00000().OooO0OO();
        if (interfaceC32598OooO0ooOooO0OO instanceof InterfaceC32637OoooOoo) {
            if (!OooOOO0.OooO0O0(abstractC33320OooOoo.o00000(), abstractC33328Oooo0O0.o00000())) {
                linkedHashSet.add(interfaceC32598OooO0ooOooO0OO);
                return;
            }
            for (AbstractC33320OooOoo upperBound : ((InterfaceC32637OoooOoo) interfaceC32598OooO0ooOooO0OO).getUpperBounds()) {
                OooOOO0.OooO0o(upperBound, "upperBound");
                OooO0Oo(upperBound, abstractC33328Oooo0O0, linkedHashSet, set);
            }
            return;
        }
        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO2 = abstractC33320OooOoo.o00000().OooO0OO();
        OooO oooO = interfaceC32598OooO0ooOooO0OO2 instanceof OooO ? (OooO) interfaceC32598OooO0ooOooO0OO2 : null;
        List<InterfaceC32637OoooOoo> listOooOOOO = oooO != null ? oooO.OooOOOO() : null;
        int i = 0;
        for (InterfaceC33348OooooOO interfaceC33348OooooOO : abstractC33320OooOoo.o000000O()) {
            int i2 = i + 1;
            InterfaceC32637OoooOoo interfaceC32637OoooOoo = listOooOOOO != null ? (InterfaceC32637OoooOoo) OooOo.OoooO00(i, listOooOOOO) : null;
            if ((interfaceC32637OoooOoo == null || set == null || !set.contains(interfaceC32637OoooOoo)) && !interfaceC33348OooooOO.OooO00o() && !OooOo.Oooo00o(linkedHashSet, interfaceC33348OooooOO.getType().o00000().OooO0OO()) && !OooOOO0.OooO0O0(interfaceC33348OooooOO.getType().o00000(), abstractC33328Oooo0O0.o00000())) {
                AbstractC33320OooOoo type = interfaceC33348OooooOO.getType();
                OooOOO0.OooO0o(type, "argument.type");
                OooO0Oo(type, abstractC33328Oooo0O0, linkedHashSet, set);
            }
            i = i2;
        }
    }

    public static final AbstractC33320OooOoo OooO0o(InterfaceC32637OoooOoo interfaceC32637OoooOoo) {
        Object obj;
        List<AbstractC33320OooOoo> upperBounds = interfaceC32637OoooOoo.getUpperBounds();
        OooOOO0.OooO0o(upperBounds, "upperBounds");
        upperBounds.isEmpty();
        List<AbstractC33320OooOoo> upperBounds2 = interfaceC32637OoooOoo.getUpperBounds();
        OooOOO0.OooO0o(upperBounds2, "upperBounds");
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = ((AbstractC33320OooOoo) next).o00000().OooO0OO();
            InterfaceC32596OooO0o0 interfaceC32596OooO0o0 = interfaceC32598OooO0ooOooO0OO instanceof InterfaceC32596OooO0o0 ? (InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0OO : null;
            if (interfaceC32596OooO0o0 != null && interfaceC32596OooO0o0.getKind() != OooO0o.f117229OooOo && interfaceC32596OooO0o0.getKind() != OooO0o.f117233OooOoOO) {
                obj = next;
                break;
            }
        }
        AbstractC33320OooOoo abstractC33320OooOoo = (AbstractC33320OooOoo) obj;
        if (abstractC33320OooOoo != null) {
            return abstractC33320OooOoo;
        }
        List<AbstractC33320OooOoo> upperBounds3 = interfaceC32637OoooOoo.getUpperBounds();
        OooOOO0.OooO0o(upperBounds3, "upperBounds");
        Object objOooo0oO = OooOo.Oooo0oO(upperBounds3);
        OooOOO0.OooO0o(objOooo0oO, "upperBounds.first()");
        return (AbstractC33320OooOoo) objOooo0oO;
    }

    public static final OooOO0 OooO0o0(AbstractC33320OooOoo abstractC33320OooOoo) {
        OooOOO0.OooO0oO(abstractC33320OooOoo, "<this>");
        OooOO0 oooOO0OooOO0O = abstractC33320OooOoo.o00000().OooOO0O();
        OooOOO0.OooO0o(oooOO0OooOO0O, "constructor.builtIns");
        return oooOO0OooOO0O;
    }

    public static final boolean OooO0oO(InterfaceC32637OoooOoo typeParameter, InterfaceC33342OoooOo0 interfaceC33342OoooOo0, Set<? extends InterfaceC32637OoooOoo> set) {
        OooOOO0.OooO0oO(typeParameter, "typeParameter");
        List<AbstractC33320OooOoo> upperBounds = typeParameter.getUpperBounds();
        OooOOO0.OooO0o(upperBounds, "typeParameter.upperBounds");
        List<AbstractC33320OooOoo> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (AbstractC33320OooOoo upperBound : list) {
            OooOOO0.OooO0o(upperBound, "upperBound");
            if (OooO0O0(upperBound, typeParameter.OooOOO().o00000(), set) && (interfaceC33342OoooOo0 == null || OooOOO0.OooO0O0(upperBound.o00000(), interfaceC33342OoooOo0))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean OooO0oo(AbstractC33320OooOoo abstractC33320OooOoo, AbstractC33320OooOoo superType) {
        OooOOO0.OooO0oO(superType, "superType");
        return InterfaceC33454OooO0Oo.f120914OooO00o.OooO0Oo(abstractC33320OooOoo, superType);
    }

    public static final AbstractC33320OooOoo OooOO0(AbstractC33320OooOoo abstractC33320OooOoo, InterfaceC34588OooO0oO interfaceC34588OooO0oO) {
        return (abstractC33320OooOoo.getAnnotations().isEmpty() && interfaceC34588OooO0oO.isEmpty()) ? abstractC33320OooOoo : abstractC33320OooOoo.o00000OO().o0000Ooo(C24999OooO0OO.OooO0OO(abstractC33320OooOoo.o000000o(), interfaceC34588OooO0oO));
    }

    public static final AbstractC33354o00o0O OooOO0O(AbstractC33320OooOoo abstractC33320OooOoo) {
        AbstractC33354o00o0O abstractC33354o00o0OOooO0Oo;
        OooOOO0.OooO0oO(abstractC33320OooOoo, "<this>");
        AbstractC33354o00o0O abstractC33354o00o0OO00000OO = abstractC33320OooOoo.o00000OO();
        if (abstractC33354o00o0OO00000OO instanceof AbstractC33316OooOo0o) {
            AbstractC33316OooOo0o abstractC33316OooOo0o = (AbstractC33316OooOo0o) abstractC33354o00o0OO00000OO;
            AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooO0Oo = abstractC33316OooOo0o.f120554OooOo;
            if (!abstractC33328Oooo0O0OooO0Oo.o00000().getParameters().isEmpty() && abstractC33328Oooo0O0OooO0Oo.o00000().OooO0OO() != null) {
                List<InterfaceC32637OoooOoo> parameters = abstractC33328Oooo0O0OooO0Oo.o00000().getParameters();
                OooOOO0.OooO0o(parameters, "constructor.parameters");
                List<InterfaceC32637OoooOoo> list = parameters;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C33325Oooo((InterfaceC32637OoooOoo) it.next()));
                }
                abstractC33328Oooo0O0OooO0Oo = C33353Ooooooo.OooO0Oo(abstractC33328Oooo0O0OooO0Oo, arrayList, null, 2);
            }
            AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooO0Oo2 = abstractC33316OooOo0o.f120555OooOoO0;
            if (!abstractC33328Oooo0O0OooO0Oo2.o00000().getParameters().isEmpty() && abstractC33328Oooo0O0OooO0Oo2.o00000().OooO0OO() != null) {
                List<InterfaceC32637OoooOoo> parameters2 = abstractC33328Oooo0O0OooO0Oo2.o00000().getParameters();
                OooOOO0.OooO0o(parameters2, "constructor.parameters");
                List<InterfaceC32637OoooOoo> list2 = parameters2;
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C33325Oooo((InterfaceC32637OoooOoo) it2.next()));
                }
                abstractC33328Oooo0O0OooO0Oo2 = C33353Ooooooo.OooO0Oo(abstractC33328Oooo0O0OooO0Oo2, arrayList2, null, 2);
            }
            abstractC33354o00o0OOooO0Oo = C33322OooOooO.OooO0OO(abstractC33328Oooo0O0OooO0Oo, abstractC33328Oooo0O0OooO0Oo2);
        } else {
            if (!(abstractC33354o00o0OO00000OO instanceof AbstractC33328Oooo0O0)) {
                throw new C32442OooOO0o();
            }
            AbstractC33328Oooo0O0 abstractC33328Oooo0O0 = (AbstractC33328Oooo0O0) abstractC33354o00o0OO00000OO;
            boolean zIsEmpty = abstractC33328Oooo0O0.o00000().getParameters().isEmpty();
            abstractC33354o00o0OOooO0Oo = abstractC33328Oooo0O0;
            if (!zIsEmpty) {
                InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = abstractC33328Oooo0O0.o00000().OooO0OO();
                abstractC33354o00o0OOooO0Oo = abstractC33328Oooo0O0;
                if (interfaceC32598OooO0ooOooO0OO != null) {
                    List<InterfaceC32637OoooOoo> parameters3 = abstractC33328Oooo0O0.o00000().getParameters();
                    OooOOO0.OooO0o(parameters3, "constructor.parameters");
                    List<InterfaceC32637OoooOoo> list3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
                    Iterator<T> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new C33325Oooo((InterfaceC32637OoooOoo) it3.next()));
                    }
                    abstractC33354o00o0OOooO0Oo = C33353Ooooooo.OooO0Oo(abstractC33328Oooo0O0, arrayList3, null, 2);
                }
            }
        }
        return C21091o0000o.OooOOOO(abstractC33354o00o0OOooO0Oo, abstractC33354o00o0OO00000OO);
    }
}
