package o0OoO;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.view.View;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.PageLinkDialogFragment;
import com.orion.notein.p607ui.user.firebase.FirebaseUserSettingsFragment;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class OooO0O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101024OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101025OooOo0o;

    public /* synthetic */ OooO0O0(Object obj, int i) {
        this.f101025OooOo0o = i;
        this.f101024OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f101025OooOo0o) {
            case 0:
                OooO0o oooO0o = (OooO0o) this.f101024OooOo;
                synchronized (oooO0o) {
                    oooO0o.f101033OooO0OO.dismiss();
                }
                return;
            case 1:
                PageLinkDialogFragment pageLinkDialogFragment = (PageLinkDialogFragment) this.f101024OooOo;
                pageLinkDialogFragment.getClass();
                Dialog dialog = pageLinkDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            default:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((FirebaseUserSettingsFragment) this.f101024OooOo), new C24564OooO00o(R.id.f57943xcf59c4a));
                return;
        }
    }
}
