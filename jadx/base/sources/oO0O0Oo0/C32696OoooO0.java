package oO0O0Oo0;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import oO0O0OO.AbstractC32601OooOOo;
import oO0O0OO.EnumC32614OooOoOO;
import oO0O0OO.InterfaceC32619Oooo;
import oO0O0OO.InterfaceC32627Oooo0oo;
import oO0O0OO.InterfaceC32641OooooOO;
import oO0O0OO.OooO0O0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0OooO0.C33479OooO0o;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0O0Oo0.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32696OoooO0 extends AbstractC32686Oooo implements InterfaceC32619Oooo {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public AbstractC33320OooOoo f117541Oooo0;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final InterfaceC32619Oooo f117542Oooo0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32696OoooO0(InterfaceC32627Oooo0oo interfaceC32627Oooo0oo, InterfaceC34588OooO0oO interfaceC34588OooO0oO, EnumC32614OooOoOO enumC32614OooOoOO, AbstractC32601OooOOo abstractC32601OooOOo, boolean z, boolean z2, boolean z3, OooO0O0.OooO00o oooO00o, InterfaceC32619Oooo interfaceC32619Oooo, oO0O0OO.o000oOoO o000oooo2) {
        super(enumC32614OooOoOO, abstractC32601OooOOo, interfaceC32627Oooo0oo, interfaceC34588OooO0oO, C33479OooO0o.OooO0oO("<get-" + interfaceC32627Oooo0oo.getName() + ">"), z, z2, z3, oooO00o, o000oooo2);
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
        if (oooO00o == null) {
            OoooO(4);
            throw null;
        }
        if (o000oooo2 == null) {
            OoooO(5);
            throw null;
        }
        this.f117542Oooo0O0 = interfaceC32619Oooo != null ? interfaceC32619Oooo : this;
    }

    public static /* synthetic */ void OoooO(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // oO0O0OO.OooO00o
    public final List<InterfaceC32641OooooOO> OooO0o() {
        List<InterfaceC32641OooooOO> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        OoooO(7);
        throw null;
    }

    @Override // oO0O0OO.OooO0O0, oO0O0OO.OooO00o
    public final Collection<? extends InterfaceC32619Oooo> OooOO0o() {
        return o000000o(true);
    }

    @Override // oO0O0OO.OooO00o
    public final AbstractC33320OooOoo getReturnType() {
        return this.f117541Oooo0;
    }

    @Override // oO0O0Oo0.AbstractC32686Oooo, oO0O0Oo0.AbstractC32675OooOOoo
    /* JADX INFO: renamed from: o00000, reason: merged with bridge method [inline-methods] */
    public final InterfaceC32619Oooo o000OOo() {
        InterfaceC32619Oooo interfaceC32619Oooo = this.f117542Oooo0O0;
        if (interfaceC32619Oooo != null) {
            return interfaceC32619Oooo;
        }
        OoooO(8);
        throw null;
    }

    public final void o00000O0(AbstractC33320OooOoo abstractC33320OooOoo) {
        if (abstractC33320OooOoo == null) {
            abstractC33320OooOoo = Ooooo0o().getType();
        }
        this.f117541Oooo0 = abstractC33320OooOoo;
    }

    @Override // oO0O0OO.OooOO0O
    public final <R, D> R o0O0O00(oO0O0OO.OooOOO0<R, D> oooOOO0, D d) {
        return (R) oooOOO0.OooO0Oo(this, d);
    }
}
