package o0O0o0oO;

import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.p607ui.export.ExportProgressDialogFragment;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.TextStyleBox;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.EditorOutlineFragment;
import com.orion.notein.p607ui.ocr.dialog.SelectNoteDialogFragment;
import com.orion.notein.p607ui.user.settings.home.UserSettingFragment;
import java.util.concurrent.CancellationException;
import o0o00Oo.C29894OooO00o;
import o0o0OOO0.C30544OooO0O0;
import o0oOoO0.C30997OooO0o;
import o0oOoOo.C31083OooooO0;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.o00000OO;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o00O0O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f88983OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f88984OooOo0o;

    public /* synthetic */ o00O0O(Object obj, int i) {
        this.f88984OooOo0o = i;
        this.f88983OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f88983OooOo;
        switch (this.f88984OooOo0o) {
            case 0:
                ((C26068o0ooOO0) obj).f89008OooO00o.f89014OooO0O0.OooO00o();
                return;
            case 1:
                ExportProgressDialogFragment exportProgressDialogFragment = (ExportProgressDialogFragment) obj;
                o00000OO o00000oo2 = ((com.orion.notein.p607ui.export.OooO0o) exportProgressDialogFragment.f71662Oooo00O.getValue()).f71755OooO0oO;
                if (o00000oo2 != null) {
                    o00000oo2.cancel((CancellationException) null);
                }
                exportProgressDialogFragment.dismissAllowingStateLoss();
                return;
            case 2:
                int i = TextStyleBox.f74132o000oOoO;
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.TextBoxColorVO");
                C31083OooooO0 c31083OooooO0 = (C31083OooooO0) tag;
                ((TextStyleBox) obj).OooOO0(c31083OooooO0.f110936OooO00o, c31083OooooO0.f110937OooO0O0);
                return;
            case 3:
                EditText editText = ((EditorOutlineFragment) obj).f75799Oooo000;
                if (editText != null) {
                    editText.setText("");
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                    throw null;
                }
            case 4:
                o0Oo0oo o0oo0oo2 = ((C29894OooO00o) obj).f106057OooO0OO;
                if (o0oo0oo2 != null) {
                    o0oo0oo2.onClick(view);
                    return;
                }
                return;
            case 5:
                InterfaceC21987OooOoo viewLifecycleOwner = ((UserSettingFragment) obj).getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30997OooO0o(2, null), 3);
                return;
            default:
                Object tag2 = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag2, "null cannot be cast to non-null type com.orion.notein.ui.pageeditor.vo.TargetNoteVO");
                final C30544OooO0O0 c30544OooO0O0 = (C30544OooO0O0) tag2;
                final SelectNoteDialogFragment selectNoteDialogFragment = (SelectNoteDialogFragment) obj;
                LockNoteFragment lockNoteFragment = (LockNoteFragment) selectNoteDialogFragment.f78380Oooo000.getValue();
                InterfaceC21987OooOoo viewLifecycleOwner2 = selectNoteDialogFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                LockNoteFragment.OooOoo(lockNoteFragment, C21989OooOooO.OooO00o(viewLifecycleOwner2), com.facebook.soloader.OooOo.OooO0oO(c30544OooO0O0.f109255OooO00o), new oO0O000o.OooO00o() { // from class: o0ooo.OooOOo
                    @Override // oO0O000o.OooO00o
                    public final Object invoke() {
                        selectNoteDialogFragment.OooOoo0().OooO0o(c30544OooO0O0.f109255OooO00o);
                        return C32460OooOooO.f116667OooO00o;
                    }
                });
                return;
        }
    }
}
