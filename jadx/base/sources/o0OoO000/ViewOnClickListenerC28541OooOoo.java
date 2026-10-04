package o0OoO000;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.p607ui.login.firebase.FirebaseLoginConfirmFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.colorpicker.ColorSetRenameDialogFragment;
import com.orion.notein.p607ui.notelist.about.AboutFragment;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinContainerFragment;
import o0o0O0oO.C30318OooO0oO;
import o0oOoOoO.C31097OooO0Oo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoO000.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28541OooOoo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f101171OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101172OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28541OooOoo(Fragment fragment, int i) {
        this.f101172OooOo0o = i;
        this.f101171OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Fragment fragment = this.f101171OooOo;
        switch (this.f101172OooOo0o) {
            case 0:
                Context contextRequireContext = ((FirebaseLoginConfirmFragment) fragment).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31097OooO0Oo(contextRequireContext, null), 3);
                break;
            case 1:
                Dialog dialog = ((ColorSetRenameDialogFragment) fragment).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
            case 2:
                Context contextRequireContext2 = ((AboutFragment) fragment).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31097OooO0Oo(contextRequireContext2, null), 3);
                break;
            default:
                TrashBinContainerFragment trashBinContainerFragment = (TrashBinContainerFragment) fragment;
                InterfaceC21987OooOoo viewLifecycleOwner = trashBinContainerFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30318OooO0oO(trashBinContainerFragment, null), 2);
                break;
        }
    }
}
