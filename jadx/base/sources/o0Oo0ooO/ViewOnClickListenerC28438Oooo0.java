package o0Oo0ooO;

import android.app.Dialog;
import android.view.View;
import com.orion.notein.domain.models.material.Orientation;
import com.orion.notein.p607ui.label.LabelManagementDialogFragment;
import com.orion.notein.p607ui.notelist.folder.FolderCreationDialogFragment;
import com.orion.notein.p607ui.paperconfig.MyTemplateFragment;
import o0OoO0oO.C28675OooO0Oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0ooO.Oooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28438Oooo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100803OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100804OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28438Oooo0(Object obj, int i) {
        this.f100804OooOo0o = i;
        this.f100803OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f100804OooOo0o) {
            case 0:
                ((LabelManagementDialogFragment) this.f100803OooOo).dismiss();
                break;
            case 1:
                View.OnClickListener onClickListener = ((C28675OooO0Oo) this.f100803OooOo).f101612OooO0O0;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                break;
            case 2:
                Dialog dialog = ((FolderCreationDialogFragment) this.f100803OooOo).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
            default:
                MyTemplateFragment myTemplateFragment = (MyTemplateFragment) this.f100803OooOo;
                if (myTemplateFragment.f78636OoooOOO == MyTemplateFragment.OooO00o.f78641OooOo) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("MyTemplateFragment");
                    c20358OooO00o.OooO00o("variant orientation click: LANDSCAPE, selectorId=" + myTemplateFragment.OooOooo().f109034Oooo0o0.getValue() + ", tempColor=" + myTemplateFragment.OooOooo().f109026Oooo.getValue(), new Object[0]);
                    myTemplateFragment.OooOooo().OooOoO0(Orientation.LANDSCAPE);
                }
                break;
        }
    }
}
