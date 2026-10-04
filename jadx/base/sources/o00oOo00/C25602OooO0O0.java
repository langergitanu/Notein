package o00oOo00;

import android.os.Handler;
import android.os.HandlerThread;
import oOo00O0O.C34476OooOooo;

/* JADX INFO: renamed from: o00oOo00.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C25602OooO0O0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f87347OooOo0o;

    public /* synthetic */ C25602OooO0O0(int i) {
        this.f87347OooOo0o = i;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f87347OooOo0o) {
            case 0:
                HandlerThread handlerThread = new HandlerThread("FrescoAnimationWorker");
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            default:
                return C34476OooOooo.f123540OooO0O0;
        }
    }
}
