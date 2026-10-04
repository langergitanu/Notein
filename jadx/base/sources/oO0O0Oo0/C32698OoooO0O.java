package oO0O0Oo0;

import com.huawei.hms.network.embedded.C18437z2;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import oO0O0OO.AbstractC32601OooOOo;
import oO0O0OO.EnumC32614OooOoOO;
import oO0O0OO.InterfaceC32627Oooo0oo;
import oO0O0OO.InterfaceC32630OoooO00;
import oO0O0OO.InterfaceC32641OooooOO;
import oO0O0OO.OooO0O0;
import oO0Oo00.C33194OooO0O0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0OooO0.C33479OooO0o;
import oO0OooO0.C33482OooO0oo;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0O0Oo0.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32698OoooO0O extends AbstractC32686Oooo implements InterfaceC32630OoooO00 {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public InterfaceC32641OooooOO f117572Oooo0;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final InterfaceC32630OoooO00 f117573Oooo0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32698OoooO0O(InterfaceC32627Oooo0oo interfaceC32627Oooo0oo, InterfaceC34588OooO0oO interfaceC34588OooO0oO, EnumC32614OooOoOO enumC32614OooOoOO, AbstractC32601OooOOo abstractC32601OooOOo, boolean z, boolean z2, boolean z3, OooO0O0.OooO00o oooO00o, InterfaceC32630OoooO00 interfaceC32630OoooO00, oO0O0OO.o000oOoO o000oooo2) {
        super(enumC32614OooOoOO, abstractC32601OooOOo, interfaceC32627Oooo0oo, interfaceC34588OooO0oO, C33479OooO0o.OooO0oO("<set-" + interfaceC32627Oooo0oo.getName() + ">"), z, z2, z3, oooO00o, o000oooo2);
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
        this.f117573Oooo0O0 = interfaceC32630OoooO00 != null ? interfaceC32630OoooO00 : this;
    }

    public static /* synthetic */ void OoooO(int i) {
        String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = C18437z2.f56754h;
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static C32705Ooooo00 o00000(C32698OoooO0O c32698OoooO0O, AbstractC33320OooOoo abstractC33320OooOoo, InterfaceC34588OooO0oO interfaceC34588OooO0oO) {
        if (abstractC33320OooOoo == null) {
            OoooO(8);
            throw null;
        }
        if (interfaceC34588OooO0oO != null) {
            return new C32705Ooooo00(c32698OoooO0O, null, 0, interfaceC34588OooO0oO, C33482OooO0oo.f120989OooO0oO, abstractC33320OooOoo, false, false, false, null, oO0O0OO.o000oOoO.f117308OooO00o);
        }
        OoooO(9);
        throw null;
    }

    @Override // oO0O0OO.OooO00o
    public final List<InterfaceC32641OooooOO> OooO0o() {
        InterfaceC32641OooooOO interfaceC32641OooooOO = this.f117572Oooo0;
        if (interfaceC32641OooooOO == null) {
            throw new IllegalStateException();
        }
        List<InterfaceC32641OooooOO> listSingletonList = Collections.singletonList(interfaceC32641OooooOO);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        OoooO(11);
        throw null;
    }

    @Override // oO0O0OO.OooO0O0, oO0O0OO.OooO00o
    public final Collection<? extends InterfaceC32630OoooO00> OooOO0o() {
        return o000000o(false);
    }

    @Override // oO0O0OO.OooO00o
    public final AbstractC33320OooOoo getReturnType() {
        return C33194OooO0O0.OooO0o0(this).OooOo0O();
    }

    @Override // oO0O0Oo0.AbstractC32686Oooo, oO0O0Oo0.AbstractC32675OooOOoo
    /* JADX INFO: renamed from: o00000O0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final InterfaceC32630OoooO00 o000OOo() {
        InterfaceC32630OoooO00 interfaceC32630OoooO00 = this.f117573Oooo0O0;
        if (interfaceC32630OoooO00 != null) {
            return interfaceC32630OoooO00;
        }
        OoooO(13);
        throw null;
    }

    @Override // oO0O0OO.OooOO0O
    public final <R, D> R o0O0O00(oO0O0OO.OooOOO0<R, D> oooOOO0, D d) {
        return (R) oooOOO0.OooO0o(this, d);
    }
}
