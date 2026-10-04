package o0Oo0ooO;

import Oooo0oO.C21030OooOO0o;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.o0OoOo0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.domain.models.ocr.AiOcrSession;
import com.orion.notein.domain.models.ocr.AiOcrSessionInputSource;
import com.orion.notein.p607ui.backup.ImportCloudDataDialogFragment;
import com.orion.notein.p607ui.label.DeleteLabelDialogFragment;
import com.orion.notein.p607ui.noteeditor.addpage.AddPageDialogFragment;
import com.orion.notein.p607ui.noteeditor.textstylebar.TextStyleBarChildFragment;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorListContainer;
import com.orion.notein.p607ui.ocr.view.AiOcrRichEditor;
import com.orion.notein.p607ui.pageeditor.TiledPageListContainerFragment;
import com.orion.notein.p607ui.user.UserInfoFragment;
import com.orion.notein.p607ui.user.message.UserMessagesDialogFragment;
import java.util.Iterator;
import java.util.List;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0o000oO.C29785OooOO0;
import o0oOoOo.C31030OooO00o;
import o0oOoOo.C31055OooOoOO;
import o0oOoOo.C31087Oooooo0;
import o0oOoo00.C31139OooOoO;
import oO00ooO.C32443OooOOO;
import oO0Oo.C33188Oooo00O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0ooO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28407OooO00o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100703OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100704OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28407OooO00o(Object obj, int i) {
        this.f100704OooOo0o = i;
        this.f100703OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AiOcrSessionInputSource inputSource;
        Object obj = this.f100703OooOo;
        switch (this.f100704OooOo0o) {
            case 0:
                Dialog dialog = ((DeleteLabelDialogFragment) obj).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 1:
                ((com.orion.notein.p607ui.noteeditor.addpage.OooO0OO) ((AddPageDialogFragment) obj).f73789Oooo00O.getValue()).OooO0oO();
                return;
            case 2:
                TextStyleBarChildFragment textStyleBarChildFragment = (TextStyleBarChildFragment) obj;
                if (textStyleBarChildFragment.f76455Ooooo0o == null) {
                    Context contextRequireContext = textStyleBarChildFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o oooO00o = new com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o(contextRequireContext);
                    oooO00o.f74088OooO0O0 = new C29785OooOO0(textStyleBarChildFragment);
                    textStyleBarChildFragment.f76455Ooooo0o = oooO00o;
                    List<C31087Oooooo0> list = (List) textStyleBarChildFragment.OooOoOO().f102913OooOo0O.f121747OooOo0o.getValue();
                    com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o oooO00o2 = textStyleBarChildFragment.f76455Ooooo0o;
                    if (oooO00o2 != null) {
                        oooO00o2.OooO0Oo(list);
                    }
                }
                com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o oooO00o3 = textStyleBarChildFragment.f76455Ooooo0o;
                if (oooO00o3 != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(oooO00o3.OooO0O0()), null, null, new com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO0O0(oooO00o3, view, null), 3);
                    return;
                }
                return;
            case 3:
                ((TiledPageListContainerFragment) obj).Oooo0();
                return;
            case 4:
                AiOcrRichEditor aiOcrRichEditor = ((AiOcrEditorListContainer) obj).f78424OooOoO0;
                if (aiOcrRichEditor == null) {
                    return;
                }
                aiOcrRichEditor.onTextContextMenuItem(R.id.paste);
                return;
            case 5:
                UserInfoFragment userInfoFragment = (UserInfoFragment) obj;
                Context contextRequireContext2 = userInfoFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
                if (o0oo000O.OooOO0O.OooO00o(contextRequireContext2)) {
                    new UserMessagesDialogFragment().show(userInfoFragment.getParentFragmentManager(), "UserMessagesDialogFragment");
                    return;
                } else {
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(userInfoFragment), new C24564OooO00o(com.orion.notein.global.R.id.action_userInfoFragment_to_userMessageFragment));
                    return;
                }
            case 6:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteinFileVO");
                C31055OooOoOO c31055OooOoOO = (C31055OooOoOO) tag;
                ImportCloudDataDialogFragment importCloudDataDialogFragment = (ImportCloudDataDialogFragment) obj;
                if (c31055OooOoOO.f110871OooO0Oo) {
                    importCloudDataDialogFragment.OooOoo0().OooOOO0(c31055OooOoOO.f110870OooO0OO);
                    return;
                }
                com.orion.notein.p607ui.backup.OooO00o oooO00oOooOoo0 = importCloudDataDialogFragment.OooOoo0();
                String id = c31055OooOoOO.f110868OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooO00oOooOoo0);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C31139OooOoO(oooO00oOooOoo0, id, null), 2);
                return;
            default:
                TextRecognizeFragment textRecognizeFragment = (TextRecognizeFragment) obj;
                AiOcrSession aiOcrSession = (AiOcrSession) textRecognizeFragment.Oooo00O().f108506OooOOo0.f121747OooOo0o.getValue();
                if (aiOcrSession == null || (inputSource = aiOcrSession.getInputSource()) == null) {
                    return;
                }
                oO0OO.OooO00o oooO00o4 = textRecognizeFragment.f78178OoooO;
                if (oooO00o4 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("adapter");
                    throw null;
                }
                List<T> list2 = oooO00o4.f66021OooO00o.f65811OooO0o;
                kotlin.jvm.internal.OooOOO0.OooO0o(list2, "getCurrentList(...)");
                int size = list2.size();
                int iFindFirstCompletelyVisibleItemPosition = 0;
                if (size <= 0) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("TextRecognizeFragment");
                    c20358OooO00o.OooOO0O("handleRetryButtonClicked. textPageCount <= 0", new Object[0]);
                }
                AiOcrEditorListContainer aiOcrEditorListContainer = textRecognizeFragment.f78179OoooO0;
                if (aiOcrEditorListContainer == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editorListContainer");
                    throw null;
                }
                AiOcrRichEditor aiOcrRichEditor2 = aiOcrEditorListContainer.f78424OooOoO0;
                if (aiOcrRichEditor2 != null) {
                    aiOcrRichEditor2.clearFocus();
                }
                oO0OO.OooO00o oooO00o5 = textRecognizeFragment.f78178OoooO;
                if (oooO00o5 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("adapter");
                    throw null;
                }
                List<T> list3 = oooO00o5.f66021OooO00o.f65811OooO0o;
                kotlin.jvm.internal.OooOOO0.OooO0o(list3, "getCurrentList(...)");
                Iterator it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        iFindFirstCompletelyVisibleItemPosition = -1;
                    } else if (!((C31030OooO00o) it.next()).f110776OooO0Oo) {
                        iFindFirstCompletelyVisibleItemPosition++;
                    }
                }
                if (iFindFirstCompletelyVisibleItemPosition == -1) {
                    RecyclerView recyclerView = textRecognizeFragment.f78181OoooO0O;
                    if (recyclerView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editorList");
                        throw null;
                    }
                    RecyclerView.OooOOOO layoutManager = recyclerView.getLayoutManager();
                    kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                    if (iFindFirstCompletelyVisibleItemPosition == -1) {
                        iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    }
                }
                C32443OooOOO c32443OooOOO = (C32443OooOOO) textRecognizeFragment.Oooo00O().f108501OooOOO.f121747OooOo0o.getValue();
                int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
                ((Number) c32443OooOOO.f116637OooOo).intValue();
                if (iIntValue <= 0) {
                    textRecognizeFragment.Oooo00o(true);
                    return;
                } else {
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(textRecognizeFragment), new C33188Oooo00O(inputSource, textRecognizeFragment.Oooo00O().f108500OooOO0o, iFindFirstCompletelyVisibleItemPosition, size));
                    return;
                }
        }
    }
}
