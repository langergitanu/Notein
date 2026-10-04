package o0O0oO;

import android.app.Dialog;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import com.orion.notein.p607ui.login.firebase.FirebaseLoginConfirmFragment;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinClearAlertDialogFragment;
import com.orion.notein.p607ui.vip.VipAdvertisementDialogFragment;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.jvm.internal.OooOOO0;
import o0O0oO0o.OooOOOO;
import o0Oo0oOo.o00Ooo;
import o0o00Ooo.C29915OooO0OO;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class OooO0O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f89079OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f89080OooOo0o;

    public /* synthetic */ OooO0O0(Object obj, int i) {
        this.f89080OooOo0o = i;
        this.f89079OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f89079OooOo;
        switch (this.f89080OooOo0o) {
            case 0:
                OooOOOO oooOOOO = (OooOOOO) obj;
                if (oooOOOO != null) {
                    oooOOOO.onClick(view);
                    return;
                }
                return;
            case 1:
                FirebaseLoginConfirmFragment firebaseLoginConfirmFragment = (FirebaseLoginConfirmFragment) obj;
                TextView textView = firebaseLoginConfirmFragment.f72309OoooO0;
                if (textView == null) {
                    OooOOO0.OooOOOO("btnContinue");
                    throw null;
                }
                CheckBox checkBox = firebaseLoginConfirmFragment.f72297Oooo;
                if (checkBox != null) {
                    textView.setEnabled(checkBox.isChecked());
                    return;
                } else {
                    OooOOO0.OooOOOO("btnAgree");
                    throw null;
                }
            case 2:
                int i = PenBarChildFragment.f75240o0000OOo;
                Object tag = view.getTag();
                OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type kotlin.String");
                String str = (String) tag;
                String str2 = DrawToolFactory.ERASER_TYPE_PIXEL;
                if (str.equals(DrawToolFactory.ERASER_TYPE_PIXEL)) {
                    str2 = DrawToolFactory.ERASER_TYPE_STROKE;
                } else if (str.equals(DrawToolFactory.ERASER_TYPE_STROKE)) {
                    str2 = DrawToolFactory.ERASER_TYPE_LASSO;
                }
                ((PenBarChildFragment) obj).Oooo0oO().OooOO0O(str2);
                return;
            case 3:
                o00Ooo o00ooo2 = ((C29915OooO0OO) obj).f106139OooO0Oo;
                if (o00ooo2 != null) {
                    o00ooo2.onClick(view);
                    return;
                }
                return;
            case 4:
                TrashBinClearAlertDialogFragment trashBinClearAlertDialogFragment = (TrashBinClearAlertDialogFragment) obj;
                trashBinClearAlertDialogFragment.requireActivity().getSupportFragmentManager().OooooOo(BundleKt.bundleOf(new C32443OooOOO("result", Boolean.TRUE)), "clear_trash");
                Dialog dialog = trashBinClearAlertDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            default:
                ((VipAdvertisementDialogFragment) obj).dismiss();
                return;
        }
    }
}
