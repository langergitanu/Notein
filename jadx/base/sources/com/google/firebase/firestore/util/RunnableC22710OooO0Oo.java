package com.google.firebase.firestore.util;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import o0o0OOoO.C30558OooO0oo;
import o0o0OOoO.C30567OooOOOO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.google.firebase.firestore.util.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class RunnableC22710OooO0Oo implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f68411OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f68412OooOo0o;

    public /* synthetic */ RunnableC22710OooO0Oo(Object obj, int i) {
        this.f68412OooOo0o = i;
        this.f68411OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f68412OooOo0o) {
            case 0:
                AsyncQueue.lambda$panic$3((Throwable) this.f68411OooOo);
                break;
            case 1:
                EditText editText = (EditText) this.f68411OooOo;
                kotlin.jvm.internal.OooOOO0.OooO0oO(editText, "$editText");
                InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(editText, 0);
                    break;
                }
                break;
            case 2:
                NoteEditorContainerFragment noteEditorContainerFragment = (NoteEditorContainerFragment) this.f68411OooOo;
                NoteEditorContainerFragment.Oooo0(noteEditorContainerFragment);
                noteEditorContainerFragment.Oooo0OO(34, null);
                break;
            default:
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("AiQuotaPayViewModel");
                c20358OooO00o.OooO0o0("retryBillingConnection", new Object[0]);
                C30558OooO0oo c30558OooO0oo = (C30558OooO0oo) this.f68411OooOo;
                if (!c30558OooO0oo.f109312OooOo.OooOOOo()) {
                    c30558OooO0oo.f109312OooOo.OooO0o0(new C30567OooOOOO(c30558OooO0oo));
                }
                break;
        }
    }
}
