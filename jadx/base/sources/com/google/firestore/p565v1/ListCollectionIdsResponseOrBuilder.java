package com.google.firestore.p565v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface ListCollectionIdsResponseOrBuilder extends MessageLiteOrBuilder {
    String getCollectionIds(int i);

    ByteString getCollectionIdsBytes(int i);

    int getCollectionIdsCount();

    List<String> getCollectionIdsList();

    String getNextPageToken();

    ByteString getNextPageTokenBytes();
}
