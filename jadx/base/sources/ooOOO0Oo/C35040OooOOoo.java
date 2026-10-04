package ooOOO0Oo;

import com.google.firebase.messaging.Constants;
import java.util.HashMap;
import oO0O0OO.AbstractC32600OooOOOo;
import oO0O0OO.C32602OooOOo0;
import oO0O0OO.InterfaceC32620Oooo00O;
import oO0O0Oo.C32664OooO00o;
import oO0O0Oo.C32665OooO0O0;
import oO0O0Oo.C32666OooO0OO;
import oO0OOOo.C32982OooO;

/* JADX INFO: renamed from: ooOOO0Oo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35040OooOOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f125808OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0O0 f125809OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0OO f125810OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final HashMap f125811OooO0Oo;

    /* JADX INFO: renamed from: ooOOO0Oo.OooOOoo$OooO00o */
    public static class OooO00o extends AbstractC32600OooOOOo {
        @Override // oO0O0OO.AbstractC32601OooOOo
        public final boolean OooO0OO(C32602OooOOo0.OooO0O0 oooO0O0, oO0O0OO.OooOOOO oooOOOO, oO0O0OO.OooOO0O oooOO0O) {
            if (oooOO0O != null) {
                return C35040OooOOoo.OooO0OO(oooOOOO, oooOO0O);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", "isVisible"));
        }
    }

    /* JADX INFO: renamed from: ooOOO0Oo.OooOOoo$OooO0O0 */
    public static class OooO0O0 extends AbstractC32600OooOOOo {
        @Override // oO0O0OO.AbstractC32601OooOOo
        public final boolean OooO0OO(C32602OooOOo0.OooO0O0 oooO0O0, oO0O0OO.OooOOOO oooOOOO, oO0O0OO.OooOO0O oooOO0O) {
            if (oooOO0O != null) {
                return C35040OooOOoo.OooO0O0(oooO0O0, oooOOOO, oooOO0O);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", "isVisible"));
        }
    }

    /* JADX INFO: renamed from: ooOOO0Oo.OooOOoo$OooO0OO */
    public static class OooO0OO extends AbstractC32600OooOOOo {
        @Override // oO0O0OO.AbstractC32601OooOOo
        public final boolean OooO0OO(C32602OooOOo0.OooO0O0 oooO0O0, oO0O0OO.OooOOOO oooOOOO, oO0O0OO.OooOO0O oooOO0O) {
            if (oooOO0O != null) {
                return C35040OooOOoo.OooO0O0(oooO0O0, oooOOOO, oooOO0O);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", "isVisible"));
        }
    }

    static {
        OooO00o oooO00o = new OooO00o(C32664OooO00o.f117382OooO0OO);
        f125808OooO00o = oooO00o;
        OooO0O0 oooO0O0 = new OooO0O0(C32666OooO0OO.f117384OooO0OO);
        f125809OooO0O0 = oooO0O0;
        OooO0OO oooO0OO = new OooO0OO(C32665OooO0O0.f117383OooO0OO);
        f125810OooO0OO = oooO0OO;
        HashMap map = new HashMap();
        f125811OooO0Oo = map;
        map.put(oooO00o.f117236OooO00o, oooO00o);
        map.put(oooO0O0.f117236OooO00o, oooO0O0);
        map.put(oooO0OO.f117236OooO00o, oooO0OO);
    }

    public static /* synthetic */ void OooO00o(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = Constants.MessagePayloadKeys.FROM;
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static boolean OooO0O0(C32602OooOOo0.OooO0O0 oooO0O0, oO0O0OO.OooOOOO oooOOOO, oO0O0OO.OooOO0O oooOO0O) {
        if (oooOO0O == null) {
            OooO00o(1);
            throw null;
        }
        int i = C32982OooO.f119352OooO00o;
        if (OooO0OO(oooOOOO instanceof oO0O0OO.OooO0O0 ? C32982OooO.OooOo00((oO0O0OO.OooO0O0) oooOOOO) : oooOOOO, oooOO0O)) {
            return true;
        }
        return C32602OooOOo0.f117240OooO0OO.OooO0OO(oooO0O0, oooOOOO, oooOO0O);
    }

    public static boolean OooO0OO(oO0O0OO.OooOOOO oooOOOO, oO0O0OO.OooOO0O oooOO0O) {
        if (oooOOOO == null) {
            OooO00o(2);
            throw null;
        }
        if (oooOO0O == null) {
            OooO00o(3);
            throw null;
        }
        InterfaceC32620Oooo00O interfaceC32620Oooo00O = (InterfaceC32620Oooo00O) C32982OooO.OooO(oooOOOO, InterfaceC32620Oooo00O.class, false);
        InterfaceC32620Oooo00O interfaceC32620Oooo00O2 = (InterfaceC32620Oooo00O) C32982OooO.OooO(oooOO0O, InterfaceC32620Oooo00O.class, false);
        return (interfaceC32620Oooo00O2 == null || interfaceC32620Oooo00O == null || !interfaceC32620Oooo00O.OooO0OO().equals(interfaceC32620Oooo00O2.OooO0OO())) ? false : true;
    }
}
