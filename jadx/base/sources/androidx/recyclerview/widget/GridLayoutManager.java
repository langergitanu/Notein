package androidx.recyclerview.widget;

import OooO0Oo.C20398OooO0O0;
import Oooo0oO.C21023OooO0Oo;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RunnableC22046OooOOo0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f65751OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f65752OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public View[] f65753OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int[] f65754OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final SparseIntArray f65755OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public OooO0OO f65756OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final SparseIntArray f65757OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final Rect f65758OooOooO;

    public static final class OooO00o extends OooO0OO {
        @Override // androidx.recyclerview.widget.GridLayoutManager.OooO0OO
        public final int OooO0O0(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.OooO0OO
        public final int OooO0OO(int i) {
            return 1;
        }
    }

    public static class OooO0O0 extends RecyclerView.C22066OooOOOo {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f65759OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f65760OooOo0o;

        public OooO0O0(int i, int i2) {
            super(i, i2);
            this.f65760OooOo0o = -1;
            this.f65759OooOo = 0;
        }
    }

    public static abstract class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SparseIntArray f65761OooO00o = new SparseIntArray();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final SparseIntArray f65762OooO0O0 = new SparseIntArray();

        public final int OooO00o(int i, int i2) {
            int iOooO0OO = OooO0OO(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int iOooO0OO2 = OooO0OO(i5);
                i3 += iOooO0OO2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = iOooO0OO2;
                }
            }
            return i3 + iOooO0OO > i2 ? i4 + 1 : i4;
        }

        public int OooO0O0(int i, int i2) {
            int iOooO0OO = OooO0OO(i);
            if (iOooO0OO == i2) {
                return 0;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int iOooO0OO2 = OooO0OO(i4);
                i3 += iOooO0OO2;
                if (i3 == i2) {
                    i3 = 0;
                } else if (i3 > i2) {
                    i3 = iOooO0OO2;
                }
            }
            if (iOooO0OO + i3 <= i2) {
                return i3;
            }
            return 0;
        }

        public abstract int OooO0OO(int i);

        public final void OooO0Oo() {
            this.f65761OooO00o.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f65752OooOo0o = false;
        this.f65751OooOo = -1;
        this.f65755OooOoOO = new SparseIntArray();
        this.f65757OooOoo0 = new SparseIntArray();
        this.f65756OooOoo = new OooO00o();
        this.f65758OooOooO = new Rect();
        OooO0oo(RecyclerView.OooOOOO.getProperties(context, attributeSet, i, i2).f66068OooO0O0);
    }

    public final void OooO() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        OooO00o(height - paddingTop);
    }

    public final void OooO00o(int i) {
        int i2;
        int[] iArr = this.f65754OooOoO0;
        int i3 = this.f65751OooOo;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f65754OooOoO0 = iArr;
    }

    public final void OooO0O0() {
        View[] viewArr = this.f65753OooOoO;
        if (viewArr == null || viewArr.length != this.f65751OooOo) {
            this.f65753OooOoO = new View[this.f65751OooOo];
        }
    }

    public final int OooO0OO(int i, int i2) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f65754OooOoO0;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f65754OooOoO0;
        int i3 = this.f65751OooOo;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int OooO0Oo(int i, RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        if (!c22075OooOoOO.f66100OooO0oO) {
            return this.f65756OooOoo.OooO00o(i, this.f65751OooOo);
        }
        int iOooO0OO = c22071OooOo0O.OooO0OO(i);
        if (iOooO0OO != -1) {
            return this.f65756OooOoo.OooO00o(iOooO0OO, this.f65751OooOo);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int OooO0o(int i, RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        if (!c22075OooOoOO.f66100OooO0oO) {
            return this.f65756OooOoo.OooO0OO(i);
        }
        int i2 = this.f65755OooOoOO.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iOooO0OO = c22071OooOo0O.OooO0OO(i);
        if (iOooO0OO != -1) {
            return this.f65756OooOoo.OooO0OO(iOooO0OO);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public final int OooO0o0(int i, RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        if (!c22075OooOoOO.f66100OooO0oO) {
            return this.f65756OooOoo.OooO0O0(i, this.f65751OooOo);
        }
        int i2 = this.f65757OooOoo0.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iOooO0OO = c22071OooOo0O.OooO0OO(i);
        if (iOooO0OO != -1) {
            return this.f65756OooOoo.OooO0O0(iOooO0OO, this.f65751OooOo);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final void OooO0oO(View view, int i, boolean z) {
        int childMeasureSpec;
        int childMeasureSpec2;
        OooO0O0 oooO0O0 = (OooO0O0) view.getLayoutParams();
        Rect rect = oooO0O0.mDecorInsets;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) oooO0O0).topMargin + ((ViewGroup.MarginLayoutParams) oooO0O0).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) oooO0O0).leftMargin + ((ViewGroup.MarginLayoutParams) oooO0O0).rightMargin;
        int iOooO0OO = OooO0OO(oooO0O0.f65760OooOo0o, oooO0O0.f65759OooOo);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = RecyclerView.OooOOOO.getChildMeasureSpec(iOooO0OO, i, i3, ((ViewGroup.MarginLayoutParams) oooO0O0).width, false);
            childMeasureSpec = RecyclerView.OooOOOO.getChildMeasureSpec(this.mOrientationHelper.OooOO0o(), getHeightMode(), i2, ((ViewGroup.MarginLayoutParams) oooO0O0).height, true);
        } else {
            int childMeasureSpec3 = RecyclerView.OooOOOO.getChildMeasureSpec(iOooO0OO, i, i2, ((ViewGroup.MarginLayoutParams) oooO0O0).height, false);
            int childMeasureSpec4 = RecyclerView.OooOOOO.getChildMeasureSpec(this.mOrientationHelper.OooOO0o(), getWidthMode(), i3, ((ViewGroup.MarginLayoutParams) oooO0O0).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        RecyclerView.C22066OooOOOo c22066OooOOOo = (RecyclerView.C22066OooOOOo) view.getLayoutParams();
        if (z ? shouldReMeasureChild(view, childMeasureSpec2, childMeasureSpec, c22066OooOOOo) : shouldMeasureChild(view, childMeasureSpec2, childMeasureSpec, c22066OooOOOo)) {
            view.measure(childMeasureSpec2, childMeasureSpec);
        }
    }

    public final void OooO0oo(int i) {
        if (i == this.f65751OooOo) {
            return;
        }
        this.f65752OooOo0o = true;
        if (i < 1) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Span count should be at least 1. Provided "));
        }
        this.f65751OooOo = i;
        this.f65756OooOoo.OooO0Oo();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final boolean checkLayoutParams(RecyclerView.C22066OooOOOo c22066OooOOOo) {
        return c22066OooOOOo instanceof OooO0O0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(RecyclerView.C22075OooOoOO c22075OooOoOO, LinearLayoutManager.OooO0OO oooO0OO, RecyclerView.OooOOOO.OooO0OO oooO0OO2) {
        int i;
        int iOooO0OO = this.f65751OooOo;
        for (int i2 = 0; i2 < this.f65751OooOo && (i = oooO0OO.f65776OooO0Oo) >= 0 && i < c22075OooOoOO.OooO0O0() && iOooO0OO > 0; i2++) {
            int i3 = oooO0OO.f65776OooO0Oo;
            ((RunnableC22046OooOOo0.OooO0O0) oooO0OO2).OooO00o(i3, Math.max(0, oooO0OO.f65779OooO0oO));
            iOooO0OO -= this.f65756OooOoo.OooO0OO(i3);
            oooO0OO.f65776OooO0Oo += oooO0OO.f65778OooO0o0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View findReferenceChild(RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO, boolean z, boolean z2) {
        int i;
        int childCount;
        int childCount2 = getChildCount();
        int i2 = 1;
        if (z2) {
            childCount = getChildCount() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = childCount2;
            childCount = 0;
        }
        int iOooO0O0 = c22075OooOoOO.OooO0O0();
        ensureLayoutState();
        int iOooOO0O = this.mOrientationHelper.OooOO0O();
        int iOooO0oO = this.mOrientationHelper.OooO0oO();
        View view = null;
        View view2 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iOooO0O0 && OooO0o0(position, c22071OooOo0O, c22075OooOoOO) == 0) {
                if (((RecyclerView.C22066OooOOOo) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.OooO0o0(childAt) < iOooO0oO && this.mOrientationHelper.OooO0O0(childAt) >= iOooOO0O) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final RecyclerView.C22066OooOOOo generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new OooO0O0(-2, -1) : new OooO0O0(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final RecyclerView.C22066OooOOOo generateLayoutParams(Context context, AttributeSet attributeSet) {
        OooO0O0 oooO0O0 = new OooO0O0(context, attributeSet);
        oooO0O0.f65760OooOo0o = -1;
        oooO0O0.f65759OooOo = 0;
        return oooO0O0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final int getColumnCountForAccessibility(RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        if (this.mOrientation == 1) {
            return this.f65751OooOo;
        }
        if (c22075OooOoOO.OooO0O0() < 1) {
            return 0;
        }
        return OooO0Oo(c22075OooOoOO.OooO0O0() - 1, c22071OooOo0O, c22075OooOoOO) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final int getRowCountForAccessibility(RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        if (this.mOrientation == 0) {
            return this.f65751OooOo;
        }
        if (c22075OooOoOO.OooO0O0() < 1) {
            return 0;
        }
        return OooO0Oo(c22075OooOoOO.OooO0O0() - 1, c22071OooOo0O, c22075OooOoOO) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void layoutChunk(RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO, LinearLayoutManager.OooO0OO oooO0OO, LinearLayoutManager.OooO0O0 oooO0O0) {
        int i;
        int i2;
        int i3;
        int iOooO0Oo;
        int paddingLeft;
        int paddingTop;
        int iOooO0Oo2;
        int childMeasureSpec;
        int childMeasureSpec2;
        boolean z;
        int i4;
        View viewOooO0O0;
        int iOooOO0 = this.mOrientationHelper.OooOO0();
        boolean z2 = iOooOO0 != 1073741824;
        int i5 = getChildCount() > 0 ? this.f65754OooOoO0[this.f65751OooOo] : 0;
        if (z2) {
            OooO();
        }
        boolean z3 = oooO0OO.f65778OooO0o0 == 1;
        int iOooO0o0 = this.f65751OooOo;
        if (!z3) {
            iOooO0o0 = OooO0o0(oooO0OO.f65776OooO0Oo, c22071OooOo0O, c22075OooOoOO) + OooO0o(oooO0OO.f65776OooO0Oo, c22071OooOo0O, c22075OooOoOO);
        }
        int i6 = 0;
        while (i6 < this.f65751OooOo && (i4 = oooO0OO.f65776OooO0Oo) >= 0 && i4 < c22075OooOoOO.OooO0O0() && iOooO0o0 > 0) {
            int i7 = oooO0OO.f65776OooO0Oo;
            int iOooO0o = OooO0o(i7, c22071OooOo0O, c22075OooOoOO);
            if (iOooO0o > this.f65751OooOo) {
                throw new IllegalArgumentException(C21023OooO0Oo.OooO0OO(" spans.", this.f65751OooOo, C20398OooO0O0.OooO0O0("Item at position ", i7, " requires ", " spans but GridLayoutManager has only ", iOooO0o)));
            }
            iOooO0o0 -= iOooO0o;
            if (iOooO0o0 < 0 || (viewOooO0O0 = oooO0OO.OooO0O0(c22071OooOo0O)) == null) {
                break;
            }
            this.f65753OooOoO[i6] = viewOooO0O0;
            i6++;
        }
        if (i6 == 0) {
            oooO0O0.f65769OooO0O0 = true;
            return;
        }
        if (z3) {
            i3 = 1;
            i2 = i6;
            i = 0;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.f65753OooOoO[i];
            OooO0O0 oooO0O02 = (OooO0O0) view.getLayoutParams();
            int iOooO0o2 = OooO0o(getPosition(view), c22071OooOo0O, c22075OooOoOO);
            oooO0O02.f65759OooOo = iOooO0o2;
            oooO0O02.f65760OooOo0o = i8;
            i8 += iOooO0o2;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.f65753OooOoO[i10];
            if (oooO0OO.f65782OooOO0O != null) {
                z = false;
                if (z3) {
                    addDisappearingView(view2);
                } else {
                    addDisappearingView(view2, 0);
                }
            } else if (z3) {
                addView(view2);
                z = false;
            } else {
                z = false;
                addView(view2, 0);
            }
            calculateItemDecorationsForChild(view2, this.f65758OooOooO);
            OooO0oO(view2, iOooOO0, z);
            int iOooO0OO = this.mOrientationHelper.OooO0OO(view2);
            if (iOooO0OO > i9) {
                i9 = iOooO0OO;
            }
            float fOooO0Oo = (this.mOrientationHelper.OooO0Oo(view2) * 1.0f) / ((OooO0O0) view2.getLayoutParams()).f65759OooOo;
            if (fOooO0Oo > f) {
                f = fOooO0Oo;
            }
        }
        if (z2) {
            OooO00o(Math.max(Math.round(f * this.f65751OooOo), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.f65753OooOoO[i11];
                OooO0oO(view3, 1073741824, true);
                int iOooO0OO2 = this.mOrientationHelper.OooO0OO(view3);
                if (iOooO0OO2 > i9) {
                    i9 = iOooO0OO2;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.f65753OooOoO[i12];
            if (this.mOrientationHelper.OooO0OO(view4) != i9) {
                OooO0O0 oooO0O03 = (OooO0O0) view4.getLayoutParams();
                Rect rect = oooO0O03.mDecorInsets;
                int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) oooO0O03).topMargin + ((ViewGroup.MarginLayoutParams) oooO0O03).bottomMargin;
                int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) oooO0O03).leftMargin + ((ViewGroup.MarginLayoutParams) oooO0O03).rightMargin;
                int iOooO0OO3 = OooO0OO(oooO0O03.f65760OooOo0o, oooO0O03.f65759OooOo);
                if (this.mOrientation == 1) {
                    childMeasureSpec2 = RecyclerView.OooOOOO.getChildMeasureSpec(iOooO0OO3, 1073741824, i14, ((ViewGroup.MarginLayoutParams) oooO0O03).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    childMeasureSpec = RecyclerView.OooOOOO.getChildMeasureSpec(iOooO0OO3, 1073741824, i13, ((ViewGroup.MarginLayoutParams) oooO0O03).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                if (shouldReMeasureChild(view4, childMeasureSpec2, childMeasureSpec, (RecyclerView.C22066OooOOOo) view4.getLayoutParams())) {
                    view4.measure(childMeasureSpec2, childMeasureSpec);
                }
            }
        }
        oooO0O0.f65768OooO00o = i9;
        if (this.mOrientation != 1) {
            if (oooO0OO.f65777OooO0o == -1) {
                int i15 = oooO0OO.f65774OooO0O0;
                paddingLeft = i15 - i9;
                iOooO0Oo = i15;
            } else {
                int i16 = oooO0OO.f65774OooO0O0;
                iOooO0Oo = i16 + i9;
                paddingLeft = i16;
            }
            paddingTop = 0;
            iOooO0Oo2 = 0;
        } else if (oooO0OO.f65777OooO0o == -1) {
            iOooO0Oo2 = oooO0OO.f65774OooO0O0;
            paddingTop = iOooO0Oo2 - i9;
            paddingLeft = 0;
            iOooO0Oo = 0;
        } else {
            int i17 = oooO0OO.f65774OooO0O0;
            paddingTop = i17;
            iOooO0Oo = 0;
            iOooO0Oo2 = i17 + i9;
            paddingLeft = 0;
        }
        for (int i18 = 0; i18 < i6; i18++) {
            View view5 = this.f65753OooOoO[i18];
            OooO0O0 oooO0O04 = (OooO0O0) view5.getLayoutParams();
            if (this.mOrientation != 1) {
                paddingTop = getPaddingTop() + this.f65754OooOoO0[oooO0O04.f65760OooOo0o];
                iOooO0Oo2 = this.mOrientationHelper.OooO0Oo(view5) + paddingTop;
            } else if (isLayoutRTL()) {
                iOooO0Oo = this.f65754OooOoO0[this.f65751OooOo - oooO0O04.f65760OooOo0o] + getPaddingLeft();
                paddingLeft = iOooO0Oo - this.mOrientationHelper.OooO0Oo(view5);
            } else {
                paddingLeft = getPaddingLeft() + this.f65754OooOoO0[oooO0O04.f65760OooOo0o];
                iOooO0Oo = this.mOrientationHelper.OooO0Oo(view5) + paddingLeft;
            }
            int i19 = iOooO0Oo;
            int i20 = paddingLeft;
            int i21 = iOooO0Oo2;
            layoutDecoratedWithMargins(view5, i20, paddingTop, i19, i21);
            paddingLeft = i20;
            iOooO0Oo = i19;
            iOooO0Oo2 = i21;
            if (oooO0O04.isItemRemoved() || oooO0O04.isItemChanged()) {
                oooO0O0.f65770OooO0OO = true;
            }
            oooO0O0.f65771OooO0Oo = view5.hasFocusable() | oooO0O0.f65771OooO0Oo;
        }
        Arrays.fill(this.f65753OooOoO, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO, LinearLayoutManager.OooO00o oooO00o, int i) {
        super.onAnchorReady(c22071OooOo0O, c22075OooOoOO, oooO00o, i);
        OooO();
        if (c22075OooOoOO.OooO0O0() > 0 && !c22075OooOoOO.f66100OooO0oO) {
            boolean z = i == 1;
            int iOooO0o0 = OooO0o0(oooO00o.f65764OooO0O0, c22071OooOo0O, c22075OooOoOO);
            if (z) {
                while (iOooO0o0 > 0) {
                    int i2 = oooO00o.f65764OooO0O0;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    oooO00o.f65764OooO0O0 = i3;
                    iOooO0o0 = OooO0o0(i3, c22071OooOo0O, c22075OooOoOO);
                }
            } else {
                int iOooO0O0 = c22075OooOoOO.OooO0O0() - 1;
                int i4 = oooO00o.f65764OooO0O0;
                while (i4 < iOooO0O0) {
                    int i5 = i4 + 1;
                    int iOooO0o02 = OooO0o0(i5, c22071OooOo0O, c22075OooOoOO);
                    if (iOooO0o02 <= iOooO0o0) {
                        break;
                    }
                    i4 = i5;
                    iOooO0o0 = iOooO0o02;
                }
                oooO00o.f65764OooO0O0 = i4;
            }
        }
        OooO0O0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.OooOOOO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onFocusSearchFailed(View view, int i, RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        int childCount;
        int i2;
        int childCount2;
        View view2;
        View view3;
        View view4;
        int i3;
        int i4;
        int i5;
        RecyclerView.C22071OooOo0O c22071OooOo0O2 = c22071OooOo0O;
        RecyclerView.C22075OooOoOO c22075OooOoOO2 = c22075OooOoOO;
        View viewFindContainingItemView = findContainingItemView(view);
        View view5 = null;
        if (viewFindContainingItemView == null) {
            return null;
        }
        OooO0O0 oooO0O0 = (OooO0O0) viewFindContainingItemView.getLayoutParams();
        int i6 = oooO0O0.f65760OooOo0o;
        int i7 = oooO0O0.f65759OooOo + i6;
        if (super.onFocusSearchFailed(view, i, c22071OooOo0O, c22075OooOoOO) == null) {
            return null;
        }
        if ((convertFocusDirectionToLayoutDirection(i) == 1) != this.mShouldReverseLayout) {
            childCount2 = getChildCount() - 1;
            childCount = -1;
            i2 = -1;
        } else {
            childCount = getChildCount();
            i2 = 1;
            childCount2 = 0;
        }
        boolean z = this.mOrientation == 1 && isLayoutRTL();
        int iOooO0Oo = OooO0Oo(childCount2, c22071OooOo0O2, c22075OooOoOO2);
        int i8 = -1;
        int i9 = -1;
        int iMin = 0;
        int iMin2 = 0;
        int i10 = childCount2;
        View view6 = null;
        while (i10 != childCount) {
            int iOooO0Oo2 = OooO0Oo(i10, c22071OooOo0O2, c22075OooOoOO2);
            View childAt = getChildAt(i10);
            if (childAt == viewFindContainingItemView) {
                break;
            }
            if (!childAt.hasFocusable() || iOooO0Oo2 == iOooO0Oo) {
                OooO0O0 oooO0O02 = (OooO0O0) childAt.getLayoutParams();
                int i11 = oooO0O02.f65760OooOo0o;
                view2 = viewFindContainingItemView;
                int i12 = oooO0O02.f65759OooOo + i11;
                if (childAt.hasFocusable() && i11 == i6 && i12 == i7) {
                    return childAt;
                }
                if (!(childAt.hasFocusable() && view5 == null) && (childAt.hasFocusable() || view6 != null)) {
                    view3 = view5;
                    int iMin3 = Math.min(i12, i7) - Math.max(i11, i6);
                    if (!childAt.hasFocusable()) {
                        if (view3 == null) {
                            view4 = view6;
                            i3 = iMin;
                            if (isViewPartiallyVisible(childAt, false, true)) {
                                i4 = iMin2;
                                if (iMin3 > i4) {
                                    i5 = i9;
                                } else if (iMin3 == i4) {
                                    i5 = i9;
                                    if (z == (i11 > i5)) {
                                    }
                                    iMin = i3;
                                    view5 = view3;
                                    i10 += i2;
                                    c22071OooOo0O2 = c22071OooOo0O;
                                    c22075OooOoOO2 = c22075OooOoOO;
                                    viewFindContainingItemView = view2;
                                } else {
                                    i5 = i9;
                                }
                                if (childAt.hasFocusable()) {
                                    int i13 = oooO0O02.f65760OooOo0o;
                                    iMin2 = Math.min(i12, i7) - Math.max(i11, i6);
                                    view6 = childAt;
                                    i9 = i13;
                                    iMin = i3;
                                    view5 = view3;
                                    i10 += i2;
                                    c22071OooOo0O2 = c22071OooOo0O;
                                    c22075OooOoOO2 = c22075OooOoOO;
                                    viewFindContainingItemView = view2;
                                } else {
                                    i9 = i5;
                                    iMin2 = i4;
                                    i8 = oooO0O02.f65760OooOo0o;
                                    view6 = view4;
                                    view5 = childAt;
                                    iMin = Math.min(i12, i7) - Math.max(i11, i6);
                                    i10 += i2;
                                    c22071OooOo0O2 = c22071OooOo0O;
                                    c22075OooOoOO2 = c22075OooOoOO;
                                    viewFindContainingItemView = view2;
                                }
                            }
                            i9 = i5;
                            iMin2 = i4;
                            view6 = view4;
                            iMin = i3;
                            view5 = view3;
                            i10 += i2;
                            c22071OooOo0O2 = c22071OooOo0O;
                            c22075OooOoOO2 = c22075OooOoOO;
                            viewFindContainingItemView = view2;
                        }
                        i5 = i9;
                        i4 = iMin2;
                        i9 = i5;
                        iMin2 = i4;
                        view6 = view4;
                        iMin = i3;
                        view5 = view3;
                        i10 += i2;
                        c22071OooOo0O2 = c22071OooOo0O;
                        c22075OooOoOO2 = c22075OooOoOO;
                        viewFindContainingItemView = view2;
                    } else if (iMin3 <= iMin) {
                        if (iMin3 == iMin) {
                        }
                    }
                } else {
                    view3 = view5;
                }
                view4 = view6;
                i3 = iMin;
                i5 = i9;
                i4 = iMin2;
                if (childAt.hasFocusable()) {
                }
            } else {
                if (view5 != null) {
                    break;
                }
                view2 = viewFindContainingItemView;
                view3 = view5;
            }
            view4 = view6;
            i3 = iMin;
            i5 = i9;
            i4 = iMin2;
            i9 = i5;
            iMin2 = i4;
            view6 = view4;
            iMin = i3;
            view5 = view3;
            i10 += i2;
            c22071OooOo0O2 = c22071OooOo0O;
            c22075OooOoOO2 = c22075OooOoOO;
            viewFindContainingItemView = view2;
        }
        View view7 = view5;
        return view7 != null ? view7 : view6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof OooO0O0)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            return;
        }
        OooO0O0 oooO0O0 = (OooO0O0) layoutParams;
        int iOooO0Oo = OooO0Oo(oooO0O0.getViewLayoutPosition(), c22071OooOo0O, c22075OooOoOO);
        if (this.mOrientation == 0) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(oooO0O0.f65760OooOo0o, oooO0O0.f65759OooOo, iOooO0Oo, 1, false, false));
        } else {
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(iOooO0Oo, 1, oooO0O0.f65760OooOo0o, oooO0O0.f65759OooOo, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.f65756OooOoo.OooO0Oo();
        this.f65756OooOoo.f65762OooO0O0.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.f65756OooOoo.OooO0Oo();
        this.f65756OooOoo.f65762OooO0O0.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f65756OooOoo.OooO0Oo();
        this.f65756OooOoo.f65762OooO0O0.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.f65756OooOoo.OooO0Oo();
        this.f65756OooOoo.f65762OooO0O0.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f65756OooOoo.OooO0Oo();
        this.f65756OooOoo.f65762OooO0O0.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void onLayoutChildren(RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        boolean z = c22075OooOoOO.f66100OooO0oO;
        SparseIntArray sparseIntArray = this.f65757OooOoo0;
        SparseIntArray sparseIntArray2 = this.f65755OooOoOO;
        if (z) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                OooO0O0 oooO0O0 = (OooO0O0) getChildAt(i).getLayoutParams();
                int viewLayoutPosition = oooO0O0.getViewLayoutPosition();
                sparseIntArray2.put(viewLayoutPosition, oooO0O0.f65759OooOo);
                sparseIntArray.put(viewLayoutPosition, oooO0O0.f65760OooOo0o);
            }
        }
        super.onLayoutChildren(c22071OooOo0O, c22075OooOoOO);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void onLayoutCompleted(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        super.onLayoutCompleted(c22075OooOoOO);
        this.f65752OooOo0o = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final int scrollHorizontallyBy(int i, RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        OooO();
        OooO0O0();
        return super.scrollHorizontallyBy(i, c22071OooOo0O, c22075OooOoOO);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final int scrollVerticallyBy(int i, RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        OooO();
        OooO0O0();
        return super.scrollVerticallyBy(i, c22071OooOo0O, c22075OooOoOO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int iChooseSize;
        int iChooseSize2;
        if (this.f65754OooOoO0 == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            iChooseSize2 = RecyclerView.OooOOOO.chooseSize(i2, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f65754OooOoO0;
            iChooseSize = RecyclerView.OooOOOO.chooseSize(i, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.OooOOOO.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f65754OooOoO0;
            iChooseSize2 = RecyclerView.OooOOOO.chooseSize(i2, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f65752OooOo0o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public final RecyclerView.C22066OooOOOo generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            OooO0O0 oooO0O0 = new OooO0O0((ViewGroup.MarginLayoutParams) layoutParams);
            oooO0O0.f65760OooOo0o = -1;
            oooO0O0.f65759OooOo = 0;
            return oooO0O0;
        }
        OooO0O0 oooO0O02 = new OooO0O0(layoutParams);
        oooO0O02.f65760OooOo0o = -1;
        oooO0O02.f65759OooOo = 0;
        return oooO0O02;
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.f65752OooOo0o = false;
        this.f65751OooOo = -1;
        this.f65755OooOoOO = new SparseIntArray();
        this.f65757OooOoo0 = new SparseIntArray();
        this.f65756OooOoo = new OooO00o();
        this.f65758OooOooO = new Rect();
        OooO0oo(i);
    }

    public GridLayoutManager(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, 1, false);
        this.f65752OooOo0o = false;
        this.f65751OooOo = -1;
        this.f65755OooOoOO = new SparseIntArray();
        this.f65757OooOoo0 = new SparseIntArray();
        this.f65756OooOoo = new OooO00o();
        this.f65758OooOooO = new Rect();
        OooO0oo(i);
    }
}
