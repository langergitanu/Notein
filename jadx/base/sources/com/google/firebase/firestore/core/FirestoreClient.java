package com.google.firebase.firestore.core;

import android.content.Context;
import com.aspose.slides.C22216OooOooO;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.AggregateField;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.LoadBundleTask;
import com.google.firebase.firestore.TransactionOptions;
import com.google.firebase.firestore.auth.CredentialsProvider;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.bundle.BundleReader;
import com.google.firebase.firestore.bundle.BundleSerializer;
import com.google.firebase.firestore.bundle.NamedQuery;
import com.google.firebase.firestore.core.ComponentProvider;
import com.google.firebase.firestore.core.EventManager;
import com.google.firebase.firestore.local.IndexBackfiller;
import com.google.firebase.firestore.local.LocalStore;
import com.google.firebase.firestore.local.Persistence;
import com.google.firebase.firestore.local.QueryResult;
import com.google.firebase.firestore.local.Scheduler;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.remote.GrpcMetadataProvider;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.firebase.firestore.remote.RemoteStore;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Function;
import com.google.firebase.firestore.util.Listener;
import com.google.firebase.firestore.util.Logger;
import com.google.firestore.p565v1.Value;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public final class FirestoreClient {
    private static final String LOG_TAG = "FirestoreClient";
    private static final int MAX_CONCURRENT_LIMBO_RESOLUTIONS = 100;
    private final CredentialsProvider<String> appCheckProvider;
    private final AsyncQueue asyncQueue;
    private final CredentialsProvider<User> authProvider;
    private final BundleSerializer bundleSerializer;
    private final DatabaseInfo databaseInfo;
    private EventManager eventManager;
    private Scheduler gcScheduler;
    private Scheduler indexBackfillScheduler;
    private LocalStore localStore;
    private Persistence persistence;
    private RemoteStore remoteStore;
    private SyncEngine syncEngine;

    public FirestoreClient(final Context context, DatabaseInfo databaseInfo, CredentialsProvider<User> credentialsProvider, CredentialsProvider<String> credentialsProvider2, final AsyncQueue asyncQueue, final GrpcMetadataProvider grpcMetadataProvider, final ComponentProvider componentProvider) {
        this.databaseInfo = databaseInfo;
        this.authProvider = credentialsProvider;
        this.appCheckProvider = credentialsProvider2;
        this.asyncQueue = asyncQueue;
        this.bundleSerializer = new BundleSerializer(new RemoteSerializer(databaseInfo.getDatabaseId()));
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        asyncQueue.enqueueAndForget(new Runnable() { // from class: com.google.firebase.firestore.core.OooOO0o
            @Override // java.lang.Runnable
            public final void run() {
                this.f68149OooOo0o.lambda$new$0(taskCompletionSource, context, componentProvider, grpcMetadataProvider);
            }
        });
        credentialsProvider.setChangeListener(new Listener() { // from class: com.google.firebase.firestore.core.OooOOO
            @Override // com.google.firebase.firestore.util.Listener
            public final void onValue(Object obj) {
                this.f68154OooOo0o.lambda$new$2(atomicBoolean, taskCompletionSource, asyncQueue, (User) obj);
            }
        });
        credentialsProvider2.setChangeListener(new C22216OooOooO());
    }

    private void initialize(Context context, User user, ComponentProvider componentProvider, GrpcMetadataProvider grpcMetadataProvider) {
        Logger.debug(LOG_TAG, "Initializing. user=%s", user.getUid());
        componentProvider.initialize(new ComponentProvider.Configuration(context, this.asyncQueue, this.databaseInfo, user, 100, this.authProvider, this.appCheckProvider, grpcMetadataProvider));
        this.persistence = componentProvider.getPersistence();
        this.gcScheduler = componentProvider.getGarbageCollectionScheduler();
        this.localStore = componentProvider.getLocalStore();
        this.remoteStore = componentProvider.getRemoteStore();
        this.syncEngine = componentProvider.getSyncEngine();
        this.eventManager = componentProvider.getEventManager();
        IndexBackfiller indexBackfiller = componentProvider.getIndexBackfiller();
        Scheduler scheduler = this.gcScheduler;
        if (scheduler != null) {
            scheduler.start();
        }
        if (indexBackfiller != null) {
            IndexBackfiller.Scheduler scheduler2 = indexBackfiller.getScheduler();
            this.indexBackfillScheduler = scheduler2;
            scheduler2.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addSnapshotsInSyncListener$18(EventListener eventListener) {
        this.eventManager.addSnapshotsInSyncListener(eventListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$configureFieldIndexes$21(List list) {
        this.localStore.configureFieldIndexes(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteAllFieldIndexes$23() {
        this.localStore.deleteAllFieldIndexes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$disableNetwork$4() {
        this.remoteStore.disableNetwork();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableNetwork$5() {
        this.remoteStore.enableNetwork();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Document lambda$getDocumentFromLocalCache$10(Task task) throws Exception {
        Document document = (Document) task.getResult();
        if (document.isFoundDocument()) {
            return document;
        }
        if (document.isNoDocument()) {
            return null;
        }
        throw new FirebaseFirestoreException("Failed to get document from cache. (However, this document may exist on the server. Run again without setting source to CACHE to attempt to retrieve the document from the server.)", FirebaseFirestoreException.Code.UNAVAILABLE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Document lambda$getDocumentFromLocalCache$9(DocumentKey documentKey) throws Exception {
        return this.localStore.readDocument(documentKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ViewSnapshot lambda$getDocumentsFromLocalCache$11(Query query) throws Exception {
        QueryResult queryResultExecuteQuery = this.localStore.executeQuery(query, true);
        View view = new View(query, queryResultExecuteQuery.getRemoteKeys());
        return view.applyChanges(view.computeDocChanges(queryResultExecuteQuery.getDocuments())).getSnapshot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getNamedQuery$20(String str, TaskCompletionSource taskCompletionSource) {
        NamedQuery namedQuery = this.localStore.getNamedQuery(str);
        if (namedQuery == null) {
            taskCompletionSource.setResult(null);
        } else {
            Target target = namedQuery.getBundledQuery().getTarget();
            taskCompletionSource.setResult(new Query(target.getPath(), target.getCollectionGroup(), target.getFilters(), target.getOrderBy(), target.getLimit(), namedQuery.getBundledQuery().getLimitType(), target.getStartAt(), target.getEndAt()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$listen$7(QueryListener queryListener) {
        this.eventManager.addQueryListener(queryListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadBundle$19(BundleReader bundleReader, LoadBundleTask loadBundleTask) {
        this.syncEngine.loadBundle(bundleReader, loadBundleTask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(TaskCompletionSource taskCompletionSource, Context context, ComponentProvider componentProvider, GrpcMetadataProvider grpcMetadataProvider) {
        try {
            initialize(context, (User) Tasks.await(taskCompletionSource.getTask()), componentProvider, grpcMetadataProvider);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(User user) {
        Assert.hardAssert(this.syncEngine != null, "SyncEngine not yet initialized", new Object[0]);
        Logger.debug(LOG_TAG, "Credential changed. Current user: %s", user.getUid());
        this.syncEngine.handleCredentialChange(user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(AtomicBoolean atomicBoolean, TaskCompletionSource taskCompletionSource, AsyncQueue asyncQueue, User user) {
        if (!atomicBoolean.compareAndSet(false, true)) {
            asyncQueue.enqueueAndForget(new com.google.firebase.appcheck.debug.internal.OooO0OO(1, this, user));
        } else {
            Assert.hardAssert(!taskCompletionSource.getTask().isComplete(), "Already fulfilled first user task", new Object[0]);
            taskCompletionSource.setResult(user);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$3(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeSnapshotsInSyncListener$24(EventListener eventListener) {
        this.eventManager.removeSnapshotsInSyncListener(eventListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runAggregateQuery$16(Query query, List list, final TaskCompletionSource taskCompletionSource) {
        this.syncEngine.runAggregateQuery(query, list).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.firebase.firestore.core.OooOo0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                taskCompletionSource.setResult((Map) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.firebase.firestore.core.OooOo0O
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                taskCompletionSource.setException(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setIndexAutoCreationEnabled$22(boolean z) {
        this.localStore.setIndexAutoCreationEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopListening$8(QueryListener queryListener) {
        this.eventManager.removeQueryListener(queryListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$terminate$6() {
        this.remoteStore.shutdown();
        this.persistence.shutdown();
        Scheduler scheduler = this.gcScheduler;
        if (scheduler != null) {
            scheduler.stop();
        }
        Scheduler scheduler2 = this.indexBackfillScheduler;
        if (scheduler2 != null) {
            scheduler2.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$transaction$13(TransactionOptions transactionOptions, Function function) throws Exception {
        return this.syncEngine.transaction(this.asyncQueue, transactionOptions, function);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$waitForPendingWrites$17(TaskCompletionSource taskCompletionSource) {
        this.syncEngine.registerPendingWritesTask(taskCompletionSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$write$12(List list, TaskCompletionSource taskCompletionSource) {
        this.syncEngine.writeMutations(list, taskCompletionSource);
    }

    private void verifyNotTerminated() {
        if (isTerminated()) {
            throw new IllegalStateException("The client has already been terminated");
        }
    }

    public void addSnapshotsInSyncListener(EventListener<Void> eventListener) {
        verifyNotTerminated();
        this.asyncQueue.enqueueAndForget(new RunnableC22620OooO0oo(0, this, eventListener));
    }

    public Task<Void> configureFieldIndexes(List<FieldIndex> list) {
        verifyNotTerminated();
        return this.asyncQueue.enqueue(new com.google.firebase.appcheck.internal.OooO00o(1, this, list));
    }

    public void deleteAllFieldIndexes() {
        verifyNotTerminated();
        this.asyncQueue.enqueueAndForget(new Runnable() { // from class: com.google.firebase.firestore.core.OooOoO0
            @Override // java.lang.Runnable
            public final void run() {
                this.f68182OooOo0o.lambda$deleteAllFieldIndexes$23();
            }
        });
    }

    public Task<Void> disableNetwork() {
        verifyNotTerminated();
        return this.asyncQueue.enqueue(new Runnable() { // from class: com.google.firebase.firestore.core.OooOOOO
            @Override // java.lang.Runnable
            public final void run() {
                this.f68160OooOo0o.lambda$disableNetwork$4();
            }
        });
    }

    public Task<Void> enableNetwork() {
        verifyNotTerminated();
        return this.asyncQueue.enqueue(new Runnable() { // from class: com.google.firebase.firestore.core.OooOO0
            @Override // java.lang.Runnable
            public final void run() {
                this.f68146OooOo0o.lambda$enableNetwork$5();
            }
        });
    }

    public Task<Document> getDocumentFromLocalCache(final DocumentKey documentKey) {
        verifyNotTerminated();
        return this.asyncQueue.enqueue(new Callable() { // from class: com.google.firebase.firestore.core.OooO0oO
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f68142OooOo0o.lambda$getDocumentFromLocalCache$9(documentKey);
            }
        }).continueWith(new com.aspose.slides.OooOo00());
    }

    public Task<ViewSnapshot> getDocumentsFromLocalCache(final Query query) {
        verifyNotTerminated();
        return this.asyncQueue.enqueue(new Callable() { // from class: com.google.firebase.firestore.core.OooO0o0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f68140OooOo0o.lambda$getDocumentsFromLocalCache$11(query);
            }
        });
    }

    public Task<Query> getNamedQuery(final String str) {
        verifyNotTerminated();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.asyncQueue.enqueueAndForget(new Runnable() { // from class: com.google.firebase.firestore.core.OooOOoo
            @Override // java.lang.Runnable
            public final void run() {
                this.f68170OooOo0o.lambda$getNamedQuery$20(str, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public boolean isTerminated() {
        return this.asyncQueue.isShuttingDown();
    }

    public QueryListener listen(Query query, EventManager.ListenOptions listenOptions, EventListener<ViewSnapshot> eventListener) {
        verifyNotTerminated();
        final QueryListener queryListener = new QueryListener(query, listenOptions, eventListener);
        this.asyncQueue.enqueueAndForget(new Runnable() { // from class: com.google.firebase.firestore.core.OooOOOo
            @Override // java.lang.Runnable
            public final void run() {
                this.f68162OooOo0o.lambda$listen$7(queryListener);
            }
        });
        return queryListener;
    }

    public void loadBundle(InputStream inputStream, final LoadBundleTask loadBundleTask) {
        verifyNotTerminated();
        final BundleReader bundleReader = new BundleReader(this.bundleSerializer, inputStream);
        this.asyncQueue.enqueueAndForget(new Runnable() { // from class: com.google.firebase.firestore.core.OooO0o
            @Override // java.lang.Runnable
            public final void run() {
                this.f68137OooOo0o.lambda$loadBundle$19(bundleReader, loadBundleTask);
            }
        });
    }

    public void removeSnapshotsInSyncListener(final EventListener<Void> eventListener) {
        this.asyncQueue.enqueueAndForget(new Runnable() { // from class: com.google.firebase.firestore.core.OooOOo
            @Override // java.lang.Runnable
            public final void run() {
                this.f68164OooOo0o.lambda$removeSnapshotsInSyncListener$24(eventListener);
            }
        });
    }

    public Task<Map<String, Value>> runAggregateQuery(final Query query, final List<AggregateField> list) {
        verifyNotTerminated();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.asyncQueue.enqueueAndForget(new Runnable() { // from class: com.google.firebase.firestore.core.OooOOo0
            @Override // java.lang.Runnable
            public final void run() {
                this.f68166OooOo0o.lambda$runAggregateQuery$16(query, list, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public void setIndexAutoCreationEnabled(final boolean z) {
        verifyNotTerminated();
        this.asyncQueue.enqueueAndForget(new Runnable() { // from class: com.google.firebase.firestore.core.OooOo0o
            @Override // java.lang.Runnable
            public final void run() {
                this.f68180OooOo0o.lambda$setIndexAutoCreationEnabled$22(z);
            }
        });
    }

    public void stopListening(final QueryListener queryListener) {
        this.asyncQueue.enqueueAndForget(new Runnable() { // from class: com.google.firebase.firestore.core.OooOo00
            @Override // java.lang.Runnable
            public final void run() {
                this.f68177OooOo0o.lambda$stopListening$8(queryListener);
            }
        });
    }

    public Task<Void> terminate() {
        this.authProvider.removeChangeListener();
        this.appCheckProvider.removeChangeListener();
        return this.asyncQueue.enqueueAndInitiateShutdown(new Runnable() { // from class: com.google.firebase.firestore.core.OooOO0O
            @Override // java.lang.Runnable
            public final void run() {
                this.f68147OooOo0o.lambda$terminate$6();
            }
        });
    }

    public <TResult> Task<TResult> transaction(final TransactionOptions transactionOptions, final Function<Transaction, Task<TResult>> function) {
        verifyNotTerminated();
        return AsyncQueue.callTask(this.asyncQueue.getExecutor(), new Callable() { // from class: com.google.firebase.firestore.core.OooOo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.lambda$transaction$13(transactionOptions, function);
            }
        });
    }

    public Task<Void> waitForPendingWrites() {
        verifyNotTerminated();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.asyncQueue.enqueueAndForget(new Runnable() { // from class: com.google.firebase.firestore.core.OooO
            @Override // java.lang.Runnable
            public final void run() {
                this.f68127OooOo0o.lambda$waitForPendingWrites$17(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public Task<Void> write(final List<Mutation> list) {
        verifyNotTerminated();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.asyncQueue.enqueueAndForget(new Runnable() { // from class: com.google.firebase.firestore.core.OooOOO0
            @Override // java.lang.Runnable
            public final void run() {
                this.f68158OooOo0o.lambda$write$12(list, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }
}
