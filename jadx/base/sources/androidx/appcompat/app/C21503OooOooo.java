package androidx.appcompat.app;

import OooO0oo.C20441OooO00o;
import OooOO0o.AbstractC20443OooO00o;
import OooOO0o.C20446OooO0oO;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.OooO00o;
import androidx.appcompat.view.menu.OooO;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.InterfaceC21541OooOoO0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.app.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21503OooOooo extends androidx.appcompat.app.OooO00o implements ActionBarOverlayLayout.InterfaceC21517OooO0Oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public C21504OooO0Oo f62496OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Context f62497OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Context f62498OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public ActionBarOverlayLayout f62499OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ActionBarContainer f62500OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ActionBarContextView f62501OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public InterfaceC21541OooOoO0 f62502OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final View f62503OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f62504OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public C21504OooO0Oo f62505OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public AppCompatDelegateImpl.C21477OooO0Oo f62506OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f62507OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f62508OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final ArrayList<OooO00o.OooO0O0> f62509OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f62510OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f62511OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f62512OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f62513OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public C20446OooO0oO f62514OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO0OO f62515OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f62516OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f62517OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final OooO00o f62518OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO0O0 f62519OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final AccelerateInterpolator f62495OooOoO0 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final DecelerateInterpolator f62494OooOoO = new DecelerateInterpolator();

    /* JADX INFO: renamed from: androidx.appcompat.app.OooOooo$OooO00o */
    public class OooO00o extends ViewPropertyAnimatorListenerAdapter {
        public OooO00o() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationEnd(View view) {
            View view2;
            C21503OooOooo c21503OooOooo = C21503OooOooo.this;
            if (c21503OooOooo.f62510OooOOOO && (view2 = c21503OooOooo.f62503OooO0oO) != null) {
                view2.setTranslationY(0.0f);
                c21503OooOooo.f62500OooO0Oo.setTranslationY(0.0f);
            }
            c21503OooOooo.f62500OooO0Oo.setVisibility(8);
            c21503OooOooo.f62500OooO0Oo.setTransitioning(false);
            c21503OooOooo.f62514OooOOoo = null;
            AppCompatDelegateImpl.C21477OooO0Oo c21477OooO0Oo = c21503OooOooo.f62506OooOO0O;
            if (c21477OooO0Oo != null) {
                c21477OooO0Oo.OooO0OO(c21503OooOooo.f62505OooOO0);
                c21503OooOooo.f62505OooOO0 = null;
                c21503OooOooo.f62506OooOO0O = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = c21503OooOooo.f62499OooO0OO;
            if (actionBarOverlayLayout != null) {
                ViewCompat.requestApplyInsets(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.OooOooo$OooO0O0 */
    public class OooO0O0 extends ViewPropertyAnimatorListenerAdapter {
        public OooO0O0() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationEnd(View view) {
            C21503OooOooo c21503OooOooo = C21503OooOooo.this;
            c21503OooOooo.f62514OooOOoo = null;
            c21503OooOooo.f62500OooO0Oo.requestLayout();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.OooOooo$OooO0OO */
    public class OooO0OO implements ViewPropertyAnimatorUpdateListener {
        public OooO0OO() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorUpdateListener
        public final void onAnimationUpdate(View view) {
            ((View) C21503OooOooo.this.f62500OooO0Oo.getParent()).invalidate();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.OooOooo$OooO0Oo, reason: case insensitive filesystem */
    public class C21504OooO0Oo extends AbstractC20443OooO00o implements OooO.OooO00o {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final androidx.appcompat.view.menu.OooO f62523OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final Context f62524OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public AppCompatDelegateImpl.C21477OooO0Oo f62525OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public WeakReference<View> f62527OooOoo0;

        public C21504OooO0Oo(Context context, AppCompatDelegateImpl.C21477OooO0Oo c21477OooO0Oo) {
            this.f62524OooOoO0 = context;
            this.f62525OooOoOO = c21477OooO0Oo;
            androidx.appcompat.view.menu.OooO defaultShowAsAction = new androidx.appcompat.view.menu.OooO(context).setDefaultShowAsAction(1);
            this.f62523OooOoO = defaultShowAsAction;
            defaultShowAsAction.setCallback(this);
        }

        @Override // OooOO0o.AbstractC20443OooO00o
        public final void OooO(View view) {
            C21503OooOooo.this.f62501OooO0o.setCustomView(view);
            this.f62527OooOoo0 = new WeakReference<>(view);
        }

        @Override // OooOO0o.AbstractC20443OooO00o
        public final void OooO00o() {
            C21503OooOooo c21503OooOooo = C21503OooOooo.this;
            if (c21503OooOooo.f62496OooO != this) {
                return;
            }
            if (c21503OooOooo.f62511OooOOOo) {
                c21503OooOooo.f62505OooOO0 = this;
                c21503OooOooo.f62506OooOO0O = this.f62525OooOoOO;
            } else {
                this.f62525OooOoOO.OooO0OO(this);
            }
            this.f62525OooOoOO = null;
            c21503OooOooo.OooOOOo(false);
            ActionBarContextView actionBarContextView = c21503OooOooo.f62501OooO0o;
            if (actionBarContextView.f62730Oooo00O == null) {
                actionBarContextView.OooO0oo();
            }
            c21503OooOooo.f62499OooO0OO.setHideOnContentScrollEnabled(c21503OooOooo.f62516OooOo0);
            c21503OooOooo.f62496OooO = null;
        }

        @Override // OooOO0o.AbstractC20443OooO00o
        public final View OooO0O0() {
            WeakReference<View> weakReference = this.f62527OooOoo0;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // OooOO0o.AbstractC20443OooO00o
        public final androidx.appcompat.view.menu.OooO OooO0OO() {
            return this.f62523OooOoO;
        }

        @Override // OooOO0o.AbstractC20443OooO00o
        public final MenuInflater OooO0Oo() {
            return new OooOO0o.OooO0o(this.f62524OooOoO0);
        }

        @Override // OooOO0o.AbstractC20443OooO00o
        public final CharSequence OooO0o() {
            return C21503OooOooo.this.f62501OooO0o.getTitle();
        }

        @Override // OooOO0o.AbstractC20443OooO00o
        public final CharSequence OooO0o0() {
            return C21503OooOooo.this.f62501OooO0o.getSubtitle();
        }

        @Override // OooOO0o.AbstractC20443OooO00o
        public final void OooO0oO() {
            if (C21503OooOooo.this.f62496OooO != this) {
                return;
            }
            androidx.appcompat.view.menu.OooO oooO = this.f62523OooOoO;
            oooO.stopDispatchingItemsChanged();
            try {
                this.f62525OooOoOO.OooO0Oo(this, oooO);
            } finally {
                oooO.startDispatchingItemsChanged();
            }
        }

        @Override // OooOO0o.AbstractC20443OooO00o
        public final boolean OooO0oo() {
            return C21503OooOooo.this.f62501OooO0o.f62737Oooo0oo;
        }

        @Override // OooOO0o.AbstractC20443OooO00o
        public final void OooOO0(int i) {
            OooOO0O(C21503OooOooo.this.f62497OooO00o.getResources().getString(i));
        }

        @Override // OooOO0o.AbstractC20443OooO00o
        public final void OooOO0O(CharSequence charSequence) {
            C21503OooOooo.this.f62501OooO0o.setSubtitle(charSequence);
        }

        @Override // OooOO0o.AbstractC20443OooO00o
        public final void OooOO0o(int i) {
            OooOOO0(C21503OooOooo.this.f62497OooO00o.getResources().getString(i));
        }

        @Override // OooOO0o.AbstractC20443OooO00o
        public final void OooOOO(boolean z) {
            this.f58320OooOo = z;
            C21503OooOooo.this.f62501OooO0o.setTitleOptional(z);
        }

        @Override // OooOO0o.AbstractC20443OooO00o
        public final void OooOOO0(CharSequence charSequence) {
            C21503OooOooo.this.f62501OooO0o.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.menu.OooO.OooO00o
        public final boolean onMenuItemSelected(androidx.appcompat.view.menu.OooO oooO, MenuItem menuItem) {
            AppCompatDelegateImpl.C21477OooO0Oo c21477OooO0Oo = this.f62525OooOoOO;
            if (c21477OooO0Oo != null) {
                return c21477OooO0Oo.f62389OooO00o.OooO00o(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.OooO.OooO00o
        public final void onMenuModeChange(androidx.appcompat.view.menu.OooO oooO) {
            if (this.f62525OooOoOO == null) {
                return;
            }
            OooO0oO();
            ActionMenuPresenter actionMenuPresenter = C21503OooOooo.this.f62501OooO0o.f62882OooOoO;
            if (actionMenuPresenter != null) {
                actionMenuPresenter.OooO0Oo();
            }
        }
    }

    public C21503OooOooo(Activity activity, boolean z) {
        new ArrayList();
        this.f62509OooOOO0 = new ArrayList<>();
        this.f62508OooOOO = 0;
        this.f62510OooOOOO = true;
        this.f62512OooOOo = true;
        this.f62518OooOo0O = new OooO00o();
        this.f62519OooOo0o = new OooO0O0();
        this.f62515OooOo = new OooO0OO();
        View decorView = activity.getWindow().getDecorView();
        OooOOo0(decorView);
        if (z) {
            return;
        }
        this.f62503OooO0oO = decorView.findViewById(R.id.content);
    }

    @Override // androidx.appcompat.app.OooO00o
    public final boolean OooO(int i, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.OooO oooO;
        C21504OooO0Oo c21504OooO0Oo = this.f62496OooO;
        if (c21504OooO0Oo == null || (oooO = c21504OooO0Oo.f62523OooOoO) == null) {
            return false;
        }
        oooO.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return oooO.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.OooO00o
    public final boolean OooO0O0() {
        InterfaceC21541OooOoO0 interfaceC21541OooOoO0 = this.f62502OooO0o0;
        if (interfaceC21541OooOoO0 == null || !interfaceC21541OooOoO0.OooO0oo()) {
            return false;
        }
        this.f62502OooO0o0.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.OooO00o
    public final void OooO0OO(boolean z) {
        if (z == this.f62507OooOO0o) {
            return;
        }
        this.f62507OooOO0o = z;
        ArrayList<OooO00o.OooO0O0> arrayList = this.f62509OooOOO0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).OooO00o();
        }
    }

    @Override // androidx.appcompat.app.OooO00o
    public final int OooO0Oo() {
        return this.f62502OooO0o0.OooOOOO();
    }

    @Override // androidx.appcompat.app.OooO00o
    public final Context OooO0o0() {
        if (this.f62498OooO0O0 == null) {
            TypedValue typedValue = new TypedValue();
            this.f62497OooO00o.getTheme().resolveAttribute(com.orion.notein.global.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f62498OooO0O0 = new ContextThemeWrapper(this.f62497OooO00o, i);
            } else {
                this.f62498OooO0O0 = this.f62497OooO00o;
            }
        }
        return this.f62498OooO0O0;
    }

    @Override // androidx.appcompat.app.OooO00o
    public final void OooO0oO() {
        OooOOo(this.f62497OooO00o.getResources().getBoolean(com.orion.notein.global.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // androidx.appcompat.app.OooO00o
    public final void OooOO0o(boolean z) {
        if (this.f62504OooO0oo) {
            return;
        }
        int i = z ? 4 : 0;
        int iOooOOOO = this.f62502OooO0o0.OooOOOO();
        this.f62504OooO0oo = true;
        this.f62502OooO0o0.OooO((i & 4) | (iOooOOOO & (-5)));
    }

    @Override // androidx.appcompat.app.OooO00o
    public final void OooOOO(CharSequence charSequence) {
        this.f62502OooO0o0.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.OooO00o
    public final void OooOOO0(boolean z) {
        C20446OooO0oO c20446OooO0oO;
        this.f62517OooOo00 = z;
        if (z || (c20446OooO0oO = this.f62514OooOOoo) == null) {
            return;
        }
        c20446OooO0oO.OooO00o();
    }

    @Override // androidx.appcompat.app.OooO00o
    public final AbstractC20443OooO00o OooOOOO(AppCompatDelegateImpl.C21477OooO0Oo c21477OooO0Oo) {
        C21504OooO0Oo c21504OooO0Oo = this.f62496OooO;
        if (c21504OooO0Oo != null) {
            c21504OooO0Oo.OooO00o();
        }
        this.f62499OooO0OO.setHideOnContentScrollEnabled(false);
        this.f62501OooO0o.OooO0oo();
        C21504OooO0Oo c21504OooO0Oo2 = new C21504OooO0Oo(this.f62501OooO0o.getContext(), c21477OooO0Oo);
        androidx.appcompat.view.menu.OooO oooO = c21504OooO0Oo2.f62523OooOoO;
        oooO.stopDispatchingItemsChanged();
        try {
            if (!c21504OooO0Oo2.f62525OooOoOO.f62389OooO00o.OooO0O0(c21504OooO0Oo2, oooO)) {
                return null;
            }
            this.f62496OooO = c21504OooO0Oo2;
            c21504OooO0Oo2.OooO0oO();
            this.f62501OooO0o.OooO0o(c21504OooO0Oo2);
            OooOOOo(true);
            return c21504OooO0Oo2;
        } finally {
            oooO.startDispatchingItemsChanged();
        }
    }

    public final void OooOOOo(boolean z) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatOooOOo0;
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatOooO0o0;
        if (z) {
            if (!this.f62513OooOOo0) {
                this.f62513OooOOo0 = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f62499OooO0OO;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                OooOOoo(false);
            }
        } else if (this.f62513OooOOo0) {
            this.f62513OooOOo0 = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f62499OooO0OO;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            OooOOoo(false);
        }
        if (!this.f62500OooO0Oo.isLaidOut()) {
            if (z) {
                this.f62502OooO0o0.OooOOO(4);
                this.f62501OooO0o.setVisibility(0);
                return;
            } else {
                this.f62502OooO0o0.OooOOO(0);
                this.f62501OooO0o.setVisibility(8);
                return;
            }
        }
        if (z) {
            viewPropertyAnimatorCompatOooO0o0 = this.f62502OooO0o0.OooOOo0(4, 100L);
            viewPropertyAnimatorCompatOooOOo0 = this.f62501OooO0o.OooO0o0(0, 200L);
        } else {
            viewPropertyAnimatorCompatOooOOo0 = this.f62502OooO0o0.OooOOo0(0, 200L);
            viewPropertyAnimatorCompatOooO0o0 = this.f62501OooO0o.OooO0o0(8, 100L);
        }
        C20446OooO0oO c20446OooO0oO = new C20446OooO0oO();
        ArrayList<ViewPropertyAnimatorCompat> arrayList = c20446OooO0oO.f58380OooO00o;
        arrayList.add(viewPropertyAnimatorCompatOooO0o0);
        viewPropertyAnimatorCompatOooOOo0.setStartDelay(viewPropertyAnimatorCompatOooO0o0.getDuration());
        arrayList.add(viewPropertyAnimatorCompatOooOOo0);
        c20446OooO0oO.OooO0O0();
    }

    public final void OooOOo(boolean z) {
        if (z) {
            this.f62500OooO0Oo.setTabContainer(null);
            this.f62502OooO0o0.OooOOO0();
        } else {
            this.f62502OooO0o0.OooOOO0();
            this.f62500OooO0Oo.setTabContainer(null);
        }
        this.f62502OooO0o0.getClass();
        this.f62502OooO0o0.OooOO0O(false);
        this.f62499OooO0OO.setHasNonEmbeddedTabs(false);
    }

    public final void OooOOo0(View view) {
        InterfaceC21541OooOoO0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.orion.notein.global.R.id.decor_content_parent);
        this.f62499OooO0OO = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.orion.notein.global.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC21541OooOoO0) {
            wrapper = (InterfaceC21541OooOoO0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : CloudMetaExtra.DEFINE_NON_PARENT_ID));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f62502OooO0o0 = wrapper;
        this.f62501OooO0o = (ActionBarContextView) view.findViewById(com.orion.notein.global.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.orion.notein.global.R.id.action_bar_container);
        this.f62500OooO0Oo = actionBarContainer;
        InterfaceC21541OooOoO0 interfaceC21541OooOoO0 = this.f62502OooO0o0;
        if (interfaceC21541OooOoO0 == null || this.f62501OooO0o == null || actionBarContainer == null) {
            throw new IllegalStateException(C21503OooOooo.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        this.f62497OooO00o = interfaceC21541OooOoO0.getContext();
        if ((this.f62502OooO0o0.OooOOOO() & 4) != 0) {
            this.f62504OooO0oo = true;
        }
        Context context = this.f62497OooO00o;
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f62502OooO0o0.getClass();
        OooOOo(context.getResources().getBoolean(com.orion.notein.global.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f62497OooO00o.obtainStyledAttributes(null, C20441OooO00o.f58279OooO00o, com.orion.notein.global.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f62499OooO0OO;
            if (!actionBarOverlayLayout2.f62747OooOoo) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f62516OooOo0 = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ViewCompat.setElevation(this.f62500OooO0Oo, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void OooOOoo(boolean z) {
        boolean z2 = this.f62513OooOOo0 || !this.f62511OooOOOo;
        View view = this.f62503OooO0oO;
        OooO0OO oooO0OO = this.f62515OooOo;
        if (!z2) {
            if (this.f62512OooOOo) {
                this.f62512OooOOo = false;
                C20446OooO0oO c20446OooO0oO = this.f62514OooOOoo;
                if (c20446OooO0oO != null) {
                    c20446OooO0oO.OooO00o();
                }
                int i = this.f62508OooOOO;
                OooO00o oooO00o = this.f62518OooOo0O;
                if (i != 0 || (!this.f62517OooOo00 && !z)) {
                    oooO00o.onAnimationEnd(null);
                    return;
                }
                this.f62500OooO0Oo.setAlpha(1.0f);
                this.f62500OooO0Oo.setTransitioning(true);
                C20446OooO0oO c20446OooO0oO2 = new C20446OooO0oO();
                float f = -this.f62500OooO0Oo.getHeight();
                if (z) {
                    this.f62500OooO0Oo.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompatTranslationY = ViewCompat.animate(this.f62500OooO0Oo).translationY(f);
                viewPropertyAnimatorCompatTranslationY.setUpdateListener(oooO0OO);
                boolean z3 = c20446OooO0oO2.f58385OooO0o0;
                ArrayList<ViewPropertyAnimatorCompat> arrayList = c20446OooO0oO2.f58380OooO00o;
                if (!z3) {
                    arrayList.add(viewPropertyAnimatorCompatTranslationY);
                }
                if (this.f62510OooOOOO && view != null) {
                    ViewPropertyAnimatorCompat viewPropertyAnimatorCompatTranslationY2 = ViewCompat.animate(view).translationY(f);
                    if (!c20446OooO0oO2.f58385OooO0o0) {
                        arrayList.add(viewPropertyAnimatorCompatTranslationY2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f62495OooOoO0;
                boolean z4 = c20446OooO0oO2.f58385OooO0o0;
                if (!z4) {
                    c20446OooO0oO2.f58382OooO0OO = accelerateInterpolator;
                }
                if (!z4) {
                    c20446OooO0oO2.f58381OooO0O0 = 250L;
                }
                if (!z4) {
                    c20446OooO0oO2.f58383OooO0Oo = oooO00o;
                }
                this.f62514OooOOoo = c20446OooO0oO2;
                c20446OooO0oO2.OooO0O0();
                return;
            }
            return;
        }
        if (this.f62512OooOOo) {
            return;
        }
        this.f62512OooOOo = true;
        C20446OooO0oO c20446OooO0oO3 = this.f62514OooOOoo;
        if (c20446OooO0oO3 != null) {
            c20446OooO0oO3.OooO00o();
        }
        this.f62500OooO0Oo.setVisibility(0);
        int i2 = this.f62508OooOOO;
        OooO0O0 oooO0O0 = this.f62519OooOo0o;
        if (i2 == 0 && (this.f62517OooOo00 || z)) {
            this.f62500OooO0Oo.setTranslationY(0.0f);
            float f2 = -this.f62500OooO0Oo.getHeight();
            if (z) {
                this.f62500OooO0Oo.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.f62500OooO0Oo.setTranslationY(f2);
            C20446OooO0oO c20446OooO0oO4 = new C20446OooO0oO();
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatTranslationY3 = ViewCompat.animate(this.f62500OooO0Oo).translationY(0.0f);
            viewPropertyAnimatorCompatTranslationY3.setUpdateListener(oooO0OO);
            boolean z5 = c20446OooO0oO4.f58385OooO0o0;
            ArrayList<ViewPropertyAnimatorCompat> arrayList2 = c20446OooO0oO4.f58380OooO00o;
            if (!z5) {
                arrayList2.add(viewPropertyAnimatorCompatTranslationY3);
            }
            if (this.f62510OooOOOO && view != null) {
                view.setTranslationY(f2);
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompatTranslationY4 = ViewCompat.animate(view).translationY(0.0f);
                if (!c20446OooO0oO4.f58385OooO0o0) {
                    arrayList2.add(viewPropertyAnimatorCompatTranslationY4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f62494OooOoO;
            boolean z6 = c20446OooO0oO4.f58385OooO0o0;
            if (!z6) {
                c20446OooO0oO4.f58382OooO0OO = decelerateInterpolator;
            }
            if (!z6) {
                c20446OooO0oO4.f58381OooO0O0 = 250L;
            }
            if (!z6) {
                c20446OooO0oO4.f58383OooO0Oo = oooO0O0;
            }
            this.f62514OooOOoo = c20446OooO0oO4;
            c20446OooO0oO4.OooO0O0();
        } else {
            this.f62500OooO0Oo.setAlpha(1.0f);
            this.f62500OooO0Oo.setTranslationY(0.0f);
            if (this.f62510OooOOOO && view != null) {
                view.setTranslationY(0.0f);
            }
            oooO0O0.onAnimationEnd(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f62499OooO0OO;
        if (actionBarOverlayLayout != null) {
            ViewCompat.requestApplyInsets(actionBarOverlayLayout);
        }
    }

    public C21503OooOooo(Dialog dialog) {
        new ArrayList();
        this.f62509OooOOO0 = new ArrayList<>();
        this.f62508OooOOO = 0;
        this.f62510OooOOOO = true;
        this.f62512OooOOo = true;
        this.f62518OooOo0O = new OooO00o();
        this.f62519OooOo0o = new OooO0O0();
        this.f62515OooOo = new OooO0OO();
        OooOOo0(dialog.getWindow().getDecorView());
    }
}
