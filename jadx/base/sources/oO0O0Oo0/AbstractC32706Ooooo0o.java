package oO0O0Oo0;

import java.util.Collections;
import java.util.List;
import oO0O0OO.InterfaceC32629OoooO0;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0O0OO.InterfaceC32641OooooOO;
import oO0O0OO.InterfaceC32642OooooOo;
import oO0Ooo.AbstractC33320OooOoo;
import oO0OooO0.C33479OooO0o;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0O0Oo0.Ooooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32706Ooooo0o extends AbstractC32675OooOOoo implements InterfaceC32642OooooOo {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public AbstractC33320OooOoo f117592OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC32706Ooooo0o(oO0O0OO.OooOO0O oooOO0O, InterfaceC34588OooO0oO interfaceC34588OooO0oO, C33479OooO0o c33479OooO0o, AbstractC33320OooOoo abstractC33320OooOoo, oO0O0OO.o000oOoO o000oooo2) {
        super(oooOO0O, interfaceC34588OooO0oO, c33479OooO0o, o000oooo2);
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
        if (o000oooo2 == null) {
            OoooO(3);
            throw null;
        }
        this.f117592OooOoOO = abstractC33320OooOoo;
    }

    public static /* synthetic */ void OoooO(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // oO0O0OO.OooO00o
    public final List<InterfaceC32641OooooOO> OooO0o() {
        List<InterfaceC32641OooooOO> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        OoooO(6);
        throw null;
    }

    public InterfaceC32629OoooO0 OoooOo0() {
        return null;
    }

    public InterfaceC32629OoooO0 OoooOoo() {
        return null;
    }

    @Override // oO0O0OO.OooO00o
    public boolean Ooooooo() {
        return false;
    }

    public AbstractC33320OooOoo getReturnType() {
        AbstractC33320OooOoo type = getType();
        if (type != null) {
            return type;
        }
        OoooO(10);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32640OooooO0
    public final AbstractC33320OooOoo getType() {
        AbstractC33320OooOoo abstractC33320OooOoo = this.f117592OooOoOO;
        if (abstractC33320OooOoo != null) {
            return abstractC33320OooOoo;
        }
        OoooO(4);
        throw null;
    }

    public List<InterfaceC32637OoooOoo> getTypeParameters() {
        List<InterfaceC32637OoooOoo> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        OoooO(8);
        throw null;
    }
}
