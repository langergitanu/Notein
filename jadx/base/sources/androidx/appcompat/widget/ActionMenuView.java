package androidx.appcompat.widget;

import Oooo0oO.C21036OooOOo0;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.app.C21499OooOoo0;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.InterfaceC21512OooOOOo;
import androidx.appcompat.view.menu.OooO;
import androidx.appcompat.view.menu.OooOOOO;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements OooO.OooO0O0, InterfaceC21512OooOOOo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Context f62798OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public androidx.appcompat.view.menu.OooO f62799OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f62800OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f62801OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public ActionMenuPresenter f62802OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public OooO.OooO00o f62803OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public OooOOOO.OooO00o f62804OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f62805OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f62806OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final int f62807Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final int f62808Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public InterfaceC21522OooO0o0 f62809Oooo00o;

    public interface OooO00o {
        boolean OooO00o();

        boolean OooO0O0();
    }

    public static class OooO0O0 implements OooOOOO.OooO00o {
        @Override // androidx.appcompat.view.menu.OooOOOO.OooO00o
        public final boolean OooO00o(androidx.appcompat.view.menu.OooO oooO) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.OooOOOO.OooO00o
        public final void onCloseMenu(androidx.appcompat.view.menu.OooO oooO, boolean z) {
        }
    }

    public static class OooO0OO extends LinearLayoutCompat.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f62810OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f62811OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f62812OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f62813OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f62814OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f62815OooO0o0;
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$OooO0Oo, reason: case insensitive filesystem */
    public class C21521OooO0Oo implements OooO.OooO00o {
        public C21521OooO0Oo() {
        }

        @Override // androidx.appcompat.view.menu.OooO.OooO00o
        public final boolean onMenuItemSelected(androidx.appcompat.view.menu.OooO oooO, MenuItem menuItem) {
            boolean zOnMenuItemSelected;
            InterfaceC21522OooO0o0 interfaceC21522OooO0o0 = ActionMenuView.this.f62809Oooo00o;
            if (interfaceC21522OooO0o0 != null) {
                Toolbar toolbar = Toolbar.this;
                if (toolbar.mMenuHostHelper.onMenuItemSelected(menuItem)) {
                    zOnMenuItemSelected = true;
                } else {
                    Toolbar.InterfaceC21583OooO0oo interfaceC21583OooO0oo = toolbar.mOnMenuItemClickListener;
                    zOnMenuItemSelected = interfaceC21583OooO0oo != null ? C21499OooOoo0.this.f62475OooO0O0.onMenuItemSelected(0, menuItem) : false;
                }
                if (zOnMenuItemSelected) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.OooO.OooO00o
        public final void onMenuModeChange(androidx.appcompat.view.menu.OooO oooO) {
            OooO.OooO00o oooO00o = ActionMenuView.this.f62803OooOoo;
            if (oooO00o != null) {
                oooO00o.onMenuModeChange(oooO);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$OooO0o0, reason: case insensitive filesystem */
    public interface InterfaceC21522OooO0o0 {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f62807Oooo000 = (int) (56.0f * f);
        this.f62808Oooo00O = (int) (f * 4.0f);
        this.f62798OooOo = context;
        this.f62801OooOoO0 = 0;
    }

    public static OooO0OO OooO0Oo() {
        OooO0OO oooO0OO = new OooO0OO(-2, -2);
        oooO0OO.f62810OooO00o = false;
        ((LinearLayout.LayoutParams) oooO0OO).gravity = 16;
        return oooO0OO;
    }

    public static OooO0OO OooO0o0(ViewGroup.LayoutParams layoutParams) {
        OooO0OO oooO0OO;
        if (layoutParams == null) {
            return OooO0Oo();
        }
        if (layoutParams instanceof OooO0OO) {
            OooO0OO oooO0OO2 = (OooO0OO) layoutParams;
            oooO0OO = new OooO0OO(oooO0OO2);
            oooO0OO.f62810OooO00o = oooO0OO2.f62810OooO00o;
        } else {
            oooO0OO = new OooO0OO(layoutParams);
        }
        if (((LinearLayout.LayoutParams) oooO0OO).gravity <= 0) {
            ((LinearLayout.LayoutParams) oooO0OO).gravity = 16;
        }
        return oooO0OO;
    }

    @Override // androidx.appcompat.view.menu.OooO.OooO0O0
    public final boolean OooO0OO(androidx.appcompat.view.menu.OooOO0O oooOO0O) {
        return this.f62799OooOo0o.performItemAction(oooOO0O, 0);
    }

    public final boolean OooO0o(int i) {
        boolean zOooO00o = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof OooO00o)) {
            zOooO00o = ((OooO00o) childAt).OooO00o();
        }
        return (i <= 0 || !(childAt2 instanceof OooO00o)) ? zOooO00o : ((OooO00o) childAt2).OooO0O0() | zOooO00o;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof OooO0OO;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return OooO0Oo();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return OooO0o0(layoutParams);
    }

    public Menu getMenu() {
        if (this.f62799OooOo0o == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.OooO oooO = new androidx.appcompat.view.menu.OooO(context);
            this.f62799OooOo0o = oooO;
            oooO.setCallback(new C21521OooO0Oo());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f62802OooOoOO = actionMenuPresenter;
            actionMenuPresenter.f62774Oooo0 = true;
            actionMenuPresenter.f62778Oooo0O0 = true;
            OooOOOO.OooO00o oooO0O0 = this.f62804OooOoo0;
            if (oooO0O0 == null) {
                oooO0O0 = new OooO0O0();
            }
            actionMenuPresenter.f62579OooOoOO = oooO0O0;
            this.f62799OooOo0o.addMenuPresenter(actionMenuPresenter, this.f62798OooOo);
            ActionMenuPresenter actionMenuPresenter2 = this.f62802OooOoOO;
            actionMenuPresenter2.f62582OooOooO = this;
            this.f62799OooOo0o = actionMenuPresenter2.f62578OooOoO0;
        }
        return this.f62799OooOo0o;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f62802OooOoOO;
        ActionMenuPresenter.C21519OooO0Oo c21519OooO0Oo = actionMenuPresenter.f62775Oooo000;
        if (c21519OooO0Oo != null) {
            return c21519OooO0Oo.getDrawable();
        }
        if (actionMenuPresenter.f62777Oooo00o) {
            return actionMenuPresenter.f62776Oooo00O;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f62801OooOoO0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC21512OooOOOo
    public final void initialize(androidx.appcompat.view.menu.OooO oooO) {
        this.f62799OooOo0o = oooO;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f62802OooOoOO;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView(false);
            if (this.f62802OooOoOO.OooO0OO()) {
                this.f62802OooOoOO.OooO0O0();
                this.f62802OooOoOO.OooO0Oo();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f62802OooOoOO;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.OooO0O0();
            ActionMenuPresenter.OooO00o oooO00o = actionMenuPresenter.f62786OoooO00;
            if (oooO00o == null || !oooO00o.OooO0O0()) {
                return;
            }
            oooO00o.f62680OooO.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f62805OooOooO) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = C21572Ooooo0o.f63118OooO00o;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                OooO0OO oooO0OO = (OooO0OO) childAt.getLayoutParams();
                if (oooO0OO.f62810OooO00o) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (OooO0o(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) oooO0OO).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) oooO0OO).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) oooO0OO).leftMargin) + ((LinearLayout.LayoutParams) oooO0OO).rightMargin;
                    OooO0o(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                OooO0OO oooO0OO2 = (OooO0OO) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !oooO0OO2.f62810OooO00o) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) oooO0OO2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) oooO0OO2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            OooO0OO oooO0OO3 = (OooO0OO) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !oooO0OO3.f62810OooO00o) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) oooO0OO3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = C21036OooOOo0.OooO00o(measuredWidth4, ((LinearLayout.LayoutParams) oooO0OO3).rightMargin, iMax, i18);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        androidx.appcompat.view.menu.OooO oooO;
        boolean z = this.f62805OooOooO;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f62805OooOooO = z2;
        if (z != z2) {
            this.f62806OooOooo = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f62805OooOooO && (oooO = this.f62799OooOo0o) != null && size != this.f62806OooOooo) {
            this.f62806OooOooo = size;
            oooO.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (!this.f62805OooOooO || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                OooO0OO oooO0OO = (OooO0OO) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) oooO0OO).rightMargin = 0;
                ((LinearLayout.LayoutParams) oooO0OO).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.f62807Oooo000;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.f62808Oooo00O;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                OooO0OO oooO0OO2 = (OooO0OO) childAt.getLayoutParams();
                oooO0OO2.f62814OooO0o = false;
                oooO0OO2.f62812OooO0OO = 0;
                oooO0OO2.f62811OooO0O0 = 0;
                oooO0OO2.f62813OooO0Oo = false;
                ((LinearLayout.LayoutParams) oooO0OO2).leftMargin = 0;
                ((LinearLayout.LayoutParams) oooO0OO2).rightMargin = 0;
                oooO0OO2.f62815OooO0o0 = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = oooO0OO2.f62810OooO00o ? 1 : i10;
                OooO0OO oooO0OO3 = (OooO0OO) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                oooO0OO3.f62813OooO0Oo = !oooO0OO3.f62810OooO00o && z6;
                oooO0OO3.f62811OooO0O0 = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (oooO0OO2.f62813OooO0Oo) {
                    i15++;
                }
                if (oooO0OO2.f62810OooO00o) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (i15 > 0 && i23 > 0) {
            int i24 = Integer.MAX_VALUE;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                boolean z9 = z7;
                OooO0OO oooO0OO4 = (OooO0OO) getChildAt(i26).getLayoutParams();
                int i27 = iMax;
                if (oooO0OO4.f62813OooO0Oo) {
                    int i28 = oooO0OO4.f62811OooO0O0;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                iMax = i27;
                z7 = z9;
            }
            boolean z10 = z7;
            i4 = iMax;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                OooO0OO oooO0OO5 = (OooO0OO) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && oooO0OO5.f62815OooO0o0) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    oooO0OO5.f62811OooO0O0 += r11;
                    oooO0OO5.f62814OooO0o = r11;
                    i23--;
                } else if (oooO0OO5.f62811OooO0O0 == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            iMax = i4;
            z7 = z10;
            z8 = true;
        }
        i4 = iMax;
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((OooO0OO) getChildAt(0).getLayoutParams()).f62815OooO0o0) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((OooO0OO) getChildAt(i31).getLayoutParams()).f62815OooO0o0) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    OooO0OO oooO0OO6 = (OooO0OO) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        oooO0OO6.f62812OooO0OO = i32;
                        oooO0OO6.f62814OooO0o = true;
                        if (i33 == 0 && !oooO0OO6.f62815OooO0o0) {
                            ((LinearLayout.LayoutParams) oooO0OO6).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (oooO0OO6.f62810OooO00o) {
                        oooO0OO6.f62812OooO0OO = i32;
                        oooO0OO6.f62814OooO0o = true;
                        ((LinearLayout.LayoutParams) oooO0OO6).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) oooO0OO6).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) oooO0OO6).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                OooO0OO oooO0OO7 = (OooO0OO) childAt4.getLayoutParams();
                if (oooO0OO7.f62814OooO0o) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((oooO0OO7.f62811OooO0O0 * i22) + oooO0OO7.f62812OooO0OO, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f62802OooOoOO.f62782Oooo0oO = z;
    }

    public void setOnMenuItemClickListener(InterfaceC21522OooO0o0 interfaceC21522OooO0o0) {
        this.f62809Oooo00o = interfaceC21522OooO0o0;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f62802OooOoOO;
        ActionMenuPresenter.C21519OooO0Oo c21519OooO0Oo = actionMenuPresenter.f62775Oooo000;
        if (c21519OooO0Oo != null) {
            c21519OooO0Oo.setImageDrawable(drawable);
        } else {
            actionMenuPresenter.f62777Oooo00o = true;
            actionMenuPresenter.f62776Oooo00O = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.f62800OooOoO = z;
    }

    public void setPopupTheme(int i) {
        if (this.f62801OooOoO0 != i) {
            this.f62801OooOoO0 = i;
            if (i == 0) {
                this.f62798OooOo = getContext();
            } else {
                this.f62798OooOo = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f62802OooOoOO = actionMenuPresenter;
        actionMenuPresenter.f62582OooOooO = this;
        this.f62799OooOo0o = actionMenuPresenter.f62578OooOoO0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.OooO00o generateDefaultLayoutParams() {
        return OooO0Oo();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.OooO00o generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return OooO0o0(layoutParams);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new OooO0OO(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final LinearLayoutCompat.OooO00o generateLayoutParams(AttributeSet attributeSet) {
        return new OooO0OO(getContext(), attributeSet);
    }
}
