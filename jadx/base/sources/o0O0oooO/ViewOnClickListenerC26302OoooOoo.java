package o0O0oooO;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import com.orion.notein.MainActivity;
import com.orion.notein.p607ui.notelist.label.LabelContainerFragment;
import com.orion.notein.p607ui.notelist.notefilterbottomsheet.NoteFilterBottomSheetDialog;
import com.orion.notein.p607ui.settings.gesture.GlobalGestureSettingsFragment;
import com.orion.notein.p607ui.user.firebase.FirebaseUserSettingsFragment;
import java.util.List;
import o0OoO0oo.C28698OooOOOO;
import oO0o0Oo.C33781o00o0O;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: o0O0oooO.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26302OoooOoo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f90139OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90140OooOo0o;

    public /* synthetic */ ViewOnClickListenerC26302OoooOoo(Object obj, int i) {
        this.f90140OooOo0o = i;
        this.f90139OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f90140OooOo0o) {
            case 0:
                ((MainActivity) this.f90139OooOo).goBrowserToDownloadLatestNoteIn();
                break;
            case 1:
                C28698OooOOOO c28698OooOOOOOooo0o0 = ((o0OoO.OooO0o) this.f90139OooOo).f101031OooO00o.f105794OooO00o.Oooo0o0();
                C33781o00o0O c33781o00o0O = c28698OooOOOOOooo0o0.f101693OooO0o0;
                c33781o00o0O.OooOO0(null, Boolean.valueOf(!((Boolean) c33781o00o0O.getValue()).booleanValue()));
                if (!((Boolean) c33781o00o0O.getValue()).booleanValue()) {
                    C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
                    C33781o00o0O c33781o00o0O2 = c28698OooOOOOOooo0o0.f101695OooO0oo;
                    c33781o00o0O2.getClass();
                    c33781o00o0O2.OooOO0(null, c34438OooOoo0);
                }
                break;
            case 2:
                LabelContainerFragment labelContainerFragment = (LabelContainerFragment) this.f90139OooOo;
                if (labelContainerFragment.f77712Oooo0O0 == null) {
                    NoteFilterBottomSheetDialog noteFilterBottomSheetDialog = new NoteFilterBottomSheetDialog();
                    labelContainerFragment.f77712Oooo0O0 = noteFilterBottomSheetDialog;
                    noteFilterBottomSheetDialog.f77824OooOoOO = new o0o0O00O.OooO0O0(labelContainerFragment, 0);
                }
                NoteFilterBottomSheetDialog noteFilterBottomSheetDialog2 = labelContainerFragment.f77712Oooo0O0;
                if (noteFilterBottomSheetDialog2 != null) {
                    noteFilterBottomSheetDialog2.OooOoO((List) labelContainerFragment.OooOoo().f77155Oooo0o.getValue());
                }
                NoteFilterBottomSheetDialog noteFilterBottomSheetDialog3 = labelContainerFragment.f77712Oooo0O0;
                if (noteFilterBottomSheetDialog3 != null) {
                    noteFilterBottomSheetDialog3.show(labelContainerFragment.getChildFragmentManager(), "NoteTypeBottomSheetDialog");
                }
                break;
            case 3:
                C21030OooOO0o.OooO0OO((GlobalGestureSettingsFragment) this.f90139OooOo).OooOOo0();
                break;
            default:
                C21030OooOO0o.OooO0OO((FirebaseUserSettingsFragment) this.f90139OooOo).OooOOo0();
                break;
        }
    }
}
