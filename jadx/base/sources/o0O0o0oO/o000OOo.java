package o0O0o0oO;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.core.os.BundleKt;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseCreateUserSetNameFragment;
import com.orion.notein.p607ui.noteeditor.noteswitch.NoteEditorSwitchFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.NewOutlineDialogFragment;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.p609vo.SortKeyVO;
import com.orion.notein.ui.noteeditor.noteswitch.NoteEditorSwitchFragment.OooO00o;
import com.orion.penkit.models.TextBoxInfo;
import o0Ooooo0.C29715OooOOo0;
import o0o00oo.C30114OooOo0;
import o0o0O0o.C30294OooO0OO;
import o0oOO0Oo.C30816OooOOo;
import o0oOO0Oo.C30821OooOo0O;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o000OOo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f88977OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f88978OooOo0o;

    public /* synthetic */ o000OOo(Object obj, int i) {
        this.f88978OooOo0o = i;
        this.f88977OooOo = obj;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [com.orion.notein.ui.notelist.documents.NoteListContainerFragment, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v15, types: [oO0o0OO.Oooo00o, void] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        Object obj = this.f88977OooOo;
        switch (this.f88978OooOo0o) {
            case 0:
                ViewOnAttachStateChangeListenerC26064o000000o viewOnAttachStateChangeListenerC26064o000000o = (ViewOnAttachStateChangeListenerC26064o000000o) obj;
                TextBoxInfo textBoxInfo = viewOnAttachStateChangeListenerC26064o000000o.f88974OooOo0o;
                if (textBoxInfo != null) {
                    viewOnAttachStateChangeListenerC26064o000000o.f88976OooOoO0.OooO0oO(textBoxInfo);
                    return;
                }
                return;
            case 1:
                C21030OooOO0o.OooO0OO((FirebaseCreateUserSetNameFragment) obj).OooOOo(R.id.firebaseUserAuthFragment, false);
                return;
            case 2:
                NewOutlineDialogFragment newOutlineDialogFragment = (NewOutlineDialogFragment) obj;
                EditText editText = newOutlineDialogFragment.f75874OooOooo;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
                newOutlineDialogFragment.requireActivity().getSupportFragmentManager().OooooOo(BundleKt.bundleOf(new C32443OooOOO(NoteMeta.PROPERTY_TITLE, editText.getText().toString()), new C32443OooOOO("page_id", ((C29715OooOOo0) newOutlineDialogFragment.f75870OooOoOO.getValue()).f105361OooO0O0)), "create_outline");
                Dialog dialog = newOutlineDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 3:
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteListContainerFragment");
                c20358OooO00o.OooO0o0("sync button onClick.", new Object[0]);
                ?? r4 = (NoteListContainerFragment) obj;
                C33609OooO0oo.OooO0OO(Bundle.putString(r4, "getViewLifecycleOwner(...)"), null, null, new C30114OooOo0(r4, null), 3);
                return;
            default:
                kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
                Object tag = v.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.SortKeyVO");
                SortKeyVO sortKeyVO = (SortKeyVO) tag;
                NoteEditorSwitchFragment noteEditorSwitchFragment = (NoteEditorSwitchFragment) obj;
                C30294OooO0OO c30294OooO0OO = noteEditorSwitchFragment.f74718Oooo0O0;
                if (c30294OooO0OO != null) {
                    c30294OooO0OO.OooO00o();
                }
                if (sortKeyVO.isVipBadgeVisible()) {
                    InterfaceC21987OooOoo viewLifecycleOwner = noteEditorSwitchFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, noteEditorSwitchFragment.new OooO00o(null), 3);
                    return;
                } else {
                    C30821OooOo0O c30821OooOo0OOooOooO = noteEditorSwitchFragment.OooOooO();
                    com.orion.notein.p607ui.p609vo.OooO00o sortKey = sortKeyVO.getKey();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(sortKey, "sortKey");
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c30821OooOo0OOooOooO);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30816OooOOo(c30821OooOo0OOooOooO, sortKey, null), 2);
                    return;
                }
        }
    }
}
