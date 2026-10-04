package oO0O0Oo0;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import oO0O0OO.AbstractC32601OooOOo;
import oO0O0OO.C32602OooOOo0;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32629OoooO0;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0O0OO.InterfaceC32641OooooOO;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.C33356ooOO;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO0o extends AbstractC32673OooOOo implements InterfaceC32629OoooO0 {
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
            case 11:
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
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
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
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // oO0O0Oo0.AbstractC32673OooOOo, oO0O0OO.OooOO0O
    /* JADX INFO: renamed from: OooO00o */
    public final oO0O0OO.OooO00o o000OOo() {
        return this;
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

    @Override // oO0O0OO.OooO00o
    public final Collection<? extends oO0O0OO.OooO00o> OooOO0o() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        OoooO(8);
        throw null;
    }

    @Override // oO0O0OO.OooO00o
    public final InterfaceC32629OoooO0 OoooOo0() {
        return null;
    }

    @Override // oO0O0OO.OooO00o
    public final InterfaceC32629OoooO0 OoooOoo() {
        return null;
    }

    @Override // oO0O0OO.OooO00o
    public final boolean Ooooooo() {
        return false;
    }

    @Override // oO0O0OO.OooO00o
    public final AbstractC33320OooOoo getReturnType() {
        return getType();
    }

    @Override // oO0O0OO.OooOOO
    public final oO0O0OO.o000oOoO getSource() {
        return oO0O0OO.o000oOoO.f117308OooO00o;
    }

    @Override // oO0O0OO.InterfaceC32640OooooO0
    public final AbstractC33320OooOoo getType() {
        AbstractC33320OooOoo type = getValue().getType();
        if (type != null) {
            return type;
        }
        OoooO(6);
        throw null;
    }

    @Override // oO0O0OO.OooO00o
    public final List<InterfaceC32637OoooOoo> getTypeParameters() {
        List<InterfaceC32637OoooOoo> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        OoooO(5);
        throw null;
    }

    @Override // oO0O0OO.OooOOOO, oO0O0OO.InterfaceC32612OooOoO
    public final AbstractC32601OooOOo getVisibility() {
        C32602OooOOo0.OooO oooO = C32602OooOOo0.f117242OooO0o;
        if (oooO != null) {
            return oooO;
        }
        OoooO(9);
        throw null;
    }

    @Override // oO0O0OO.OooOO0O
    public final <R, D> R o0O0O00(oO0O0OO.OooOOO0<R, D> oooOOO0, D d) {
        return (R) oooOOO0.OooO0OO(this, d);
    }

    @Override // oO0O0Oo0.AbstractC32673OooOOo, oO0O0OO.OooOO0O
    /* JADX INFO: renamed from: OooO00o */
    public final oO0O0OO.OooOO0O o000OOo() {
        return this;
    }

    @Override // oO0O0OO.InterfaceC32634OoooOOo
    public final OooO0o OooO0O0(C33356ooOO c33356ooOO) {
        if (c33356ooOO == null) {
            OoooO(3);
            throw null;
        }
        if (!c33356ooOO.f120634OooO00o.OooO0o0()) {
            AbstractC33320OooOoo abstractC33320OooOooOooOO0 = OooO0Oo() instanceof InterfaceC32596OooO0o0 ? c33356ooOO.OooOO0(3, getType()) : c33356ooOO.OooOO0(1, getType());
            if (abstractC33320OooOooOooOO0 == null) {
                return null;
            }
            if (abstractC33320OooOooOooOO0 != getType()) {
                return new C32695OoooO(OooO0Oo(), new oO0Oo0o.OooO(abstractC33320OooOooOooOO0, null), getAnnotations());
            }
        }
        return this;
    }
}
