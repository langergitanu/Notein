package o0O0o0oO;

import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.noteeditor.noteswitch.NoteEditorSwitchFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.NewOutlineDialogFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.penkit.models.TextBoxInfo;
import o000OO00.C24452OooO0o0;
import o0oOoOoo.C31102OooO00o;
import o0oOoOoo.C31103OooO0O0;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o000000 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f88969OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f88970OooOo0o;

    public /* synthetic */ o000000(Object obj, int i) {
        this.f88970OooOo0o = i;
        this.f88969OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f88970OooOo0o) {
            case 0:
                ViewOnAttachStateChangeListenerC26064o000000o viewOnAttachStateChangeListenerC26064o000000o = (ViewOnAttachStateChangeListenerC26064o000000o) this.f88969OooOo;
                TextBoxInfo textBoxInfo = viewOnAttachStateChangeListenerC26064o000000o.f88974OooOo0o;
                if (textBoxInfo != null) {
                    viewOnAttachStateChangeListenerC26064o000000o.f88976OooOoO0.OooO0OO(textBoxInfo);
                    return;
                }
                return;
            case 1:
                EditText editText = ((NewOutlineDialogFragment) this.f88969OooOo).f75874OooOooo;
                if (editText != null) {
                    editText.setText("");
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
            default:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteVO");
                NoteVO noteVO = (NoteVO) tag;
                int id = view.getId();
                NoteEditorSwitchFragment noteEditorSwitchFragment = (NoteEditorSwitchFragment) this.f88969OooOo;
                if (id != R.id.more) {
                    LockNoteFragment lockNoteFragmentOooOoo0 = noteEditorSwitchFragment.OooOoo0();
                    InterfaceC21987OooOoo viewLifecycleOwner = noteEditorSwitchFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    LockNoteFragment.OooOoo(lockNoteFragmentOooOoo0, C21989OooOooO.OooO00o(viewLifecycleOwner), com.facebook.soloader.OooOo.OooO0oO(noteVO.getId()), new C24452OooO0o0(1, noteEditorSwitchFragment, noteVO));
                    return;
                }
                C31102OooO00o c31102OooO00o = noteEditorSwitchFragment.f74714Oooo0;
                if (c31102OooO00o != null) {
                    c31102OooO00o.OooO0O0(view, new C31103OooO0O0(noteVO.getId(), noteVO.isSelected()), ((Number) ((C32443OooOOO) noteEditorSwitchFragment.OooOoo().f73387Oooo0oo.getValue()).f116638OooOo0o).intValue(), false, false, 0);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("noteItemMoreMenu");
                    throw null;
                }
        }
    }
}
