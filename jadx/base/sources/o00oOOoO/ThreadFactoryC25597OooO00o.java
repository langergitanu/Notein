package o00oOOoO;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: o00oOOoO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ThreadFactoryC25597OooO00o implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        return thread;
    }
}
