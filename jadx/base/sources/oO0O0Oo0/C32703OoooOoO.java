package oO0O0Oo0;

import com.huawei.hms.network.embedded.C18437z2;
import java.util.ArrayList;
import java.util.List;
import o0Oo0o00.o0OOO0o;
import oO0O0OO.InterfaceC32635OoooOo0;
import oO0OOOo.C32982OooO;
import oO0Oo00.C33194OooO0O0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo0.C33361OooO0Oo;
import oO0Ooo0.InterfaceC33373OooOOO;
import oO0OooO0.C33479OooO0o;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0O0Oo0.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32703OoooOoO extends OooOOO0 {

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final ArrayList f117582Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f117583Oooo00o;

    /* JADX WARN: Illegal instructions before constructor call */
    public C32703OoooOoO(oO0O0OO.OooOO0O oooOO0O, InterfaceC34588OooO0oO interfaceC34588OooO0oO, boolean z, int i, C33479OooO0o c33479OooO0o, int i2, InterfaceC33373OooOOO interfaceC33373OooOOO) {
        InterfaceC32635OoooOo0.OooO00o oooO00o = InterfaceC32635OoooOo0.OooO00o.f117292OooO00o;
        if (oooOO0O == null) {
            OoooO(19);
            throw null;
        }
        if (interfaceC34588OooO0oO == null) {
            OoooO(20);
            throw null;
        }
        if (i == 0) {
            OoooO(21);
            throw null;
        }
        if (c33479OooO0o == null) {
            OoooO(22);
            throw null;
        }
        if (interfaceC33373OooOOO == null) {
            OoooO(25);
            throw null;
        }
        super(interfaceC33373OooOOO, oooOO0O, interfaceC34588OooO0oO, c33479OooO0o, i, z, i2, oooO00o);
        this.f117582Oooo00O = new ArrayList(1);
        this.f117583Oooo00o = false;
    }

    public static /* synthetic */ void OoooO(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = C18437z2.f56754h;
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static C32703OoooOoO o00000O(AbstractC32667OooO0Oo abstractC32667OooO0Oo, int i, C33479OooO0o c33479OooO0o, int i2, C33361OooO0Oo c33361OooO0Oo) {
        InterfaceC34588OooO0oO.OooO00o.C20364OooO00o c20364OooO00o = InterfaceC34588OooO0oO.OooO00o.f123919OooO00o;
        if (abstractC32667OooO0Oo == null) {
            OoooO(0);
            throw null;
        }
        if (i == 0) {
            OoooO(2);
            throw null;
        }
        if (c33361OooO0Oo == null) {
            OoooO(4);
            throw null;
        }
        C32703OoooOoO c32703OoooOoOO00000O0 = o00000O0(abstractC32667OooO0Oo, c20364OooO00o, false, i, c33479OooO0o, i2, c33361OooO0Oo);
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooOOO = C33194OooO0O0.OooO0o0(abstractC32667OooO0Oo).OooOOO();
        if (c32703OoooOoOO00000O0.f117583Oooo00o) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + c32703OoooOoOO00000O0.o00000OO());
        }
        if (!o0OOO0o.OooO0O0(abstractC33328Oooo0O0OooOOO)) {
            c32703OoooOoOO00000O0.f117582Oooo00O.add(abstractC33328Oooo0O0OooOOO);
        }
        if (!c32703OoooOoOO00000O0.f117583Oooo00o) {
            c32703OoooOoOO00000O0.f117583Oooo00o = true;
            return c32703OoooOoOO00000O0;
        }
        throw new IllegalStateException("Type parameter descriptor is already initialized: " + c32703OoooOoOO00000O0.o00000OO());
    }

    public static C32703OoooOoO o00000O0(oO0O0OO.OooOO0O oooOO0O, InterfaceC34588OooO0oO interfaceC34588OooO0oO, boolean z, int i, C33479OooO0o c33479OooO0o, int i2, InterfaceC33373OooOOO interfaceC33373OooOOO) {
        if (oooOO0O == null) {
            OoooO(6);
            throw null;
        }
        if (interfaceC34588OooO0oO == null) {
            OoooO(7);
            throw null;
        }
        if (i == 0) {
            OoooO(8);
            throw null;
        }
        if (c33479OooO0o == null) {
            OoooO(9);
            throw null;
        }
        if (interfaceC33373OooOOO == null) {
            OoooO(11);
            throw null;
        }
        if (i != 0) {
            return new C32703OoooOoO(oooOO0O, interfaceC34588OooO0oO, z, i, c33479OooO0o, i2, interfaceC33373OooOOO);
        }
        OoooO(14);
        throw null;
    }

    @Override // oO0O0Oo0.OooOOO0
    public final List<AbstractC33320OooOoo> o00000() {
        if (!this.f117583Oooo00o) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + o00000OO());
        }
        ArrayList arrayList = this.f117582Oooo00O;
        if (arrayList != null) {
            return arrayList;
        }
        OoooO(28);
        throw null;
    }

    @Override // oO0O0Oo0.OooOOO0
    public final void o000000o(AbstractC33320OooOoo abstractC33320OooOoo) {
        if (abstractC33320OooOoo != null) {
            return;
        }
        OoooO(27);
        throw null;
    }

    public final String o00000OO() {
        return getName() + " declared in " + C32982OooO.OooO0oO(OooO0Oo());
    }
}
