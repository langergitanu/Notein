package com.google.firebase.firestore.proto;

import com.google.firebase.firestore.proto.MaybeDocument;
import com.google.firestore.p565v1.Document;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface MaybeDocumentOrBuilder extends MessageLiteOrBuilder {
    Document getDocument();

    MaybeDocument.DocumentTypeCase getDocumentTypeCase();

    boolean getHasCommittedMutations();

    NoDocument getNoDocument();

    UnknownDocument getUnknownDocument();

    boolean hasDocument();

    boolean hasNoDocument();

    boolean hasUnknownDocument();
}
