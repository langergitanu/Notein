package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends RecyclerView.OooOo00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f66587OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO0OO f66588OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ViewPager2 f66589OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final RecyclerView f66590OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final LinearLayoutManager f66591OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f66592OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f66593OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO00o f66594OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f66595OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f66596OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f66597OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f66598OooOO0o;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f66599OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f66600OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f66601OooO0OO;
    }

    public OooO0o(ViewPager2 viewPager2) {
        this.f66589OooO0O0 = viewPager2;
        RecyclerView recyclerView = viewPager2.f66615Oooo000;
        this.f66590OooO0OO = recyclerView;
        this.f66591OooO0Oo = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f66594OooO0oO = new OooO00o();
        OooO0O0();
    }

    public final void OooO00o(int i) {
        if ((this.f66593OooO0o0 == 3 && this.f66592OooO0o == 0) || this.f66592OooO0o == i) {
            return;
        }
        this.f66592OooO0o = i;
        OooO0OO oooO0OO = this.f66588OooO00o;
        if (oooO0OO != null) {
            oooO0OO.onPageScrollStateChanged(i);
        }
    }

    public final void OooO0O0() {
        this.f66593OooO0o0 = 0;
        this.f66592OooO0o = 0;
        OooO00o oooO00o = this.f66594OooO0oO;
        oooO00o.f66599OooO00o = -1;
        oooO00o.f66600OooO0O0 = 0.0f;
        oooO00o.f66601OooO0OO = 0;
        this.f66595OooO0oo = -1;
        this.f66587OooO = -1;
        this.f66596OooOO0 = false;
        this.f66597OooOO0O = false;
        this.f66598OooOO0o = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0OO() {
        int top;
        int childCount;
        int top2;
        int i;
        int bottom;
        int i2;
        LinearLayoutManager linearLayoutManager = this.f66591OooO0Oo;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        OooO00o oooO00o = this.f66594OooO0oO;
        oooO00o.f66599OooO00o = iFindFirstVisibleItemPosition;
        if (iFindFirstVisibleItemPosition == -1) {
            oooO00o.f66599OooO00o = -1;
            oooO00o.f66600OooO0O0 = 0.0f;
            oooO00o.f66601OooO0OO = 0;
            return;
        }
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition == null) {
            oooO00o.f66599OooO00o = -1;
            oooO00o.f66600OooO0O0 = 0.0f;
            oooO00o.f66601OooO0OO = 0;
            return;
        }
        int leftDecorationWidth = linearLayoutManager.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = linearLayoutManager.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = linearLayoutManager.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = linearLayoutManager.getBottomDecorationHeight(viewFindViewByPosition);
        ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = viewFindViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = viewFindViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        int orientation = linearLayoutManager.getOrientation();
        RecyclerView recyclerView = this.f66590OooO0OO;
        if (orientation == 0) {
            top = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - recyclerView.getPaddingLeft();
            if (this.f66589OooO0O0.f66609OooOoo.getLayoutDirection() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewFindViewByPosition.getTop() - topDecorationHeight) - recyclerView.getPaddingTop();
        }
        int i3 = -top;
        oooO00o.f66601OooO0OO = i3;
        if (i3 >= 0) {
            oooO00o.f66600OooO0O0 = height != 0 ? i3 / height : 0.0f;
            return;
        }
        int childCount2 = linearLayoutManager.getChildCount();
        if (childCount2 != 0) {
            boolean z = linearLayoutManager.getOrientation() == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, childCount2, 2);
            for (int i4 = 0; i4 < childCount2; i4++) {
                View childAt = linearLayoutManager.getChildAt(i4);
                if (childAt == null) {
                    throw new IllegalStateException("null view contained in the view hierarchy");
                }
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : OooO0O0.f66584OooO00o;
                int[] iArr2 = iArr[i4];
                if (z) {
                    top2 = childAt.getLeft();
                    i = marginLayoutParams2.leftMargin;
                } else {
                    top2 = childAt.getTop();
                    i = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i;
                int[] iArr3 = iArr[i4];
                if (z) {
                    bottom = childAt.getRight();
                    i2 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = childAt.getBottom();
                    i2 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            }
            Arrays.sort(iArr, new androidx.viewpager2.widget.OooO00o());
            int i5 = 1;
            while (true) {
                if (i5 >= childCount2) {
                    int[] iArr4 = iArr[0];
                    int i6 = iArr4[1];
                    int i7 = iArr4[0];
                    int i8 = i6 - i7;
                    if (i7 > 0 || iArr[childCount2 - 1][1] < i8) {
                        break;
                    }
                } else if (iArr[i5 - 1][1] != iArr[i5][0]) {
                    break;
                } else {
                    i5++;
                }
            }
            childCount = linearLayoutManager.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                if (OooO0O0.OooO00o(linearLayoutManager.getChildAt(i9))) {
                    throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                }
            }
        } else if (linearLayoutManager.getChildCount() <= 1) {
            childCount = linearLayoutManager.getChildCount();
            while (i9 < childCount) {
            }
        }
        Locale locale = Locale.US;
        throw new IllegalStateException(C21532OooOOo.OooO0OO(oooO00o.f66601OooO0OO, "Page can only be offset by a positive amount, not by "));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo00
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        OooO0OO oooO0OO;
        OooO0OO oooO0OO2;
        int i2 = this.f66593OooO0o0;
        boolean z = true;
        if (!(i2 == 1 && this.f66592OooO0o == 1) && i == 1) {
            this.f66593OooO0o0 = 1;
            int i3 = this.f66587OooO;
            if (i3 != -1) {
                this.f66595OooO0oo = i3;
                this.f66587OooO = -1;
            } else if (this.f66595OooO0oo == -1) {
                this.f66595OooO0oo = this.f66591OooO0Oo.findFirstVisibleItemPosition();
            }
            OooO00o(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.f66597OooOO0O) {
                OooO00o(2);
                this.f66596OooOO0 = true;
                return;
            }
            return;
        }
        if (i2 != 1 && i2 != 4) {
            z = false;
        }
        OooO00o oooO00o = this.f66594OooO0oO;
        if (z && i == 0) {
            OooO0OO();
            if (!this.f66597OooOO0O) {
                int i4 = oooO00o.f66599OooO00o;
                if (i4 != -1 && (oooO0OO2 = this.f66588OooO00o) != null) {
                    oooO0OO2.onPageScrolled(i4, 0.0f, 0);
                }
            } else if (oooO00o.f66601OooO0OO == 0) {
                int i5 = this.f66595OooO0oo;
                int i6 = oooO00o.f66599OooO00o;
                if (i5 != i6 && (oooO0OO = this.f66588OooO00o) != null) {
                    oooO0OO.onPageSelected(i6);
                }
            }
            OooO00o(0);
            OooO0O0();
        }
        if (this.f66593OooO0o0 == 2 && i == 0 && this.f66598OooOO0o) {
            OooO0OO();
            if (oooO00o.f66601OooO0OO == 0) {
                int i7 = this.f66587OooO;
                int i8 = oooO00o.f66599OooO00o;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    OooO0OO oooO0OO3 = this.f66588OooO00o;
                    if (oooO0OO3 != null) {
                        oooO0OO3.onPageSelected(i8);
                    }
                }
                OooO00o(0);
                OooO0O0();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    @Override // androidx.recyclerview.widget.RecyclerView.OooOo00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        OooO0OO oooO0OO;
        this.f66597OooOO0O = true;
        OooO0OO();
        boolean z = this.f66596OooOO0;
        OooO00o oooO00o = this.f66594OooO0oO;
        if (z) {
            this.f66596OooOO0 = false;
            if (i2 > 0) {
                i3 = oooO00o.f66601OooO0OO != 0 ? oooO00o.f66599OooO00o + 1 : oooO00o.f66599OooO00o;
                this.f66587OooO = i3;
                if (this.f66595OooO0oo != i3 && (oooO0OO = this.f66588OooO00o) != null) {
                    oooO0OO.onPageSelected(i3);
                }
            } else {
                if (i2 == 0) {
                    if ((i < 0) == (this.f66589OooO0O0.f66609OooOoo.getLayoutDirection() == 1)) {
                    }
                }
                this.f66587OooO = i3;
                if (this.f66595OooO0oo != i3) {
                    oooO0OO.onPageSelected(i3);
                }
            }
        } else if (this.f66593OooO0o0 == 0) {
            int i4 = oooO00o.f66599OooO00o;
            if (i4 == -1) {
                i4 = 0;
            }
            OooO0OO oooO0OO2 = this.f66588OooO00o;
            if (oooO0OO2 != null) {
                oooO0OO2.onPageSelected(i4);
            }
        }
        int i5 = oooO00o.f66599OooO00o;
        if (i5 == -1) {
            i5 = 0;
        }
        float f = oooO00o.f66600OooO0O0;
        int i6 = oooO00o.f66601OooO0OO;
        OooO0OO oooO0OO3 = this.f66588OooO00o;
        if (oooO0OO3 != null) {
            oooO0OO3.onPageScrolled(i5, f, i6);
        }
        int i7 = oooO00o.f66599OooO00o;
        int i8 = this.f66587OooO;
        if ((i7 == i8 || i8 == -1) && oooO00o.f66601OooO0OO == 0 && this.f66592OooO0o != 1) {
            OooO00o(0);
            OooO0O0();
        }
    }
}
