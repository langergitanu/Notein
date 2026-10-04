package io.opentelemetry.context.propagation;

/* JADX INFO: loaded from: classes10.dex */
public interface TextMapGetter<C> {
    String get(C c, String str);

    Iterable<String> keys(C c);
}
