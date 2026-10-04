package com.google.firestore.p565v1;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public interface AggregationResultOrBuilder extends MessageLiteOrBuilder {
    boolean containsAggregateFields(String str);

    @Deprecated
    Map<String, Value> getAggregateFields();

    int getAggregateFieldsCount();

    Map<String, Value> getAggregateFieldsMap();

    Value getAggregateFieldsOrDefault(String str, Value value);

    Value getAggregateFieldsOrThrow(String str);
}
