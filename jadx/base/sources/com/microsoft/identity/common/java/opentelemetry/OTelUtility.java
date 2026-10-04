package com.microsoft.identity.common.java.opentelemetry;

import androidx.concurrent.futures.OooO00o;
import com.huawei.hms.network.embedded.C18293o1;
import com.microsoft.identity.common.java.logging.Logger;
import io.opentelemetry.api.metrics.LongCounter;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.context.Context;

/* JADX INFO: loaded from: classes9.dex */
public class OTelUtility {
    private static final String TAG = "OTelUtility";

    public static LongCounter createLongCounter(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("name is marked non-null but is null");
        }
        if (str2 != null) {
            return OpenTelemetryHolder.getMeter(TAG).counterBuilder(str).setDescription(str2).setUnit(C18293o1.f55803f).build();
        }
        throw new NullPointerException("description is marked non-null but is null");
    }

    public static Span createSpan(String str) {
        if (str != null) {
            return OpenTelemetryHolder.getTracer(TAG).spanBuilder(str).startSpan();
        }
        throw new NullPointerException("name is marked non-null but is null");
    }

    public static Span createSpanFromParent(String str, SpanContext spanContext) {
        if (str == null) {
            throw new NullPointerException("name is marked non-null but is null");
        }
        StringBuilder sb = new StringBuilder();
        String str2 = TAG;
        String strOooO0OO = OooO00o.OooO0OO(sb, str2, ":createSpanFromParent");
        if (spanContext == null) {
            Logger.verbose(strOooO0OO, "parentSpanContext is NULL. Creating span without parent.");
            return createSpan(str);
        }
        if (spanContext.isValid()) {
            return OpenTelemetryHolder.getTracer(str2).spanBuilder(str).setParent(Context.current().with(Span.wrap(spanContext))).startSpan();
        }
        Logger.warn(strOooO0OO, "parentSpanContext is INVALID. Creating span without parent.");
        return createSpan(str);
    }

    public static Span createSpan(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("name is marked non-null but is null");
        }
        if (str2 != null) {
            return OpenTelemetryHolder.getTracer(TAG).spanBuilder(str).setAttribute(AttributeName.calling_package_name.name(), str2).startSpan();
        }
        throw new NullPointerException("callingPackageName is marked non-null but is null");
    }

    public static Span createSpanFromParent(String str, SpanContext spanContext, String str2) {
        if (str == null) {
            throw new NullPointerException("name is marked non-null but is null");
        }
        if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            String str3 = TAG;
            String strOooO0OO = OooO00o.OooO0OO(sb, str3, ":createSpanFromParent");
            if (spanContext == null) {
                Logger.verbose(strOooO0OO, "parentSpanContext is NULL. Creating span without parent.");
                return createSpan(str, str2);
            }
            if (!spanContext.isValid()) {
                Logger.warn(strOooO0OO, "parentSpanContext is INVALID. Creating span without parent.");
                return createSpan(str, str2);
            }
            return OpenTelemetryHolder.getTracer(str3).spanBuilder(str).setParent(Context.current().with(Span.wrap(spanContext))).setAttribute(AttributeName.calling_package_name.name(), str2).startSpan();
        }
        throw new NullPointerException("callingPackageName is marked non-null but is null");
    }
}
