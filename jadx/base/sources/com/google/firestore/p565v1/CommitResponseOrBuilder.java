package com.google.firestore.p565v1;

import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface CommitResponseOrBuilder extends MessageLiteOrBuilder {
    Timestamp getCommitTime();

    WriteResult getWriteResults(int i);

    int getWriteResultsCount();

    List<WriteResult> getWriteResultsList();

    boolean hasCommitTime();
}
