package o0Oo0oOo;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.domain.models.material.Material;
import com.orion.notein.p607ui.creative_library.C23028OooO0Oo;
import com.orion.notein.p607ui.creative_library.C23032OooO0oo;
import com.orion.notein.p607ui.creative_library.CreativeLibraryDetailFragment;
import com.orion.notein.p607ui.noteeditor.ruler.SetRulerAngleDialogFragment;
import com.orion.notein.p607ui.notelist.about.UserAboutDialogFragment;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinContainerFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import o0OoOOoO.C29192OooO0o0;
import o0OoOOoO.ViewOnClickListenerC29187OooO00o;
import o0o0O0oO.C30316OooO0o;
import o0oOoOoO.C31100OooO0oO;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0Oo0oOo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28314OooOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100431OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100432OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28314OooOO0(Object obj, int i) {
        this.f100432OooOo0o = i;
        this.f100431OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f100431OooOo;
        switch (this.f100432OooOo0o) {
            case 0:
                C23028OooO0Oo c23028OooO0OoOooOoOO = ((CreativeLibraryDetailFragment) obj).OooOoOO();
                Material material = c23028OooO0OoOooOoOO.f71013OooOOO;
                if (material != null) {
                    C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(c23028OooO0OoOooOoOO), null, null, new C23032OooO0oo((C23028OooO0Oo.C19176OooO0Oo) c23028OooO0OoOooOoOO.f71010OooOO0.getValue(), material, c23028OooO0OoOooOoOO, null), 3);
                    break;
                }
                break;
            case 1:
                ((C29192OooO0o0) obj).f103527OooO0O0.OooO00o();
                break;
            case 2:
                Dialog dialog = ((SetRulerAngleDialogFragment) obj).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
            case 3:
                Context contextRequireContext = ((UserAboutDialogFragment) obj).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31100OooO0oO(contextRequireContext, null), 3);
                break;
            case 4:
                TrashBinContainerFragment trashBinContainerFragment = (TrashBinContainerFragment) obj;
                NoteVO noteVO = (NoteVO) ((C32443OooOOO) trashBinContainerFragment.OooOoOO().f108242OooOo0.getValue()).f116638OooOo0o;
                NoteVO noteVO2 = (NoteVO) ((C32443OooOOO) trashBinContainerFragment.OooOoOO().f108242OooOo0.getValue()).f116637OooOo;
                if (noteVO != null) {
                    InterfaceC21987OooOoo viewLifecycleOwner = trashBinContainerFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30316OooO0o(trashBinContainerFragment, noteVO2, null), 2);
                } else {
                    C21030OooOO0o.OooO0OO(trashBinContainerFragment).OooOOo0();
                }
                break;
            default:
                ViewOnClickListenerC29187OooO00o viewOnClickListenerC29187OooO00o = ((com.orion.notein.p607ui.settings.stylus.OooO00o) obj).f79301OooO0O0;
                if (viewOnClickListenerC29187OooO00o != null) {
                    viewOnClickListenerC29187OooO00o.onClick(view);
                }
                break;
        }
    }
}
