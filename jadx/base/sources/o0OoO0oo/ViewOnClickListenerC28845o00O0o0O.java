package o0OoO0oo;

import android.view.View;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.HyperLinkResizeEditor;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO;

/* JADX INFO: renamed from: o0OoO0oo.o00O0o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28845o00O0o0O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f102157OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f102158OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28845o00O0o0O(Object obj, int i) {
        this.f102158OooOo0o = i;
        this.f102157OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f102158OooOo0o) {
            case 0:
                ((C28843o00O0o0) this.f102157OooOo).invoke();
                return;
            default:
                com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO = ((HyperLinkResizeEditor) this.f102157OooOo).f74506OooOo0o;
                if (oooO0OO != null) {
                    oooO0OO.OooO0oo(OooO0OO.OooO00o.f74568OooOoO, null);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                    throw null;
                }
        }
    }
}
