package io.opentelemetry.context.propagation;

/* JADX INFO: loaded from: classes10.dex */
public class NoopContextPropagators {
    public static ContextPropagators getInstance() {
        return DefaultContextPropagators.noop();
    }
}
