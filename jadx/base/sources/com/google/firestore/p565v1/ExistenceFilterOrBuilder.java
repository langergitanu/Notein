package com.google.firestore.p565v1;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface ExistenceFilterOrBuilder extends MessageLiteOrBuilder {
    int getCount();

    int getTargetId();

    BloomFilter getUnchangedNames();

    boolean hasUnchangedNames();
}
