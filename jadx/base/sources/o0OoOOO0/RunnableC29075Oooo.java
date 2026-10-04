package o0OoOOO0;

import android.widget.EditText;
import com.orion.notein.p607ui.noteeditor.addtext.TextEditor;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.EditorPreviewFragment;

/* JADX INFO: renamed from: o0OoOOO0.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class RunnableC29075Oooo implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103041OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103042OooOo0o;

    public /* synthetic */ RunnableC29075Oooo(Object obj, int i) {
        this.f103042OooOo0o = i;
        this.f103041OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f103041OooOo;
        switch (this.f103042OooOo0o) {
            case 0:
                int i = TextEditor.f74047Oooo0o0;
                ((TextEditor) obj).OooO0oo(true);
                return;
            default:
                EditText editText = ((EditorPreviewFragment) obj).f75903Oooo0;
                if (editText != null) {
                    editText.requestFocus();
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                    throw null;
                }
        }
    }
}
