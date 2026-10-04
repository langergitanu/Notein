package com.google.firestore.p565v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;

/* JADX INFO: loaded from: classes8.dex */
public interface RunQueryResponseOrBuilder extends MessageLiteOrBuilder {
    Document getDocument();

    Timestamp getReadTime();

    int getSkippedResults();

    ByteString getTransaction();

    boolean hasDocument();

    boolean hasReadTime();
}
