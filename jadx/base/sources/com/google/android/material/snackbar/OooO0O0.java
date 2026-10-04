package com.google.android.material.snackbar;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import com.orion.notein.p607ui.label.LabelPickerBottomSheetFragment;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class OooO0O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f67756OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f67757OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f67758OooOoO0;

    public /* synthetic */ OooO0O0(int i, Object obj, Object obj2) {
        this.f67757OooOo0o = i;
        this.f67756OooOo = obj;
        this.f67758OooOoO0 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f67757OooOo0o) {
            case 0:
                ((Snackbar) this.f67756OooOo).lambda$setAction$0((View.OnClickListener) this.f67758OooOoO0, view);
                break;
            default:
                LabelPickerBottomSheetFragment labelPickerBottomSheetFragment = (LabelPickerBottomSheetFragment) this.f67756OooOo;
                labelPickerBottomSheetFragment.OooOoo0().OooO0oO();
                labelPickerBottomSheetFragment.OooOoo((View) this.f67758OooOoO0);
                if (labelPickerBottomSheetFragment.getDialog() == null) {
                    C21030OooOO0o.OooO0OO(labelPickerBottomSheetFragment).OooOOOo();
                } else {
                    labelPickerBottomSheetFragment.dismiss();
                }
                break;
        }
    }
}
