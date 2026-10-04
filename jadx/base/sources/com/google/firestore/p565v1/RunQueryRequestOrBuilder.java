package com.google.firestore.p565v1;

import com.google.firestore.p565v1.RunQueryRequest;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;

/* JADX INFO: loaded from: classes8.dex */
public interface RunQueryRequestOrBuilder extends MessageLiteOrBuilder {
    RunQueryRequest.ConsistencySelectorCase getConsistencySelectorCase();

    TransactionOptions getNewTransaction();

    String getParent();

    ByteString getParentBytes();

    RunQueryRequest.QueryTypeCase getQueryTypeCase();

    Timestamp getReadTime();

    StructuredQuery getStructuredQuery();

    ByteString getTransaction();

    boolean hasNewTransaction();

    boolean hasReadTime();

    boolean hasStructuredQuery();

    boolean hasTransaction();
}
