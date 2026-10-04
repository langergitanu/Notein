package com.google.firebase.installations;

import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.p607ui.label.LabelPickerDialogFragment;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ boolean f68566OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f68567OooOo0o = 0;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f68568OooOoO0;

    public /* synthetic */ OooO0O0(FirebaseInstallations firebaseInstallations, boolean z) {
        this.f68568OooOoO0 = firebaseInstallations;
        this.f68566OooOo = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f68567OooOo0o) {
            case 0:
                ((FirebaseInstallations) this.f68568OooOoO0).lambda$doRegistrationOrRefresh$3(this.f68566OooOo);
                return;
            default:
                if (this.f68566OooOo) {
                    LabelPickerDialogFragment labelPickerDialogFragment = (LabelPickerDialogFragment) this.f68568OooOoO0;
                    RecyclerView recyclerView = labelPickerDialogFragment.f71949Oooo0;
                    if (recyclerView != null) {
                        recyclerView.post(new OooO0OO(labelPickerDialogFragment, 1));
                        return;
                    } else {
                        OooOOO0.OooOOOO("labelList");
                        throw null;
                    }
                }
                return;
        }
    }

    public /* synthetic */ OooO0O0(boolean z, LabelPickerDialogFragment labelPickerDialogFragment) {
        this.f68566OooOo = z;
        this.f68568OooOoO0 = labelPickerDialogFragment;
    }
}
