package com.google.firestore.p565v1;

import com.google.firestore.p565v1.GetDocumentRequest;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;

/* JADX INFO: loaded from: classes8.dex */
public interface GetDocumentRequestOrBuilder extends MessageLiteOrBuilder {
    GetDocumentRequest.ConsistencySelectorCase getConsistencySelectorCase();

    DocumentMask getMask();

    String getName();

    ByteString getNameBytes();

    Timestamp getReadTime();

    ByteString getTransaction();

    boolean hasMask();

    boolean hasReadTime();

    boolean hasTransaction();
}
