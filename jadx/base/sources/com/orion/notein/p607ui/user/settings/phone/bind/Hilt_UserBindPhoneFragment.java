package com.orion.notein.p607ui.user.settings.phone.bind;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.o00Oo0;
import com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment;
import o00o0OOO.C25400OooO0Oo;
import o0oOoOo0.InterfaceC31093OooO0O0;
import oO000O0o.OooO00o;
import oO0OOooo.C33162OooO0o0;
import oO0OOooo.C33163OooO0oO;
import oO0Oo0oo.InterfaceC33226OooO0O0;
import oO0OoOO0.C33282OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Hilt_UserBindPhoneFragment extends BaseGetPhoneVerificationFragment implements InterfaceC33226OooO0O0 {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public C33163OooO0oO f79963OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public volatile C33162OooO0o0 f79964OooOooO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f79962OooOoo = false;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Object f79965OooOooo = new Object();

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f79966Oooo000 = false;

    public final void Oooo00O() {
        if (this.f79963OooOoo0 == null) {
            this.f79963OooOoo0 = new C33163OooO0oO(super.getContext(), this);
            this.f79962OooOoo = OooO00o.OooO00o(super.getContext());
        }
    }

    @Override // oO0Oo0oo.InterfaceC33226OooO0O0
    public final Object generatedComponent() {
        if (this.f79964OooOooO == null) {
            synchronized (this.f79965OooOooo) {
                try {
                    if (this.f79964OooOooO == null) {
                        this.f79964OooOooO = new C33162OooO0o0(this);
                    }
                } finally {
                }
            }
        }
        return this.f79964OooOooO.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f79962OooOoo) {
            return null;
        }
        Oooo00O();
        return this.f79963OooOoo0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.OooOOOO
    public final o00Oo0.OooO0O0 getDefaultViewModelProviderFactory() {
        return C33282OooO00o.OooO0O0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Oooo00O();
        if (this.f79966Oooo000) {
            return;
        }
        this.f79966Oooo000 = true;
        ((InterfaceC31093OooO0O0) generatedComponent()).getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new C33163OooO0oO(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        C33163OooO0oO c33163OooO0oO = this.f79963OooOoo0;
        C25400OooO0Oo.OooO00o(c33163OooO0oO == null || C33162OooO0o0.OooO0O0(c33163OooO0oO) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Oooo00O();
        if (this.f79966Oooo000) {
            return;
        }
        this.f79966Oooo000 = true;
        ((InterfaceC31093OooO0O0) generatedComponent()).getClass();
    }
}
