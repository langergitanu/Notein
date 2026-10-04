package androidx.appcompat.widget;

import Oooo0oO.C21034OooOOOo;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.orion.notein.global.R;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int OooO0Oo(View view) {
        int minimumHeight = ViewCompat.getMinimumHeight(view);
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return OooO0Oo(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iOooO00o;
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i8 = gravity & 112;
        int i9 = gravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        int paddingTop = i8 != 16 ? i8 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - measuredHeight : (((i4 - i2) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                LinearLayoutCompat.OooO00o oooO00o = (LinearLayoutCompat.OooO00o) childAt.getLayoutParams();
                int i11 = ((LinearLayout.LayoutParams) oooO00o).gravity;
                if (i11 < 0) {
                    i11 = i9;
                }
                int absoluteGravity = GravityCompat.getAbsoluteGravity(i11, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    iOooO00o = C21034OooOOOo.OooO00o(paddingRight2, measuredWidth, 2, paddingLeft) + ((LinearLayout.LayoutParams) oooO00o).leftMargin;
                    i5 = ((LinearLayout.LayoutParams) oooO00o).rightMargin;
                } else if (absoluteGravity != 5) {
                    i6 = ((LinearLayout.LayoutParams) oooO00o).leftMargin + paddingLeft;
                    if (hasDividerBeforeChildAt(i10)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i12 = paddingTop + ((LinearLayout.LayoutParams) oooO00o).topMargin;
                    childAt.layout(i6, i12, measuredWidth + i6, i12 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) oooO00o).bottomMargin + i12;
                } else {
                    iOooO00o = paddingRight - measuredWidth;
                    i5 = ((LinearLayout.LayoutParams) oooO00o).rightMargin;
                }
                i6 = iOooO00o - i5;
                if (hasDividerBeforeChildAt(i10)) {
                }
                int i122 = paddingTop + ((LinearLayout.LayoutParams) oooO00o).topMargin;
                childAt.layout(i6, i122, measuredWidth + i6, i122 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) oooO00o).bottomMargin + i122;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int iCombineMeasuredStates;
        int iOooO0Oo;
        int measuredHeight;
        int measuredHeight2;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = alertDialogLayout.getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
                        super.onMeasure(i, i2);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i, 0);
            paddingBottom += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            iOooO0Oo = OooO0Oo(view2);
            measuredHeight = view2.getMeasuredHeight() - iOooO0Oo;
            paddingBottom += iOooO0Oo;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iOooO0Oo = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingBottom += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i4 = size - paddingBottom;
        if (view2 != null) {
            int i5 = paddingBottom - iOooO0Oo;
            int iMin = Math.min(i4, measuredHeight);
            if (iMin > 0) {
                i4 -= iMin;
                iOooO0Oo += iMin;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(iOooO0Oo, 1073741824));
            paddingBottom = i5 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i4 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i4, mode));
            paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = alertDialogLayout.getChildAt(i6);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        int i7 = i2;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + iMax, i, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i7, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i8 = 0;
            while (i8 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i8);
                if (childAt3.getVisibility() != 8) {
                    LinearLayoutCompat.OooO00o oooO00o = (LinearLayoutCompat.OooO00o) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) oooO00o).width == -1) {
                        int i9 = ((LinearLayout.LayoutParams) oooO00o).height;
                        ((LinearLayout.LayoutParams) oooO00o).height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i7, 0);
                        ((LinearLayout.LayoutParams) oooO00o).height = i9;
                    }
                }
                i8++;
                alertDialogLayout = this;
                i7 = i2;
            }
        }
    }
}
