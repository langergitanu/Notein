package o0OOoO0O;

import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0OOoO0O.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27745OooOo0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f97940OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f97941OooOo0o;

    public /* synthetic */ C27745OooOo0(Object obj, int i) {
        this.f97941OooOo0o = i;
        this.f97940OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f97941OooOo0o) {
            case 0:
                C27750OooOoO0 c27750OooOoO0 = (C27750OooOoO0) this.f97940OooOo;
                return new C27746OooOo00(c27750OooOoO0.f97956OooO, c27750OooOoO0.f97968OooOOO);
            default:
                final NoteEditorContainerFragment noteEditorContainerFragment = (NoteEditorContainerFragment) this.f97940OooOo;
                noteEditorContainerFragment.requireActivity().runOnUiThread(new Runnable() { // from class: o0OoO0oo.o0O0O00
                    @Override // java.lang.Runnable
                    public final void run() {
                        NoteEditorContainerFragment noteEditorContainerFragment2 = noteEditorContainerFragment;
                        NoteEditorContainerFragment.Oooo0(noteEditorContainerFragment2);
                        noteEditorContainerFragment2.Oooo0OO(2, null);
                    }
                });
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
