package oO0O0Oo0;

import oO0O0OO.InterfaceC32596OooO0o0;
import oO0Oo0o.C33212OooO0Oo;
import oO0OooO0.C33482OooO0oo;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0O0Oo0.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32684OooOooO extends OooO0o {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C33212OooO0Oo f117491OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC32596OooO0o0 f117492OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32684OooOooO(InterfaceC32596OooO0o0 interfaceC32596OooO0o0) {
        super(InterfaceC34588OooO0oO.OooO00o.f123919OooO00o, C33482OooO0oo.f120986OooO0Oo);
        if (interfaceC32596OooO0o0 == null) {
            OoooO(0);
            throw null;
        }
        this.f117492OooOoO0 = interfaceC32596OooO0o0;
        this.f117491OooOoO = new C33212OooO0Oo(interfaceC32596OooO0o0);
    }

    public static /* synthetic */ void OoooO(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // oO0O0OO.OooOO0O
    public final oO0O0OO.OooOO0O OooO0Oo() {
        InterfaceC32596OooO0o0 interfaceC32596OooO0o0 = this.f117492OooOoO0;
        if (interfaceC32596OooO0o0 != null) {
            return interfaceC32596OooO0o0;
        }
        OoooO(2);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32629OoooO0
    public final oO0Oo0o.OooO0o getValue() {
        C33212OooO0Oo c33212OooO0Oo = this.f117491OooOoO;
        if (c33212OooO0Oo != null) {
            return c33212OooO0Oo;
        }
        OoooO(1);
        throw null;
    }

    @Override // oO0O0Oo0.AbstractC32673OooOOo
    public final String toString() {
        return "class " + this.f117492OooOoO0.getName() + "::this";
    }
}
