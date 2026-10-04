package o00o00Oo;

import android.view.View;
import android.view.ViewTreeObserver;
import o00o000.C25223OooOOoo;
import o00o0O0.C25316OooOO0o;

/* JADX INFO: renamed from: o00o00Oo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewTreeObserverOnDrawListenerC25260OooO0o implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C25262OooO0oO f85987OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ View f85988OooOo0o;

    /* JADX INFO: renamed from: o00o00Oo.OooO0o$OooO00o */
    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ ViewTreeObserverOnDrawListenerC25260OooO0o f85990OooOo0o;

        public OooO00o(ViewTreeObserverOnDrawListenerC25260OooO0o viewTreeObserverOnDrawListenerC25260OooO0o) {
            this.f85990OooOo0o = viewTreeObserverOnDrawListenerC25260OooO0o;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C25223OooOOoo c25223OooOOooOooO00o = C25223OooOOoo.OooO00o();
            c25223OooOOooOooO00o.getClass();
            C25316OooOO0o.OooO00o();
            c25223OooOOooOooO00o.f85911OooO0Oo.set(true);
            ViewTreeObserverOnDrawListenerC25260OooO0o.this.f85987OooOo.f85992OooO0O0 = true;
            View view = ViewTreeObserverOnDrawListenerC25260OooO0o.this.f85988OooOo0o;
            view.getViewTreeObserver().removeOnDrawListener(this.f85990OooOo0o);
            ViewTreeObserverOnDrawListenerC25260OooO0o.this.f85987OooOo.f85991OooO00o.clear();
        }
    }

    public ViewTreeObserverOnDrawListenerC25260OooO0o(C25262OooO0oO c25262OooO0oO, View view) {
        this.f85987OooOo = c25262OooO0oO;
        this.f85988OooOo0o = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        C25316OooOO0o.OooO0o().post(new OooO00o(this));
    }
}
