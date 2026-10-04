package io.opentelemetry.context.propagation;

import io.opentelemetry.context.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
final class MultiTextMapPropagator implements TextMapPropagator {
    private final Collection<String> allFields;
    private final TextMapPropagator[] textPropagators;

    public MultiTextMapPropagator(TextMapPropagator... textMapPropagatorArr) {
        this((List<TextMapPropagator>) Arrays.asList(textMapPropagatorArr));
    }

    private static List<String> getAllFields(TextMapPropagator[] textMapPropagatorArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (TextMapPropagator textMapPropagator : textMapPropagatorArr) {
            linkedHashSet.addAll(textMapPropagator.fields());
        }
        return new ArrayList(linkedHashSet);
    }

    @Override // io.opentelemetry.context.propagation.TextMapPropagator
    public <C> Context extract(Context context, C c, TextMapGetter<C> textMapGetter) {
        if (context == null) {
            return Context.root();
        }
        if (textMapGetter == null) {
            return context;
        }
        for (TextMapPropagator textMapPropagator : this.textPropagators) {
            context = textMapPropagator.extract(context, c, textMapGetter);
        }
        return context;
    }

    @Override // io.opentelemetry.context.propagation.TextMapPropagator
    public Collection<String> fields() {
        return this.allFields;
    }

    @Override // io.opentelemetry.context.propagation.TextMapPropagator
    public <C> void inject(Context context, C c, TextMapSetter<C> textMapSetter) {
        if (context == null || textMapSetter == null) {
            return;
        }
        for (TextMapPropagator textMapPropagator : this.textPropagators) {
            textMapPropagator.inject(context, c, textMapSetter);
        }
    }

    public MultiTextMapPropagator(List<TextMapPropagator> list) {
        TextMapPropagator[] textMapPropagatorArr = new TextMapPropagator[list.size()];
        this.textPropagators = textMapPropagatorArr;
        list.toArray(textMapPropagatorArr);
        this.allFields = Collections.unmodifiableList(getAllFields(textMapPropagatorArr));
    }
}
