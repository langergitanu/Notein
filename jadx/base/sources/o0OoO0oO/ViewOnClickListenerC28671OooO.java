package o0OoO0oO;

import android.app.Dialog;
import android.view.View;
import com.orion.notein.p607ui.noteeditor.addpage.dialog.TemplateRenameDialogFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.CommentDeleteAlertDialogFragment;
import com.orion.notein.p607ui.p609vo.ThemeVO;
import com.orion.notein.p607ui.paperconfig.MyTemplateFragment;

/* JADX INFO: renamed from: o0OoO0oO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28671OooO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101600OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101601OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28671OooO(Object obj, int i) {
        this.f101601OooOo0o = i;
        this.f101600OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f101601OooOo0o) {
            case 0:
                View.OnClickListener onClickListener = ((C28680OooOO0) this.f101600OooOo).f101627OooO0O0;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                break;
            case 1:
                Dialog dialog = ((TemplateRenameDialogFragment) this.f101600OooOo).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
            case 2:
                Dialog dialog2 = ((CommentDeleteAlertDialogFragment) this.f101600OooOo).getDialog();
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
                break;
            default:
                Object tag = view.getTag();
                ThemeVO themeVO = tag instanceof ThemeVO ? (ThemeVO) tag : null;
                if (themeVO != null) {
                    ((MyTemplateFragment) this.f101600OooOo).Oooo0(themeVO);
                    break;
                }
                break;
        }
    }
}
