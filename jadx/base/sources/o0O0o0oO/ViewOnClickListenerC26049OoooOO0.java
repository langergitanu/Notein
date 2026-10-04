package o0O0o0oO;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.view.View;
import com.orion.editor.PDFView;
import com.orion.notein.p607ui.export.ExportDialogFragment;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.LayerRenameDialogFragment;
import com.orion.notein.p607ui.notelist.SimpleEditTextDialogFragment;
import com.orion.notein.p607ui.notelist.recent.RecentFragment;
import o0O0oOO.C26106OooO0O0;
import o0O0oooo.C26395Oooo0o0;
import o0Oo00o.C28026OooO0OO;
import o0OoOOO0.C29051OooOO0o;
import o0OoOOOo.C29108OooOOo;
import o0OoOOOo.InterfaceC29094OooO0O0;
import o0o000oo.C29825OooOoO0;
import o0o00OOo.C29891OooO0o0;
import o0oOoOo.C31083OooooO0;

/* JADX INFO: renamed from: o0O0o0oO.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26049OoooOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f88934OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f88935OooOo0o;

    public /* synthetic */ ViewOnClickListenerC26049OoooOO0(Object obj, int i) {
        this.f88935OooOo0o = i;
        this.f88934OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f88935OooOo0o) {
            case 0:
                PDFView pDFView = ((C26017OooO0o) this.f88934OooOo).f88845OooO00o;
                C26395Oooo0o0 c26395Oooo0o0 = pDFView.f69170OooOooO.f69109OooO0O0;
                if (c26395Oooo0o0 != null) {
                    c26395Oooo0o0.f90558OooO0oO.OooOo00(null);
                }
                C26106OooO0O0.OooO00o(pDFView.getContext());
                if (pDFView.f69214o00000oo.f88979OooO00o.OooO0o()) {
                    pDFView.f69214o00000oo.f88979OooO00o.setVisibility(8);
                    return;
                }
                return;
            case 1:
                ((ExportDialogFragment) this.f88934OooOo).Oooo0OO().OooOO0(3);
                return;
            case 2:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.TextBoxColorVO");
                C31083OooooO0 c31083OooooO0 = (C31083OooooO0) tag;
                C29108OooOOo c29108OooOOo = (C29108OooOOo) this.f88934OooOo;
                C29051OooOO0o c29051OooOO0o = c29108OooOOo.f103152OooOO0o;
                if (c29051OooOO0o == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                    throw null;
                }
                int i = c31083OooooO0.f110936OooO00o;
                c29051OooOO0o.OooOOO0(i);
                InterfaceC29094OooO0O0 interfaceC29094OooO0O0 = c29108OooOOo.f103142OooO00o;
                if (interfaceC29094OooO0O0 != null) {
                    interfaceC29094OooO0O0.OooO0o0(i, c31083OooooO0.f110937OooO0O0);
                    return;
                }
                return;
            case 3:
                Dialog dialog = ((LayerRenameDialogFragment) this.f88934OooOo).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 4:
                C29825OooOoO0 c29825OooOoO0 = ((C29891OooO0o0) this.f88934OooOo).f106037OooO0O0;
                if (c29825OooOoO0 != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    c29825OooOoO0.OooO00o(view);
                    return;
                }
                return;
            case 5:
                ((SimpleEditTextDialogFragment) this.f88934OooOo).dismiss();
                return;
            default:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((RecentFragment) this.f88934OooOo), new o0o0O0O.OooOO0O());
                return;
        }
    }
}
