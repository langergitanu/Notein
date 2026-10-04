package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
@ElementTypesAreNonnullByDefault
final class Platform {
    private Platform() {
    }

    public static boolean isInstanceOfThrowableClass(Throwable th, Class<? extends Throwable> cls) {
        return cls.isInstance(th);
    }

    public static void restoreInterruptIfIsInterruptedException(Throwable th) {
        Preconditions.checkNotNull(th);
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
