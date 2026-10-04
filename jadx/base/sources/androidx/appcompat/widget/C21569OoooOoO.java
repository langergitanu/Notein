package androidx.appcompat.widget;

import OooO0oo.C20441OooO00o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.OooOOOO;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: androidx.appcompat.widget.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21569OoooOoO implements InterfaceC21541OooOoO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final CharSequence f63099OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Toolbar f63100OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f63101OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final View f63102OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Drawable f63103OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Drawable f63104OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Drawable f63105OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f63106OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public CharSequence f63107OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final CharSequence f63108OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public Window.Callback f63109OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f63110OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f63111OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public ActionMenuPresenter f63112OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Drawable f63113OooOOOO;

    /* JADX INFO: renamed from: androidx.appcompat.widget.OoooOoO$OooO00o */
    public class OooO00o extends ViewPropertyAnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f63114OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ int f63115OooO0O0;

        public OooO00o(int i) {
            this.f63115OooO0O0 = i;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationCancel(View view) {
            this.f63114OooO00o = true;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationEnd(View view) {
            if (this.f63114OooO00o) {
                return;
            }
            C21569OoooOoO.this.f63100OooO00o.setVisibility(this.f63115OooO0O0);
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationStart(View view) {
            C21569OoooOoO.this.f63100OooO00o.setVisibility(0);
        }
    }

    public C21569OoooOoO(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.f63111OooOOO = 0;
        this.f63100OooO00o = toolbar;
        this.f63107OooO0oo = toolbar.getTitle();
        this.f63099OooO = toolbar.getSubtitle();
        this.f63106OooO0oO = this.f63107OooO0oo != null;
        this.f63104OooO0o = toolbar.getNavigationIcon();
        C21565OoooOO0 c21565OoooOO0OooO0o = C21565OoooOO0.OooO0o(toolbar.getContext(), null, C20441OooO00o.f58279OooO00o, R.attr.actionBarStyle, 0);
        int i = 15;
        this.f63113OooOOOO = c21565OoooOO0OooO0o.OooO0O0(15);
        if (z) {
            TypedArray typedArray = c21565OoooOO0OooO0o.f63093OooO0O0;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f63106OooO0oO = true;
                this.f63107OooO0oo = text;
                if ((this.f63101OooO0O0 & 8) != 0) {
                    Toolbar toolbar2 = this.f63100OooO00o;
                    toolbar2.setTitle(text);
                    if (this.f63106OooO0oO) {
                        ViewCompat.setAccessibilityPaneTitle(toolbar2.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f63099OooO = text2;
                if ((this.f63101OooO0O0 & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableOooO0O0 = c21565OoooOO0OooO0o.OooO0O0(20);
            if (drawableOooO0O0 != null) {
                this.f63105OooO0o0 = drawableOooO0O0;
                OooOo00();
            }
            Drawable drawableOooO0O02 = c21565OoooOO0OooO0o.OooO0O0(17);
            if (drawableOooO0O02 != null) {
                setIcon(drawableOooO0O02);
            }
            if (this.f63104OooO0o == null && (drawable = this.f63113OooOOOO) != null) {
                this.f63104OooO0o = drawable;
                int i2 = this.f63101OooO0O0 & 4;
                Toolbar toolbar3 = this.f63100OooO00o;
                if (i2 != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((Drawable) null);
                }
            }
            OooO(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f63102OooO0OO;
                if (view != null && (this.f63101OooO0O0 & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f63102OooO0OO = viewInflate;
                if (viewInflate != null && (this.f63101OooO0O0 & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                OooO(this.f63101OooO0O0 | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                toolbar.setContentInsetsRelative(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                toolbar.setTitleTextAppearance(toolbar.getContext(), resourceId2);
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                toolbar.setSubtitleTextAppearance(toolbar.getContext(), resourceId3);
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f63113OooOOOO = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f63101OooO0O0 = i;
        }
        c21565OoooOO0OooO0o.OooO0oO();
        if (R.string.abc_action_bar_up_description != this.f63111OooOOO) {
            this.f63111OooOOO = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i3 = this.f63111OooOOO;
                this.f63108OooOO0 = i3 != 0 ? toolbar.getContext().getString(i3) : null;
                OooOOoo();
            }
        }
        this.f63108OooOO0 = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new ViewOnClickListenerC21568OoooOo0(this));
    }

    @Override // androidx.appcompat.widget.InterfaceC21541OooOoO0
    public final void OooO(int i) {
        View view;
        int i2 = this.f63101OooO0O0 ^ i;
        this.f63101OooO0O0 = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    OooOOoo();
                }
                int i3 = this.f63101OooO0O0 & 4;
                Toolbar toolbar = this.f63100OooO00o;
                if (i3 != 0) {
                    Drawable drawable = this.f63104OooO0o;
                    if (drawable == null) {
                        drawable = this.f63113OooOOOO;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                OooOo00();
            }
            int i4 = i2 & 8;
            Toolbar toolbar2 = this.f63100OooO00o;
            if (i4 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.f63107OooO0oo);
                    toolbar2.setSubtitle(this.f63099OooO);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f63102OooO0OO) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC21541OooOoO0
    public final boolean OooO00o() {
        return this.f63100OooO00o.canShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.InterfaceC21541OooOoO0
    public final boolean OooO0O0() {
        return this.f63100OooO00o.showOverflowMenu();
    }

    @Override // androidx.appcompat.widget.InterfaceC21541OooOoO0
    public final boolean OooO0OO() {
        return this.f63100OooO00o.isOverflowMenuShowing();
    }

    @Override // androidx.appcompat.widget.InterfaceC21541OooOoO0
    public final void OooO0Oo(androidx.appcompat.view.menu.OooO oooO, OooOOOO.OooO00o oooO00o) {
        ActionMenuPresenter actionMenuPresenter = this.f63112OooOOO0;
        Toolbar toolbar = this.f63100OooO00o;
        if (actionMenuPresenter == null) {
            ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(toolbar.getContext());
            this.f63112OooOOO0 = actionMenuPresenter2;
            actionMenuPresenter2.f62583OooOooo = R.id.action_menu_presenter;
        }
        ActionMenuPresenter actionMenuPresenter3 = this.f63112OooOOO0;
        actionMenuPresenter3.f62579OooOoOO = oooO00o;
        toolbar.setMenu(oooO, actionMenuPresenter3);
    }

    @Override // androidx.appcompat.widget.InterfaceC21541OooOoO0
    public final void OooO0o() {
        this.f63110OooOO0o = true;
    }

    @Override // androidx.appcompat.widget.InterfaceC21541OooOoO0
    public final boolean OooO0o0() {
        return this.f63100OooO00o.hideOverflowMenu();
    }

    @Override // androidx.appcompat.widget.InterfaceC21541OooOoO0
    public final boolean OooO0oO() {
        return this.f63100OooO00o.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.InterfaceC21541OooOoO0
    public final boolean OooO0oo() {
        return this.f63100OooO00o.hasExpandedActionView();
    }

    @Override // androidx.appcompat.widget.InterfaceC21541OooOoO0
    public final void OooOO0() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC21541OooOoO0
    public final void OooOO0O(boolean z) {
        this.f63100OooO00o.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.InterfaceC21541OooOoO0
    public final void OooOO0o() {
        this.f63100OooO00o.dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.InterfaceC21541OooOoO0
    public final void OooOOO(int i) {
        this.f63100OooO00o.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.InterfaceC21541OooOoO0
    public final void OooOOO0() {
    }

    @Override // androidx.appcompat.widget.InterfaceC21541OooOoO0
    public final int OooOOOO() {
        return this.f63101OooO0O0;
    }

    @Override // androidx.appcompat.widget.InterfaceC21541OooOoO0
    public final void OooOOOo() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC21541OooOoO0
    public final void OooOOo(int i) {
        this.f63105OooO0o0 = i != 0 ? OooO.OooO00o.OooO0OO(this.f63100OooO00o.getContext(), i) : null;
        OooOo00();
    }

    @Override // androidx.appcompat.widget.InterfaceC21541OooOoO0
    public final ViewPropertyAnimatorCompat OooOOo0(int i, long j) {
        return ViewCompat.animate(this.f63100OooO00o).alpha(i == 0 ? 1.0f : 0.0f).setDuration(j).setListener(new OooO00o(i));
    }

    public final void OooOOoo() {
        if ((this.f63101OooO0O0 & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f63108OooOO0);
            Toolbar toolbar = this.f63100OooO00o;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f63111OooOOO);
            } else {
                toolbar.setNavigationContentDescription(this.f63108OooOO0);
            }
        }
    }

    public final void OooOo00() {
        Drawable drawable;
        int i = this.f63101OooO0O0;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f63105OooO0o0) == null) {
            drawable = this.f63103OooO0Oo;
        }
        this.f63100OooO00o.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.InterfaceC21541OooOoO0
    public final void collapseActionView() {
        this.f63100OooO00o.collapseActionView();
    }

    @Override // androidx.appcompat.widget.InterfaceC21541OooOoO0
    public final Context getContext() {
        return this.f63100OooO00o.getContext();
    }

    @Override // androidx.appcompat.widget.InterfaceC21541OooOoO0
    public final CharSequence getTitle() {
        return this.f63100OooO00o.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC21541OooOoO0
    public final void setIcon(int i) {
        setIcon(i != 0 ? OooO.OooO00o.OooO0OO(this.f63100OooO00o.getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC21541OooOoO0
    public final void setWindowCallback(Window.Callback callback) {
        this.f63109OooOO0O = callback;
    }

    @Override // androidx.appcompat.widget.InterfaceC21541OooOoO0
    public final void setWindowTitle(CharSequence charSequence) {
        if (this.f63106OooO0oO) {
            return;
        }
        this.f63107OooO0oo = charSequence;
        if ((this.f63101OooO0O0 & 8) != 0) {
            Toolbar toolbar = this.f63100OooO00o;
            toolbar.setTitle(charSequence);
            if (this.f63106OooO0oO) {
                ViewCompat.setAccessibilityPaneTitle(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC21541OooOoO0
    public final void setIcon(Drawable drawable) {
        this.f63103OooO0Oo = drawable;
        OooOo00();
    }
}
