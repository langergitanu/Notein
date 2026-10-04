package com.google.firebase.firestore;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Function;
import com.google.firebase.firestore.util.Preconditions;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public class AggregateQuery {
    private final List<AggregateField> aggregateFieldList;
    private final Query query;

    public AggregateQuery(Query query, List<AggregateField> list) {
        this.query = query;
        this.aggregateFieldList = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$get$0(FirestoreClient firestoreClient) {
        return firestoreClient.runAggregateQuery(this.query.query, this.aggregateFieldList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$get$1(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.isSuccessful()) {
            taskCompletionSource.setResult(new AggregateQuerySnapshot(this, (Map) task.getResult()));
            return null;
        }
        taskCompletionSource.setException(task.getException());
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AggregateQuery)) {
            return false;
        }
        AggregateQuery aggregateQuery = (AggregateQuery) obj;
        return this.query.equals(aggregateQuery.query) && this.aggregateFieldList.equals(aggregateQuery.aggregateFieldList);
    }

    public Task<AggregateQuerySnapshot> get(AggregateSource aggregateSource) {
        Preconditions.checkNotNull(aggregateSource, "AggregateSource must not be null");
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ((Task) this.query.firestore.callClient(new Function() { // from class: com.google.firebase.firestore.OooO00o
            @Override // com.google.firebase.firestore.util.Function
            public final Object apply(Object obj) {
                return this.f68055OooO00o.lambda$get$0((FirestoreClient) obj);
            }
        })).continueWith(Executors.DIRECT_EXECUTOR, new Continuation() { // from class: com.google.firebase.firestore.OooO0O0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f68057OooOo0o.lambda$get$1(taskCompletionSource, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    public List<AggregateField> getAggregateFields() {
        return this.aggregateFieldList;
    }

    public Query getQuery() {
        return this.query;
    }

    public int hashCode() {
        return Objects.hash(this.query, this.aggregateFieldList);
    }
}
