package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemC21510OooOO0o extends androidx.appcompat.view.menu.OooO0OO implements MenuItem {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SupportMenuItem f62670OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Method f62671OooO0o0;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.OooOO0o$OooO00o */
    public class OooO00o extends ActionProvider implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public ActionProvider.VisibilityListener f62672OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final android.view.ActionProvider f62673OooO0O0;

        public OooO00o(Context context, android.view.ActionProvider actionProvider) {
            super(context);
            this.f62673OooO0O0 = actionProvider;
        }

        @Override // androidx.core.view.ActionProvider
        public final boolean hasSubMenu() {
            return this.f62673OooO0O0.hasSubMenu();
        }

        @Override // androidx.core.view.ActionProvider
        public final boolean isVisible() {
            return this.f62673OooO0O0.isVisible();
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public final void onActionProviderVisibilityChanged(boolean z) {
            ActionProvider.VisibilityListener visibilityListener = this.f62672OooO00o;
            if (visibilityListener != null) {
                visibilityListener.onActionProviderVisibilityChanged(z);
            }
        }

        @Override // androidx.core.view.ActionProvider
        public final View onCreateActionView(MenuItem menuItem) {
            return this.f62673OooO0O0.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.ActionProvider
        public final boolean onPerformDefaultAction() {
            return this.f62673OooO0O0.onPerformDefaultAction();
        }

        @Override // androidx.core.view.ActionProvider
        public final void onPrepareSubMenu(SubMenu subMenu) {
            this.f62673OooO0O0.onPrepareSubMenu(MenuItemC21510OooOO0o.this.OooO0O0(subMenu));
        }

        @Override // androidx.core.view.ActionProvider
        public final boolean overridesItemVisibility() {
            return this.f62673OooO0O0.overridesItemVisibility();
        }

        @Override // androidx.core.view.ActionProvider
        public final void refreshVisibility() {
            this.f62673OooO0O0.refreshVisibility();
        }

        @Override // androidx.core.view.ActionProvider
        public final void setVisibilityListener(ActionProvider.VisibilityListener visibilityListener) {
            this.f62672OooO00o = visibilityListener;
            this.f62673OooO0O0.setVisibilityListener(visibilityListener != null ? this : null);
        }

        @Override // androidx.core.view.ActionProvider
        public final View onCreateActionView() {
            return this.f62673OooO0O0.onCreateActionView();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.OooOO0o$OooO0O0 */
    public static class OooO0O0 extends FrameLayout implements OooOO0o.OooO0O0 {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final CollapsibleActionView f62675OooOo0o;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(View view) {
            super(view.getContext());
            this.f62675OooOo0o = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // OooOO0o.OooO0O0
        public final void OooO00o() {
            this.f62675OooOo0o.onActionViewCollapsed();
        }

        @Override // OooOO0o.OooO0O0
        public final void OooO0O0() {
            this.f62675OooOo0o.onActionViewExpanded();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.OooOO0o$OooO0OO */
    public class OooO0OO implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f62676OooO00o;

        public OooO0OO(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f62676OooO00o = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f62676OooO00o.onMenuItemActionCollapse(MenuItemC21510OooOO0o.this.OooO00o(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f62676OooO00o.onMenuItemActionExpand(MenuItemC21510OooOO0o.this.OooO00o(menuItem));
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.OooOO0o$OooO0Oo, reason: case insensitive filesystem */
    public class MenuItemOnMenuItemClickListenerC21511OooO0Oo implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f62678OooO00o;

        public MenuItemOnMenuItemClickListenerC21511OooO0Oo(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f62678OooO00o = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f62678OooO00o.onMenuItemClick(MenuItemC21510OooOO0o.this.OooO00o(menuItem));
        }
    }

    public MenuItemC21510OooOO0o(Context context, SupportMenuItem supportMenuItem) {
        super(context);
        if (supportMenuItem == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f62670OooO0Oo = supportMenuItem;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f62670OooO0Oo.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f62670OooO0Oo.expandActionView();
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
        androidx.core.view.ActionProvider supportActionProvider = this.f62670OooO0Oo.getSupportActionProvider();
        if (supportActionProvider instanceof OooO00o) {
            return ((OooO00o) supportActionProvider).f62673OooO0O0;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f62670OooO0Oo.getActionView();
        return actionView instanceof OooO0O0 ? (View) ((OooO0O0) actionView).f62675OooOo0o : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f62670OooO0Oo.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f62670OooO0Oo.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f62670OooO0Oo.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f62670OooO0Oo.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f62670OooO0Oo.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f62670OooO0Oo.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f62670OooO0Oo.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f62670OooO0Oo.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f62670OooO0Oo.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f62670OooO0Oo.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f62670OooO0Oo.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f62670OooO0Oo.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f62670OooO0Oo.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return OooO0O0(this.f62670OooO0Oo.getSubMenu());
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f62670OooO0Oo.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f62670OooO0Oo.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f62670OooO0Oo.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f62670OooO0Oo.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f62670OooO0Oo.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f62670OooO0Oo.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f62670OooO0Oo.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f62670OooO0Oo.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f62670OooO0Oo.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        OooO00o oooO00o = new OooO00o(this.f62584OooO00o, actionProvider);
        if (actionProvider == null) {
            oooO00o = null;
        }
        this.f62670OooO0Oo.setSupportActionProvider(oooO00o);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new OooO0O0(view);
        }
        this.f62670OooO0Oo.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f62670OooO0Oo.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f62670OooO0Oo.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f62670OooO0Oo.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f62670OooO0Oo.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f62670OooO0Oo.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f62670OooO0Oo.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f62670OooO0Oo.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f62670OooO0Oo.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f62670OooO0Oo.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f62670OooO0Oo.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f62670OooO0Oo.setOnActionExpandListener(onActionExpandListener != null ? new OooO0OO(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f62670OooO0Oo.setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItemOnMenuItemClickListenerC21511OooO0Oo(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f62670OooO0Oo.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.f62670OooO0Oo.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.f62670OooO0Oo.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f62670OooO0Oo.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f62670OooO0Oo.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f62670OooO0Oo.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        return this.f62670OooO0Oo.setVisible(z);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f62670OooO0Oo.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f62670OooO0Oo.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f62670OooO0Oo.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f62670OooO0Oo.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f62670OooO0Oo.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        SupportMenuItem supportMenuItem = this.f62670OooO0Oo;
        supportMenuItem.setActionView(i);
        View actionView = supportMenuItem.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            supportMenuItem.setActionView(new OooO0O0(actionView));
        }
        return this;
    }
}
