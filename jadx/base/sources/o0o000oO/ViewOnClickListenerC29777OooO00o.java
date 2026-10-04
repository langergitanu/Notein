package o0o000oO;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.o0OoOo0;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.backup.CloudBackupFragment;
import com.orion.notein.p607ui.noteeditor.textstylebar.TextStyleBarChildFragment;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.user.DeleteAccountAgreementFragment;
import o000oooo.C24761OooO;
import o00o00.C25206OooO0Oo;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0Oo00oO.C28037OooO0OO;
import o0OoOOOo.C29108OooOOo;
import o0OoOOOo.InterfaceC29095OooO0OO;
import o0o00oO0.C30006OooOooo;
import o0o0OO0O.ViewOnClickListenerC30435OooOOO0;
import o0oOoo00.C31138OooOo0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.o00000OO;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o000oO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29777OooO00o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f105683OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f105684OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29777OooO00o(Object obj, int i) {
        this.f105684OooOo0o = i;
        this.f105683OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 1;
        Object obj = this.f105683OooOo;
        switch (this.f105684OooOo0o) {
            case 0:
                TextStyleBarChildFragment textStyleBarChildFragment = (TextStyleBarChildFragment) obj;
                textStyleBarChildFragment.OooOoo();
                C29108OooOOo c29108OooOOo = textStyleBarChildFragment.f76457OooooOO;
                if (c29108OooOOo != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    c29108OooOOo.f103141OooO.showAsDropDown(view);
                    InterfaceC29095OooO0OO interfaceC29095OooO0OO = c29108OooOOo.f103143OooO0O0;
                    if (interfaceC29095OooO0OO != null) {
                        interfaceC29095OooO0OO.OooO0Oo(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C30006OooOooo c30006OooOooo = (C30006OooOooo) obj;
                C21030OooOO0o.OooO0o(c30006OooOooo.f106609OooOo0o, c30006OooOooo.f106608OooOo);
                return;
            case 2:
                DeleteAccountAgreementFragment deleteAccountAgreementFragment = (DeleteAccountAgreementFragment) obj;
                ImageView imageView = deleteAccountAgreementFragment.f79597OooOooo;
                if (imageView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("agreeCheckBox");
                    throw null;
                }
                if (!imageView.isSelected()) {
                    Context contextRequireContext = deleteAccountAgreementFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    String string = deleteAccountAgreementFragment.getString(R.string.read_and_agree_privacy_and_service_first);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0oO(contextRequireContext, string);
                    return;
                }
                FirebaseUser currentUser = ((FirebaseAuth) deleteAccountAgreementFragment.f79594OooOoo.getValue()).getCurrentUser();
                if (currentUser == null) {
                    Context context = deleteAccountAgreementFragment.getContext();
                    if (context != null) {
                        String string2 = deleteAccountAgreementFragment.getString(R.string.no_user);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                        C25206OooO0Oo.OooO0oO(context, string2);
                        return;
                    }
                    return;
                }
                String string3 = deleteAccountAgreementFragment.getString(R.string.tips);
                kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
                String string4 = deleteAccountAgreementFragment.getString(R.string.request_to_reauth);
                kotlin.jvm.internal.OooOOO0.OooO0o(string4, "getString(...)");
                TipsDialogFragment tipsDialogFragment = new TipsDialogFragment(string3, string4, new ViewOnClickListenerC26311Ooooooo(), new ViewOnClickListenerC30435OooOOO0(deleteAccountAgreementFragment, currentUser, i), null, deleteAccountAgreementFragment.getString(R.string.f57990go), 0, null, 384);
                if (deleteAccountAgreementFragment.getChildFragmentManager().OooOooo("TipsDialogFragment") == null) {
                    tipsDialogFragment.show(deleteAccountAgreementFragment.getChildFragmentManager(), "TipsDialogFragment");
                    return;
                }
                return;
            case 3:
                BackupFile.DiskVendor diskVendor = CloudBackupFragment.f70531Oooo0o;
                com.orion.notein.p607ui.backup.OooO00o oooO00oOooOoOO = ((CloudBackupFragment) obj).OooOoOO();
                String strOooO00o = C24761OooO.OooO00o("toString(...)");
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("CloudBackupViewModel");
                c20358OooO00o.OooO0o0("manualBackup start, manualBackupId: ".concat(strOooO00o), new Object[0]);
                o00000OO o00000oo2 = oooO00oOooOoOO.f70691OooOO0;
                if (o00000oo2 != null && o00000oo2.isActive()) {
                    c20358OooO00o.OooOOO0("CloudBackupViewModel");
                    c20358OooO00o.OooO0o0("manualBackup is activated, manualBackupId: ".concat(strOooO00o), new Object[0]);
                    return;
                }
                boolean zOooO0OO = C28037OooO0OO.OooO0OO(oooO00oOooOoOO.f70686OooO0Oo);
                boolean z = ((Number) oooO00oOooOoOO.f70692OooOO0O.f121747OooOo0o.getValue()).intValue() == 0;
                if (zOooO0OO && z) {
                    C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO00oOooOoOO), null, null, new C31138OooOo0o(oooO00oOooOoOO, null), 3);
                    return;
                }
                Float fValueOf = Float.valueOf(0.0f);
                C33781o00o0O c33781o00o0O = oooO00oOooOoOO.f70697OooOOOo;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, fValueOf);
                oooO00oOooOoOO.f70693OooOO0o.setValue(null);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                oooO00oOooOoOO.f70691OooOO0 = C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new com.orion.notein.p607ui.backup.OooO0O0(oooO00oOooOoOO, strOooO00o, null), 3);
                return;
            default:
                TextRecognizeFragment.Oooo0O0((TextRecognizeFragment) obj, 2, false, 6);
                return;
        }
    }
}
