package o0O0o0oO;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.C21904OooOoo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.export.WatermarkEditDialogFragment;
import com.orion.notein.p607ui.login.firebase.FirebaseCreateUserSetNameFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.NewOutlineDialogFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.notelist.notefilterbottomsheet.NoteFilterBottomSheetDialog;
import com.orion.notein.p607ui.notelist.search.SearchListFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.ui.notelist.search.SearchListFragment.OooO0O0;
import com.orion.penkit.models.TextBoxInfo;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.List;
import o0O0oooo.C26363OooO0oO;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o0O0O00 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f89000OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f89001OooOo0o;

    public /* synthetic */ o0O0O00(Object obj, int i) {
        this.f89001OooOo0o = i;
        this.f89000OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 1;
        Object obj = this.f89000OooOo;
        switch (this.f89001OooOo0o) {
            case 0:
                ViewOnAttachStateChangeListenerC26064o000000o viewOnAttachStateChangeListenerC26064o000000o = (ViewOnAttachStateChangeListenerC26064o000000o) obj;
                TextBoxInfo textBoxInfo = viewOnAttachStateChangeListenerC26064o000000o.f88974OooOo0o;
                if (textBoxInfo != null) {
                    viewOnAttachStateChangeListenerC26064o000000o.f88976OooOoO0.OooO0O0(textBoxInfo);
                    return;
                }
                return;
            case 1:
                ((WatermarkEditDialogFragment) obj).dismiss();
                return;
            case 2:
                FirebaseCreateUserSetNameFragment firebaseCreateUserSetNameFragment = (FirebaseCreateUserSetNameFragment) obj;
                C21904OooOoo0.OooO0o(new Bundle(), firebaseCreateUserSetNameFragment, "key_firebase_login");
                C21030OooOO0o.OooO0OO(firebaseCreateUserSetNameFragment).OooOOo(R.id.firebaseUserAuthFragment, true);
                return;
            case 3:
                Dialog dialog = ((NewOutlineDialogFragment) obj).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 4:
                PenBox penBox = (PenBox) obj;
                ImageView imageView = penBox.f76783o00ooo;
                if (imageView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("eraserPixel");
                    throw null;
                }
                imageView.setSelected(false);
                ImageView imageView2 = penBox.f76792oo000o;
                if (imageView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("eraserStroke");
                    throw null;
                }
                imageView2.setSelected(false);
                ImageView imageView3 = penBox.f76782o00oO0o;
                if (imageView3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("eraserLasso");
                    throw null;
                }
                imageView3.setSelected(true);
                PenBox.OooO00o oooO00o = penBox.eraserTypeListener;
                if (oooO00o != null) {
                    oooO00o.OooO0O0(DrawToolFactory.ERASER_TYPE_LASSO);
                    return;
                }
                return;
            case 5:
                NoteListContainerFragment noteListContainerFragment = (NoteListContainerFragment) obj;
                if (noteListContainerFragment.f77361Ooooo0o == null) {
                    NoteFilterBottomSheetDialog noteFilterBottomSheetDialog = new NoteFilterBottomSheetDialog();
                    noteListContainerFragment.f77361Ooooo0o = noteFilterBottomSheetDialog;
                    noteFilterBottomSheetDialog.f77824OooOoOO = new C26363OooO0oO(noteListContainerFragment, i);
                }
                NoteFilterBottomSheetDialog noteFilterBottomSheetDialog2 = noteListContainerFragment.f77361Ooooo0o;
                if (noteFilterBottomSheetDialog2 != null) {
                    noteFilterBottomSheetDialog2.OooOoO((List) noteListContainerFragment.OooOoo().f77155Oooo0o.getValue());
                }
                NoteFilterBottomSheetDialog noteFilterBottomSheetDialog3 = noteListContainerFragment.f77361Ooooo0o;
                if (noteFilterBottomSheetDialog3 != null) {
                    noteFilterBottomSheetDialog3.show(noteListContainerFragment.getChildFragmentManager(), "NoteTypeBottomSheetDialog");
                    return;
                }
                return;
            default:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteVO");
                NoteVO noteVO = (NoteVO) tag;
                int id = view.getId();
                SearchListFragment searchListFragment = (SearchListFragment) obj;
                if (id == R.id.is_favorite) {
                    InterfaceC21987OooOoo viewLifecycleOwner = searchListFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, searchListFragment.new OooO0O0(noteVO, null), 2);
                    return;
                }
                if (id != R.id.more) {
                    InterfaceC21987OooOoo viewLifecycleOwner2 = searchListFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new SearchListFragment.OooO0OO(searchListFragment, noteVO, null), 3);
                    return;
                } else {
                    o0o0O0.OooO oooO = searchListFragment.f78014Oooo0;
                    if (oooO == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("noteItemMoreMenu");
                        throw null;
                    }
                    oooO.OooO0OO(view, noteVO);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    return;
                }
        }
    }
}
