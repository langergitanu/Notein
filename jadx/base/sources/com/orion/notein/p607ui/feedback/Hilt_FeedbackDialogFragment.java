package com.orion.notein.p607ui.feedback;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.o00Oo0;
import com.orion.notein.p607ui.BaseDialogFragment;
import o00o0OOO.C25400OooO0Oo;
import o0Oo0oO0.InterfaceC28294OooO0o0;
import oO000O0o.OooO00o;
import oO0OOooo.C33162OooO0o0;
import oO0OOooo.C33163OooO0oO;
import oO0Oo0oo.InterfaceC33226OooO0O0;
import oO0OoOO0.C33282OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Hilt_FeedbackDialogFragment extends BaseDialogFragment implements InterfaceC33226OooO0O0 {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C33163OooO0oO f71842OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public volatile C33162OooO0o0 f71843OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f71844OooOoo0 = false;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final Object f71845OooOooO = new Object();

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f71846OooOooo = false;

    public final void Oooo00O() {
        if (this.f71842OooOoOO == null) {
            this.f71842OooOoOO = new C33163OooO0oO(super.getContext(), this);
            this.f71844OooOoo0 = OooO00o.OooO00o(super.getContext());
        }
    }

    @Override // oO0Oo0oo.InterfaceC33226OooO0O0
    public final Object generatedComponent() {
        if (this.f71843OooOoo == null) {
            synchronized (this.f71845OooOooO) {
                try {
                    if (this.f71843OooOoo == null) {
                        this.f71843OooOoo = new C33162OooO0o0(this);
                    }
                } finally {
                }
            }
        }
        return this.f71843OooOoo.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f71844OooOoo0) {
            return null;
        }
        Oooo00O();
        return this.f71842OooOoOO;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.OooOOOO
    public final o00Oo0.OooO0O0 getDefaultViewModelProviderFactory() {
        return C33282OooO00o.OooO0O0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Oooo00O();
        if (this.f71846OooOooo) {
            return;
        }
        this.f71846OooOooo = true;
        ((InterfaceC28294OooO0o0) generatedComponent()).getClass();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new C33163OooO0oO(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        C33163OooO0oO c33163OooO0oO = this.f71842OooOoOO;
        C25400OooO0Oo.OooO00o(c33163OooO0oO == null || C33162OooO0o0.OooO0O0(c33163OooO0oO) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Oooo00O();
        if (this.f71846OooOooo) {
            return;
        }
        this.f71846OooOooo = true;
        ((InterfaceC28294OooO0o0) generatedComponent()).getClass();
    }
}
