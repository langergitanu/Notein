package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O implements SupportMenuItem {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f62640OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f62641OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f62642OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f62643OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public CharSequence f62644OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public CharSequence f62645OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Intent f62646OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public char f62647OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public char f62648OooOO0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Drawable f62650OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final OooO f62651OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public OooOo00 f62653OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f62654OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public CharSequence f62655OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public CharSequence f62656OooOOo0;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public View f62663OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f62664OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public ActionProvider f62665OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f62667OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f62668OooOooO;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f62639OooO = 4096;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f62649OooOO0O = 4096;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f62652OooOOO0 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public ColorStateList f62657OooOOoo = null;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public PorterDuff.Mode f62660OooOo00 = null;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f62659OooOo0 = false;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f62661OooOo0O = false;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f62662OooOo0o = false;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f62658OooOo = 16;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f62666OooOoo = false;

    public class OooO00o implements ActionProvider.VisibilityListener {
        public OooO00o() {
        }

        @Override // androidx.core.view.ActionProvider.VisibilityListener
        public final void onActionProviderVisibilityChanged(boolean z) {
            OooOO0O oooOO0O = OooOO0O.this;
            oooOO0O.f62651OooOOO.onItemVisibleChanged(oooOO0O);
        }
    }

    public OooOO0O(OooO oooO, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f62651OooOOO = oooO;
        this.f62640OooO00o = i2;
        this.f62641OooO0O0 = i;
        this.f62642OooO0OO = i3;
        this.f62643OooO0Oo = i4;
        this.f62645OooO0o0 = charSequence;
        this.f62664OooOoO0 = i5;
    }

    public static void OooO00o(StringBuilder sb, int i, String str, int i2) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    public final Drawable OooO0O0(Drawable drawable) {
        if (drawable != null && this.f62662OooOo0o && (this.f62659OooOo0 || this.f62661OooOo0O)) {
            drawable = DrawableCompat.wrap(drawable).mutate();
            if (this.f62659OooOo0) {
                DrawableCompat.setTintList(drawable, this.f62657OooOOoo);
            }
            if (this.f62661OooOo0O) {
                DrawableCompat.setTintMode(drawable, this.f62660OooOo00);
            }
            this.f62662OooOo0o = false;
        }
        return drawable;
    }

    public final boolean OooO0OO() {
        ActionProvider actionProvider;
        if ((this.f62664OooOoO0 & 8) != 0) {
            if (this.f62663OooOoO == null && (actionProvider = this.f62665OooOoOO) != null) {
                this.f62663OooOoO = actionProvider.onCreateActionView(this);
            }
            if (this.f62663OooOoO != null) {
                return true;
            }
        }
        return false;
    }

    public final void OooO0Oo(boolean z) {
        this.f62658OooOo = (z ? 4 : 0) | (this.f62658OooOo & (-5));
    }

    public final void OooO0o0(boolean z) {
        if (z) {
            this.f62658OooOo |= 32;
        } else {
            this.f62658OooOo &= -33;
        }
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f62664OooOoO0 & 8) == 0) {
            return false;
        }
        if (this.f62663OooOoO == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f62667OooOoo0;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f62651OooOOO.collapseItemActionView(this);
        }
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final boolean expandActionView() {
        if (!OooO0OO()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f62667OooOoo0;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f62651OooOOO.expandItemActionView(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final View getActionView() {
        View view = this.f62663OooOoO;
        if (view != null) {
            return view;
        }
        ActionProvider actionProvider = this.f62665OooOoOO;
        if (actionProvider == null) {
            return null;
        }
        View viewOnCreateActionView = actionProvider.onCreateActionView(this);
        this.f62663OooOoO = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f62649OooOO0O;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f62648OooOO0;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f62656OooOOo0;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f62641OooO0O0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f62650OooOO0o;
        if (drawable != null) {
            return OooO0O0(drawable);
        }
        if (this.f62652OooOOO0 == 0) {
            return null;
        }
        Drawable drawableOooO0OO = OooO.OooO00o.OooO0OO(this.f62651OooOOO.getContext(), this.f62652OooOOO0);
        this.f62652OooOOO0 = 0;
        this.f62650OooOO0o = drawableOooO0OO;
        return OooO0O0(drawableOooO0OO);
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f62657OooOOoo;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f62660OooOo00;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f62646OooO0oO;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f62640OooO00o;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f62668OooOooO;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f62639OooO;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f62647OooO0oo;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f62642OooO0OO;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f62653OooOOOO;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final ActionProvider getSupportActionProvider() {
        return this.f62665OooOoOO;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f62645OooO0o0;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f62644OooO0o;
        return charSequence != null ? charSequence : this.f62645OooO0o0;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f62655OooOOo;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f62653OooOOOO != null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f62666OooOoo;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f62658OooOo & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f62658OooOo & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f62658OooOo & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProvider actionProvider = this.f62665OooOoOO;
        return (actionProvider == null || !actionProvider.overridesItemVisibility()) ? (this.f62658OooOo & 8) == 0 : (this.f62658OooOo & 8) == 0 && this.f62665OooOoOO.isVisible();
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final boolean requiresActionButton() {
        return (this.f62664OooOoO0 & 2) == 2;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final boolean requiresOverflow() {
        return (requiresActionButton() || (this.f62664OooOoO0 & 1) == 1) ? false : true;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f62663OooOoO = view;
        this.f62665OooOoOO = null;
        if (view != null && view.getId() == -1 && (i = this.f62640OooO00o) > 0) {
            view.setId(i);
        }
        this.f62651OooOOO.onItemActionRequestChanged(this);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f62648OooOO0 == c) {
            return this;
        }
        this.f62648OooOO0 = Character.toLowerCase(c);
        this.f62651OooOOO.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f62658OooOo;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f62658OooOo = i2;
        if (i != i2) {
            this.f62651OooOOO.onItemsChanged(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.f62658OooOo;
        if ((i & 4) != 0) {
            this.f62651OooOOO.setExclusiveItemChecked(this);
            return this;
        }
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.f62658OooOo = i2;
        if (i != i2) {
            this.f62651OooOOO.onItemsChanged(false);
        }
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f62658OooOo |= 16;
        } else {
            this.f62658OooOo &= -17;
        }
        this.f62651OooOOO.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f62652OooOOO0 = 0;
        this.f62650OooOO0o = drawable;
        this.f62662OooOo0o = true;
        this.f62651OooOOO.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f62657OooOOoo = colorStateList;
        this.f62659OooOo0 = true;
        this.f62662OooOo0o = true;
        this.f62651OooOOO.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f62660OooOo00 = mode;
        this.f62661OooOo0O = true;
        this.f62662OooOo0o = true;
        this.f62651OooOOO.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f62646OooO0oO = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f62647OooO0oo == c) {
            return this;
        }
        this.f62647OooO0oo = c;
        this.f62651OooOOO.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f62667OooOoo0 = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f62654OooOOOo = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f62647OooO0oo = c;
        this.f62648OooOO0 = Character.toLowerCase(c2);
        this.f62651OooOOO.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f62664OooOoO0 = i;
        this.f62651OooOOO.onItemActionRequestChanged(this);
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final SupportMenuItem setSupportActionProvider(ActionProvider actionProvider) {
        ActionProvider actionProvider2 = this.f62665OooOoOO;
        if (actionProvider2 != null) {
            actionProvider2.reset();
        }
        this.f62663OooOoO = null;
        this.f62665OooOoOO = actionProvider;
        this.f62651OooOOO.onItemsChanged(true);
        ActionProvider actionProvider3 = this.f62665OooOoOO;
        if (actionProvider3 != null) {
            actionProvider3.setVisibilityListener(new OooO00o());
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f62645OooO0o0 = charSequence;
        this.f62651OooOOO.onItemsChanged(false);
        OooOo00 oooOo00 = this.f62653OooOOOO;
        if (oooOo00 != null) {
            oooOo00.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f62644OooO0o = charSequence;
        this.f62651OooOOO.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.f62658OooOo;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f62658OooOo = i2;
        if (i != i2) {
            this.f62651OooOOO.onItemVisibleChanged(this);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f62645OooO0o0;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.f62656OooOOo0 = charSequence;
        this.f62651OooOOO.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.f62655OooOOo = charSequence;
        this.f62651OooOOO.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f62648OooOO0 == c && this.f62649OooOO0O == i) {
            return this;
        }
        this.f62648OooOO0 = Character.toLowerCase(c);
        this.f62649OooOO0O = KeyEvent.normalizeMetaState(i);
        this.f62651OooOOO.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f62647OooO0oo == c && this.f62639OooO == i) {
            return this;
        }
        this.f62647OooO0oo = c;
        this.f62639OooO = KeyEvent.normalizeMetaState(i);
        this.f62651OooOOO.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f62647OooO0oo = c;
        this.f62639OooO = KeyEvent.normalizeMetaState(i);
        this.f62648OooOO0 = Character.toLowerCase(c2);
        this.f62649OooOO0O = KeyEvent.normalizeMetaState(i2);
        this.f62651OooOOO.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f62650OooOO0o = null;
        this.f62652OooOOO0 = i;
        this.f62662OooOo0o = true;
        this.f62651OooOOO.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f62651OooOOO.getContext().getString(i));
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f62651OooOOO.getContext();
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f62663OooOoO = viewInflate;
        this.f62665OooOoOO = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f62640OooO00o) > 0) {
            viewInflate.setId(i2);
        }
        this.f62651OooOOO.onItemActionRequestChanged(this);
        return this;
    }
}
