package o0Oo0oOo;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.CreativeLibraryListFragment;
import com.orion.notein.p607ui.notelist.fabbottomsheet.FabMediasFragment;
import com.orion.notein.p607ui.notelist.recover.RecoverNoteFromCloudDialogFragment;
import com.orion.notein.p607ui.settings.tool.ToolSettingsFragment;
import o000o0O0.C24564OooO00o;
import o0o0O00.C30207OooOo;
import o0oOOoo0.C30871OooOO0;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0Oo0oOo.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28330OooOoO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f100464OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100465OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28330OooOoO0(Fragment fragment, int i) {
        this.f100465OooOo0o = i;
        this.f100464OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f100465OooOo0o) {
            case 0:
                C21030OooOO0o.OooO0OO((CreativeLibraryListFragment) this.f100464OooOo).OooOOOO(new C24564OooO00o(R.id.f57926x97ee4dd2));
                break;
            case 1:
                C30207OooOo.OooO00o oooO00o = ((FabMediasFragment) this.f100464OooOo).f77467OooOo0o;
                if (oooO00o != null) {
                    oooO00o.OooOO0o();
                }
                break;
            case 2:
                C21030OooOO0o.OooO0OO((RecoverNoteFromCloudDialogFragment) this.f100464OooOo).OooOOo0();
                break;
            default:
                ToolSettingsFragment toolSettingsFragment = (ToolSettingsFragment) this.f100464OooOo;
                InterfaceC21987OooOoo viewLifecycleOwner = toolSettingsFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30871OooOO0(toolSettingsFragment, null), 3);
                break;
        }
    }
}
