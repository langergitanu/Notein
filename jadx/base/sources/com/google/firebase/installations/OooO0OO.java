package com.google.firebase.installations;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.p607ui.label.LabelPickerDialogFragment;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f68569OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f68570OooOo0o;

    public /* synthetic */ OooO0OO(Object obj, int i) {
        this.f68570OooOo0o = i;
        this.f68569OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditText editText;
        switch (this.f68570OooOo0o) {
            case 0:
                ((FirebaseInstallations) this.f68569OooOo).lambda$getId$1();
                return;
            default:
                LabelPickerDialogFragment labelPickerDialogFragment = (LabelPickerDialogFragment) this.f68569OooOo;
                RecyclerView recyclerView = labelPickerDialogFragment.f71949Oooo0;
                if (recyclerView == null) {
                    OooOOO0.OooOOOO("labelList");
                    throw null;
                }
                RecyclerView.AbstractC22078OooOooO abstractC22078OooOooOFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(0);
                if (abstractC22078OooOooOFindViewHolderForAdapterPosition == null || (editText = (EditText) abstractC22078OooOooOFindViewHolderForAdapterPosition.itemView.findViewById(com.orion.notein.global.R.id.input_text)) == null) {
                    return;
                }
                if (!editText.hasFocus()) {
                    editText.requestFocus();
                }
                Context context = labelPickerDialogFragment.getContext();
                Object systemService = context != null ? context.getSystemService("input_method") : null;
                InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(editText, 1);
                    return;
                }
                return;
        }
    }
}
