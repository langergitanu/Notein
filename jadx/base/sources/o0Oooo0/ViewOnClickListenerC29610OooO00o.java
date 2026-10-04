package o0Oooo0;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.propertypanel.EditorPropertyFragment;
import com.orion.notein.p607ui.noteeditor.view.NoteEditorContainer;
import com.orion.notein.p607ui.settings.debug.DebugFragment;
import o0000oOO.AbstractC24338OooO0o0;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0o0OoOO.C30710OooOooO;

/* JADX INFO: renamed from: o0Oooo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29610OooO00o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f104983OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104984OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29610OooO00o(Object obj, int i) {
        this.f104984OooOo0o = i;
        this.f104983OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f104983OooOo;
        switch (this.f104984OooOo0o) {
            case 0:
                EditorPropertyFragment editorPropertyFragment = (EditorPropertyFragment) obj;
                editorPropertyFragment.getClass();
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(editorPropertyFragment), new C24564OooO00o(R.id.action_noteEditorContainerFragment_to_aiQuotaPayDialogFragment));
                break;
            case 1:
                NoteEditorContainer.OooO00o oooO00o = ((NoteEditorContainer) obj).f76983Oooo0OO;
                if (oooO00o != null) {
                    oooO00o.OooO0Oo();
                }
                break;
            default:
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o2 = DebugFragment.f79020Oooo0OO;
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((DebugFragment) obj), new C30710OooOooO("key_select_note_for_recover_page"));
                break;
        }
    }
}
