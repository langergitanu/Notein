package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.C21505OooO0Oo;
import androidx.core.location.LocationRequestCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RunnableC22046OooOOo0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.OooOOOO implements RecyclerView.AbstractC22073OooOoO.OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C22079OooO0Oo[] f66115OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f66116OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final AbstractC22055OooOoo0 f66117OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final AbstractC22055OooOoo0 f66118OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f66119OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22048OooOo0 f66120OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f66121OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f66122OooOooO;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final boolean f66124Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final LazySpanLookup f66125Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final BitSet f66126Oooo000;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final int f66129Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f66130Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public SavedState f66131Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f66132Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Rect f66133Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final OooO0O0 f66134Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final OooO00o f66135OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int[] f66136OoooO00;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f66123OooOooo = false;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f66127Oooo00O = -1;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f66128Oooo00o = Integer.MIN_VALUE;

    public static class LazySpanLookup {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int[] f66137OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ArrayList f66138OooO0O0;

        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new OooO00o();

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f66139OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f66140OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public boolean f66141OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public int[] f66142OooOoO0;

            public class OooO00o implements Parcelable.Creator<FullSpanItem> {
                @Override // android.os.Parcelable.Creator
                public final FullSpanItem createFromParcel(Parcel parcel) {
                    FullSpanItem fullSpanItem = new FullSpanItem();
                    fullSpanItem.f66140OooOo0o = parcel.readInt();
                    fullSpanItem.f66139OooOo = parcel.readInt();
                    fullSpanItem.f66141OooOoO = parcel.readInt() == 1;
                    int i = parcel.readInt();
                    if (i > 0) {
                        int[] iArr = new int[i];
                        fullSpanItem.f66142OooOoO0 = iArr;
                        parcel.readIntArray(iArr);
                    }
                    return fullSpanItem;
                }

                @Override // android.os.Parcelable.Creator
                public final FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.f66140OooOo0o + ", mGapDir=" + this.f66139OooOo + ", mHasUnwantedGapAfter=" + this.f66141OooOoO + ", mGapPerSpan=" + Arrays.toString(this.f66142OooOoO0) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f66140OooOo0o);
                parcel.writeInt(this.f66139OooOo);
                parcel.writeInt(this.f66141OooOoO ? 1 : 0);
                int[] iArr = this.f66142OooOoO0;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f66142OooOoO0);
                }
            }
        }

        public final void OooO00o() {
            int[] iArr = this.f66137OooO00o;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f66138OooO0O0 = null;
        }

        public final void OooO0O0(int i) {
            int[] iArr = this.f66137OooO00o;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f66137OooO00o = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f66137OooO00o = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f66137OooO00o;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public final void OooO0OO(int i, int i2) {
            int[] iArr = this.f66137OooO00o;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            OooO0O0(i3);
            int[] iArr2 = this.f66137OooO00o;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f66137OooO00o, i, i3, -1);
            ArrayList arrayList = this.f66138OooO0O0;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f66138OooO0O0.get(size);
                int i4 = fullSpanItem.f66140OooOo0o;
                if (i4 >= i) {
                    fullSpanItem.f66140OooOo0o = i4 + i2;
                }
            }
        }

        public final void OooO0Oo(int i, int i2) {
            int[] iArr = this.f66137OooO00o;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            OooO0O0(i3);
            int[] iArr2 = this.f66137OooO00o;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f66137OooO00o;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            ArrayList arrayList = this.f66138OooO0O0;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f66138OooO0O0.get(size);
                int i4 = fullSpanItem.f66140OooOo0o;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f66138OooO0O0.remove(size);
                    } else {
                        fullSpanItem.f66140OooOo0o = i4 - i2;
                    }
                }
            }
        }
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.OooO00o();
        }
    }

    public class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f66144OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f66145OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f66146OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f66147OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int[] f66148OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f66149OooO0o0;

        public OooO0O0() {
            OooO00o();
        }

        public final void OooO00o() {
            this.f66144OooO00o = -1;
            this.f66145OooO0O0 = Integer.MIN_VALUE;
            this.f66146OooO0OO = false;
            this.f66147OooO0Oo = false;
            this.f66149OooO0o0 = false;
            int[] iArr = this.f66148OooO0o;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class OooO0OO extends RecyclerView.C22066OooOOOo {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C22079OooO0Oo f66151OooOo0o;
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$OooO0Oo, reason: case insensitive filesystem */
    public class C22079OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList<View> f66152OooO00o = new ArrayList<>();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f66153OooO0O0 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f66154OooO0OO = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f66155OooO0Oo = 0;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f66157OooO0o0;

        public C22079OooO0Oo(int i) {
            this.f66157OooO0o0 = i;
        }

        public final void OooO00o() {
            View view = (View) C21505OooO0Oo.OooO00o(1, this.f66152OooO00o);
            OooO0OO oooO0OO = (OooO0OO) view.getLayoutParams();
            this.f66154OooO0OO = StaggeredGridLayoutManager.this.f66118OooOoO0.OooO0O0(view);
            oooO0OO.getClass();
        }

        public final void OooO0O0() {
            this.f66152OooO00o.clear();
            this.f66153OooO0O0 = Integer.MIN_VALUE;
            this.f66154OooO0OO = Integer.MIN_VALUE;
            this.f66155OooO0Oo = 0;
        }

        public final int OooO0OO() {
            return StaggeredGridLayoutManager.this.f66122OooOooO ? OooO0o0(r1.size() - 1, -1) : OooO0o0(0, this.f66152OooO00o.size());
        }

        public final int OooO0Oo() {
            return StaggeredGridLayoutManager.this.f66122OooOooO ? OooO0o0(0, this.f66152OooO00o.size()) : OooO0o0(r1.size() - 1, -1);
        }

        public final int OooO0o(int i) {
            int i2 = this.f66154OooO0OO;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f66152OooO00o.size() == 0) {
                return i;
            }
            OooO00o();
            return this.f66154OooO0OO;
        }

        public final int OooO0o0(int i, int i2) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int iOooOO0O = staggeredGridLayoutManager.f66118OooOoO0.OooOO0O();
            int iOooO0oO = staggeredGridLayoutManager.f66118OooOoO0.OooO0oO();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f66152OooO00o.get(i);
                int iOooO0o0 = staggeredGridLayoutManager.f66118OooOoO0.OooO0o0(view);
                int iOooO0O0 = staggeredGridLayoutManager.f66118OooOoO0.OooO0O0(view);
                boolean z = iOooO0o0 <= iOooO0oO;
                boolean z2 = iOooO0O0 >= iOooOO0O;
                if (z && z2 && (iOooO0o0 < iOooOO0O || iOooO0O0 > iOooO0oO)) {
                    return staggeredGridLayoutManager.getPosition(view);
                }
                i += i3;
            }
            return -1;
        }

        public final View OooO0oO(int i, int i2) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            ArrayList<View> arrayList = this.f66152OooO00o;
            View view = null;
            if (i2 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = arrayList.get(size);
                    if ((staggeredGridLayoutManager.f66122OooOooO && staggeredGridLayoutManager.getPosition(view2) >= i) || ((!staggeredGridLayoutManager.f66122OooOooO && staggeredGridLayoutManager.getPosition(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = arrayList.get(i3);
                if ((staggeredGridLayoutManager.f66122OooOooO && staggeredGridLayoutManager.getPosition(view3) <= i) || ((!staggeredGridLayoutManager.f66122OooOooO && staggeredGridLayoutManager.getPosition(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
            return view;
        }

        public final int OooO0oo(int i) {
            int i2 = this.f66153OooO0O0;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f66152OooO00o.size() == 0) {
                return i;
            }
            View view = this.f66152OooO00o.get(0);
            OooO0OO oooO0OO = (OooO0OO) view.getLayoutParams();
            this.f66153OooO0O0 = StaggeredGridLayoutManager.this.f66118OooOoO0.OooO0o0(view);
            oooO0OO.getClass();
            return this.f66153OooO0O0;
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f66158OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f66159OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int[] f66160OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f66161OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f66162OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public ArrayList f66163OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int[] f66164OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public boolean f66165OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public boolean f66166OooOooo;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public boolean f66167Oooo000;

        public class OooO00o implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.f66159OooOo0o = parcel.readInt();
                savedState.f66158OooOo = parcel.readInt();
                int i = parcel.readInt();
                savedState.f66161OooOoO0 = i;
                if (i > 0) {
                    int[] iArr = new int[i];
                    savedState.f66160OooOoO = iArr;
                    parcel.readIntArray(iArr);
                }
                int i2 = parcel.readInt();
                savedState.f66162OooOoOO = i2;
                if (i2 > 0) {
                    int[] iArr2 = new int[i2];
                    savedState.f66164OooOoo0 = iArr2;
                    parcel.readIntArray(iArr2);
                }
                savedState.f66165OooOooO = parcel.readInt() == 1;
                savedState.f66166OooOooo = parcel.readInt() == 1;
                savedState.f66167Oooo000 = parcel.readInt() == 1;
                savedState.f66163OooOoo = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f66159OooOo0o);
            parcel.writeInt(this.f66158OooOo);
            parcel.writeInt(this.f66161OooOoO0);
            if (this.f66161OooOoO0 > 0) {
                parcel.writeIntArray(this.f66160OooOoO);
            }
            parcel.writeInt(this.f66162OooOoOO);
            if (this.f66162OooOoOO > 0) {
                parcel.writeIntArray(this.f66164OooOoo0);
            }
            parcel.writeInt(this.f66165OooOooO ? 1 : 0);
            parcel.writeInt(this.f66166OooOooo ? 1 : 0);
            parcel.writeInt(this.f66167Oooo000 ? 1 : 0);
            parcel.writeList(this.f66163OooOoo);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f66116OooOo0o = -1;
        this.f66122OooOooO = false;
        LazySpanLookup lazySpanLookup = new LazySpanLookup();
        this.f66125Oooo0 = lazySpanLookup;
        this.f66129Oooo0O0 = 2;
        this.f66133Oooo0oO = new Rect();
        this.f66134Oooo0oo = new OooO0O0();
        this.f66124Oooo = true;
        this.f66135OoooO0 = new OooO00o();
        RecyclerView.OooOOOO.C22065OooO0Oo properties = RecyclerView.OooOOOO.getProperties(context, attributeSet, i, i2);
        int i3 = properties.f66067OooO00o;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i3 != this.f66119OooOoOO) {
            this.f66119OooOoOO = i3;
            AbstractC22055OooOoo0 abstractC22055OooOoo0 = this.f66118OooOoO0;
            this.f66118OooOoO0 = this.f66117OooOoO;
            this.f66117OooOoO = abstractC22055OooOoo0;
            requestLayout();
        }
        int i4 = properties.f66068OooO0O0;
        assertNotInLayoutOrScroll(null);
        if (i4 != this.f66116OooOo0o) {
            lazySpanLookup.OooO00o();
            requestLayout();
            this.f66116OooOo0o = i4;
            this.f66126Oooo000 = new BitSet(this.f66116OooOo0o);
            this.f66115OooOo = new C22079OooO0Oo[this.f66116OooOo0o];
            for (int i5 = 0; i5 < this.f66116OooOo0o; i5++) {
                this.f66115OooOo[i5] = new C22079OooO0Oo(i5);
            }
            requestLayout();
        }
        boolean z = properties.f66069OooO0OO;
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.f66131Oooo0o;
        if (savedState != null && savedState.f66165OooOooO != z) {
            savedState.f66165OooOooO = z;
        }
        this.f66122OooOooO = z;
        requestLayout();
        C22048OooOo0 c22048OooOo0 = new C22048OooOo0();
        c22048OooOo0.f66012OooO00o = true;
        c22048OooOo0.f66016OooO0o = 0;
        c22048OooOo0.f66018OooO0oO = 0;
        this.f66120OooOoo = c22048OooOo0;
        this.f66118OooOoO0 = AbstractC22055OooOoo0.OooO00o(this, this.f66119OooOoOO);
        this.f66117OooOoO = AbstractC22055OooOoo0.OooO00o(this, 1 - this.f66119OooOoOO);
    }

    public static int OooOo0o(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    public final int OooO(int i) {
        int iOooO0o = this.f66115OooOo[0].OooO0o(i);
        for (int i2 = 1; i2 < this.f66116OooOo0o; i2++) {
            int iOooO0o2 = this.f66115OooOo[i2].OooO0o(i);
            if (iOooO0o2 > iOooO0o) {
                iOooO0o = iOooO0o2;
            }
        }
        return iOooO0o;
    }

    public final boolean OooO00o() {
        int iOooO0oO;
        if (getChildCount() != 0 && this.f66129Oooo0O0 != 0 && isAttachedToWindow()) {
            if (this.f66123OooOooo) {
                iOooO0oO = OooO0oo();
                OooO0oO();
            } else {
                iOooO0oO = OooO0oO();
                OooO0oo();
            }
            LazySpanLookup lazySpanLookup = this.f66125Oooo0;
            if (iOooO0oO == 0 && OooOO0o() != null) {
                lazySpanLookup.OooO00o();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    public final int OooO0O0(RecyclerView.C22071OooOo0O c22071OooOo0O, C22048OooOo0 c22048OooOo0, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        C22079OooO0Oo c22079OooO0Oo;
        ?? r3;
        int iOooO0oo;
        int iOooO0OO;
        int iOooOO0O;
        int iOooO0OO2;
        int i;
        int i2;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        int i3 = 0;
        int i4 = 1;
        staggeredGridLayoutManager.f66126Oooo000.set(0, staggeredGridLayoutManager.f66116OooOo0o, true);
        C22048OooOo0 c22048OooOo02 = staggeredGridLayoutManager.f66120OooOoo;
        int i5 = c22048OooOo02.f66011OooO ? c22048OooOo0.f66017OooO0o0 == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c22048OooOo0.f66017OooO0o0 == 1 ? c22048OooOo0.f66018OooO0oO + c22048OooOo0.f66013OooO0O0 : c22048OooOo0.f66016OooO0o - c22048OooOo0.f66013OooO0O0;
        int i6 = c22048OooOo0.f66017OooO0o0;
        for (int i7 = 0; i7 < staggeredGridLayoutManager.f66116OooOo0o; i7++) {
            if (!staggeredGridLayoutManager.f66115OooOo[i7].f66152OooO00o.isEmpty()) {
                staggeredGridLayoutManager.OooOo0O(staggeredGridLayoutManager.f66115OooOo[i7], i6, i5);
            }
        }
        int iOooO0oO = staggeredGridLayoutManager.f66123OooOooo ? staggeredGridLayoutManager.f66118OooOoO0.OooO0oO() : staggeredGridLayoutManager.f66118OooOoO0.OooOO0O();
        boolean z = false;
        while (true) {
            int i8 = c22048OooOo0.f66014OooO0OO;
            int i9 = -1;
            if (((i8 < 0 || i8 >= c22075OooOoOO.OooO0O0()) ? i3 : i4) == 0 || (!c22048OooOo02.f66011OooO && staggeredGridLayoutManager.f66126Oooo000.isEmpty())) {
                break;
            }
            View view = c22071OooOo0O.OooOO0O(c22048OooOo0.f66014OooO0OO, LocationRequestCompat.PASSIVE_INTERVAL).itemView;
            c22048OooOo0.f66014OooO0OO += c22048OooOo0.f66015OooO0Oo;
            OooO0OO oooO0OO = (OooO0OO) view.getLayoutParams();
            int viewLayoutPosition = oooO0OO.getViewLayoutPosition();
            LazySpanLookup lazySpanLookup = staggeredGridLayoutManager.f66125Oooo0;
            int[] iArr = lazySpanLookup.f66137OooO00o;
            int i10 = (iArr == null || viewLayoutPosition >= iArr.length) ? -1 : iArr[viewLayoutPosition];
            if (i10 == -1) {
                if (staggeredGridLayoutManager.OooOOOO(c22048OooOo0.f66017OooO0o0)) {
                    i = staggeredGridLayoutManager.f66116OooOo0o - i4;
                    i2 = -1;
                } else {
                    i9 = staggeredGridLayoutManager.f66116OooOo0o;
                    i = i3;
                    i2 = i4;
                }
                C22079OooO0Oo c22079OooO0Oo2 = null;
                if (c22048OooOo0.f66017OooO0o0 == i4) {
                    int iOooOO0O2 = staggeredGridLayoutManager.f66118OooOoO0.OooOO0O();
                    int i11 = Integer.MAX_VALUE;
                    while (i != i9) {
                        C22079OooO0Oo c22079OooO0Oo3 = staggeredGridLayoutManager.f66115OooOo[i];
                        int i12 = i2;
                        int iOooO0o = c22079OooO0Oo3.OooO0o(iOooOO0O2);
                        if (iOooO0o < i11) {
                            c22079OooO0Oo2 = c22079OooO0Oo3;
                            i11 = iOooO0o;
                        }
                        i += i12;
                        i2 = i12;
                    }
                } else {
                    int i13 = i2;
                    int iOooO0oO2 = staggeredGridLayoutManager.f66118OooOoO0.OooO0oO();
                    int i14 = Integer.MIN_VALUE;
                    while (i != i9) {
                        C22079OooO0Oo c22079OooO0Oo4 = staggeredGridLayoutManager.f66115OooOo[i];
                        int iOooO0oo2 = c22079OooO0Oo4.OooO0oo(iOooO0oO2);
                        if (iOooO0oo2 > i14) {
                            c22079OooO0Oo2 = c22079OooO0Oo4;
                            i14 = iOooO0oo2;
                        }
                        i += i13;
                    }
                }
                c22079OooO0Oo = c22079OooO0Oo2;
                lazySpanLookup.OooO0O0(viewLayoutPosition);
                lazySpanLookup.f66137OooO00o[viewLayoutPosition] = c22079OooO0Oo.f66157OooO0o0;
            } else {
                c22079OooO0Oo = staggeredGridLayoutManager.f66115OooOo[i10];
            }
            C22079OooO0Oo c22079OooO0Oo5 = c22079OooO0Oo;
            oooO0OO.f66151OooOo0o = c22079OooO0Oo5;
            if (c22048OooOo0.f66017OooO0o0 == 1) {
                staggeredGridLayoutManager.addView(view);
                r3 = 0;
            } else {
                r3 = 0;
                staggeredGridLayoutManager.addView(view, 0);
            }
            if (staggeredGridLayoutManager.f66119OooOoOO == 1) {
                staggeredGridLayoutManager.OooOOO0(view, RecyclerView.OooOOOO.getChildMeasureSpec(staggeredGridLayoutManager.f66121OooOoo0, staggeredGridLayoutManager.getWidthMode(), r3, ((ViewGroup.MarginLayoutParams) oooO0OO).width, r3), RecyclerView.OooOOOO.getChildMeasureSpec(staggeredGridLayoutManager.getHeight(), staggeredGridLayoutManager.getHeightMode(), staggeredGridLayoutManager.getPaddingBottom() + staggeredGridLayoutManager.getPaddingTop(), ((ViewGroup.MarginLayoutParams) oooO0OO).height, true));
            } else {
                staggeredGridLayoutManager.OooOOO0(view, RecyclerView.OooOOOO.getChildMeasureSpec(staggeredGridLayoutManager.getWidth(), staggeredGridLayoutManager.getWidthMode(), staggeredGridLayoutManager.getPaddingRight() + staggeredGridLayoutManager.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) oooO0OO).width, true), RecyclerView.OooOOOO.getChildMeasureSpec(staggeredGridLayoutManager.f66121OooOoo0, staggeredGridLayoutManager.getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) oooO0OO).height, false));
            }
            if (c22048OooOo0.f66017OooO0o0 == 1) {
                iOooO0OO = c22079OooO0Oo5.OooO0o(iOooO0oO);
                iOooO0oo = staggeredGridLayoutManager.f66118OooOoO0.OooO0OO(view) + iOooO0OO;
            } else {
                iOooO0oo = c22079OooO0Oo5.OooO0oo(iOooO0oO);
                iOooO0OO = iOooO0oo - staggeredGridLayoutManager.f66118OooOoO0.OooO0OO(view);
            }
            if (c22048OooOo0.f66017OooO0o0 == 1) {
                C22079OooO0Oo c22079OooO0Oo6 = oooO0OO.f66151OooOo0o;
                c22079OooO0Oo6.getClass();
                OooO0OO oooO0OO2 = (OooO0OO) view.getLayoutParams();
                oooO0OO2.f66151OooOo0o = c22079OooO0Oo6;
                ArrayList<View> arrayList = c22079OooO0Oo6.f66152OooO00o;
                arrayList.add(view);
                c22079OooO0Oo6.f66154OooO0OO = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c22079OooO0Oo6.f66153OooO0O0 = Integer.MIN_VALUE;
                }
                if (oooO0OO2.isItemRemoved() || oooO0OO2.isItemChanged()) {
                    c22079OooO0Oo6.f66155OooO0Oo = StaggeredGridLayoutManager.this.f66118OooOoO0.OooO0OO(view) + c22079OooO0Oo6.f66155OooO0Oo;
                }
            } else {
                C22079OooO0Oo c22079OooO0Oo7 = oooO0OO.f66151OooOo0o;
                c22079OooO0Oo7.getClass();
                OooO0OO oooO0OO3 = (OooO0OO) view.getLayoutParams();
                oooO0OO3.f66151OooOo0o = c22079OooO0Oo7;
                ArrayList<View> arrayList2 = c22079OooO0Oo7.f66152OooO00o;
                arrayList2.add(0, view);
                c22079OooO0Oo7.f66153OooO0O0 = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c22079OooO0Oo7.f66154OooO0OO = Integer.MIN_VALUE;
                }
                if (oooO0OO3.isItemRemoved() || oooO0OO3.isItemChanged()) {
                    c22079OooO0Oo7.f66155OooO0Oo = StaggeredGridLayoutManager.this.f66118OooOoO0.OooO0OO(view) + c22079OooO0Oo7.f66155OooO0Oo;
                }
            }
            if (staggeredGridLayoutManager.isLayoutRTL() && staggeredGridLayoutManager.f66119OooOoOO == 1) {
                iOooO0OO2 = staggeredGridLayoutManager.f66117OooOoO.OooO0oO() - (((staggeredGridLayoutManager.f66116OooOo0o - 1) - c22079OooO0Oo5.f66157OooO0o0) * staggeredGridLayoutManager.f66121OooOoo0);
                iOooOO0O = iOooO0OO2 - staggeredGridLayoutManager.f66117OooOoO.OooO0OO(view);
            } else {
                iOooOO0O = staggeredGridLayoutManager.f66117OooOoO.OooOO0O() + (c22079OooO0Oo5.f66157OooO0o0 * staggeredGridLayoutManager.f66121OooOoo0);
                iOooO0OO2 = staggeredGridLayoutManager.f66117OooOoO.OooO0OO(view) + iOooOO0O;
            }
            int i15 = iOooOO0O;
            int i16 = iOooO0OO2;
            if (staggeredGridLayoutManager.f66119OooOoOO == 1) {
                staggeredGridLayoutManager.layoutDecoratedWithMargins(view, i15, iOooO0OO, i16, iOooO0oo);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager.layoutDecoratedWithMargins(view, iOooO0OO, i15, iOooO0oo, i16);
            }
            staggeredGridLayoutManager.OooOo0O(c22079OooO0Oo5, c22048OooOo02.f66017OooO0o0, i5);
            staggeredGridLayoutManager.OooOOo0(c22071OooOo0O, c22048OooOo02);
            if (c22048OooOo02.f66019OooO0oo && view.hasFocusable()) {
                staggeredGridLayoutManager.f66126Oooo000.set(c22079OooO0Oo5.f66157OooO0o0, false);
            }
            z = true;
            i4 = 1;
            i3 = 0;
        }
        if (!z) {
            staggeredGridLayoutManager.OooOOo0(c22071OooOo0O, c22048OooOo02);
        }
        int iOooOO0O3 = c22048OooOo02.f66017OooO0o0 == -1 ? staggeredGridLayoutManager.f66118OooOoO0.OooOO0O() - staggeredGridLayoutManager.OooOO0(staggeredGridLayoutManager.f66118OooOoO0.OooOO0O()) : staggeredGridLayoutManager.OooO(staggeredGridLayoutManager.f66118OooOoO0.OooO0oO()) - staggeredGridLayoutManager.f66118OooOoO0.OooO0oO();
        if (iOooOO0O3 > 0) {
            return Math.min(c22048OooOo0.f66013OooO0O0, iOooOO0O3);
        }
        return 0;
    }

    public final View OooO0OO(boolean z) {
        int iOooOO0O = this.f66118OooOoO0.OooOO0O();
        int iOooO0oO = this.f66118OooOoO0.OooO0oO();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iOooO0o0 = this.f66118OooOoO0.OooO0o0(childAt);
            int iOooO0O0 = this.f66118OooOoO0.OooO0O0(childAt);
            if (iOooO0O0 > iOooOO0O && iOooO0o0 < iOooO0oO) {
                if (iOooO0O0 <= iOooO0oO || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final View OooO0Oo(boolean z) {
        int iOooOO0O = this.f66118OooOoO0.OooOO0O();
        int iOooO0oO = this.f66118OooOoO0.OooO0oO();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int iOooO0o0 = this.f66118OooOoO0.OooO0o0(childAt);
            if (this.f66118OooOoO0.OooO0O0(childAt) > iOooOO0O && iOooO0o0 < iOooO0oO) {
                if (iOooO0o0 >= iOooOO0O || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final void OooO0o(RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO, boolean z) {
        int iOooOO0O;
        int iOooOO0 = OooOO0(Integer.MAX_VALUE);
        if (iOooOO0 != Integer.MAX_VALUE && (iOooOO0O = iOooOO0 - this.f66118OooOoO0.OooOO0O()) > 0) {
            int iScrollBy = iOooOO0O - scrollBy(iOooOO0O, c22071OooOo0O, c22075OooOoOO);
            if (!z || iScrollBy <= 0) {
                return;
            }
            this.f66118OooOoO0.OooOOOo(-iScrollBy);
        }
    }

    public final void OooO0o0(RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO, boolean z) {
        int iOooO0oO;
        int iOooO = OooO(Integer.MIN_VALUE);
        if (iOooO != Integer.MIN_VALUE && (iOooO0oO = this.f66118OooOoO0.OooO0oO() - iOooO) > 0) {
            int i = iOooO0oO - (-scrollBy(-iOooO0oO, c22071OooOo0O, c22075OooOoOO));
            if (!z || i <= 0) {
                return;
            }
            this.f66118OooOoO0.OooOOOo(i);
        }
    }

    public final int OooO0oO() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public final int OooO0oo() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public final int OooOO0(int i) {
        int iOooO0oo = this.f66115OooOo[0].OooO0oo(i);
        for (int i2 = 1; i2 < this.f66116OooOo0o; i2++) {
            int iOooO0oo2 = this.f66115OooOo[i2].OooO0oo(i);
            if (iOooO0oo2 < iOooO0oo) {
                iOooO0oo = iOooO0oo2;
            }
        }
        return iOooO0oo;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOO0O(int i, int i2, int i3) {
        int i4;
        int i5;
        LazySpanLookup lazySpanLookup;
        int[] iArr;
        ArrayList arrayList;
        LazySpanLookup.FullSpanItem fullSpanItem;
        int size;
        int i6;
        int i7;
        int iOooO0oo = this.f66123OooOooo ? OooO0oo() : OooO0oO();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                lazySpanLookup = this.f66125Oooo0;
                iArr = lazySpanLookup.f66137OooO00o;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = lazySpanLookup.f66138OooO0O0;
                    if (arrayList != null) {
                        if (arrayList == null) {
                            fullSpanItem = null;
                            if (fullSpanItem != null) {
                                lazySpanLookup.f66138OooO0O0.remove(fullSpanItem);
                            }
                            size = lazySpanLookup.f66138OooO0O0.size();
                            i6 = 0;
                            while (true) {
                                if (i6 < size) {
                                    i6 = -1;
                                    break;
                                } else if (((LazySpanLookup.FullSpanItem) lazySpanLookup.f66138OooO0O0.get(i6)).f66140OooOo0o >= i5) {
                                    break;
                                } else {
                                    i6++;
                                }
                            }
                            if (i6 == -1) {
                                LazySpanLookup.FullSpanItem fullSpanItem2 = (LazySpanLookup.FullSpanItem) lazySpanLookup.f66138OooO0O0.get(i6);
                                lazySpanLookup.f66138OooO0O0.remove(i6);
                                i7 = fullSpanItem2.f66140OooOo0o;
                            } else {
                                i7 = -1;
                            }
                            if (i7 != -1) {
                                int[] iArr2 = lazySpanLookup.f66137OooO00o;
                                Arrays.fill(iArr2, i5, iArr2.length, -1);
                                int length = lazySpanLookup.f66137OooO00o.length;
                            } else {
                                Arrays.fill(lazySpanLookup.f66137OooO00o, i5, Math.min(i7 + 1, lazySpanLookup.f66137OooO00o.length), -1);
                            }
                        } else {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                fullSpanItem = (LazySpanLookup.FullSpanItem) lazySpanLookup.f66138OooO0O0.get(size2);
                                if (fullSpanItem.f66140OooOo0o == i5) {
                                    break;
                                }
                            }
                            fullSpanItem = null;
                            if (fullSpanItem != null) {
                            }
                            size = lazySpanLookup.f66138OooO0O0.size();
                            i6 = 0;
                            while (true) {
                                if (i6 < size) {
                                }
                                i6++;
                            }
                            if (i6 == -1) {
                            }
                            if (i7 != -1) {
                            }
                        }
                    }
                }
                if (i3 != 1) {
                    lazySpanLookup.OooO0OO(i, i2);
                } else if (i3 == 2) {
                    lazySpanLookup.OooO0Oo(i, i2);
                } else if (i3 == 8) {
                    lazySpanLookup.OooO0Oo(i, 1);
                    lazySpanLookup.OooO0OO(i2, 1);
                }
                if (i4 > iOooO0oo) {
                    return;
                }
                if (i5 <= (this.f66123OooOooo ? OooO0oO() : OooO0oo())) {
                    requestLayout();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        lazySpanLookup = this.f66125Oooo0;
        iArr = lazySpanLookup.f66137OooO00o;
        if (iArr != null) {
            arrayList = lazySpanLookup.f66138OooO0O0;
            if (arrayList != null) {
            }
        }
        if (i3 != 1) {
        }
        if (i4 > iOooO0oo) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View OooOO0o() {
        int childCount = getChildCount();
        int i = childCount - 1;
        BitSet bitSet = new BitSet(this.f66116OooOo0o);
        bitSet.set(0, this.f66116OooOo0o, true);
        byte b = (this.f66119OooOoOO == 1 && isLayoutRTL()) ? (byte) 1 : (byte) -1;
        if (this.f66123OooOooo) {
            childCount = -1;
        } else {
            i = 0;
        }
        int i2 = i < childCount ? 1 : -1;
        while (i != childCount) {
            View childAt = getChildAt(i);
            OooO0OO oooO0OO = (OooO0OO) childAt.getLayoutParams();
            if (bitSet.get(oooO0OO.f66151OooOo0o.f66157OooO0o0)) {
                C22079OooO0Oo c22079OooO0Oo = oooO0OO.f66151OooOo0o;
                if (this.f66123OooOooo) {
                    int i3 = c22079OooO0Oo.f66154OooO0OO;
                    if (i3 == Integer.MIN_VALUE) {
                        c22079OooO0Oo.OooO00o();
                        i3 = c22079OooO0Oo.f66154OooO0OO;
                    }
                    if (i3 < this.f66118OooOoO0.OooO0oO()) {
                        ((OooO0OO) ((View) C21505OooO0Oo.OooO00o(1, c22079OooO0Oo.f66152OooO00o)).getLayoutParams()).getClass();
                        return childAt;
                    }
                } else {
                    int i4 = c22079OooO0Oo.f66153OooO0O0;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = c22079OooO0Oo.f66152OooO00o.get(0);
                        OooO0OO oooO0OO2 = (OooO0OO) view.getLayoutParams();
                        c22079OooO0Oo.f66153OooO0O0 = StaggeredGridLayoutManager.this.f66118OooOoO0.OooO0o0(view);
                        oooO0OO2.getClass();
                        i4 = c22079OooO0Oo.f66153OooO0O0;
                    }
                    if (i4 > this.f66118OooOoO0.OooOO0O()) {
                        ((OooO0OO) c22079OooO0Oo.f66152OooO00o.get(0).getLayoutParams()).getClass();
                        return childAt;
                    }
                }
                bitSet.clear(oooO0OO.f66151OooOo0o.f66157OooO0o0);
            }
            i += i2;
            if (i != childCount) {
                View childAt2 = getChildAt(i);
                if (this.f66123OooOooo) {
                    int iOooO0O0 = this.f66118OooOoO0.OooO0O0(childAt);
                    int iOooO0O02 = this.f66118OooOoO0.OooO0O0(childAt2);
                    if (iOooO0O0 < iOooO0O02) {
                        return childAt;
                    }
                    if (iOooO0O0 == iOooO0O02) {
                        if ((oooO0OO.f66151OooOo0o.f66157OooO0o0 - ((OooO0OO) childAt2.getLayoutParams()).f66151OooOo0o.f66157OooO0o0 >= 0) == (b >= 0)) {
                            return childAt;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int iOooO0o0 = this.f66118OooOoO0.OooO0o0(childAt);
                    int iOooO0o02 = this.f66118OooOoO0.OooO0o0(childAt2);
                    if (iOooO0o0 > iOooO0o02) {
                        return childAt;
                    }
                    if (iOooO0o0 == iOooO0o02) {
                        if ((oooO0OO.f66151OooOo0o.f66157OooO0o0 - ((OooO0OO) childAt2.getLayoutParams()).f66151OooOo0o.f66157OooO0o0 >= 0) == (b >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0413  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOOO(RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO, boolean z) {
        SavedState savedState;
        int position;
        int i;
        boolean z2;
        SavedState savedState2 = this.f66131Oooo0o;
        OooO0O0 oooO0O0 = this.f66134Oooo0oo;
        if (!(savedState2 == null && this.f66127Oooo00O == -1) && c22075OooOoOO.OooO0O0() == 0) {
            removeAndRecycleAllViews(c22071OooOo0O);
            oooO0O0.OooO00o();
            return;
        }
        boolean z3 = true;
        boolean z4 = (oooO0O0.f66149OooO0o0 && this.f66127Oooo00O == -1 && this.f66131Oooo0o == null) ? false : true;
        LazySpanLookup lazySpanLookup = this.f66125Oooo0;
        StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
        if (z4) {
            oooO0O0.OooO00o();
            SavedState savedState3 = this.f66131Oooo0o;
            if (savedState3 != null) {
                int i2 = savedState3.f66161OooOoO0;
                if (i2 > 0) {
                    if (i2 == this.f66116OooOo0o) {
                        for (int i3 = 0; i3 < this.f66116OooOo0o; i3++) {
                            this.f66115OooOo[i3].OooO0O0();
                            SavedState savedState4 = this.f66131Oooo0o;
                            int iOooO0oO = savedState4.f66160OooOoO[i3];
                            if (iOooO0oO != Integer.MIN_VALUE) {
                                iOooO0oO += savedState4.f66166OooOooo ? this.f66118OooOoO0.OooO0oO() : this.f66118OooOoO0.OooOO0O();
                            }
                            C22079OooO0Oo c22079OooO0Oo = this.f66115OooOo[i3];
                            c22079OooO0Oo.f66153OooO0O0 = iOooO0oO;
                            c22079OooO0Oo.f66154OooO0OO = iOooO0oO;
                        }
                    } else {
                        savedState3.f66160OooOoO = null;
                        savedState3.f66161OooOoO0 = 0;
                        savedState3.f66162OooOoOO = 0;
                        savedState3.f66164OooOoo0 = null;
                        savedState3.f66163OooOoo = null;
                        savedState3.f66159OooOo0o = savedState3.f66158OooOo;
                    }
                }
                SavedState savedState5 = this.f66131Oooo0o;
                this.f66132Oooo0o0 = savedState5.f66167Oooo000;
                boolean z5 = savedState5.f66165OooOooO;
                assertNotInLayoutOrScroll(null);
                SavedState savedState6 = this.f66131Oooo0o;
                if (savedState6 != null && savedState6.f66165OooOooO != z5) {
                    savedState6.f66165OooOooO = z5;
                }
                this.f66122OooOooO = z5;
                requestLayout();
                resolveShouldLayoutReverse();
                SavedState savedState7 = this.f66131Oooo0o;
                int i4 = savedState7.f66159OooOo0o;
                if (i4 != -1) {
                    this.f66127Oooo00O = i4;
                    oooO0O0.f66146OooO0OO = savedState7.f66166OooOooo;
                } else {
                    oooO0O0.f66146OooO0OO = this.f66123OooOooo;
                }
                if (savedState7.f66162OooOoOO > 1) {
                    lazySpanLookup.f66137OooO00o = savedState7.f66164OooOoo0;
                    lazySpanLookup.f66138OooO0O0 = savedState7.f66163OooOoo;
                }
            } else {
                resolveShouldLayoutReverse();
                oooO0O0.f66146OooO0OO = this.f66123OooOooo;
            }
            if (c22075OooOoOO.f66100OooO0oO || (i = this.f66127Oooo00O) == -1) {
                if (this.f66130Oooo0OO) {
                    int iOooO0O0 = c22075OooOoOO.OooO0O0();
                    int childCount = getChildCount();
                    for (int i5 = 0; i5 < childCount; i5++) {
                        int position2 = getPosition(getChildAt(i5));
                        if (position2 >= 0 && position2 < iOooO0O0) {
                            position = position2;
                            break;
                        }
                    }
                    position = 0;
                    oooO0O0.f66144OooO00o = position;
                    oooO0O0.f66145OooO0O0 = Integer.MIN_VALUE;
                    oooO0O0.f66149OooO0o0 = true;
                } else {
                    int iOooO0O02 = c22075OooOoOO.OooO0O0();
                    for (int childCount2 = getChildCount() - 1; childCount2 >= 0; childCount2--) {
                        position = getPosition(getChildAt(childCount2));
                        if (position >= 0 && position < iOooO0O02) {
                            break;
                        }
                    }
                    position = 0;
                    oooO0O0.f66144OooO00o = position;
                    oooO0O0.f66145OooO0O0 = Integer.MIN_VALUE;
                    oooO0O0.f66149OooO0o0 = true;
                }
            } else if (i < 0 || i >= c22075OooOoOO.OooO0O0()) {
                this.f66127Oooo00O = -1;
                this.f66128Oooo00o = Integer.MIN_VALUE;
                if (this.f66130Oooo0OO) {
                }
            } else {
                SavedState savedState8 = this.f66131Oooo0o;
                if (savedState8 == null || savedState8.f66159OooOo0o == -1 || savedState8.f66161OooOoO0 < 1) {
                    View viewFindViewByPosition = findViewByPosition(this.f66127Oooo00O);
                    if (viewFindViewByPosition != null) {
                        oooO0O0.f66144OooO00o = this.f66123OooOooo ? OooO0oo() : OooO0oO();
                        if (this.f66128Oooo00o != Integer.MIN_VALUE) {
                            if (oooO0O0.f66146OooO0OO) {
                                oooO0O0.f66145OooO0O0 = (this.f66118OooOoO0.OooO0oO() - this.f66128Oooo00o) - this.f66118OooOoO0.OooO0O0(viewFindViewByPosition);
                            } else {
                                oooO0O0.f66145OooO0O0 = (this.f66118OooOoO0.OooOO0O() + this.f66128Oooo00o) - this.f66118OooOoO0.OooO0o0(viewFindViewByPosition);
                            }
                        } else if (this.f66118OooOoO0.OooO0OO(viewFindViewByPosition) > this.f66118OooOoO0.OooOO0o()) {
                            oooO0O0.f66145OooO0O0 = oooO0O0.f66146OooO0OO ? this.f66118OooOoO0.OooO0oO() : this.f66118OooOoO0.OooOO0O();
                        } else {
                            int iOooO0o0 = this.f66118OooOoO0.OooO0o0(viewFindViewByPosition) - this.f66118OooOoO0.OooOO0O();
                            if (iOooO0o0 < 0) {
                                oooO0O0.f66145OooO0O0 = -iOooO0o0;
                            } else {
                                int iOooO0oO2 = this.f66118OooOoO0.OooO0oO() - this.f66118OooOoO0.OooO0O0(viewFindViewByPosition);
                                if (iOooO0oO2 < 0) {
                                    oooO0O0.f66145OooO0O0 = iOooO0oO2;
                                } else {
                                    oooO0O0.f66145OooO0O0 = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i6 = this.f66127Oooo00O;
                        oooO0O0.f66144OooO00o = i6;
                        int i7 = this.f66128Oooo00o;
                        if (i7 == Integer.MIN_VALUE) {
                            if (getChildCount() == 0) {
                                z2 = this.f66123OooOooo;
                            } else if ((i6 < OooO0oO()) != this.f66123OooOooo) {
                            }
                            oooO0O0.f66146OooO0OO = z2;
                            oooO0O0.f66145OooO0O0 = z2 ? staggeredGridLayoutManager.f66118OooOoO0.OooO0oO() : staggeredGridLayoutManager.f66118OooOoO0.OooOO0O();
                        } else if (oooO0O0.f66146OooO0OO) {
                            oooO0O0.f66145OooO0O0 = staggeredGridLayoutManager.f66118OooOoO0.OooO0oO() - i7;
                        } else {
                            oooO0O0.f66145OooO0O0 = staggeredGridLayoutManager.f66118OooOoO0.OooOO0O() + i7;
                        }
                        oooO0O0.f66147OooO0Oo = true;
                    }
                } else {
                    oooO0O0.f66145OooO0O0 = Integer.MIN_VALUE;
                    oooO0O0.f66144OooO00o = this.f66127Oooo00O;
                }
                oooO0O0.f66149OooO0o0 = true;
            }
        }
        if (this.f66131Oooo0o == null && this.f66127Oooo00O == -1 && (oooO0O0.f66146OooO0OO != this.f66130Oooo0OO || isLayoutRTL() != this.f66132Oooo0o0)) {
            lazySpanLookup.OooO00o();
            oooO0O0.f66147OooO0Oo = true;
        }
        if (getChildCount() > 0 && ((savedState = this.f66131Oooo0o) == null || savedState.f66161OooOoO0 < 1)) {
            if (oooO0O0.f66147OooO0Oo) {
                for (int i8 = 0; i8 < this.f66116OooOo0o; i8++) {
                    this.f66115OooOo[i8].OooO0O0();
                    int i9 = oooO0O0.f66145OooO0O0;
                    if (i9 != Integer.MIN_VALUE) {
                        C22079OooO0Oo c22079OooO0Oo2 = this.f66115OooOo[i8];
                        c22079OooO0Oo2.f66153OooO0O0 = i9;
                        c22079OooO0Oo2.f66154OooO0OO = i9;
                    }
                }
            } else if (z4 || oooO0O0.f66148OooO0o == null) {
                for (int i10 = 0; i10 < this.f66116OooOo0o; i10++) {
                    C22079OooO0Oo c22079OooO0Oo3 = this.f66115OooOo[i10];
                    boolean z6 = this.f66123OooOooo;
                    int i11 = oooO0O0.f66145OooO0O0;
                    int iOooO0o = z6 ? c22079OooO0Oo3.OooO0o(Integer.MIN_VALUE) : c22079OooO0Oo3.OooO0oo(Integer.MIN_VALUE);
                    c22079OooO0Oo3.OooO0O0();
                    if (iOooO0o != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                        if ((!z6 || iOooO0o >= staggeredGridLayoutManager2.f66118OooOoO0.OooO0oO()) && (z6 || iOooO0o <= staggeredGridLayoutManager2.f66118OooOoO0.OooOO0O())) {
                            if (i11 != Integer.MIN_VALUE) {
                                iOooO0o += i11;
                            }
                            c22079OooO0Oo3.f66154OooO0OO = iOooO0o;
                            c22079OooO0Oo3.f66153OooO0O0 = iOooO0o;
                        }
                    }
                }
                C22079OooO0Oo[] c22079OooO0OoArr = this.f66115OooOo;
                int length = c22079OooO0OoArr.length;
                int[] iArr = oooO0O0.f66148OooO0o;
                if (iArr == null || iArr.length < length) {
                    oooO0O0.f66148OooO0o = new int[staggeredGridLayoutManager.f66115OooOo.length];
                }
                for (int i12 = 0; i12 < length; i12++) {
                    oooO0O0.f66148OooO0o[i12] = c22079OooO0OoArr[i12].OooO0oo(Integer.MIN_VALUE);
                }
            } else {
                for (int i13 = 0; i13 < this.f66116OooOo0o; i13++) {
                    C22079OooO0Oo c22079OooO0Oo4 = this.f66115OooOo[i13];
                    c22079OooO0Oo4.OooO0O0();
                    int i14 = oooO0O0.f66148OooO0o[i13];
                    c22079OooO0Oo4.f66153OooO0O0 = i14;
                    c22079OooO0Oo4.f66154OooO0OO = i14;
                }
            }
        }
        detachAndScrapAttachedViews(c22071OooOo0O);
        C22048OooOo0 c22048OooOo0 = this.f66120OooOoo;
        c22048OooOo0.f66012OooO00o = false;
        int iOooOO0o = this.f66117OooOoO.OooOO0o();
        this.f66121OooOoo0 = iOooOO0o / this.f66116OooOo0o;
        View.MeasureSpec.makeMeasureSpec(iOooOO0o, this.f66117OooOoO.OooO());
        OooOo0(oooO0O0.f66144OooO00o, c22075OooOoOO);
        if (oooO0O0.f66146OooO0OO) {
            OooOo00(-1);
            OooO0O0(c22071OooOo0O, c22048OooOo0, c22075OooOoOO);
            OooOo00(1);
            c22048OooOo0.f66014OooO0OO = oooO0O0.f66144OooO00o + c22048OooOo0.f66015OooO0Oo;
            OooO0O0(c22071OooOo0O, c22048OooOo0, c22075OooOoOO);
        } else {
            OooOo00(1);
            OooO0O0(c22071OooOo0O, c22048OooOo0, c22075OooOoOO);
            OooOo00(-1);
            c22048OooOo0.f66014OooO0OO = oooO0O0.f66144OooO00o + c22048OooOo0.f66015OooO0Oo;
            OooO0O0(c22071OooOo0O, c22048OooOo0, c22075OooOoOO);
        }
        if (this.f66117OooOoO.OooO() != 1073741824) {
            int childCount3 = getChildCount();
            float fMax = 0.0f;
            for (int i15 = 0; i15 < childCount3; i15++) {
                View childAt = getChildAt(i15);
                float fOooO0OO = this.f66117OooOoO.OooO0OO(childAt);
                if (fOooO0OO >= fMax) {
                    ((OooO0OO) childAt.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fOooO0OO);
                }
            }
            int i16 = this.f66121OooOoo0;
            int iRound = Math.round(fMax * this.f66116OooOo0o);
            if (this.f66117OooOoO.OooO() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f66117OooOoO.OooOO0o());
            }
            this.f66121OooOoo0 = iRound / this.f66116OooOo0o;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f66117OooOoO.OooO());
            if (this.f66121OooOoo0 != i16) {
                for (int i17 = 0; i17 < childCount3; i17++) {
                    View childAt2 = getChildAt(i17);
                    OooO0OO oooO0OO = (OooO0OO) childAt2.getLayoutParams();
                    oooO0OO.getClass();
                    if (isLayoutRTL() && this.f66119OooOoOO == 1) {
                        int i18 = -((this.f66116OooOo0o - 1) - oooO0OO.f66151OooOo0o.f66157OooO0o0);
                        childAt2.offsetLeftAndRight((this.f66121OooOoo0 * i18) - (i18 * i16));
                    } else {
                        int i19 = oooO0OO.f66151OooOo0o.f66157OooO0o0;
                        int i20 = this.f66121OooOoo0 * i19;
                        int i21 = i19 * i16;
                        if (this.f66119OooOoOO == 1) {
                            childAt2.offsetLeftAndRight(i20 - i21);
                        } else {
                            childAt2.offsetTopAndBottom(i20 - i21);
                        }
                    }
                }
            }
        }
        if (getChildCount() > 0) {
            if (this.f66123OooOooo) {
                OooO0o0(c22071OooOo0O, c22075OooOoOO, true);
                OooO0o(c22071OooOo0O, c22075OooOoOO, false);
            } else {
                OooO0o(c22071OooOo0O, c22075OooOoOO, true);
                OooO0o0(c22071OooOo0O, c22075OooOoOO, false);
            }
        }
        if (!z || c22075OooOoOO.f66100OooO0oO || this.f66129Oooo0O0 == 0 || getChildCount() <= 0 || OooOO0o() == null) {
            z3 = false;
        } else {
            removeCallbacks(this.f66135OoooO0);
            if (!OooO00o()) {
            }
        }
        if (c22075OooOoOO.f66100OooO0oO) {
            oooO0O0.OooO00o();
        }
        this.f66130Oooo0OO = oooO0O0.f66146OooO0OO;
        this.f66132Oooo0o0 = isLayoutRTL();
        if (z3) {
            oooO0O0.OooO00o();
            OooOOO(c22071OooOo0O, c22075OooOoOO, false);
        }
    }

    public final void OooOOO0(View view, int i, int i2) {
        Rect rect = this.f66133Oooo0oO;
        calculateItemDecorationsForChild(view, rect);
        OooO0OO oooO0OO = (OooO0OO) view.getLayoutParams();
        int iOooOo0o = OooOo0o(i, ((ViewGroup.MarginLayoutParams) oooO0OO).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) oooO0OO).rightMargin + rect.right);
        int iOooOo0o2 = OooOo0o(i2, ((ViewGroup.MarginLayoutParams) oooO0OO).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) oooO0OO).bottomMargin + rect.bottom);
        if (shouldMeasureChild(view, iOooOo0o, iOooOo0o2, oooO0OO)) {
            view.measure(iOooOo0o, iOooOo0o2);
        }
    }

    public final boolean OooOOOO(int i) {
        if (this.f66119OooOoOO == 0) {
            return (i == -1) != this.f66123OooOooo;
        }
        return ((i == -1) == this.f66123OooOooo) == isLayoutRTL();
    }

    public final void OooOOOo(int i, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        int iOooO0oO;
        int i2;
        if (i > 0) {
            iOooO0oO = OooO0oo();
            i2 = 1;
        } else {
            iOooO0oO = OooO0oO();
            i2 = -1;
        }
        C22048OooOo0 c22048OooOo0 = this.f66120OooOoo;
        c22048OooOo0.f66012OooO00o = true;
        OooOo0(iOooO0oO, c22075OooOoOO);
        OooOo00(i2);
        c22048OooOo0.f66014OooO0OO = iOooO0oO + c22048OooOo0.f66015OooO0Oo;
        c22048OooOo0.f66013OooO0O0 = Math.abs(i);
    }

    public final void OooOOo(RecyclerView.C22071OooOo0O c22071OooOo0O, int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f66118OooOoO0.OooO0o0(childAt) < i || this.f66118OooOoO0.OooOOOO(childAt) < i) {
                return;
            }
            OooO0OO oooO0OO = (OooO0OO) childAt.getLayoutParams();
            oooO0OO.getClass();
            if (oooO0OO.f66151OooOo0o.f66152OooO00o.size() == 1) {
                return;
            }
            C22079OooO0Oo c22079OooO0Oo = oooO0OO.f66151OooOo0o;
            ArrayList<View> arrayList = c22079OooO0Oo.f66152OooO00o;
            int size = arrayList.size();
            View viewRemove = arrayList.remove(size - 1);
            OooO0OO oooO0OO2 = (OooO0OO) viewRemove.getLayoutParams();
            oooO0OO2.f66151OooOo0o = null;
            if (oooO0OO2.isItemRemoved() || oooO0OO2.isItemChanged()) {
                c22079OooO0Oo.f66155OooO0Oo -= StaggeredGridLayoutManager.this.f66118OooOoO0.OooO0OO(viewRemove);
            }
            if (size == 1) {
                c22079OooO0Oo.f66153OooO0O0 = Integer.MIN_VALUE;
            }
            c22079OooO0Oo.f66154OooO0OO = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, c22071OooOo0O);
        }
    }

    public final void OooOOo0(RecyclerView.C22071OooOo0O c22071OooOo0O, C22048OooOo0 c22048OooOo0) {
        if (!c22048OooOo0.f66012OooO00o || c22048OooOo0.f66011OooO) {
            return;
        }
        if (c22048OooOo0.f66013OooO0O0 == 0) {
            if (c22048OooOo0.f66017OooO0o0 == -1) {
                OooOOo(c22071OooOo0O, c22048OooOo0.f66018OooO0oO);
                return;
            } else {
                OooOOoo(c22071OooOo0O, c22048OooOo0.f66016OooO0o);
                return;
            }
        }
        int i = 1;
        if (c22048OooOo0.f66017OooO0o0 == -1) {
            int i2 = c22048OooOo0.f66016OooO0o;
            int iOooO0oo = this.f66115OooOo[0].OooO0oo(i2);
            while (i < this.f66116OooOo0o) {
                int iOooO0oo2 = this.f66115OooOo[i].OooO0oo(i2);
                if (iOooO0oo2 > iOooO0oo) {
                    iOooO0oo = iOooO0oo2;
                }
                i++;
            }
            int i3 = i2 - iOooO0oo;
            OooOOo(c22071OooOo0O, i3 < 0 ? c22048OooOo0.f66018OooO0oO : c22048OooOo0.f66018OooO0oO - Math.min(i3, c22048OooOo0.f66013OooO0O0));
            return;
        }
        int i4 = c22048OooOo0.f66018OooO0oO;
        int iOooO0o = this.f66115OooOo[0].OooO0o(i4);
        while (i < this.f66116OooOo0o) {
            int iOooO0o2 = this.f66115OooOo[i].OooO0o(i4);
            if (iOooO0o2 < iOooO0o) {
                iOooO0o = iOooO0o2;
            }
            i++;
        }
        int i5 = iOooO0o - c22048OooOo0.f66018OooO0oO;
        OooOOoo(c22071OooOo0O, i5 < 0 ? c22048OooOo0.f66016OooO0o : Math.min(i5, c22048OooOo0.f66013OooO0O0) + c22048OooOo0.f66016OooO0o);
    }

    public final void OooOOoo(RecyclerView.C22071OooOo0O c22071OooOo0O, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f66118OooOoO0.OooO0O0(childAt) > i || this.f66118OooOoO0.OooOOO(childAt) > i) {
                return;
            }
            OooO0OO oooO0OO = (OooO0OO) childAt.getLayoutParams();
            oooO0OO.getClass();
            if (oooO0OO.f66151OooOo0o.f66152OooO00o.size() == 1) {
                return;
            }
            C22079OooO0Oo c22079OooO0Oo = oooO0OO.f66151OooOo0o;
            ArrayList<View> arrayList = c22079OooO0Oo.f66152OooO00o;
            View viewRemove = arrayList.remove(0);
            OooO0OO oooO0OO2 = (OooO0OO) viewRemove.getLayoutParams();
            oooO0OO2.f66151OooOo0o = null;
            if (arrayList.size() == 0) {
                c22079OooO0Oo.f66154OooO0OO = Integer.MIN_VALUE;
            }
            if (oooO0OO2.isItemRemoved() || oooO0OO2.isItemChanged()) {
                c22079OooO0Oo.f66155OooO0Oo -= StaggeredGridLayoutManager.this.f66118OooOoO0.OooO0OO(viewRemove);
            }
            c22079OooO0Oo.f66153OooO0O0 = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, c22071OooOo0O);
        }
    }

    public final void OooOo0(int i, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        int iOooOO0o;
        int iOooOO0o2;
        int i2;
        C22048OooOo0 c22048OooOo0 = this.f66120OooOoo;
        boolean z = false;
        c22048OooOo0.f66013OooO0O0 = 0;
        c22048OooOo0.f66014OooO0OO = i;
        if (!isSmoothScrolling() || (i2 = c22075OooOoOO.f66094OooO00o) == -1) {
            iOooOO0o = 0;
            iOooOO0o2 = 0;
        } else {
            if (this.f66123OooOooo == (i2 < i)) {
                iOooOO0o = this.f66118OooOoO0.OooOO0o();
                iOooOO0o2 = 0;
            } else {
                iOooOO0o2 = this.f66118OooOoO0.OooOO0o();
                iOooOO0o = 0;
            }
        }
        if (getClipToPadding()) {
            c22048OooOo0.f66016OooO0o = this.f66118OooOoO0.OooOO0O() - iOooOO0o2;
            c22048OooOo0.f66018OooO0oO = this.f66118OooOoO0.OooO0oO() + iOooOO0o;
        } else {
            c22048OooOo0.f66018OooO0oO = this.f66118OooOoO0.OooO0o() + iOooOO0o;
            c22048OooOo0.f66016OooO0o = -iOooOO0o2;
        }
        c22048OooOo0.f66019OooO0oo = false;
        c22048OooOo0.f66012OooO00o = true;
        if (this.f66118OooOoO0.OooO() == 0 && this.f66118OooOoO0.OooO0o() == 0) {
            z = true;
        }
        c22048OooOo0.f66011OooO = z;
    }

    public final void OooOo00(int i) {
        C22048OooOo0 c22048OooOo0 = this.f66120OooOoo;
        c22048OooOo0.f66017OooO0o0 = i;
        c22048OooOo0.f66015OooO0Oo = this.f66123OooOooo != (i == -1) ? -1 : 1;
    }

    public final void OooOo0O(C22079OooO0Oo c22079OooO0Oo, int i, int i2) {
        int i3 = c22079OooO0Oo.f66155OooO0Oo;
        int i4 = c22079OooO0Oo.f66157OooO0o0;
        if (i != -1) {
            int i5 = c22079OooO0Oo.f66154OooO0OO;
            if (i5 == Integer.MIN_VALUE) {
                c22079OooO0Oo.OooO00o();
                i5 = c22079OooO0Oo.f66154OooO0OO;
            }
            if (i5 - i3 >= i2) {
                this.f66126Oooo000.set(i4, false);
                return;
            }
            return;
        }
        int i6 = c22079OooO0Oo.f66153OooO0O0;
        if (i6 == Integer.MIN_VALUE) {
            View view = c22079OooO0Oo.f66152OooO00o.get(0);
            OooO0OO oooO0OO = (OooO0OO) view.getLayoutParams();
            c22079OooO0Oo.f66153OooO0O0 = StaggeredGridLayoutManager.this.f66118OooOoO0.OooO0o0(view);
            oooO0OO.getClass();
            i6 = c22079OooO0Oo.f66153OooO0O0;
        }
        if (i6 + i3 <= i2) {
            this.f66126Oooo000.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.f66131Oooo0o == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final boolean canScrollHorizontally() {
        return this.f66119OooOoOO == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final boolean canScrollVertically() {
        return this.f66119OooOoOO == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final boolean checkLayoutParams(RecyclerView.C22066OooOOOo c22066OooOOOo) {
        return c22066OooOOOo instanceof OooO0OO;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.C22075OooOoOO c22075OooOoOO, RecyclerView.OooOOOO.OooO0OO oooO0OO) {
        C22048OooOo0 c22048OooOo0;
        int iOooO0o;
        int iOooO0oo;
        if (this.f66119OooOoOO != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        OooOOOo(i, c22075OooOoOO);
        int[] iArr = this.f66136OoooO00;
        if (iArr == null || iArr.length < this.f66116OooOo0o) {
            this.f66136OoooO00 = new int[this.f66116OooOo0o];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f66116OooOo0o;
            c22048OooOo0 = this.f66120OooOoo;
            if (i3 >= i5) {
                break;
            }
            if (c22048OooOo0.f66015OooO0Oo == -1) {
                iOooO0o = c22048OooOo0.f66016OooO0o;
                iOooO0oo = this.f66115OooOo[i3].OooO0oo(iOooO0o);
            } else {
                iOooO0o = this.f66115OooOo[i3].OooO0o(c22048OooOo0.f66018OooO0oO);
                iOooO0oo = c22048OooOo0.f66018OooO0oO;
            }
            int i6 = iOooO0o - iOooO0oo;
            if (i6 >= 0) {
                this.f66136OoooO00[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.f66136OoooO00, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = c22048OooOo0.f66014OooO0OO;
            if (i8 < 0 || i8 >= c22075OooOoOO.OooO0O0()) {
                return;
            }
            ((RunnableC22046OooOOo0.OooO0O0) oooO0OO).OooO00o(c22048OooOo0.f66014OooO0OO, this.f66136OoooO00[i7]);
            c22048OooOo0.f66014OooO0OO += c22048OooOo0.f66015OooO0Oo;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final int computeHorizontalScrollExtent(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        return computeScrollExtent(c22075OooOoOO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final int computeHorizontalScrollOffset(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        return computeScrollOffset(c22075OooOoOO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final int computeHorizontalScrollRange(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        return computeScrollRange(c22075OooOoOO);
    }

    public final int computeScrollExtent(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        if (getChildCount() == 0) {
            return 0;
        }
        AbstractC22055OooOoo0 abstractC22055OooOoo0 = this.f66118OooOoO0;
        boolean z = !this.f66124Oooo;
        return C22057OooOooo.OooO00o(c22075OooOoOO, abstractC22055OooOoo0, OooO0Oo(z), OooO0OO(z), this, this.f66124Oooo);
    }

    public final int computeScrollOffset(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        if (getChildCount() == 0) {
            return 0;
        }
        AbstractC22055OooOoo0 abstractC22055OooOoo0 = this.f66118OooOoO0;
        boolean z = !this.f66124Oooo;
        return C22057OooOooo.OooO0O0(c22075OooOoOO, abstractC22055OooOoo0, OooO0Oo(z), OooO0OO(z), this, this.f66124Oooo, this.f66123OooOooo);
    }

    public final int computeScrollRange(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        if (getChildCount() == 0) {
            return 0;
        }
        AbstractC22055OooOoo0 abstractC22055OooOoo0 = this.f66118OooOoO0;
        boolean z = !this.f66124Oooo;
        return C22057OooOooo.OooO0OO(c22075OooOoOO, abstractC22055OooOoo0, OooO0Oo(z), OooO0OO(z), this, this.f66124Oooo);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22073OooOoO.OooO0O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF computeScrollVectorForPosition(int i) {
        int i2 = -1;
        if (getChildCount() != 0) {
            if ((i < OooO0oO()) == this.f66123OooOooo) {
            }
        } else if (this.f66123OooOooo) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.f66119OooOoOO == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final int computeVerticalScrollExtent(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        return computeScrollExtent(c22075OooOoOO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final int computeVerticalScrollOffset(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        return computeScrollOffset(c22075OooOoOO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final int computeVerticalScrollRange(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        return computeScrollRange(c22075OooOoOO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final RecyclerView.C22066OooOOOo generateDefaultLayoutParams() {
        return this.f66119OooOoOO == 0 ? new OooO0OO(-2, -1) : new OooO0OO(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final RecyclerView.C22066OooOOOo generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new OooO0OO(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final boolean isAutoMeasureEnabled() {
        return this.f66129Oooo0O0 != 0;
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.f66116OooOo0o; i2++) {
            C22079OooO0Oo c22079OooO0Oo = this.f66115OooOo[i2];
            int i3 = c22079OooO0Oo.f66153OooO0O0;
            if (i3 != Integer.MIN_VALUE) {
                c22079OooO0Oo.f66153OooO0O0 = i3 + i;
            }
            int i4 = c22079OooO0Oo.f66154OooO0OO;
            if (i4 != Integer.MIN_VALUE) {
                c22079OooO0Oo.f66154OooO0OO = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.f66116OooOo0o; i2++) {
            C22079OooO0Oo c22079OooO0Oo = this.f66115OooOo[i2];
            int i3 = c22079OooO0Oo.f66153OooO0O0;
            if (i3 != Integer.MIN_VALUE) {
                c22079OooO0Oo.f66153OooO0O0 = i3 + i;
            }
            int i4 = c22079OooO0Oo.f66154OooO0OO;
            if (i4 != Integer.MIN_VALUE) {
                c22079OooO0Oo.f66154OooO0OO = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void onAdapterChanged(RecyclerView.AbstractC22062OooO0oO abstractC22062OooO0oO, RecyclerView.AbstractC22062OooO0oO abstractC22062OooO0oO2) {
        this.f66125Oooo0.OooO00o();
        for (int i = 0; i < this.f66116OooOo0o; i++) {
            this.f66115OooOo[i].OooO0O0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C22071OooOo0O c22071OooOo0O) {
        super.onDetachedFromWindow(recyclerView, c22071OooOo0O);
        removeCallbacks(this.f66135OoooO0);
        for (int i = 0; i < this.f66116OooOo0o; i++) {
            this.f66115OooOo[i].OooO0O0();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onFocusSearchFailed(View view, int i, RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        View viewFindContainingItemView;
        int i2;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i == 66 ? this.f66119OooOoOO == 0 : !(i != 130 || this.f66119OooOoOO != 1)) {
                            i2 = 1;
                        }
                    } else if (this.f66119OooOoOO == 1) {
                        i2 = -1;
                    }
                    i2 = Integer.MIN_VALUE;
                } else if (this.f66119OooOoOO != 0) {
                    i2 = Integer.MIN_VALUE;
                }
            } else if (this.f66119OooOoOO != 1 && isLayoutRTL()) {
            }
        } else if (this.f66119OooOoOO != 1 && isLayoutRTL()) {
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        OooO0OO oooO0OO = (OooO0OO) viewFindContainingItemView.getLayoutParams();
        oooO0OO.getClass();
        C22079OooO0Oo c22079OooO0Oo = oooO0OO.f66151OooOo0o;
        int iOooO0oo = i2 == 1 ? OooO0oo() : OooO0oO();
        OooOo0(iOooO0oo, c22075OooOoOO);
        OooOo00(i2);
        C22048OooOo0 c22048OooOo0 = this.f66120OooOoo;
        c22048OooOo0.f66014OooO0OO = c22048OooOo0.f66015OooO0Oo + iOooO0oo;
        c22048OooOo0.f66013OooO0O0 = (int) (this.f66118OooOoO0.OooOO0o() * 0.33333334f);
        c22048OooOo0.f66019OooO0oo = true;
        c22048OooOo0.f66012OooO00o = false;
        OooO0O0(c22071OooOo0O, c22048OooOo0, c22075OooOoOO);
        this.f66130Oooo0OO = this.f66123OooOooo;
        View viewOooO0oO = c22079OooO0Oo.OooO0oO(iOooO0oo, i2);
        if (viewOooO0oO != null && viewOooO0oO != viewFindContainingItemView) {
            return viewOooO0oO;
        }
        if (OooOOOO(i2)) {
            for (int i3 = this.f66116OooOo0o - 1; i3 >= 0; i3--) {
                View viewOooO0oO2 = this.f66115OooOo[i3].OooO0oO(iOooO0oo, i2);
                if (viewOooO0oO2 != null && viewOooO0oO2 != viewFindContainingItemView) {
                    return viewOooO0oO2;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f66116OooOo0o; i4++) {
                View viewOooO0oO3 = this.f66115OooOo[i4].OooO0oO(iOooO0oo, i2);
                if (viewOooO0oO3 != null && viewOooO0oO3 != viewFindContainingItemView) {
                    return viewOooO0oO3;
                }
            }
        }
        boolean z = (this.f66122OooOooO ^ true) == (i2 == -1);
        View viewFindViewByPosition = findViewByPosition(z ? c22079OooO0Oo.OooO0OO() : c22079OooO0Oo.OooO0Oo());
        if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
            return viewFindViewByPosition;
        }
        if (OooOOOO(i2)) {
            for (int i5 = this.f66116OooOo0o - 1; i5 >= 0; i5--) {
                if (i5 != c22079OooO0Oo.f66157OooO0o0) {
                    View viewFindViewByPosition2 = findViewByPosition(z ? this.f66115OooOo[i5].OooO0OO() : this.f66115OooOo[i5].OooO0Oo());
                    if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                        return viewFindViewByPosition2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f66116OooOo0o; i6++) {
                View viewFindViewByPosition3 = findViewByPosition(z ? this.f66115OooOo[i6].OooO0OO() : this.f66115OooOo[i6].OooO0Oo());
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewOooO0Oo = OooO0Oo(false);
            View viewOooO0OO = OooO0OO(false);
            if (viewOooO0Oo == null || viewOooO0OO == null) {
                return;
            }
            int position = getPosition(viewOooO0Oo);
            int position2 = getPosition(viewOooO0OO);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        OooOO0O(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.f66125Oooo0.OooO00o();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        OooOO0O(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        OooOO0O(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        OooOO0O(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void onLayoutChildren(RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        OooOOO(c22071OooOo0O, c22075OooOoOO, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void onLayoutCompleted(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        super.onLayoutCompleted(c22075OooOoOO);
        this.f66127Oooo00O = -1;
        this.f66128Oooo00o = Integer.MIN_VALUE;
        this.f66131Oooo0o = null;
        this.f66134Oooo0oo.OooO00o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f66131Oooo0o = savedState;
            if (this.f66127Oooo00O != -1) {
                savedState.f66160OooOoO = null;
                savedState.f66161OooOoO0 = 0;
                savedState.f66159OooOo0o = -1;
                savedState.f66158OooOo = -1;
                savedState.f66160OooOoO = null;
                savedState.f66161OooOoO0 = 0;
                savedState.f66162OooOoOO = 0;
                savedState.f66164OooOoo0 = null;
                savedState.f66163OooOoo = null;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final Parcelable onSaveInstanceState() {
        int iOooO0oo;
        int iOooOO0O;
        int[] iArr;
        SavedState savedState = this.f66131Oooo0o;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f66161OooOoO0 = savedState.f66161OooOoO0;
            savedState2.f66159OooOo0o = savedState.f66159OooOo0o;
            savedState2.f66158OooOo = savedState.f66158OooOo;
            savedState2.f66160OooOoO = savedState.f66160OooOoO;
            savedState2.f66162OooOoOO = savedState.f66162OooOoOO;
            savedState2.f66164OooOoo0 = savedState.f66164OooOoo0;
            savedState2.f66165OooOooO = savedState.f66165OooOooO;
            savedState2.f66166OooOooo = savedState.f66166OooOooo;
            savedState2.f66167Oooo000 = savedState.f66167Oooo000;
            savedState2.f66163OooOoo = savedState.f66163OooOoo;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        savedState3.f66165OooOooO = this.f66122OooOooO;
        savedState3.f66166OooOooo = this.f66130Oooo0OO;
        savedState3.f66167Oooo000 = this.f66132Oooo0o0;
        LazySpanLookup lazySpanLookup = this.f66125Oooo0;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f66137OooO00o) == null) {
            savedState3.f66162OooOoOO = 0;
        } else {
            savedState3.f66164OooOoo0 = iArr;
            savedState3.f66162OooOoOO = iArr.length;
            savedState3.f66163OooOoo = lazySpanLookup.f66138OooO0O0;
        }
        if (getChildCount() <= 0) {
            savedState3.f66159OooOo0o = -1;
            savedState3.f66158OooOo = -1;
            savedState3.f66161OooOoO0 = 0;
            return savedState3;
        }
        savedState3.f66159OooOo0o = this.f66130Oooo0OO ? OooO0oo() : OooO0oO();
        View viewOooO0OO = this.f66123OooOooo ? OooO0OO(true) : OooO0Oo(true);
        savedState3.f66158OooOo = viewOooO0OO != null ? getPosition(viewOooO0OO) : -1;
        int i = this.f66116OooOo0o;
        savedState3.f66161OooOoO0 = i;
        savedState3.f66160OooOoO = new int[i];
        for (int i2 = 0; i2 < this.f66116OooOo0o; i2++) {
            if (this.f66130Oooo0OO) {
                iOooO0oo = this.f66115OooOo[i2].OooO0o(Integer.MIN_VALUE);
                if (iOooO0oo != Integer.MIN_VALUE) {
                    iOooOO0O = this.f66118OooOoO0.OooO0oO();
                    iOooO0oo -= iOooOO0O;
                }
            } else {
                iOooO0oo = this.f66115OooOo[i2].OooO0oo(Integer.MIN_VALUE);
                if (iOooO0oo != Integer.MIN_VALUE) {
                    iOooOO0O = this.f66118OooOoO0.OooOO0O();
                    iOooO0oo -= iOooOO0O;
                }
            }
            savedState3.f66160OooOoO[i2] = iOooO0oo;
        }
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void onScrollStateChanged(int i) {
        if (i == 0) {
            OooO00o();
        }
    }

    public final void resolveShouldLayoutReverse() {
        if (this.f66119OooOoOO == 1 || !isLayoutRTL()) {
            this.f66123OooOooo = this.f66122OooOooO;
        } else {
            this.f66123OooOooo = !this.f66122OooOooO;
        }
    }

    public final int scrollBy(int i, RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        OooOOOo(i, c22075OooOoOO);
        C22048OooOo0 c22048OooOo0 = this.f66120OooOoo;
        int iOooO0O0 = OooO0O0(c22071OooOo0O, c22048OooOo0, c22075OooOoOO);
        if (c22048OooOo0.f66013OooO0O0 >= iOooO0O0) {
            i = i < 0 ? -iOooO0O0 : iOooO0O0;
        }
        this.f66118OooOoO0.OooOOOo(-i);
        this.f66130Oooo0OO = this.f66123OooOooo;
        c22048OooOo0.f66013OooO0O0 = 0;
        OooOOo0(c22071OooOo0O, c22048OooOo0);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final int scrollHorizontallyBy(int i, RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        return scrollBy(i, c22071OooOo0O, c22075OooOoOO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void scrollToPosition(int i) {
        SavedState savedState = this.f66131Oooo0o;
        if (savedState != null && savedState.f66159OooOo0o != i) {
            savedState.f66160OooOoO = null;
            savedState.f66161OooOoO0 = 0;
            savedState.f66159OooOo0o = -1;
            savedState.f66158OooOo = -1;
        }
        this.f66127Oooo00O = i;
        this.f66128Oooo00o = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final int scrollVerticallyBy(int i, RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        return scrollBy(i, c22071OooOo0O, c22075OooOoOO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int iChooseSize;
        int iChooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f66119OooOoOO == 1) {
            iChooseSize2 = RecyclerView.OooOOOO.chooseSize(i2, rect.height() + paddingBottom, getMinimumHeight());
            iChooseSize = RecyclerView.OooOOOO.chooseSize(i, (this.f66121OooOoo0 * this.f66116OooOo0o) + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.OooOOOO.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            iChooseSize2 = RecyclerView.OooOOOO.chooseSize(i2, (this.f66121OooOoo0 * this.f66116OooOo0o) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C22075OooOoOO c22075OooOoOO, int i) {
        C22049OooOo0O c22049OooOo0O = new C22049OooOo0O(recyclerView.getContext());
        c22049OooOo0O.setTargetPosition(i);
        startSmoothScroll(c22049OooOo0O);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final boolean supportsPredictiveItemAnimations() {
        return this.f66131Oooo0o == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final RecyclerView.C22066OooOOOo generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new OooO0OO((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new OooO0OO(layoutParams);
    }
}
