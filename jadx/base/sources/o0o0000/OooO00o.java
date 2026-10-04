package o0o0000;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.setting.FastTranslationSettingFragment;
import com.orion.notein.p607ui.notelist.about.AboutFragment;
import com.orion.notein.p607ui.notelist.notefilterbottomsheet.NoteFilterBottomSheetDialog;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinContainerFragment;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0o0O0oO.C30312OooO00o;
import o0oOoOoO.C31098OooO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class OooO00o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f105408OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f105409OooOo0o;

    public /* synthetic */ OooO00o(Fragment fragment, int i) {
        this.f105409OooOo0o = i;
        this.f105408OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f105409OooOo0o) {
            case 0:
                C21030OooOO0o.OooO0OO((FastTranslationSettingFragment) this.f105408OooOo).OooOOo0();
                break;
            case 1:
                Context contextRequireContext = ((AboutFragment) this.f105408OooOo).requireContext();
                OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31098OooO0o(contextRequireContext, null), 3);
                break;
            default:
                TrashBinContainerFragment trashBinContainerFragment = (TrashBinContainerFragment) this.f105408OooOo;
                if (trashBinContainerFragment.f78085OoooO0O == null) {
                    NoteFilterBottomSheetDialog noteFilterBottomSheetDialog = new NoteFilterBottomSheetDialog();
                    trashBinContainerFragment.f78085OoooO0O = noteFilterBottomSheetDialog;
                    noteFilterBottomSheetDialog.f77824OooOoOO = new C30312OooO00o(trashBinContainerFragment, 0);
                }
                NoteFilterBottomSheetDialog noteFilterBottomSheetDialog2 = trashBinContainerFragment.f78085OoooO0O;
                if (noteFilterBottomSheetDialog2 != null) {
                    noteFilterBottomSheetDialog2.OooOoO((List) trashBinContainerFragment.OooOoOO().f108235OooOOO0.getValue());
                }
                NoteFilterBottomSheetDialog noteFilterBottomSheetDialog3 = trashBinContainerFragment.f78085OoooO0O;
                if (noteFilterBottomSheetDialog3 != null) {
                    noteFilterBottomSheetDialog3.show(trashBinContainerFragment.getChildFragmentManager(), "NoteTypeBottomSheetDialog");
                }
                break;
        }
    }
}
