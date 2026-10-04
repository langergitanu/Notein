package o0Oo0o0o;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.view.View;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.export.AddWaterMarkFragment;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.PageLinkDialogFragment;
import com.orion.notein.p607ui.user.firebase.FirebaseUserInfoFragment;
import java.util.List;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0OoOO0o.ViewOnClickListenerC29034OooO00o;

/* JADX INFO: renamed from: o0Oo0o0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28224OooO00o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100055OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100056OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28224OooO00o(Object obj, int i) {
        this.f100056OooOo0o = i;
        this.f100055OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f100055OooOo;
        switch (this.f100056OooOo0o) {
            case 0:
                List<Integer> list = AddWaterMarkFragment.f71503Oooo000;
                ((AddWaterMarkFragment) obj).dismiss();
                break;
            case 1:
                ViewOnClickListenerC29034OooO00o viewOnClickListenerC29034OooO00o = ((o0OoO.OooO0o) obj).f101042OooOOO;
                if (viewOnClickListenerC29034OooO00o != null) {
                    viewOnClickListenerC29034OooO00o.onClick(view);
                }
                break;
            case 2:
                PageLinkDialogFragment pageLinkDialogFragment = (PageLinkDialogFragment) obj;
                pageLinkDialogFragment.getClass();
                Dialog dialog = pageLinkDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
            default:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((FirebaseUserInfoFragment) obj), new C24564OooO00o(R.id.action_firebaseUserInfoFragment_to_aiQuotaPayDialogFragment));
                break;
        }
    }
}
