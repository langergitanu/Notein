package androidx.recyclerview.widget;

import androidx.core.location.LocationRequestCompat;
import androidx.core.os.TraceCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: androidx.recyclerview.widget.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC22046OooOOo0 implements Runnable {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final ThreadLocal<RunnableC22046OooOOo0> f65994OooOoOO = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final OooO00o f65995OooOoo0 = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f65996OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayList<RecyclerView> f65997OooOo0o = new ArrayList<>();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final ArrayList<OooO0OO> f65998OooOoO = new ArrayList<>();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f65999OooOoO0;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooOOo0$OooO00o */
    public class OooO00o implements Comparator<OooO0OO> {
        @Override // java.util.Comparator
        public final int compare(OooO0OO oooO0OO, OooO0OO oooO0OO2) {
            OooO0OO oooO0OO3 = oooO0OO;
            OooO0OO oooO0OO4 = oooO0OO2;
            RecyclerView recyclerView = oooO0OO3.f66007OooO0Oo;
            if ((recyclerView == null) == (oooO0OO4.f66007OooO0Oo == null)) {
                boolean z = oooO0OO3.f66004OooO00o;
                if (z == oooO0OO4.f66004OooO00o) {
                    int i = oooO0OO4.f66005OooO0O0 - oooO0OO3.f66005OooO0O0;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = oooO0OO3.f66006OooO0OO - oooO0OO4.f66006OooO0OO;
                    if (i2 != 0) {
                        return i2;
                    }
                    return 0;
                }
                if (z) {
                    return -1;
                }
            } else if (recyclerView != null) {
                return -1;
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooOOo0$OooO0O0 */
    public static class OooO0O0 implements RecyclerView.OooOOOO.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f66000OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f66001OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int[] f66002OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f66003OooO0Oo;

        public final void OooO00o(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.f66003OooO0Oo;
            int i4 = i3 * 2;
            int[] iArr = this.f66002OooO0OO;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f66002OooO0OO = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i3 * 4];
                this.f66002OooO0OO = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f66002OooO0OO;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.f66003OooO0Oo++;
        }

        public final void OooO0O0(RecyclerView recyclerView, boolean z) {
            this.f66003OooO0Oo = 0;
            int[] iArr = this.f66002OooO0OO;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.OooOOOO oooOOOO = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || oooOOOO == null || !oooOOOO.isItemPrefetchEnabled()) {
                return;
            }
            if (z) {
                if (!recyclerView.mAdapterHelper.OooO0oO()) {
                    oooOOOO.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                oooOOOO.collectAdjacentPrefetchPositions(this.f66000OooO00o, this.f66001OooO0O0, recyclerView.mState, this);
            }
            int i = this.f66003OooO0Oo;
            if (i > oooOOOO.mPrefetchMaxCountObserved) {
                oooOOOO.mPrefetchMaxCountObserved = i;
                oooOOOO.mPrefetchMaxObservedInInitialPrefetch = z;
                recyclerView.mRecycler.OooOOO0();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooOOo0$OooO0OO */
    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f66004OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f66005OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f66006OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public RecyclerView f66007OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f66008OooO0o0;
    }

    public static RecyclerView.AbstractC22078OooOooO OooO0OO(RecyclerView recyclerView, int i, long j) {
        int iOooO0oo = recyclerView.mChildHelper.OooO0oo();
        for (int i2 = 0; i2 < iOooO0oo; i2++) {
            RecyclerView.AbstractC22078OooOooO childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.OooO0oO(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        RecyclerView.C22071OooOo0O c22071OooOo0O = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.AbstractC22078OooOooO abstractC22078OooOooOOooOO0O = c22071OooOo0O.OooOO0O(i, j);
            if (abstractC22078OooOooOOooOO0O != null) {
                if (!abstractC22078OooOooOOooOO0O.isBound() || abstractC22078OooOooOOooOO0O.isInvalid()) {
                    c22071OooOo0O.OooO00o(abstractC22078OooOooOOooOO0O, false);
                } else {
                    c22071OooOo0O.OooO0oo(abstractC22078OooOooOOooOO0O.itemView);
                }
            }
            recyclerView.onExitLayoutOrScroll(false);
            return abstractC22078OooOooOOooOO0O;
        } catch (Throwable th) {
            recyclerView.onExitLayoutOrScroll(false);
            throw th;
        }
    }

    public final void OooO00o(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f65996OooOo == 0) {
            this.f65996OooOo = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        OooO0O0 oooO0O0 = recyclerView.mPrefetchRegistry;
        oooO0O0.f66000OooO00o = i;
        oooO0O0.f66001OooO0O0 = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0O0(long j) {
        OooO0OO oooO0OO;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        OooO0OO oooO0OO2;
        ArrayList<RecyclerView> arrayList = this.f65997OooOo0o;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.OooO0O0(recyclerView3, false);
                i += recyclerView3.mPrefetchRegistry.f66003OooO0Oo;
            }
        }
        ArrayList<OooO0OO> arrayList2 = this.f65998OooOoO;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                OooO0O0 oooO0O0 = recyclerView4.mPrefetchRegistry;
                int iAbs = Math.abs(oooO0O0.f66001OooO0O0) + Math.abs(oooO0O0.f66000OooO00o);
                for (int i5 = 0; i5 < oooO0O0.f66003OooO0Oo * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        oooO0OO2 = new OooO0OO();
                        arrayList2.add(oooO0OO2);
                    } else {
                        oooO0OO2 = arrayList2.get(i3);
                    }
                    int[] iArr = oooO0O0.f66002OooO0OO;
                    int i6 = iArr[i5 + 1];
                    oooO0OO2.f66004OooO00o = i6 <= iAbs;
                    oooO0OO2.f66005OooO0O0 = iAbs;
                    oooO0OO2.f66006OooO0OO = i6;
                    oooO0OO2.f66007OooO0Oo = recyclerView4;
                    oooO0OO2.f66008OooO0o0 = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f65995OooOoo0);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (oooO0OO = arrayList2.get(i7)).f66007OooO0Oo) != null; i7++) {
            RecyclerView.AbstractC22078OooOooO abstractC22078OooOooOOooO0OO = OooO0OO(recyclerView, oooO0OO.f66008OooO0o0, oooO0OO.f66004OooO00o ? LocationRequestCompat.PASSIVE_INTERVAL : j);
            if (abstractC22078OooOooOOooO0OO != null && abstractC22078OooOooOOooO0OO.mNestedRecyclerView != null && abstractC22078OooOooOOooO0OO.isBound() && !abstractC22078OooOooOOooO0OO.isInvalid() && (recyclerView2 = abstractC22078OooOooOOooO0OO.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.OooO0oo() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                OooO0O0 oooO0O02 = recyclerView2.mPrefetchRegistry;
                oooO0O02.OooO0O0(recyclerView2, true);
                if (oooO0O02.f66003OooO0Oo != 0) {
                    try {
                        TraceCompat.beginSection("RV Nested Prefetch");
                        RecyclerView.C22075OooOoOO c22075OooOoOO = recyclerView2.mState;
                        RecyclerView.AbstractC22062OooO0oO abstractC22062OooO0oO = recyclerView2.mAdapter;
                        c22075OooOoOO.f66097OooO0Oo = 1;
                        c22075OooOoOO.f66099OooO0o0 = abstractC22062OooO0oO.getItemCount();
                        c22075OooOoOO.f66100OooO0oO = false;
                        c22075OooOoOO.f66101OooO0oo = false;
                        c22075OooOoOO.f66093OooO = false;
                        for (int i8 = 0; i8 < oooO0O02.f66003OooO0Oo * 2; i8 += 2) {
                            OooO0OO(recyclerView2, oooO0O02.f66002OooO0OO[i8], j);
                        }
                    } finally {
                        TraceCompat.endSection();
                    }
                }
            }
            oooO0OO.f66004OooO00o = false;
            oooO0OO.f66005OooO0O0 = 0;
            oooO0OO.f66006OooO0OO = 0;
            oooO0OO.f66007OooO0Oo = null;
            oooO0OO.f66008OooO0o0 = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            TraceCompat.beginSection("RV Prefetch");
            ArrayList<RecyclerView> arrayList = this.f65997OooOo0o;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    OooO0O0(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f65999OooOoO0);
                }
            }
        } finally {
            this.f65996OooOo = 0L;
            TraceCompat.endSection();
        }
    }
}
