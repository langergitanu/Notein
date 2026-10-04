package o00oo0Oo;

import android.os.Process;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: o00oo0Oo.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ThreadFactoryC25705OooOo0o implements ThreadFactory {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AtomicInteger f87750OooOo = new AtomicInteger(1);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f87751OooOo0o;

    public ThreadFactoryC25705OooOo0o(String str) {
        this.f87751OooOo0o = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(runnable, "runnable");
        return new Thread(new Runnable() { // from class: o00oo0Oo.OooOo0O
            @Override // java.lang.Runnable
            public final void run() {
                ThreadFactoryC25705OooOo0o this$0 = this.f87749OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                Runnable runnable2 = runnable;
                kotlin.jvm.internal.OooOOO0.OooO0oO(runnable2, "$runnable");
                try {
                    Process.setThreadPriority(10);
                } catch (Throwable unused) {
                }
                runnable2.run();
            }
        }, this.f87751OooOo0o + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + this.f87750OooOo.getAndIncrement());
    }
}
