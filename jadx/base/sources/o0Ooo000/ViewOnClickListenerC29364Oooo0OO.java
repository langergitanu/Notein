package o0Ooo000;

import android.app.Dialog;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.HyperLinkEditorPanel;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.UrlLinkDialogFragment;
import com.orion.notein.p607ui.noteeditor.recognize.TextRecognizeDialogFragment;
import o00o00.C25206OooO0Oo;
import o0ooOOoo.C31660OooO0o0;
import o0ooOOoo.InterfaceC31656OooO0O0;

/* JADX INFO: renamed from: o0Ooo000.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29364Oooo0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f104132OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104133OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29364Oooo0OO(Object obj, int i) {
        this.f104133OooOo0o = i;
        this.f104132OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f104133OooOo0o) {
            case 0:
                UrlLinkDialogFragment urlLinkDialogFragment = (UrlLinkDialogFragment) this.f104132OooOo;
                EditText editText = urlLinkDialogFragment.f74667Oooo0;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
                Editable text = editText.getText();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(text);
                if (text.length() == 0) {
                    Context contextRequireContext = urlLinkDialogFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    String string = urlLinkDialogFragment.getString(R.string.toast_enter_a_url);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0Oo(contextRequireContext, string);
                    return;
                }
                o00O0OO0.OooO00o oooO00o = urlLinkDialogFragment.f74672Oooo0OO;
                if (oooO00o != null) {
                    String url = text.toString();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(url, "url");
                    com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO = ((HyperLinkEditorPanel) oooO00o.f84325OooO00o).f74494OooOo0o;
                    if (oooO0OO == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                        throw null;
                    }
                    oooO0OO.OooO0oO(0, url);
                }
                Dialog dialog = urlLinkDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 1:
                ((TextRecognizeDialogFragment) this.f104132OooOo).dismiss();
                return;
            default:
                InterfaceC31656OooO0O0 interfaceC31656OooO0O0 = ((C31660OooO0o0) this.f104132OooOo).f113165OooO0O0;
                if (interfaceC31656OooO0O0 != null) {
                    interfaceC31656OooO0O0.OooO();
                    return;
                }
                return;
        }
    }
}
