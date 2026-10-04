package androidx.appcompat.widget;

import OooO0oo.C20441OooO00o;
import Oooo0oO.C21034OooOOOo;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import com.orion.notein.global.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO00o extends ViewGroup {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Context f62880OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C18994OooO00o f62881OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ActionMenuPresenter f62882OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ActionMenuView f62883OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f62884OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f62885OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public ViewPropertyAnimatorCompat f62886OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f62887OooOooO;

    /* JADX INFO: renamed from: androidx.appcompat.widget.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C18994OooO00o implements ViewPropertyAnimatorListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f62888OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f62889OooO0O0;

        public C18994OooO00o() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationCancel(View view) {
            this.f62888OooO00o = true;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationEnd(View view) {
            if (this.f62888OooO00o) {
                return;
            }
            OooO00o oooO00o = OooO00o.this;
            oooO00o.f62886OooOoo0 = null;
            OooO00o.super.setVisibility(this.f62889OooO0O0);
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationStart(View view) {
            OooO00o.super.setVisibility(0);
            this.f62888OooO00o = false;
        }
    }

    public OooO00o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int OooO0OO(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int OooO0Oo(int i, int i2, int i3, View view, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int iOooO00o = C21034OooOOOo.OooO00o(i3, measuredHeight, 2, i2);
        if (z) {
            view.layout(i - measuredWidth, iOooO00o, i, measuredHeight + iOooO00o);
        } else {
            view.layout(i, iOooO00o, i + measuredWidth, measuredHeight + iOooO00o);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final ViewPropertyAnimatorCompat OooO0o0(int i, long j) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f62886OooOoo0;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.cancel();
        }
        C18994OooO00o c18994OooO00o = this.f62881OooOo0o;
        if (i != 0) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAlpha = ViewCompat.animate(this).alpha(0.0f);
            viewPropertyAnimatorCompatAlpha.setDuration(j);
            OooO00o.this.f62886OooOoo0 = viewPropertyAnimatorCompatAlpha;
            c18994OooO00o.f62889OooO0O0 = i;
            viewPropertyAnimatorCompatAlpha.setListener(c18994OooO00o);
            return viewPropertyAnimatorCompatAlpha;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAlpha2 = ViewCompat.animate(this).alpha(1.0f);
        viewPropertyAnimatorCompatAlpha2.setDuration(j);
        OooO00o.this.f62886OooOoo0 = viewPropertyAnimatorCompatAlpha2;
        c18994OooO00o.f62889OooO0O0 = i;
        viewPropertyAnimatorCompatAlpha2.setListener(c18994OooO00o);
        return viewPropertyAnimatorCompatAlpha2;
    }

    public int getAnimatedVisibility() {
        return this.f62886OooOoo0 != null ? this.f62881OooOo0o.f62889OooO0O0 : getVisibility();
    }

    public int getContentHeight() {
        return this.f62884OooOoOO;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C20441OooO00o.f58279OooO00o, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f62882OooOoO;
        if (actionMenuPresenter != null) {
            Configuration configuration2 = actionMenuPresenter.f62575OooOo.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            actionMenuPresenter.f62780Oooo0o = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            androidx.appcompat.view.menu.OooO oooO = actionMenuPresenter.f62578OooOoO0;
            if (oooO != null) {
                oooO.onItemsChanged(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f62887OooOooO = false;
        }
        if (!this.f62887OooOooO) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f62887OooOooO = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f62887OooOooO = false;
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f62885OooOoo = false;
        }
        if (!this.f62885OooOoo) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f62885OooOoo = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f62885OooOoo = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f62884OooOoOO = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f62886OooOoo0;
            if (viewPropertyAnimatorCompat != null) {
                viewPropertyAnimatorCompat.cancel();
            }
            super.setVisibility(i);
        }
    }

    public OooO00o(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f62881OooOo0o = new C18994OooO00o();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f62880OooOo = context;
        } else {
            this.f62880OooOo = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
