package o0OoO0oo;

import android.view.DragEvent;
import com.aspose.slides.C22212OooOoO0;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import java.util.ArrayList;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0OoO0oo.o00O0o0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class RunnableC28846o00O0o0o implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ DragEvent f102159OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102160OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ float f102161OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f102162OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ float f102163OooOoOO;

    public /* synthetic */ RunnableC28846o00O0o0o(NoteEditorFragment noteEditorFragment, DragEvent dragEvent, ArrayList arrayList, float f, float f2) {
        this.f102160OooOo0o = noteEditorFragment;
        this.f102159OooOo = dragEvent;
        this.f102162OooOoO0 = arrayList;
        this.f102161OooOoO = f;
        this.f102163OooOoOO = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NoteEditorFragment noteEditorFragment = this.f102160OooOo0o;
        C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new NoteEditorFragment.OooO0O0.OooO00o(noteEditorFragment, this.f102159OooOo, this.f102162OooOoO0, this.f102161OooOoO, this.f102163OooOoOO, null), 3);
    }
}
