package o0OoOO00;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.backup.ImportCloudDataDialogFragment;
import com.orion.notein.p607ui.login.entry.WelcomeFragment;
import com.orion.notein.p607ui.noteeditor.addpage.AddPageBottomSheetDialogFragment;
import com.orion.notein.p607ui.noteeditor.textstylebar.TextStyleBarChildFragment;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorListContainer;
import com.orion.notein.p607ui.ocr.view.AiOcrRichEditor;
import com.orion.notein.p607ui.pageeditor.TiledPageListContainerFragment;
import com.orion.notein.ui.backup.ImportCloudDataDialogFragment.OooO0OO;
import com.orion.notein.ui.noteeditor.addpage.AddPageBottomSheetDialogFragment.OooO00o;
import o000o0O0.C24564OooO00o;
import o00o00.C25206OooO0Oo;
import o0Oo00o.C28026OooO0OO;
import oO0Oo.C33176OooOOo0;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0OoOO00.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28989OooO00o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f102730OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f102731OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28989OooO00o(Object obj, int i) {
        this.f102731OooOo0o = i;
        this.f102730OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f102731OooOo0o) {
            case 0:
                AddPageBottomSheetDialogFragment addPageBottomSheetDialogFragment = (AddPageBottomSheetDialogFragment) this.f102730OooOo;
                InterfaceC21987OooOoo viewLifecycleOwner = addPageBottomSheetDialogFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, addPageBottomSheetDialogFragment.new OooO00o(null), 3);
                break;
            case 1:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((WelcomeFragment) this.f102730OooOo), new C24564OooO00o(R.id.action_welcomeFragment_to_loginFragment));
                break;
            case 2:
                ((TextStyleBarChildFragment) this.f102730OooOo).OooOooO(false);
                break;
            case 3:
                ((TiledPageListContainerFragment) this.f102730OooOo).Oooo0O0();
                break;
            case 4:
                AiOcrEditorListContainer aiOcrEditorListContainer = (AiOcrEditorListContainer) this.f102730OooOo;
                AiOcrRichEditor aiOcrRichEditor = aiOcrEditorListContainer.f78424OooOoO0;
                if (aiOcrRichEditor != null) {
                    if (!aiOcrRichEditor.onTextContextMenuItem(android.R.id.cut)) {
                        Context context = aiOcrEditorListContainer.getContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
                        String string = aiOcrEditorListContainer.getContext().getString(R.string.failed_to_copy_to_clipboard);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                        C25206OooO0Oo.OooO0oO(context, string);
                    } else {
                        Context context2 = aiOcrEditorListContainer.getContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(context2, "getContext(...)");
                        String string2 = aiOcrEditorListContainer.getContext().getString(R.string.success_to_copy_to_clipboard);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                        C25206OooO0Oo.OooO0oO(context2, string2);
                    }
                    break;
                }
                break;
            case 5:
                ImportCloudDataDialogFragment importCloudDataDialogFragment = (ImportCloudDataDialogFragment) this.f102730OooOo;
                InterfaceC21987OooOoo viewLifecycleOwner2 = importCloudDataDialogFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, importCloudDataDialogFragment.new OooO0OO(null), 3);
                break;
            default:
                TextRecognizeFragment textRecognizeFragment = (TextRecognizeFragment) this.f102730OooOo;
                InterfaceC21987OooOoo viewLifecycleOwner3 = textRecognizeFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner3), null, null, new C33176OooOOo0(textRecognizeFragment, null), 3);
                break;
        }
    }
}
