package com.google.firestore.p565v1;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface UpdateDocumentRequestOrBuilder extends MessageLiteOrBuilder {
    Precondition getCurrentDocument();

    Document getDocument();

    DocumentMask getMask();

    DocumentMask getUpdateMask();

    boolean hasCurrentDocument();

    boolean hasDocument();

    boolean hasMask();

    boolean hasUpdateMask();
}
