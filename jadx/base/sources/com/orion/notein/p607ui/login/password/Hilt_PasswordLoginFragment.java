package com.orion.notein.p607ui.login.password;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.o00Oo0;
import com.orion.notein.p607ui.login.thirdparty.LoginFragment;
import o00o0OOO.C25400OooO0Oo;
import o0OoO0.InterfaceC28515OooOO0;
import oO000O0o.OooO00o;
import oO0OOooo.C33162OooO0o0;
import oO0OOooo.C33163OooO0oO;
import oO0Oo0oo.InterfaceC33226OooO0O0;
import oO0OoOO0.C33282OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Hilt_PasswordLoginFragment extends LoginFragment implements InterfaceC33226OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C33163OooO0oO f72466OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public volatile C33162OooO0o0 f72467OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f72468OooOoO0 = false;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final Object f72469OooOoOO = new Object();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f72470OooOoo0 = false;

    public final void OooOooO() {
        if (this.f72466OooOo == null) {
            this.f72466OooOo = new C33163OooO0oO(super.getContext(), this);
            this.f72468OooOoO0 = OooO00o.OooO00o(super.getContext());
        }
    }

    @Override // oO0Oo0oo.InterfaceC33226OooO0O0
    public final Object generatedComponent() {
        if (this.f72467OooOoO == null) {
            synchronized (this.f72469OooOoOO) {
                try {
                    if (this.f72467OooOoO == null) {
                        this.f72467OooOoO = new C33162OooO0o0(this);
                    }
                } finally {
                }
            }
        }
        return this.f72467OooOoO.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f72468OooOoO0) {
            return null;
        }
        OooOooO();
        return this.f72466OooOo;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.OooOOOO
    public final o00Oo0.OooO0O0 getDefaultViewModelProviderFactory() {
        return C33282OooO00o.OooO0O0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // com.orion.notein.p607ui.login.thirdparty.LoginFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        OooOooO();
        if (this.f72470OooOoo0) {
            return;
        }
        this.f72470OooOoo0 = true;
        ((InterfaceC28515OooOO0) generatedComponent()).getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new C33163OooO0oO(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        C33163OooO0oO c33163OooO0oO = this.f72466OooOo;
        C25400OooO0Oo.OooO00o(c33163OooO0oO == null || C33162OooO0o0.OooO0O0(c33163OooO0oO) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        OooOooO();
        if (this.f72470OooOoo0) {
            return;
        }
        this.f72470OooOoo0 = true;
        ((InterfaceC28515OooOO0) generatedComponent()).getClass();
    }
}
