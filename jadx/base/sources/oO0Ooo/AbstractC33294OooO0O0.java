package oO0Ooo;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import oO0O0O0o.OooOOO;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32615OooOoo;
import oO0O0OO.InterfaceC32620Oooo00O;
import oO0Oo00.C33194OooO0O0;
import oO0Ooo0.C33361OooO0Oo;
import oO0OooO0.C33479OooO0o;
import oO0o0O0.C33557OooO0OO;

/* JADX INFO: renamed from: oO0Ooo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33294OooO0O0 extends AbstractC33300OooO0oo {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC33294OooO0O0(C33361OooO0Oo c33361OooO0Oo) {
        super(c33361OooO0Oo);
        if (c33361OooO0Oo != null) {
        } else {
            OooOOOO(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void OooOOOO(int i) {
        String str = (i == 1 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i == 2) {
            objArr[0] = "classifier";
        } else if (i != 3 && i != 4) {
            objArr[0] = "storageManager";
        }
        if (i == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i == 3 || i == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i != 1) {
            if (i == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // oO0Ooo.AbstractC33300OooO0oo
    public final Collection OooO() {
        oO0O0OO.OooOO0O oooOO0OOooO0Oo = OooO0OO().OooO0Oo();
        if (oooOO0OOooO0Oo instanceof InterfaceC32596OooO0o0) {
            C33557OooO0OO c33557OooO0OO = new C33557OooO0OO();
            InterfaceC32596OooO0o0 interfaceC32596OooO0o0 = (InterfaceC32596OooO0o0) oooOO0OOooO0Oo;
            c33557OooO0OO.add(interfaceC32596OooO0o0.OooOOO());
            interfaceC32596OooO0o0.o00o0O();
            return c33557OooO0OO;
        }
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        OooOOOO(3);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072 A[RETURN] */
    @Override // oO0Ooo.AbstractC33305OooOOO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooO0o(InterfaceC32598OooO0oo interfaceC32598OooO0oo) {
        boolean z;
        if (interfaceC32598OooO0oo instanceof InterfaceC32596OooO0o0) {
            InterfaceC32596OooO0o0 first = OooO0OO();
            kotlin.jvm.internal.OooOOO0.OooO0oO(first, "first");
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(first.getName(), interfaceC32598OooO0oo.getName())) {
                oO0O0OO.OooOO0O oooOO0OOooO0Oo = first.OooO0Oo();
                oO0O0OO.OooOO0O oooOO0OOooO0Oo2 = interfaceC32598OooO0oo.OooO0Oo();
                while (true) {
                    if (oooOO0OOooO0Oo != null && oooOO0OOooO0Oo2 != null) {
                        if (!(oooOO0OOooO0Oo instanceof InterfaceC32615OooOoo)) {
                            if (!(oooOO0OOooO0Oo2 instanceof InterfaceC32615OooOoo)) {
                                if (!(oooOO0OOooO0Oo instanceof InterfaceC32620Oooo00O)) {
                                    if ((oooOO0OOooO0Oo2 instanceof InterfaceC32620Oooo00O) || !kotlin.jvm.internal.OooOOO0.OooO0O0(oooOO0OOooO0Oo.getName(), oooOO0OOooO0Oo2.getName())) {
                                        break;
                                    }
                                    oooOO0OOooO0Oo = oooOO0OOooO0Oo.OooO0Oo();
                                    oooOO0OOooO0Oo2 = oooOO0OOooO0Oo2.OooO0Oo();
                                } else if (!(oooOO0OOooO0Oo2 instanceof InterfaceC32620Oooo00O) || !kotlin.jvm.internal.OooOOO0.OooO0O0(((InterfaceC32620Oooo00O) oooOO0OOooO0Oo).OooO0OO(), ((InterfaceC32620Oooo00O) oooOO0OOooO0Oo2).OooO0OO())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            z = oooOO0OOooO0Oo2 instanceof InterfaceC32615OooOoo;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                z = false;
                if (!z) {
                }
            } else {
                z = false;
                if (!z) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // oO0Ooo.AbstractC33300OooO0oo
    public final AbstractC33320OooOoo OooO0oo() {
        InterfaceC32596OooO0o0 interfaceC32596OooO0o0OooO0OO = OooO0OO();
        if (interfaceC32596OooO0o0OooO0OO == null) {
            oO0O0O0o.OooOO0.OooO00o(107);
            throw null;
        }
        C33479OooO0o c33479OooO0o = oO0O0O0o.OooOO0.f117105OooO0o0;
        if (oO0O0O0o.OooOO0.OooO0O0(interfaceC32596OooO0o0OooO0OO, OooOOO.OooO00o.f117150OooO00o) || oO0O0O0o.OooOO0.OooO0O0(interfaceC32596OooO0o0OooO0OO, OooOOO.OooO00o.f117151OooO0O0)) {
            return null;
        }
        return OooOO0O().OooO0o0();
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final oO0O0O0o.OooOO0 OooOO0O() {
        oO0O0O0o.OooOO0 oooOO0OooO0o0 = C33194OooO0O0.OooO0o0(OooO0OO());
        if (oooOO0OooO0o0 != null) {
            return oooOO0OooO0o0;
        }
        OooOOOO(1);
        throw null;
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    /* JADX INFO: renamed from: OooOOOo, reason: merged with bridge method [inline-methods] */
    public abstract InterfaceC32596OooO0o0 OooO0OO();
}
