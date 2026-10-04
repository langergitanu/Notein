package oO0O0Oo0;

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

/* JADX INFO: renamed from: oO0O0Oo0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C32672OooOOOo extends OooOOOO {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final EnumC32614OooOoOO f117415OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final oO0O0OO.OooO0o f117416OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C33306OooOOO0 f117417OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public oO0Oo0o0.OooOO0 f117418Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public Set<InterfaceC32595OooO0Oo> f117419Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public OooOOO f117420Oooo00o;

    /* JADX WARN: Illegal instructions before constructor call */
    public C32672OooOOOo(oO0O0OO.OooOO0O oooOO0O, C33479OooO0o c33479OooO0o, EnumC32614OooOoOO enumC32614OooOoOO, oO0O0OO.OooO0o oooO0o, Collection collection, C33361OooO0Oo c33361OooO0Oo) {
        o000oOoO.OooO00o oooO00o = oO0O0OO.o000oOoO.f117308OooO00o;
        if (oooOO0O == null) {
            o000OOo(0);
            throw null;
        }
        if (c33479OooO0o == null) {
            o000OOo(1);
            throw null;
        }
        if (c33361OooO0Oo == null) {
            o000OOo(6);
            throw null;
        }
        super(c33361OooO0Oo, oooOO0O, c33479OooO0o, oooO00o);
        this.f117415OooOoo = enumC32614OooOoOO;
        this.f117416OooOooO = oooO0o;
        this.f117417OooOooo = new C33306OooOOO0(this, Collections.EMPTY_LIST, collection, c33361OooO0Oo);
    }

    public static /* synthetic */ void o000OOo(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // oO0O0OO.InterfaceC32598OooO0oo
    public final InterfaceC33342OoooOo0 OooO() {
        C33306OooOOO0 c33306OooOOO0 = this.f117417OooOooo;
        if (c33306OooOOO0 != null) {
            return c33306OooOOO0;
        }
        o000OOo(10);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0, oO0O0OO.InterfaceC32612OooOoO
    public final EnumC32614OooOoOO OooO0oO() {
        EnumC32614OooOoOO enumC32614OooOoOO = this.f117415OooOoo;
        if (enumC32614OooOoOO != null) {
            return enumC32614OooOoOO;
        }
        o000OOo(16);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final Collection<InterfaceC32595OooO0Oo> OooOO0() {
        Set<InterfaceC32595OooO0Oo> set = this.f117419Oooo00O;
        if (set != null) {
            return set;
        }
        o000OOo(11);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0, oO0O0OO.OooO
    public final List<InterfaceC32637OoooOoo> OooOOOO() {
        List<InterfaceC32637OoooOoo> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        o000OOo(18);
        throw null;
    }

    @Override // oO0O0OO.OooO
    public final boolean OooOo00() {
        return false;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final InterfaceC32595OooO0Oo OooOo0o() {
        return this.f117420Oooo00o;
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
        oO0O0OO.OooO0o oooO0o = this.f117416OooOooO;
        if (oooO0o != null) {
            return oooO0o;
        }
        o000OOo(15);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0, oO0O0OO.OooOOOO, oO0O0OO.InterfaceC32612OooOoO
    public final AbstractC32601OooOOo getVisibility() {
        C32602OooOOo0.C32606OooO0oo c32606OooO0oo = C32602OooOOo0.f117243OooO0o0;
        if (c32606OooO0oo != null) {
            return c32606OooO0oo;
        }
        o000OOo(17);
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

    public final void o000000o(oO0Oo0o0.OooOO0 oooOO02, Set set, OooOOO oooOOO) {
        if (oooOO02 == null) {
            o000OOo(7);
            throw null;
        }
        this.f117418Oooo000 = oooOO02;
        this.f117419Oooo00O = set;
        this.f117420Oooo00o = oooOOO;
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
        o000OOo(14);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final InterfaceC32596OooO0o0 o00o0O() {
        return null;
    }

    @Override // oO0O0Oo0.AbstractC32688Oooo00o
    public final oO0Oo0o0.OooOO0 o0OoOo0(AbstractC33457OooO0oO abstractC33457OooO0oO) {
        if (abstractC33457OooO0oO == null) {
            o000OOo(12);
            throw null;
        }
        oO0Oo0o0.OooOO0 oooOO02 = this.f117418Oooo000;
        if (oooOO02 != null) {
            return oooOO02;
        }
        o000OOo(13);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final boolean ooOO() {
        return false;
    }

    public String toString() {
        return "class " + getName();
    }
}
