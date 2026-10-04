package com.google.firestore.p565v1;

import com.google.firestore.p565v1.BatchGetDocumentsResponse;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;

/* JADX INFO: loaded from: classes8.dex */
public interface BatchGetDocumentsResponseOrBuilder extends MessageLiteOrBuilder {
    Document getFound();

    String getMissing();

    ByteString getMissingBytes();

    Timestamp getReadTime();

    BatchGetDocumentsResponse.ResultCase getResultCase();

    ByteString getTransaction();

    boolean hasFound();

    boolean hasMissing();

    boolean hasReadTime();
}
