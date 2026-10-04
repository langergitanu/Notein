package o00o0O0;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: o00o0O0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25313OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f86151OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0O0 f86152OooO0O0 = new OooO0O0();

    /* JADX INFO: renamed from: o00o0O0.OooO0o0$OooO00o */
    public class OooO00o implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C25316OooOO0o.OooO0o().post(runnable);
        }
    }

    /* JADX INFO: renamed from: o00o0O0.OooO0o0$OooO0O0 */
    public class OooO0O0 implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
