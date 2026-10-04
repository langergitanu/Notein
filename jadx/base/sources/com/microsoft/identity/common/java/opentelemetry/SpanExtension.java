package com.microsoft.identity.common.java.opentelemetry;

import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.java.logging.Logger;
import io.opentelemetry.api.internal.ImmutableSpanContext;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.SpanId;
import io.opentelemetry.api.trace.TraceId;
import io.opentelemetry.context.Scope;

/* JADX INFO: loaded from: classes9.dex */
public class SpanExtension {
    private static final SpanContext INVALID = ImmutableSpanContext.create(TraceId.getInvalid(), SpanId.getInvalid(), new NoopTraceFlags(), new NoopTraceState(), false, false);
    private static final String TAG = "SpanExtension";

    public enum NoopScope implements Scope {
        INSTANCE;

        @Override // io.opentelemetry.context.Scope, java.lang.AutoCloseable
        public void close() {
        }
    }

    public static Span current() {
        try {
            return Span.current();
        } catch (NoSuchMethodError e) {
            Logger.error(OooO00o.OooO0OO(new StringBuilder(), TAG, ":getCurrentSpan"), e.getMessage(), e);
            return new NoopSpan(INVALID);
        }
    }

    public static Scope makeCurrentSpan(Span span) {
        if (span == null) {
            throw new NullPointerException("span is marked non-null but is null");
        }
        try {
            return span.makeCurrent();
        } catch (AbstractMethodError | Exception e) {
            Logger.error(OooO00o.OooO0OO(new StringBuilder(), TAG, ":makeCurrentSpan"), e.getMessage(), e);
            return NoopScope.INSTANCE;
        }
    }
}
