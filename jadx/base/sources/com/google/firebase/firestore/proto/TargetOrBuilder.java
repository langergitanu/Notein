package com.google.firebase.firestore.proto;

import com.google.firebase.firestore.proto.Target;
import com.google.firestore.p565v1.Target;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;

/* JADX INFO: loaded from: classes8.dex */
public interface TargetOrBuilder extends MessageLiteOrBuilder {
    Target.DocumentsTarget getDocuments();

    Timestamp getLastLimboFreeSnapshotVersion();

    long getLastListenSequenceNumber();

    Target.QueryTarget getQuery();

    ByteString getResumeToken();

    Timestamp getSnapshotVersion();

    int getTargetId();

    Target.TargetTypeCase getTargetTypeCase();

    boolean hasDocuments();

    boolean hasLastLimboFreeSnapshotVersion();

    boolean hasQuery();

    boolean hasSnapshotVersion();
}
