package o0Oo0o00;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.orion.notein.p607ui.datasync.CloudSyncLoginContainerFragment;
import com.orion.notein.p607ui.label.TriStateCheckBox;
import com.orion.notein.p607ui.noteeditor.ClearPageAlertDialogFragment;
import com.orion.notein.p607ui.notelist.folder.MoveToFolderFragment;
import o0OoO0oo.C28690OooO0o0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0Oo0o00.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28191OoooO00 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f99895OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99896OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28191OoooO00(Object obj, int i) {
        this.f99896OooOo0o = i;
        this.f99895OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TriStateCheckBox.OooO00o oooO00o;
        switch (this.f99896OooOo0o) {
            case 0:
                C21030OooOO0o.OooO0OO((CloudSyncLoginContainerFragment) this.f99895OooOo).OooOOOo();
                return;
            case 1:
                TriStateCheckBox triStateCheckBox = (TriStateCheckBox) this.f99895OooOo;
                TriStateCheckBox.OooO00o oooO00o2 = triStateCheckBox.state;
                int iOrdinal = oooO00o2.ordinal();
                if (iOrdinal == 0) {
                    oooO00o = TriStateCheckBox.OooO00o.f72100OooOoO0;
                } else {
                    if (iOrdinal != 1 && iOrdinal != 2) {
                        throw new C32442OooOO0o();
                    }
                    oooO00o = TriStateCheckBox.OooO00o.f72098OooOo0o;
                }
                if (oooO00o2 != oooO00o) {
                    triStateCheckBox.setState(oooO00o);
                    InterfaceC32507OooOO0o<? super TriStateCheckBox.OooO00o, C32460OooOooO> interfaceC32507OooOO0o = triStateCheckBox.onStateChange;
                    if (interfaceC32507OooOO0o != null) {
                        interfaceC32507OooOO0o.invoke(triStateCheckBox.state);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ClearPageAlertDialogFragment clearPageAlertDialogFragment = (ClearPageAlertDialogFragment) this.f99895OooOo;
                C28690OooO0o0 c28690OooO0o0 = (C28690OooO0o0) clearPageAlertDialogFragment.f72764OooOoOO.getValue();
                Bundle bundle = new Bundle();
                bundle.putString("page_id", c28690OooO0o0.f101649OooO00o);
                ImageView imageView = clearPageAlertDialogFragment.f72767OooOooO;
                if (imageView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("clearQuotes");
                    throw null;
                }
                bundle.putBoolean("clear_quotes", imageView.isActivated());
                clearPageAlertDialogFragment.requireActivity().getSupportFragmentManager().OooooOo(bundle, "clear_page");
                Dialog dialog = clearPageAlertDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            default:
                MoveToFolderFragment moveToFolderFragment = (MoveToFolderFragment) this.f99895OooOo;
                EditText editText = moveToFolderFragment.f77669Oooo0o;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputNewFolderName");
                    throw null;
                }
                editText.setText("");
                moveToFolderFragment.OooOoo0();
                return;
        }
    }
}
