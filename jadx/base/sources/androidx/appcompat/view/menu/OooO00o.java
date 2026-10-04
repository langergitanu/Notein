package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.internal.view.SupportMenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements SupportMenuItem {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Context f62559OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public CharSequence f62560OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public CharSequence f62561OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Intent f62562OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public char f62563OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public char f62564OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f62565OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f62566OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Drawable f62567OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public CharSequence f62568OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public CharSequence f62569OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public ColorStateList f62570OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f62571OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public PorterDuff.Mode f62572OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f62573OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f62574OooOOOo;

    public final void OooO00o() {
        Drawable drawable = this.f62567OooO0oo;
        if (drawable != null) {
            if (this.f62571OooOOO || this.f62573OooOOOO) {
                Drawable drawableWrap = DrawableCompat.wrap(drawable);
                this.f62567OooO0oo = drawableWrap;
                Drawable drawableMutate = drawableWrap.mutate();
                this.f62567OooO0oo = drawableMutate;
                if (this.f62571OooOOO) {
                    DrawableCompat.setTintList(drawableMutate, this.f62570OooOO0o);
                }
                if (this.f62573OooOOOO) {
                    DrawableCompat.setTintMode(this.f62567OooO0oo, this.f62572OooOOO0);
                }
            }
        }
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f62566OooO0oO;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f62564OooO0o;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f62568OooOO0;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f62567OooO0oo;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f62570OooOO0o;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f62572OooOOO0;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f62562OooO0OO;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f62565OooO0o0;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f62563OooO0Oo;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final androidx.core.view.ActionProvider getSupportActionProvider() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f62560OooO00o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f62561OooO0O0;
        return charSequence != null ? charSequence : this.f62560OooO00o;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f62569OooOO0O;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f62574OooOOOo & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f62574OooOOOo & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f62574OooOOOo & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f62574OooOOOo & 8) == 0;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final boolean requiresActionButton() {
        return true;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final boolean requiresOverflow() {
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f62564OooO0o = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f62574OooOOOo = (z ? 1 : 0) | (this.f62574OooOOOo & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f62574OooOOOo = (z ? 2 : 0) | (this.f62574OooOOOo & (-3));
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f62568OooOO0 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f62574OooOOOo = (z ? 16 : 0) | (this.f62574OooOOOo & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f62567OooO0oo = drawable;
        OooO00o();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f62570OooOO0o = colorStateList;
        this.f62571OooOOO = true;
        OooO00o();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f62572OooOOO0 = mode;
        this.f62573OooOOOO = true;
        OooO00o();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f62562OooO0OO = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f62563OooO0Oo = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f62563OooO0Oo = c;
        this.f62564OooO0o = Character.toLowerCase(c2);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final SupportMenuItem setSupportActionProvider(androidx.core.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f62560OooO00o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f62561OooO0O0 = charSequence;
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f62569OooOO0O = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f62574OooOOOo = (this.f62574OooOOOo & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f62564OooO0o = Character.toLowerCase(c);
        this.f62566OooO0oO = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.f62568OooOO0 = charSequence;
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f62563OooO0Oo = c;
        this.f62565OooO0o0 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f62560OooO00o = this.f62559OooO.getResources().getString(i);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.f62569OooOO0O = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f62567OooO0oo = ContextCompat.getDrawable(this.f62559OooO, i);
        OooO00o();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f62563OooO0Oo = c;
        this.f62565OooO0o0 = KeyEvent.normalizeMetaState(i);
        this.f62564OooO0o = Character.toLowerCase(c2);
        this.f62566OooO0oO = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
