package o0o00ooO;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.notelist.fabbottomsheet.FabDocumentsFragment;
import com.orion.notein.p607ui.permission.PermissionTipsDialogFragment;
import o0o0O00.C30207OooOo;

/* JADX INFO: renamed from: o0o00ooO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC30139OooO0O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f107281OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f107282OooOo0o;

    public /* synthetic */ ViewOnClickListenerC30139OooO0O0(Fragment fragment, int i) {
        this.f107282OooOo0o = i;
        this.f107281OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f107282OooOo0o) {
            case 0:
                C30207OooOo.OooO00o oooO00o = ((FabDocumentsFragment) this.f107281OooOo).f77466OooOo0o;
                if (oooO00o != null) {
                    oooO00o.OooO();
                }
                break;
            default:
                Context context = view.getContext();
                Intent intent = new Intent();
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                context.startActivity(intent);
                Dialog dialog = ((PermissionTipsDialogFragment) this.f107281OooOo).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
        }
    }
}
