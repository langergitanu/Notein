package oO0O0Oo0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import oO0O0OO.AbstractC32601OooOOo;
import oO0O0OO.AbstractC32639Ooooo0o;
import oO0O0OO.C32602OooOOo0;
import oO0O0OO.EnumC32614OooOoOO;
import oO0O0OO.InterfaceC32595OooO0Oo;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0O0OO.o000oOoO;
import oO0Oo0o0.OooOO0;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.C33306OooOOO0;
import oO0Ooo.InterfaceC33342OoooOo0;
import oO0Ooo0.C33361OooO0Oo;
import oO0OooO.AbstractC33457OooO0oO;
import oO0OooO0.C33479OooO0o;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0O0Oo0.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32691Oooo0o extends OooOOOO {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final oO0O0OO.OooO0o f117517OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public EnumC32614OooOoOO f117518OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public C32602OooOOo0.C32606OooO0oo f117519OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final C33361OooO0Oo.OooO00o f117520Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public C33306OooOOO0 f117521Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public ArrayList f117522Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final ArrayList f117523Oooo00o;

    /* JADX WARN: Illegal instructions before constructor call */
    public C32691Oooo0o(OooOo00 oooOo00, C33479OooO0o c33479OooO0o, C33361OooO0Oo.OooO00o oooO00o) {
        oO0O0OO.OooO0o oooO0o = oO0O0OO.OooO0o.f117229OooOo;
        o000oOoO.OooO00o oooO00o2 = oO0O0OO.o000oOoO.f117308OooO00o;
        if (c33479OooO0o == null) {
            o000OOo(2);
            throw null;
        }
        if (oooO00o == null) {
            o000OOo(4);
            throw null;
        }
        super(oooO00o, oooOo00, c33479OooO0o, oooO00o2);
        this.f117523Oooo00o = new ArrayList();
        this.f117520Oooo0 = oooO00o;
        this.f117517OooOoo = oooO0o;
    }

    public static /* synthetic */ void o000OOo(int i) {
        String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // oO0O0OO.InterfaceC32598OooO0oo
    public final InterfaceC33342OoooOo0 OooO() {
        C33306OooOOO0 c33306OooOOO0 = this.f117521Oooo000;
        if (c33306OooOOO0 != null) {
            return c33306OooOOO0;
        }
        o000OOo(11);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0, oO0O0OO.InterfaceC32612OooOoO
    public final EnumC32614OooOoOO OooO0oO() {
        EnumC32614OooOoOO enumC32614OooOoOO = this.f117518OooOooO;
        if (enumC32614OooOoOO != null) {
            return enumC32614OooOoOO;
        }
        o000OOo(7);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final Collection OooOO0() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        o000OOo(13);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0, oO0O0OO.OooO
    public final List<InterfaceC32637OoooOoo> OooOOOO() {
        ArrayList arrayList = this.f117522Oooo00O;
        if (arrayList != null) {
            return arrayList;
        }
        o000OOo(15);
        throw null;
    }

    @Override // oO0O0OO.OooO
    public final boolean OooOo00() {
        return false;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final InterfaceC32595OooO0Oo OooOo0o() {
        return null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final Collection<InterfaceC32596OooO0o0> OoooO0O() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        o000OOo(19);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final AbstractC32639Ooooo0o<AbstractC33328Oooo0O0> Ooooo00() {
        return null;
    }

    @Override // oO0O0OO.InterfaceC32612OooOoO
    public final boolean OooooO0() {
        return false;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final boolean Oooooo0() {
        return false;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final boolean OoooooO() {
        return false;
    }

    @Override // oOo0oooO.OooO00o
    public final InterfaceC34588OooO0oO getAnnotations() {
        return InterfaceC34588OooO0oO.OooO00o.f123919OooO00o;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final oO0O0OO.OooO0o getKind() {
        oO0O0OO.OooO0o oooO0o = this.f117517OooOoo;
        if (oooO0o != null) {
            return oooO0o;
        }
        o000OOo(8);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0, oO0O0OO.OooOOOO, oO0O0OO.InterfaceC32612OooOoO
    public final AbstractC32601OooOOo getVisibility() {
        C32602OooOOo0.C32606OooO0oo c32606OooO0oo = this.f117519OooOooo;
        if (c32606OooO0oo != null) {
            return c32606OooO0oo;
        }
        o000OOo(10);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final boolean isInline() {
        return false;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final boolean o000000() {
        return false;
    }

    @Override // oO0O0OO.InterfaceC32612OooOoO
    public final boolean o00Oo0() {
        return false;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final oO0Oo0o0.OooOO0 o00Ooo() {
        OooOO0.OooO0O0 oooO0O0 = OooOO0.OooO0O0.f120222OooO0O0;
        if (oooO0O0 != null) {
            return oooO0O0;
        }
        o000OOo(18);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final InterfaceC32596OooO0o0 o00o0O() {
        return null;
    }

    @Override // oO0O0Oo0.AbstractC32688Oooo00o
    public final oO0Oo0o0.OooOO0 o0OoOo0(AbstractC33457OooO0oO abstractC33457OooO0oO) {
        if (abstractC33457OooO0oO == null) {
            o000OOo(16);
            throw null;
        }
        OooOO0.OooO0O0 oooO0O0 = OooOO0.OooO0O0.f120222OooO0O0;
        if (oooO0O0 != null) {
            return oooO0O0;
        }
        o000OOo(17);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final boolean ooOO() {
        return false;
    }

    public final String toString() {
        return AbstractC32673OooOOo.o0OoOo0(this);
    }
}
