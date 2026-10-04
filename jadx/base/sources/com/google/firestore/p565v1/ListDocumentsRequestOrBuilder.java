package com.google.firestore.p565v1;

import com.google.firestore.p565v1.ListDocumentsRequest;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;

/* JADX INFO: loaded from: classes8.dex */
public interface ListDocumentsRequestOrBuilder extends MessageLiteOrBuilder {
    String getCollectionId();

    ByteString getCollectionIdBytes();

    ListDocumentsRequest.ConsistencySelectorCase getConsistencySelectorCase();

    DocumentMask getMask();

    String getOrderBy();

    ByteString getOrderByBytes();

    int getPageSize();

    String getPageToken();

    ByteString getPageTokenBytes();

    String getParent();

    ByteString getParentBytes();

    Timestamp getReadTime();

    boolean getShowMissing();

    ByteString getTransaction();

    boolean hasMask();

    boolean hasReadTime();

    boolean hasTransaction();
}
