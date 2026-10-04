package oO0OOOo;

import java.util.Collections;
import java.util.List;
import oO0O0OO.AbstractC32601OooOOo;
import oO0O0OO.C32602OooOOo0;
import oO0O0OO.EnumC32614OooOoOO;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32609OooOo0;
import oO0O0OO.InterfaceC32627Oooo0oo;
import oO0O0OO.OooO0O0;
import oO0O0OO.o000oOoO;
import oO0O0Oo0.AbstractC32667OooO0Oo;
import oO0O0Oo0.C32695OoooO;
import oO0O0Oo0.C32696OoooO0;
import oO0O0Oo0.C32697OoooO00;
import oO0O0Oo0.C32698OoooO0O;
import oO0O0Oo0.C32699OoooOO0;
import oO0O0Oo0.C32705Ooooo00;
import oO0Oo00.C33194OooO0O0;
import oO0Oo0o.C33211OooO0O0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.C33322OooOooO;
import oO0Ooo.C33339OoooOOO;
import oO0Ooo.C33351Oooooo0;
import oO0Ooo.InterfaceC33342OoooOo0;
import oO0OooO0.C33474OooO;
import oO0OooO0.C33479OooO0o;
import oO0OooO0.C33481OooO0oO;
import oO0o0O0o.C33588OooOO0;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0OOOo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32990OooO0oo {

    /* JADX INFO: renamed from: oO0OOOo.OooO0oo$OooO00o */
    public static class OooO00o extends oO0O0Oo0.OooOOO {
    }

    public static C32696OoooO0 OooO(InterfaceC32627Oooo0oo interfaceC32627Oooo0oo, InterfaceC34588OooO0oO interfaceC34588OooO0oO, boolean z, o000oOoO o000oooo2) {
        if (interfaceC34588OooO0oO == null) {
            OooO00o(18);
            throw null;
        }
        if (o000oooo2 != null) {
            return new C32696OoooO0(interfaceC32627Oooo0oo, interfaceC34588OooO0oO, interfaceC32627Oooo0oo.OooO0oO(), interfaceC32627Oooo0oo.getVisibility(), z, false, false, OooO0O0.OooO00o.f117222OooOo0o, null, o000oooo2);
        }
        OooO00o(19);
        throw null;
    }

    public static /* synthetic */ void OooO00o(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static C32695OoooO OooO0O0(oO0O0OO.OooO00o oooO00o, AbstractC33320OooOoo abstractC33320OooOoo, C33479OooO0o c33479OooO0o, InterfaceC34588OooO0oO interfaceC34588OooO0oO, int i) {
        if (interfaceC34588OooO0oO == null) {
            OooO00o(33);
            throw null;
        }
        if (abstractC33320OooOoo == null) {
            return null;
        }
        C33211OooO0O0 c33211OooO0O0 = new C33211OooO0O0(oooO00o, abstractC33320OooOoo, c33479OooO0o, null);
        C33588OooOO0 c33588OooOO0 = C33481OooO0oO.f120982OooO00o;
        return new C32695OoooO(oooO00o, c33211OooO0O0, interfaceC34588OooO0oO, C33479OooO0o.OooO0o0("_context_receiver_" + i));
    }

    public static C32696OoooO0 OooO0OO(InterfaceC32627Oooo0oo interfaceC32627Oooo0oo, InterfaceC34588OooO0oO interfaceC34588OooO0oO) {
        return OooO(interfaceC32627Oooo0oo, interfaceC34588OooO0oO, true, interfaceC32627Oooo0oo.getSource());
    }

    public static C32698OoooO0O OooO0Oo(InterfaceC32627Oooo0oo interfaceC32627Oooo0oo, InterfaceC34588OooO0oO interfaceC34588OooO0oO) {
        InterfaceC34588OooO0oO.OooO00o.C20364OooO00o c20364OooO00o = InterfaceC34588OooO0oO.OooO00o.f123919OooO00o;
        o000oOoO source = interfaceC32627Oooo0oo.getSource();
        if (source != null) {
            return OooOO0(interfaceC32627Oooo0oo, interfaceC34588OooO0oO, c20364OooO00o, true, interfaceC32627Oooo0oo.getVisibility(), source);
        }
        OooO00o(6);
        throw null;
    }

    public static C32699OoooOO0 OooO0o(AbstractC32667OooO0Oo abstractC32667OooO0Oo) {
        if (abstractC32667OooO0Oo == null) {
            OooO00o(24);
            throw null;
        }
        InterfaceC34588OooO0oO.OooO00o.C20364OooO00o c20364OooO00o = InterfaceC34588OooO0oO.OooO00o.f123919OooO00o;
        C32699OoooOO0 c32699OoooOO0O0000 = C32699OoooOO0.o0000(abstractC32667OooO0Oo, oO0O0O0o.OooOOO.f117136OooO0OO, OooO0O0.OooO00o.f117223OooOoO, abstractC32667OooO0Oo.getSource());
        C32705Ooooo00 c32705Ooooo00 = new C32705Ooooo00(c32699OoooOO0O0000, null, 0, c20364OooO00o, C33479OooO0o.OooO0o0("value"), C33194OooO0O0.OooO0o0(abstractC32667OooO0Oo).OooOo00(), false, false, false, null, abstractC32667OooO0Oo.getSource());
        List list = Collections.EMPTY_LIST;
        return c32699OoooOO0O0000.o00000O(null, null, list, list, Collections.singletonList(c32705Ooooo00), abstractC32667OooO0Oo.OooOOO(), EnumC32614OooOoOO.f117261OooOo0o, C32602OooOOo0.f117243OooO0o0);
    }

    public static C32697OoooO00 OooO0o0(AbstractC32667OooO0Oo abstractC32667OooO0Oo) {
        if (abstractC32667OooO0Oo == null) {
            OooO00o(26);
            throw null;
        }
        InterfaceC32596OooO0o0 interfaceC32596OooO0o0OooO00o = oO0O0OO.OooOo00.OooO00o(C32982OooO.OooO0Oo(abstractC32667OooO0Oo), C33474OooO.f120963OooOo0);
        if (interfaceC32596OooO0o0OooO00o == null) {
            return null;
        }
        InterfaceC34588OooO0oO.OooO00o.C20364OooO00o c20364OooO00o = InterfaceC34588OooO0oO.OooO00o.f123919OooO00o;
        EnumC32614OooOoOO enumC32614OooOoOO = EnumC32614OooOoOO.f117261OooOo0o;
        C32602OooOOo0.C32606OooO0oo c32606OooO0oo = C32602OooOOo0.f117243OooO0o0;
        C33479OooO0o c33479OooO0o = oO0O0O0o.OooOOO.f117135OooO0O0;
        OooO0O0.OooO00o oooO00o = OooO0O0.OooO00o.f117223OooOoO;
        C32697OoooO00 c32697OoooO00O00000 = C32697OoooO00.o00000(abstractC32667OooO0Oo, enumC32614OooOoOO, c32606OooO0oo, false, c33479OooO0o, oooO00o, abstractC32667OooO0Oo.getSource());
        C32696OoooO0 c32696OoooO0 = new C32696OoooO0(c32697OoooO00O00000, c20364OooO00o, enumC32614OooOoOO, c32606OooO0oo, false, false, false, oooO00o, null, abstractC32667OooO0Oo.getSource());
        c32697OoooO00O00000.o00000O(c32696OoooO0, null, null, null);
        C33339OoooOOO.f120598OooOo.getClass();
        C33339OoooOOO attributes = C33339OoooOOO.f120599OooOoO0;
        InterfaceC33342OoooOo0 constructor = interfaceC32596OooO0o0OooO00o.OooO();
        List arguments = Collections.singletonList(new C33351Oooooo0(abstractC32667OooO0Oo.OooOOO()));
        int i = C33322OooOooO.f120569OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(attributes, "attributes");
        kotlin.jvm.internal.OooOOO0.OooO0oO(constructor, "constructor");
        kotlin.jvm.internal.OooOOO0.OooO0oO(arguments, "arguments");
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooO0o0 = C33322OooOooO.OooO0o0(attributes, constructor, arguments, false, null);
        List list = Collections.EMPTY_LIST;
        c32697OoooO00O00000.o00000Oo(abstractC33328Oooo0O0OooO0o0, list, null, null, list);
        c32696OoooO0.o00000O0(c32697OoooO00O00000.getReturnType());
        return c32697OoooO00O00000;
    }

    public static C32699OoooOO0 OooO0oO(AbstractC32667OooO0Oo abstractC32667OooO0Oo) {
        if (abstractC32667OooO0Oo == null) {
            OooO00o(22);
            throw null;
        }
        C32699OoooOO0 c32699OoooOO0O0000 = C32699OoooOO0.o0000(abstractC32667OooO0Oo, oO0O0O0o.OooOOO.f117134OooO00o, OooO0O0.OooO00o.f117223OooOoO, abstractC32667OooO0Oo.getSource());
        List list = Collections.EMPTY_LIST;
        return c32699OoooOO0O0000.o00000O(null, null, list, list, list, C33194OooO0O0.OooO0o0(abstractC32667OooO0Oo).OooO0oo(abstractC32667OooO0Oo.OooOOO()), EnumC32614OooOoOO.f117261OooOo0o, C32602OooOOo0.f117243OooO0o0);
    }

    public static C32695OoooO OooO0oo(oO0O0OO.OooO00o oooO00o, AbstractC33320OooOoo abstractC33320OooOoo, InterfaceC34588OooO0oO interfaceC34588OooO0oO) {
        if (abstractC33320OooOoo == null) {
            return null;
        }
        return new C32695OoooO(oooO00o, new oO0Oo0o.OooO0OO(oooO00o, abstractC33320OooOoo, null), interfaceC34588OooO0oO);
    }

    public static C32698OoooO0O OooOO0(InterfaceC32627Oooo0oo interfaceC32627Oooo0oo, InterfaceC34588OooO0oO interfaceC34588OooO0oO, InterfaceC34588OooO0oO interfaceC34588OooO0oO2, boolean z, AbstractC32601OooOOo abstractC32601OooOOo, o000oOoO o000oooo2) {
        if (interfaceC34588OooO0oO == null) {
            OooO00o(8);
            throw null;
        }
        if (interfaceC34588OooO0oO2 == null) {
            OooO00o(9);
            throw null;
        }
        if (abstractC32601OooOOo == null) {
            OooO00o(10);
            throw null;
        }
        if (o000oooo2 == null) {
            OooO00o(11);
            throw null;
        }
        C32698OoooO0O c32698OoooO0O = new C32698OoooO0O(interfaceC32627Oooo0oo, interfaceC34588OooO0oO, interfaceC32627Oooo0oo.OooO0oO(), abstractC32601OooOOo, z, false, false, OooO0O0.OooO00o.f117222OooOo0o, null, o000oooo2);
        c32698OoooO0O.f117572Oooo0 = C32698OoooO0O.o00000(c32698OoooO0O, interfaceC32627Oooo0oo.getType(), interfaceC34588OooO0oO2);
        return c32698OoooO0O;
    }

    public static boolean OooOO0O(InterfaceC32609OooOo0 interfaceC32609OooOo0) {
        return interfaceC32609OooOo0.getKind() == OooO0O0.OooO00o.f117223OooOoO && C32982OooO.OooOOO(interfaceC32609OooOo0.OooO0Oo(), oO0O0OO.OooO0o.f117232OooOoO0);
    }
}
