package com.google.firebase.firestore;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.core.ActivityScope;
import com.google.firebase.firestore.core.AsyncEventListener;
import com.google.firebase.firestore.core.EventManager;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.core.QueryListener;
import com.google.firebase.firestore.core.UserData;
import com.google.firebase.firestore.core.ViewSnapshot;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.mutation.DeleteMutation;
import com.google.firebase.firestore.model.mutation.Precondition;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Function;
import com.google.firebase.firestore.util.Preconditions;
import com.google.firebase.firestore.util.Util;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public class DocumentReference {
    private final FirebaseFirestore firestore;
    private final DocumentKey key;

    public DocumentReference(DocumentKey documentKey, FirebaseFirestore firebaseFirestore) {
        this.key = (DocumentKey) Preconditions.checkNotNull(documentKey);
        this.firestore = firebaseFirestore;
    }

    private ListenerRegistration addSnapshotListenerInternal(Executor executor, final EventManager.ListenOptions listenOptions, final Activity activity, final EventListener<DocumentSnapshot> eventListener) {
        final AsyncEventListener asyncEventListener = new AsyncEventListener(executor, new EventListener() { // from class: com.google.firebase.firestore.OooO
            @Override // com.google.firebase.firestore.EventListener
            public final void onEvent(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
                this.f68053OooO00o.lambda$addSnapshotListenerInternal$6(eventListener, (ViewSnapshot) obj, firebaseFirestoreException);
            }
        });
        final com.google.firebase.firestore.core.Query queryAsQuery = asQuery();
        return (ListenerRegistration) this.firestore.callClient(new Function() { // from class: com.google.firebase.firestore.OooOO0
            @Override // com.google.firebase.firestore.util.Function
            public final Object apply(Object obj) {
                AsyncEventListener asyncEventListener2 = asyncEventListener;
                return DocumentReference.lambda$addSnapshotListenerInternal$8(queryAsQuery, listenOptions, asyncEventListener2, activity, (FirestoreClient) obj);
            }
        });
    }

    private com.google.firebase.firestore.core.Query asQuery() {
        return com.google.firebase.firestore.core.Query.atPath(this.key.getPath());
    }

    public static DocumentReference forPath(ResourcePath resourcePath, FirebaseFirestore firebaseFirestore) {
        if (resourcePath.length() % 2 == 0) {
            return new DocumentReference(DocumentKey.fromPath(resourcePath), firebaseFirestore);
        }
        throw new IllegalArgumentException("Invalid document reference. Document references must have an even number of segments, but " + resourcePath.canonicalString() + " has " + resourcePath.length());
    }

    private Task<DocumentSnapshot> getViaSnapshotListener(final Source source) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        EventManager.ListenOptions listenOptions = new EventManager.ListenOptions();
        listenOptions.includeDocumentMetadataChanges = true;
        listenOptions.includeQueryMetadataChanges = true;
        listenOptions.waitForSyncWhenOnline = true;
        taskCompletionSource2.setResult(addSnapshotListenerInternal(Executors.DIRECT_EXECUTOR, listenOptions, null, new EventListener() { // from class: com.google.firebase.firestore.OooOO0O
            @Override // com.google.firebase.firestore.EventListener
            public final void onEvent(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
                DocumentReference.lambda$getViaSnapshotListener$5(taskCompletionSource, taskCompletionSource2, source, (DocumentSnapshot) obj, firebaseFirestoreException);
            }
        }));
        return taskCompletionSource.getTask();
    }

    private static EventManager.ListenOptions internalOptions(MetadataChanges metadataChanges) {
        return internalOptions(metadataChanges, ListenSource.DEFAULT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addSnapshotListenerInternal$6(EventListener eventListener, ViewSnapshot viewSnapshot, FirebaseFirestoreException firebaseFirestoreException) {
        if (firebaseFirestoreException != null) {
            eventListener.onEvent(null, firebaseFirestoreException);
            return;
        }
        Assert.hardAssert(viewSnapshot != null, "Got event without value or error set", new Object[0]);
        Assert.hardAssert(viewSnapshot.getDocuments().size() <= 1, "Too many documents returned on a document query", new Object[0]);
        Document document = viewSnapshot.getDocuments().getDocument(this.key);
        eventListener.onEvent(document != null ? DocumentSnapshot.fromDocument(this.firestore, document, viewSnapshot.isFromCache(), viewSnapshot.getMutatedKeys().contains(document.getKey())) : DocumentSnapshot.fromNoDocument(this.firestore, this.key, viewSnapshot.isFromCache()), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addSnapshotListenerInternal$7(AsyncEventListener asyncEventListener, FirestoreClient firestoreClient, QueryListener queryListener) {
        asyncEventListener.mute();
        firestoreClient.stopListening(queryListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ListenerRegistration lambda$addSnapshotListenerInternal$8(com.google.firebase.firestore.core.Query query, EventManager.ListenOptions listenOptions, final AsyncEventListener asyncEventListener, Activity activity, final FirestoreClient firestoreClient) {
        final QueryListener queryListenerListen = firestoreClient.listen(query, listenOptions, asyncEventListener);
        return ActivityScope.bind(activity, new ListenerRegistration() { // from class: com.google.firebase.firestore.OooOO0o
            @Override // com.google.firebase.firestore.ListenerRegistration
            public final void remove() {
                DocumentReference.lambda$addSnapshotListenerInternal$7(asyncEventListener, firestoreClient, queryListenerListen);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$delete$2(List list, FirestoreClient firestoreClient) {
        return firestoreClient.write(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$get$3(FirestoreClient firestoreClient) {
        return firestoreClient.getDocumentFromLocalCache(this.key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DocumentSnapshot lambda$get$4(Task task) throws Exception {
        Document document = (Document) task.getResult();
        return new DocumentSnapshot(this.firestore, this.key, document, true, document != null && document.hasLocalMutations());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getViaSnapshotListener$5(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, Source source, DocumentSnapshot documentSnapshot, FirebaseFirestoreException firebaseFirestoreException) {
        if (firebaseFirestoreException != null) {
            taskCompletionSource.setException(firebaseFirestoreException);
            return;
        }
        try {
            ((ListenerRegistration) Tasks.await(taskCompletionSource2.getTask())).remove();
            if (!documentSnapshot.exists() && documentSnapshot.getMetadata().isFromCache()) {
                taskCompletionSource.setException(new FirebaseFirestoreException("Failed to get document because the client is offline.", FirebaseFirestoreException.Code.UNAVAILABLE));
            } else if (documentSnapshot.exists() && documentSnapshot.getMetadata().isFromCache() && source == Source.SERVER) {
                taskCompletionSource.setException(new FirebaseFirestoreException("Failed to get document from server. (However, this document does exist in the local cache. Run again without setting source to SERVER to retrieve the cached document.)", FirebaseFirestoreException.Code.UNAVAILABLE));
            } else {
                taskCompletionSource.setResult(documentSnapshot);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw Assert.fail(e, "Failed to register a listener for a single document", new Object[0]);
        } catch (ExecutionException e2) {
            throw Assert.fail(e2, "Failed to register a listener for a single document", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$set$0(List list, FirestoreClient firestoreClient) {
        return firestoreClient.write(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$update$1(List list, FirestoreClient firestoreClient) {
        return firestoreClient.write(list);
    }

    public ListenerRegistration addSnapshotListener(EventListener<DocumentSnapshot> eventListener) {
        return addSnapshotListener(MetadataChanges.EXCLUDE, eventListener);
    }

    public CollectionReference collection(String str) {
        Preconditions.checkNotNull(str, "Provided collection path must not be null.");
        return new CollectionReference(this.key.getPath().append(ResourcePath.fromString(str)), this.firestore);
    }

    public Task<Void> delete() {
        final List listSingletonList = Collections.singletonList(new DeleteMutation(this.key, Precondition.NONE));
        return ((Task) this.firestore.callClient(new Function() { // from class: com.google.firebase.firestore.OooO0Oo
            @Override // com.google.firebase.firestore.util.Function
            public final Object apply(Object obj) {
                return DocumentReference.lambda$delete$2(listSingletonList, (FirestoreClient) obj);
            }
        })).continueWith(Executors.DIRECT_EXECUTOR, Util.voidErrorTransformer());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentReference)) {
            return false;
        }
        DocumentReference documentReference = (DocumentReference) obj;
        return this.key.equals(documentReference.key) && this.firestore.equals(documentReference.firestore);
    }

    public Task<DocumentSnapshot> get() {
        return get(Source.DEFAULT);
    }

    public FirebaseFirestore getFirestore() {
        return this.firestore;
    }

    public String getId() {
        return this.key.getDocumentId();
    }

    public DocumentKey getKey() {
        return this.key;
    }

    public CollectionReference getParent() {
        return new CollectionReference(this.key.getCollectionPath(), this.firestore);
    }

    public String getPath() {
        return this.key.getPath().canonicalString();
    }

    public int hashCode() {
        return this.firestore.hashCode() + (this.key.hashCode() * 31);
    }

    public Task<Void> set(Object obj) {
        return set(obj, SetOptions.OVERWRITE);
    }

    public Task<Void> update(Map<String, Object> map) {
        return update(this.firestore.getUserDataReader().parseUpdateData(map));
    }

    private static EventManager.ListenOptions internalOptions(MetadataChanges metadataChanges, ListenSource listenSource) {
        EventManager.ListenOptions listenOptions = new EventManager.ListenOptions();
        MetadataChanges metadataChanges2 = MetadataChanges.INCLUDE;
        listenOptions.includeDocumentMetadataChanges = metadataChanges == metadataChanges2;
        listenOptions.includeQueryMetadataChanges = metadataChanges == metadataChanges2;
        listenOptions.waitForSyncWhenOnline = false;
        listenOptions.source = listenSource;
        return listenOptions;
    }

    public ListenerRegistration addSnapshotListener(Executor executor, EventListener<DocumentSnapshot> eventListener) {
        return addSnapshotListener(executor, MetadataChanges.EXCLUDE, eventListener);
    }

    public Task<DocumentSnapshot> get(Source source) {
        return source == Source.CACHE ? ((Task) this.firestore.callClient(new Function() { // from class: com.google.firebase.firestore.OooO0oO
            @Override // com.google.firebase.firestore.util.Function
            public final Object apply(Object obj) {
                return this.f68062OooO00o.lambda$get$3((FirestoreClient) obj);
            }
        })).continueWith(Executors.DIRECT_EXECUTOR, new C22584OooO0oo(this)) : getViaSnapshotListener(source);
    }

    public Task<Void> set(Object obj, SetOptions setOptions) {
        Preconditions.checkNotNull(obj, "Provided data must not be null.");
        Preconditions.checkNotNull(setOptions, "Provided options must not be null.");
        final List listSingletonList = Collections.singletonList((setOptions.isMerge() ? this.firestore.getUserDataReader().parseMergeData(obj, setOptions.getFieldMask()) : this.firestore.getUserDataReader().parseSetData(obj)).toMutation(this.key, Precondition.NONE));
        return ((Task) this.firestore.callClient(new Function() { // from class: com.google.firebase.firestore.OooO0o0
            @Override // com.google.firebase.firestore.util.Function
            public final Object apply(Object obj2) {
                return DocumentReference.lambda$set$0(listSingletonList, (FirestoreClient) obj2);
            }
        })).continueWith(Executors.DIRECT_EXECUTOR, Util.voidErrorTransformer());
    }

    public ListenerRegistration addSnapshotListener(Activity activity, EventListener<DocumentSnapshot> eventListener) {
        return addSnapshotListener(activity, MetadataChanges.EXCLUDE, eventListener);
    }

    public Task<Void> update(String str, Object obj, Object... objArr) {
        return update(this.firestore.getUserDataReader().parseUpdateData(Util.collectUpdateArguments(1, str, obj, objArr)));
    }

    public ListenerRegistration addSnapshotListener(MetadataChanges metadataChanges, EventListener<DocumentSnapshot> eventListener) {
        return addSnapshotListener(Executors.DEFAULT_CALLBACK_EXECUTOR, metadataChanges, eventListener);
    }

    public ListenerRegistration addSnapshotListener(Executor executor, MetadataChanges metadataChanges, EventListener<DocumentSnapshot> eventListener) {
        Preconditions.checkNotNull(executor, "Provided executor must not be null.");
        Preconditions.checkNotNull(metadataChanges, "Provided MetadataChanges value must not be null.");
        Preconditions.checkNotNull(eventListener, "Provided EventListener must not be null.");
        return addSnapshotListenerInternal(executor, internalOptions(metadataChanges), null, eventListener);
    }

    public Task<Void> update(FieldPath fieldPath, Object obj, Object... objArr) {
        return update(this.firestore.getUserDataReader().parseUpdateData(Util.collectUpdateArguments(1, fieldPath, obj, objArr)));
    }

    public ListenerRegistration addSnapshotListener(Activity activity, MetadataChanges metadataChanges, EventListener<DocumentSnapshot> eventListener) {
        Preconditions.checkNotNull(activity, "Provided activity must not be null.");
        Preconditions.checkNotNull(metadataChanges, "Provided MetadataChanges value must not be null.");
        Preconditions.checkNotNull(eventListener, "Provided EventListener must not be null.");
        return addSnapshotListenerInternal(Executors.DEFAULT_CALLBACK_EXECUTOR, internalOptions(metadataChanges), activity, eventListener);
    }

    private Task<Void> update(UserData.ParsedUpdateData parsedUpdateData) {
        final List listSingletonList = Collections.singletonList(parsedUpdateData.toMutation(this.key, Precondition.exists(true)));
        return ((Task) this.firestore.callClient(new Function() { // from class: com.google.firebase.firestore.OooO0o
            @Override // com.google.firebase.firestore.util.Function
            public final Object apply(Object obj) {
                return DocumentReference.lambda$update$1(listSingletonList, (FirestoreClient) obj);
            }
        })).continueWith(Executors.DIRECT_EXECUTOR, Util.voidErrorTransformer());
    }

    public ListenerRegistration addSnapshotListener(SnapshotListenOptions snapshotListenOptions, EventListener<DocumentSnapshot> eventListener) {
        Preconditions.checkNotNull(snapshotListenOptions, "Provided options value must not be null.");
        Preconditions.checkNotNull(eventListener, "Provided EventListener must not be null.");
        return addSnapshotListenerInternal(snapshotListenOptions.getExecutor(), internalOptions(snapshotListenOptions.getMetadataChanges(), snapshotListenOptions.getSource()), snapshotListenOptions.getActivity(), eventListener);
    }
}
