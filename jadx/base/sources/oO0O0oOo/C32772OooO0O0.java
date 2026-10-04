package oO0O0oOo;

import com.android.billingclient.api.OooOO0;
import java.util.ArrayList;
import oO00ooO.C32443OooOOO;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32609OooOo0;
import oO0O0OO.OooO00o;
import oO0O0OO.OooO0O0;
import oO0O0OO.OooOO0O;
import oO0O0OO.o000oOoO;
import oO0O0Oo0.AbstractC32682OooOoo;
import oO0O0Oo0.OooOOO;
import oO0OOOo.C32990OooO0oo;
import oO0Ooo.AbstractC33320OooOoo;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34434OooOoO;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0O0oOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32772OooO0O0 extends OooOOO implements InterfaceC32771OooO00o {

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public Boolean f117738Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public Boolean f117739Ooooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32772OooO0O0(InterfaceC32596OooO0o0 interfaceC32596OooO0o0, C32772OooO0O0 c32772OooO0O0, InterfaceC34588OooO0oO interfaceC34588OooO0oO, boolean z, OooO0O0.OooO00o oooO00o, o000oOoO o000oooo2) {
        super(interfaceC32596OooO0o0, c32772OooO0O0, interfaceC34588OooO0oO, z, oooO00o, o000oooo2);
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
        this.f117738Ooooo00 = null;
        this.f117739Ooooo0o = null;
    }

    public static /* synthetic */ void OoooO(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static C32772OooO0O0 o0000oO(InterfaceC32596OooO0o0 interfaceC32596OooO0o0, InterfaceC34588OooO0oO interfaceC34588OooO0oO, boolean z, ooOOO00O.OooO00o oooO00o) {
        if (interfaceC32596OooO0o0 == null) {
            OoooO(4);
            throw null;
        }
        if (oooO00o != null) {
            return new C32772OooO0O0(interfaceC32596OooO0o0, null, interfaceC34588OooO0oO, z, OooO0O0.OooO00o.f117222OooOo0o, oooO00o);
        }
        OoooO(6);
        throw null;
    }

    @Override // oO0O0oOo.InterfaceC32771OooO00o
    public final InterfaceC32771OooO00o Oooo0O0(AbstractC33320OooOoo abstractC33320OooOoo, ArrayList arrayList, AbstractC33320OooOoo abstractC33320OooOoo2, C32443OooOOO c32443OooOOO) {
        C32772OooO0O0 c32772OooO0O0O0000O0 = o0000O0(OooO0Oo(), null, getKind(), getAnnotations(), getSource());
        c32772OooO0O0O0000O0.o00000O(abstractC33320OooOoo == null ? null : C32990OooO0oo.OooO0oo(c32772OooO0O0O0000O0, abstractC33320OooOoo, InterfaceC34588OooO0oO.OooO00o.f123919OooO00o), this.f117447Oooo000, C34434OooOoO.f123453OooOo0o, getTypeParameters(), OooOO0.OooO00o(arrayList, OooO0o(), c32772OooO0O0O0000O0), abstractC33320OooOoo2, OooO0oO(), getVisibility());
        if (c32443OooOOO != null) {
            c32772OooO0O0O0000O0.o00000Oo((OooO00o.InterfaceC20249OooO00o) c32443OooOOO.f116638OooOo0o, c32443OooOOO.f116637OooOo);
        }
        return c32772OooO0O0O0000O0;
    }

    @Override // oO0O0Oo0.AbstractC32682OooOoo, oO0O0OO.OooO00o
    public final boolean Ooooooo() {
        return this.f117739Ooooo0o.booleanValue();
    }

    @Override // oO0O0Oo0.OooOOO, oO0O0Oo0.AbstractC32682OooOoo
    public final /* bridge */ /* synthetic */ AbstractC32682OooOoo o000000o(OooO0O0.OooO00o oooO00o, OooOO0O oooOO0O, InterfaceC32609OooOo0 interfaceC32609OooOo0, o000oOoO o000oooo2, C33479OooO0o c33479OooO0o, InterfaceC34588OooO0oO interfaceC34588OooO0oO) {
        return o0000O0(oooOO0O, interfaceC32609OooOo0, oooO00o, interfaceC34588OooO0oO, o000oooo2);
    }

    @Override // oO0O0Oo0.AbstractC32682OooOoo
    public final void o00000o0(boolean z) {
        this.f117738Ooooo00 = Boolean.valueOf(z);
    }

    @Override // oO0O0Oo0.OooOOO
    /* JADX INFO: renamed from: o00000oo */
    public final /* bridge */ /* synthetic */ OooOOO o000000o(OooO0O0.OooO00o oooO00o, OooOO0O oooOO0O, InterfaceC32609OooOo0 interfaceC32609OooOo0, o000oOoO o000oooo2, C33479OooO0o c33479OooO0o, InterfaceC34588OooO0oO interfaceC34588OooO0oO) {
        return o0000O0(oooOO0O, interfaceC32609OooOo0, oooO00o, interfaceC34588OooO0oO, o000oooo2);
    }

    public final C32772OooO0O0 o0000O0(OooOO0O oooOO0O, InterfaceC32609OooOo0 interfaceC32609OooOo0, OooO0O0.OooO00o oooO00o, InterfaceC34588OooO0oO interfaceC34588OooO0oO, o000oOoO o000oooo2) {
        if (oooOO0O == null) {
            OoooO(7);
            throw null;
        }
        if (oooO00o == null) {
            OoooO(8);
            throw null;
        }
        if (interfaceC34588OooO0oO == null) {
            OoooO(9);
            throw null;
        }
        if (o000oooo2 == null) {
            OoooO(10);
            throw null;
        }
        if (oooO00o != OooO0O0.OooO00o.f117222OooOo0o && oooO00o != OooO0O0.OooO00o.f117223OooOoO) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + oooOO0O + "\nkind: " + oooO00o);
        }
        C32772OooO0O0 c32772OooO0O0 = new C32772OooO0O0((InterfaceC32596OooO0o0) oooOO0O, (C32772OooO0O0) interfaceC32609OooOo0, interfaceC34588OooO0oO, this.f117404OoooOoo, oooO00o, o000oooo2);
        Boolean bool = this.f117738Ooooo00;
        bool.getClass();
        c32772OooO0O0.f117738Ooooo00 = bool;
        Boolean bool2 = this.f117739Ooooo0o;
        bool2.getClass();
        c32772OooO0O0.f117739Ooooo0o = bool2;
        return c32772OooO0O0;
    }

    @Override // oO0O0Oo0.AbstractC32682OooOoo
    public final void o0000Ooo(boolean z) {
        this.f117739Ooooo0o = Boolean.valueOf(z);
    }
}
