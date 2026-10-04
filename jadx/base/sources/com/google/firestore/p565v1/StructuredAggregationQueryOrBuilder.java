package com.google.firestore.p565v1;

import com.google.firestore.p565v1.StructuredAggregationQuery;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface StructuredAggregationQueryOrBuilder extends MessageLiteOrBuilder {
    StructuredAggregationQuery.Aggregation getAggregations(int i);

    int getAggregationsCount();

    List<StructuredAggregationQuery.Aggregation> getAggregationsList();

    StructuredAggregationQuery.QueryTypeCase getQueryTypeCase();

    StructuredQuery getStructuredQuery();

    boolean hasStructuredQuery();
}
