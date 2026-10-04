package o0ooOoOO;

import o0O000o.InterfaceC25831OooO00o;
import o0OOOO0o.OooO;
import o0ooOoOO.C31666OooO0OO;

/* JADX INFO: renamed from: o0ooOoOO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C31665OooO0O0<TResult> implements InterfaceC25831OooO00o<TResult> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO f113188OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C31666OooO0OO.OooO00o f113189OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f113190OooO0OO = new Object();

    /* JADX INFO: renamed from: o0ooOoOO.OooO0O0$OooO00o */
    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C31667OooO0Oo f113192OooOo0o;

        public OooO00o(C31667OooO0Oo c31667OooO0Oo) {
            this.f113192OooOo0o = c31667OooO0Oo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (C31665OooO0O0.this.f113190OooO0OO) {
                C31665OooO0O0.this.f113188OooO00o.OooO00o(this.f113192OooOo0o.OooO0OO());
            }
        }
    }

    public C31665OooO0O0(C31666OooO0OO.OooO00o oooO00o, OooO oooO) {
        this.f113189OooO0O0 = oooO00o;
        this.f113188OooO00o = oooO;
    }

    @Override // o0O000o.InterfaceC25831OooO00o
    public final void OooO00o(C31667OooO0Oo c31667OooO0Oo) {
        if (c31667OooO0Oo.OooO0Oo()) {
            this.f113189OooO0O0.execute(new OooO00o(c31667OooO0Oo));
        }
    }
}
