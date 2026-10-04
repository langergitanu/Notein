package oO0Ooo;

import java.util.Arrays;
import java.util.List;
import o00OO0o0.C24999OooO0OO;
import oO00ooO.C32442OooOO0o;
import oO0Oooo.C33514OooO0o;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0Ooo.Ooooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33353Ooooooo {
    public static final AbstractC33328Oooo0O0 OooO00o(AbstractC33320OooOoo abstractC33320OooOoo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC33320OooOoo, "<this>");
        AbstractC33354o00o0O abstractC33354o00o0OO00000OO = abstractC33320OooOoo.o00000OO();
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0 = abstractC33354o00o0OO00000OO instanceof AbstractC33328Oooo0O0 ? (AbstractC33328Oooo0O0) abstractC33354o00o0OO00000OO : null;
        if (abstractC33328Oooo0O0 != null) {
            return abstractC33328Oooo0O0;
        }
        throw new IllegalStateException(("This is should be simple type: " + abstractC33320OooOoo).toString());
    }

    public static final AbstractC33328Oooo0O0 OooO0O0(AbstractC33328Oooo0O0 abstractC33328Oooo0O0, List<? extends InterfaceC33348OooooOO> newArguments, C33339OoooOOO newAttributes) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC33328Oooo0O0, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(newArguments, "newArguments");
        kotlin.jvm.internal.OooOOO0.OooO0oO(newAttributes, "newAttributes");
        if (newArguments.isEmpty() && newAttributes == abstractC33328Oooo0O0.o000000o()) {
            return abstractC33328Oooo0O0;
        }
        if (newArguments.isEmpty()) {
            return abstractC33328Oooo0O0.o0000Ooo(newAttributes);
        }
        if (!(abstractC33328Oooo0O0 instanceof C33514OooO0o)) {
            return C33322OooOooO.OooO0o0(newAttributes, abstractC33328Oooo0O0.o00000(), newArguments, abstractC33328Oooo0O0.o00000O0(), null);
        }
        C33514OooO0o c33514OooO0o = (C33514OooO0o) abstractC33328Oooo0O0;
        String[] strArr = c33514OooO0o.f121048OooOoo;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return new C33514OooO0o(c33514OooO0o.f121044OooOo, c33514OooO0o.f121046OooOoO0, c33514OooO0o.f121045OooOoO, newArguments, c33514OooO0o.f121049OooOoo0, strArr2);
    }

    public static AbstractC33320OooOoo OooO0OO(AbstractC33320OooOoo abstractC33320OooOoo, List list, InterfaceC34588OooO0oO interfaceC34588OooO0oO, int i) {
        if ((i & 2) != 0) {
            interfaceC34588OooO0oO = abstractC33320OooOoo.getAnnotations();
        }
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC33320OooOoo, "<this>");
        if ((list.isEmpty() || list == abstractC33320OooOoo.o000000O()) && interfaceC34588OooO0oO == abstractC33320OooOoo.getAnnotations()) {
            return abstractC33320OooOoo;
        }
        C33339OoooOOO c33339OoooOOOO000000o = abstractC33320OooOoo.o000000o();
        if ((interfaceC34588OooO0oO instanceof oOo0oooO.OooOO0O) && interfaceC34588OooO0oO.isEmpty()) {
            interfaceC34588OooO0oO = InterfaceC34588OooO0oO.OooO00o.f123919OooO00o;
        }
        C33339OoooOOO c33339OoooOOOOooO0OO = C24999OooO0OO.OooO0OO(c33339OoooOOOO000000o, interfaceC34588OooO0oO);
        AbstractC33354o00o0O abstractC33354o00o0OO00000OO = abstractC33320OooOoo.o00000OO();
        if (abstractC33354o00o0OO00000OO instanceof AbstractC33316OooOo0o) {
            AbstractC33316OooOo0o abstractC33316OooOo0o = (AbstractC33316OooOo0o) abstractC33354o00o0OO00000OO;
            return C33322OooOooO.OooO0OO(OooO0O0(abstractC33316OooOo0o.f120554OooOo, list, c33339OoooOOOOooO0OO), OooO0O0(abstractC33316OooOo0o.f120555OooOoO0, list, c33339OoooOOOOooO0OO));
        }
        if (abstractC33354o00o0OO00000OO instanceof AbstractC33328Oooo0O0) {
            return OooO0O0((AbstractC33328Oooo0O0) abstractC33354o00o0OO00000OO, list, c33339OoooOOOOooO0OO);
        }
        throw new C32442OooOO0o();
    }

    public static /* synthetic */ AbstractC33328Oooo0O0 OooO0Oo(AbstractC33328Oooo0O0 abstractC33328Oooo0O0, List list, C33339OoooOOO c33339OoooOOO, int i) {
        if ((i & 1) != 0) {
            list = abstractC33328Oooo0O0.o000000O();
        }
        if ((i & 2) != 0) {
            c33339OoooOOO = abstractC33328Oooo0O0.o000000o();
        }
        return OooO0O0(abstractC33328Oooo0O0, list, c33339OoooOOO);
    }
}
