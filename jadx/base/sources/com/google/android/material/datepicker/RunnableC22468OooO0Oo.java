package com.google.android.material.datepicker;

import android.widget.EditText;
import com.google.android.material.internal.ViewUtils;
import com.google.firebase.firestore.core.TransactionRunner;

/* JADX INFO: renamed from: com.google.android.material.datepicker.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class RunnableC22468OooO0Oo implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f67699OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f67700OooOo0o;

    public /* synthetic */ RunnableC22468OooO0Oo(Object obj, int i) {
        this.f67700OooOo0o = i;
        this.f67699OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67700OooOo0o) {
            case 0:
                ViewUtils.requestFocusAndShowKeyboard((EditText) this.f67699OooOo, false);
                break;
            default:
                ((TransactionRunner) this.f67699OooOo).lambda$runWithBackoff$2();
                break;
        }
    }
}
