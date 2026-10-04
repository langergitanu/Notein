package o0Oo0Ooo;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.backup.ImportLocalDataDialogFragment;
import com.orion.notein.p607ui.creative_library.purchase.MaterialPurchaseDialogFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.addpage.AddPageFragment;
import com.orion.notein.p607ui.noteeditor.addpage.OooO0OO;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.notelist.folder.ItemDataOfMovingToFolder;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorListContainer;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.user.UserInfoFragment;
import com.orion.notein.p607ui.widget.EdgeFragment;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.List;
import o000o0O0.C24572OooOO0o;
import o000o0O0.C24583OooOo0o;
import o000o0O0.C24587OooOoo;
import o0O0oooO.C26320o0000OoO;
import o0O0oooO.o0000OOO;
import o0Oo00o.C28026OooO0OO;
import o0OoO0oo.C28755o00000o0;
import o0OoO0oo.C28762o0000OO;
import o0o0O00.C30185OooO00o;
import o0o0O00.C30189OooO0o;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0Oo0Ooo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28136OooO0O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f99745OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99746OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28136OooO0O0(Object obj, int i) {
        this.f99746OooOo0o = i;
        this.f99745OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C24572OooOO0o c24572OooOO0oOooO0OO;
        C24583OooOo0o c24583OooOo0oOooO0oO;
        Object obj = this.f99745OooOo;
        switch (this.f99746OooOo0o) {
            case 0:
                ((MaterialPurchaseDialogFragment) obj).dismiss();
                break;
            case 1:
                ((AddPageFragment) obj).OooOoO().OooO0o(new OooO0OO.OooO00o.OooO0O0("get_pdf_path"));
                break;
            case 2:
                int i = PenBoxChildFragment.f75355o0000Ooo;
                ((PenBoxChildFragment) obj).Oooo0o().OooOOO0(DrawToolFactory.LASSO_TYPE_RECT);
                break;
            case 3:
                C28755o00000o0 c28755o00000o0 = ((BaseToolbarChildFragment) obj).f76506o000oOoO;
                if (c28755o00000o0 != null) {
                    NoteEditorContainerFragment noteEditorContainerFragment = c28755o00000o0.f101844OooO00o;
                    if (noteEditorContainerFragment.OooOooO() && (c24583OooOo0oOooO0oO = (c24572OooOO0oOooO0OO = C21030OooOO0o.OooO0OO(noteEditorContainerFragment)).OooO0oO()) != null && c24583OooOo0oOooO0oO.f83302OooOooO == R.id.noteEditorContainerFragment) {
                        if (noteEditorContainerFragment.OooOooo().f101860OooO0O0 != null) {
                            c24572OooOO0oOooO0OO.OooOOO0(R.id.noteListContainerFragment, BundleKt.bundleOf(new C32443OooOOO("initial_folder", noteEditorContainerFragment.OooOooo().f101860OooO0O0)), new C24587OooOoo(false, false, R.id.noteListContainerFragment, true, false, -1, -1, -1, -1));
                        } else {
                            c24572OooOO0oOooO0OO.OooOOOO(new C28762o0000OO(0));
                        }
                    }
                }
                break;
            case 4:
                C30189OooO0o c30189OooO0o = ((C30185OooO00o) obj).f107468OooO0O0;
                List<NoteVO> list = (List) c30189OooO0o.f107496OooO0O0.f77172OooooOO.f121747OooOo0o.getValue();
                ArrayList arrayList = new ArrayList();
                for (NoteVO noteVO : list) {
                    int type = noteVO.getType();
                    ItemDataOfMovingToFolder itemDataOfMovingToFolder = type != 0 ? type != 1 ? null : new ItemDataOfMovingToFolder(null, noteVO.getId(), noteVO.getType(), 1) : new ItemDataOfMovingToFolder(noteVO.getId(), null, noteVO.getType(), 2);
                    if (itemDataOfMovingToFolder != null) {
                        arrayList.add(itemDataOfMovingToFolder);
                    }
                }
                ItemDataOfMovingToFolder[] itemDataOfMovingToFolderArr = (ItemDataOfMovingToFolder[]) arrayList.toArray(new ItemDataOfMovingToFolder[0]);
                EdgeFragment edgeFragment = c30189OooO0o.f107495OooO00o;
                Context contextRequireContext = edgeFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(edgeFragment), o0oo000O.OooOO0O.OooO00o(contextRequireContext) ? R.id.moveToFolderDialogFragment : R.id.moveToFolderBottomSheetFragment, BundleKt.bundleOf(new C32443OooOOO("itemDataList", itemDataOfMovingToFolderArr)));
                break;
            case 5:
                int i2 = AiOcrEditorListContainer.f78420OoooOOO;
                ((AiOcrEditorListContainer) obj).OooO0O0(14, Boolean.valueOf(!view.isActivated()));
                break;
            case 6:
                UserInfoFragment userInfoFragment = (UserInfoFragment) obj;
                C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) userInfoFragment.f79649OoooO0O.getValue();
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c26320o0000OoO);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new o0000OOO(null, c26320o0000OoO), 2);
                C24572OooOO0o c24572OooOO0oOooO0OO2 = C21030OooOO0o.OooO0OO(userInfoFragment);
                if (!c24572OooOO0oOooO0OO2.OooOOo(R.id.noteListContainerFragment, false)) {
                    c24572OooOO0oOooO0OO2.OooOOo0();
                }
                break;
            default:
                ActivityC21897OooOo0 activity = ((ImportLocalDataDialogFragment) obj).getActivity();
                MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                if (mainActivity != null) {
                    mainActivity.openMembershipPlans();
                }
                break;
        }
    }
}
