package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.backup.CloudBackupFragment;
import com.orion.notein.p607ui.login.entry.LoginDialogFragment;
import com.orion.notein.p607ui.login.firebase.FirebaseUserReAuthPasswordFragment;
import com.orion.notein.p607ui.noteeditor.textstylebar.TextStyleBarChildFragment;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.pageeditor.TiledPageListContainerFragment;
import com.orion.notein.p607ui.user.DeleteAccountAgreementFragment;
import java.util.List;
import o0OoOOOo.C29096OooO0Oo;
import o0o0OO0O.C30437OooOOOo;
import o0oOoo00.C31141OooOoOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoO000.o0000OoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28583o0000OoO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f101317OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101318OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28583o0000OoO(Fragment fragment, int i) {
        this.f101318OooOo0o = i;
        this.f101317OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 1;
        Fragment fragment = this.f101317OooOo;
        switch (this.f101318OooOo0o) {
            case 0:
                FirebaseUserReAuthPasswordFragment firebaseUserReAuthPasswordFragment = (FirebaseUserReAuthPasswordFragment) fragment;
                EditText editText = firebaseUserReAuthPasswordFragment.f72407Oooo0O0;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("etPassword");
                    throw null;
                }
                if (editText.getInputType() == 144) {
                    ImageView imageView = firebaseUserReAuthPasswordFragment.f72408Oooo0OO;
                    if (imageView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnPasswordVisibility");
                        throw null;
                    }
                    imageView.setImageResource(R.drawable.ic_close_eye);
                    EditText editText2 = firebaseUserReAuthPasswordFragment.f72407Oooo0O0;
                    if (editText2 != null) {
                        editText2.setInputType(129);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("etPassword");
                        throw null;
                    }
                }
                ImageView imageView2 = firebaseUserReAuthPasswordFragment.f72408Oooo0OO;
                if (imageView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnPasswordVisibility");
                    throw null;
                }
                imageView2.setImageResource(R.drawable.ic_open_eye);
                EditText editText3 = firebaseUserReAuthPasswordFragment.f72407Oooo0O0;
                if (editText3 != null) {
                    editText3.setInputType(144);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("etPassword");
                    throw null;
                }
            case 1:
                ((LoginDialogFragment) fragment).dismissAllowingStateLoss();
                return;
            case 2:
                TextStyleBarChildFragment textStyleBarChildFragment = (TextStyleBarChildFragment) fragment;
                if (textStyleBarChildFragment.f76456OooooO0 == null) {
                    Context contextRequireContext = textStyleBarChildFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    C29096OooO0Oo c29096OooO0Oo = new C29096OooO0Oo(contextRequireContext);
                    c29096OooO0Oo.f103116OooO0O0.f103491OooO0O0 = new ViewOnClickListenerC28588o0000o0o(textStyleBarChildFragment, i);
                    textStyleBarChildFragment.f76456OooooO0 = c29096OooO0Oo;
                    List list = (List) textStyleBarChildFragment.OooOoOO().f102906OooOOOo.f121747OooOo0o.getValue();
                    C29096OooO0Oo c29096OooO0Oo2 = textStyleBarChildFragment.f76456OooooO0;
                    if (c29096OooO0Oo2 != null) {
                        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
                        c29096OooO0Oo2.f103116OooO0O0.OooO0Oo(list);
                    }
                }
                C29096OooO0Oo c29096OooO0Oo3 = textStyleBarChildFragment.f76456OooooO0;
                if (c29096OooO0Oo3 != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    c29096OooO0Oo3.f103115OooO00o.showAsDropDown(view);
                    return;
                }
                return;
            case 3:
                TiledPageListContainerFragment tiledPageListContainerFragment = (TiledPageListContainerFragment) fragment;
                InterfaceC21987OooOoo viewLifecycleOwner = tiledPageListContainerFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30437OooOOOo(tiledPageListContainerFragment, null), 3);
                return;
            case 4:
                view.setSelected(true ^ view.isSelected());
                View view2 = ((DeleteAccountAgreementFragment) fragment).f79598Oooo000;
                if (view2 != null) {
                    view2.setEnabled(view.isSelected());
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnStart");
                    throw null;
                }
            case 5:
                BackupFile.DiskVendor diskVendor = CloudBackupFragment.f70531Oooo0o;
                com.orion.notein.p607ui.backup.OooO00o oooO00oOooOoOO = ((CloudBackupFragment) fragment).OooOoOO();
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(oooO00oOooOoOO);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C31141OooOoOO(oooO00oOooOoOO, 1, null), 2);
                return;
            default:
                C21030OooOO0o.OooO0OO((TextRecognizeFragment) fragment).OooOOo0();
                return;
        }
    }
}
