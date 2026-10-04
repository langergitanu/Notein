package com.orion.notein.p607ui.settings.page;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.o00Oo0;
import o00o0OOO.C25400OooO0Oo;
import o0oOooOO.InterfaceC31153OooO0O0;
import oO000O0o.OooO00o;
import oO0OOooo.C33162OooO0o0;
import oO0OOooo.C33163OooO0oO;
import oO0Oo0oo.InterfaceC33226OooO0O0;
import oO0OoOO0.C33282OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Hilt_GlobalPdfQuoteSettingFragment<T> extends BasePageOptionFragment<T> implements InterfaceC33226OooO0O0 {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C33163OooO0oO f79198OooOoO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public volatile C33162OooO0o0 f79201OooOoo0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f79199OooOoOO = false;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final Object f79200OooOoo = new Object();

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f79202OooOooO = false;

    public final void OooOoo() {
        if (this.f79198OooOoO == null) {
            this.f79198OooOoO = new C33163OooO0oO(super.getContext(), this);
            this.f79199OooOoOO = OooO00o.OooO00o(super.getContext());
        }
    }

    @Override // oO0Oo0oo.InterfaceC33226OooO0O0
    public final Object generatedComponent() {
        if (this.f79201OooOoo0 == null) {
            synchronized (this.f79200OooOoo) {
                try {
                    if (this.f79201OooOoo0 == null) {
                        this.f79201OooOoo0 = new C33162OooO0o0(this);
                    }
                } finally {
                }
            }
        }
        return this.f79201OooOoo0.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f79199OooOoOO) {
            return null;
        }
        OooOoo();
        return this.f79198OooOoO;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.OooOOOO
    public final o00Oo0.OooO0O0 getDefaultViewModelProviderFactory() {
        return C33282OooO00o.OooO0O0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        OooOoo();
        if (this.f79202OooOooO) {
            return;
        }
        this.f79202OooOooO = true;
        ((InterfaceC31153OooO0O0) generatedComponent()).getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new C33163OooO0oO(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        C33163OooO0oO c33163OooO0oO = this.f79198OooOoO;
        C25400OooO0Oo.OooO00o(c33163OooO0oO == null || C33162OooO0o0.OooO0O0(c33163OooO0oO) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        OooOoo();
        if (this.f79202OooOooO) {
            return;
        }
        this.f79202OooOooO = true;
        ((InterfaceC31153OooO0O0) generatedComponent()).getClass();
    }
}
