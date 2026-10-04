package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.orion.notein.p607ui.backup.CloudBackupResultDialogFragment;
import com.orion.notein.p607ui.login.firebase.FirebaseUserResetPasswordFragment;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorListContainer;
import com.orion.notein.p607ui.ocr.view.AiOcrRichEditor;
import o00o00.C25206OooO0Oo;
import o0o00oO0.C30006OooOooo;

/* JADX INFO: renamed from: o0OoO000.o0000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28585o0000o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101323OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101324OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28585o0000o(Object obj, int i) {
        this.f101324OooOo0o = i;
        this.f101323OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f101324OooOo0o) {
            case 0:
                C21030OooOO0o.OooO0OO((FirebaseUserResetPasswordFragment) this.f101323OooOo).OooOOo0();
                break;
            case 1:
                C30006OooOooo c30006OooOooo = (C30006OooOooo) this.f101323OooOo;
                C21030OooOO0o.OooO0o0(c30006OooOooo.f106609OooOo0o, c30006OooOooo.f106608OooOo);
                break;
            case 2:
                AiOcrEditorListContainer aiOcrEditorListContainer = (AiOcrEditorListContainer) this.f101323OooOo;
                AiOcrRichEditor aiOcrRichEditor = aiOcrEditorListContainer.f78424OooOoO0;
                if (aiOcrRichEditor != null) {
                    if (!aiOcrRichEditor.onTextContextMenuItem(R.id.copy)) {
                        Context context = aiOcrEditorListContainer.getContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
                        String string = aiOcrEditorListContainer.getContext().getString(com.orion.notein.global.R.string.failed_to_copy_to_clipboard);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                        C25206OooO0Oo.OooO0oO(context, string);
                    } else {
                        Context context2 = aiOcrEditorListContainer.getContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(context2, "getContext(...)");
                        String string2 = aiOcrEditorListContainer.getContext().getString(com.orion.notein.global.R.string.success_to_copy_to_clipboard);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                        C25206OooO0Oo.OooO0oO(context2, string2);
                    }
                    break;
                }
                break;
            case 3:
                Dialog dialog = ((CloudBackupResultDialogFragment) this.f101323OooOo).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
            default:
                TextRecognizeFragment.Oooo0O0((TextRecognizeFragment) this.f101323OooOo, 1, false, 4);
                break;
        }
    }
}
