package oO0O0Oo0;

import java.util.Collections;
import java.util.List;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32629OoooO0;
import oO0OOOo.C32982OooO;
import oO0Oo00.C33194OooO0O0;
import oO0Oo0o0.C33223OooOOo0;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.AbstractC33350Oooooo;
import oO0Ooo.C33356ooOO;
import oO0Ooo0.C33361OooO0Oo;
import oO0Ooo0.InterfaceC33370OooOO0;
import oO0OooO.AbstractC33457OooO0oO;
import oO0OooO0.C33479OooO0o;

/* JADX INFO: renamed from: oO0O0Oo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32667OooO0Oo extends AbstractC32688Oooo00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC33370OooOO0<AbstractC33328Oooo0O0> f117389OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C33479OooO0o f117390OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final InterfaceC33370OooOO0<InterfaceC32629OoooO0> f117391OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC33370OooOO0<oO0Oo0o0.OooOO0> f117392OooOoO0;

    public AbstractC32667OooO0Oo(C33361OooO0Oo c33361OooO0Oo, C33479OooO0o c33479OooO0o) {
        if (c33361OooO0Oo == null) {
            o000OOo(0);
            throw null;
        }
        if (c33479OooO0o == null) {
            o000OOo(1);
            throw null;
        }
        this.f117390OooOo0o = c33479OooO0o;
        this.f117389OooOo = c33361OooO0Oo.OooO00o(new OooO00o(this));
        this.f117392OooOoO0 = c33361OooO0Oo.OooO00o(new OooO0O0(this));
        this.f117391OooOoO = c33361OooO0Oo.OooO00o(new OooO0OO(this));
    }

    public static /* synthetic */ void o000OOo(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // oO0O0Oo0.AbstractC32688Oooo00o, oO0O0OO.InterfaceC32596OooO0o0, oO0O0OO.OooOO0O
    /* JADX INFO: renamed from: OooO00o */
    public final InterfaceC32598OooO0oo o000OOo() {
        return this;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0, oO0O0OO.InterfaceC32598OooO0oo
    public final AbstractC33328Oooo0O0 OooOOO() {
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0Invoke = this.f117389OooOo.invoke();
        if (abstractC33328Oooo0O0Invoke != null) {
            return abstractC33328Oooo0O0Invoke;
        }
        o000OOo(20);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final oO0Oo0o0.OooOO0 OooOoO(AbstractC33350Oooooo abstractC33350Oooooo) {
        oO0Oo0o0.OooOO0 oooOO0OoooO = OoooO(abstractC33350Oooooo, C33194OooO0O0.OooO(C32982OooO.OooO0Oo(this)));
        if (oooOO0OoooO != null) {
            return oooOO0OoooO;
        }
        o000OOo(16);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public oO0Oo0o0.OooOO0 OooOooo() {
        oO0Oo0o0.OooOO0 oooOO0Invoke = this.f117392OooOoO0.invoke();
        if (oooOO0Invoke != null) {
            return oooOO0Invoke;
        }
        o000OOo(4);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public oO0Oo0o0.OooOO0 Oooo000() {
        oO0Oo0o0.OooOO0 oooOO0O0OoOo0 = o0OoOo0(C33194OooO0O0.OooO(C32982OooO.OooO0Oo(this)));
        if (oooOO0O0OoOo0 != null) {
            return oooOO0O0OoOo0;
        }
        o000OOo(17);
        throw null;
    }

    @Override // oO0O0Oo0.AbstractC32688Oooo00o
    public oO0Oo0o0.OooOO0 OoooO(AbstractC33350Oooooo abstractC33350Oooooo, AbstractC33457OooO0oO abstractC33457OooO0oO) {
        if (abstractC33457OooO0oO == null) {
            o000OOo(11);
            throw null;
        }
        if (!abstractC33350Oooooo.OooO0o0()) {
            return new C33223OooOOo0(o0OoOo0(abstractC33457OooO0oO), C33356ooOO.OooO0o0(abstractC33350Oooooo));
        }
        oO0Oo0o0.OooOO0 oooOO0O0OoOo0 = o0OoOo0(abstractC33457OooO0oO);
        if (oooOO0O0OoOo0 != null) {
            return oooOO0O0OoOo0;
        }
        o000OOo(12);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final InterfaceC32629OoooO0 OoooO00() {
        InterfaceC32629OoooO0 interfaceC32629OoooO0Invoke = this.f117391OooOoO.invoke();
        if (interfaceC32629OoooO0Invoke != null) {
            return interfaceC32629OoooO0Invoke;
        }
        o000OOo(5);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public List<InterfaceC32629OoooO0> OooooOO() {
        List<InterfaceC32629OoooO0> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        o000OOo(6);
        throw null;
    }

    @Override // oO0O0OO.OooOO0O
    public final C33479OooO0o getName() {
        C33479OooO0o c33479OooO0o = this.f117390OooOo0o;
        if (c33479OooO0o != null) {
            return c33479OooO0o;
        }
        o000OOo(2);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32634OoooOOo
    /* JADX INFO: renamed from: o000000O, reason: merged with bridge method [inline-methods] */
    public InterfaceC32596OooO0o0 OooO0O0(C33356ooOO c33356ooOO) {
        if (c33356ooOO != null) {
            return c33356ooOO.f120634OooO00o.OooO0o0() ? this : new C32687Oooo00O(this, c33356ooOO);
        }
        o000OOo(18);
        throw null;
    }

    @Override // oO0O0OO.OooOO0O
    public final <R, D> R o0O0O00(oO0O0OO.OooOOO0<R, D> oooOOO0, D d) {
        return (R) oooOOO0.OooO(this, d);
    }

    @Override // oO0O0Oo0.AbstractC32688Oooo00o, oO0O0OO.OooOO0O
    /* JADX INFO: renamed from: OooO00o */
    public final oO0O0OO.OooOO0O o000OOo() {
        return this;
    }

    @Override // oO0O0Oo0.AbstractC32688Oooo00o, oO0O0OO.InterfaceC32596OooO0o0, oO0O0OO.OooOO0O
    /* JADX INFO: renamed from: OooO00o */
    public final InterfaceC32596OooO0o0 o000OOo() {
        return this;
    }
}
