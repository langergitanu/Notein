package o0OoOOoO;

import android.app.Dialog;
import android.view.View;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.notelist.fabbottomsheet.FabDocumentsFragment;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinDeleteAlertDialogFragment;
import o0o0O00.C30207OooOo;
import o0oOOooO.C30898OooOo00;
import oO0o0Oo.C33781o00o0O;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: o0OoOOoO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29188OooO0O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103520OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103521OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29188OooO0O0(Object obj, int i) {
        this.f103521OooOo0o = i;
        this.f103520OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f103521OooOo0o) {
            case 0:
                C30898OooOo00 c30898OooOo00Oooo0oO = ((BaseToolbarChildFragment) ((C29192OooO0o0) this.f103520OooOo).f103527OooO0O0.f88129OooO00o).Oooo0oO();
                C33781o00o0O c33781o00o0O = c30898OooOo00Oooo0oO.f110438OooOO0;
                c33781o00o0O.OooOO0(null, Boolean.valueOf(!((Boolean) c33781o00o0O.getValue()).booleanValue()));
                if (!((Boolean) c33781o00o0O.getValue()).booleanValue()) {
                    C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
                    C33781o00o0O c33781o00o0O2 = c30898OooOo00Oooo0oO.f110440OooOO0o;
                    c33781o00o0O2.getClass();
                    c33781o00o0O2.OooOO0(null, c34438OooOoo0);
                }
                break;
            case 1:
                C30207OooOo.OooO00o oooO00o = ((FabDocumentsFragment) this.f103520OooOo).f77466OooOo0o;
                if (oooO00o != null) {
                    oooO00o.OooO0oO();
                }
                break;
            default:
                Dialog dialog = ((TrashBinDeleteAlertDialogFragment) this.f103520OooOo).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
        }
    }
}
