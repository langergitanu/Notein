package androidx.appcompat.widget;

import OooOO0o.C20446OooO0oO;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.app.C21503OooOooo;
import androidx.appcompat.view.menu.OooOOOO;
import androidx.core.graphics.Insets;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.orion.notein.global.R;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements OooOo, NestedScrollingParent, NestedScrollingParent2, NestedScrollingParent3 {

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public static final int[] f62739OoooOo0 = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public static final WindowInsetsCompat f62740OoooOoO = new WindowInsetsCompat.Builder().setSystemWindowInsets(Insets.m2of(0, 1, 0, 1)).build();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public static final Rect f62741OoooOoo = new Rect();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f62742OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f62743OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ActionBarContainer f62744OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ContentFrameLayout f62745OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public InterfaceC21541OooOoO0 f62746OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f62747OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Drawable f62748OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f62749OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f62750OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public WindowInsetsCompat f62751Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final Rect f62752Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f62753Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f62754Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f62755Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final Rect f62756Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final Rect f62757Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public WindowInsetsCompat f62758Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final Rect f62759Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public WindowInsetsCompat f62760Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public WindowInsetsCompat f62761Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final OooO00o f62762OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public OverScroller f62763OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public InterfaceC21517OooO0Oo f62764OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public ViewPropertyAnimator f62765OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final OooO0O0 f62766OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final NestedScrollingParentHelper f62767OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final OooO0o f62768OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final OooO0OO f62769o000oOoO;

    public class OooO00o extends AnimatorListenerAdapter {
        public OooO00o() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f62765OoooO0O = null;
            actionBarOverlayLayout.f62753Oooo000 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f62765OoooO0O = null;
            actionBarOverlayLayout.f62753Oooo000 = false;
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.OooOO0O();
            actionBarOverlayLayout.f62765OoooO0O = actionBarOverlayLayout.f62744OooOoO.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f62762OoooO);
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.OooOO0O();
            actionBarOverlayLayout.f62765OoooO0O = actionBarOverlayLayout.f62744OooOoO.animate().translationY(-actionBarOverlayLayout.f62744OooOoO.getHeight()).setListener(actionBarOverlayLayout.f62762OoooO);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$OooO0Oo, reason: case insensitive filesystem */
    public interface InterfaceC21517OooO0Oo {
    }

    public static final class OooO0o extends View {
        @Override // android.view.View
        public final int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$OooO0o0, reason: case insensitive filesystem */
    public static class C21518OooO0o0 extends ViewGroup.MarginLayoutParams {
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62742OooOo = 0;
        this.f62752Oooo0 = new Rect();
        this.f62756Oooo0O0 = new Rect();
        this.f62757Oooo0OO = new Rect();
        this.f62759Oooo0o0 = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.CONSUMED;
        this.f62758Oooo0o = windowInsetsCompat;
        this.f62760Oooo0oO = windowInsetsCompat;
        this.f62761Oooo0oo = windowInsetsCompat;
        this.f62751Oooo = windowInsetsCompat;
        this.f62762OoooO = new OooO00o();
        this.f62766OoooOO0 = new OooO0O0();
        this.f62769o000oOoO = new OooO0OO();
        OooOO0o(context);
        this.f62767OoooOOO = new NestedScrollingParentHelper(this);
        OooO0o oooO0o = new OooO0o(context);
        oooO0o.setWillNotDraw(true);
        this.f62768OoooOOo = oooO0o;
        addView(oooO0o);
    }

    public static boolean OooOO0(View view, Rect rect, boolean z) {
        boolean z2;
        C21518OooO0o0 c21518OooO0o0 = (C21518OooO0o0) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c21518OooO0o0).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c21518OooO0o0).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c21518OooO0o0).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c21518OooO0o0).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c21518OooO0o0).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c21518OooO0o0).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c21518OooO0o0).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c21518OooO0o0).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // androidx.appcompat.widget.OooOo
    public final void OooO() {
        OooOOO0();
        this.f62746OooOoOO.OooOO0o();
    }

    @Override // androidx.appcompat.widget.OooOo
    public final boolean OooO00o() {
        OooOOO0();
        return this.f62746OooOoOO.OooO00o();
    }

    @Override // androidx.appcompat.widget.OooOo
    public final boolean OooO0O0() {
        OooOOO0();
        return this.f62746OooOoOO.OooO0O0();
    }

    @Override // androidx.appcompat.widget.OooOo
    public final boolean OooO0OO() {
        OooOOO0();
        return this.f62746OooOoOO.OooO0OO();
    }

    @Override // androidx.appcompat.widget.OooOo
    public final void OooO0Oo(androidx.appcompat.view.menu.OooO oooO, OooOOOO.OooO00o oooO00o) {
        OooOOO0();
        this.f62746OooOoOO.OooO0Oo(oooO, oooO00o);
    }

    @Override // androidx.appcompat.widget.OooOo
    public final void OooO0o() {
        OooOOO0();
        this.f62746OooOoOO.OooO0o();
    }

    @Override // androidx.appcompat.widget.OooOo
    public final boolean OooO0o0() {
        OooOOO0();
        return this.f62746OooOoOO.OooO0o0();
    }

    @Override // androidx.appcompat.widget.OooOo
    public final boolean OooO0oO() {
        OooOOO0();
        return this.f62746OooOoOO.OooO0oO();
    }

    @Override // androidx.appcompat.widget.OooOo
    public final void OooO0oo(int i) {
        OooOOO0();
        if (i == 2) {
            this.f62746OooOoOO.OooOO0();
        } else if (i == 5) {
            this.f62746OooOoOO.OooOOOo();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void OooOO0O() {
        removeCallbacks(this.f62766OoooOO0);
        removeCallbacks(this.f62769o000oOoO);
        ViewPropertyAnimator viewPropertyAnimator = this.f62765OoooO0O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void OooOO0o(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f62739OoooOo0);
        this.f62743OooOo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f62748OooOoo0 = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f62763OoooO0 = new OverScroller(context);
    }

    public final void OooOOO0() {
        InterfaceC21541OooOoO0 wrapper;
        if (this.f62745OooOoO0 == null) {
            this.f62745OooOoO0 = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f62744OooOoO = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC21541OooOoO0) {
                wrapper = (InterfaceC21541OooOoO0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f62746OooOoOO = wrapper;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C21518OooO0o0;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f62748OooOoo0 != null) {
            if (this.f62744OooOoO.getVisibility() == 0) {
                translationY = (int) (this.f62744OooOoO.getTranslationY() + this.f62744OooOoO.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f62748OooOoo0.setBounds(0, translationY, getWidth(), this.f62748OooOoo0.getIntrinsicHeight() + translationY);
            this.f62748OooOoo0.draw(canvas);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C21518OooO0o0(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C21518OooO0o0(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f62744OooOoO;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f62767OoooOOO.getNestedScrollAxes();
    }

    public CharSequence getTitle() {
        OooOOO0();
        return this.f62746OooOoOO.getTitle();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        OooOOO0();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, this);
        boolean zOooOO0 = OooOO0(this.f62744OooOoO, new Rect(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom()), false);
        Rect rect = this.f62752Oooo0;
        ViewCompat.computeSystemWindowInsets(this, windowInsetsCompat, rect);
        WindowInsetsCompat windowInsetsCompatInset = windowInsetsCompat.inset(rect.left, rect.top, rect.right, rect.bottom);
        this.f62758Oooo0o = windowInsetsCompatInset;
        boolean z = true;
        if (!this.f62760Oooo0oO.equals(windowInsetsCompatInset)) {
            this.f62760Oooo0oO = this.f62758Oooo0o;
            zOooOO0 = true;
        }
        Rect rect2 = this.f62756Oooo0O0;
        if (rect2.equals(rect)) {
            z = zOooOO0;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return windowInsetsCompat.consumeDisplayCutout().consumeSystemWindowInsets().consumeStableInsets().toWindowInsets();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        OooOO0o(getContext());
        ViewCompat.requestApplyInsets(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooOO0O();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C21518OooO0o0 c21518OooO0o0 = (C21518OooO0o0) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c21518OooO0o0).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c21518OooO0o0).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        OooOOO0();
        measureChildWithMargins(this.f62744OooOoO, i, 0, i2, 0);
        C21518OooO0o0 c21518OooO0o0 = (C21518OooO0o0) this.f62744OooOoO.getLayoutParams();
        int iMax = Math.max(0, this.f62744OooOoO.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c21518OooO0o0).leftMargin + ((ViewGroup.MarginLayoutParams) c21518OooO0o0).rightMargin);
        int iMax2 = Math.max(0, this.f62744OooOoO.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c21518OooO0o0).topMargin + ((ViewGroup.MarginLayoutParams) c21518OooO0o0).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f62744OooOoO.getMeasuredState());
        boolean z = (ViewCompat.getWindowSystemUiVisibility(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f62743OooOo0o;
            if (this.f62749OooOooO && this.f62744OooOoO.getTabContainer() != null) {
                measuredHeight += this.f62743OooOo0o;
            }
        } else {
            measuredHeight = this.f62744OooOoO.getVisibility() != 8 ? this.f62744OooOoO.getMeasuredHeight() : 0;
        }
        Rect rect = this.f62752Oooo0;
        Rect rect2 = this.f62757Oooo0OO;
        rect2.set(rect);
        this.f62761Oooo0oo = this.f62758Oooo0o;
        if (this.f62747OooOoo || z) {
            this.f62761Oooo0oo = new WindowInsetsCompat.Builder(this.f62761Oooo0oo).setSystemWindowInsets(Insets.m2of(this.f62761Oooo0oo.getSystemWindowInsetLeft(), this.f62761Oooo0oo.getSystemWindowInsetTop() + measuredHeight, this.f62761Oooo0oo.getSystemWindowInsetRight(), this.f62761Oooo0oo.getSystemWindowInsetBottom())).build();
        } else {
            OooO0o oooO0o = this.f62768OoooOOo;
            WindowInsetsCompat windowInsetsCompat = f62740OoooOoO;
            Rect rect3 = this.f62759Oooo0o0;
            ViewCompat.computeSystemWindowInsets(oooO0o, windowInsetsCompat, rect3);
            if (!rect3.equals(f62741OoooOoo)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f62761Oooo0oo = this.f62761Oooo0oo.inset(0, measuredHeight, 0, 0);
            }
        }
        OooOO0(this.f62745OooOoO0, rect2, true);
        if (!this.f62751Oooo.equals(this.f62761Oooo0oo)) {
            WindowInsetsCompat windowInsetsCompat2 = this.f62761Oooo0oo;
            this.f62751Oooo = windowInsetsCompat2;
            ViewCompat.dispatchApplyWindowInsets(this.f62745OooOoO0, windowInsetsCompat2);
        }
        measureChildWithMargins(this.f62745OooOoO0, i, 0, i2, 0);
        C21518OooO0o0 c21518OooO0o02 = (C21518OooO0o0) this.f62745OooOoO0.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f62745OooOoO0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c21518OooO0o02).leftMargin + ((ViewGroup.MarginLayoutParams) c21518OooO0o02).rightMargin);
        int iMax4 = Math.max(iMax2, this.f62745OooOoO0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c21518OooO0o02).topMargin + ((ViewGroup.MarginLayoutParams) c21518OooO0o02).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f62745OooOoO0.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f62750OooOooo || !z) {
            return false;
        }
        this.f62763OoooO0.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f62763OoooO0.getFinalY() > this.f62744OooOoO.getHeight()) {
            OooOO0O();
            this.f62769o000oOoO.run();
        } else {
            OooOO0O();
            this.f62766OoooOO0.run();
        }
        this.f62753Oooo000 = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        OooOOO0();
        int i2 = this.f62755Oooo00o ^ i;
        this.f62755Oooo00o = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC21517OooO0Oo interfaceC21517OooO0Oo = this.f62764OoooO00;
        if (interfaceC21517OooO0Oo != null) {
            C21503OooOooo c21503OooOooo = (C21503OooOooo) interfaceC21517OooO0Oo;
            c21503OooOooo.f62510OooOOOO = !z2;
            if (z || !z2) {
                if (c21503OooOooo.f62511OooOOOo) {
                    c21503OooOooo.f62511OooOOOo = false;
                    c21503OooOooo.OooOOoo(true);
                }
            } else if (!c21503OooOooo.f62511OooOOOo) {
                c21503OooOooo.f62511OooOOOo = true;
                c21503OooOooo.OooOOoo(true);
            }
        }
        if ((i2 & 256) == 0 || this.f62764OoooO00 == null) {
            return;
        }
        ViewCompat.requestApplyInsets(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f62742OooOo = i;
        InterfaceC21517OooO0Oo interfaceC21517OooO0Oo = this.f62764OoooO00;
        if (interfaceC21517OooO0Oo != null) {
            ((C21503OooOooo) interfaceC21517OooO0Oo).f62508OooOOO = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        OooOO0O();
        this.f62744OooOoO.setTranslationY(-Math.max(0, Math.min(i, this.f62744OooOoO.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC21517OooO0Oo interfaceC21517OooO0Oo) {
        this.f62764OoooO00 = interfaceC21517OooO0Oo;
        if (getWindowToken() != null) {
            ((C21503OooOooo) this.f62764OoooO00).f62508OooOOO = this.f62742OooOo;
            int i = this.f62755Oooo00o;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                ViewCompat.requestApplyInsets(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f62749OooOooO = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f62750OooOooo) {
            this.f62750OooOooo = z;
            if (z) {
                return;
            }
            OooOO0O();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        OooOOO0();
        this.f62746OooOoOO.setIcon(i);
    }

    public void setLogo(int i) {
        OooOOO0();
        this.f62746OooOoOO.OooOOo(i);
    }

    public void setOverlayMode(boolean z) {
        this.f62747OooOoo = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // androidx.appcompat.widget.OooOo
    public void setWindowCallback(Window.Callback callback) {
        OooOOO0();
        this.f62746OooOoOO.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.OooOo
    public void setWindowTitle(CharSequence charSequence) {
        OooOOO0();
        this.f62746OooOoOO.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C21503OooOooo c21503OooOooo;
        C20446OooO0oO c20446OooO0oO;
        this.f62767OoooOOO.onNestedScrollAccepted(view, view2, i);
        this.f62754Oooo00O = getActionBarHideOffset();
        OooOO0O();
        InterfaceC21517OooO0Oo interfaceC21517OooO0Oo = this.f62764OoooO00;
        if (interfaceC21517OooO0Oo == null || (c20446OooO0oO = (c21503OooOooo = (C21503OooOooo) interfaceC21517OooO0Oo).f62514OooOOoo) == null) {
            return;
        }
        c20446OooO0oO.OooO00o();
        c21503OooOooo.f62514OooOOoo = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f62744OooOoO.getVisibility() != 0) {
            return false;
        }
        return this.f62750OooOooo;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onStopNestedScroll(View view) {
        if (!this.f62750OooOooo || this.f62753Oooo000) {
            return;
        }
        if (this.f62754Oooo00O <= this.f62744OooOoO.getHeight()) {
            OooOO0O();
            postDelayed(this.f62766OoooOO0, 600L);
        } else {
            OooOO0O();
            postDelayed(this.f62769o000oOoO, 600L);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C21518OooO0o0(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f62754Oooo00O + i2;
        this.f62754Oooo00O = i5;
        setActionBarHideOffset(i5);
    }

    public void setIcon(Drawable drawable) {
        OooOOO0();
        this.f62746OooOoOO.setIcon(drawable);
    }
}
