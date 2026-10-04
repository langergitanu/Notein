package o00O0OO0;

import androidx.work.ListenableWorker;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import o00O0o00.C24932OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f84390OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C24932OooO0OO f84391OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooOOO f84392OooOoO0;

    public OooOOO0(OooOOO oooOOO, C24932OooO0OO c24932OooO0OO, String str) {
        this.f84392OooOoO0 = oooOOO;
        this.f84391OooOo0o = c24932OooO0OO;
        this.f84390OooOo = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f84390OooOo;
        OooOOO oooOOO = this.f84392OooOoO0;
        try {
            try {
                ListenableWorker.OooO00o oooO00o = (ListenableWorker.OooO00o) this.f84391OooOo0o.get();
                if (oooO00o == null) {
                    o00O0O0o.OooOO0O.OooO0OO().OooO0O0(OooOOO.f84371Oooo0oo, oooOOO.f84374OooOoO.f84459OooO0OO + " returned a null result. Treating it as a failure.", new Throwable[0]);
                } else {
                    o00O0O0o.OooOO0O.OooO0OO().OooO00o(OooOOO.f84371Oooo0oo, String.format("%s returned a %s result.", oooOOO.f84374OooOoO.f84459OooO0OO, oooO00o), new Throwable[0]);
                    oooOOO.f84377OooOoo = oooO00o;
                }
                oooOOO.OooO0OO();
            } catch (InterruptedException e) {
                e = e;
                o00O0O0o.OooOO0O.OooO0OO().OooO0O0(OooOOO.f84371Oooo0oo, str + " failed because it threw an exception/error", e);
                oooOOO.OooO0OO();
            } catch (CancellationException e2) {
                o00O0O0o.OooOO0O.OooO0OO().OooO0Oo(OooOOO.f84371Oooo0oo, str + " was cancelled", e2);
                oooOOO.OooO0OO();
            } catch (ExecutionException e3) {
                e = e3;
                o00O0O0o.OooOO0O.OooO0OO().OooO0O0(OooOOO.f84371Oooo0oo, str + " failed because it threw an exception/error", e);
                oooOOO.OooO0OO();
            }
        } catch (Throwable th) {
            oooOOO.OooO0OO();
            throw th;
        }
    }
}
