package o0OoOOOo;

import android.app.Dialog;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.core.os.BundleKt;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.AiFeaturePublicTestingDialogFragment;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o;
import com.orion.notein.p607ui.notelist.PdfPasswordDialogFragment;
import com.orion.notein.p607ui.paperconfig.PaperConfigTemplateFragment;
import o00o00.C25206OooO0Oo;
import o0Ooo0O.C29375OooO00o;
import o0o00oOo.C30084o00000oO;
import oO00ooO.C32443OooOOO;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0OoOOOo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29099OooO0oO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103119OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103120OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29099OooO0oO(Object obj, int i) {
        this.f103120OooOo0o = i;
        this.f103119OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f103120OooOo0o) {
            case 0:
                OooO00o.InterfaceC19278OooO00o interfaceC19278OooO00o = ((com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o) this.f103119OooOo).f74088OooO0O0;
                if (interfaceC19278OooO00o != null) {
                    interfaceC19278OooO00o.OooO00o();
                    return;
                }
                return;
            case 1:
                C29375OooO00o.InterfaceC19985OooO00o interfaceC19985OooO00o = ((C29375OooO00o) this.f103119OooOo).f104160OooO0O0;
                if (interfaceC19985OooO00o != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    interfaceC19985OooO00o.OooO0Oo(view);
                    return;
                }
                return;
            case 2:
                PdfPasswordDialogFragment pdfPasswordDialogFragment = (PdfPasswordDialogFragment) this.f103119OooOo;
                EditText editText = pdfPasswordDialogFragment.f77291Oooo0O0;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputPassword");
                    throw null;
                }
                Editable text = editText.getText();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(text);
                if (text.length() == 0) {
                    Context contextRequireContext = pdfPasswordDialogFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    String string = pdfPasswordDialogFragment.getString(R.string.please_input_password);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0Oo(contextRequireContext, string);
                    return;
                }
                pdfPasswordDialogFragment.requireActivity().getSupportFragmentManager().OooooOo(BundleKt.bundleOf(new C32443OooOOO("id", ((C30084o00000oO) pdfPasswordDialogFragment.f77288Oooo000.getValue()).f107062OooO00o), new C32443OooOOO("password", text.toString())), "pdf_password");
                Dialog dialog = pdfPasswordDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 3:
                C33781o00o0O c33781o00o0O = ((PaperConfigTemplateFragment) this.f103119OooOo).OooOooo().f109019OooOoO;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, 0);
                return;
            default:
                AiFeaturePublicTestingDialogFragment.OooO00o oooO00o = ((AiFeaturePublicTestingDialogFragment) this.f103119OooOo).f70433Oooo00o;
                if (oooO00o != null) {
                    oooO00o.OooO0O0();
                    return;
                }
                return;
        }
    }
}
