package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.model.DocumentKey;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class ReferenceSet {
    private ImmutableSortedSet<DocumentReference> referencesByKey;
    private ImmutableSortedSet<DocumentReference> referencesByTarget;

    public ReferenceSet() {
        List list = Collections.EMPTY_LIST;
        this.referencesByKey = new ImmutableSortedSet<>(list, DocumentReference.BY_KEY);
        this.referencesByTarget = new ImmutableSortedSet<>(list, DocumentReference.BY_TARGET);
    }

    public void addReference(DocumentKey documentKey, int i) {
        DocumentReference documentReference = new DocumentReference(documentKey, i);
        this.referencesByKey = this.referencesByKey.insert(documentReference);
        this.referencesByTarget = this.referencesByTarget.insert(documentReference);
    }

    public void addReferences(ImmutableSortedSet<DocumentKey> immutableSortedSet, int i) {
        Iterator<DocumentKey> it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            addReference(it.next(), i);
        }
    }

    public boolean containsKey(DocumentKey documentKey) {
        Iterator<DocumentReference> itIteratorFrom = this.referencesByKey.iteratorFrom(new DocumentReference(documentKey, 0));
        if (itIteratorFrom.hasNext()) {
            return itIteratorFrom.next().getKey().equals(documentKey);
        }
        return false;
    }

    public boolean isEmpty() {
        return this.referencesByKey.isEmpty();
    }

    public ImmutableSortedSet<DocumentKey> referencesForId(int i) {
        Iterator<DocumentReference> itIteratorFrom = this.referencesByTarget.iteratorFrom(new DocumentReference(DocumentKey.empty(), i));
        ImmutableSortedSet<DocumentKey> immutableSortedSetEmptyKeySet = DocumentKey.emptyKeySet();
        while (itIteratorFrom.hasNext()) {
            DocumentReference next = itIteratorFrom.next();
            if (next.getId() != i) {
                break;
            }
            immutableSortedSetEmptyKeySet = immutableSortedSetEmptyKeySet.insert(next.getKey());
        }
        return immutableSortedSetEmptyKeySet;
    }

    public void removeAllReferences() {
        Iterator<DocumentReference> it = this.referencesByKey.iterator();
        while (it.hasNext()) {
            removeReference(it.next());
        }
    }

    public void removeReference(DocumentKey documentKey, int i) {
        removeReference(new DocumentReference(documentKey, i));
    }

    public void removeReferences(ImmutableSortedSet<DocumentKey> immutableSortedSet, int i) {
        Iterator<DocumentKey> it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            removeReference(it.next(), i);
        }
    }

    public ImmutableSortedSet<DocumentKey> removeReferencesForId(int i) {
        Iterator<DocumentReference> itIteratorFrom = this.referencesByTarget.iteratorFrom(new DocumentReference(DocumentKey.empty(), i));
        ImmutableSortedSet<DocumentKey> immutableSortedSetEmptyKeySet = DocumentKey.emptyKeySet();
        while (itIteratorFrom.hasNext()) {
            DocumentReference next = itIteratorFrom.next();
            if (next.getId() != i) {
                break;
            }
            immutableSortedSetEmptyKeySet = immutableSortedSetEmptyKeySet.insert(next.getKey());
            removeReference(next);
        }
        return immutableSortedSetEmptyKeySet;
    }

    private void removeReference(DocumentReference documentReference) {
        this.referencesByKey = this.referencesByKey.remove(documentReference);
        this.referencesByTarget = this.referencesByTarget.remove(documentReference);
    }
}
