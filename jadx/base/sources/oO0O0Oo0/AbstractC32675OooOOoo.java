package oO0O0Oo0;

import oO0O0OO.InterfaceC32599OooOO0o;
import oO0OooO0.C33479OooO0o;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0O0Oo0.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32675OooOOoo extends AbstractC32673OooOOo implements InterfaceC32599OooOO0o {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final oO0O0OO.o000oOoO f117424OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final oO0O0OO.OooOO0O f117425OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC32675OooOOoo(oO0O0OO.OooOO0O oooOO0O, InterfaceC34588OooO0oO interfaceC34588OooO0oO, C33479OooO0o c33479OooO0o, oO0O0OO.o000oOoO o000oooo2) {
        super(interfaceC34588OooO0oO, c33479OooO0o);
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
        this.f117425OooOoO0 = oooOO0O;
        this.f117424OooOoO = o000oooo2;
    }

    public static /* synthetic */ void OoooO(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public oO0O0OO.OooOO0O OooO0Oo() {
        oO0O0OO.OooOO0O oooOO0O = this.f117425OooOoO0;
        if (oooOO0O != null) {
            return oooOO0O;
        }
        OoooO(5);
        throw null;
    }

    @Override // oO0O0OO.OooOOO
    public oO0O0OO.o000oOoO getSource() {
        oO0O0OO.o000oOoO o000oooo2 = this.f117424OooOoO;
        if (o000oooo2 != null) {
            return o000oooo2;
        }
        OoooO(6);
        throw null;
    }

    @Override // oO0O0Oo0.AbstractC32673OooOOo, oO0O0OO.OooOO0O
    public oO0O0OO.OooOOO o000OOo() {
        return this;
    }
}
