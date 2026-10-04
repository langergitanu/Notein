package oO0O0Oo0;

import OooOoo0.C20706o00000oO;
import oO0O0OO.InterfaceC32635OoooOo0;
import oO0Ooo0.C33361OooO0Oo;
import oO0OooO0.C33479OooO0o;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0O0Oo0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32668OooO0o0 extends OooOOO0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC32668OooO0o0(C33361OooO0Oo c33361OooO0Oo, oO0O0OO.OooOO0O oooOO0O, InterfaceC34588OooO0oO interfaceC34588OooO0oO, C33479OooO0o c33479OooO0o, int i, boolean z, int i2, InterfaceC32635OoooOo0.OooO00o oooO00o) {
        super(c33361OooO0Oo, oooOO0O, interfaceC34588OooO0oO, c33479OooO0o, i, z, i2, oooO00o);
        if (c33361OooO0Oo == null) {
            OoooO(0);
            throw null;
        }
        if (oooOO0O == null) {
            OoooO(1);
            throw null;
        }
        if (c33479OooO0o == null) {
            OoooO(3);
            throw null;
        }
        if (i == 0) {
            OoooO(4);
            throw null;
        }
        if (oooO00o != null) {
        } else {
            OoooO(6);
            throw null;
        }
    }

    public static /* synthetic */ void OoooO(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // oO0O0Oo0.AbstractC32673OooOOo
    public final String toString() {
        return (this.f117407OooOoo0 ? "reified " : "") + (OooOo0() != 1 ? C20706o00000oO.OooO0OO(OooOo0()).concat(" ") : "") + getName();
    }
}
