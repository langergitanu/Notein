package com.microsoft.identity.common.java.opentelemetry;

import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.java.logging.Logger;
import io.opentelemetry.context.Context;

/* JADX INFO: loaded from: classes9.dex */
public class OtelContextExtension {
    private static final String TAG = "OtelContextExtension";

    public static Runnable wrap(Runnable runnable) {
        try {
            return Context.current().wrap(runnable);
        } catch (NoSuchMethodError e) {
            Logger.error(OooO00o.OooO0OO(new StringBuilder(), TAG, ":wrapRunnableWithCurrentTelemetryContext"), e.getMessage(), e);
            return runnable;
        }
    }
}
