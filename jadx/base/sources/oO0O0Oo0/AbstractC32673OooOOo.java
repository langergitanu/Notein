package oO0O0Oo0;

import oO0OooO0.C33479OooO0o;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0O0Oo0.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32673OooOOo extends oOo0oooO.OooO0O0 implements oO0O0OO.OooOO0O {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C33479OooO0o f117421OooOo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC32673OooOOo(InterfaceC34588OooO0oO interfaceC34588OooO0oO, C33479OooO0o c33479OooO0o) {
        super(interfaceC34588OooO0oO);
        if (interfaceC34588OooO0oO == null) {
            OoooO(0);
            throw null;
        }
        if (c33479OooO0o == null) {
            OoooO(1);
            throw null;
        }
        this.f117421OooOo = c33479OooO0o;
    }

    public static /* synthetic */ void OoooO(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static String o0OoOo0(oO0O0OO.OooOO0O oooOO0O) {
        try {
            String str = oO0OOOO.OooO0OO.f118963OooO0OO.OooOo0O(oooOO0O) + "[" + oooOO0O.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(oooOO0O)) + "]";
            if (str != null) {
                return str;
            }
            OoooO(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = oooOO0O.getClass().getSimpleName() + " " + oooOO0O.getName();
            if (str2 != null) {
                return str2;
            }
            OoooO(6);
            throw null;
        }
    }

    /* JADX INFO: renamed from: OooO00o */
    public oO0O0OO.OooOO0O o000OOo() {
        return this;
    }

    @Override // oO0O0OO.OooOO0O
    public final C33479OooO0o getName() {
        C33479OooO0o c33479OooO0o = this.f117421OooOo;
        if (c33479OooO0o != null) {
            return c33479OooO0o;
        }
        OoooO(2);
        throw null;
    }

    public String toString() {
        return o0OoOo0(this);
    }
}
