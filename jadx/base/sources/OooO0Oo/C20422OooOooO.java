package OooO0Oo;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: renamed from: OooO0Oo.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20422OooOooO implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C20414OooOo0o f58241OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OooOo f58242OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ C20416OooOoO0 f58243OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ C20415OooOoO f58244OooO0Oo;

    public C20422OooOooO(C20414OooOo0o c20414OooOo0o, OooOo oooOo, C20416OooOoO0 c20416OooOoO0, C20415OooOoO c20415OooOoO) {
        this.f58241OooO00o = c20414OooOo0o;
        this.f58242OooO0O0 = oooOo;
        this.f58243OooO0OO = c20416OooOoO0;
        this.f58244OooO0Oo = c20415OooOoO;
    }

    public final void onBackCancelled() {
        this.f58244OooO0Oo.invoke();
    }

    public final void onBackInvoked() {
        this.f58243OooO0OO.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(backEvent, "backEvent");
        this.f58242OooO0O0.invoke(new OooO0OO(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(backEvent, "backEvent");
        this.f58241OooO00o.invoke(new OooO0OO(backEvent));
    }
}
