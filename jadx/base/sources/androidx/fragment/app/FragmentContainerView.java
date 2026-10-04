package androidx.fragment.app;

import OooOoo.C20593OooO0Oo;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m80612d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "LoO00ooO/OooOooO;", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "Landroidx/fragment/app/Fragment;", "F", "getFragment", "()Landroidx/fragment/app/Fragment;", "fragment_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ArrayList f64793OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayList f64794OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f64795OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f64796OooOoO0;

    public FragmentContainerView(Context context) {
        super(context);
        this.f64794OooOo0o = new ArrayList();
        this.f64793OooOo = new ArrayList();
        this.f64795OooOoO = true;
    }

    public final void OooO00o(View view) {
        if (this.f64793OooOo.contains(view)) {
            this.f64794OooOo0o.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(child, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets;
        kotlin.jvm.internal.OooOOO0.OooO0oO(insets, "insets");
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(insets);
        kotlin.jvm.internal.OooOOO0.OooO0o(windowInsetsCompat, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f64796OooOoO0;
        if (onApplyWindowInsetsListener != null) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(onApplyWindowInsetsListener);
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            kotlin.jvm.internal.OooOOO0.OooO0o(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            windowInsetsCompatOnApplyWindowInsets = WindowInsetsCompat.toWindowInsetsCompat(windowInsetsOnApplyWindowInsets);
        } else {
            windowInsetsCompatOnApplyWindowInsets = ViewCompat.onApplyWindowInsets(this, windowInsetsCompat);
        }
        kotlin.jvm.internal.OooOOO0.OooO0o(windowInsetsCompatOnApplyWindowInsets, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!windowInsetsCompatOnApplyWindowInsets.isConsumed()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewCompat.dispatchApplyWindowInsets(getChildAt(i), windowInsetsCompatOnApplyWindowInsets);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        if (this.f64795OooOoO) {
            Iterator it = this.f64794OooOo0o.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        kotlin.jvm.internal.OooOOO0.OooO0oO(child, "child");
        if (this.f64795OooOoO) {
            ArrayList arrayList = this.f64794OooOo0o;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        this.f64793OooOo.remove(view);
        if (this.f64794OooOo0o.remove(view)) {
            this.f64795OooOoO = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        ActivityC21897OooOo0 activityC21897OooOo0;
        FragmentManager supportFragmentManager;
        Fragment fragmentOooo000 = FragmentManager.Oooo000(this);
        if (fragmentOooo000 == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activityC21897OooOo0 = null;
                    break;
                }
                if (context instanceof ActivityC21897OooOo0) {
                    activityC21897OooOo0 = (ActivityC21897OooOo0) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activityC21897OooOo0 == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = activityC21897OooOo0.getSupportFragmentManager();
        } else {
            if (!fragmentOooo000.isAdded()) {
                throw new IllegalStateException("The Fragment " + fragmentOooo000 + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = fragmentOooo000.getChildFragmentManager();
        }
        return (F) supportFragmentManager.OooOooO(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                kotlin.jvm.internal.OooOOO0.OooO0o(view, "view");
                OooO00o(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        OooO00o(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View view = getChildAt(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(view, "view");
        OooO00o(view);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        OooO00o(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View view = getChildAt(i4);
            kotlin.jvm.internal.OooOOO0.OooO0o(view, "view");
            OooO00o(view);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View view = getChildAt(i4);
            kotlin.jvm.internal.OooOOO0.OooO0o(view, "view");
            OooO00o(view);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.f64795OooOoO = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        this.f64796OooOoO0 = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        if (view.getParent() == this) {
            this.f64793OooOo.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        this.f64794OooOo0o = new ArrayList();
        this.f64793OooOo = new ArrayList();
        this.f64795OooOoO = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000O0O.OooO00o.f82378OooO0O0, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, FragmentManager fragmentManager) {
        View view;
        super(context, attrs);
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        kotlin.jvm.internal.OooOOO0.OooO0oO(attrs, "attrs");
        this.f64794OooOo0o = new ArrayList();
        this.f64793OooOo = new ArrayList();
        this.f64795OooOoO = true;
        String classAttribute = attrs.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, o000O0O.OooO00o.f82378OooO0O0, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentOooOooO = fragmentManager.OooOooO(id);
        if (classAttribute != null && fragmentOooOooO == null) {
            if (id == -1) {
                throw new IllegalStateException(C20593OooO0Oo.OooO0O0("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            Fragment fragmentOooO00o = fragmentManager.Oooo0O0().OooO00o(context.getClassLoader(), classAttribute);
            kotlin.jvm.internal.OooOOO0.OooO0o(fragmentOooO00o, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            fragmentOooO00o.mFragmentId = id;
            fragmentOooO00o.mContainerId = id;
            fragmentOooO00o.mTag = string;
            fragmentOooO00o.mFragmentManager = fragmentManager;
            fragmentOooO00o.mHost = fragmentManager.f64816OooOo;
            fragmentOooO00o.onInflate(context, attrs, (Bundle) null);
            OooO00o oooO00o = new OooO00o(fragmentManager);
            oooO00o.f65021OooOOo = true;
            fragmentOooO00o.mContainer = this;
            fragmentOooO00o.mInDynamicContainer = true;
            oooO00o.OooO0Oo(getId(), fragmentOooO00o, string, 1);
            oooO00o.OooOO0O();
        }
        for (C21914Oooo0oO c21914Oooo0oO : fragmentManager.f64800OooO0OO.OooO0Oo()) {
            Fragment fragment = c21914Oooo0oO.f65046OooO0OO;
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                c21914Oooo0oO.OooO0O0();
                c21914Oooo0oO.OooOO0O();
            }
        }
    }
}
