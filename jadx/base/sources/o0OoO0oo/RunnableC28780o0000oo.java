package o0OoO0oo;

import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;

/* JADX INFO: renamed from: o0OoO0oo.o0000oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class RunnableC28780o0000oo implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101907OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101908OooOo0o;

    public /* synthetic */ RunnableC28780o0000oo(Object obj, int i) {
        this.f101908OooOo0o = i;
        this.f101907OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f101908OooOo0o) {
            case 0:
                NoteEditorContainerFragment noteEditorContainerFragment = (NoteEditorContainerFragment) this.f101907OooOo;
                NoteEditorContainerFragment.Oooo0(noteEditorContainerFragment);
                noteEditorContainerFragment.Oooo0OO(2, null);
                break;
            default:
                PenBox.OooO00o((PenBox) this.f101907OooOo);
                break;
        }
    }
}
