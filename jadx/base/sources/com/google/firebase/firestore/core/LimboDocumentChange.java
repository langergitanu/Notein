package com.google.firebase.firestore.core;

import com.aspose.words.EditingLanguage;
import com.google.firebase.firestore.model.DocumentKey;

/* JADX INFO: loaded from: classes8.dex */
public class LimboDocumentChange {
    private final DocumentKey key;
    private final Type type;

    public enum Type {
        ADDED,
        REMOVED
    }

    public LimboDocumentChange(Type type, DocumentKey documentKey) {
        this.type = type;
        this.key = documentKey;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LimboDocumentChange)) {
            return false;
        }
        LimboDocumentChange limboDocumentChange = (LimboDocumentChange) obj;
        return this.type.equals(limboDocumentChange.getType()) && this.key.equals(limboDocumentChange.getKey());
    }

    public DocumentKey getKey() {
        return this.key;
    }

    public Type getType() {
        return this.type;
    }

    public int hashCode() {
        return this.key.hashCode() + ((this.type.hashCode() + EditingLanguage.SWEDISH_FINLAND) * 31);
    }
}
