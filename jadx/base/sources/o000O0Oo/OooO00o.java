package o000O0Oo;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements Executor {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Handler f82379OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final HandlerThread f82380OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f82381OooOoO0;

    public OooO00o(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        this.f82380OooOo0o = handlerThread;
        this.f82379OooOo = new Handler(handlerThread.getLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable != null) {
            this.f82379OooOo.post(runnable);
        }
    }
}
