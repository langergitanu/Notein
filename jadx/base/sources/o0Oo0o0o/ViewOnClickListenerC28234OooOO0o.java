package o0Oo0o0o;

import Oooo0oO.C21022OooO0OO;
import android.app.Dialog;
import android.view.View;
import com.orion.notein.p607ui.export.ExportBottomSheetFragment;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.HyperLinkEditorPanel;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.UrlLinkDialogFragment;
import com.orion.notein.p607ui.user.message.UserMessageFragment;
import o0OoO.C28504OooO0oo;

/* JADX INFO: renamed from: o0Oo0o0o.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28234OooOO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100073OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100074OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28234OooOO0o(Object obj, int i) {
        this.f100074OooOo0o = i;
        this.f100073OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f100073OooOo;
        switch (this.f100074OooOo0o) {
            case 0:
                ((ExportBottomSheetFragment) obj).OooOooo().OooO0oo(4);
                return;
            case 1:
                ViewOnClickListenerC28223OooO viewOnClickListenerC28223OooO = ((C28504OooO0oo) obj).f101048OooO0O0;
                if (viewOnClickListenerC28223OooO != null) {
                    viewOnClickListenerC28223OooO.onClick(view);
                    return;
                }
                return;
            case 2:
                UrlLinkDialogFragment urlLinkDialogFragment = (UrlLinkDialogFragment) obj;
                o00O0OO0.OooO00o oooO00o = urlLinkDialogFragment.f74672Oooo0OO;
                if (oooO00o != null) {
                    com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO = ((HyperLinkEditorPanel) oooO00o.f84325OooO00o).f74494OooOo0o;
                    if (oooO0OO == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                        throw null;
                    }
                    oooO0OO.OooO0oo(OooO0OO.OooO00o.f74574OooOooo, null);
                }
                Dialog dialog = urlLinkDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            default:
                int i = UserMessageFragment.f79796Oooo000;
                View view2 = (View) obj;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(view2);
                C21022OooO0OO.OooO0O0(view2).OooOOo0();
                return;
        }
    }
}
