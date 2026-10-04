package io.opentelemetry.api.baggage;

import io.opentelemetry.context.Context;
import io.opentelemetry.context.ImplicitContextKeyed;
import java.util.Map;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes10.dex */
public interface Baggage extends ImplicitContextKeyed {
    static BaggageBuilder builder() {
        return ImmutableBaggage.builder();
    }

    static Baggage current() {
        return fromContext(Context.current());
    }

    static Baggage empty() {
        return ImmutableBaggage.empty();
    }

    static Baggage fromContext(Context context) {
        Baggage baggage = (Baggage) context.get(BaggageContextKey.KEY);
        return baggage != null ? baggage : empty();
    }

    static Baggage fromContextOrNull(Context context) {
        return (Baggage) context.get(BaggageContextKey.KEY);
    }

    Map<String, BaggageEntry> asMap();

    void forEach(BiConsumer<? super String, ? super BaggageEntry> biConsumer);

    String getEntryValue(String str);

    default boolean isEmpty() {
        return size() == 0;
    }

    int size();

    @Override // io.opentelemetry.context.ImplicitContextKeyed
    default Context storeInContext(Context context) {
        return context.with(BaggageContextKey.KEY, this);
    }

    BaggageBuilder toBuilder();
}
