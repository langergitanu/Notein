package o0OoO0oo;

import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.TextStyleBox;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO0oo.o00Oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class RunnableC28872o00Oo0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f102297OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f102298OooOo0o;

    public /* synthetic */ RunnableC28872o00Oo0(Object obj, int i) {
        this.f102298OooOo0o = i;
        this.f102297OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f102298OooOo0o) {
            case 0:
                NoteEditorContainerFragment noteEditorContainerFragment = (NoteEditorContainerFragment) this.f102297OooOo;
                LockNoteFragment lockNoteFragment = noteEditorContainerFragment.f72823OoooO0;
                if (lockNoteFragment != null) {
                    noteEditorContainerFragment.Oooo00o(lockNoteFragment, new C28981oo000o(0, noteEditorContainerFragment, noteEditorContainerFragment.Oooo00O().OooOOO0()));
                } else {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("NoteEditorFragment");
                    c20358OooO00o.OooO0OO("lockNoteIfReachLimit lockNoteFragment is null", new Object[0]);
                }
                break;
            default:
                TextStyleBox.OooO0Oo((TextStyleBox) this.f102297OooOo);
                break;
        }
    }
}
