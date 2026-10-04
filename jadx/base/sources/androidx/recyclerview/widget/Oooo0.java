package androidx.recyclerview.widget;

import OooOo.C20493Oooo00o;
import androidx.core.util.Pools;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C20493Oooo00o<RecyclerView.AbstractC22078OooOooO, OooO00o> f66032OooO00o = new C20493Oooo00o<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOo.OooOOO<RecyclerView.AbstractC22078OooOooO> f66033OooO0O0 = new OooOo.OooOOO<>();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Pools.SimplePool f66034OooO0Oo = new Pools.SimplePool(20);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f66035OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public RecyclerView.AbstractC22064OooOO0o.OooO0OO f66036OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public RecyclerView.AbstractC22064OooOO0o.OooO0OO f66037OooO0OO;

        /* JADX WARN: Multi-variable type inference failed */
        public static OooO00o OooO00o() {
            OooO00o oooO00o = (OooO00o) f66034OooO0Oo.acquire();
            return oooO00o == null ? new OooO00o() : oooO00o;
        }
    }

    public interface OooO0O0 {
    }

    public final void OooO00o(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, RecyclerView.AbstractC22064OooOO0o.OooO0OO oooO0OO) {
        C20493Oooo00o<RecyclerView.AbstractC22078OooOooO, OooO00o> c20493Oooo00o = this.f66032OooO00o;
        OooO00o OooO00o2 = c20493Oooo00o.get(abstractC22078OooOooO);
        if (OooO00o2 == null) {
            OooO00o2 = OooO00o.OooO00o();
            c20493Oooo00o.put(abstractC22078OooOooO, OooO00o2);
        }
        OooO00o2.f66037OooO0OO = oooO0OO;
        OooO00o2.f66035OooO00o |= 8;
    }

    public final RecyclerView.AbstractC22064OooOO0o.OooO0OO OooO0O0(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO00o oooO00oOooOO0O;
        RecyclerView.AbstractC22064OooOO0o.OooO0OO oooO0OO;
        C20493Oooo00o<RecyclerView.AbstractC22078OooOooO, OooO00o> c20493Oooo00o = this.f66032OooO00o;
        int iOooO0o0 = c20493Oooo00o.OooO0o0(abstractC22078OooOooO);
        if (iOooO0o0 >= 0 && (oooO00oOooOO0O = c20493Oooo00o.OooOO0O(iOooO0o0)) != null) {
            int i2 = oooO00oOooOO0O.f66035OooO00o;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                oooO00oOooOO0O.f66035OooO00o = i3;
                if (i == 4) {
                    oooO0OO = oooO00oOooOO0O.f66036OooO0O0;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    oooO0OO = oooO00oOooOO0O.f66037OooO0OO;
                }
                if ((i3 & 12) == 0) {
                    c20493Oooo00o.OooO(iOooO0o0);
                    oooO00oOooOO0O.f66035OooO00o = 0;
                    oooO00oOooOO0O.f66036OooO0O0 = null;
                    oooO00oOooOO0O.f66037OooO0OO = null;
                    OooO00o.f66034OooO0Oo.release(oooO00oOooOO0O);
                }
                return oooO0OO;
            }
        }
        return null;
    }

    public final void OooO0OO(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO) {
        OooO00o oooO00o = this.f66032OooO00o.get(abstractC22078OooOooO);
        if (oooO00o == null) {
            return;
        }
        oooO00o.f66035OooO00o &= -2;
    }

    public final void OooO0Oo(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO) {
        OooOo.OooOOO<RecyclerView.AbstractC22078OooOooO> oooOOO = this.f66033OooO0O0;
        int iOooO0oO = oooOOO.OooO0oO() - 1;
        while (true) {
            if (iOooO0oO < 0) {
                break;
            }
            if (abstractC22078OooOooO == oooOOO.OooO0oo(iOooO0oO)) {
                Object[] objArr = oooOOO.f58495OooOoO0;
                Object obj = objArr[iOooO0oO];
                Object obj2 = OooOo.OooOOOO.f58497OooO00o;
                if (obj != obj2) {
                    objArr[iOooO0oO] = obj2;
                    oooOOO.f58493OooOo0o = true;
                }
            } else {
                iOooO0oO--;
            }
        }
        OooO00o oooO00oRemove = this.f66032OooO00o.remove(abstractC22078OooOooO);
        if (oooO00oRemove != null) {
            oooO00oRemove.f66035OooO00o = 0;
            oooO00oRemove.f66036OooO0O0 = null;
            oooO00oRemove.f66037OooO0OO = null;
            OooO00o.f66034OooO0Oo.release(oooO00oRemove);
        }
    }
}
