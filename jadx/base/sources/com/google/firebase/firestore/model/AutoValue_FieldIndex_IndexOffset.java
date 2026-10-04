package com.google.firebase.firestore.model;

import Oooo0oO.C21023OooO0Oo;
import com.google.firebase.firestore.model.FieldIndex;

/* JADX INFO: loaded from: classes8.dex */
final class AutoValue_FieldIndex_IndexOffset extends FieldIndex.IndexOffset {
    private final DocumentKey documentKey;
    private final int largestBatchId;
    private final SnapshotVersion readTime;

    public AutoValue_FieldIndex_IndexOffset(SnapshotVersion snapshotVersion, DocumentKey documentKey, int i) {
        if (snapshotVersion == null) {
            throw new NullPointerException("Null readTime");
        }
        this.readTime = snapshotVersion;
        if (documentKey == null) {
            throw new NullPointerException("Null documentKey");
        }
        this.documentKey = documentKey;
        this.largestBatchId = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FieldIndex.IndexOffset) {
            FieldIndex.IndexOffset indexOffset = (FieldIndex.IndexOffset) obj;
            if (this.readTime.equals(indexOffset.getReadTime()) && this.documentKey.equals(indexOffset.getDocumentKey()) && this.largestBatchId == indexOffset.getLargestBatchId()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.firestore.model.FieldIndex.IndexOffset
    public DocumentKey getDocumentKey() {
        return this.documentKey;
    }

    @Override // com.google.firebase.firestore.model.FieldIndex.IndexOffset
    public int getLargestBatchId() {
        return this.largestBatchId;
    }

    @Override // com.google.firebase.firestore.model.FieldIndex.IndexOffset
    public SnapshotVersion getReadTime() {
        return this.readTime;
    }

    public int hashCode() {
        return ((((this.readTime.hashCode() ^ 1000003) * 1000003) ^ this.documentKey.hashCode()) * 1000003) ^ this.largestBatchId;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IndexOffset{readTime=");
        sb.append(this.readTime);
        sb.append(", documentKey=");
        sb.append(this.documentKey);
        sb.append(", largestBatchId=");
        return C21023OooO0Oo.OooO0OO("}", this.largestBatchId, sb);
    }
}
