package o000O0oo;

import android.widget.EditText;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.EditorOutlineFragment;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: o000O0oo.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC24436OooOoOO implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f82465OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f82466OooOo0o;

    public /* synthetic */ RunnableC24436OooOoOO(Object obj, int i) {
        this.f82466OooOo0o = i;
        this.f82465OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f82466OooOo0o) {
            case 0:
                if (!((CountDownLatch) this.f82465OooOo).await(10L, TimeUnit.SECONDS)) {
                    throw new IllegalStateException("Timed out waiting for awaitAfterStartOfHandoffTestLatch");
                }
                return;
            default:
                EditText editText = ((EditorOutlineFragment) this.f82465OooOo).f75799Oooo000;
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
