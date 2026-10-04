package o0OoO0oo;

import android.view.View;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;

/* JADX INFO: renamed from: o0OoO0oo.o00OoO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ViewOnLayoutChangeListenerC28885o00OoO0o implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102343OooOo0o;

    public ViewOnLayoutChangeListenerC28885o00OoO0o(NoteEditorFragment noteEditorFragment) {
        this.f102343OooOo0o = noteEditorFragment;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        this.f102343OooOo0o.Oooo0o0(view.getWidth(), view.getHeight());
    }
}
