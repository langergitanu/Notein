package oO0o0OO;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: oO0o0OO.o00000oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ThreadFactoryC33666o00000oO implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "penInfoContext");
        thread.setDaemon(true);
        return thread;
    }
}
