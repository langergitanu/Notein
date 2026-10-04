package com.google.firestore.p565v1;

import com.google.firestore.p565v1.Precondition;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;

/* JADX INFO: loaded from: classes8.dex */
public interface PreconditionOrBuilder extends MessageLiteOrBuilder {
    Precondition.ConditionTypeCase getConditionTypeCase();

    boolean getExists();

    Timestamp getUpdateTime();

    boolean hasExists();

    boolean hasUpdateTime();
}
