package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22030OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RecyclerView.C22061OooO0o0 f65828OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f65829OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f65830OooO0OO = new ArrayList();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooO0oO$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public long f65831OooO00o = 0;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooO00o f65832OooO0O0;

        public final void OooO00o(int i) {
            if (i < 64) {
                this.f65831OooO00o &= ~(1 << i);
                return;
            }
            OooO00o oooO00o = this.f65832OooO0O0;
            if (oooO00o != null) {
                oooO00o.OooO00o(i - 64);
            }
        }

        public final int OooO0O0(int i) {
            OooO00o oooO00o = this.f65832OooO0O0;
            if (oooO00o == null) {
                return i >= 64 ? Long.bitCount(this.f65831OooO00o) : Long.bitCount(this.f65831OooO00o & ((1 << i) - 1));
            }
            if (i < 64) {
                return Long.bitCount(this.f65831OooO00o & ((1 << i) - 1));
            }
            return Long.bitCount(this.f65831OooO00o) + oooO00o.OooO0O0(i - 64);
        }

        public final void OooO0OO() {
            if (this.f65832OooO0O0 == null) {
                this.f65832OooO0O0 = new OooO00o();
            }
        }

        public final boolean OooO0Oo(int i) {
            if (i < 64) {
                return (this.f65831OooO00o & (1 << i)) != 0;
            }
            OooO0OO();
            return this.f65832OooO0O0.OooO0Oo(i - 64);
        }

        public final boolean OooO0o(int i) {
            if (i >= 64) {
                OooO0OO();
                return this.f65832OooO0O0.OooO0o(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f65831OooO00o;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f65831OooO00o = j3;
            long j4 = j - 1;
            this.f65831OooO00o = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            OooO00o oooO00o = this.f65832OooO0O0;
            if (oooO00o != null) {
                if (oooO00o.OooO0Oo(0)) {
                    OooO0oo(63);
                }
                this.f65832OooO0O0.OooO0o(0);
            }
            return z;
        }

        public final void OooO0o0(int i, boolean z) {
            if (i >= 64) {
                OooO0OO();
                this.f65832OooO0O0.OooO0o0(i - 64, z);
                return;
            }
            long j = this.f65831OooO00o;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f65831OooO00o = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                OooO0oo(i);
            } else {
                OooO00o(i);
            }
            if (z2 || this.f65832OooO0O0 != null) {
                OooO0OO();
                this.f65832OooO0O0.OooO0o0(0, z2);
            }
        }

        public final void OooO0oO() {
            this.f65831OooO00o = 0L;
            OooO00o oooO00o = this.f65832OooO0O0;
            if (oooO00o != null) {
                oooO00o.OooO0oO();
            }
        }

        public final void OooO0oo(int i) {
            if (i < 64) {
                this.f65831OooO00o |= 1 << i;
            } else {
                OooO0OO();
                this.f65832OooO0O0.OooO0oo(i - 64);
            }
        }

        public final String toString() {
            if (this.f65832OooO0O0 == null) {
                return Long.toBinaryString(this.f65831OooO00o);
            }
            return this.f65832OooO0O0.toString() + "xx" + Long.toBinaryString(this.f65831OooO00o);
        }
    }

    public C22030OooO0oO(RecyclerView.C22061OooO0o0 c22061OooO0o0) {
        this.f65828OooO00o = c22061OooO0o0;
    }

    public final void OooO(View view) {
        this.f65830OooO0OO.add(view);
        RecyclerView.C22061OooO0o0 c22061OooO0o0 = this.f65828OooO00o;
        RecyclerView.AbstractC22078OooOooO childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
        }
    }

    public final void OooO00o(View view, int i, boolean z) {
        RecyclerView recyclerView = RecyclerView.this;
        int childCount = i < 0 ? recyclerView.getChildCount() : OooO0o(i);
        this.f65829OooO0O0.OooO0o0(childCount, z);
        if (z) {
            OooO(view);
        }
        recyclerView.addView(view, childCount);
        recyclerView.dispatchChildAttached(view);
    }

    public final void OooO0O0(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = RecyclerView.this;
        int childCount = i < 0 ? recyclerView.getChildCount() : OooO0o(i);
        this.f65829OooO0O0.OooO0o0(childCount, z);
        if (z) {
            OooO(view);
        }
        RecyclerView.AbstractC22078OooOooO childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(OooO0o.OooO00o(recyclerView, sb));
            }
            childViewHolderInt.clearTmpDetachFlag();
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void OooO0OO(int i) {
        RecyclerView.AbstractC22078OooOooO childViewHolderInt;
        int iOooO0o = OooO0o(i);
        this.f65829OooO0O0.OooO0o(iOooO0o);
        RecyclerView recyclerView = RecyclerView.this;
        View childAt = recyclerView.getChildAt(iOooO0o);
        if (childAt != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) != null) {
            if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(OooO0o.OooO00o(recyclerView, sb));
            }
            childViewHolderInt.addFlags(256);
        }
        recyclerView.detachViewFromParent(iOooO0o);
    }

    public final View OooO0Oo(int i) {
        return RecyclerView.this.getChildAt(OooO0o(i));
    }

    public final int OooO0o(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = RecyclerView.this.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            OooO00o oooO00o = this.f65829OooO0O0;
            int iOooO0O0 = i - (i2 - oooO00o.OooO0O0(i2));
            if (iOooO0O0 == 0) {
                while (oooO00o.OooO0Oo(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iOooO0O0;
        }
        return -1;
    }

    public final int OooO0o0() {
        return RecyclerView.this.getChildCount() - this.f65830OooO0OO.size();
    }

    public final View OooO0oO(int i) {
        return RecyclerView.this.getChildAt(i);
    }

    public final int OooO0oo() {
        return RecyclerView.this.getChildCount();
    }

    public final int OooOO0(View view) {
        int iIndexOfChild = RecyclerView.this.indexOfChild(view);
        if (iIndexOfChild != -1) {
            OooO00o oooO00o = this.f65829OooO0O0;
            if (!oooO00o.OooO0Oo(iIndexOfChild)) {
                return iIndexOfChild - oooO00o.OooO0O0(iIndexOfChild);
            }
        }
        return -1;
    }

    public final void OooOO0O(int i) {
        int iOooO0o = OooO0o(i);
        RecyclerView.C22061OooO0o0 c22061OooO0o0 = this.f65828OooO00o;
        View childAt = RecyclerView.this.getChildAt(iOooO0o);
        if (childAt == null) {
            return;
        }
        if (this.f65829OooO0O0.OooO0o(iOooO0o)) {
            OooOO0o(childAt);
        }
        c22061OooO0o0.OooO00o(iOooO0o);
    }

    public final void OooOO0o(View view) {
        if (this.f65830OooO0OO.remove(view)) {
            RecyclerView.C22061OooO0o0 c22061OooO0o0 = this.f65828OooO00o;
            RecyclerView.AbstractC22078OooOooO childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }
    }

    public final String toString() {
        return this.f65829OooO0O0.toString() + ", hidden list:" + this.f65830OooO0OO.size();
    }
}
