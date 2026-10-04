package com.google.firestore.p565v1;

import com.google.firestore.p565v1.TransactionOptions;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface TransactionOptionsOrBuilder extends MessageLiteOrBuilder {
    TransactionOptions.ModeCase getModeCase();

    TransactionOptions.ReadOnly getReadOnly();

    TransactionOptions.ReadWrite getReadWrite();

    boolean hasReadOnly();

    boolean hasReadWrite();
}
