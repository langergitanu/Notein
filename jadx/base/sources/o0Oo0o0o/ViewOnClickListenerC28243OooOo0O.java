package o0Oo0o0o;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.AiFeaturePublicTestingDialogFragment;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.export.ExportBottomSheetFragment;
import com.orion.notein.p607ui.login.password.PasswordLoginFragment;
import com.orion.notein.p607ui.notelist.RenameDialogFragment;
import com.orion.notein.p607ui.ocr.dialog.ReplacePageSelectorDialogFragment;
import com.orion.notein.p607ui.paperconfig.PaperConfigTemplateFragment;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0o0OO0.C30418Oooo0o0;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0Oo0o0o.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28243OooOo0O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100093OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100094OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28243OooOo0O(Object obj, int i) {
        this.f100094OooOo0o = i;
        this.f100093OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f100094OooOo0o) {
            case 0:
                ExportBottomSheetFragment exportBottomSheetFragment = (ExportBottomSheetFragment) this.f100093OooOo;
                View view2 = exportBottomSheetFragment.f71517Oooo0O0;
                if (view2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("pdfTypeView");
                    throw null;
                }
                if (view2.isActivated()) {
                    exportBottomSheetFragment.OooOooo().OooOO0(0);
                    return;
                }
                if (exportBottomSheetFragment.getChildFragmentManager().OooOooo("TipsDialogFragment") != null) {
                    return;
                }
                ViewOnClickListenerC26311Ooooooo viewOnClickListenerC26311Ooooooo = new ViewOnClickListenerC26311Ooooooo();
                ViewOnClickListenerC28240OooOOo0 viewOnClickListenerC28240OooOOo0 = new ViewOnClickListenerC28240OooOOo0(exportBottomSheetFragment, 0);
                String string = exportBottomSheetFragment.getString(R.string.upgrade_now);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                String string2 = exportBottomSheetFragment.getString(R.string.title_upgrade_to_vip_export_pdf);
                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                String string3 = exportBottomSheetFragment.getString(R.string.content_upgrade_to_vip_export_pdf);
                kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
                new TipsDialogFragment(string2, string3, viewOnClickListenerC26311Ooooooo, viewOnClickListenerC28240OooOOo0, null, string, 0, null, 384).show(exportBottomSheetFragment.getChildFragmentManager(), "TipsDialogFragment");
                return;
            case 1:
                C21030OooOO0o.OooO0OO((PasswordLoginFragment) this.f100093OooOo).OooOOo(R.id.phoneVerificationRequestFragment, false);
                return;
            case 2:
                C33781o00o0O c33781o00o0O = ((com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o) this.f100093OooOo).OooO0OO().f103125OooO0Oo;
                Boolean boolValueOf = Boolean.valueOf(!((Boolean) r13.OooO0OO().f103125OooO0Oo.getValue()).booleanValue());
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, boolValueOf);
                return;
            case 3:
                EditText editText = ((RenameDialogFragment) this.f100093OooOo).f77299Oooo0OO;
                if (editText != null) {
                    editText.setText("");
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
            case 4:
                C33781o00o0O c33781o00o0O2 = ((PaperConfigTemplateFragment) this.f100093OooOo).OooOooo().f109019OooOoO;
                c33781o00o0O2.getClass();
                c33781o00o0O2.OooOO0(null, 1);
                return;
            case 5:
                AiFeaturePublicTestingDialogFragment aiFeaturePublicTestingDialogFragment = (AiFeaturePublicTestingDialogFragment) this.f100093OooOo;
                InterfaceC21987OooOoo viewLifecycleOwner = aiFeaturePublicTestingDialogFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new AiFeaturePublicTestingDialogFragment.OooO0O0(aiFeaturePublicTestingDialogFragment, null), 3);
                return;
            default:
                int id = view.getId();
                ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment = (ReplacePageSelectorDialogFragment) this.f100093OooOo;
                switch (id) {
                    case R.id.btn_page_backward /* 2131296898 */:
                        replacePageSelectorDialogFragment.Oooo0().OooOO0();
                        return;
                    case R.id.btn_page_backward_to_start /* 2131296899 */:
                        C33781o00o0O c33781o00o0O3 = replacePageSelectorDialogFragment.Oooo0().f108653OooOO0O;
                        c33781o00o0O3.getClass();
                        c33781o00o0O3.OooOO0(null, 1);
                        return;
                    case R.id.btn_page_forward /* 2131296900 */:
                        replacePageSelectorDialogFragment.Oooo0().OooO0oo();
                        return;
                    case R.id.btn_page_forward_to_end /* 2131296901 */:
                        C30418Oooo0o0 c30418Oooo0o0Oooo0 = replacePageSelectorDialogFragment.Oooo0();
                        c30418Oooo0o0Oooo0.f108653OooOO0O.setValue(c30418Oooo0o0Oooo0.f108655OooOOO.getValue());
                        return;
                    default:
                        return;
                }
        }
    }
}
