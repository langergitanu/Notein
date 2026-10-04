package o0Oo0oOo;

import Oooo0oO.C21030OooOO0o;
import android.os.Bundle;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.DownloadedMaterialListFragment;
import com.orion.notein.p607ui.user.settings.entry.UserSettingsContainerFragment;
import com.orion.notein.p607ui.widget.EdgeFragment;
import o000o0O0.C24572OooOO0o;

/* JADX INFO: renamed from: o0Oo0oOo.o0ooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28376o0ooOoO implements InterfaceC21912Oooo0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ EdgeFragment f100610OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100611OooOo0o;

    public /* synthetic */ C28376o0ooOoO(EdgeFragment edgeFragment, int i) {
        this.f100611OooOo0o = i;
        this.f100610OooOo = edgeFragment;
    }

    @Override // androidx.fragment.app.InterfaceC21912Oooo0o
    public final void OooO0OO(Bundle bundle, String str) {
        switch (this.f100611OooOo0o) {
            case 0:
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
                String string = bundle.getString("material_id");
                String string2 = bundle.getString("material_title");
                if (string != null && string2 != null) {
                    ((DownloadedMaterialListFragment) this.f100610OooOo).OooOoOO(string, string2);
                    break;
                }
                break;
            default:
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
                if (bundle.getBoolean("user_deleted")) {
                    C24572OooOO0o c24572OooOO0oOooO0OO = C21030OooOO0o.OooO0OO((UserSettingsContainerFragment) this.f100610OooOo);
                    if (!c24572OooOO0oOooO0OO.OooOOo(R.id.noteListContainerFragment, false)) {
                        c24572OooOO0oOooO0OO.OooOOO0(R.id.noteListContainerFragment, null, null);
                    }
                }
                break;
        }
    }
}
