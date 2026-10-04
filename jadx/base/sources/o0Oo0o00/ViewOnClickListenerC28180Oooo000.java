package o0Oo0o00;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.datasync.CloudSyncFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.CommentEditDialogFragment;
import com.orion.notein.p607ui.settings.debug.DebugFragment;
import o0000oOO.AbstractC24338OooO0o0;
import o000o0O0.C24564OooO00o;
import o0OOooO0.EnumC27953o00000Oo;
import o0Oo00o.C28026OooO0OO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0Oo0o00.Oooo000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28180Oooo000 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f99867OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99868OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28180Oooo000(Fragment fragment, int i) {
        this.f99868OooOo0o = i;
        this.f99867OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Fragment fragment = this.f99867OooOo;
        switch (this.f99868OooOo0o) {
            case 0:
                C28194OoooOOO c28194OoooOOOOooOoo = ((CloudSyncFragment) fragment).OooOoo();
                EnumC27953o00000Oo enumC27953o00000Oo = EnumC27953o00000Oo.f98990OooOo;
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c28194OoooOOOOooOoo);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28208o000oOoO(c28194OoooOOOOooOoo, enumC27953o00000Oo, null), 2);
                break;
            case 1:
                Dialog dialog = ((CommentEditDialogFragment) fragment).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
            default:
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((DebugFragment) fragment), new C24564OooO00o(R.id.action_debug_fragment_to_debugImportedPdfListFragment));
                break;
        }
    }
}
