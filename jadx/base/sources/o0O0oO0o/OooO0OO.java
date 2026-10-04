package o0O0oO0o;

import android.view.View;
import com.orion.editor.p600ui.zoom.DefaultZoomHandle;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ DefaultZoomHandle f89093OooOo0o;

    public OooO0OO(DefaultZoomHandle defaultZoomHandle) {
        this.f89093OooOo0o = defaultZoomHandle;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DefaultZoomHandle defaultZoomHandle = this.f89093OooOo0o;
        synchronized (defaultZoomHandle) {
            boolean z = defaultZoomHandle.f69438Oooo0OO;
            defaultZoomHandle.f69438Oooo0OO = !z;
            defaultZoomHandle.f69430OooOoo0.setImageResource(!z ? R.drawable.ic_ni_lock : R.drawable.ic_ni_unlock);
        }
        com.google.gson.internal.OooO00o oooO00o = defaultZoomHandle.f69435Oooo00O;
        if (oooO00o != null) {
            boolean z2 = defaultZoomHandle.f69438Oooo0OO;
            C33781o00o0O c33781o00o0O = ((NoteEditorFragment) oooO00o.f68736OooOo0o).OoooOO0().f73578Oooo0OO;
            Boolean boolValueOf = Boolean.valueOf(z2);
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, boolValueOf);
        }
        this.f89093OooOo0o.OooO0o();
    }
}
