package o0OoooOo;

import android.widget.EditText;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.EditorCommentFragment;
import oO000Oo.o0000OOO;
import oO000Oo.o0000OOO.OooO00o;

/* JADX INFO: renamed from: o0OoooOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class RunnableC29640OooO0o0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f105099OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f105100OooOo0o;

    public /* synthetic */ RunnableC29640OooO0o0(Object obj, int i) {
        this.f105100OooOo0o = i;
        this.f105099OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f105100OooOo0o) {
            case 0:
                EditText editText = ((EditorCommentFragment) this.f105099OooOo).f75722Oooo000;
                if (editText != null) {
                    editText.requestFocus();
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                    throw null;
                }
            default:
                o0000OOO o0000ooo = o0000OOO.this;
                o0000ooo.f114529OooO0O0.OooO00o(o0000ooo.new OooO00o());
                return;
        }
    }
}
