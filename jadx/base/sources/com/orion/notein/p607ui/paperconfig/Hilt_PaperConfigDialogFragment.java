package com.orion.notein.p607ui.paperconfig;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.o00Oo0;
import com.orion.notein.p607ui.RoundBottomSheetDialogFragment;
import o00o0OOO.C25400OooO0Oo;
import o0o0OOO.InterfaceC30501OoooO;
import oO000O0o.OooO00o;
import oO0OOooo.C33162OooO0o0;
import oO0OOooo.C33163OooO0oO;
import oO0Oo0oo.InterfaceC33226OooO0O0;
import oO0OoOO0.C33282OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Hilt_PaperConfigDialogFragment extends RoundBottomSheetDialogFragment implements InterfaceC33226OooO0O0 {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C33163OooO0oO f78608OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public volatile C33162OooO0o0 f78609OooOoOO;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f78607OooOoO = false;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final Object f78611OooOoo0 = new Object();

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f78610OooOoo = false;

    public final void OooOoOO() {
        if (this.f78608OooOoO0 == null) {
            this.f78608OooOoO0 = new C33163OooO0oO(super.getContext(), this);
            this.f78607OooOoO = OooO00o.OooO00o(super.getContext());
        }
    }

    @Override // oO0Oo0oo.InterfaceC33226OooO0O0
    public final Object generatedComponent() {
        if (this.f78609OooOoOO == null) {
            synchronized (this.f78611OooOoo0) {
                try {
                    if (this.f78609OooOoOO == null) {
                        this.f78609OooOoOO = new C33162OooO0o0(this);
                    }
                } finally {
                }
            }
        }
        return this.f78609OooOoOO.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f78607OooOoO) {
            return null;
        }
        OooOoOO();
        return this.f78608OooOoO0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.OooOOOO
    public final o00Oo0.OooO0O0 getDefaultViewModelProviderFactory() {
        return C33282OooO00o.OooO0O0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        OooOoOO();
        if (this.f78610OooOoo) {
            return;
        }
        this.f78610OooOoo = true;
        ((InterfaceC30501OoooO) generatedComponent()).getClass();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new C33163OooO0oO(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        C33163OooO0oO c33163OooO0oO = this.f78608OooOoO0;
        C25400OooO0Oo.OooO00o(c33163OooO0oO == null || C33162OooO0o0.OooO0O0(c33163OooO0oO) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        OooOoOO();
        if (this.f78610OooOoo) {
            return;
        }
        this.f78610OooOoo = true;
        ((InterfaceC30501OoooO) generatedComponent()).getClass();
    }
}
