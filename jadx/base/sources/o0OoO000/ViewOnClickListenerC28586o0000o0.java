package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import androidx.core.os.BundleKt;
import androidx.fragment.app.C21929Ooooo0o;
import androidx.fragment.app.FragmentManager;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.p607ui.backup.CloudBackupFragment;
import com.orion.notein.p607ui.login.entry.LoginDialogFragment;
import com.orion.notein.p607ui.login.firebase.FirebaseUserReAuthPasswordFragment;
import com.orion.notein.p607ui.noteeditor.textstylebar.TextStyleBarChildFragment;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.ocr.dialog.TextUrlLinkDialogFragment;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorListContainer;
import com.orion.notein.p607ui.ocr.view.AiOcrRichEditor;
import com.orion.notein.p607ui.pageeditor.TiledPageListContainerFragment;
import com.orion.notein.p607ui.user.DeleteAccountAgreementFragment;
import com.orion.notein.richeditor.effects.Effects;
import com.orion.notein.richeditor.spans.RTSpan;
import java.util.List;
import o000o0O0.C24586OooOoOO;
import o0O0oooO.ViewOnClickListenerC26290Oooo0o0;
import o0OoOooO.C29251OooO00o;
import o0o0OoO0.C30679OooO0oo;
import o0oOoOoO.C31099OooO0o0;
import o0oOoo00.C31141OooOoOO;
import oO00ooO.C32443OooOOO;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoO000.o0000o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28586o0000o0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101325OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101326OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28586o0000o0(Object obj, int i) {
        this.f101326OooOo0o = i;
        this.f101325OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f101325OooOo;
        switch (this.f101326OooOo0o) {
            case 0:
                FirebaseUserReAuthPasswordFragment firebaseUserReAuthPasswordFragment = (FirebaseUserReAuthPasswordFragment) obj;
                EditText editText = firebaseUserReAuthPasswordFragment.f72406Oooo00o;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("etEmail");
                    throw null;
                }
                C32443OooOOO c32443OooOOO = new C32443OooOOO("email", C33599OooOo0O.Oooooo0(editText.getText().toString()).toString());
                EditText editText2 = firebaseUserReAuthPasswordFragment.f72407Oooo0O0;
                if (editText2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("etPassword");
                    throw null;
                }
                firebaseUserReAuthPasswordFragment.getParentFragmentManager().OooooOo(BundleKt.bundleOf(c32443OooOOO, new C32443OooOOO("password", C33599OooOo0O.Oooooo0(editText2.getText().toString()).toString())), "FRAGMENT_KEY_REAUTH_PASSWORD");
                C21030OooOO0o.OooO0OO(firebaseUserReAuthPasswordFragment).OooOOo0();
                return;
            case 1:
                ViewOnClickListenerC26290Oooo0o0 viewOnClickListenerC26290Oooo0o0 = ((C29251OooO00o) obj).f103740OooO0O0;
                if (viewOnClickListenerC26290Oooo0o0 != null) {
                    viewOnClickListenerC26290Oooo0o0.onClick(view);
                    return;
                }
                return;
            case 2:
                C24586OooOoOO c24586OooOoOO = ((LoginDialogFragment) obj).f72188Oooo00O;
                if (c24586OooOoOO != null) {
                    c24586OooOoOO.OooOOo0();
                    return;
                }
                return;
            case 3:
                ((TextStyleBarChildFragment) obj).OooOooO(false);
                return;
            case 4:
                ((TiledPageListContainerFragment) obj).Oooo00o();
                return;
            case 5:
                AiOcrEditorListContainer aiOcrEditorListContainer = (AiOcrEditorListContainer) obj;
                AiOcrRichEditor aiOcrRichEditor = aiOcrEditorListContainer.f78424OooOoO0;
                if (aiOcrRichEditor == null) {
                    return;
                }
                FragmentManager childFragmentManager = ((TextRecognizeFragment) C21929Ooooo0o.OooO0Oo(aiOcrEditorListContainer)).getChildFragmentManager();
                kotlin.jvm.internal.OooOOO0.OooO0o(childFragmentManager, "getChildFragmentManager(...)");
                if (childFragmentManager.OooOooo("TextUrlLinkDialogFragment") == null) {
                    TextUrlLinkDialogFragment textUrlLinkDialogFragment = new TextUrlLinkDialogFragment();
                    List<RTSpan> listSpansInSelection = Effects.LINK.spansInSelection(aiOcrRichEditor);
                    List<RTSpan> list = listSpansInSelection;
                    if (list == null || list.isEmpty()) {
                        textUrlLinkDialogFragment.f78416Oooo0O0 = "";
                    } else {
                        Object value = ((RTSpan) oOo000Oo.OooOo.Oooo0oO(listSpansInSelection)).getValue();
                        String str = value instanceof String ? (String) value : null;
                        textUrlLinkDialogFragment.f78416Oooo0O0 = str != null ? str : "";
                    }
                    textUrlLinkDialogFragment.f78417Oooo0OO = new C30679OooO0oo(aiOcrEditorListContainer);
                    textUrlLinkDialogFragment.show(childFragmentManager, "TextUrlLinkDialogFragment");
                    return;
                }
                return;
            case 6:
                Context contextRequireContext = ((DeleteAccountAgreementFragment) obj).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31099OooO0o0(contextRequireContext, null), 3);
                return;
            case 7:
                BackupFile.DiskVendor diskVendor = CloudBackupFragment.f70531Oooo0o;
                com.orion.notein.p607ui.backup.OooO00o oooO00oOooOoOO = ((CloudBackupFragment) obj).OooOoOO();
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(oooO00oOooOoOO);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C31141OooOoOO(oooO00oOooOoOO, 0, null), 2);
                return;
            default:
                TextRecognizeFragment.Oooo0O0((TextRecognizeFragment) obj, 0, false, 6);
                return;
        }
    }
}
