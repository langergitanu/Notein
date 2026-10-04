package o0Ooo00O;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import com.orion.notein.p607ui.noteeditor.itemeditor.ItemsEditor;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.EditorPreviewFragment;
import kotlin.jvm.internal.OooOOO0;
import o0Oo00o.C28026OooO0OO;
import o0OoO0oo.C28799o000OoO;
import o0ooOOoo.C31660OooO0o0;
import o0ooOOoo.InterfaceC31656OooO0O0;

/* JADX INFO: renamed from: o0Ooo00O.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29368OooO0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f104136OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104137OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29368OooO0OO(Object obj, int i) {
        this.f104137OooOo0o = i;
        this.f104136OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f104137OooOo0o) {
            case 0:
                ItemsEditor.OooO00o oooO00o = ((ItemsEditor) this.f104136OooOo).eventListener;
                if (oooO00o != null) {
                    oooO00o.onCancel();
                }
                break;
            case 1:
                EditorPreviewFragment editorPreviewFragment = (EditorPreviewFragment) this.f104136OooOo;
                String noteId = (String) editorPreviewFragment.OooOoo().f76075OooOOO0.getValue();
                String title = (String) editorPreviewFragment.OooOoo().f76078OooOOo.f121747OooOo0o.getValue();
                OooOOO0.OooO0oO(noteId, "noteId");
                OooOOO0.OooO0oO(title, "title");
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(editorPreviewFragment), new C28799o000OoO(noteId, title));
                break;
            default:
                InterfaceC31656OooO0O0 interfaceC31656OooO0O0 = ((C31660OooO0o0) this.f104136OooOo).f113165OooO0O0;
                if (interfaceC31656OooO0O0 != null) {
                    interfaceC31656OooO0O0.OooO0oo();
                }
                break;
        }
    }
}
