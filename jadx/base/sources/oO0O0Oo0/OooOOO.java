package oO0O0Oo0;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import oO0O0OO.AbstractC32600OooOOOo;
import oO0O0OO.AbstractC32601OooOOo;
import oO0O0OO.EnumC32614OooOoOO;
import oO0O0OO.InterfaceC32595OooO0Oo;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32609OooOo0;
import oO0O0OO.InterfaceC32629OoooO0;
import oO0O0OO.OooO0O0;
import oO0Ooo.C33356ooOO;
import oO0OooO0.C33479OooO0o;
import oO0OooO0.C33482OooO0oo;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public class OooOOO extends AbstractC32682OooOoo implements InterfaceC32595OooO0Oo {

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final boolean f117404OoooOoo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(InterfaceC32596OooO0o0 interfaceC32596OooO0o0, oO0O0OO.OooOO0 oooOO02, InterfaceC34588OooO0oO interfaceC34588OooO0oO, boolean z, OooO0O0.OooO00o oooO00o, oO0O0OO.o000oOoO o000oooo2) {
        super(oooO00o, interfaceC32596OooO0o0, oooOO02, o000oooo2, C33482OooO0oo.f120988OooO0o0, interfaceC34588OooO0oO);
        if (interfaceC32596OooO0o0 == null) {
            OoooO(0);
            throw null;
        }
        if (interfaceC34588OooO0oO == null) {
            OoooO(1);
            throw null;
        }
        if (oooO00o == null) {
            OoooO(2);
            throw null;
        }
        if (o000oooo2 == null) {
            OoooO(3);
            throw null;
        }
        this.f117404OoooOoo = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void OoooO(int i) {
        String str;
        int i2;
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 27) {
            switch (i) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // oO0O0Oo0.AbstractC32682OooOoo, oO0O0OO.OooO0O0, oO0O0OO.OooO00o
    public final Collection<? extends InterfaceC32609OooOo0> OooOO0o() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        OoooO(21);
        throw null;
    }

    @Override // oO0O0Oo0.AbstractC32682OooOoo, oO0O0OO.OooO0O0
    public final oO0O0OO.OooO0O0 OooOOoo(InterfaceC32596OooO0o0 interfaceC32596OooO0o0, EnumC32614OooOoOO enumC32614OooOoOO, AbstractC32600OooOOOo abstractC32600OooOOOo) {
        return (InterfaceC32595OooO0Oo) super.OooOOoo(interfaceC32596OooO0o0, enumC32614OooOoOO, abstractC32600OooOOOo);
    }

    @Override // oO0O0OO.OooOO0
    public final InterfaceC32596OooO0o0 Oooo00O() {
        InterfaceC32596OooO0o0 interfaceC32596OooO0o0OooO0Oo = OooO0Oo();
        if (interfaceC32596OooO0o0OooO0Oo != null) {
            return interfaceC32596OooO0o0OooO0Oo;
        }
        OoooO(18);
        throw null;
    }

    @Override // oO0O0Oo0.AbstractC32682OooOoo, oO0O0OO.OooO0O0
    public final void Oooo0oO(Collection<? extends oO0O0OO.OooO0O0> collection) {
        if (collection != null) {
            return;
        }
        OoooO(22);
        throw null;
    }

    @Override // oO0O0OO.OooOO0
    public final boolean Oooooo() {
        return this.f117404OoooOoo;
    }

    @Override // oO0O0Oo0.AbstractC32675OooOOoo, oO0O0OO.OooOO0O
    /* JADX INFO: renamed from: o0000, reason: merged with bridge method [inline-methods] */
    public final InterfaceC32596OooO0o0 OooO0Oo() {
        InterfaceC32596OooO0o0 interfaceC32596OooO0o0 = (InterfaceC32596OooO0o0) super.OooO0Oo();
        if (interfaceC32596OooO0o0 != null) {
            return interfaceC32596OooO0o0;
        }
        OoooO(17);
        throw null;
    }

    @Override // oO0O0Oo0.AbstractC32682OooOoo
    /* JADX INFO: renamed from: o000000O */
    public final InterfaceC32609OooOo0 OooOOoo(InterfaceC32596OooO0o0 interfaceC32596OooO0o0, EnumC32614OooOoOO enumC32614OooOoOO, AbstractC32600OooOOOo abstractC32600OooOOOo) {
        return (InterfaceC32595OooO0Oo) super.OooOOoo(interfaceC32596OooO0o0, enumC32614OooOoOO, abstractC32600OooOOOo);
    }

    @Override // oO0O0Oo0.AbstractC32682OooOoo
    /* JADX INFO: renamed from: o00000oo, reason: merged with bridge method [inline-methods] */
    public OooOOO o000000o(OooO0O0.OooO00o oooO00o, oO0O0OO.OooOO0O oooOO0O, InterfaceC32609OooOo0 interfaceC32609OooOo0, oO0O0OO.o000oOoO o000oooo2, C33479OooO0o c33479OooO0o, InterfaceC34588OooO0oO interfaceC34588OooO0oO) {
        if (oooOO0O == null) {
            OoooO(23);
            throw null;
        }
        if (oooO00o == null) {
            OoooO(24);
            throw null;
        }
        if (interfaceC34588OooO0oO == null) {
            OoooO(25);
            throw null;
        }
        OooO0O0.OooO00o oooO00o2 = OooO0O0.OooO00o.f117222OooOo0o;
        if (oooO00o == oooO00o2 || oooO00o == OooO0O0.OooO00o.f117223OooOoO) {
            return new OooOOO((InterfaceC32596OooO0o0) oooOO0O, this, interfaceC34588OooO0oO, this.f117404OoooOoo, oooO00o2, o000oooo2);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + oooOO0O + "\nkind: " + oooO00o);
    }

    public final void o0000O00(List list, AbstractC32601OooOOo abstractC32601OooOOo) {
        if (list == null) {
            OoooO(13);
            throw null;
        }
        if (abstractC32601OooOOo != null) {
            o0000oo(list, abstractC32601OooOOo, OooO0Oo().OooOOOO());
        } else {
            OoooO(14);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0000oo(List list, AbstractC32601OooOOo abstractC32601OooOOo, List list2) {
        InterfaceC32629OoooO0 interfaceC32629OoooO0OoooO00;
        List<InterfaceC32629OoooO0> listOooooOO;
        if (list == null) {
            OoooO(10);
            throw null;
        }
        if (abstractC32601OooOOo == null) {
            OoooO(11);
            throw null;
        }
        if (list2 == null) {
            OoooO(12);
            throw null;
        }
        InterfaceC32596OooO0o0 interfaceC32596OooO0o0OooO0Oo = OooO0Oo();
        if (interfaceC32596OooO0o0OooO0Oo.OooOo00()) {
            oO0O0OO.OooOO0O oooOO0OOooO0Oo = interfaceC32596OooO0o0OooO0Oo.OooO0Oo();
            interfaceC32629OoooO0OoooO00 = oooOO0OOooO0Oo instanceof InterfaceC32596OooO0o0 ? ((InterfaceC32596OooO0o0) oooOO0OOooO0Oo).OoooO00() : null;
        }
        InterfaceC32596OooO0o0 interfaceC32596OooO0o0OooO0Oo2 = OooO0Oo();
        if (interfaceC32596OooO0o0OooO0Oo2.OooooOO().isEmpty()) {
            listOooooOO = Collections.EMPTY_LIST;
            if (listOooooOO == null) {
                OoooO(16);
                throw null;
            }
        } else {
            listOooooOO = interfaceC32596OooO0o0OooO0Oo2.OooooOO();
            if (listOooooOO == null) {
                OoooO(15);
                throw null;
            }
        }
        o00000O(null, interfaceC32629OoooO0OoooO00, listOooooOO, list2, list, null, EnumC32614OooOoOO.f117261OooOo0o, abstractC32601OooOOo);
    }

    @Override // oO0O0Oo0.AbstractC32682OooOoo, oO0O0OO.OooOO0O
    public final <R, D> R o0O0O00(oO0O0OO.OooOOO0<R, D> oooOOO0, D d) {
        return (R) oooOOO0.OooO0oo(this, d);
    }

    @Override // oO0O0Oo0.AbstractC32682OooOoo, oO0O0OO.InterfaceC32609OooOo0, oO0O0OO.InterfaceC32634OoooOOo
    public final InterfaceC32595OooO0Oo OooO0O0(C33356ooOO c33356ooOO) {
        if (c33356ooOO != null) {
            return (InterfaceC32595OooO0Oo) super.OooO0O0(c33356ooOO);
        }
        OoooO(20);
        throw null;
    }

    @Override // oO0O0Oo0.AbstractC32682OooOoo, oO0O0Oo0.AbstractC32675OooOOoo
    /* JADX INFO: renamed from: OooO00o */
    public final InterfaceC32595OooO0Oo o000OOo() {
        InterfaceC32595OooO0Oo interfaceC32595OooO0Oo = (InterfaceC32595OooO0Oo) super.o000OOo();
        if (interfaceC32595OooO0Oo != null) {
            return interfaceC32595OooO0Oo;
        }
        OoooO(19);
        throw null;
    }
}
