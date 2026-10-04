package o0O0o0oO;

import Oooo0oO.C21030OooOO0o;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.noteswitch.NoteEditorSwitchFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.pay.aiquota.AiQuotaPayDialogFragment;
import com.orion.notein.p607ui.user.settings.home.UserSettingFragment;
import com.orion.penkit.models.TextBoxInfo;
import com.orion.penkit.tools.DrawToolFactory;
import o0O0oooO.C26320o0000OoO;
import o0O0oooO.C26351o00ooo;
import o0Oo00o.C28026OooO0OO;
import o0o00oo.C30108OooOOOo;
import o0o0OOoO.C30555OooO0o;
import o0oOoOoo.C31102OooO00o;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class oo0o0Oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f89017OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f89018OooOo0o;

    public /* synthetic */ oo0o0Oo(Object obj, int i) {
        this.f89018OooOo0o = i;
        this.f89017OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [oO0o0OO.Oooo00o, void] */
    /* JADX WARN: Type inference failed for: r9v11, types: [com.orion.notein.ui.notelist.documents.NoteListContainerFragment, java.lang.String] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f89018OooOo0o) {
            case 0:
                ViewOnAttachStateChangeListenerC26064o000000o viewOnAttachStateChangeListenerC26064o000000o = (ViewOnAttachStateChangeListenerC26064o000000o) this.f89017OooOo;
                TextBoxInfo textBoxInfo = viewOnAttachStateChangeListenerC26064o000000o.f88974OooOo0o;
                if (textBoxInfo != null) {
                    viewOnAttachStateChangeListenerC26064o000000o.f88976OooOoO0.OooO0o(textBoxInfo);
                    return;
                }
                return;
            case 1:
                PenBox penBox = (PenBox) this.f89017OooOo;
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
                imageView2.setSelected(true);
                ImageView imageView3 = penBox.f76782o00oO0o;
                if (imageView3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("eraserLasso");
                    throw null;
                }
                imageView3.setSelected(false);
                PenBox.OooO00o oooO00o = penBox.eraserTypeListener;
                if (oooO00o != null) {
                    oooO00o.OooO0O0(DrawToolFactory.ERASER_TYPE_STROKE);
                    return;
                }
                return;
            case 2:
                ?? r9 = (NoteListContainerFragment) this.f89017OooOo;
                C33609OooO0oo.OooO0OO(Bundle.putString(r9, "getViewLifecycleOwner(...)"), null, null, new C30108OooOOOo(r9, null), 3);
                return;
            case 3:
                AiQuotaPayDialogFragment aiQuotaPayDialogFragment = (AiQuotaPayDialogFragment) this.f89017OooOo;
                if (((C26320o0000OoO) aiQuotaPayDialogFragment.f78721Oooo00O.getValue()).f90227OooOoOO.f121747OooOo0o.getValue() != 0) {
                    InterfaceC21987OooOoo viewLifecycleOwner = aiQuotaPayDialogFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30555OooO0o(aiQuotaPayDialogFragment, null), 3);
                    return;
                } else {
                    String string = aiQuotaPayDialogFragment.getString(R.string.login_first);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(aiQuotaPayDialogFragment), new C26351o00ooo(string));
                    return;
                }
            case 4:
                NoteEditorSwitchFragment noteEditorSwitchFragment = (NoteEditorSwitchFragment) this.f89017OooOo;
                C31102OooO00o c31102OooO00o = noteEditorSwitchFragment.f74714Oooo0;
                if (c31102OooO00o == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("noteItemMoreMenu");
                    throw null;
                }
                kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                c31102OooO00o.OooO0O0(view, null, ((Number) ((C32443OooOOO) noteEditorSwitchFragment.OooOoo().f73387Oooo0oo.getValue()).f116638OooOo0o).intValue(), false, false, 0);
                return;
            default:
                UserSettingFragment.OooOoO((UserSettingFragment) this.f89017OooOo);
                return;
        }
    }
}
