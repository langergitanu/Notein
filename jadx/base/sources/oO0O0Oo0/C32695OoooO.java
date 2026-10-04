package oO0O0Oo0;

import o0ooOO0.AbstractC31500OooO00o;
import oO0OooO0.C33479OooO0o;
import oO0OooO0.C33482OooO0oo;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0O0Oo0.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32695OoooO extends OooO0o {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final AbstractC31500OooO00o f117539OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final oO0O0OO.OooOO0O f117540OooOoO0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32695OoooO(oO0O0OO.OooOO0O oooOO0O, AbstractC31500OooO00o abstractC31500OooO00o, InterfaceC34588OooO0oO interfaceC34588OooO0oO) {
        this(oooOO0O, abstractC31500OooO00o, interfaceC34588OooO0oO, C33482OooO0oo.f120986OooO0Oo);
        if (oooOO0O == null) {
            OoooO(0);
            throw null;
        }
        if (interfaceC34588OooO0oO != null) {
        } else {
            OoooO(2);
            throw null;
        }
    }

    public static /* synthetic */ void OoooO(int i) {
        String str = (i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i == 7) {
            objArr[1] = "getValue";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // oO0O0OO.OooOO0O
    public final oO0O0OO.OooOO0O OooO0Oo() {
        oO0O0OO.OooOO0O oooOO0O = this.f117540OooOoO0;
        if (oooOO0O != null) {
            return oooOO0O;
        }
        OoooO(8);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32629OoooO0
    public final oO0Oo0o.OooO0o getValue() {
        AbstractC31500OooO00o abstractC31500OooO00o = this.f117539OooOoO;
        if (abstractC31500OooO00o != null) {
            return abstractC31500OooO00o;
        }
        OoooO(7);
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32695OoooO(oO0O0OO.OooOO0O oooOO0O, AbstractC31500OooO00o abstractC31500OooO00o, InterfaceC34588OooO0oO interfaceC34588OooO0oO, C33479OooO0o c33479OooO0o) {
        super(interfaceC34588OooO0oO, c33479OooO0o);
        if (oooOO0O == null) {
            OoooO(3);
            throw null;
        }
        if (interfaceC34588OooO0oO == null) {
            OoooO(5);
            throw null;
        }
        if (c33479OooO0o != null) {
            this.f117540OooOoO0 = oooOO0O;
            this.f117539OooOoO = abstractC31500OooO00o;
            return;
        }
        OoooO(6);
        throw null;
    }
}
