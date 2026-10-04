package o0Oo0o0o;

import android.app.Dialog;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.p607ui.export.ExportBottomSheetFragment;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o;
import com.orion.notein.p607ui.notelist.PdfPasswordDialogFragment;
import com.orion.notein.p607ui.paperconfig.PaperConfigTemplateFragment;
import com.orion.notein.ui.export.ExportBottomSheetFragment.OooO0OO;
import o0o00O0O.C29874OooO0o0;
import o0o00oOo.C30084o00000oO;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class OooOo00 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100091OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100092OooOo0o;

    public /* synthetic */ OooOo00(Object obj, int i) {
        this.f100092OooOo0o = i;
        this.f100091OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f100092OooOo0o) {
            case 0:
                ExportBottomSheetFragment exportBottomSheetFragment = (ExportBottomSheetFragment) this.f100091OooOo;
                InterfaceC21987OooOoo viewLifecycleOwner = exportBottomSheetFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, exportBottomSheetFragment.new OooO0OO(null), 3);
                break;
            case 1:
                OooO00o.InterfaceC19278OooO00o interfaceC19278OooO00o = ((com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o) this.f100091OooOo).f74088OooO0O0;
                if (interfaceC19278OooO00o != null) {
                    interfaceC19278OooO00o.OooO00o();
                }
                break;
            case 2:
                C29874OooO0o0.OooO00o oooO00o = ((C29874OooO0o0) this.f100091OooOo).f106007OooO0O0;
                if (oooO00o != null) {
                    oooO00o.OooO0O0();
                }
                break;
            case 3:
                PdfPasswordDialogFragment pdfPasswordDialogFragment = (PdfPasswordDialogFragment) this.f100091OooOo;
                pdfPasswordDialogFragment.requireActivity().getSupportFragmentManager().OooooOo(BundleKt.bundleOf(new C32443OooOOO("id", ((C30084o00000oO) pdfPasswordDialogFragment.f77288Oooo000.getValue()).f107062OooO00o), new C32443OooOOO("password", null)), "pdf_password");
                Dialog dialog = pdfPasswordDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
            default:
                C33781o00o0O c33781o00o0O = ((PaperConfigTemplateFragment) this.f100091OooOo).OooOooo().f109023OooOoo0;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, 0);
                break;
        }
    }
}
