package androidx.swiperefreshlayout.widget;

import OooOoO.C20504OooO0O0;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.content.ContextCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ListViewCompat;
import o0O0ooO.C26213OooO00o;
import o0O0ooO.C26216OooO0Oo;
import o0O0ooO.C26217OooO0o;
import o0O0ooO.C26218OooO0o0;
import o0O0ooO.C26219OooO0oO;
import o0Oo0oOo.C28329OooOoO;

/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements NestedScrollingParent, NestedScrollingChild {

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public static final int[] f66279OooooOO = {R.attr.enabled};

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooO0o f66280OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public View f66281OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f66282OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f66283OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f66284OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final NestedScrollingParentHelper f66285OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public float f66286OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final NestedScrollingChildHelper f66287OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final int[] f66288OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f66289Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public int f66290Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final int[] f66291Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f66292Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final int f66293Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public float f66294Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public float f66295Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f66296Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f66297Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final DecelerateInterpolator f66298Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final C26213OooO00o f66299Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f66300OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final int f66301OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f66302OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final int f66303OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final C26216OooO0Oo f66304OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public C26217OooO0o f66305OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public C26219OooO0oO f66306OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public C26219OooO0oO f66307OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f66308OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f66309OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final OooO00o f66310Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final OooO0OO f66311Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final C22087OooO0Oo f66312OooooO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public C26218OooO0o0 f66313o000oOoO;

    public class OooO00o implements Animation.AnimationListener {
        public OooO00o() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            OooO0o oooO0o;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f66283OooOoO0) {
                swipeRefreshLayout.OooO0o();
                return;
            }
            swipeRefreshLayout.f66304OoooOO0.setAlpha(255);
            swipeRefreshLayout.f66304OoooOO0.start();
            if (swipeRefreshLayout.f66308OoooOoO && (oooO0o = swipeRefreshLayout.f66280OooOo) != null) {
                ((C28329OooOoO) oooO0o).f100463OooO00o.OooOoo().OooO0o();
            }
            swipeRefreshLayout.f66290Oooo0 = swipeRefreshLayout.f66299Oooo0oo.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public class OooO0O0 implements Animation.AnimationListener {
        public OooO0O0() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            swipeRefreshLayout.getClass();
            C26217OooO0o c26217OooO0o = new C26217OooO0o(swipeRefreshLayout);
            swipeRefreshLayout.f66305OoooOOO = c26217OooO0o;
            c26217OooO0o.setDuration(150L);
            C26213OooO00o c26213OooO00o = swipeRefreshLayout.f66299Oooo0oo;
            c26213OooO00o.f89546OooOo0o = null;
            c26213OooO00o.clearAnimation();
            swipeRefreshLayout.f66299Oooo0oo.startAnimation(swipeRefreshLayout.f66305OoooOOO);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public class OooO0OO extends Animation {
        public OooO0OO() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int iAbs = swipeRefreshLayout.f66303OoooO0O - Math.abs(swipeRefreshLayout.f66301OoooO0);
            swipeRefreshLayout.setTargetOffsetTopAndBottom((swipeRefreshLayout.f66302OoooO00 + ((int) ((iAbs - r1) * f))) - swipeRefreshLayout.f66299Oooo0oo.getTop());
            C26216OooO0Oo c26216OooO0Oo = swipeRefreshLayout.f66304OoooOO0;
            float f2 = 1.0f - f;
            C26216OooO0Oo.OooO00o oooO00o = c26216OooO0Oo.f89555OooOo0o;
            if (f2 != oooO00o.f89575OooOOOo) {
                oooO00o.f89575OooOOOo = f2;
            }
            c26216OooO0Oo.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$OooO0Oo, reason: case insensitive filesystem */
    public class C22087OooO0Oo extends Animation {
        public C22087OooO0Oo() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.OooO0o0(f);
        }
    }

    public interface OooO0o {
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$OooO0o0, reason: case insensitive filesystem */
    public interface InterfaceC22088OooO0o0 {
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f66283OooOoO0 = false;
        this.f66284OooOoOO = -1.0f;
        this.f66288OooOooo = new int[2];
        this.f66291Oooo000 = new int[2];
        this.f66296Oooo0o = -1;
        this.f66289Oooo = -1;
        this.f66310Ooooo00 = new OooO00o();
        this.f66311Ooooo0o = new OooO0OO();
        this.f66312OooooO0 = new C22087OooO0Oo();
        this.f66282OooOoO = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f66293Oooo00o = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f66298Oooo0oO = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f66309OoooOoo = (int) (displayMetrics.density * 40.0f);
        C26213OooO00o c26213OooO00o = new C26213OooO00o(getContext());
        float f = c26213OooO00o.getContext().getResources().getDisplayMetrics().density;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        ViewCompat.setElevation(c26213OooO00o, f * 4.0f);
        shapeDrawable.getPaint().setColor(-328966);
        ViewCompat.setBackground(c26213OooO00o, shapeDrawable);
        this.f66299Oooo0oo = c26213OooO00o;
        C26216OooO0Oo c26216OooO0Oo = new C26216OooO0Oo(getContext());
        this.f66304OoooOO0 = c26216OooO0Oo;
        c26216OooO0Oo.OooO0OO(1);
        this.f66299Oooo0oo.setImageDrawable(this.f66304OoooOO0);
        this.f66299Oooo0oo.setVisibility(8);
        addView(this.f66299Oooo0oo);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f66303OoooO0O = i;
        this.f66284OooOoOO = i;
        this.f66285OooOoo = new NestedScrollingParentHelper(this);
        this.f66287OooOooO = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f66309OoooOoo;
        this.f66290Oooo0 = i2;
        this.f66301OoooO0 = i2;
        OooO0o0(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f66279OooooOO);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.f66299Oooo0oo.getBackground().setAlpha(i);
        this.f66304OoooOO0.setAlpha(i);
    }

    public final boolean OooO00o() {
        View view = this.f66281OooOo0o;
        return view instanceof ListView ? ListViewCompat.canScrollList((ListView) view, -1) : view.canScrollVertically(-1);
    }

    public final void OooO0O0() {
        if (this.f66281OooOo0o == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f66299Oooo0oo)) {
                    this.f66281OooOo0o = childAt;
                    return;
                }
            }
        }
    }

    public final void OooO0OO(float f) {
        if (f > this.f66284OooOoOO) {
            OooO0oO(true, true);
            return;
        }
        this.f66283OooOoO0 = false;
        C26216OooO0Oo c26216OooO0Oo = this.f66304OoooOO0;
        C26216OooO0Oo.OooO00o oooO00o = c26216OooO0Oo.f89555OooOo0o;
        oooO00o.f89566OooO0o0 = 0.0f;
        oooO00o.f89565OooO0o = 0.0f;
        c26216OooO0Oo.invalidateSelf();
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f66302OoooO00 = this.f66290Oooo0;
        C22087OooO0Oo c22087OooO0Oo = this.f66312OooooO0;
        c22087OooO0Oo.reset();
        c22087OooO0Oo.setDuration(200L);
        c22087OooO0Oo.setInterpolator(this.f66298Oooo0oO);
        C26213OooO00o c26213OooO00o = this.f66299Oooo0oo;
        c26213OooO00o.f89546OooOo0o = oooO0O0;
        c26213OooO00o.clearAnimation();
        this.f66299Oooo0oo.startAnimation(c22087OooO0Oo);
        C26216OooO0Oo c26216OooO0Oo2 = this.f66304OoooOO0;
        C26216OooO0Oo.OooO00o oooO00o2 = c26216OooO0Oo2.f89555OooOo0o;
        if (oooO00o2.f89572OooOOO) {
            oooO00o2.f89572OooOOO = false;
        }
        c26216OooO0Oo2.invalidateSelf();
    }

    public final void OooO0Oo(float f) {
        C26219OooO0oO c26219OooO0oO;
        C26219OooO0oO c26219OooO0oO2;
        C26216OooO0Oo c26216OooO0Oo = this.f66304OoooOO0;
        C26216OooO0Oo.OooO00o oooO00o = c26216OooO0Oo.f89555OooOo0o;
        if (!oooO00o.f89572OooOOO) {
            oooO00o.f89572OooOOO = true;
        }
        c26216OooO0Oo.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f / this.f66284OooOoOO));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.f66284OooOoOO;
        int i = this.f66300OoooO;
        if (i <= 0) {
            i = this.f66303OoooO0O;
        }
        float f2 = i;
        double dMax = Math.max(0.0f, Math.min(fAbs, f2 * 2.0f) / f2) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i2 = this.f66301OoooO0 + ((int) ((f2 * fMin) + (f2 * fPow * 2.0f)));
        if (this.f66299Oooo0oo.getVisibility() != 0) {
            this.f66299Oooo0oo.setVisibility(0);
        }
        this.f66299Oooo0oo.setScaleX(1.0f);
        this.f66299Oooo0oo.setScaleY(1.0f);
        if (f < this.f66284OooOoOO) {
            if (this.f66304OoooOO0.f89555OooOo0o.f89580OooOo00 > 76 && ((c26219OooO0oO2 = this.f66306OoooOOo) == null || !c26219OooO0oO2.hasStarted() || c26219OooO0oO2.hasEnded())) {
                C26219OooO0oO c26219OooO0oO3 = new C26219OooO0oO(this, this.f66304OoooOO0.f89555OooOo0o.f89580OooOo00, 76);
                c26219OooO0oO3.setDuration(300L);
                C26213OooO00o c26213OooO00o = this.f66299Oooo0oo;
                c26213OooO00o.f89546OooOo0o = null;
                c26213OooO00o.clearAnimation();
                this.f66299Oooo0oo.startAnimation(c26219OooO0oO3);
                this.f66306OoooOOo = c26219OooO0oO3;
            }
        } else if (this.f66304OoooOO0.f89555OooOo0o.f89580OooOo00 < 255 && ((c26219OooO0oO = this.f66307OoooOo0) == null || !c26219OooO0oO.hasStarted() || c26219OooO0oO.hasEnded())) {
            C26219OooO0oO c26219OooO0oO4 = new C26219OooO0oO(this, this.f66304OoooOO0.f89555OooOo0o.f89580OooOo00, 255);
            c26219OooO0oO4.setDuration(300L);
            C26213OooO00o c26213OooO00o2 = this.f66299Oooo0oo;
            c26213OooO00o2.f89546OooOo0o = null;
            c26213OooO00o2.clearAnimation();
            this.f66299Oooo0oo.startAnimation(c26219OooO0oO4);
            this.f66307OoooOo0 = c26219OooO0oO4;
        }
        C26216OooO0Oo c26216OooO0Oo2 = this.f66304OoooOO0;
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        C26216OooO0Oo.OooO00o oooO00o2 = c26216OooO0Oo2.f89555OooOo0o;
        oooO00o2.f89566OooO0o0 = 0.0f;
        oooO00o2.f89565OooO0o = fMin2;
        c26216OooO0Oo2.invalidateSelf();
        C26216OooO0Oo c26216OooO0Oo3 = this.f66304OoooOO0;
        float fMin3 = Math.min(1.0f, fMax);
        C26216OooO0Oo.OooO00o oooO00o3 = c26216OooO0Oo3.f89555OooOo0o;
        if (fMin3 != oooO00o3.f89575OooOOOo) {
            oooO00o3.f89575OooOOOo = fMin3;
        }
        c26216OooO0Oo3.invalidateSelf();
        float fOooO0O0 = C20504OooO0O0.OooO0O0(fPow, 2.0f, (fMax * 0.4f) - 0.25f, 0.5f);
        C26216OooO0Oo c26216OooO0Oo4 = this.f66304OoooOO0;
        c26216OooO0Oo4.f89555OooOo0o.f89567OooO0oO = fOooO0O0;
        c26216OooO0Oo4.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.f66290Oooo0);
    }

    public final void OooO0o() {
        this.f66299Oooo0oo.clearAnimation();
        this.f66304OoooOO0.stop();
        this.f66299Oooo0oo.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.f66301OoooO0 - this.f66290Oooo0);
        this.f66290Oooo0 = this.f66299Oooo0oo.getTop();
    }

    public final void OooO0o0(float f) {
        setTargetOffsetTopAndBottom((this.f66302OoooO00 + ((int) ((this.f66301OoooO0 - r0) * f))) - this.f66299Oooo0oo.getTop());
    }

    public final void OooO0oO(boolean z, boolean z2) {
        if (this.f66283OooOoO0 != z) {
            this.f66308OoooOoO = z2;
            OooO0O0();
            this.f66283OooOoO0 = z;
            OooO00o oooO00o = this.f66310Ooooo00;
            if (!z) {
                C26217OooO0o c26217OooO0o = new C26217OooO0o(this);
                this.f66305OoooOOO = c26217OooO0o;
                c26217OooO0o.setDuration(150L);
                C26213OooO00o c26213OooO00o = this.f66299Oooo0oo;
                c26213OooO00o.f89546OooOo0o = oooO00o;
                c26213OooO00o.clearAnimation();
                this.f66299Oooo0oo.startAnimation(this.f66305OoooOOO);
                return;
            }
            this.f66302OoooO00 = this.f66290Oooo0;
            OooO0OO oooO0OO = this.f66311Ooooo0o;
            oooO0OO.reset();
            oooO0OO.setDuration(200L);
            oooO0OO.setInterpolator(this.f66298Oooo0oO);
            if (oooO00o != null) {
                this.f66299Oooo0oo.f89546OooOo0o = oooO00o;
            }
            this.f66299Oooo0oo.clearAnimation();
            this.f66299Oooo0oo.startAnimation(oooO0OO);
        }
    }

    public final void OooO0oo(float f) {
        float f2 = this.f66295Oooo0OO;
        float f3 = f - f2;
        float f4 = this.f66282OooOoO;
        if (f3 <= f4 || this.f66297Oooo0o0) {
            return;
        }
        this.f66294Oooo0O0 = f2 + f4;
        this.f66297Oooo0o0 = true;
        this.f66304OoooOO0.setAlpha(76);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f66287OooOooO.dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f66287OooOooO.dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f66287OooOooO.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f66287OooOooO.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f66289Oooo;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f66285OooOoo.getNestedScrollAxes();
    }

    public int getProgressCircleDiameter() {
        return this.f66309OoooOoo;
    }

    public int getProgressViewEndOffset() {
        return this.f66303OoooO0O;
    }

    public int getProgressViewStartOffset() {
        return this.f66301OoooO0;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean hasNestedScrollingParent() {
        return this.f66287OooOooO.hasNestedScrollingParent();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean isNestedScrollingEnabled() {
        return this.f66287OooOooO.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooO0o();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        OooO0O0();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !OooO00o() && !this.f66283OooOoO0 && !this.f66292Oooo00O) {
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.f66297Oooo0o0 = false;
                    this.f66296Oooo0o = -1;
                } else if (actionMasked == 2) {
                    int i = this.f66296Oooo0o;
                    if (i == -1) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    if (iFindPointerIndex >= 0) {
                        OooO0oo(motionEvent.getY(iFindPointerIndex));
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f66296Oooo0o) {
                            this.f66296Oooo0o = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        }
                    }
                }
                return this.f66297Oooo0o0;
            }
            setTargetOffsetTopAndBottom(this.f66301OoooO0 - this.f66299Oooo0oo.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f66296Oooo0o = pointerId;
            this.f66297Oooo0o0 = false;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 >= 0) {
                this.f66295Oooo0OO = motionEvent.getY(iFindPointerIndex2);
                return this.f66297Oooo0o0;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f66281OooOo0o == null) {
            OooO0O0();
        }
        View view = this.f66281OooOo0o;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f66299Oooo0oo.getMeasuredWidth();
        int measuredHeight2 = this.f66299Oooo0oo.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f66290Oooo0;
        this.f66299Oooo0oo.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f66281OooOo0o == null) {
            OooO0O0();
        }
        View view = this.f66281OooOo0o;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f66299Oooo0oo.measure(View.MeasureSpec.makeMeasureSpec(this.f66309OoooOoo, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f66309OoooOoo, 1073741824));
        this.f66289Oooo = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.f66299Oooo0oo) {
                this.f66289Oooo = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.f66287OooOooO.dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f66287OooOooO.dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f66286OooOoo0;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.f66286OooOoo0 = 0.0f;
                } else {
                    this.f66286OooOoo0 = f - f2;
                    iArr[1] = i2;
                }
                OooO0Oo(this.f66286OooOoo0);
            }
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        NestedScrollingChildHelper nestedScrollingChildHelper = this.f66287OooOooO;
        int[] iArr2 = this.f66288OooOooo;
        if (nestedScrollingChildHelper.dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f66291Oooo000);
        if (i4 + this.f66291Oooo000[1] >= 0 || OooO00o()) {
            return;
        }
        float fAbs = this.f66286OooOoo0 + Math.abs(r11);
        this.f66286OooOoo0 = fAbs;
        OooO0Oo(fAbs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f66285OooOoo.onNestedScrollAccepted(view, view2, i);
        startNestedScroll(i & 2);
        this.f66286OooOoo0 = 0.0f;
        this.f66292Oooo00O = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f66283OooOoO0 || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onStopNestedScroll(View view) {
        this.f66285OooOoo.onStopNestedScroll(view);
        this.f66292Oooo00O = false;
        float f = this.f66286OooOoo0;
        if (f > 0.0f) {
            OooO0OO(f);
            this.f66286OooOoo0 = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !OooO00o() && !this.f66283OooOoO0 && !this.f66292Oooo00O) {
            if (actionMasked == 0) {
                this.f66296Oooo0o = motionEvent.getPointerId(0);
                this.f66297Oooo0o0 = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f66296Oooo0o);
                if (iFindPointerIndex < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f66297Oooo0o0) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.f66294Oooo0O0) * 0.5f;
                    this.f66297Oooo0o0 = false;
                    OooO0OO(y);
                }
                this.f66296Oooo0o = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f66296Oooo0o);
                if (iFindPointerIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                OooO0oo(y2);
                if (this.f66297Oooo0o0) {
                    float f = (y2 - this.f66294Oooo0O0) * 0.5f;
                    if (f > 0.0f) {
                        OooO0Oo(f);
                    }
                }
                return true;
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f66296Oooo0o) {
                            this.f66296Oooo0o = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f66296Oooo0o = motionEvent.getPointerId(actionIndex2);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        View view = this.f66281OooOo0o;
        if (view == null || ViewCompat.isNestedScrollingEnabled(view)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setAnimationProgress(float f) {
        this.f66299Oooo0oo.setScaleX(f);
        this.f66299Oooo0oo.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        OooO0O0();
        C26216OooO0Oo c26216OooO0Oo = this.f66304OoooOO0;
        C26216OooO0Oo.OooO00o oooO00o = c26216OooO0Oo.f89555OooOo0o;
        oooO00o.f89560OooO = iArr;
        oooO00o.OooO00o(0);
        oooO00o.OooO00o(0);
        c26216OooO0Oo.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = ContextCompat.getColor(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f66284OooOoOO = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        OooO0o();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.f66287OooOooO.setNestedScrollingEnabled(z);
    }

    public void setOnChildScrollUpCallback(InterfaceC22088OooO0o0 interfaceC22088OooO0o0) {
    }

    public void setOnRefreshListener(OooO0o oooO0o) {
        this.f66280OooOo = oooO0o;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f66299Oooo0oo.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(ContextCompat.getColor(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f66283OooOoO0 == z) {
            OooO0oO(z, false);
            return;
        }
        this.f66283OooOoO0 = z;
        setTargetOffsetTopAndBottom((this.f66303OoooO0O + this.f66301OoooO0) - this.f66290Oooo0);
        this.f66308OoooOoO = false;
        OooO00o oooO00o = this.f66310Ooooo00;
        this.f66299Oooo0oo.setVisibility(0);
        this.f66304OoooOO0.setAlpha(255);
        C26218OooO0o0 c26218OooO0o0 = new C26218OooO0o0(this);
        this.f66313o000oOoO = c26218OooO0o0;
        c26218OooO0o0.setDuration(this.f66293Oooo00o);
        if (oooO00o != null) {
            this.f66299Oooo0oo.f89546OooOo0o = oooO00o;
        }
        this.f66299Oooo0oo.clearAnimation();
        this.f66299Oooo0oo.startAnimation(this.f66313o000oOoO);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f66309OoooOoo = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f66309OoooOoo = (int) (displayMetrics.density * 40.0f);
            }
            this.f66299Oooo0oo.setImageDrawable(null);
            this.f66304OoooOO0.OooO0OO(i);
            this.f66299Oooo0oo.setImageDrawable(this.f66304OoooOO0);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f66300OoooO = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.f66299Oooo0oo.bringToFront();
        ViewCompat.offsetTopAndBottom(this.f66299Oooo0oo, i);
        this.f66290Oooo0 = this.f66299Oooo0oo.getTop();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean startNestedScroll(int i) {
        return this.f66287OooOooO.startNestedScroll(i);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final void stopNestedScroll() {
        this.f66287OooOooO.stopNestedScroll();
    }
}
