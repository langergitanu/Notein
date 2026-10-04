package oO0O0oOo;

import java.util.ArrayList;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;
import oO0O0O0o.C32593OooOOo;
import oO0O0O0o.OooOO0;
import oO0O0OO.AbstractC32601OooOOo;
import oO0O0OO.EnumC32614OooOoOO;
import oO0O0OO.InterfaceC32627Oooo0oo;
import oO0O0OO.InterfaceC32641OooooOO;
import oO0O0OO.OooO00o;
import oO0O0OO.OooO0O0;
import oO0O0OO.OooOO0O;
import oO0O0OO.o000oOoO;
import oO0O0Oo0.C32696OoooO0;
import oO0O0Oo0.C32697OoooO00;
import oO0O0Oo0.C32698OoooO0O;
import oO0O0ooo.C32844OooO0o;
import oO0O0ooo.C32878OooOoO0;
import oO0OOOo.C32990OooO0oo;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.o00Oo0;
import oO0OooO.InterfaceC33452OooO0O0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34434OooOoO;
import oOo00OOo.C34498OooO0o0;
import oOo0oooO.InterfaceC34588OooO0oO;
import ooOOO0Oo.C35048OooOoo0;

/* JADX INFO: renamed from: oO0O0oOo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C32775OooO0o extends C32697OoooO00 implements InterfaceC32771OooO00o {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final boolean f117743OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final C32443OooOOO<OooO00o.InterfaceC20249OooO00o<?>, ?> f117744OoooOOo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32775OooO0o(OooOO0O oooOO0O, InterfaceC34588OooO0oO interfaceC34588OooO0oO, EnumC32614OooOoOO enumC32614OooOoOO, AbstractC32601OooOOo abstractC32601OooOOo, boolean z, C33479OooO0o c33479OooO0o, o000oOoO o000oooo2, InterfaceC32627Oooo0oo interfaceC32627Oooo0oo, OooO0O0.OooO00o oooO00o, boolean z2, C32443OooOOO<OooO00o.InterfaceC20249OooO00o<?>, ?> c32443OooOOO) {
        super(oooOO0O, interfaceC32627Oooo0oo, interfaceC34588OooO0oO, enumC32614OooOoOO, abstractC32601OooOOo, z, c33479OooO0o, oooO00o, o000oooo2, false, false, false, false, false);
        if (oooOO0O == null) {
            OoooO(0);
            throw null;
        }
        if (interfaceC34588OooO0oO == null) {
            OoooO(1);
            throw null;
        }
        if (enumC32614OooOoOO == null) {
            OoooO(2);
            throw null;
        }
        if (abstractC32601OooOOo == null) {
            OoooO(3);
            throw null;
        }
        if (c33479OooO0o == null) {
            OoooO(4);
            throw null;
        }
        if (o000oooo2 == null) {
            OoooO(5);
            throw null;
        }
        if (oooO00o == null) {
            OoooO(6);
            throw null;
        }
        this.f117743OoooOOO = z2;
        this.f117744OoooOOo = c32443OooOOO;
    }

    public static /* synthetic */ void OoooO(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(str2);
        }
    }

    public static C32775OooO0o o00000o0(OooOO0O oooOO0O, C34498OooO0o0 c34498OooO0o0, AbstractC32601OooOOo abstractC32601OooOOo, boolean z, C33479OooO0o c33479OooO0o, ooOOO00O.OooO00o oooO00o, boolean z2) {
        EnumC32614OooOoOO enumC32614OooOoOO = EnumC32614OooOoOO.f117261OooOo0o;
        if (oooOO0O == null) {
            OoooO(7);
            throw null;
        }
        if (c33479OooO0o == null) {
            OoooO(11);
            throw null;
        }
        if (oooO00o != null) {
            return new C32775OooO0o(oooOO0O, c34498OooO0o0, enumC32614OooOoOO, abstractC32601OooOOo, z, c33479OooO0o, oooO00o, null, OooO0O0.OooO00o.f117222OooOo0o, z2, null);
        }
        OoooO(12);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooO00o] */
    @Override // oO0O0oOo.InterfaceC32771OooO00o
    public final InterfaceC32771OooO00o Oooo0O0(AbstractC33320OooOoo abstractC33320OooOoo, ArrayList arrayList, AbstractC33320OooOoo abstractC33320OooOoo2, C32443OooOOO c32443OooOOO) {
        AbstractC33320OooOoo abstractC33320OooOoo3;
        C32696OoooO0 c32696OoooO0;
        C32698OoooO0O c32698OoooO0O;
        InterfaceC32627Oooo0oo interfaceC32627Oooo0ooO000OOo = o000OOo() == this ? null : o000OOo();
        C32775OooO0o c32775OooO0o = new C32775OooO0o(OooO0Oo(), getAnnotations(), OooO0oO(), getVisibility(), this.f117594OooOoo0, getName(), getSource(), interfaceC32627Oooo0ooO000OOo, getKind(), this.f117743OoooOOO, c32443OooOOO);
        C32696OoooO0 c32696OoooO02 = this.f117558OoooO0O;
        if (c32696OoooO02 != null) {
            C32696OoooO0 c32696OoooO03 = new C32696OoooO0(c32775OooO0o, c32696OoooO02.getAnnotations(), c32696OoooO02.OooO0oO(), c32696OoooO02.getVisibility(), c32696OoooO02.f117494OooOoOO, c32696OoooO02.f117496OooOoo0, c32696OoooO02.f117498OooOooo, getKind(), interfaceC32627Oooo0ooO000OOo == null ? null : interfaceC32627Oooo0ooO000OOo.getGetter(), c32696OoooO02.getSource());
            c32696OoooO03.f117501Oooo00o = c32696OoooO02.f117501Oooo00o;
            abstractC33320OooOoo3 = abstractC33320OooOoo2;
            c32696OoooO03.f117541Oooo0 = abstractC33320OooOoo3;
            c32696OoooO0 = c32696OoooO03;
        } else {
            abstractC33320OooOoo3 = abstractC33320OooOoo2;
            c32696OoooO0 = null;
        }
        C32698OoooO0O c32698OoooO0O2 = this.f117555OoooO;
        if (c32698OoooO0O2 != null) {
            c32698OoooO0O = new C32698OoooO0O(c32775OooO0o, c32698OoooO0O2.getAnnotations(), c32698OoooO0O2.OooO0oO(), c32698OoooO0O2.getVisibility(), c32698OoooO0O2.f117494OooOoOO, c32698OoooO0O2.f117496OooOoo0, c32698OoooO0O2.f117498OooOooo, getKind(), interfaceC32627Oooo0ooO000OOo == null ? null : interfaceC32627Oooo0ooO000OOo.OooO0o0(), c32698OoooO0O2.getSource());
            c32698OoooO0O.f117501Oooo00o = c32698OoooO0O.f117501Oooo00o;
            InterfaceC32641OooooOO interfaceC32641OooooOO = c32698OoooO0O2.OooO0o().get(0);
            if (interfaceC32641OooooOO == null) {
                C32698OoooO0O.OoooO(6);
                throw null;
            }
            c32698OoooO0O.f117572Oooo0 = interfaceC32641OooooOO;
        } else {
            c32698OoooO0O = null;
        }
        c32775OooO0o.o00000O(c32696OoooO0, c32698OoooO0O, this.f117559OoooOO0, this.f117560o000oOoO);
        ?? r2 = this.f117595OooOooO;
        if (r2 != 0) {
            c32775OooO0o.o000000O(this.f117593OooOoo, r2);
        }
        c32775OooO0o.Oooo0oO(OooOO0o());
        c32775OooO0o.o00000Oo(abstractC33320OooOoo3, getTypeParameters(), this.f117544Oooo, abstractC33320OooOoo != null ? C32990OooO0oo.OooO0oo(this, abstractC33320OooOoo, InterfaceC34588OooO0oO.OooO00o.f123919OooO00o) : null, C34434OooOoO.f123453OooOo0o);
        return c32775OooO0o;
    }

    @Override // oO0O0Oo0.AbstractC32706Ooooo0o, oO0O0OO.OooO00o
    public final boolean Ooooooo() {
        return false;
    }

    @Override // oO0O0Oo0.C32697OoooO00, oO0O0OO.InterfaceC32642OooooOo
    public final boolean isConst() {
        AbstractC33320OooOoo type = getType();
        if (!this.f117743OoooOOO) {
            return false;
        }
        OooOOO0.OooO0oO(type, "type");
        if (((!OooOO0.Oooo000(type) && !C32593OooOOo.OooO00o(type)) || o00Oo0.OooO0o(type)) && !OooOO0.Oooo00O(type)) {
            return false;
        }
        C32844OooO0o c32844OooO0o = C32878OooOoO0.f117976OooO00o;
        C33477OooO0OO ENHANCED_NULLABILITY_ANNOTATION = C35048OooOoo0.f125865OooOOOo;
        OooOOO0.OooO0o(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return !InterfaceC33452OooO0O0.OooO00o.OooOo00(type, ENHANCED_NULLABILITY_ANNOTATION) || OooOO0.Oooo00O(type);
    }

    @Override // oO0O0Oo0.C32697OoooO00
    public final C32697OoooO00 o00000O0(OooOO0O oooOO0O, EnumC32614OooOoOO enumC32614OooOoOO, AbstractC32601OooOOo abstractC32601OooOOo, InterfaceC32627Oooo0oo interfaceC32627Oooo0oo, OooO0O0.OooO00o oooO00o, C33479OooO0o c33479OooO0o) {
        o000oOoO.OooO00o oooO00o2 = o000oOoO.f117308OooO00o;
        if (oooOO0O == null) {
            OoooO(13);
            throw null;
        }
        if (enumC32614OooOoOO == null) {
            OoooO(14);
            throw null;
        }
        if (abstractC32601OooOOo == null) {
            OoooO(15);
            throw null;
        }
        if (oooO00o == null) {
            OoooO(16);
            throw null;
        }
        if (c33479OooO0o == null) {
            OoooO(17);
            throw null;
        }
        return new C32775OooO0o(oooOO0O, getAnnotations(), enumC32614OooOoOO, abstractC32601OooOOo, this.f117594OooOoo0, c33479OooO0o, oooO00o2, interfaceC32627Oooo0oo, oooO00o, this.f117743OoooOOO, this.f117744OoooOOo);
    }

    @Override // oO0O0Oo0.C32697OoooO00
    public final void o00000OO(AbstractC33320OooOoo abstractC33320OooOoo) {
    }

    @Override // oO0O0Oo0.C32697OoooO00, oO0O0OO.OooO00o
    public final <V> V o00O0O(OooO00o.InterfaceC20249OooO00o<V> interfaceC20249OooO00o) {
        C32443OooOOO<OooO00o.InterfaceC20249OooO00o<?>, ?> c32443OooOOO = this.f117744OoooOOo;
        if (c32443OooOOO == null || !c32443OooOOO.f116638OooOo0o.equals(interfaceC20249OooO00o)) {
            return null;
        }
        return (V) c32443OooOOO.f116637OooOo;
    }
}
