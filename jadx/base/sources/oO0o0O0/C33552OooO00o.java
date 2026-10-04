package oO0o0O0;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oO0o0O0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33552OooO00o {

    /* JADX INFO: Add missing generic type declarations: [N] */
    /* JADX INFO: renamed from: oO0o0O0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C20321OooO00o<N> extends OooO0O0<N, Boolean> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Object f121159OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ boolean[] f121160OooO0O0;

        public C20321OooO00o(InterfaceC32507OooOO0o interfaceC32507OooOO0o, boolean[] zArr) {
            this.f121159OooO00o = interfaceC32507OooOO0o;
            this.f121160OooO0O0 = zArr;
        }

        @Override // oO0o0O0.C33552OooO00o.InterfaceC33553OooO0Oo
        public final Object OooO00o() {
            return Boolean.valueOf(this.f121160OooO0O0[0]);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO0O000o.OooOO0o] */
        @Override // oO0o0O0.C33552OooO00o.InterfaceC33553OooO0Oo
        public final boolean OooO0O0(N n) {
            boolean zBooleanValue = ((Boolean) this.f121159OooO00o.invoke(n)).booleanValue();
            boolean[] zArr = this.f121160OooO0O0;
            if (zBooleanValue) {
                zArr[0] = true;
            }
            return !zArr[0];
        }
    }

    /* JADX INFO: renamed from: oO0o0O0.OooO00o$OooO0O0 */
    public static abstract class OooO0O0<N, R> implements InterfaceC33553OooO0Oo<N, R> {
        @Override // oO0o0O0.C33552OooO00o.InterfaceC33553OooO0Oo
        public void OooO0OO(N n) {
        }
    }

    /* JADX INFO: renamed from: oO0o0O0.OooO00o$OooO0OO */
    public interface OooO0OO<N> {
        Iterable<? extends N> OooO0O0(N n);
    }

    /* JADX INFO: renamed from: oO0o0O0.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    public interface InterfaceC33553OooO0Oo<N, R> {
        R OooO00o();

        boolean OooO0O0(N n);

        void OooO0OO(N n);
    }

    /* JADX INFO: renamed from: oO0o0O0.OooO00o$OooO0o0, reason: case insensitive filesystem */
    public static class C33554OooO0o0<N> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final HashSet f121161OooO00o = new HashSet();
    }

    public static /* synthetic */ void OooO00o(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static Object OooO0O0(Collection collection, OooO0OO oooO0OO, OooO0O0 oooO0O0) {
        C33554OooO0o0 c33554OooO0o0 = new C33554OooO0o0();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            OooO0OO(it.next(), oooO0OO, c33554OooO0o0, oooO0O0);
        }
        return oooO0O0.OooO00o();
    }

    public static void OooO0OO(Object obj, OooO0OO oooO0OO, C33554OooO0o0 c33554OooO0o0, OooO0O0 oooO0O0) {
        if (obj == null) {
            OooO00o(22);
            throw null;
        }
        if (c33554OooO0o0.f121161OooO00o.add(obj) && oooO0O0.OooO0O0(obj)) {
            Iterator it = oooO0OO.OooO0O0(obj).iterator();
            while (it.hasNext()) {
                OooO0OO(it.next(), oooO0OO, c33554OooO0o0, oooO0O0);
            }
            oooO0O0.OooO0OO(obj);
        }
    }

    public static <N> Boolean OooO0Oo(Collection<N> collection, OooO0OO<N> oooO0OO, InterfaceC32507OooOO0o<N, Boolean> interfaceC32507OooOO0o) {
        if (interfaceC32507OooOO0o != null) {
            return (Boolean) OooO0O0(collection, oooO0OO, new C20321OooO00o(interfaceC32507OooOO0o, new boolean[1]));
        }
        OooO00o(9);
        throw null;
    }
}
