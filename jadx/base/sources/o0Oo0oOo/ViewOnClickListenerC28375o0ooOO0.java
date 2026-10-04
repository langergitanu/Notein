package o0Oo0oOo;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.backup.BackupResultDialogFragment;
import com.orion.notein.p607ui.creative_library.DownloadedMaterialListFragment;
import com.orion.notein.p607ui.pageeditor.ChooseNoteDialogFragment;
import o0o0OOO0.C30544OooO0O0;

/* JADX INFO: renamed from: o0Oo0oOo.o0ooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28375o0ooOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f100607OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100608OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28375o0ooOO0(Fragment fragment, int i) {
        this.f100608OooOo0o = i;
        this.f100607OooOo = fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f100608OooOo0o) {
            case 0:
                C21030OooOO0o.OooO0OO((DownloadedMaterialListFragment) this.f100607OooOo).OooOOOO(new o0OO00O());
                break;
            case 1:
                ChooseNoteDialogFragment chooseNoteDialogFragment = (ChooseNoteDialogFragment) this.f100607OooOo;
                C30544OooO0O0 c30544OooO0O0 = (C30544OooO0O0) chooseNoteDialogFragment.OooOoo0().f108317OooO.f121747OooOo0o.getValue();
                if (c30544OooO0O0 != null) {
                    chooseNoteDialogFragment.OooOoo0().OooO0o(c30544OooO0O0.f109255OooO00o);
                } else {
                    C21030OooOO0o.OooO0OO(chooseNoteDialogFragment).OooOOo0();
                }
                break;
            default:
                Dialog dialog = ((BackupResultDialogFragment) this.f100607OooOo).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
        }
    }
}
