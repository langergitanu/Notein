package oO0O0Oo0;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import oO0O0OO.AbstractC32600OooOOOo;
import oO0O0OO.AbstractC32601OooOOo;
import oO0O0OO.EnumC32614OooOoOO;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32609OooOo0;
import oO0O0OO.InterfaceC32629OoooO0;
import oO0O0OO.InterfaceC32632OoooOO0;
import oO0O0OO.OooO0O0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.C33356ooOO;
import oO0OooO0.C33479OooO0o;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0O0Oo0.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C32699OoooOO0 extends AbstractC32682OooOoo implements InterfaceC32632OoooOO0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32699OoooOO0(oO0O0OO.OooOO0O oooOO0O, InterfaceC32632OoooOO0 interfaceC32632OoooOO0, InterfaceC34588OooO0oO interfaceC34588OooO0oO, C33479OooO0o c33479OooO0o, OooO0O0.OooO00o oooO00o, oO0O0OO.o000oOoO o000oooo2) {
        super(oooO00o, oooOO0O, interfaceC32632OoooOO0, o000oooo2, c33479OooO0o, interfaceC34588OooO0oO);
        if (oooOO0O == null) {
            OoooO(0);
            throw null;
        }
        if (interfaceC34588OooO0oO == null) {
            OoooO(1);
            throw null;
        }
        if (c33479OooO0o == null) {
            OoooO(2);
            throw null;
        }
        if (oooO00o == null) {
            OoooO(3);
            throw null;
        }
        if (o000oooo2 != null) {
        } else {
            OoooO(4);
            throw null;
        }
    }

    public static /* synthetic */ void OoooO(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static C32699OoooOO0 o0000(InterfaceC32596OooO0o0 interfaceC32596OooO0o0, C33479OooO0o c33479OooO0o, OooO0O0.OooO00o oooO00o, oO0O0OO.o000oOoO o000oooo2) {
        InterfaceC34588OooO0oO.OooO00o.C20364OooO00o c20364OooO00o = InterfaceC34588OooO0oO.OooO00o.f123919OooO00o;
        if (interfaceC32596OooO0o0 == null) {
            OoooO(5);
            throw null;
        }
        if (c33479OooO0o == null) {
            OoooO(7);
            throw null;
        }
        if (o000oooo2 != null) {
            return new C32699OoooOO0(interfaceC32596OooO0o0, null, c20364OooO00o, c33479OooO0o, oooO00o, o000oooo2);
        }
        OoooO(9);
        throw null;
    }

    @Override // oO0O0Oo0.AbstractC32682OooOoo, oO0O0OO.InterfaceC32609OooOo0
    public InterfaceC32609OooOo0.OooO00o<? extends InterfaceC32632OoooOO0> Oooo() {
        return o00000OO(C33356ooOO.f120633OooO0O0);
    }

    @Override // oO0O0Oo0.AbstractC32682OooOoo
    public AbstractC32682OooOoo o000000o(OooO0O0.OooO00o oooO00o, oO0O0OO.OooOO0O oooOO0O, InterfaceC32609OooOo0 interfaceC32609OooOo0, oO0O0OO.o000oOoO o000oooo2, C33479OooO0o c33479OooO0o, InterfaceC34588OooO0oO interfaceC34588OooO0oO) {
        if (oooOO0O == null) {
            OoooO(25);
            throw null;
        }
        if (oooO00o == null) {
            OoooO(26);
            throw null;
        }
        if (interfaceC34588OooO0oO == null) {
            OoooO(27);
            throw null;
        }
        InterfaceC32632OoooOO0 interfaceC32632OoooOO0 = (InterfaceC32632OoooOO0) interfaceC32609OooOo0;
        if (c33479OooO0o == null) {
            c33479OooO0o = getName();
        }
        return new C32699OoooOO0(oooOO0O, interfaceC32632OoooOO0, interfaceC34588OooO0oO, c33479OooO0o, oooO00o, o000oooo2);
    }

    @Override // oO0O0Oo0.AbstractC32682OooOoo
    /* JADX INFO: renamed from: o00000oo, reason: merged with bridge method [inline-methods] */
    public InterfaceC32632OoooOO0 OooOOoo(InterfaceC32596OooO0o0 interfaceC32596OooO0o0, EnumC32614OooOoOO enumC32614OooOoOO, AbstractC32600OooOOOo abstractC32600OooOOOo) {
        return (InterfaceC32632OoooOO0) super.OooOOoo(interfaceC32596OooO0o0, enumC32614OooOoOO, abstractC32600OooOOOo);
    }

    @Override // oO0O0Oo0.AbstractC32682OooOoo, oO0O0Oo0.AbstractC32675OooOOoo
    /* JADX INFO: renamed from: o0000O00, reason: merged with bridge method [inline-methods] */
    public final InterfaceC32632OoooOO0 o000OOo() {
        InterfaceC32632OoooOO0 interfaceC32632OoooOO0 = (InterfaceC32632OoooOO0) super.o000OOo();
        if (interfaceC32632OoooOO0 != null) {
            return interfaceC32632OoooOO0;
        }
        OoooO(24);
        throw null;
    }

    public C32699OoooOO0 o0000oO(C32695OoooO c32695OoooO, InterfaceC32629OoooO0 interfaceC32629OoooO0, List list, List list2, List list3, AbstractC33320OooOoo abstractC33320OooOoo, EnumC32614OooOoOO enumC32614OooOoOO, AbstractC32601OooOOo abstractC32601OooOOo, Map map) {
        if (list == null) {
            OoooO(19);
            throw null;
        }
        if (list2 == null) {
            OoooO(20);
            throw null;
        }
        if (list3 == null) {
            OoooO(21);
            throw null;
        }
        if (abstractC32601OooOOo == null) {
            OoooO(22);
            throw null;
        }
        super.o00000O(c32695OoooO, interfaceC32629OoooO0, list, list2, list3, abstractC33320OooOoo, enumC32614OooOoOO, abstractC32601OooOOo);
        if (map != null && !map.isEmpty()) {
            this.f117464OoooOoO = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // oO0O0Oo0.AbstractC32682OooOoo
    /* JADX INFO: renamed from: o0000oo, reason: merged with bridge method [inline-methods] */
    public final C32699OoooOO0 o00000O(C32695OoooO c32695OoooO, InterfaceC32629OoooO0 interfaceC32629OoooO0, List list, List list2, List list3, AbstractC33320OooOoo abstractC33320OooOoo, EnumC32614OooOoOO enumC32614OooOoOO, AbstractC32601OooOOo abstractC32601OooOOo) {
        if (list == null) {
            OoooO(14);
            throw null;
        }
        if (list2 == null) {
            OoooO(15);
            throw null;
        }
        if (list3 == null) {
            OoooO(16);
            throw null;
        }
        if (abstractC32601OooOOo != null) {
            return o0000oO(c32695OoooO, interfaceC32629OoooO0, list, list2, list3, abstractC33320OooOoo, enumC32614OooOoOO, abstractC32601OooOOo, null);
        }
        OoooO(17);
        throw null;
    }
}
