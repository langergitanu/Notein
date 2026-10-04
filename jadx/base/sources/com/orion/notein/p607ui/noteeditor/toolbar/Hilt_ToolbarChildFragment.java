package com.orion.notein.p607ui.noteeditor.toolbar;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import o00o0OOO.C25400OooO0Oo;
import o0o000oo.InterfaceC29852Ooooo00;
import oO000O0o.OooO00o;
import oO0OOooo.C33162OooO0o0;
import oO0OOooo.C33163OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Hilt_ToolbarChildFragment extends BaseToolbarChildFragment {

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public C33163OooO0oO f76665OooooOo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f76667Oooooo0 = false;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public boolean f76666Oooooo = false;

    @Override // com.orion.notein.p607ui.noteeditor.toolbar.Hilt_BaseToolbarChildFragment
    public final void OooOoO() {
        if (this.f76666Oooooo) {
            return;
        }
        this.f76666Oooooo = true;
        ((InterfaceC29852Ooooo00) generatedComponent()).getClass();
    }

    public final void OoooooO() {
        if (this.f76665OooooOo == null) {
            this.f76665OooooOo = new C33163OooO0oO(super.getContext(), this);
            this.f76667Oooooo0 = OooO00o.OooO00o(super.getContext());
        }
    }

    @Override // com.orion.notein.p607ui.noteeditor.toolbar.Hilt_BaseToolbarChildFragment, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f76667Oooooo0) {
            return null;
        }
        OoooooO();
        return this.f76665OooooOo;
    }

    @Override // com.orion.notein.p607ui.noteeditor.toolbar.Hilt_BaseToolbarChildFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        OoooooO();
        OooOoO();
    }

    @Override // com.orion.notein.p607ui.noteeditor.toolbar.Hilt_BaseToolbarChildFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new C33163OooO0oO(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // com.orion.notein.p607ui.noteeditor.toolbar.Hilt_BaseToolbarChildFragment, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        C33163OooO0oO c33163OooO0oO = this.f76665OooooOo;
        C25400OooO0Oo.OooO00o(c33163OooO0oO == null || C33162OooO0o0.OooO0O0(c33163OooO0oO) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        OoooooO();
        OooOoO();
    }
}
