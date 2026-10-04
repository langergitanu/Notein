package o0O0oooO;

import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import oO0OoOO0.C33282OooO00o;

/* JADX INFO: renamed from: o0O0oooO.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26267OooOOo extends AbstractC26260OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C26269OooOOoo f89726OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C26263OooOOO f89727OooO0O0;

    public C26267OooOOo(C26269OooOOoo c26269OooOOoo, C26263OooOOO c26263OooOOO) {
        this.f89726OooO00o = c26269OooOOoo;
        this.f89727OooO0O0 = c26263OooOOO;
    }

    @Override // oO0OoOO0.C33282OooO00o.OooO0O0
    public final C33282OooO00o.OooO0OO OooO00o() {
        return this.f89727OooO0O0.OooO00o();
    }

    @Override // o0OoO0oo.InterfaceC28888o00OoOOO
    public final void OooO0O0(NoteEditorFragment noteEditorFragment) {
        noteEditorFragment.f73000OooOoo0 = this.f89726OooO00o.f89881o000ooo0.get();
    }

    @Override // o0OoO0oo.o000O0Oo
    public final void OooO0OO(NoteEditorContainerFragment noteEditorContainerFragment) {
        noteEditorContainerFragment.f72826OoooOO0 = this.f89726OooO00o.f89881o000ooo0.get();
    }
}
