package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.graphics.PointF;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseCreateUserPasswordFragment;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.noteeditor.noteswitch.NoteEditorSwitchFragment;
import com.orion.notein.p607ui.noteeditor.pagepadding.PagePaddingFragment;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.ocr.dialog.SessionRenameDialogFragment;
import com.orion.notein.p607ui.paperconfig.components.PaperConfigPreview;
import com.orion.notein.p607ui.user.settings.home.UserSettingFragment;
import o000o0O0.C24564OooO00o;
import o00Ooo.C25080OooOO0o;
import o0Oo00o.C28026OooO0OO;
import o0Ooo0Oo.C29404OooO00o;
import o0Ooo0o.C29415OooO0o;
import o0o00oo.C30109OooOOo;
import o0o0OOOo.EnumC30546OooO0O0;
import o0oOO0Oo.C30800OooO;
import o0oOO0Oo.C30809OooOO0;
import o0oOoOoo.C31102OooO00o;
import o0oOoOoo.C31103OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class OooO0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101127OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101128OooOo0o;

    public /* synthetic */ OooO0OO(Object obj, int i) {
        this.f101128OooOo0o = i;
        this.f101127OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(final View view) {
        Object obj = this.f101127OooOo;
        switch (this.f101128OooOo0o) {
            case 0:
                C21030OooOO0o.OooO0OO((FirebaseCreateUserPasswordFragment) obj).OooOOo(R.id.firebaseUserAuthFragment, false);
                return;
            case 1:
                C25080OooOO0o c25080OooOO0o = ((C29404OooO00o) obj).f104273OooO0O0;
                if (c25080OooOO0o != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    C29415OooO0o c29415OooO0o = ((PagePaddingFragment) c25080OooOO0o.f85125OooO00o).f74941Ooooo0o;
                    if (c29415OooO0o != null) {
                        c29415OooO0o.OooO0o(view, -1, true, true);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("pagePaddingColorPicker");
                        throw null;
                    }
                }
                return;
            case 2:
                NoteListContainerFragment noteListContainerFragment = (NoteListContainerFragment) obj;
                androidx.lifecycle.OooOo oooOoOooO00o = OooO0O0.OooO0o.OooO00o(noteListContainerFragment, "getViewLifecycleOwner(...)");
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30109OooOOo(noteListContainerFragment, null), 2);
                return;
            case 3:
                InterfaceC32507OooOO0o<? super EnumC30546OooO0O0, C32460OooOooO> interfaceC32507OooOO0o = ((PaperConfigPreview) obj).f78701Oooo000;
                if (interfaceC32507OooOO0o != null) {
                    interfaceC32507OooOO0o.invoke(EnumC30546OooO0O0.f109263OooOo);
                    return;
                }
                return;
            case 4:
                final NoteEditorSwitchFragment noteEditorSwitchFragment = (NoteEditorSwitchFragment) obj;
                C31102OooO00o c31102OooO00o = noteEditorSwitchFragment.f74714Oooo0;
                if (c31102OooO00o == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("noteItemMoreMenu");
                    throw null;
                }
                c31102OooO00o.OooO00o();
                Object tag = view.getTag();
                final C31103OooO0O0 c31103OooO0O0 = tag instanceof C31103OooO0O0 ? (C31103OooO0O0) tag : null;
                if (c31103OooO0O0 == null) {
                    switch (view.getId()) {
                        case R.id.item_split_h /* 2131297901 */:
                            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(noteEditorSwitchFragment), null, null, new C30809OooOO0(noteEditorSwitchFragment, null), 3);
                            break;
                        case R.id.item_split_v /* 2131297902 */:
                            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(noteEditorSwitchFragment), null, null, new C30800OooO(noteEditorSwitchFragment, null), 3);
                            break;
                    }
                } else {
                    LockNoteFragment.OooOoo(noteEditorSwitchFragment.OooOoo0(), C21989OooOooO.OooO00o(noteEditorSwitchFragment), com.facebook.soloader.OooOo.OooO0oO(c31103OooO0O0.f110999OooO00o), new oO0O000o.OooO00o() { // from class: o0oOO0Oo.OooO0o
                        @Override // oO0O000o.OooO00o
                        public final Object invoke() {
                            int id = view.getId();
                            NoteEditorSwitchFragment noteEditorSwitchFragment2 = noteEditorSwitchFragment;
                            String str = c31103OooO0O0.f110999OooO00o;
                            switch (id) {
                                case R.id.item_close /* 2131297859 */:
                                    noteEditorSwitchFragment2.OooOoo().OooO0oO(str);
                                    break;
                                case R.id.item_split_h /* 2131297901 */:
                                    noteEditorSwitchFragment2.OooOoo().OooOo0O(str, "", new PointF(0.0f, 0.0f), null, false);
                                    break;
                                case R.id.item_split_v /* 2131297902 */:
                                    noteEditorSwitchFragment2.OooOoo().OooOo(str, "", new PointF(0.0f, 0.0f), null, false);
                                    break;
                                case R.id.item_switch_note /* 2131297905 */:
                                    noteEditorSwitchFragment2.OooOoo().OoooO00();
                                    break;
                                case R.id.item_switch_orientation /* 2131297906 */:
                                    noteEditorSwitchFragment2.OooOoo().Oooo();
                                    break;
                            }
                            return C32460OooOooO.f116667OooO00o;
                        }
                    });
                }
                noteEditorSwitchFragment.OooOoOO();
                return;
            case 5:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((UserSettingFragment) obj), new C24564OooO00o(R.id.action_userSettingFragment_to_nicknameFragment));
                return;
            default:
                Dialog dialog = ((SessionRenameDialogFragment) obj).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
        }
    }
}
