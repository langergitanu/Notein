package o0ooOO0;

import android.view.View;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class o000O implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ oO0o0OO.o00000OO f112846OooOo0o;

    public o000O(oO0o0OO.o00000OO o00000oo2) {
        this.f112846OooOo0o = o00000oo2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
        v.removeOnAttachStateChangeListener(this);
        this.f112846OooOo0o.cancel((CancellationException) null);
    }
}
