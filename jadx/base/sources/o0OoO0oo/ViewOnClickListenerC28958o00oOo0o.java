package o0OoO0oo;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.backup.CloudBackupResultDialogFragment;
import com.orion.notein.p607ui.login.entry.LoginTipsDialogFragment;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.noteeditor.NoteLockedDialogFragment;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorListContainer;
import com.orion.notein.p607ui.ocr.view.AiOcrRichEditor;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.richeditor.effects.Effects;
import o000o0O0.C24564OooO00o;
import o00O0oo0.C24969OooOO0;
import o0Oo00o.C28026OooO0OO;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.C30006OooOooo;
import o0o0O0.C30183OooO0oo;
import o0o0O00.C30201OooOOO0;
import o0oOoOo.C31084OooooOO;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0OoO0oo.o00oOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28958o00oOo0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f102611OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f102612OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28958o00oOo0o(Object obj, int i) {
        this.f102612OooOo0o = i;
        this.f102611OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        final C30201OooOOO0 c30201OooOOO0;
        Object obj = this.f102611OooOo;
        switch (this.f102612OooOo0o) {
            case 0:
                Dialog dialog = ((NoteLockedDialogFragment) obj).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
            case 1:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((LoginTipsDialogFragment) obj), new C24564OooO00o(R.id.action_loginTipsDialogFragment_to_firebaseUserAuthFragment));
                break;
            case 2:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenColorVO");
                PenColorVO penColorVO = (PenColorVO) tag;
                int color = penColorVO.getColor();
                C30006OooOooo c30006OooOooo = (C30006OooOooo) obj;
                int i = c30006OooOooo.f106628OoooO0;
                if (i == 0) {
                    c30006OooOooo.f106610OooOoO.setColorFilter(C24969OooOO0.OooO0OO(color));
                } else if (i == 1) {
                    c30006OooOooo.f106614OooOoo0.setColorFilter(C24969OooOO0.OooO0OO(color));
                }
                C29936OooO0oO c29936OooO0oO = c30006OooOooo.f106617Oooo;
                if (c29936OooO0oO != null) {
                    c29936OooO0oO.OooO0Oo(penColorVO, view, c30006OooOooo.f106620Oooo00O);
                }
                break;
            case 3:
                C30183OooO0oo c30183OooO0oo = (C30183OooO0oo) obj;
                final NoteVO noteVO = c30183OooO0oo.f107461OooO0O0;
                if (noteVO != null && (c30201OooOOO0 = c30183OooO0oo.f107462OooO0OO) != null) {
                    o0o0O0.OooO oooO = c30201OooOOO0.f107552OooO0o0;
                    if (oooO != null) {
                        oooO.OooO00o();
                    }
                    LockNoteFragment lockNoteFragmentInvoke = c30201OooOOO0.f107548OooO0O0.invoke();
                    InterfaceC21987OooOoo viewLifecycleOwner = c30201OooOOO0.f107547OooO00o.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    LockNoteFragment.OooOoo(lockNoteFragmentInvoke, C21989OooOooO.OooO00o(viewLifecycleOwner), com.facebook.soloader.OooOo.OooO0oO(noteVO.getId()), new oO0O000o.OooO00o() { // from class: o0o0O00.OooO
                        @Override // oO0O000o.OooO00o
                        public final Object invoke() {
                            C30201OooOOO0 c30201OooOOO02 = c30201OooOOO0;
                            InterfaceC21987OooOoo viewLifecycleOwner2 = c30201OooOOO02.f107547OooO00o.getViewLifecycleOwner();
                            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new C30208OooOo0(noteVO, null, c30201OooOOO02), 3);
                            return C32460OooOooO.f116667OooO00o;
                        }
                    });
                    break;
                }
                break;
            case 4:
                int i2 = AiOcrEditorListContainer.f78420OoooOOO;
                Object tag2 = view.getTag();
                C31084OooooOO c31084OooooOO = tag2 instanceof C31084OooooOO ? (C31084OooooOO) tag2 : null;
                if (c31084OooooOO != null) {
                    AiOcrEditorListContainer aiOcrEditorListContainer = (AiOcrEditorListContainer) obj;
                    boolean z = c31084OooooOO.f110941OooO0OO;
                    int i3 = c31084OooooOO.f110939OooO00o;
                    if (!z) {
                        AiOcrRichEditor aiOcrRichEditor = aiOcrEditorListContainer.f78424OooOoO0;
                        if (aiOcrRichEditor != null) {
                            if (i3 != 0) {
                                aiOcrRichEditor.applyEffect(Effects.BACKGROUND_COLOR, Integer.valueOf(i3), false);
                            } else {
                                aiOcrRichEditor.removeEffect(Effects.BACKGROUND_COLOR, false);
                            }
                            break;
                        }
                    } else {
                        AiOcrRichEditor aiOcrRichEditor2 = aiOcrEditorListContainer.f78424OooOoO0;
                        if (aiOcrRichEditor2 != null) {
                            if (i3 != -16777216) {
                                aiOcrRichEditor2.applyEffect(Effects.FOREGROUND_COLOR, Integer.valueOf(i3), false);
                            } else {
                                aiOcrRichEditor2.removeEffect(Effects.FOREGROUND_COLOR, false);
                            }
                            break;
                        }
                    }
                }
                break;
            case 5:
                Dialog dialog2 = ((CloudBackupResultDialogFragment) obj).getDialog();
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
                break;
            default:
                TextRecognizeFragment.Oooo0O0((TextRecognizeFragment) obj, 3, false, 6);
                break;
        }
    }
}
