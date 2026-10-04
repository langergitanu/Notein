package o0ooOO0;

import android.view.MotionEvent;
import androidx.compose.p002ui.platform.AndroidComposeView;

/* JADX INFO: renamed from: o0ooOO0.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC31513OooOOOO implements Runnable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f112696OooOo0o;

    @Override // java.lang.Runnable
    public final void run() {
        Class<?> cls = AndroidComposeView.f63364o00000OO;
        AndroidComposeView this$0 = this.f112696OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
        this$0.f63407o000000O = false;
        MotionEvent motionEvent = this$0.f63423o0Oo0oo;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
        }
        this$0.OooOo(motionEvent);
    }
}
