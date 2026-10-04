package o0OoO0oo;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import androidx.core.os.BundleKt;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateBookPaperTheme;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.JumpToPageDialogFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.EditorCommentFragment;
import com.orion.notein.p607ui.notelist.NoteListFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.p609vo.ThemeVO;
import com.orion.notein.p607ui.paperconfig.MyTemplateFragment;
import com.orion.notein.p607ui.user.firebase.FirebaseUserInfoFragment;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0OoOOO0.C29048OooO0oo;
import o0o00oOo.C30043OooOo0;
import o0o00oOo.C30082o00000Oo;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoO0oo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28702OooOOoo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101702OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101703OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28702OooOOoo(Object obj, int i) {
        this.f101703OooOo0o = i;
        this.f101702OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f101702OooOo;
        switch (this.f101703OooOo0o) {
            case 0:
                JumpToPageDialogFragment jumpToPageDialogFragment = (JumpToPageDialogFragment) obj;
                EditText editText = jumpToPageDialogFragment.f72793Oooo0O0;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
                try {
                    int i = Integer.parseInt(editText.getText().toString());
                    Log.d("JumpToPageDialogFragment", "jump to page " + i);
                    jumpToPageDialogFragment.requireActivity().getSupportFragmentManager().OooooOo(BundleKt.bundleOf(new C32443OooOOO("page_number", Integer.valueOf(i))), "jump_to_page");
                    break;
                } catch (Exception unused) {
                    Log.d("JumpToPageDialogFragment", "page number is not valid");
                }
                Dialog dialog = jumpToPageDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 1:
                ((C29048OooO0oo) obj).getClass();
                return;
            case 2:
                ((EditorCommentFragment) obj).requireActivity().getSupportFragmentManager().OooooOo(new Bundle(), "clear_comment");
                return;
            case 3:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteVO");
                NoteVO noteVO = (NoteVO) tag;
                NoteListFragment noteListFragment = (NoteListFragment) obj;
                C30082o00000Oo c30082o00000Oo = noteListFragment.f77023Oooo0o0;
                if (c30082o00000Oo == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("notePlaceholderItemMoreMenu");
                    throw null;
                }
                c30082o00000Oo.OooO00o();
                if (view.getId() == R.id.item_delete) {
                    InterfaceC21987OooOoo viewLifecycleOwner = noteListFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30043OooOo0(noteListFragment, noteVO, null), 2);
                    return;
                }
                return;
            case 4:
                Object tag2 = view.getTag();
                ThemeVO themeVO = tag2 instanceof ThemeVO ? (ThemeVO) tag2 : null;
                if (themeVO == null) {
                    return;
                }
                MyTemplateFragment myTemplateFragment = (MyTemplateFragment) obj;
                myTemplateFragment.getClass();
                String myTemplateId = themeVO.getMyTemplateId();
                if (myTemplateId != null) {
                    PaperTheme paperTheme = themeVO.getPaperTheme();
                    TemplateBookPaperTheme templateBookPaperTheme = paperTheme instanceof TemplateBookPaperTheme ? (TemplateBookPaperTheme) paperTheme : null;
                    if (templateBookPaperTheme == null) {
                        return;
                    }
                    if (templateBookPaperTheme.hasVariants()) {
                        myTemplateFragment.OooOooo().OooOoOO(myTemplateId, templateBookPaperTheme.getSelectedOrientation(), templateBookPaperTheme.getSelectedColor());
                        myTemplateFragment.Oooo0o(myTemplateId, templateBookPaperTheme);
                    } else {
                        myTemplateFragment.OooOooo().OooOOOO();
                    }
                    myTemplateFragment.OooOooo().OooOo0o(myTemplateId);
                    return;
                }
                return;
            default:
                FirebaseUserInfoFragment firebaseUserInfoFragment = (FirebaseUserInfoFragment) obj;
                firebaseUserInfoFragment.getClass();
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(firebaseUserInfoFragment), new C24564OooO00o(R.id.action_firebaseUserInfoFragment_to_vipFeaturesComparisonFragment));
                return;
        }
    }
}
