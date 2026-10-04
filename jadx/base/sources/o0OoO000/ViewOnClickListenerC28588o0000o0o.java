package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C21904OooOoo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.backup.CloudBackupResultDialogFragment;
import com.orion.notein.p607ui.login.firebase.FirebaseUserResetPasswordFragment;
import com.orion.notein.p607ui.noteeditor.textstylebar.TextStyleBarChildFragment;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.pageeditor.TiledPageListContainerFragment;
import java.util.concurrent.CancellationException;
import o0OoOOO0.C29051OooOO0o;
import o0OoOOO0.C29065OooOo00;
import o0o0OO0O.C30436OooOOOO;
import o0o0OO0O.C30437OooOOOo;
import o0o0OO0O.C30438OooOOo;
import o0o0OO0O.C30439OooOOo0;
import o0o0OOO0.C30543OooO00o;
import o0oOoOo.C31083OooooO0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoO000.o0000o0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28588o0000o0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f101327OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101328OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28588o0000o0o(Fragment fragment, int i) {
        this.f101328OooOo0o = i;
        this.f101327OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Fragment fragment = this.f101327OooOo;
        switch (this.f101328OooOo0o) {
            case 0:
                FirebaseUserResetPasswordFragment firebaseUserResetPasswordFragment = (FirebaseUserResetPasswordFragment) fragment;
                C21904OooOoo0.OooO0o(new Bundle(), firebaseUserResetPasswordFragment, "key_firebase_login");
                C21030OooOO0o.OooO0OO(firebaseUserResetPasswordFragment).OooOOo(R.id.firebaseUserAuthFragment, true);
                break;
            case 1:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.TextBoxColorVO");
                C31083OooooO0 c31083OooooO0 = (C31083OooooO0) tag;
                TextStyleBarChildFragment textStyleBarChildFragment = (TextStyleBarChildFragment) fragment;
                C29051OooOO0o c29051OooOO0oOooOoOO = textStyleBarChildFragment.OooOoOO();
                int i = c31083OooooO0.f110936OooO00o;
                c29051OooOO0oOooOoOO.OooOOO0(i);
                textStyleBarChildFragment.OooOoOO().OooO(c31083OooooO0.f110937OooO0O0);
                C29051OooOO0o c29051OooOO0oOooOoOO2 = textStyleBarChildFragment.OooOoOO();
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c29051OooOO0oOooOoOO2);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29065OooOo00(c29051OooOO0oOooOoOO2, i, null), 2);
                break;
            case 2:
                Object tag2 = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag2, "null cannot be cast to non-null type com.orion.notein.ui.pageeditor.vo.PageOperationVO");
                TiledPageListContainerFragment tiledPageListContainerFragment = (TiledPageListContainerFragment) fragment;
                switch (((C30543OooO00o) tag2).f109252OooO00o) {
                    case 0:
                        InterfaceC21987OooOoo viewLifecycleOwner = tiledPageListContainerFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30438OooOOo(tiledPageListContainerFragment, null), 3);
                        break;
                    case 1:
                        InterfaceC21987OooOoo viewLifecycleOwner2 = tiledPageListContainerFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new C30436OooOOOO(tiledPageListContainerFragment, null), 3);
                        break;
                    case 2:
                        tiledPageListContainerFragment.Oooo0O0();
                        break;
                    case 3:
                        tiledPageListContainerFragment.Oooo0();
                        break;
                    case 4:
                        InterfaceC21987OooOoo viewLifecycleOwner3 = tiledPageListContainerFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner3), null, null, new C30439OooOOo0(tiledPageListContainerFragment, null), 3);
                        break;
                    case 5:
                        InterfaceC21987OooOoo viewLifecycleOwner4 = tiledPageListContainerFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner4), null, null, new C30437OooOOOo(tiledPageListContainerFragment, null), 3);
                        break;
                    case 6:
                        tiledPageListContainerFragment.Oooo00o();
                        break;
                }
                break;
            case 3:
                CloudBackupResultDialogFragment cloudBackupResultDialogFragment = (CloudBackupResultDialogFragment) fragment;
                Dialog dialog = cloudBackupResultDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                com.orion.notein.p607ui.backup.OooO00o oooO00o = (com.orion.notein.p607ui.backup.OooO00o) cloudBackupResultDialogFragment.f70582Oooo000.getValue();
                oO0o0OO.o00000OO o00000oo2 = oooO00o.f70691OooOO0;
                if (o00000oo2 != null) {
                    o00000oo2.cancel((CancellationException) null);
                }
                Float fValueOf = Float.valueOf(0.0f);
                C33781o00o0O c33781o00o0O = oooO00o.f70697OooOOOo;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, fValueOf);
                oooO00o.f70693OooOO0o.setValue(null);
                break;
            default:
                TextRecognizeFragment.Oooo0O0((TextRecognizeFragment) fragment, 1, false, 6);
                break;
        }
    }
}
