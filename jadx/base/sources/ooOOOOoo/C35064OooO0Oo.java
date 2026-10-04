package ooOOOOoo;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: renamed from: ooOOOOoo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35064OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HandlerThread f125955OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOo f125956OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile Handler f125957OooO0OO;

    public C35064OooO0Oo(String str, OooOo oooOo) {
        this.f125955OooO00o = new HandlerThread(str);
        this.f125956OooO0O0 = oooOo;
    }

    public final Handler OooO00o() {
        if (this.f125957OooO0OO == null) {
            synchronized (this) {
                try {
                    if (this.f125957OooO0OO == null) {
                        C35077OooOo0O.OooO0o0("HD", "init handler", null);
                        this.f125955OooO00o.start();
                        this.f125957OooO0OO = new Handler(this.f125955OooO00o.getLooper(), this.f125956OooO0O0);
                    }
                } finally {
                }
            }
        }
        return this.f125957OooO0OO;
    }
}
