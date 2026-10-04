package o0OoOOoO;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.p607ui.notelist.fabbottomsheet.FabDocumentsFragment;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinDeleteAlertDialogFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.permission.PermissionTipsDialogFragment;
import o0o0O00.C30207OooOo;
import o0o0O0oO.C30322OooOO0o;

/* JADX INFO: renamed from: o0OoOOoO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29189OooO0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103522OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103523OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29189OooO0OO(Object obj, int i) {
        this.f103523OooOo0o = i;
        this.f103522OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f103523OooOo0o) {
            case 0:
                ((C29192OooO0o0) this.f103522OooOo).f103529OooO0Oo.dismiss();
                break;
            case 1:
                C30207OooOo.OooO00o oooO00o = ((FabDocumentsFragment) this.f103522OooOo).f77466OooOo0o;
                if (oooO00o != null) {
                    oooO00o.OooO0OO();
                }
                break;
            case 2:
                TrashBinDeleteAlertDialogFragment trashBinDeleteAlertDialogFragment = (TrashBinDeleteAlertDialogFragment) this.f103522OooOo;
                C30322OooOO0o c30322OooOO0o = (C30322OooOO0o) trashBinDeleteAlertDialogFragment.f78113OooOoOO.getValue();
                Bundle bundle = new Bundle();
                NoteVO noteVO = c30322OooOO0o.f108104OooO00o;
                if (noteVO != null) {
                    bundle.putString("id", noteVO.getId());
                    bundle.putInt(C18437z2.f56754h, noteVO.getType());
                    String pageNoteId = noteVO.getPageNoteId();
                    if (pageNoteId == null) {
                        pageNoteId = "";
                    }
                    bundle.putString("pageNoteId", pageNoteId);
                }
                trashBinDeleteAlertDialogFragment.requireActivity().getSupportFragmentManager().OooooOo(bundle, "delete_permanently");
                Dialog dialog = trashBinDeleteAlertDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
            default:
                Dialog dialog2 = ((PermissionTipsDialogFragment) this.f103522OooOo).getDialog();
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
                break;
        }
    }
}
