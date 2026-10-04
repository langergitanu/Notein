package androidx.appcompat.widget;

import OooO0oo.C20441OooO00o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.orion.notein.global.R;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ScrollingTabContainerView f62716OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f62717OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public View f62718OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public View f62719OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Drawable f62720OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Drawable f62721OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Drawable f62722OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final boolean f62723OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f62724OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final int f62725Oooo000;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new OooO0O0(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C20441OooO00o.f58279OooO00o);
        boolean z = false;
        this.f62720OooOoOO = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f62722OooOoo0 = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f62725Oooo000 = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f62723OooOooO = true;
            this.f62721OooOoo = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f62723OooOooO ? !(this.f62720OooOoOO != null || this.f62722OooOoo0 != null) : this.f62721OooOoo == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public static int OooO00o(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f62720OooOoOO;
        if (drawable != null && drawable.isStateful()) {
            this.f62720OooOoOO.setState(getDrawableState());
        }
        Drawable drawable2 = this.f62722OooOoo0;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f62722OooOoo0.setState(getDrawableState());
        }
        Drawable drawable3 = this.f62721OooOoo;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f62721OooOoo.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f62716OooOo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f62720OooOoOO;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f62722OooOoo0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f62721OooOoo;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f62719OooOoO0 = findViewById(R.id.action_bar);
        this.f62718OooOoO = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f62717OooOo0o || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        ScrollingTabContainerView scrollingTabContainerView = this.f62716OooOo;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (scrollingTabContainerView == null || scrollingTabContainerView.getVisibility() == 8) ? false : true;
        if (scrollingTabContainerView != null && scrollingTabContainerView.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) scrollingTabContainerView.getLayoutParams();
            int measuredHeight2 = measuredHeight - scrollingTabContainerView.getMeasuredHeight();
            int i5 = layoutParams.bottomMargin;
            scrollingTabContainerView.layout(i, measuredHeight2 - i5, i3, measuredHeight - i5);
        }
        if (this.f62723OooOooO) {
            Drawable drawable2 = this.f62721OooOoo;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = z3;
            }
        } else {
            if (this.f62720OooOoOO != null) {
                if (this.f62719OooOoO0.getVisibility() == 0) {
                    this.f62720OooOoOO.setBounds(this.f62719OooOoO0.getLeft(), this.f62719OooOoO0.getTop(), this.f62719OooOoO0.getRight(), this.f62719OooOoO0.getBottom());
                } else {
                    View view = this.f62718OooOoO;
                    if (view == null || view.getVisibility() != 0) {
                        this.f62720OooOoOO.setBounds(0, 0, 0, 0);
                    } else {
                        this.f62720OooOoOO.setBounds(this.f62718OooOoO.getLeft(), this.f62718OooOoO.getTop(), this.f62718OooOoO.getRight(), this.f62718OooOoO.getBottom());
                    }
                }
                z3 = true;
            }
            this.f62724OooOooo = z4;
            if (z4 && (drawable = this.f62722OooOoo0) != null) {
                drawable.setBounds(scrollingTabContainerView.getLeft(), scrollingTabContainerView.getTop(), scrollingTabContainerView.getRight(), scrollingTabContainerView.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iOooO00o;
        int i3;
        if (this.f62719OooOoO0 == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f62725Oooo000) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f62719OooOoO0 == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        ScrollingTabContainerView scrollingTabContainerView = this.f62716OooOo;
        if (scrollingTabContainerView == null || scrollingTabContainerView.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        View view = this.f62719OooOoO0;
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            View view2 = this.f62718OooOoO;
            iOooO00o = (view2 == null || view2.getVisibility() == 8 || view2.getMeasuredHeight() == 0) ? 0 : OooO00o(this.f62718OooOoO);
        } else {
            iOooO00o = OooO00o(this.f62719OooOoO0);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(OooO00o(this.f62716OooOo) + iOooO00o, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f62720OooOoOO;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f62720OooOoOO);
        }
        this.f62720OooOoOO = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f62719OooOoO0;
            if (view != null) {
                this.f62720OooOoOO.setBounds(view.getLeft(), this.f62719OooOoO0.getTop(), this.f62719OooOoO0.getRight(), this.f62719OooOoO0.getBottom());
            }
        }
        boolean z = false;
        if (!this.f62723OooOooO ? !(this.f62720OooOoOO != null || this.f62722OooOoo0 != null) : this.f62721OooOoo == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f62721OooOoo;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f62721OooOoo);
        }
        this.f62721OooOoo = drawable;
        boolean z = this.f62723OooOooO;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.f62721OooOoo) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.f62720OooOoOO != null || this.f62722OooOoo0 != null) : this.f62721OooOoo == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f62722OooOoo0;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f62722OooOoo0);
        }
        this.f62722OooOoo0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f62724OooOooo && (drawable2 = this.f62722OooOoo0) != null) {
                drawable2.setBounds(this.f62716OooOo.getLeft(), this.f62716OooOo.getTop(), this.f62716OooOo.getRight(), this.f62716OooOo.getBottom());
            }
        }
        boolean z = false;
        if (!this.f62723OooOooO ? !(this.f62720OooOoOO != null || this.f62722OooOoo0 != null) : this.f62721OooOoo == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        ScrollingTabContainerView scrollingTabContainerView2 = this.f62716OooOo;
        if (scrollingTabContainerView2 != null) {
            removeView(scrollingTabContainerView2);
        }
        this.f62716OooOo = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f62717OooOo0o = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f62720OooOoOO;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f62722OooOoo0;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f62721OooOoo;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f62720OooOoOO;
        boolean z = this.f62723OooOooO;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.f62722OooOoo0 && this.f62724OooOooo) {
            return true;
        }
        return (drawable == this.f62721OooOoo && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
