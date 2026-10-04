package o0Oo0o0o;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import androidx.core.os.BundleKt;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.export.ExportBottomSheetFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.NewCommentDialogFragment;
import com.orion.notein.p607ui.notelist.label.LabelListFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.user.message.OooO00o;
import o0OoOO0o.ViewOnClickListenerC29034OooO00o;
import o0OoooOo.C29660OooOoOO;
import o0o00oOo.C30082o00000Oo;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0Oo0o0o.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28232OooOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100069OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100070OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28232OooOO0(Object obj, int i) {
        this.f100070OooOo0o = i;
        this.f100069OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f100069OooOo;
        switch (this.f100070OooOo0o) {
            case 0:
                ((ExportBottomSheetFragment) obj).OooOooo().OooO0oo(1);
                return;
            case 1:
                ViewOnClickListenerC29034OooO00o viewOnClickListenerC29034OooO00o = ((o0OoO.OooO0o) obj).f101042OooOOO;
                if (viewOnClickListenerC29034OooO00o != null) {
                    viewOnClickListenerC29034OooO00o.onClick(view);
                    return;
                }
                return;
            case 2:
                NewCommentDialogFragment newCommentDialogFragment = (NewCommentDialogFragment) obj;
                EditText editText = newCommentDialogFragment.f75789OooOooo;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
                newCommentDialogFragment.requireActivity().getSupportFragmentManager().OooooOo(BundleKt.bundleOf(new C32443OooOOO(NoteMeta.PROPERTY_TITLE, editText.getText().toString()), new C32443OooOOO("page_id", ((C29660OooOoOO) newCommentDialogFragment.f75785OooOoOO.getValue()).f105173OooO0O0)), "create_comment");
                Dialog dialog = newCommentDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 3:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteVO");
                NoteVO noteVO = (NoteVO) tag;
                LabelListFragment labelListFragment = (LabelListFragment) obj;
                C30082o00000Oo c30082o00000Oo = labelListFragment.f77766Oooo0OO;
                if (c30082o00000Oo == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("notePlaceholderItemMoreMenu");
                    throw null;
                }
                c30082o00000Oo.OooO00o();
                if (view.getId() == R.id.item_delete) {
                    InterfaceC21987OooOoo viewLifecycleOwner = labelListFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new o0o0O00O.OooOo(labelListFragment, noteVO, null), 2);
                    return;
                }
                return;
            default:
                OooO00o.InterfaceC23874OooO0Oo interfaceC23874OooO0Oo = ((com.orion.notein.p607ui.user.message.OooO00o) obj).f79784OooO0O0;
                if (interfaceC23874OooO0Oo != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    interfaceC23874OooO0Oo.OooO0O0(view);
                    return;
                }
                return;
        }
    }
}
