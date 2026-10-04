package com.google.firestore.p565v1;

import com.google.firestore.p565v1.ListenResponse;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface ListenResponseOrBuilder extends MessageLiteOrBuilder {
    DocumentChange getDocumentChange();

    DocumentDelete getDocumentDelete();

    DocumentRemove getDocumentRemove();

    ExistenceFilter getFilter();

    ListenResponse.ResponseTypeCase getResponseTypeCase();

    TargetChange getTargetChange();

    boolean hasDocumentChange();

    boolean hasDocumentDelete();

    boolean hasDocumentRemove();

    boolean hasFilter();

    boolean hasTargetChange();
}
