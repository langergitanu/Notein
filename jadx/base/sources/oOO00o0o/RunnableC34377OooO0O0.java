package oOO00o0o;

import java.util.concurrent.TimeUnit;
import oOO00o0.C34370OooO0o0;

/* JADX INFO: renamed from: oOO00o0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC34377OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC34376OooO00o f123375OooOo0o;

    public RunnableC34377OooO0O0(ServiceConnectionC34376OooO00o serviceConnectionC34376OooO00o) {
        this.f123375OooOo0o = serviceConnectionC34376OooO00o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ServiceConnectionC34376OooO00o serviceConnectionC34376OooO00o = this.f123375OooOo0o;
        try {
            boolean zAwait = serviceConnectionC34376OooO00o.f123370OooOoOO.await(4000L, TimeUnit.MILLISECONDS);
            C34370OooO0o0.OooO0Oo("AIDLClientInvokeManager", "startService await");
            if (zAwait) {
                return;
            }
            ServiceConnectionC34376OooO00o.OooO0OO(serviceConnectionC34376OooO00o);
        } catch (InterruptedException unused) {
            C34370OooO0o0.OooO0Oo("AIDLClientInvokeManager", "serviceStartDownLatch InterruptedException");
            ServiceConnectionC34376OooO00o.OooO0OO(serviceConnectionC34376OooO00o);
        }
    }
}
