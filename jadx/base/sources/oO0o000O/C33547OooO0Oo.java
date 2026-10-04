package oO0o000O;

import Oooo0.o0OoOo0;
import Oooo0oO.C21091o0000o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO0O0O0o.OooOO0;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0Oo00.C33194OooO0O0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.C33322OooOooO;
import oO0Ooo.C33351Oooooo0;
import oO0Ooo.C33353Ooooooo;
import oO0Ooo.C33356ooOO;
import oO0Ooo.InterfaceC33342OoooOo0;
import oO0Ooo.InterfaceC33348OooooOO;
import oO0Ooo.o00Oo0;
import oO0OooO.C33462OooOOO;
import oO0OooO.InterfaceC33454OooO0Oo;
import oO0o000.C33538OooO0OO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: oO0o000O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33547OooO0Oo {
    public static final C33544OooO00o<AbstractC33320OooOoo> OooO00o(AbstractC33320OooOoo type) {
        C33548OooO0o0 c33548OooO0o0;
        OooOOO0.OooO0oO(type, "type");
        if (o00OO0O0.OooO0O0.OooO(type)) {
            C33544OooO00o<AbstractC33320OooOoo> c33544OooO00oOooO00o = OooO00o(o00OO0O0.OooO0O0.OooOO0(type));
            C33544OooO00o<AbstractC33320OooOoo> c33544OooO00oOooO00o2 = OooO00o(o00OO0O0.OooO0O0.OooOO0o(type));
            return new C33544OooO00o<>(C21091o0000o.OooOOOO(C33322OooOooO.OooO0OO(o00OO0O0.OooO0O0.OooOO0(c33544OooO00oOooO00o.f121140OooO00o), o00OO0O0.OooO0O0.OooOO0o(c33544OooO00oOooO00o2.f121140OooO00o)), type), C21091o0000o.OooOOOO(C33322OooOooO.OooO0OO(o00OO0O0.OooO0O0.OooOO0(c33544OooO00oOooO00o.f121141OooO0O0), o00OO0O0.OooO0O0.OooOO0o(c33544OooO00oOooO00o2.f121141OooO0O0)), type));
        }
        InterfaceC33342OoooOo0 interfaceC33342OoooOo0O00000 = type.o00000();
        boolean z = true;
        if (type.o00000() instanceof oO0OOo0.OooO0O0) {
            OooOOO0.OooO0o0(interfaceC33342OoooOo0O00000, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            InterfaceC33348OooooOO interfaceC33348OooooOOOooO0O0 = ((oO0OOo0.OooO0O0) interfaceC33342OoooOo0O00000).OooO0O0();
            AbstractC33320OooOoo type2 = interfaceC33348OooooOOOooO0O0.getType();
            OooOOO0.OooO0o(type2, "typeProjection.type");
            AbstractC33320OooOoo abstractC33320OooOooOooO = o00Oo0.OooO(type2, type.o00000O0());
            OooOOO0.OooO0o(abstractC33320OooOooOooO, "makeNullableIfNeeded(this, type.isMarkedNullable)");
            int iOooO00o = o0OoOo0.OooO00o(interfaceC33348OooooOOOooO0O0.OooO0OO());
            if (iOooO00o == 1) {
                return new C33544OooO00o<>(abstractC33320OooOooOooO, C33538OooO0OO.OooO0o0(type).OooOOO());
            }
            if (iOooO00o == 2) {
                AbstractC33320OooOoo abstractC33320OooOooOooO2 = o00Oo0.OooO(C33538OooO0OO.OooO0o0(type).OooOOO0(), type.o00000O0());
                OooOOO0.OooO0o(abstractC33320OooOooOooO2, "makeNullableIfNeeded(this, type.isMarkedNullable)");
                return new C33544OooO00o<>(abstractC33320OooOooOooO2, abstractC33320OooOooOooO);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + interfaceC33348OooooOOOooO0O0);
        }
        if (type.o000000O().isEmpty() || type.o000000O().size() != interfaceC33342OoooOo0O00000.getParameters().size()) {
            return new C33544OooO00o<>(type, type);
        }
        ArrayList<C33548OooO0o0> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<InterfaceC33348OooooOO> listO000000O = type.o000000O();
        List<InterfaceC32637OoooOoo> parameters = interfaceC33342OoooOo0O00000.getParameters();
        OooOOO0.OooO0o(parameters, "typeConstructor.parameters");
        for (C32443OooOOO c32443OooOOO : OooOo.o000OOo(listO000000O, parameters)) {
            InterfaceC33348OooooOO interfaceC33348OooooOO = (InterfaceC33348OooooOO) c32443OooOOO.f116638OooOo0o;
            InterfaceC32637OoooOoo typeParameter = (InterfaceC32637OoooOoo) c32443OooOOO.f116637OooOo;
            OooOOO0.OooO0o(typeParameter, "typeParameter");
            int iOooOo0 = typeParameter.OooOo0();
            if (iOooOo0 == 0) {
                C33356ooOO.OooO00o(35);
                throw null;
            }
            if (interfaceC33348OooooOO == null) {
                C33356ooOO.OooO00o(36);
                throw null;
            }
            C33356ooOO c33356ooOO = C33356ooOO.f120633OooO0O0;
            int iOooO00o2 = o0OoOo0.OooO00o(interfaceC33348OooooOO.OooO00o() ? 3 : C33356ooOO.OooO0O0(iOooOo0, interfaceC33348OooooOO.OooO0OO()));
            if (iOooO00o2 == 0) {
                AbstractC33320OooOoo type3 = interfaceC33348OooooOO.getType();
                OooOOO0.OooO0o(type3, "type");
                AbstractC33320OooOoo type4 = interfaceC33348OooooOO.getType();
                OooOOO0.OooO0o(type4, "type");
                c33548OooO0o0 = new C33548OooO0o0(typeParameter, type3, type4);
            } else if (iOooO00o2 == 1) {
                AbstractC33320OooOoo type5 = interfaceC33348OooooOO.getType();
                OooOOO0.OooO0o(type5, "type");
                c33548OooO0o0 = new C33548OooO0o0(typeParameter, type5, C33194OooO0O0.OooO0o0(typeParameter).OooOOO());
            } else {
                if (iOooO00o2 != 2) {
                    throw new C32442OooOO0o();
                }
                AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooOOO0 = C33194OooO0O0.OooO0o0(typeParameter).OooOOO0();
                AbstractC33320OooOoo type6 = interfaceC33348OooooOO.getType();
                OooOOO0.OooO0o(type6, "type");
                c33548OooO0o0 = new C33548OooO0o0(typeParameter, abstractC33328Oooo0O0OooOOO0, type6);
            }
            if (interfaceC33348OooooOO.OooO00o()) {
                arrayList.add(c33548OooO0o0);
                arrayList2.add(c33548OooO0o0);
            } else {
                C33544OooO00o<AbstractC33320OooOoo> c33544OooO00oOooO00o3 = OooO00o(c33548OooO0o0.f121144OooO0O0);
                AbstractC33320OooOoo abstractC33320OooOoo = c33544OooO00oOooO00o3.f121140OooO00o;
                AbstractC33320OooOoo abstractC33320OooOoo2 = c33544OooO00oOooO00o3.f121141OooO0O0;
                C33544OooO00o<AbstractC33320OooOoo> c33544OooO00oOooO00o4 = OooO00o(c33548OooO0o0.f121145OooO0OO);
                AbstractC33320OooOoo abstractC33320OooOoo3 = c33544OooO00oOooO00o4.f121140OooO00o;
                AbstractC33320OooOoo abstractC33320OooOoo4 = c33544OooO00oOooO00o4.f121141OooO0O0;
                InterfaceC32637OoooOoo interfaceC32637OoooOoo = c33548OooO0o0.f121143OooO00o;
                C33548OooO0o0 c33548OooO0o02 = new C33548OooO0o0(interfaceC32637OoooOoo, abstractC33320OooOoo2, abstractC33320OooOoo3);
                C33548OooO0o0 c33548OooO0o03 = new C33548OooO0o0(interfaceC32637OoooOoo, abstractC33320OooOoo, abstractC33320OooOoo4);
                arrayList.add(c33548OooO0o02);
                arrayList2.add(c33548OooO0o03);
            }
        }
        if (arrayList.isEmpty()) {
            z = false;
        } else {
            for (C33548OooO0o0 c33548OooO0o04 : arrayList) {
                c33548OooO0o04.getClass();
                if (!InterfaceC33454OooO0Oo.f120914OooO00o.OooO0Oo(c33548OooO0o04.f121144OooO0O0, c33548OooO0o04.f121145OooO0OO)) {
                    break;
                }
            }
            z = false;
        }
        return new C33544OooO00o<>(z ? C33538OooO0OO.OooO0o0(type).OooOOO0() : OooO0O0(type, arrayList), OooO0O0(type, arrayList2));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AbstractC33320OooOoo OooO0O0(AbstractC33320OooOoo abstractC33320OooOoo, ArrayList arrayList) {
        C33351Oooooo0 c33351Oooooo0;
        abstractC33320OooOoo.o000000O().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C33548OooO0o0 c33548OooO0o0 = (C33548OooO0o0) it.next();
            c33548OooO0o0.getClass();
            C33462OooOOO c33462OooOOO = InterfaceC33454OooO0Oo.f120914OooO00o;
            AbstractC33320OooOoo abstractC33320OooOoo2 = c33548OooO0o0.f121144OooO0O0;
            AbstractC33320OooOoo abstractC33320OooOoo3 = c33548OooO0o0.f121145OooO0OO;
            c33462OooOOO.OooO0Oo(abstractC33320OooOoo2, abstractC33320OooOoo3);
            if (!OooOOO0.OooO0O0(abstractC33320OooOoo2, abstractC33320OooOoo3)) {
                InterfaceC32637OoooOoo interfaceC32637OoooOoo = c33548OooO0o0.f121143OooO00o;
                if (interfaceC32637OoooOoo.OooOo0() == 2) {
                    c33351Oooooo0 = new C33351Oooooo0(abstractC33320OooOoo2);
                } else {
                    if (OooOO0.OooOooO(abstractC33320OooOoo2) && interfaceC32637OoooOoo.OooOo0() != 2) {
                        c33351Oooooo0 = new C33351Oooooo0(3 != interfaceC32637OoooOoo.OooOo0() ? 3 : 1, abstractC33320OooOoo3);
                    } else {
                        if (abstractC33320OooOoo3 == null) {
                            OooOO0.OooO00o(140);
                            throw null;
                        }
                        if (OooOO0.OooOo0o(abstractC33320OooOoo3) && abstractC33320OooOoo3.o00000O0()) {
                            c33351Oooooo0 = new C33351Oooooo0(2 == interfaceC32637OoooOoo.OooOo0() ? 1 : 2, abstractC33320OooOoo2);
                        } else {
                            c33351Oooooo0 = new C33351Oooooo0(3 != interfaceC32637OoooOoo.OooOo0() ? 3 : 1, abstractC33320OooOoo3);
                        }
                    }
                }
            }
            arrayList2.add(c33351Oooooo0);
        }
        return C33353Ooooooo.OooO0OO(abstractC33320OooOoo, arrayList2, null, 6);
    }
}
