package androidx.appcompat.widget;

import OooO0oo.C20441OooO00o;
import Oooo0oO.C21034OooOOOo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    public static class OooO00o extends LinearLayout.LayoutParams {
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void forceUniformHeight(int i, int i2) {
        int i3;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i4 = 0;
        while (i4 < i) {
            View virtualChildAt = getVirtualChildAt(i4);
            if (virtualChildAt.getVisibility() != 8) {
                OooO00o oooO00o = (OooO00o) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) oooO00o).height == -1) {
                    int i5 = ((LinearLayout.LayoutParams) oooO00o).width;
                    ((LinearLayout.LayoutParams) oooO00o).width = virtualChildAt.getMeasuredWidth();
                    i3 = i2;
                    measureChildWithMargins(virtualChildAt, i3, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) oooO00o).width = i5;
                } else {
                    i3 = i2;
                }
            }
            i4++;
            i2 = i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void forceUniformWidth(int i, int i2) {
        int i3;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i4 = 0;
        while (i4 < i) {
            View virtualChildAt = getVirtualChildAt(i4);
            if (virtualChildAt.getVisibility() != 8) {
                OooO00o oooO00o = (OooO00o) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) oooO00o).width == -1) {
                    int i5 = ((LinearLayout.LayoutParams) oooO00o).height;
                    ((LinearLayout.LayoutParams) oooO00o).height = virtualChildAt.getMeasuredHeight();
                    i3 = i2;
                    measureChildWithMargins(virtualChildAt, iMakeMeasureSpec, 0, i3, 0);
                    ((LinearLayout.LayoutParams) oooO00o).height = i5;
                } else {
                    i3 = i2;
                }
            }
            i4++;
            i2 = i3;
        }
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof OooO00o;
    }

    public void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i;
        int virtualChildCount = getVirtualChildCount();
        boolean z = C21572Ooooo0o.f63118OooO00o;
        boolean z2 = getLayoutDirection() == 1;
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View virtualChildAt = getVirtualChildAt(i2);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i2)) {
                OooO00o oooO00o = (OooO00o) virtualChildAt.getLayoutParams();
                drawVerticalDivider(canvas, z2 ? virtualChildAt.getRight() + ((LinearLayout.LayoutParams) oooO00o).rightMargin : (virtualChildAt.getLeft() - ((LinearLayout.LayoutParams) oooO00o).leftMargin) - this.mDividerWidth);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                OooO00o oooO00o2 = (OooO00o) virtualChildAt2.getLayoutParams();
                if (z2) {
                    left = virtualChildAt2.getLeft() - ((LinearLayout.LayoutParams) oooO00o2).leftMargin;
                    i = this.mDividerWidth;
                    right = left - i;
                } else {
                    right = virtualChildAt2.getRight() + ((LinearLayout.LayoutParams) oooO00o2).rightMargin;
                }
            } else if (z2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.mDividerWidth;
                right = left - i;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    public void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View virtualChildAt = getVirtualChildAt(i);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LinearLayout.LayoutParams) ((OooO00o) virtualChildAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            drawHorizontalDivider(canvas, virtualChildAt2 == null ? (getHeight() - getPaddingBottom()) - this.mDividerHeight : virtualChildAt2.getBottom() + ((LinearLayout.LayoutParams) ((OooO00o) virtualChildAt2.getLayoutParams())).bottomMargin);
        }
    }

    public void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    public void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.mBaselineAlignedChildIndex;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int iOooO00o = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i = this.mGravity & 112) != 48) {
            if (i == 16) {
                iOooO00o = C21034OooOOOo.OooO00o(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.mTotalLength, 2, iOooO00o);
            } else if (i == 80) {
                iOooO00o = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return iOooO00o + ((LinearLayout.LayoutParams) ((OooO00o) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    public int getLocationOffset(View view) {
        return 0;
    }

    public int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void layoutHorizontal(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        char c;
        int i7;
        int i8;
        int childrenSkipCount;
        int i9;
        int i10;
        int i11;
        int iOooO00o;
        int i12;
        char c2 = 1;
        boolean z = C21572Ooooo0o.f63118OooO00o;
        boolean z2 = getLayoutDirection() == 1;
        int paddingTop = getPaddingTop();
        int i13 = i4 - i2;
        int paddingBottom = i13 - getPaddingBottom();
        int paddingBottom2 = (i13 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i14 = this.mGravity;
        int i15 = i14 & 112;
        boolean z3 = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int absoluteGravity = GravityCompat.getAbsoluteGravity(8388615 & i14, getLayoutDirection());
        int i16 = 2;
        int paddingLeft = absoluteGravity != 1 ? absoluteGravity != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.mTotalLength : C21034OooOOOo.OooO00o(i3 - i, this.mTotalLength, 2, getPaddingLeft());
        if (z2) {
            i5 = virtualChildCount - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int i17 = 0;
        while (i17 < virtualChildCount) {
            int i18 = (i6 * i17) + i5;
            int i19 = i17;
            View virtualChildAt = getVirtualChildAt(i18);
            if (virtualChildAt == null) {
                paddingLeft = measureNullChild(i18) + paddingLeft;
                childrenSkipCount = i19;
                c = c2;
                i7 = paddingTop;
                i8 = paddingBottom;
            } else {
                c = c2;
                int i20 = i16;
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight = virtualChildAt.getMeasuredHeight();
                    OooO00o oooO00o = (OooO00o) virtualChildAt.getLayoutParams();
                    int i21 = paddingLeft;
                    if (z3) {
                        i9 = measuredWidth;
                        int baseline = ((LinearLayout.LayoutParams) oooO00o).height != -1 ? virtualChildAt.getBaseline() : -1;
                        i10 = ((LinearLayout.LayoutParams) oooO00o).gravity;
                        if (i10 < 0) {
                            i10 = i15;
                        }
                        i11 = i10 & 112;
                        i8 = paddingBottom;
                        if (i11 != 16) {
                            iOooO00o = (C21034OooOOOo.OooO00o(paddingBottom2, measuredHeight, i20, paddingTop) + ((LinearLayout.LayoutParams) oooO00o).topMargin) - ((LinearLayout.LayoutParams) oooO00o).bottomMargin;
                        } else if (i11 == 48) {
                            iOooO00o = ((LinearLayout.LayoutParams) oooO00o).topMargin + paddingTop;
                            if (baseline != -1) {
                                iOooO00o = (iArr[c] - baseline) + iOooO00o;
                            }
                        } else if (i11 != 80) {
                            i12 = paddingTop;
                            int i22 = (hasDividerBeforeChildAt(i18) ? i21 + this.mDividerWidth : i21) + ((LinearLayout.LayoutParams) oooO00o).leftMargin;
                            i7 = paddingTop;
                            int i23 = i9;
                            setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i22, i12, i23, measuredHeight);
                            paddingLeft = getNextLocationOffset(virtualChildAt) + ((LinearLayout.LayoutParams) oooO00o).rightMargin + i23 + i22;
                            childrenSkipCount = getChildrenSkipCount(virtualChildAt, i18) + i19;
                        } else {
                            iOooO00o = (i8 - measuredHeight) - ((LinearLayout.LayoutParams) oooO00o).bottomMargin;
                            if (baseline != -1) {
                                iOooO00o -= iArr2[i20] - (virtualChildAt.getMeasuredHeight() - baseline);
                            }
                        }
                        i12 = iOooO00o;
                        int i222 = (hasDividerBeforeChildAt(i18) ? i21 + this.mDividerWidth : i21) + ((LinearLayout.LayoutParams) oooO00o).leftMargin;
                        i7 = paddingTop;
                        int i232 = i9;
                        setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i222, i12, i232, measuredHeight);
                        paddingLeft = getNextLocationOffset(virtualChildAt) + ((LinearLayout.LayoutParams) oooO00o).rightMargin + i232 + i222;
                        childrenSkipCount = getChildrenSkipCount(virtualChildAt, i18) + i19;
                    } else {
                        i9 = measuredWidth;
                    }
                    i10 = ((LinearLayout.LayoutParams) oooO00o).gravity;
                    if (i10 < 0) {
                    }
                    i11 = i10 & 112;
                    i8 = paddingBottom;
                    if (i11 != 16) {
                    }
                    i12 = iOooO00o;
                    int i2222 = (hasDividerBeforeChildAt(i18) ? i21 + this.mDividerWidth : i21) + ((LinearLayout.LayoutParams) oooO00o).leftMargin;
                    i7 = paddingTop;
                    int i2322 = i9;
                    setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i2222, i12, i2322, measuredHeight);
                    paddingLeft = getNextLocationOffset(virtualChildAt) + ((LinearLayout.LayoutParams) oooO00o).rightMargin + i2322 + i2222;
                    childrenSkipCount = getChildrenSkipCount(virtualChildAt, i18) + i19;
                } else {
                    i7 = paddingTop;
                    i8 = paddingBottom;
                    childrenSkipCount = i19;
                }
            }
            i17 = childrenSkipCount + 1;
            c2 = c;
            paddingBottom = i8;
            paddingTop = i7;
            i16 = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void layoutVertical(int i, int i2, int i3, int i4) {
        int iOooO00o;
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i8 = this.mGravity;
        int i9 = i8 & 112;
        int i10 = i8 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        int paddingTop = i9 != 16 ? i9 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.mTotalLength : C21034OooOOOo.OooO00o(i4 - i2, this.mTotalLength, 2, getPaddingTop());
        int childrenSkipCount = 0;
        while (childrenSkipCount < virtualChildCount) {
            int nextLocationOffset = paddingTop;
            View virtualChildAt = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt == null) {
                paddingTop = measureNullChild(childrenSkipCount) + nextLocationOffset;
            } else {
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight = virtualChildAt.getMeasuredHeight();
                    OooO00o oooO00o = (OooO00o) virtualChildAt.getLayoutParams();
                    int i11 = ((LinearLayout.LayoutParams) oooO00o).gravity;
                    if (i11 < 0) {
                        i11 = i10;
                    }
                    int absoluteGravity = GravityCompat.getAbsoluteGravity(i11, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        iOooO00o = C21034OooOOOo.OooO00o(paddingRight2, measuredWidth, 2, paddingLeft) + ((LinearLayout.LayoutParams) oooO00o).leftMargin;
                        i5 = ((LinearLayout.LayoutParams) oooO00o).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i6 = ((LinearLayout.LayoutParams) oooO00o).leftMargin + paddingLeft;
                        if (hasDividerBeforeChildAt(childrenSkipCount)) {
                            nextLocationOffset += this.mDividerHeight;
                        }
                        int i12 = ((LinearLayout.LayoutParams) oooO00o).topMargin + nextLocationOffset;
                        setChildFrame(virtualChildAt, i6, getLocationOffset(virtualChildAt) + i12, measuredWidth, measuredHeight);
                        nextLocationOffset = getNextLocationOffset(virtualChildAt) + measuredHeight + ((LinearLayout.LayoutParams) oooO00o).bottomMargin + i12;
                        childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                    } else {
                        iOooO00o = paddingRight - measuredWidth;
                        i5 = ((LinearLayout.LayoutParams) oooO00o).rightMargin;
                    }
                    i6 = iOooO00o - i5;
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                    }
                    int i122 = ((LinearLayout.LayoutParams) oooO00o).topMargin + nextLocationOffset;
                    setChildFrame(virtualChildAt, i6, getLocationOffset(virtualChildAt) + i122, measuredWidth, measuredHeight);
                    nextLocationOffset = getNextLocationOffset(virtualChildAt) + measuredHeight + ((LinearLayout.LayoutParams) oooO00o).bottomMargin + i122;
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                }
                paddingTop = nextLocationOffset;
            }
            childrenSkipCount++;
        }
    }

    public void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void measureHorizontal(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int iMax;
        int i8;
        int iMax2;
        int i9;
        int i10;
        int baseline;
        int i11;
        int i12;
        int i13;
        float f;
        byte b;
        int i14;
        boolean z;
        int i15;
        int i16;
        int[] iArr;
        int i17;
        boolean z2;
        int[] iArr2;
        View view;
        int i18;
        boolean z3;
        boolean z4;
        int baseline2;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        int[] iArr3 = this.mMaxAscent;
        int[] iArr4 = this.mMaxDescent;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z5 = this.mBaselineAligned;
        boolean z6 = this.mUseLargestChild;
        int i19 = 1073741824;
        boolean z7 = mode == 1073741824;
        boolean z8 = z6;
        int childrenSkipCount = 0;
        int iMax3 = 0;
        int iMax4 = 0;
        boolean z9 = false;
        int iCombineMeasuredStates = 0;
        boolean z10 = false;
        boolean z11 = true;
        float f2 = 0.0f;
        int iMax5 = 0;
        int iMax6 = 0;
        while (true) {
            i3 = iMax3;
            if (childrenSkipCount >= virtualChildCount) {
                break;
            }
            boolean z12 = z5;
            View virtualChildAt = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt == null) {
                this.mTotalLength = measureNullChild(childrenSkipCount) + this.mTotalLength;
            } else if (virtualChildAt.getVisibility() == 8) {
                childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
            } else {
                if (hasDividerBeforeChildAt(childrenSkipCount)) {
                    this.mTotalLength += this.mDividerWidth;
                }
                OooO00o oooO00o = (OooO00o) virtualChildAt.getLayoutParams();
                float f3 = ((LinearLayout.LayoutParams) oooO00o).weight;
                float f4 = f2 + f3;
                if (mode == i19 && ((LinearLayout.LayoutParams) oooO00o).width == 0 && f3 > 0.0f) {
                    if (z7) {
                        this.mTotalLength = ((LinearLayout.LayoutParams) oooO00o).leftMargin + ((LinearLayout.LayoutParams) oooO00o).rightMargin + this.mTotalLength;
                    } else {
                        int i20 = this.mTotalLength;
                        this.mTotalLength = Math.max(i20, ((LinearLayout.LayoutParams) oooO00o).leftMargin + i20 + ((LinearLayout.LayoutParams) oooO00o).rightMargin);
                    }
                    if (z12) {
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        virtualChildAt.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        i16 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                        i17 = i3;
                        z2 = z8;
                        view = virtualChildAt;
                    } else {
                        i16 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                        z9 = true;
                        i17 = i3;
                        i18 = 1073741824;
                        z2 = z8;
                        view = virtualChildAt;
                        if (mode2 == i18 && ((LinearLayout.LayoutParams) oooO00o).height == -1) {
                            z3 = true;
                            z10 = true;
                        } else {
                            z3 = false;
                        }
                        int i21 = ((LinearLayout.LayoutParams) oooO00o).topMargin + ((LinearLayout.LayoutParams) oooO00o).bottomMargin;
                        int measuredHeight = view.getMeasuredHeight() + i21;
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        if (z12 || (baseline2 = view.getBaseline()) == -1) {
                            z4 = z3;
                        } else {
                            int i22 = ((LinearLayout.LayoutParams) oooO00o).gravity;
                            if (i22 < 0) {
                                i22 = this.mGravity;
                            }
                            int i23 = (((i22 & 112) >> 4) & (-2)) >> 1;
                            z4 = z3;
                            iArr[i23] = Math.max(iArr[i23], baseline2);
                            iArr2[i23] = Math.max(iArr2[i23], measuredHeight - baseline2);
                        }
                        iMax3 = Math.max(i17, measuredHeight);
                        z11 = !z11 && ((LinearLayout.LayoutParams) oooO00o).height == -1;
                        if (((LinearLayout.LayoutParams) oooO00o).weight <= 0.0f) {
                            if (z4) {
                                measuredHeight = i21;
                            }
                            iMax6 = Math.max(iMax6, measuredHeight);
                        } else {
                            if (z4) {
                                measuredHeight = i21;
                            }
                            iMax5 = Math.max(iMax5, measuredHeight);
                        }
                        childrenSkipCount += getChildrenSkipCount(view, childrenSkipCount);
                        f2 = f4;
                        childrenSkipCount++;
                        z8 = z2;
                        iArr4 = iArr2;
                        z5 = z12;
                        iArr3 = iArr;
                        mode = i16;
                        i19 = 1073741824;
                    }
                } else {
                    if (((LinearLayout.LayoutParams) oooO00o).width != 0 || f3 <= 0.0f) {
                        b = -2;
                        i14 = Integer.MIN_VALUE;
                    } else {
                        b = -2;
                        ((LinearLayout.LayoutParams) oooO00o).width = -2;
                        i14 = 0;
                    }
                    if (f4 == 0.0f) {
                        z = z8;
                        i15 = this.mTotalLength;
                    } else {
                        z = z8;
                        i15 = 0;
                    }
                    i16 = mode;
                    iArr = iArr3;
                    i17 = i3;
                    int i24 = i14;
                    z2 = z;
                    iArr2 = iArr4;
                    measureChildBeforeLayout(virtualChildAt, childrenSkipCount, i, i15, i2, 0);
                    view = virtualChildAt;
                    if (i24 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) oooO00o).width = i24;
                    }
                    int measuredWidth = view.getMeasuredWidth();
                    if (z7) {
                        this.mTotalLength = getNextLocationOffset(view) + ((LinearLayout.LayoutParams) oooO00o).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) oooO00o).rightMargin + this.mTotalLength;
                    } else {
                        int i25 = this.mTotalLength;
                        this.mTotalLength = Math.max(i25, getNextLocationOffset(view) + i25 + measuredWidth + ((LinearLayout.LayoutParams) oooO00o).leftMargin + ((LinearLayout.LayoutParams) oooO00o).rightMargin);
                    }
                    if (z2) {
                        iMax4 = Math.max(measuredWidth, iMax4);
                    }
                }
                i18 = 1073741824;
                if (mode2 == i18) {
                    z3 = false;
                    int i212 = ((LinearLayout.LayoutParams) oooO00o).topMargin + ((LinearLayout.LayoutParams) oooO00o).bottomMargin;
                    int measuredHeight2 = view.getMeasuredHeight() + i212;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    if (z12) {
                        z4 = z3;
                        iMax3 = Math.max(i17, measuredHeight2);
                        if (z11) {
                            if (((LinearLayout.LayoutParams) oooO00o).weight <= 0.0f) {
                            }
                            childrenSkipCount += getChildrenSkipCount(view, childrenSkipCount);
                            f2 = f4;
                        }
                    }
                }
                childrenSkipCount++;
                z8 = z2;
                iArr4 = iArr2;
                z5 = z12;
                iArr3 = iArr;
                mode = i16;
                i19 = 1073741824;
            }
            i16 = mode;
            iArr = iArr3;
            iArr2 = iArr4;
            iMax3 = i3;
            z2 = z8;
            childrenSkipCount++;
            z8 = z2;
            iArr4 = iArr2;
            z5 = z12;
            iArr3 = iArr;
            mode = i16;
            i19 = 1073741824;
        }
        boolean z13 = z5;
        int i26 = mode;
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        int i27 = iCombineMeasuredStates;
        boolean z14 = z8;
        if (this.mTotalLength > 0 && hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerWidth;
        }
        int i28 = iArr5[1];
        int iMax7 = (i28 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i3 : Math.max(i3, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i28, iArr5[2]))));
        if (z14) {
            i5 = i26;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                this.mTotalLength = 0;
                int childrenSkipCount2 = 0;
                while (childrenSkipCount2 < virtualChildCount) {
                    View virtualChildAt2 = getVirtualChildAt(childrenSkipCount2);
                    if (virtualChildAt2 == null) {
                        this.mTotalLength = measureNullChild(childrenSkipCount2) + this.mTotalLength;
                    } else if (virtualChildAt2.getVisibility() == 8) {
                        childrenSkipCount2 += getChildrenSkipCount(virtualChildAt2, childrenSkipCount2);
                    } else {
                        OooO00o oooO00o2 = (OooO00o) virtualChildAt2.getLayoutParams();
                        if (z7) {
                            i13 = iMax7;
                            this.mTotalLength = getNextLocationOffset(virtualChildAt2) + ((LinearLayout.LayoutParams) oooO00o2).leftMargin + iMax4 + ((LinearLayout.LayoutParams) oooO00o2).rightMargin + this.mTotalLength;
                            f = f2;
                            childrenSkipCount2++;
                            iMax7 = i13;
                            f2 = f;
                        } else {
                            i13 = iMax7;
                            int i29 = this.mTotalLength;
                            f = f2;
                            this.mTotalLength = Math.max(i29, getNextLocationOffset(virtualChildAt2) + i29 + iMax4 + ((LinearLayout.LayoutParams) oooO00o2).leftMargin + ((LinearLayout.LayoutParams) oooO00o2).rightMargin);
                            childrenSkipCount2++;
                            iMax7 = i13;
                            f2 = f;
                        }
                    }
                    i13 = iMax7;
                    f = f2;
                    childrenSkipCount2++;
                    iMax7 = i13;
                    f2 = f;
                }
            }
            i4 = iMax7;
        } else {
            i4 = iMax7;
            i5 = i26;
        }
        float f5 = f2;
        int paddingRight = getPaddingRight() + getPaddingLeft() + this.mTotalLength;
        this.mTotalLength = paddingRight;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, 0);
        int i30 = (16777215 & iResolveSizeAndState) - this.mTotalLength;
        if (z9 || (i30 != 0 && f5 > 0.0f)) {
            float f6 = this.mWeightSum;
            if (f6 > 0.0f) {
                f5 = f6;
            }
            iArr5[3] = -1;
            iArr5[2] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[2] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            this.mTotalLength = 0;
            int iCombineMeasuredStates2 = i27;
            int iMax8 = -1;
            int i31 = 0;
            while (i31 < virtualChildCount) {
                View virtualChildAt3 = getVirtualChildAt(i31);
                if (virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8) {
                    i9 = iResolveSizeAndState;
                } else {
                    OooO00o oooO00o3 = (OooO00o) virtualChildAt3.getLayoutParams();
                    float f7 = ((LinearLayout.LayoutParams) oooO00o3).weight;
                    if (f7 > 0.0f) {
                        int i32 = (int) ((i30 * f7) / f5);
                        f5 -= f7;
                        i30 -= i32;
                        i9 = iResolveSizeAndState;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) oooO00o3).topMargin + ((LinearLayout.LayoutParams) oooO00o3).bottomMargin, ((LinearLayout.LayoutParams) oooO00o3).height);
                        if (((LinearLayout.LayoutParams) oooO00o3).width == 0) {
                            i12 = 1073741824;
                            if (i5 == 1073741824) {
                                if (i32 <= 0) {
                                    i32 = 0;
                                }
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(i32, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, virtualChildAt3.getMeasuredState() & ViewCompat.MEASURED_STATE_MASK);
                        } else {
                            i12 = 1073741824;
                        }
                        int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i32;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i12), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, virtualChildAt3.getMeasuredState() & ViewCompat.MEASURED_STATE_MASK);
                    } else {
                        i9 = iResolveSizeAndState;
                    }
                    if (z7) {
                        this.mTotalLength = getNextLocationOffset(virtualChildAt3) + virtualChildAt3.getMeasuredWidth() + ((LinearLayout.LayoutParams) oooO00o3).leftMargin + ((LinearLayout.LayoutParams) oooO00o3).rightMargin + this.mTotalLength;
                    } else {
                        int i33 = this.mTotalLength;
                        this.mTotalLength = Math.max(i33, getNextLocationOffset(virtualChildAt3) + virtualChildAt3.getMeasuredWidth() + i33 + ((LinearLayout.LayoutParams) oooO00o3).leftMargin + ((LinearLayout.LayoutParams) oooO00o3).rightMargin);
                    }
                    boolean z15 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) oooO00o3).height == -1;
                    int i34 = ((LinearLayout.LayoutParams) oooO00o3).topMargin + ((LinearLayout.LayoutParams) oooO00o3).bottomMargin;
                    int measuredHeight3 = virtualChildAt3.getMeasuredHeight() + i34;
                    iMax8 = Math.max(iMax8, measuredHeight3);
                    if (!z15) {
                        i34 = measuredHeight3;
                    }
                    int iMax9 = Math.max(iMax5, i34);
                    if (z11) {
                        i10 = -1;
                        boolean z16 = ((LinearLayout.LayoutParams) oooO00o3).height == -1;
                        if (z13 && (baseline = virtualChildAt3.getBaseline()) != i10) {
                            i11 = ((LinearLayout.LayoutParams) oooO00o3).gravity;
                            if (i11 < 0) {
                                i11 = this.mGravity;
                            }
                            int i35 = (((i11 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i35] = Math.max(iArr5[i35], baseline);
                            iArr6[i35] = Math.max(iArr6[i35], measuredHeight3 - baseline);
                        }
                        iMax5 = iMax9;
                        z11 = z16;
                    } else {
                        i10 = -1;
                    }
                    if (z13) {
                        i11 = ((LinearLayout.LayoutParams) oooO00o3).gravity;
                        if (i11 < 0) {
                        }
                        int i352 = (((i11 & 112) >> 4) & (-2)) >> 1;
                        iArr5[i352] = Math.max(iArr5[i352], baseline);
                        iArr6[i352] = Math.max(iArr6[i352], measuredHeight3 - baseline);
                    }
                    iMax5 = iMax9;
                    z11 = z16;
                }
                i31++;
                iResolveSizeAndState = i9;
            }
            i6 = iResolveSizeAndState;
            i7 = ViewCompat.MEASURED_STATE_MASK;
            this.mTotalLength = getPaddingRight() + getPaddingLeft() + this.mTotalLength;
            int i36 = iArr5[1];
            iMax = (i36 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? iMax8 : Math.max(iMax8, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i36, iArr5[2]))));
            i8 = iCombineMeasuredStates2;
            iMax2 = iMax5;
        } else {
            iMax2 = Math.max(iMax5, iMax6);
            if (z14 && i5 != 1073741824) {
                for (int i37 = 0; i37 < virtualChildCount; i37++) {
                    View virtualChildAt4 = getVirtualChildAt(i37);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((OooO00o) virtualChildAt4.getLayoutParams())).weight > 0.0f) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(iMax4, 1073741824), View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i6 = iResolveSizeAndState;
            i8 = i27;
            iMax = i4;
            i7 = ViewCompat.MEASURED_STATE_MASK;
        }
        if (!z11 && mode2 != 1073741824) {
            iMax = iMax2;
        }
        setMeasuredDimension(i6 | (i8 & i7), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax, getSuggestedMinimumHeight()), i2, i8 << 16));
        if (z10) {
            forceUniformHeight(virtualChildCount, i);
        }
    }

    public int measureNullChild(int i) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void measureVertical(int i, int i2) {
        int i3;
        int iMax;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z;
        int iMax2;
        View view;
        int iMax3;
        boolean z2;
        int iMax4;
        int i15;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i16 = this.mBaselineAlignedChildIndex;
        boolean z3 = this.mUseLargestChild;
        int childrenSkipCount = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int iMax5 = 0;
        boolean z4 = false;
        boolean z5 = false;
        float f = 0.0f;
        boolean z6 = true;
        while (true) {
            int i21 = 8;
            if (childrenSkipCount >= virtualChildCount) {
                float f2 = f;
                int i22 = i17;
                int i23 = virtualChildCount;
                int i24 = mode2;
                boolean z7 = z3;
                int i25 = i18;
                int iMax6 = i19;
                int iCombineMeasuredStates = i20;
                if (this.mTotalLength > 0) {
                    i3 = i23;
                    if (hasDividerBeforeChildAt(i3)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                } else {
                    i3 = i23;
                }
                int i26 = i24;
                if (z7 && (i26 == Integer.MIN_VALUE || i26 == 0)) {
                    this.mTotalLength = 0;
                    int childrenSkipCount2 = 0;
                    while (childrenSkipCount2 < i3) {
                        View virtualChildAt = getVirtualChildAt(childrenSkipCount2);
                        if (virtualChildAt == null) {
                            this.mTotalLength = measureNullChild(childrenSkipCount2) + this.mTotalLength;
                        } else if (virtualChildAt.getVisibility() == i21) {
                            childrenSkipCount2 += getChildrenSkipCount(virtualChildAt, childrenSkipCount2);
                        } else {
                            OooO00o oooO00o = (OooO00o) virtualChildAt.getLayoutParams();
                            int i27 = this.mTotalLength;
                            this.mTotalLength = Math.max(i27, getNextLocationOffset(virtualChildAt) + i27 + i25 + ((LinearLayout.LayoutParams) oooO00o).topMargin + ((LinearLayout.LayoutParams) oooO00o).bottomMargin);
                        }
                        childrenSkipCount2++;
                        i21 = 8;
                    }
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop() + this.mTotalLength;
                this.mTotalLength = paddingBottom;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, 0);
                int i28 = (16777215 & iResolveSizeAndState) - this.mTotalLength;
                if (z4 || (i28 != 0 && f2 > 0.0f)) {
                    float f3 = this.mWeightSum;
                    if (f3 <= 0.0f) {
                        f3 = f2;
                    }
                    this.mTotalLength = 0;
                    float f4 = f3;
                    int i29 = i28;
                    int i30 = 0;
                    while (i30 < i3) {
                        View virtualChildAt2 = getVirtualChildAt(i30);
                        if (virtualChildAt2.getVisibility() == 8) {
                            i4 = i26;
                            i5 = i30;
                        } else {
                            OooO00o oooO00o2 = (OooO00o) virtualChildAt2.getLayoutParams();
                            float f5 = ((LinearLayout.LayoutParams) oooO00o2).weight;
                            if (f5 > 0.0f) {
                                i5 = i30;
                                int i31 = (int) ((i29 * f5) / f4);
                                f4 -= f5;
                                i29 -= i31;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) oooO00o2).leftMargin + ((LinearLayout.LayoutParams) oooO00o2).rightMargin, ((LinearLayout.LayoutParams) oooO00o2).width);
                                if (((LinearLayout.LayoutParams) oooO00o2).height == 0) {
                                    i7 = 1073741824;
                                    if (i26 == 1073741824) {
                                        i4 = i26;
                                        virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i31 > 0 ? i31 : 0, 1073741824));
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt2.getMeasuredState() & InputDeviceCompat.SOURCE_ANY);
                                } else {
                                    i7 = 1073741824;
                                }
                                i4 = i26;
                                int measuredHeight = virtualChildAt2.getMeasuredHeight() + i31;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i7));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt2.getMeasuredState() & InputDeviceCompat.SOURCE_ANY);
                            } else {
                                i4 = i26;
                                i5 = i30;
                            }
                            int i32 = ((LinearLayout.LayoutParams) oooO00o2).leftMargin + ((LinearLayout.LayoutParams) oooO00o2).rightMargin;
                            int measuredWidth = virtualChildAt2.getMeasuredWidth() + i32;
                            iMax6 = Math.max(iMax6, measuredWidth);
                            if (mode != 1073741824) {
                                i6 = -1;
                                if (((LinearLayout.LayoutParams) oooO00o2).width == -1) {
                                    measuredWidth = i32;
                                }
                            } else {
                                i6 = -1;
                            }
                            int iMax7 = Math.max(iMax5, measuredWidth);
                            boolean z8 = z6 && ((LinearLayout.LayoutParams) oooO00o2).width == i6;
                            int i33 = this.mTotalLength;
                            this.mTotalLength = Math.max(i33, getNextLocationOffset(virtualChildAt2) + virtualChildAt2.getMeasuredHeight() + i33 + ((LinearLayout.LayoutParams) oooO00o2).topMargin + ((LinearLayout.LayoutParams) oooO00o2).bottomMargin);
                            iMax5 = iMax7;
                            z6 = z8;
                        }
                        i30 = i5 + 1;
                        i26 = i4;
                    }
                    this.mTotalLength = getPaddingBottom() + getPaddingTop() + this.mTotalLength;
                    iMax = iMax5;
                } else {
                    iMax = Math.max(iMax5, i22);
                    if (z7 && i26 != 1073741824) {
                        for (int i34 = 0; i34 < i3; i34++) {
                            View virtualChildAt3 = getVirtualChildAt(i34);
                            if (virtualChildAt3 != null && virtualChildAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((OooO00o) virtualChildAt3.getLayoutParams())).weight > 0.0f) {
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i25, 1073741824));
                            }
                        }
                    }
                }
                if (!z6 && mode != 1073741824) {
                    iMax6 = iMax;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax6, getSuggestedMinimumWidth()), i, iCombineMeasuredStates), iResolveSizeAndState);
                if (z5) {
                    forceUniformWidth(i3, i2);
                    return;
                }
                return;
            }
            float f6 = f;
            View virtualChildAt4 = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt4 == null) {
                this.mTotalLength = measureNullChild(childrenSkipCount) + this.mTotalLength;
            } else if (virtualChildAt4.getVisibility() == 8) {
                childrenSkipCount += getChildrenSkipCount(virtualChildAt4, childrenSkipCount);
            } else {
                if (hasDividerBeforeChildAt(childrenSkipCount)) {
                    this.mTotalLength += this.mDividerHeight;
                }
                OooO00o oooO00o3 = (OooO00o) virtualChildAt4.getLayoutParams();
                float f7 = ((LinearLayout.LayoutParams) oooO00o3).weight;
                float f8 = f6 + f7;
                if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) oooO00o3).height == 0 && f7 > 0.0f) {
                    int i35 = this.mTotalLength;
                    this.mTotalLength = Math.max(i35, ((LinearLayout.LayoutParams) oooO00o3).topMargin + i35 + ((LinearLayout.LayoutParams) oooO00o3).bottomMargin);
                    iMax2 = i17;
                    iMax3 = i18;
                    i11 = virtualChildCount;
                    i12 = mode2;
                    z4 = true;
                    view = virtualChildAt4;
                    i14 = i19;
                    i13 = i20;
                    z = z3;
                } else {
                    if (((LinearLayout.LayoutParams) oooO00o3).height != 0 || f7 <= 0.0f) {
                        i8 = Integer.MIN_VALUE;
                    } else {
                        ((LinearLayout.LayoutParams) oooO00o3).height = -2;
                        i8 = 0;
                    }
                    if (f8 == 0.0f) {
                        int i36 = i20;
                        i10 = this.mTotalLength;
                        i9 = i36;
                    } else {
                        i9 = i20;
                        i10 = 0;
                    }
                    int i37 = i18;
                    i11 = virtualChildCount;
                    i12 = mode2;
                    i13 = i9;
                    i14 = i19;
                    z = z3;
                    iMax2 = i17;
                    measureChildBeforeLayout(virtualChildAt4, childrenSkipCount, i, 0, i2, i10);
                    view = virtualChildAt4;
                    if (i8 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) oooO00o3).height = i8;
                    }
                    int measuredHeight2 = view.getMeasuredHeight();
                    int i38 = this.mTotalLength;
                    this.mTotalLength = Math.max(i38, getNextLocationOffset(view) + i38 + measuredHeight2 + ((LinearLayout.LayoutParams) oooO00o3).topMargin + ((LinearLayout.LayoutParams) oooO00o3).bottomMargin);
                    iMax3 = z ? Math.max(measuredHeight2, i37) : i37;
                }
                if (i16 >= 0 && i16 == childrenSkipCount + 1) {
                    this.mBaselineChildTop = this.mTotalLength;
                }
                if (childrenSkipCount < i16 && ((LinearLayout.LayoutParams) oooO00o3).weight > 0.0f) {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                }
                if (mode == 1073741824 || ((LinearLayout.LayoutParams) oooO00o3).width != -1) {
                    z2 = false;
                } else {
                    z2 = true;
                    z5 = true;
                }
                int i39 = ((LinearLayout.LayoutParams) oooO00o3).leftMargin + ((LinearLayout.LayoutParams) oooO00o3).rightMargin;
                int measuredWidth2 = view.getMeasuredWidth() + i39;
                iMax4 = Math.max(i14, measuredWidth2);
                int i40 = iMax3;
                int iCombineMeasuredStates2 = View.combineMeasuredStates(i13, view.getMeasuredState());
                if (z6) {
                    i15 = iCombineMeasuredStates2;
                    z6 = ((LinearLayout.LayoutParams) oooO00o3).width == -1;
                    if (((LinearLayout.LayoutParams) oooO00o3).weight <= 0.0f) {
                        if (!z2) {
                            i39 = measuredWidth2;
                        }
                        iMax2 = Math.max(iMax2, i39);
                    } else {
                        if (!z2) {
                            i39 = measuredWidth2;
                        }
                        iMax5 = Math.max(iMax5, i39);
                    }
                    childrenSkipCount += getChildrenSkipCount(view, childrenSkipCount);
                    f = f8;
                    i18 = i40;
                    i20 = i15;
                    childrenSkipCount++;
                    i19 = iMax4;
                    i17 = iMax2;
                    z3 = z;
                    mode2 = i12;
                    virtualChildCount = i11;
                } else {
                    i15 = iCombineMeasuredStates2;
                }
                if (((LinearLayout.LayoutParams) oooO00o3).weight <= 0.0f) {
                }
                childrenSkipCount += getChildrenSkipCount(view, childrenSkipCount);
                f = f8;
                i18 = i40;
                i20 = i15;
                childrenSkipCount++;
                i19 = iMax4;
                i17 = iMax2;
                z3 = z;
                mode2 = i12;
                virtualChildCount = i11;
            }
            iMax2 = i17;
            i11 = virtualChildCount;
            i12 = mode2;
            z = z3;
            f = f6;
            iMax4 = i19;
            childrenSkipCount++;
            i19 = iMax4;
            i17 = iMax2;
            z3 = z;
            mode2 = i12;
            virtualChildCount = i11;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.mBaselineAlignedChildIndex = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            if ((8388615 & i) == 0) {
                i |= GravityCompat.START;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        int i3 = this.mGravity;
        if ((8388615 & i3) != i2) {
            this.mGravity = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.mGravity;
        if ((i3 & 112) != i2) {
            this.mGravity = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public OooO00o generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new OooO00o(-2, -2);
        }
        if (i == 1) {
            return new OooO00o(-1, -2);
        }
        return null;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        int[] iArr = C20441OooO00o.f58292OooOOOO;
        C21565OoooOO0 c21565OoooOO0OooO0o = C21565OoooOO0.OooO0o(context, attributeSet, iArr, i, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, c21565OoooOO0OooO0o.f63093OooO0O0, i, 0);
        TypedArray typedArray = c21565OoooOO0OooO0o.f63093OooO0O0;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.mWeightSum = typedArray.getFloat(4, -1.0f);
        this.mBaselineAlignedChildIndex = typedArray.getInt(3, -1);
        this.mUseLargestChild = typedArray.getBoolean(7, false);
        setDividerDrawable(c21565OoooOO0OooO0o.OooO0O0(5));
        this.mShowDividers = typedArray.getInt(8, 0);
        this.mDividerPadding = typedArray.getDimensionPixelSize(6, 0);
        c21565OoooOO0OooO0o.OooO0oO();
    }

    @Override // android.view.ViewGroup
    public OooO00o generateLayoutParams(AttributeSet attributeSet) {
        return new OooO00o(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public OooO00o generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof OooO00o) {
            return new OooO00o((OooO00o) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new OooO00o((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new OooO00o(layoutParams);
    }
}
