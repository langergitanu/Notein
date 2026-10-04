package o0O0o0oO;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.domain.models.cloudsync.CloudSyncError;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.datasync.CloudSyncDetailsFragment;
import com.orion.notein.p607ui.paperconfig.PaperConfigDialogFragment;
import com.orion.penkit.models.ImageInfo;
import o00o00.C25206OooO0Oo;
import o0Oo0o00.C28163OooOOo;
import o0Oo0o00.C28167OooOo0;
import o0Oo0o00.C28169OooOo0O;
import o0Oo0o0O.C28221OooO00o;
import o0o0OOO.C30496Oooo0OO;
import o0o0OOO.C30520o000000o;
import o0oOoOo.C31032OooO0OO;
import o0oOoOo.C31033OooO0Oo;
import o0oOoOo.C31081Ooooo00;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33781o00o0O;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0O0o0oO.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26024OooOOo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f88870OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f88871OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f88872OooOoO0;

    public /* synthetic */ ViewOnClickListenerC26024OooOOo0(int i, Object obj, Object obj2) {
        this.f88871OooOo0o = i;
        this.f88870OooOo = obj;
        this.f88872OooOoO0 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C28169OooOo0O c28169OooOo0O;
        switch (this.f88871OooOo0o) {
            case 0:
                ((C26029OooOoO) this.f88870OooOo).f88885OooO00o.OooO0oo((ImageInfo) this.f88872OooOoO0);
                break;
            case 1:
                Object tag = ((View) this.f88870OooOo).getTag();
                C31032OooO0OO c31032OooO0OO = tag instanceof C31032OooO0OO ? (C31032OooO0OO) tag : null;
                if (c31032OooO0OO != null && (c28169OooOo0O = ((C28221OooO00o) this.f88872OooOoO0).f100048OooO0O0) != null) {
                    CloudSyncDetailsFragment cloudSyncDetailsFragment = c28169OooOo0O.f99827OooO00o;
                    C31033OooO0Oo c31033OooO0Oo = (C31033OooO0Oo) cloudSyncDetailsFragment.OooOooo().f99967Oooo0O0.f121747OooOo0o.getValue();
                    if ((c31033OooO0Oo != null ? c31033OooO0Oo.f110787OooO00o : null) != C31033OooO0Oo.OooO00o.f110795OooOoO0) {
                        cloudSyncDetailsFragment.OooOooo().OooOO0();
                        cloudSyncDetailsFragment.OooOooo().OooOOO();
                        C31081Ooooo00 c31081Ooooo00OooO0oo = cloudSyncDetailsFragment.OooOooo().OooO0oo();
                        boolean z = c31032OooO0OO.f110784OooO0OO;
                        String str = c31032OooO0OO.f110782OooO00o;
                        if (z) {
                            CloudSyncDetailsFragment.OooOoOO(cloudSyncDetailsFragment, new C31081Ooooo00(false, false, false, false, false, oOo000Oo.Oooo0.OooO0o0(new C32443OooOOO(str, c31032OooO0OO.f110783OooO0O0)), C34434OooOoO.f123453OooOo0o), new C28163OooOOo(0, cloudSyncDetailsFragment, c31032OooO0OO));
                        } else if (!oOo000Oo.OooOo.Oooo00o(oOo000Oo.OooOOO.OoooOo0(new String[]{CloudSyncError.CODE_AUTH_EXPIRED, CloudSyncError.CODE_STORAGE_FULL, CloudSyncError.CODE_APP_VERSION_INCOMPATIBLE}), c31032OooO0OO.f110786OooO0o0)) {
                            cloudSyncDetailsFragment.OooOooo().OooOO0o(str);
                        } else {
                            InterfaceC21987OooOoo viewLifecycleOwner = cloudSyncDetailsFragment.getViewLifecycleOwner();
                            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C28167OooOo0(c31032OooO0OO, c31081Ooooo00OooO0oo, cloudSyncDetailsFragment, null), 3);
                        }
                    } else {
                        Context context = cloudSyncDetailsFragment.getContext();
                        if (context != null) {
                            String string = cloudSyncDetailsFragment.getString(R.string.cloud_sync_cannot_resolve_issue_while_syncing);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                            C25206OooO0Oo.OooO0oO(context, string);
                        }
                    }
                }
                break;
            default:
                PaperConfigDialogFragment paperConfigDialogFragment = (PaperConfigDialogFragment) this.f88870OooOo;
                C30520o000000o c30520o000000oOooOoo = paperConfigDialogFragment.OooOoo();
                Boolean bool = Boolean.TRUE;
                C33781o00o0O c33781o00o0O = c30520o000000oOooOoo.f109039OoooO00;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, bool);
                InterfaceC21987OooOoo viewLifecycleOwner2 = paperConfigDialogFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new C30496Oooo0OO((EditText) this.f88872OooOoO0, paperConfigDialogFragment, null), 3);
                break;
        }
    }
}
