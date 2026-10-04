package com.google.firestore.p565v1;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface DocumentChangeOrBuilder extends MessageLiteOrBuilder {
    Document getDocument();

    int getRemovedTargetIds(int i);

    int getRemovedTargetIdsCount();

    List<Integer> getRemovedTargetIdsList();

    int getTargetIds(int i);

    int getTargetIdsCount();

    List<Integer> getTargetIdsList();

    boolean hasDocument();
}
