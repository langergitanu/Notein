package oO0O0o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;
import oO0O0O0o.OooO0o;
import oO0O0OO.C32602OooOOo0;
import oO0O0OO.EnumC32614OooOoOO;
import oO0O0OO.InterfaceC32609OooOo0;
import oO0O0OO.InterfaceC32629OoooO0;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0O0OO.InterfaceC32641OooooOO;
import oO0O0OO.OooO0O0;
import oO0O0OO.OooOO0O;
import oO0O0OO.o000oOoO;
import oO0O0Oo0.AbstractC32682OooOoo;
import oO0O0Oo0.C32699OoooOO0;
import oO0O0Oo0.C32705Ooooo00;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.C33356ooOO;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34437OooOoo;
import oOo000Oo.C34439OooOooO;
import oOo000Oo.C34440OooOooo;
import oOo000Oo.OooOo;
import oOo0oooO.InterfaceC34588OooO0oO;
import ooOOoOoo.C35177OooOo00;

/* JADX INFO: renamed from: oO0O0o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32715OooO0o0 extends C32699OoooOO0 {

    /* JADX INFO: renamed from: oO0O0o.OooO0o0$OooO00o */
    public static final class OooO00o {
        public static C32715OooO0o0 OooO00o(C32712OooO0O0 functionClass, boolean z) {
            String lowerCase;
            OooOOO0.OooO0oO(functionClass, "functionClass");
            C32715OooO0o0 c32715OooO0o0 = new C32715OooO0o0(functionClass, null, OooO0O0.OooO00o.f117222OooOo0o, z);
            InterfaceC32629OoooO0 interfaceC32629OoooO0OoooO00 = functionClass.OoooO00();
            C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
            List<InterfaceC32637OoooOoo> list = functionClass.f117627Oooo00O;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((InterfaceC32637OoooOoo) obj).OooOo0() != 2) {
                    break;
                }
                arrayList.add(obj);
            }
            C34439OooOooO c34439OooOooOO0O0O00 = OooOo.o0O0O00(arrayList);
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(c34439OooOooOO0O0O00, 10));
            Iterator it = c34439OooOooOO0O0O00.iterator();
            while (true) {
                C34440OooOooo c34440OooOooo = (C34440OooOooo) it;
                if (!c34440OooOooo.f123461OooOo0o.hasNext()) {
                    c32715OooO0o0.o00000O(null, interfaceC32629OoooO0OoooO00, c34434OooOoO, c34434OooOoO, arrayList2, ((InterfaceC32637OoooOoo) OooOo.OoooOOo(list)).OooOOO(), EnumC32614OooOoOO.f117262OooOoO, C32602OooOOo0.f117243OooO0o0);
                    C32715OooO0o0 c32715OooO0o02 = c32715OooO0o0;
                    c32715OooO0o02.f117456OoooO = true;
                    return c32715OooO0o02;
                }
                C34437OooOoo c34437OooOoo = (C34437OooOoo) c34440OooOooo.next();
                int i = c34437OooOoo.f123456OooO00o;
                InterfaceC32637OoooOoo interfaceC32637OoooOoo = (InterfaceC32637OoooOoo) c34437OooOoo.f123457OooO0O0;
                String strOooO0O0 = interfaceC32637OoooOoo.getName().OooO0O0();
                OooOOO0.OooO0o(strOooO0O0, "typeParameter.name.asString()");
                if (strOooO0O0.equals("T")) {
                    lowerCase = "instance";
                } else if (strOooO0O0.equals("E")) {
                    lowerCase = "receiver";
                } else {
                    lowerCase = strOooO0O0.toLowerCase(Locale.ROOT);
                    OooOOO0.OooO0o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                }
                C32715OooO0o0 c32715OooO0o03 = c32715OooO0o0;
                InterfaceC34588OooO0oO.OooO00o.C20364OooO00o c20364OooO00o = InterfaceC34588OooO0oO.OooO00o.f123919OooO00o;
                C33479OooO0o c33479OooO0oOooO0o0 = C33479OooO0o.OooO0o0(lowerCase);
                AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooOOO = interfaceC32637OoooOoo.OooOOO();
                OooOOO0.OooO0o(abstractC33328Oooo0O0OooOOO, "typeParameter.defaultType");
                arrayList2.add(new C32705Ooooo00(c32715OooO0o03, null, i, c20364OooO00o, c33479OooO0oOooO0o0, abstractC33328Oooo0O0OooOOO, false, false, false, null, o000oOoO.f117308OooO00o));
                c32715OooO0o0 = c32715OooO0o03;
            }
        }
    }

    public C32715OooO0o0(OooOO0O oooOO0O, C32715OooO0o0 c32715OooO0o0, OooO0O0.OooO00o oooO00o, boolean z) {
        super(oooOO0O, c32715OooO0o0, InterfaceC34588OooO0oO.OooO00o.f123919OooO00o, C35177OooOo00.f126267OooO0oO, oooO00o, o000oOoO.f117308OooO00o);
        this.f117446Oooo0 = true;
        this.f117457OoooO0 = z;
        this.f117459OoooO0O = false;
    }

    @Override // oO0O0Oo0.AbstractC32682OooOoo, oO0O0OO.InterfaceC32609OooOo0
    public final boolean OooOo0O() {
        return false;
    }

    @Override // oO0O0Oo0.AbstractC32682OooOoo, oO0O0OO.InterfaceC32612OooOoO
    public final boolean isExternal() {
        return false;
    }

    @Override // oO0O0Oo0.AbstractC32682OooOoo, oO0O0OO.InterfaceC32609OooOo0
    public final boolean isInline() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O0Oo0.AbstractC32682OooOoo
    public final AbstractC32682OooOoo o00000(AbstractC32682OooOoo.OooO00o configuration) {
        C33479OooO0o c33479OooO0o;
        OooOOO0.OooO0oO(configuration, "configuration");
        C32715OooO0o0 c32715OooO0o0 = (C32715OooO0o0) super.o00000(configuration);
        if (c32715OooO0o0 == null) {
            return null;
        }
        List<InterfaceC32641OooooOO> listOooO0o = c32715OooO0o0.OooO0o();
        OooOOO0.OooO0o(listOooO0o, "substituted.valueParameters");
        List<InterfaceC32641OooooOO> list = listOooO0o;
        if ((list instanceof Collection) && list.isEmpty()) {
            return c32715OooO0o0;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AbstractC33320OooOoo type = ((InterfaceC32641OooooOO) it.next()).getType();
            OooOOO0.OooO0o(type, "it.type");
            if (OooO0o.OooO0OO(type) != null) {
                List<InterfaceC32641OooooOO> listOooO0o2 = c32715OooO0o0.OooO0o();
                OooOOO0.OooO0o(listOooO0o2, "substituted.valueParameters");
                List<InterfaceC32641OooooOO> list2 = listOooO0o2;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    AbstractC33320OooOoo type2 = ((InterfaceC32641OooooOO) it2.next()).getType();
                    OooOOO0.OooO0o(type2, "it.type");
                    arrayList.add(OooO0o.OooO0OO(type2));
                }
                int size = c32715OooO0o0.OooO0o().size() - arrayList.size();
                boolean z = true;
                if (size == 0) {
                    List<InterfaceC32641OooooOO> valueParameters = c32715OooO0o0.OooO0o();
                    OooOOO0.OooO0o(valueParameters, "valueParameters");
                    ArrayList<C32443OooOOO> arrayListO000OOo = OooOo.o000OOo(arrayList, valueParameters);
                    if (arrayListO000OOo.isEmpty()) {
                        return c32715OooO0o0;
                    }
                    for (C32443OooOOO c32443OooOOO : arrayListO000OOo) {
                        if (!OooOOO0.OooO0O0((C33479OooO0o) c32443OooOOO.f116638OooOo0o, ((InterfaceC32641OooooOO) c32443OooOOO.f116637OooOo).getName())) {
                        }
                    }
                    return c32715OooO0o0;
                }
                List<InterfaceC32641OooooOO> valueParameters2 = c32715OooO0o0.OooO0o();
                OooOOO0.OooO0o(valueParameters2, "valueParameters");
                List<InterfaceC32641OooooOO> list3 = valueParameters2;
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
                for (InterfaceC32641OooooOO interfaceC32641OooooOO : list3) {
                    C33479OooO0o name = interfaceC32641OooooOO.getName();
                    OooOOO0.OooO0o(name, "it.name");
                    int index = interfaceC32641OooooOO.getIndex();
                    int i = index - size;
                    if (i >= 0 && (c33479OooO0o = (C33479OooO0o) arrayList.get(i)) != null) {
                        name = c33479OooO0o;
                    }
                    arrayList2.add(interfaceC32641OooooOO.OoooO0(c32715OooO0o0, name, index));
                }
                AbstractC32682OooOoo.OooO00o oooO00oO00000OO = c32715OooO0o0.o00000OO(C33356ooOO.f120633OooO0O0);
                if (arrayList.isEmpty()) {
                    z = false;
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((C33479OooO0o) it3.next()) == null) {
                            break;
                        }
                    }
                    z = false;
                }
                oooO00oO00000OO.f117488OooOo0O = Boolean.valueOf(z);
                oooO00oO00000OO.f117473OooO0oO = arrayList2;
                oooO00oO00000OO.f117472OooO0o0 = c32715OooO0o0.o000OOo();
                AbstractC32682OooOoo abstractC32682OooOooO00000 = super.o00000(oooO00oO00000OO);
                OooOOO0.OooO0Oo(abstractC32682OooOooO00000);
                return abstractC32682OooOooO00000;
            }
        }
        return c32715OooO0o0;
    }

    @Override // oO0O0Oo0.C32699OoooOO0, oO0O0Oo0.AbstractC32682OooOoo
    public final AbstractC32682OooOoo o000000o(OooO0O0.OooO00o kind, OooOO0O newOwner, InterfaceC32609OooOo0 interfaceC32609OooOo0, o000oOoO o000oooo2, C33479OooO0o c33479OooO0o, InterfaceC34588OooO0oO annotations) {
        OooOOO0.OooO0oO(newOwner, "newOwner");
        OooOOO0.OooO0oO(kind, "kind");
        OooOOO0.OooO0oO(annotations, "annotations");
        return new C32715OooO0o0(newOwner, (C32715OooO0o0) interfaceC32609OooOo0, kind, this.f117457OoooO0);
    }
}
