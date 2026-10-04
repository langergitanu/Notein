package o00000;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: o00000.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24050OooOOOo implements InterfaceC24051OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f81055OooO00o;

    public C24050OooOOOo(View view) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        this.f81055OooO00o = view;
    }

    @Override // o00000.InterfaceC24051OooOOo
    public void OooO00o(InputMethodManager imm) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(imm, "imm");
        imm.hideSoftInputFromWindow(this.f81055OooO00o.getWindowToken(), 0);
    }

    @Override // o00000.InterfaceC24051OooOOo
    public void OooO0O0(final InputMethodManager imm) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(imm, "imm");
        this.f81055OooO00o.post(new Runnable() { // from class: o00000.OooOOOO
            @Override // java.lang.Runnable
            public final void run() {
                InputMethodManager imm2 = imm;
                kotlin.jvm.internal.OooOOO0.OooO0oO(imm2, "$imm");
                C24050OooOOOo this$0 = this;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                imm2.showSoftInput(this$0.f81055OooO00o, 0);
            }
        });
    }
}
