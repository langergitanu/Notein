package OooOO0o;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.OooO;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuPresenter;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: OooOO0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20444OooO0Oo extends AbstractC20443OooO00o implements OooO.OooO00o {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ActionBarContextView f58328OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Context f58329OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public AppCompatDelegateImpl.C21477OooO0Oo f58330OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f58331OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public WeakReference<View> f58332OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public OooO f58333OooOooO;

    @Override // OooOO0o.AbstractC20443OooO00o
    public final void OooO(View view) {
        this.f58328OooOoO.setCustomView(view);
        this.f58332OooOoo0 = view != null ? new WeakReference<>(view) : null;
    }

    @Override // OooOO0o.AbstractC20443OooO00o
    public final void OooO00o() {
        if (this.f58331OooOoo) {
            return;
        }
        this.f58331OooOoo = true;
        this.f58330OooOoOO.OooO0OO(this);
    }

    @Override // OooOO0o.AbstractC20443OooO00o
    public final View OooO0O0() {
        WeakReference<View> weakReference = this.f58332OooOoo0;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // OooOO0o.AbstractC20443OooO00o
    public final OooO OooO0OO() {
        return this.f58333OooOooO;
    }

    @Override // OooOO0o.AbstractC20443OooO00o
    public final MenuInflater OooO0Oo() {
        return new OooO0o(this.f58328OooOoO.getContext());
    }

    @Override // OooOO0o.AbstractC20443OooO00o
    public final CharSequence OooO0o() {
        return this.f58328OooOoO.getTitle();
    }

    @Override // OooOO0o.AbstractC20443OooO00o
    public final CharSequence OooO0o0() {
        return this.f58328OooOoO.getSubtitle();
    }

    @Override // OooOO0o.AbstractC20443OooO00o
    public final void OooO0oO() {
        this.f58330OooOoOO.OooO0Oo(this, this.f58333OooOooO);
    }

    @Override // OooOO0o.AbstractC20443OooO00o
    public final boolean OooO0oo() {
        return this.f58328OooOoO.f62737Oooo0oo;
    }

    @Override // OooOO0o.AbstractC20443OooO00o
    public final void OooOO0(int i) {
        OooOO0O(this.f58329OooOoO0.getString(i));
    }

    @Override // OooOO0o.AbstractC20443OooO00o
    public final void OooOO0O(CharSequence charSequence) {
        this.f58328OooOoO.setSubtitle(charSequence);
    }

    @Override // OooOO0o.AbstractC20443OooO00o
    public final void OooOO0o(int i) {
        OooOOO0(this.f58329OooOoO0.getString(i));
    }

    @Override // OooOO0o.AbstractC20443OooO00o
    public final void OooOOO(boolean z) {
        this.f58320OooOo = z;
        this.f58328OooOoO.setTitleOptional(z);
    }

    @Override // OooOO0o.AbstractC20443OooO00o
    public final void OooOOO0(CharSequence charSequence) {
        this.f58328OooOoO.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.menu.OooO.OooO00o
    public final boolean onMenuItemSelected(OooO oooO, MenuItem menuItem) {
        return this.f58330OooOoOO.f62389OooO00o.OooO00o(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.OooO.OooO00o
    public final void onMenuModeChange(OooO oooO) {
        OooO0oO();
        ActionMenuPresenter actionMenuPresenter = this.f58328OooOoO.f62882OooOoO;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.OooO0Oo();
        }
    }
}
