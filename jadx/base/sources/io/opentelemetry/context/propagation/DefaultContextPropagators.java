package io.opentelemetry.context.propagation;

/* JADX INFO: loaded from: classes10.dex */
final class DefaultContextPropagators implements ContextPropagators {
    private static final ContextPropagators NOOP = new DefaultContextPropagators(NoopTextMapPropagator.getInstance());
    private final TextMapPropagator textMapPropagator;

    public DefaultContextPropagators(TextMapPropagator textMapPropagator) {
        this.textMapPropagator = textMapPropagator;
    }

    public static ContextPropagators noop() {
        return NOOP;
    }

    @Override // io.opentelemetry.context.propagation.ContextPropagators
    public TextMapPropagator getTextMapPropagator() {
        return this.textMapPropagator;
    }
}
