package io.opentelemetry.api.trace;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.context.Context;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes10.dex */
public interface SpanBuilder {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void lambda$setAllAttributes$0(AttributeKey attributeKey, Object obj) {
        setAttribute((AttributeKey<Object>) attributeKey, obj);
    }

    SpanBuilder addLink(SpanContext spanContext);

    SpanBuilder addLink(SpanContext spanContext, Attributes attributes);

    default SpanBuilder setAllAttributes(Attributes attributes) {
        if (attributes != null && !attributes.isEmpty()) {
            attributes.forEach(new BiConsumer() { // from class: io.opentelemetry.api.trace.OooO0O0
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    this.f80900OooO00o.lambda$setAllAttributes$0((AttributeKey) obj, obj2);
                }
            });
        }
        return this;
    }

    <T> SpanBuilder setAttribute(AttributeKey<T> attributeKey, T t);

    SpanBuilder setAttribute(String str, double d);

    SpanBuilder setAttribute(String str, long j);

    SpanBuilder setAttribute(String str, String str2);

    SpanBuilder setAttribute(String str, boolean z);

    SpanBuilder setNoParent();

    SpanBuilder setParent(Context context);

    SpanBuilder setSpanKind(SpanKind spanKind);

    SpanBuilder setStartTimestamp(long j, TimeUnit timeUnit);

    default SpanBuilder setStartTimestamp(Instant instant) {
        return instant == null ? this : setStartTimestamp(TimeUnit.SECONDS.toNanos(instant.getEpochSecond()) + ((long) instant.getNano()), TimeUnit.NANOSECONDS);
    }

    Span startSpan();
}
