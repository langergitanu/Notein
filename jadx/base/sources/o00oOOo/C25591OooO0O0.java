package o00oOOo;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o00O0Ooo.ExecutorC24905OooOOO;

/* JADX INFO: renamed from: o00oOOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25591OooO0O0 implements InterfaceC25590OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ExecutorC24905OooOOO f87293OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Handler f87294OooO0O0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f87295OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: o00oOOo.OooO0O0$OooO00o */
    public class OooO00o implements Executor {
        public OooO00o() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C25591OooO0O0.this.f87294OooO0O0.post(runnable);
        }
    }

    public C25591OooO0O0(ExecutorService executorService) {
        this.f87293OooO00o = new ExecutorC24905OooOOO(executorService);
    }

    public final void OooO00o(Runnable runnable) {
        this.f87293OooO00o.execute(runnable);
    }
}
