package oO0O0Oo0;

import oO0Ooo0.C33361OooO0Oo;
import oO0OooO0.C33479OooO0o;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooOOOO extends AbstractC32667OooO0Oo {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final oO0O0OO.OooOO0O f117413OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final oO0O0OO.o000oOoO f117414OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(C33361OooO0Oo c33361OooO0Oo, oO0O0OO.OooOO0O oooOO0O, C33479OooO0o c33479OooO0o, oO0O0OO.o000oOoO o000oooo2) {
        super(c33361OooO0Oo, c33479OooO0o);
        if (c33361OooO0Oo == null) {
            o000OOo(0);
            throw null;
        }
        if (oooOO0O == null) {
            o000OOo(1);
            throw null;
        }
        if (c33479OooO0o == null) {
            o000OOo(2);
            throw null;
        }
        if (o000oooo2 == null) {
            o000OOo(3);
            throw null;
        }
        this.f117413OooOoOO = oooOO0O;
        this.f117414OooOoo0 = o000oooo2;
    }

    public static /* synthetic */ void o000OOo(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // oO0O0OO.OooOO0O
    public final oO0O0OO.OooOO0O OooO0Oo() {
        oO0O0OO.OooOO0O oooOO0O = this.f117413OooOoOO;
        if (oooOO0O != null) {
            return oooOO0O;
        }
        o000OOo(4);
        throw null;
    }

    @Override // oO0O0OO.OooOOO
    public final oO0O0OO.o000oOoO getSource() {
        oO0O0OO.o000oOoO o000oooo2 = this.f117414OooOoo0;
        if (o000oooo2 != null) {
            return o000oooo2;
        }
        o000OOo(5);
        throw null;
    }

    public boolean isExternal() {
        return false;
    }
}
