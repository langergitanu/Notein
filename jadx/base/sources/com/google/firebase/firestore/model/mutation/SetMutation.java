package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firestore.p565v1.Value;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class SetMutation extends Mutation {
    private final ObjectValue value;

    public SetMutation(DocumentKey documentKey, ObjectValue objectValue, Precondition precondition) {
        this(documentKey, objectValue, precondition, new ArrayList());
    }

    @Override // com.google.firebase.firestore.model.mutation.Mutation
    public FieldMask applyToLocalView(MutableDocument mutableDocument, FieldMask fieldMask, Timestamp timestamp) {
        verifyKeyMatches(mutableDocument);
        if (!getPrecondition().isValidFor(mutableDocument)) {
            return fieldMask;
        }
        Map<FieldPath, Value> mapLocalTransformResults = localTransformResults(timestamp, mutableDocument);
        ObjectValue objectValueM80695clone = this.value.m80695clone();
        objectValueM80695clone.setAll(mapLocalTransformResults);
        mutableDocument.convertToFoundDocument(mutableDocument.getVersion(), objectValueM80695clone).setHasLocalMutations();
        return null;
    }

    @Override // com.google.firebase.firestore.model.mutation.Mutation
    public void applyToRemoteDocument(MutableDocument mutableDocument, MutationResult mutationResult) {
        verifyKeyMatches(mutableDocument);
        ObjectValue objectValueM80695clone = this.value.m80695clone();
        objectValueM80695clone.setAll(serverTransformResults(mutableDocument, mutationResult.getTransformResults()));
        mutableDocument.convertToFoundDocument(mutationResult.getVersion(), objectValueM80695clone).setHasCommittedMutations();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SetMutation.class == obj.getClass()) {
            SetMutation setMutation = (SetMutation) obj;
            if (hasSameKeyAndPrecondition(setMutation) && this.value.equals(setMutation.value) && getFieldTransforms().equals(setMutation.getFieldTransforms())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.firestore.model.mutation.Mutation
    public FieldMask getFieldMask() {
        return null;
    }

    public ObjectValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (keyAndPreconditionHashCode() * 31);
    }

    public String toString() {
        return "SetMutation{" + keyAndPreconditionToString() + ", value=" + this.value + "}";
    }

    public SetMutation(DocumentKey documentKey, ObjectValue objectValue, Precondition precondition, List<FieldTransform> list) {
        super(documentKey, precondition, list);
        this.value = objectValue;
    }
}
