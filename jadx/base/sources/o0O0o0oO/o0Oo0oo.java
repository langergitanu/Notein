package o0O0o0oO;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.view.View;
import com.orion.notein.p607ui.login.firebase.FirebaseCreateUserPasswordFragment;
import com.orion.notein.p607ui.noteeditor.noteswitch.NoteEditorSwitchFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.notelist.folder.ItemDataOfMovingToFolder;
import com.orion.notein.p607ui.notelist.notefilterbottomsheet.NoteFilterBottomSheetDialog;
import com.orion.notein.p607ui.notelist.search.SearchListContainerFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import com.orion.notein.p607ui.p609vo.SortKeyVO;
import com.orion.notein.p607ui.pay.aiquota.AiQuotaPayDialogFragment;
import com.orion.penkit.models.TextBoxInfo;
import java.util.ArrayList;
import java.util.List;
import o0Oo00o.C28026OooO0OO;
import o0o00oo.C30129Oooo0OO;
import o0o00oo.C30131Oooo0o0;
import o0o0O0OO.C30276OooO0OO;
import o0o0O0o.C30294OooO0OO;
import o0oOoOo.C31042OooOOO0;
import o0oOoOoO.C31097OooO0Oo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o0Oo0oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f89006OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f89007OooOo0o;

    public /* synthetic */ o0Oo0oo(Object obj, int i) {
        this.f89007OooOo0o = i;
        this.f89006OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o000o0O0.OooOo c30129Oooo0OO;
        int i = 4;
        int i2 = 0;
        Object obj = this.f89006OooOo;
        switch (this.f89007OooOo0o) {
            case 0:
                ViewOnAttachStateChangeListenerC26064o000000o viewOnAttachStateChangeListenerC26064o000000o = (ViewOnAttachStateChangeListenerC26064o000000o) obj;
                TextBoxInfo textBoxInfo = viewOnAttachStateChangeListenerC26064o000000o.f88974OooOo0o;
                if (textBoxInfo != null) {
                    viewOnAttachStateChangeListenerC26064o000000o.f88976OooOoO0.OooO0o0(textBoxInfo);
                    return;
                }
                return;
            case 1:
                Context contextRequireContext = ((FirebaseCreateUserPasswordFragment) obj).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31097OooO0Oo(contextRequireContext, null), 3);
                return;
            case 2:
                int i3 = PenBox.f76736o000OOo;
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenWidthVO");
                PenBox penBox = (PenBox) obj;
                if (!((PenWidthVO) tag).getSelected()) {
                    View.OnClickListener onClickListener = penBox.penWidthItemClickListener;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    return;
                }
                com.orion.notein.p607ui.noteeditor.toolbox.OooO00o oooO00o = penBox.f76779o00Ooo;
                if (oooO00o != null) {
                    oooO00o.OooO0O0(view);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("eraserWidthPopupWindow");
                    throw null;
                }
            case 3:
                NoteListContainerFragment noteListContainerFragment = (NoteListContainerFragment) obj;
                List<NoteVO> list = (List) noteListContainerFragment.OooOoo().f77172OooooOO.f121747OooOo0o.getValue();
                ArrayList arrayList = new ArrayList();
                for (NoteVO noteVO : list) {
                    int type = noteVO.getType();
                    ItemDataOfMovingToFolder itemDataOfMovingToFolder = type != 0 ? type != 1 ? null : new ItemDataOfMovingToFolder(null, noteVO.getId(), noteVO.getType(), 1) : new ItemDataOfMovingToFolder(noteVO.getId(), null, noteVO.getType(), 2);
                    if (itemDataOfMovingToFolder != null) {
                        arrayList.add(itemDataOfMovingToFolder);
                    }
                }
                ItemDataOfMovingToFolder[] itemDataList = (ItemDataOfMovingToFolder[]) arrayList.toArray(new ItemDataOfMovingToFolder[0]);
                Context contextRequireContext2 = noteListContainerFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
                if (o0oo000O.OooOO0O.OooO00o(contextRequireContext2)) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(itemDataList, "itemDataList");
                    c30129Oooo0OO = new C30131Oooo0o0(itemDataList);
                } else {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(itemDataList, "itemDataList");
                    c30129Oooo0OO = new C30129Oooo0OO(itemDataList);
                }
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(noteListContainerFragment), c30129Oooo0OO);
                return;
            case 4:
                SearchListContainerFragment searchListContainerFragment = (SearchListContainerFragment) obj;
                if (searchListContainerFragment.f77992Oooo00O == null) {
                    NoteFilterBottomSheetDialog noteFilterBottomSheetDialog = new NoteFilterBottomSheetDialog();
                    searchListContainerFragment.f77992Oooo00O = noteFilterBottomSheetDialog;
                    noteFilterBottomSheetDialog.f77824OooOoOO = new C30276OooO0OO(searchListContainerFragment, i2);
                }
                NoteFilterBottomSheetDialog noteFilterBottomSheetDialog2 = searchListContainerFragment.f77992Oooo00O;
                if (noteFilterBottomSheetDialog2 != null) {
                    noteFilterBottomSheetDialog2.OooOoO((List) searchListContainerFragment.OooOoOO().f108001OooOOo0.getValue());
                }
                NoteFilterBottomSheetDialog noteFilterBottomSheetDialog3 = searchListContainerFragment.f77992Oooo00O;
                if (noteFilterBottomSheetDialog3 != null) {
                    noteFilterBottomSheetDialog3.show(searchListContainerFragment.getChildFragmentManager(), "NoteTypeBottomSheetDialog");
                    return;
                }
                return;
            case 5:
                Object tag2 = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag2, "null cannot be cast to non-null type com.orion.notein.ui.vo.GoogleProductVO");
                C31042OooOOO0 c31042OooOOO0 = (C31042OooOOO0) tag2;
                C33781o00o0O c33781o00o0O = ((AiQuotaPayDialogFragment) obj).Oooo0().f109310OooOOo0;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, c31042OooOOO0);
                C34406OooO00o.f123390OooO00o.OooO00o("product selected: " + c31042OooOOO0, new Object[0]);
                return;
            default:
                NoteEditorSwitchFragment noteEditorSwitchFragment = (NoteEditorSwitchFragment) obj;
                if (noteEditorSwitchFragment.f74718Oooo0O0 == null) {
                    Context contextRequireContext3 = noteEditorSwitchFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext3, "requireContext(...)");
                    noteEditorSwitchFragment.f74718Oooo0O0 = new C30294OooO0OO(contextRequireContext3, new o000OOo(noteEditorSwitchFragment, i));
                }
                List<SortKeyVO> list2 = (List) noteEditorSwitchFragment.OooOooO().f110167OooOO0o.f121747OooOo0o.getValue();
                C30294OooO0OO c30294OooO0OO = noteEditorSwitchFragment.f74718Oooo0O0;
                if (c30294OooO0OO != null) {
                    c30294OooO0OO.OooO0OO(list2);
                }
                C30294OooO0OO c30294OooO0OO2 = noteEditorSwitchFragment.f74718Oooo0O0;
                if (c30294OooO0OO2 != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    C30294OooO0OO.OooO0O0(c30294OooO0OO2, view, Oooo0.o000000O.OooO0o(25), 4);
                    return;
                }
                return;
        }
    }
}
