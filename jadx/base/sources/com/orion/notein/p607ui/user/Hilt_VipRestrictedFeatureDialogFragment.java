package com.orion.notein.p607ui.user;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.o00Oo0;
import o00o0OOO.C25400OooO0Oo;
import o0oOo0.InterfaceC30928OooOOoo;
import oO000O0o.OooO00o;
import oO0OOooo.C33162OooO0o0;
import oO0OOooo.C33163OooO0oO;
import oO0Oo0oo.InterfaceC33226OooO0O0;
import oO0OoOO0.C33282OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Hilt_VipRestrictedFeatureDialogFragment extends DialogFragment implements InterfaceC33226OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f79626OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C33163OooO0oO f79627OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final Object f79628OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public volatile C33162OooO0o0 f79629OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f79630OooOoOO;

    public Hilt_VipRestrictedFeatureDialogFragment() {
        this.f79626OooOo = false;
        this.f79628OooOoO = new Object();
        this.f79630OooOoOO = false;
    }

    public final void OooOoO() {
        if (this.f79627OooOo0o == null) {
            this.f79627OooOo0o = new C33163OooO0oO(super.getContext(), this);
            this.f79626OooOo = OooO00o.OooO00o(super.getContext());
        }
    }

    @Override // oO0Oo0oo.InterfaceC33226OooO0O0
    public final Object generatedComponent() {
        if (this.f79629OooOoO0 == null) {
            synchronized (this.f79628OooOoO) {
                try {
                    if (this.f79629OooOoO0 == null) {
                        this.f79629OooOoO0 = new C33162OooO0o0(this);
                    }
                } finally {
                }
            }
        }
        return this.f79629OooOoO0.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f79626OooOo) {
            return null;
        }
        OooOoO();
        return this.f79627OooOo0o;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.OooOOOO
    public final o00Oo0.OooO0O0 getDefaultViewModelProviderFactory() {
        return C33282OooO00o.OooO0O0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        OooOoO();
        if (this.f79630OooOoOO) {
            return;
        }
        this.f79630OooOoOO = true;
        ((InterfaceC30928OooOOoo) generatedComponent()).getClass();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new C33163OooO0oO(layoutInflaterOnGetLayoutInflater, this));
    }

    public Hilt_VipRestrictedFeatureDialogFragment(int i) {
        super(i);
        this.f79626OooOo = false;
        this.f79628OooOoO = new Object();
        this.f79630OooOoOO = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        C33163OooO0oO c33163OooO0oO = this.f79627OooOo0o;
        C25400OooO0Oo.OooO00o(c33163OooO0oO == null || C33162OooO0o0.OooO0O0(c33163OooO0oO) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        OooOoO();
        if (this.f79630OooOoOO) {
            return;
        }
        this.f79630OooOoOO = true;
        ((InterfaceC30928OooOOoo) generatedComponent()).getClass();
    }
}
