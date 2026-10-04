package o00OooO;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: o00OooO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ThreadFactoryC25124OooO00o implements ThreadFactory {

    /* JADX INFO: renamed from: o00OooO.OooO00o$OooO00o, reason: collision with other inner class name */
    public class RunnableC19677OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Runnable f85410OooOo0o;

        public RunnableC19677OooO00o(Runnable runnable) {
            this.f85410OooOo0o = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            this.f85410OooOo0o.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new RunnableC19677OooO00o(runnable), "glide-active-resources");
    }
}
