package com.orion.notein.p607ui.login.password.reset;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.orion.notein.p607ui.user.settings.verifycode.VerifyCodeFragment;
import o00o0OOO.C25400OooO0Oo;
import o0oO0O00.InterfaceC30773OooO0OO;
import oO000O0o.OooO00o;
import oO0OOooo.C33162OooO0o0;
import oO0OOooo.C33163OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Hilt_LoginVerifyCodeFragment extends VerifyCodeFragment {

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public C33163OooO0oO f72506Oooo00o;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f72505Oooo0 = false;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f72507Oooo0O0 = false;

    @Override // com.orion.notein.p607ui.user.settings.verifycode.Hilt_VerifyCodeFragment
    public final void OooOoO() {
        if (this.f72507Oooo0O0) {
            return;
        }
        this.f72507Oooo0O0 = true;
        ((InterfaceC30773OooO0OO) generatedComponent()).getClass();
    }

    public final void OooOooo() {
        if (this.f72506Oooo00o == null) {
            this.f72506Oooo00o = new C33163OooO0oO(super.getContext(), this);
            this.f72505Oooo0 = OooO00o.OooO00o(super.getContext());
        }
    }

    @Override // com.orion.notein.p607ui.user.settings.verifycode.Hilt_VerifyCodeFragment, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f72505Oooo0) {
            return null;
        }
        OooOooo();
        return this.f72506Oooo00o;
    }

    @Override // com.orion.notein.p607ui.user.settings.verifycode.Hilt_VerifyCodeFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        OooOooo();
        OooOoO();
    }

    @Override // com.orion.notein.p607ui.user.settings.verifycode.Hilt_VerifyCodeFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new C33163OooO0oO(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // com.orion.notein.p607ui.user.settings.verifycode.Hilt_VerifyCodeFragment, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        C33163OooO0oO c33163OooO0oO = this.f72506Oooo00o;
        C25400OooO0Oo.OooO00o(c33163OooO0oO == null || C33162OooO0o0.OooO0O0(c33163OooO0oO) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        OooOooo();
        OooOoO();
    }
}
