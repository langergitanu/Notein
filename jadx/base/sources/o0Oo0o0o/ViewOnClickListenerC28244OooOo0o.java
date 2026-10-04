package o0Oo0o0o;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.view.View;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.export.ExportBottomSheetFragment;
import com.orion.notein.p607ui.login.password.PasswordLoginFragment;
import com.orion.notein.p607ui.notelist.RenameDialogFragment;
import com.orion.notein.p607ui.ocr.dialog.ReplacePageSelectorDialogFragment;
import com.orion.notein.p607ui.paperconfig.PaperConfigTemplateFragment;
import o000O00O.C24397OooOo0;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0Ooo0O.C29375OooO00o;
import o0o00OOO.DialogC29885OooO0O0;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0Oo0o0o.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28244OooOo0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100095OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100096OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28244OooOo0o(Object obj, int i) {
        this.f100096OooOo0o = i;
        this.f100095OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f100096OooOo0o) {
            case 0:
                ((ExportBottomSheetFragment) this.f100095OooOo).OooOooo().OooOO0(1);
                break;
            case 1:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((PasswordLoginFragment) this.f100095OooOo), new C24564OooO00o(R.id.action_passwordLoginFragment_to_findPasswordFragment));
                break;
            case 2:
                C33781o00o0O c33781o00o0O = ((com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o) this.f100095OooOo).OooO0OO().f103125OooO0Oo;
                Boolean boolValueOf = Boolean.valueOf(!((Boolean) r3.OooO0OO().f103125OooO0Oo.getValue()).booleanValue());
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, boolValueOf);
                break;
            case 3:
                C29375OooO00o.InterfaceC19985OooO00o interfaceC19985OooO00o = ((C29375OooO00o) this.f100095OooOo).f104160OooO0O0;
                if (interfaceC19985OooO00o != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    interfaceC19985OooO00o.OooO00o(view);
                }
                break;
            case 4:
                C24397OooOo0 c24397OooOo0 = ((DialogC29885OooO0O0) this.f100095OooOo).f106023OooOo;
                if (c24397OooOo0 != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    c24397OooOo0.OooO00o(view);
                }
                break;
            case 5:
                Dialog dialog = ((RenameDialogFragment) this.f100095OooOo).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
            case 6:
                C33781o00o0O c33781o00o0O2 = ((PaperConfigTemplateFragment) this.f100095OooOo).OooOooo().f109019OooOoO;
                c33781o00o0O2.getClass();
                c33781o00o0O2.OooOO0(null, 2);
                break;
            default:
                C21030OooOO0o.OooO0OO((ReplacePageSelectorDialogFragment) this.f100095OooOo).OooOOOo();
                break;
        }
    }
}
