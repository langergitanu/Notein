package com.google.firestore.p565v1;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.Empty;
import com.google.protobuf.ExtensionRegistryLite;
import io.grpc.stub.AbstractC23924OooO0Oo;
import io.grpc.stub.C23925OooO0o0;
import io.grpc.stub.C23930OooO0oo;
import io.grpc.stub.OooO;
import io.grpc.stub.OooO00o;
import io.grpc.stub.OooO0O0;
import java.util.Iterator;
import java.util.logging.Logger;
import oO000Ooo.C32080OooO0O0;
import oO0OOo0o.AbstractC33060OooO0Oo;
import oO0OOo0o.C33094OoooO;
import oO0OOo0o.C33101OoooOO0;
import oO0OOo0o.C33115Ooooooo;
import oO0OOo0o.OooO0OO;
import oO0OOo0o.OooO0o;
import oO0OOo0o.o0OoOo0;

/* JADX INFO: loaded from: classes8.dex */
public final class FirestoreGrpc {
    private static final int METHODID_BATCH_GET_DOCUMENTS = 4;
    private static final int METHODID_BEGIN_TRANSACTION = 5;
    private static final int METHODID_COMMIT = 6;
    private static final int METHODID_CREATE_DOCUMENT = 11;
    private static final int METHODID_DELETE_DOCUMENT = 3;
    private static final int METHODID_GET_DOCUMENT = 0;
    private static final int METHODID_LISTEN = 13;
    private static final int METHODID_LIST_COLLECTION_IDS = 10;
    private static final int METHODID_LIST_DOCUMENTS = 1;
    private static final int METHODID_ROLLBACK = 7;
    private static final int METHODID_RUN_AGGREGATION_QUERY = 9;
    private static final int METHODID_RUN_QUERY = 8;
    private static final int METHODID_UPDATE_DOCUMENT = 2;
    private static final int METHODID_WRITE = 12;
    public static final String SERVICE_NAME = "google.firestore.v1.Firestore";
    private static volatile C33101OoooOO0<BatchGetDocumentsRequest, BatchGetDocumentsResponse> getBatchGetDocumentsMethod;
    private static volatile C33101OoooOO0<BeginTransactionRequest, BeginTransactionResponse> getBeginTransactionMethod;
    private static volatile C33101OoooOO0<CommitRequest, CommitResponse> getCommitMethod;
    private static volatile C33101OoooOO0<CreateDocumentRequest, Document> getCreateDocumentMethod;
    private static volatile C33101OoooOO0<DeleteDocumentRequest, Empty> getDeleteDocumentMethod;
    private static volatile C33101OoooOO0<GetDocumentRequest, Document> getGetDocumentMethod;
    private static volatile C33101OoooOO0<ListCollectionIdsRequest, ListCollectionIdsResponse> getListCollectionIdsMethod;
    private static volatile C33101OoooOO0<ListDocumentsRequest, ListDocumentsResponse> getListDocumentsMethod;
    private static volatile C33101OoooOO0<ListenRequest, ListenResponse> getListenMethod;
    private static volatile C33101OoooOO0<RollbackRequest, Empty> getRollbackMethod;
    private static volatile C33101OoooOO0<RunAggregationQueryRequest, RunAggregationQueryResponse> getRunAggregationQueryMethod;
    private static volatile C33101OoooOO0<RunQueryRequest, RunQueryResponse> getRunQueryMethod;
    private static volatile C33101OoooOO0<UpdateDocumentRequest, Document> getUpdateDocumentMethod;
    private static volatile C33101OoooOO0<WriteRequest, WriteResponse> getWriteMethod;
    private static volatile o0OoOo0 serviceDescriptor;

    public interface AsyncService {
        default void batchGetDocuments(BatchGetDocumentsRequest batchGetDocumentsRequest, OooO<BatchGetDocumentsResponse> oooO) {
            C23930OooO0oo.OooO00o(FirestoreGrpc.getBatchGetDocumentsMethod(), oooO);
        }

        default void beginTransaction(BeginTransactionRequest beginTransactionRequest, OooO<BeginTransactionResponse> oooO) {
            C23930OooO0oo.OooO00o(FirestoreGrpc.getBeginTransactionMethod(), oooO);
        }

        default void commit(CommitRequest commitRequest, OooO<CommitResponse> oooO) {
            C23930OooO0oo.OooO00o(FirestoreGrpc.getCommitMethod(), oooO);
        }

        default void createDocument(CreateDocumentRequest createDocumentRequest, OooO<Document> oooO) {
            C23930OooO0oo.OooO00o(FirestoreGrpc.getCreateDocumentMethod(), oooO);
        }

        default void deleteDocument(DeleteDocumentRequest deleteDocumentRequest, OooO<Empty> oooO) {
            C23930OooO0oo.OooO00o(FirestoreGrpc.getDeleteDocumentMethod(), oooO);
        }

        default void getDocument(GetDocumentRequest getDocumentRequest, OooO<Document> oooO) {
            C23930OooO0oo.OooO00o(FirestoreGrpc.getGetDocumentMethod(), oooO);
        }

        default void listCollectionIds(ListCollectionIdsRequest listCollectionIdsRequest, OooO<ListCollectionIdsResponse> oooO) {
            C23930OooO0oo.OooO00o(FirestoreGrpc.getListCollectionIdsMethod(), oooO);
        }

        default void listDocuments(ListDocumentsRequest listDocumentsRequest, OooO<ListDocumentsResponse> oooO) {
            C23930OooO0oo.OooO00o(FirestoreGrpc.getListDocumentsMethod(), oooO);
        }

        default OooO<ListenRequest> listen(OooO<ListenResponse> oooO) {
            C23930OooO0oo.OooO00o(FirestoreGrpc.getListenMethod(), oooO);
            return new C23930OooO0oo.OooO00o();
        }

        default void rollback(RollbackRequest rollbackRequest, OooO<Empty> oooO) {
            C23930OooO0oo.OooO00o(FirestoreGrpc.getRollbackMethod(), oooO);
        }

        default void runAggregationQuery(RunAggregationQueryRequest runAggregationQueryRequest, OooO<RunAggregationQueryResponse> oooO) {
            C23930OooO0oo.OooO00o(FirestoreGrpc.getRunAggregationQueryMethod(), oooO);
        }

        default void runQuery(RunQueryRequest runQueryRequest, OooO<RunQueryResponse> oooO) {
            C23930OooO0oo.OooO00o(FirestoreGrpc.getRunQueryMethod(), oooO);
        }

        default void updateDocument(UpdateDocumentRequest updateDocumentRequest, OooO<Document> oooO) {
            C23930OooO0oo.OooO00o(FirestoreGrpc.getUpdateDocumentMethod(), oooO);
        }

        default OooO<WriteRequest> write(OooO<WriteResponse> oooO) {
            C23930OooO0oo.OooO00o(FirestoreGrpc.getWriteMethod(), oooO);
            return new C23930OooO0oo.OooO00o();
        }
    }

    public static final class FirestoreBlockingStub extends OooO0O0<FirestoreBlockingStub> {
        public Iterator<BatchGetDocumentsResponse> batchGetDocuments(BatchGetDocumentsRequest batchGetDocumentsRequest) {
            return C23925OooO0o0.OooO0OO(getChannel(), FirestoreGrpc.getBatchGetDocumentsMethod(), getCallOptions(), batchGetDocumentsRequest);
        }

        public BeginTransactionResponse beginTransaction(BeginTransactionRequest beginTransactionRequest) {
            return (BeginTransactionResponse) C23925OooO0o0.OooO0Oo(getChannel(), FirestoreGrpc.getBeginTransactionMethod(), getCallOptions(), beginTransactionRequest);
        }

        public CommitResponse commit(CommitRequest commitRequest) {
            return (CommitResponse) C23925OooO0o0.OooO0Oo(getChannel(), FirestoreGrpc.getCommitMethod(), getCallOptions(), commitRequest);
        }

        public Document createDocument(CreateDocumentRequest createDocumentRequest) {
            return (Document) C23925OooO0o0.OooO0Oo(getChannel(), FirestoreGrpc.getCreateDocumentMethod(), getCallOptions(), createDocumentRequest);
        }

        public Empty deleteDocument(DeleteDocumentRequest deleteDocumentRequest) {
            return (Empty) C23925OooO0o0.OooO0Oo(getChannel(), FirestoreGrpc.getDeleteDocumentMethod(), getCallOptions(), deleteDocumentRequest);
        }

        public Document getDocument(GetDocumentRequest getDocumentRequest) {
            return (Document) C23925OooO0o0.OooO0Oo(getChannel(), FirestoreGrpc.getGetDocumentMethod(), getCallOptions(), getDocumentRequest);
        }

        public ListCollectionIdsResponse listCollectionIds(ListCollectionIdsRequest listCollectionIdsRequest) {
            return (ListCollectionIdsResponse) C23925OooO0o0.OooO0Oo(getChannel(), FirestoreGrpc.getListCollectionIdsMethod(), getCallOptions(), listCollectionIdsRequest);
        }

        public ListDocumentsResponse listDocuments(ListDocumentsRequest listDocumentsRequest) {
            return (ListDocumentsResponse) C23925OooO0o0.OooO0Oo(getChannel(), FirestoreGrpc.getListDocumentsMethod(), getCallOptions(), listDocumentsRequest);
        }

        public Empty rollback(RollbackRequest rollbackRequest) {
            return (Empty) C23925OooO0o0.OooO0Oo(getChannel(), FirestoreGrpc.getRollbackMethod(), getCallOptions(), rollbackRequest);
        }

        public Iterator<RunAggregationQueryResponse> runAggregationQuery(RunAggregationQueryRequest runAggregationQueryRequest) {
            return C23925OooO0o0.OooO0OO(getChannel(), FirestoreGrpc.getRunAggregationQueryMethod(), getCallOptions(), runAggregationQueryRequest);
        }

        public Iterator<RunQueryResponse> runQuery(RunQueryRequest runQueryRequest) {
            return C23925OooO0o0.OooO0OO(getChannel(), FirestoreGrpc.getRunQueryMethod(), getCallOptions(), runQueryRequest);
        }

        public Document updateDocument(UpdateDocumentRequest updateDocumentRequest) {
            return (Document) C23925OooO0o0.OooO0Oo(getChannel(), FirestoreGrpc.getUpdateDocumentMethod(), getCallOptions(), updateDocumentRequest);
        }

        private FirestoreBlockingStub(AbstractC33060OooO0Oo abstractC33060OooO0Oo, OooO0OO oooO0OO) {
            super(abstractC33060OooO0Oo, oooO0OO);
        }

        @Override // io.grpc.stub.AbstractC23924OooO0Oo
        public FirestoreBlockingStub build(AbstractC33060OooO0Oo abstractC33060OooO0Oo, OooO0OO oooO0OO) {
            return new FirestoreBlockingStub(abstractC33060OooO0Oo, oooO0OO);
        }
    }

    public static final class FirestoreFutureStub extends io.grpc.stub.OooO0OO<FirestoreFutureStub> {
        public ListenableFuture<BeginTransactionResponse> beginTransaction(BeginTransactionRequest beginTransactionRequest) {
            return C23925OooO0o0.OooO0o(getChannel().OooO0oO(FirestoreGrpc.getBeginTransactionMethod(), getCallOptions()), beginTransactionRequest);
        }

        public ListenableFuture<CommitResponse> commit(CommitRequest commitRequest) {
            return C23925OooO0o0.OooO0o(getChannel().OooO0oO(FirestoreGrpc.getCommitMethod(), getCallOptions()), commitRequest);
        }

        public ListenableFuture<Document> createDocument(CreateDocumentRequest createDocumentRequest) {
            return C23925OooO0o0.OooO0o(getChannel().OooO0oO(FirestoreGrpc.getCreateDocumentMethod(), getCallOptions()), createDocumentRequest);
        }

        public ListenableFuture<Empty> deleteDocument(DeleteDocumentRequest deleteDocumentRequest) {
            return C23925OooO0o0.OooO0o(getChannel().OooO0oO(FirestoreGrpc.getDeleteDocumentMethod(), getCallOptions()), deleteDocumentRequest);
        }

        public ListenableFuture<Document> getDocument(GetDocumentRequest getDocumentRequest) {
            return C23925OooO0o0.OooO0o(getChannel().OooO0oO(FirestoreGrpc.getGetDocumentMethod(), getCallOptions()), getDocumentRequest);
        }

        public ListenableFuture<ListCollectionIdsResponse> listCollectionIds(ListCollectionIdsRequest listCollectionIdsRequest) {
            return C23925OooO0o0.OooO0o(getChannel().OooO0oO(FirestoreGrpc.getListCollectionIdsMethod(), getCallOptions()), listCollectionIdsRequest);
        }

        public ListenableFuture<ListDocumentsResponse> listDocuments(ListDocumentsRequest listDocumentsRequest) {
            return C23925OooO0o0.OooO0o(getChannel().OooO0oO(FirestoreGrpc.getListDocumentsMethod(), getCallOptions()), listDocumentsRequest);
        }

        public ListenableFuture<Empty> rollback(RollbackRequest rollbackRequest) {
            return C23925OooO0o0.OooO0o(getChannel().OooO0oO(FirestoreGrpc.getRollbackMethod(), getCallOptions()), rollbackRequest);
        }

        public ListenableFuture<Document> updateDocument(UpdateDocumentRequest updateDocumentRequest) {
            return C23925OooO0o0.OooO0o(getChannel().OooO0oO(FirestoreGrpc.getUpdateDocumentMethod(), getCallOptions()), updateDocumentRequest);
        }

        private FirestoreFutureStub(AbstractC33060OooO0Oo abstractC33060OooO0Oo, OooO0OO oooO0OO) {
            super(abstractC33060OooO0Oo, oooO0OO);
        }

        @Override // io.grpc.stub.AbstractC23924OooO0Oo
        public FirestoreFutureStub build(AbstractC33060OooO0Oo abstractC33060OooO0Oo, OooO0OO oooO0OO) {
            return new FirestoreFutureStub(abstractC33060OooO0Oo, oooO0OO);
        }
    }

    public static abstract class FirestoreImplBase implements AsyncService {
        public final C33115Ooooooo bindService() {
            return FirestoreGrpc.bindService(this);
        }
    }

    public static final class FirestoreStub extends OooO00o<FirestoreStub> {
        public void batchGetDocuments(BatchGetDocumentsRequest batchGetDocumentsRequest, OooO<BatchGetDocumentsResponse> oooO) {
            OooO0o oooO0oOooO0oO = getChannel().OooO0oO(FirestoreGrpc.getBatchGetDocumentsMethod(), getCallOptions());
            Logger logger = C23925OooO0o0.f80311OooO00o;
            Preconditions.checkNotNull(oooO, "responseObserver");
            C23925OooO0o0.OooO0O0(oooO0oOooO0oO, batchGetDocumentsRequest, new C23925OooO0o0.C19590OooO0o0(oooO, new C23925OooO0o0.OooO0O0(oooO0oOooO0oO, true)));
        }

        public void beginTransaction(BeginTransactionRequest beginTransactionRequest, OooO<BeginTransactionResponse> oooO) {
            C23925OooO0o0.OooO00o(getChannel().OooO0oO(FirestoreGrpc.getBeginTransactionMethod(), getCallOptions()), beginTransactionRequest, oooO);
        }

        public void commit(CommitRequest commitRequest, OooO<CommitResponse> oooO) {
            C23925OooO0o0.OooO00o(getChannel().OooO0oO(FirestoreGrpc.getCommitMethod(), getCallOptions()), commitRequest, oooO);
        }

        public void createDocument(CreateDocumentRequest createDocumentRequest, OooO<Document> oooO) {
            C23925OooO0o0.OooO00o(getChannel().OooO0oO(FirestoreGrpc.getCreateDocumentMethod(), getCallOptions()), createDocumentRequest, oooO);
        }

        public void deleteDocument(DeleteDocumentRequest deleteDocumentRequest, OooO<Empty> oooO) {
            C23925OooO0o0.OooO00o(getChannel().OooO0oO(FirestoreGrpc.getDeleteDocumentMethod(), getCallOptions()), deleteDocumentRequest, oooO);
        }

        public void getDocument(GetDocumentRequest getDocumentRequest, OooO<Document> oooO) {
            C23925OooO0o0.OooO00o(getChannel().OooO0oO(FirestoreGrpc.getGetDocumentMethod(), getCallOptions()), getDocumentRequest, oooO);
        }

        public void listCollectionIds(ListCollectionIdsRequest listCollectionIdsRequest, OooO<ListCollectionIdsResponse> oooO) {
            C23925OooO0o0.OooO00o(getChannel().OooO0oO(FirestoreGrpc.getListCollectionIdsMethod(), getCallOptions()), listCollectionIdsRequest, oooO);
        }

        public void listDocuments(ListDocumentsRequest listDocumentsRequest, OooO<ListDocumentsResponse> oooO) {
            C23925OooO0o0.OooO00o(getChannel().OooO0oO(FirestoreGrpc.getListDocumentsMethod(), getCallOptions()), listDocumentsRequest, oooO);
        }

        public OooO<ListenRequest> listen(OooO<ListenResponse> oooO) {
            OooO0o oooO0oOooO0oO = getChannel().OooO0oO(FirestoreGrpc.getListenMethod(), getCallOptions());
            Logger logger = C23925OooO0o0.f80311OooO00o;
            Preconditions.checkNotNull(oooO, "responseObserver");
            C23925OooO0o0.OooO0O0 oooO0O0 = new C23925OooO0o0.OooO0O0(oooO0oOooO0oO, true);
            C23925OooO0o0.C19590OooO0o0 c19590OooO0o0 = new C23925OooO0o0.C19590OooO0o0(oooO, oooO0O0);
            oooO0oOooO0oO.start(c19590OooO0o0, new C33094OoooO());
            c19590OooO0o0.OooO00o();
            return oooO0O0;
        }

        public void rollback(RollbackRequest rollbackRequest, OooO<Empty> oooO) {
            C23925OooO0o0.OooO00o(getChannel().OooO0oO(FirestoreGrpc.getRollbackMethod(), getCallOptions()), rollbackRequest, oooO);
        }

        public void runAggregationQuery(RunAggregationQueryRequest runAggregationQueryRequest, OooO<RunAggregationQueryResponse> oooO) {
            OooO0o oooO0oOooO0oO = getChannel().OooO0oO(FirestoreGrpc.getRunAggregationQueryMethod(), getCallOptions());
            Logger logger = C23925OooO0o0.f80311OooO00o;
            Preconditions.checkNotNull(oooO, "responseObserver");
            C23925OooO0o0.OooO0O0(oooO0oOooO0oO, runAggregationQueryRequest, new C23925OooO0o0.C19590OooO0o0(oooO, new C23925OooO0o0.OooO0O0(oooO0oOooO0oO, true)));
        }

        public void runQuery(RunQueryRequest runQueryRequest, OooO<RunQueryResponse> oooO) {
            OooO0o oooO0oOooO0oO = getChannel().OooO0oO(FirestoreGrpc.getRunQueryMethod(), getCallOptions());
            Logger logger = C23925OooO0o0.f80311OooO00o;
            Preconditions.checkNotNull(oooO, "responseObserver");
            C23925OooO0o0.OooO0O0(oooO0oOooO0oO, runQueryRequest, new C23925OooO0o0.C19590OooO0o0(oooO, new C23925OooO0o0.OooO0O0(oooO0oOooO0oO, true)));
        }

        public void updateDocument(UpdateDocumentRequest updateDocumentRequest, OooO<Document> oooO) {
            C23925OooO0o0.OooO00o(getChannel().OooO0oO(FirestoreGrpc.getUpdateDocumentMethod(), getCallOptions()), updateDocumentRequest, oooO);
        }

        public OooO<WriteRequest> write(OooO<WriteResponse> oooO) {
            OooO0o oooO0oOooO0oO = getChannel().OooO0oO(FirestoreGrpc.getWriteMethod(), getCallOptions());
            Logger logger = C23925OooO0o0.f80311OooO00o;
            Preconditions.checkNotNull(oooO, "responseObserver");
            C23925OooO0o0.OooO0O0 oooO0O0 = new C23925OooO0o0.OooO0O0(oooO0oOooO0oO, true);
            C23925OooO0o0.C19590OooO0o0 c19590OooO0o0 = new C23925OooO0o0.C19590OooO0o0(oooO, oooO0O0);
            oooO0oOooO0oO.start(c19590OooO0o0, new C33094OoooO());
            c19590OooO0o0.OooO00o();
            return oooO0O0;
        }

        private FirestoreStub(AbstractC33060OooO0Oo abstractC33060OooO0Oo, OooO0OO oooO0OO) {
            super(abstractC33060OooO0Oo, oooO0OO);
        }

        @Override // io.grpc.stub.AbstractC23924OooO0Oo
        public FirestoreStub build(AbstractC33060OooO0Oo abstractC33060OooO0Oo, OooO0OO oooO0OO) {
            return new FirestoreStub(abstractC33060OooO0Oo, oooO0OO);
        }
    }

    private FirestoreGrpc() {
    }

    public static final C33115Ooooooo bindService(AsyncService asyncService) {
        C33115Ooooooo.OooO00o oooO00o = new C33115Ooooooo.OooO00o(getServiceDescriptor());
        C33101OoooOO0<GetDocumentRequest, Document> getDocumentMethod = getGetDocumentMethod();
        new MethodHandlers(asyncService, 0);
        oooO00o.OooO00o(getDocumentMethod, new C23930OooO0oo.OooO0OO());
        C33101OoooOO0<ListDocumentsRequest, ListDocumentsResponse> listDocumentsMethod = getListDocumentsMethod();
        new MethodHandlers(asyncService, 1);
        oooO00o.OooO00o(listDocumentsMethod, new C23930OooO0oo.OooO0OO());
        C33101OoooOO0<UpdateDocumentRequest, Document> updateDocumentMethod = getUpdateDocumentMethod();
        new MethodHandlers(asyncService, 2);
        oooO00o.OooO00o(updateDocumentMethod, new C23930OooO0oo.OooO0OO());
        C33101OoooOO0<DeleteDocumentRequest, Empty> deleteDocumentMethod = getDeleteDocumentMethod();
        new MethodHandlers(asyncService, 3);
        oooO00o.OooO00o(deleteDocumentMethod, new C23930OooO0oo.OooO0OO());
        C33101OoooOO0<BatchGetDocumentsRequest, BatchGetDocumentsResponse> batchGetDocumentsMethod = getBatchGetDocumentsMethod();
        new MethodHandlers(asyncService, 4);
        oooO00o.OooO00o(batchGetDocumentsMethod, new C23930OooO0oo.OooO0OO());
        C33101OoooOO0<BeginTransactionRequest, BeginTransactionResponse> beginTransactionMethod = getBeginTransactionMethod();
        new MethodHandlers(asyncService, 5);
        oooO00o.OooO00o(beginTransactionMethod, new C23930OooO0oo.OooO0OO());
        C33101OoooOO0<CommitRequest, CommitResponse> commitMethod = getCommitMethod();
        new MethodHandlers(asyncService, 6);
        oooO00o.OooO00o(commitMethod, new C23930OooO0oo.OooO0OO());
        C33101OoooOO0<RollbackRequest, Empty> rollbackMethod = getRollbackMethod();
        new MethodHandlers(asyncService, 7);
        oooO00o.OooO00o(rollbackMethod, new C23930OooO0oo.OooO0OO());
        C33101OoooOO0<RunQueryRequest, RunQueryResponse> runQueryMethod = getRunQueryMethod();
        new MethodHandlers(asyncService, 8);
        oooO00o.OooO00o(runQueryMethod, new C23930OooO0oo.OooO0OO());
        C33101OoooOO0<RunAggregationQueryRequest, RunAggregationQueryResponse> runAggregationQueryMethod = getRunAggregationQueryMethod();
        new MethodHandlers(asyncService, 9);
        oooO00o.OooO00o(runAggregationQueryMethod, new C23930OooO0oo.OooO0OO());
        C33101OoooOO0<WriteRequest, WriteResponse> writeMethod = getWriteMethod();
        new MethodHandlers(asyncService, 12);
        oooO00o.OooO00o(writeMethod, new C23930OooO0oo.OooO0O0());
        C33101OoooOO0<ListenRequest, ListenResponse> listenMethod = getListenMethod();
        new MethodHandlers(asyncService, 13);
        oooO00o.OooO00o(listenMethod, new C23930OooO0oo.OooO0O0());
        C33101OoooOO0<ListCollectionIdsRequest, ListCollectionIdsResponse> listCollectionIdsMethod = getListCollectionIdsMethod();
        new MethodHandlers(asyncService, 10);
        oooO00o.OooO00o(listCollectionIdsMethod, new C23930OooO0oo.OooO0OO());
        C33101OoooOO0<CreateDocumentRequest, Document> createDocumentMethod = getCreateDocumentMethod();
        new MethodHandlers(asyncService, 11);
        oooO00o.OooO00o(createDocumentMethod, new C23930OooO0oo.OooO0OO());
        return oooO00o.OooO0O0();
    }

    public static C33101OoooOO0<BatchGetDocumentsRequest, BatchGetDocumentsResponse> getBatchGetDocumentsMethod() {
        C33101OoooOO0<BatchGetDocumentsRequest, BatchGetDocumentsResponse> c33101OoooOO0OooO00o;
        C33101OoooOO0<BatchGetDocumentsRequest, BatchGetDocumentsResponse> c33101OoooOO0 = getBatchGetDocumentsMethod;
        if (c33101OoooOO0 != null) {
            return c33101OoooOO0;
        }
        synchronized (FirestoreGrpc.class) {
            try {
                c33101OoooOO0OooO00o = getBatchGetDocumentsMethod;
                if (c33101OoooOO0OooO00o == null) {
                    C33101OoooOO0.OooO00o oooO00oOooO0O0 = C33101OoooOO0.OooO0O0();
                    oooO00oOooO0O0.f119674OooO0OO = C33101OoooOO0.OooO0OO.f119677OooOo;
                    oooO00oOooO0O0.f119675OooO0Oo = C33101OoooOO0.OooO00o(SERVICE_NAME, "BatchGetDocuments");
                    oooO00oOooO0O0.f119676OooO0o0 = true;
                    BatchGetDocumentsRequest defaultInstance = BatchGetDocumentsRequest.getDefaultInstance();
                    ExtensionRegistryLite extensionRegistryLite = C32080OooO0O0.f114903OooO00o;
                    oooO00oOooO0O0.f119672OooO00o = new C32080OooO0O0.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f119673OooO0O0 = new C32080OooO0O0.OooO00o(BatchGetDocumentsResponse.getDefaultInstance());
                    c33101OoooOO0OooO00o = oooO00oOooO0O0.OooO00o();
                    getBatchGetDocumentsMethod = c33101OoooOO0OooO00o;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c33101OoooOO0OooO00o;
    }

    public static C33101OoooOO0<BeginTransactionRequest, BeginTransactionResponse> getBeginTransactionMethod() {
        C33101OoooOO0<BeginTransactionRequest, BeginTransactionResponse> c33101OoooOO0OooO00o;
        C33101OoooOO0<BeginTransactionRequest, BeginTransactionResponse> c33101OoooOO0 = getBeginTransactionMethod;
        if (c33101OoooOO0 != null) {
            return c33101OoooOO0;
        }
        synchronized (FirestoreGrpc.class) {
            try {
                c33101OoooOO0OooO00o = getBeginTransactionMethod;
                if (c33101OoooOO0OooO00o == null) {
                    C33101OoooOO0.OooO00o oooO00oOooO0O0 = C33101OoooOO0.OooO0O0();
                    oooO00oOooO0O0.f119674OooO0OO = C33101OoooOO0.OooO0OO.f119678OooOo0o;
                    oooO00oOooO0O0.f119675OooO0Oo = C33101OoooOO0.OooO00o(SERVICE_NAME, "BeginTransaction");
                    oooO00oOooO0O0.f119676OooO0o0 = true;
                    BeginTransactionRequest defaultInstance = BeginTransactionRequest.getDefaultInstance();
                    ExtensionRegistryLite extensionRegistryLite = C32080OooO0O0.f114903OooO00o;
                    oooO00oOooO0O0.f119672OooO00o = new C32080OooO0O0.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f119673OooO0O0 = new C32080OooO0O0.OooO00o(BeginTransactionResponse.getDefaultInstance());
                    c33101OoooOO0OooO00o = oooO00oOooO0O0.OooO00o();
                    getBeginTransactionMethod = c33101OoooOO0OooO00o;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c33101OoooOO0OooO00o;
    }

    public static C33101OoooOO0<CommitRequest, CommitResponse> getCommitMethod() {
        C33101OoooOO0<CommitRequest, CommitResponse> c33101OoooOO0OooO00o;
        C33101OoooOO0<CommitRequest, CommitResponse> c33101OoooOO0 = getCommitMethod;
        if (c33101OoooOO0 != null) {
            return c33101OoooOO0;
        }
        synchronized (FirestoreGrpc.class) {
            try {
                c33101OoooOO0OooO00o = getCommitMethod;
                if (c33101OoooOO0OooO00o == null) {
                    C33101OoooOO0.OooO00o oooO00oOooO0O0 = C33101OoooOO0.OooO0O0();
                    oooO00oOooO0O0.f119674OooO0OO = C33101OoooOO0.OooO0OO.f119678OooOo0o;
                    oooO00oOooO0O0.f119675OooO0Oo = C33101OoooOO0.OooO00o(SERVICE_NAME, "Commit");
                    oooO00oOooO0O0.f119676OooO0o0 = true;
                    CommitRequest defaultInstance = CommitRequest.getDefaultInstance();
                    ExtensionRegistryLite extensionRegistryLite = C32080OooO0O0.f114903OooO00o;
                    oooO00oOooO0O0.f119672OooO00o = new C32080OooO0O0.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f119673OooO0O0 = new C32080OooO0O0.OooO00o(CommitResponse.getDefaultInstance());
                    c33101OoooOO0OooO00o = oooO00oOooO0O0.OooO00o();
                    getCommitMethod = c33101OoooOO0OooO00o;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c33101OoooOO0OooO00o;
    }

    public static C33101OoooOO0<CreateDocumentRequest, Document> getCreateDocumentMethod() {
        C33101OoooOO0<CreateDocumentRequest, Document> c33101OoooOO0OooO00o;
        C33101OoooOO0<CreateDocumentRequest, Document> c33101OoooOO0 = getCreateDocumentMethod;
        if (c33101OoooOO0 != null) {
            return c33101OoooOO0;
        }
        synchronized (FirestoreGrpc.class) {
            try {
                c33101OoooOO0OooO00o = getCreateDocumentMethod;
                if (c33101OoooOO0OooO00o == null) {
                    C33101OoooOO0.OooO00o oooO00oOooO0O0 = C33101OoooOO0.OooO0O0();
                    oooO00oOooO0O0.f119674OooO0OO = C33101OoooOO0.OooO0OO.f119678OooOo0o;
                    oooO00oOooO0O0.f119675OooO0Oo = C33101OoooOO0.OooO00o(SERVICE_NAME, "CreateDocument");
                    oooO00oOooO0O0.f119676OooO0o0 = true;
                    CreateDocumentRequest defaultInstance = CreateDocumentRequest.getDefaultInstance();
                    ExtensionRegistryLite extensionRegistryLite = C32080OooO0O0.f114903OooO00o;
                    oooO00oOooO0O0.f119672OooO00o = new C32080OooO0O0.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f119673OooO0O0 = new C32080OooO0O0.OooO00o(Document.getDefaultInstance());
                    c33101OoooOO0OooO00o = oooO00oOooO0O0.OooO00o();
                    getCreateDocumentMethod = c33101OoooOO0OooO00o;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c33101OoooOO0OooO00o;
    }

    public static C33101OoooOO0<DeleteDocumentRequest, Empty> getDeleteDocumentMethod() {
        C33101OoooOO0<DeleteDocumentRequest, Empty> c33101OoooOO0OooO00o;
        C33101OoooOO0<DeleteDocumentRequest, Empty> c33101OoooOO0 = getDeleteDocumentMethod;
        if (c33101OoooOO0 != null) {
            return c33101OoooOO0;
        }
        synchronized (FirestoreGrpc.class) {
            try {
                c33101OoooOO0OooO00o = getDeleteDocumentMethod;
                if (c33101OoooOO0OooO00o == null) {
                    C33101OoooOO0.OooO00o oooO00oOooO0O0 = C33101OoooOO0.OooO0O0();
                    oooO00oOooO0O0.f119674OooO0OO = C33101OoooOO0.OooO0OO.f119678OooOo0o;
                    oooO00oOooO0O0.f119675OooO0Oo = C33101OoooOO0.OooO00o(SERVICE_NAME, "DeleteDocument");
                    oooO00oOooO0O0.f119676OooO0o0 = true;
                    DeleteDocumentRequest defaultInstance = DeleteDocumentRequest.getDefaultInstance();
                    ExtensionRegistryLite extensionRegistryLite = C32080OooO0O0.f114903OooO00o;
                    oooO00oOooO0O0.f119672OooO00o = new C32080OooO0O0.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f119673OooO0O0 = new C32080OooO0O0.OooO00o(Empty.getDefaultInstance());
                    c33101OoooOO0OooO00o = oooO00oOooO0O0.OooO00o();
                    getDeleteDocumentMethod = c33101OoooOO0OooO00o;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c33101OoooOO0OooO00o;
    }

    public static C33101OoooOO0<GetDocumentRequest, Document> getGetDocumentMethod() {
        C33101OoooOO0<GetDocumentRequest, Document> c33101OoooOO0OooO00o;
        C33101OoooOO0<GetDocumentRequest, Document> c33101OoooOO0 = getGetDocumentMethod;
        if (c33101OoooOO0 != null) {
            return c33101OoooOO0;
        }
        synchronized (FirestoreGrpc.class) {
            try {
                c33101OoooOO0OooO00o = getGetDocumentMethod;
                if (c33101OoooOO0OooO00o == null) {
                    C33101OoooOO0.OooO00o oooO00oOooO0O0 = C33101OoooOO0.OooO0O0();
                    oooO00oOooO0O0.f119674OooO0OO = C33101OoooOO0.OooO0OO.f119678OooOo0o;
                    oooO00oOooO0O0.f119675OooO0Oo = C33101OoooOO0.OooO00o(SERVICE_NAME, "GetDocument");
                    oooO00oOooO0O0.f119676OooO0o0 = true;
                    GetDocumentRequest defaultInstance = GetDocumentRequest.getDefaultInstance();
                    ExtensionRegistryLite extensionRegistryLite = C32080OooO0O0.f114903OooO00o;
                    oooO00oOooO0O0.f119672OooO00o = new C32080OooO0O0.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f119673OooO0O0 = new C32080OooO0O0.OooO00o(Document.getDefaultInstance());
                    c33101OoooOO0OooO00o = oooO00oOooO0O0.OooO00o();
                    getGetDocumentMethod = c33101OoooOO0OooO00o;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c33101OoooOO0OooO00o;
    }

    public static C33101OoooOO0<ListCollectionIdsRequest, ListCollectionIdsResponse> getListCollectionIdsMethod() {
        C33101OoooOO0<ListCollectionIdsRequest, ListCollectionIdsResponse> c33101OoooOO0OooO00o;
        C33101OoooOO0<ListCollectionIdsRequest, ListCollectionIdsResponse> c33101OoooOO0 = getListCollectionIdsMethod;
        if (c33101OoooOO0 != null) {
            return c33101OoooOO0;
        }
        synchronized (FirestoreGrpc.class) {
            try {
                c33101OoooOO0OooO00o = getListCollectionIdsMethod;
                if (c33101OoooOO0OooO00o == null) {
                    C33101OoooOO0.OooO00o oooO00oOooO0O0 = C33101OoooOO0.OooO0O0();
                    oooO00oOooO0O0.f119674OooO0OO = C33101OoooOO0.OooO0OO.f119678OooOo0o;
                    oooO00oOooO0O0.f119675OooO0Oo = C33101OoooOO0.OooO00o(SERVICE_NAME, "ListCollectionIds");
                    oooO00oOooO0O0.f119676OooO0o0 = true;
                    ListCollectionIdsRequest defaultInstance = ListCollectionIdsRequest.getDefaultInstance();
                    ExtensionRegistryLite extensionRegistryLite = C32080OooO0O0.f114903OooO00o;
                    oooO00oOooO0O0.f119672OooO00o = new C32080OooO0O0.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f119673OooO0O0 = new C32080OooO0O0.OooO00o(ListCollectionIdsResponse.getDefaultInstance());
                    c33101OoooOO0OooO00o = oooO00oOooO0O0.OooO00o();
                    getListCollectionIdsMethod = c33101OoooOO0OooO00o;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c33101OoooOO0OooO00o;
    }

    public static C33101OoooOO0<ListDocumentsRequest, ListDocumentsResponse> getListDocumentsMethod() {
        C33101OoooOO0<ListDocumentsRequest, ListDocumentsResponse> c33101OoooOO0OooO00o;
        C33101OoooOO0<ListDocumentsRequest, ListDocumentsResponse> c33101OoooOO0 = getListDocumentsMethod;
        if (c33101OoooOO0 != null) {
            return c33101OoooOO0;
        }
        synchronized (FirestoreGrpc.class) {
            try {
                c33101OoooOO0OooO00o = getListDocumentsMethod;
                if (c33101OoooOO0OooO00o == null) {
                    C33101OoooOO0.OooO00o oooO00oOooO0O0 = C33101OoooOO0.OooO0O0();
                    oooO00oOooO0O0.f119674OooO0OO = C33101OoooOO0.OooO0OO.f119678OooOo0o;
                    oooO00oOooO0O0.f119675OooO0Oo = C33101OoooOO0.OooO00o(SERVICE_NAME, "ListDocuments");
                    oooO00oOooO0O0.f119676OooO0o0 = true;
                    ListDocumentsRequest defaultInstance = ListDocumentsRequest.getDefaultInstance();
                    ExtensionRegistryLite extensionRegistryLite = C32080OooO0O0.f114903OooO00o;
                    oooO00oOooO0O0.f119672OooO00o = new C32080OooO0O0.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f119673OooO0O0 = new C32080OooO0O0.OooO00o(ListDocumentsResponse.getDefaultInstance());
                    c33101OoooOO0OooO00o = oooO00oOooO0O0.OooO00o();
                    getListDocumentsMethod = c33101OoooOO0OooO00o;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c33101OoooOO0OooO00o;
    }

    public static C33101OoooOO0<ListenRequest, ListenResponse> getListenMethod() {
        C33101OoooOO0<ListenRequest, ListenResponse> c33101OoooOO0OooO00o;
        C33101OoooOO0<ListenRequest, ListenResponse> c33101OoooOO0 = getListenMethod;
        if (c33101OoooOO0 != null) {
            return c33101OoooOO0;
        }
        synchronized (FirestoreGrpc.class) {
            try {
                c33101OoooOO0OooO00o = getListenMethod;
                if (c33101OoooOO0OooO00o == null) {
                    C33101OoooOO0.OooO00o oooO00oOooO0O0 = C33101OoooOO0.OooO0O0();
                    oooO00oOooO0O0.f119674OooO0OO = C33101OoooOO0.OooO0OO.f119680OooOoO0;
                    oooO00oOooO0O0.f119675OooO0Oo = C33101OoooOO0.OooO00o(SERVICE_NAME, "Listen");
                    oooO00oOooO0O0.f119676OooO0o0 = true;
                    ListenRequest defaultInstance = ListenRequest.getDefaultInstance();
                    ExtensionRegistryLite extensionRegistryLite = C32080OooO0O0.f114903OooO00o;
                    oooO00oOooO0O0.f119672OooO00o = new C32080OooO0O0.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f119673OooO0O0 = new C32080OooO0O0.OooO00o(ListenResponse.getDefaultInstance());
                    c33101OoooOO0OooO00o = oooO00oOooO0O0.OooO00o();
                    getListenMethod = c33101OoooOO0OooO00o;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c33101OoooOO0OooO00o;
    }

    public static C33101OoooOO0<RollbackRequest, Empty> getRollbackMethod() {
        C33101OoooOO0<RollbackRequest, Empty> c33101OoooOO0OooO00o;
        C33101OoooOO0<RollbackRequest, Empty> c33101OoooOO0 = getRollbackMethod;
        if (c33101OoooOO0 != null) {
            return c33101OoooOO0;
        }
        synchronized (FirestoreGrpc.class) {
            try {
                c33101OoooOO0OooO00o = getRollbackMethod;
                if (c33101OoooOO0OooO00o == null) {
                    C33101OoooOO0.OooO00o oooO00oOooO0O0 = C33101OoooOO0.OooO0O0();
                    oooO00oOooO0O0.f119674OooO0OO = C33101OoooOO0.OooO0OO.f119678OooOo0o;
                    oooO00oOooO0O0.f119675OooO0Oo = C33101OoooOO0.OooO00o(SERVICE_NAME, "Rollback");
                    oooO00oOooO0O0.f119676OooO0o0 = true;
                    RollbackRequest defaultInstance = RollbackRequest.getDefaultInstance();
                    ExtensionRegistryLite extensionRegistryLite = C32080OooO0O0.f114903OooO00o;
                    oooO00oOooO0O0.f119672OooO00o = new C32080OooO0O0.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f119673OooO0O0 = new C32080OooO0O0.OooO00o(Empty.getDefaultInstance());
                    c33101OoooOO0OooO00o = oooO00oOooO0O0.OooO00o();
                    getRollbackMethod = c33101OoooOO0OooO00o;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c33101OoooOO0OooO00o;
    }

    public static C33101OoooOO0<RunAggregationQueryRequest, RunAggregationQueryResponse> getRunAggregationQueryMethod() {
        C33101OoooOO0<RunAggregationQueryRequest, RunAggregationQueryResponse> c33101OoooOO0OooO00o;
        C33101OoooOO0<RunAggregationQueryRequest, RunAggregationQueryResponse> c33101OoooOO0 = getRunAggregationQueryMethod;
        if (c33101OoooOO0 != null) {
            return c33101OoooOO0;
        }
        synchronized (FirestoreGrpc.class) {
            try {
                c33101OoooOO0OooO00o = getRunAggregationQueryMethod;
                if (c33101OoooOO0OooO00o == null) {
                    C33101OoooOO0.OooO00o oooO00oOooO0O0 = C33101OoooOO0.OooO0O0();
                    oooO00oOooO0O0.f119674OooO0OO = C33101OoooOO0.OooO0OO.f119677OooOo;
                    oooO00oOooO0O0.f119675OooO0Oo = C33101OoooOO0.OooO00o(SERVICE_NAME, "RunAggregationQuery");
                    oooO00oOooO0O0.f119676OooO0o0 = true;
                    RunAggregationQueryRequest defaultInstance = RunAggregationQueryRequest.getDefaultInstance();
                    ExtensionRegistryLite extensionRegistryLite = C32080OooO0O0.f114903OooO00o;
                    oooO00oOooO0O0.f119672OooO00o = new C32080OooO0O0.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f119673OooO0O0 = new C32080OooO0O0.OooO00o(RunAggregationQueryResponse.getDefaultInstance());
                    c33101OoooOO0OooO00o = oooO00oOooO0O0.OooO00o();
                    getRunAggregationQueryMethod = c33101OoooOO0OooO00o;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c33101OoooOO0OooO00o;
    }

    public static C33101OoooOO0<RunQueryRequest, RunQueryResponse> getRunQueryMethod() {
        C33101OoooOO0<RunQueryRequest, RunQueryResponse> c33101OoooOO0OooO00o;
        C33101OoooOO0<RunQueryRequest, RunQueryResponse> c33101OoooOO0 = getRunQueryMethod;
        if (c33101OoooOO0 != null) {
            return c33101OoooOO0;
        }
        synchronized (FirestoreGrpc.class) {
            try {
                c33101OoooOO0OooO00o = getRunQueryMethod;
                if (c33101OoooOO0OooO00o == null) {
                    C33101OoooOO0.OooO00o oooO00oOooO0O0 = C33101OoooOO0.OooO0O0();
                    oooO00oOooO0O0.f119674OooO0OO = C33101OoooOO0.OooO0OO.f119677OooOo;
                    oooO00oOooO0O0.f119675OooO0Oo = C33101OoooOO0.OooO00o(SERVICE_NAME, "RunQuery");
                    oooO00oOooO0O0.f119676OooO0o0 = true;
                    RunQueryRequest defaultInstance = RunQueryRequest.getDefaultInstance();
                    ExtensionRegistryLite extensionRegistryLite = C32080OooO0O0.f114903OooO00o;
                    oooO00oOooO0O0.f119672OooO00o = new C32080OooO0O0.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f119673OooO0O0 = new C32080OooO0O0.OooO00o(RunQueryResponse.getDefaultInstance());
                    c33101OoooOO0OooO00o = oooO00oOooO0O0.OooO00o();
                    getRunQueryMethod = c33101OoooOO0OooO00o;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c33101OoooOO0OooO00o;
    }

    public static o0OoOo0 getServiceDescriptor() {
        o0OoOo0 o0oooo02;
        o0OoOo0 o0oooo03 = serviceDescriptor;
        if (o0oooo03 != null) {
            return o0oooo03;
        }
        synchronized (FirestoreGrpc.class) {
            try {
                o0oooo02 = serviceDescriptor;
                if (o0oooo02 == null) {
                    o0OoOo0.OooO00o OooO00o2 = o0OoOo0.OooO00o(SERVICE_NAME);
                    OooO00o2.OooO00o(getGetDocumentMethod());
                    OooO00o2.OooO00o(getListDocumentsMethod());
                    OooO00o2.OooO00o(getUpdateDocumentMethod());
                    OooO00o2.OooO00o(getDeleteDocumentMethod());
                    OooO00o2.OooO00o(getBatchGetDocumentsMethod());
                    OooO00o2.OooO00o(getBeginTransactionMethod());
                    OooO00o2.OooO00o(getCommitMethod());
                    OooO00o2.OooO00o(getRollbackMethod());
                    OooO00o2.OooO00o(getRunQueryMethod());
                    OooO00o2.OooO00o(getRunAggregationQueryMethod());
                    OooO00o2.OooO00o(getWriteMethod());
                    OooO00o2.OooO00o(getListenMethod());
                    OooO00o2.OooO00o(getListCollectionIdsMethod());
                    OooO00o2.OooO00o(getCreateDocumentMethod());
                    o0OoOo0 o0oooo04 = new o0OoOo0(OooO00o2);
                    serviceDescriptor = o0oooo04;
                    o0oooo02 = o0oooo04;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o0oooo02;
    }

    public static C33101OoooOO0<UpdateDocumentRequest, Document> getUpdateDocumentMethod() {
        C33101OoooOO0<UpdateDocumentRequest, Document> c33101OoooOO0OooO00o;
        C33101OoooOO0<UpdateDocumentRequest, Document> c33101OoooOO0 = getUpdateDocumentMethod;
        if (c33101OoooOO0 != null) {
            return c33101OoooOO0;
        }
        synchronized (FirestoreGrpc.class) {
            try {
                c33101OoooOO0OooO00o = getUpdateDocumentMethod;
                if (c33101OoooOO0OooO00o == null) {
                    C33101OoooOO0.OooO00o oooO00oOooO0O0 = C33101OoooOO0.OooO0O0();
                    oooO00oOooO0O0.f119674OooO0OO = C33101OoooOO0.OooO0OO.f119678OooOo0o;
                    oooO00oOooO0O0.f119675OooO0Oo = C33101OoooOO0.OooO00o(SERVICE_NAME, "UpdateDocument");
                    oooO00oOooO0O0.f119676OooO0o0 = true;
                    UpdateDocumentRequest defaultInstance = UpdateDocumentRequest.getDefaultInstance();
                    ExtensionRegistryLite extensionRegistryLite = C32080OooO0O0.f114903OooO00o;
                    oooO00oOooO0O0.f119672OooO00o = new C32080OooO0O0.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f119673OooO0O0 = new C32080OooO0O0.OooO00o(Document.getDefaultInstance());
                    c33101OoooOO0OooO00o = oooO00oOooO0O0.OooO00o();
                    getUpdateDocumentMethod = c33101OoooOO0OooO00o;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c33101OoooOO0OooO00o;
    }

    public static C33101OoooOO0<WriteRequest, WriteResponse> getWriteMethod() {
        C33101OoooOO0<WriteRequest, WriteResponse> c33101OoooOO0OooO00o;
        C33101OoooOO0<WriteRequest, WriteResponse> c33101OoooOO0 = getWriteMethod;
        if (c33101OoooOO0 != null) {
            return c33101OoooOO0;
        }
        synchronized (FirestoreGrpc.class) {
            try {
                c33101OoooOO0OooO00o = getWriteMethod;
                if (c33101OoooOO0OooO00o == null) {
                    C33101OoooOO0.OooO00o oooO00oOooO0O0 = C33101OoooOO0.OooO0O0();
                    oooO00oOooO0O0.f119674OooO0OO = C33101OoooOO0.OooO0OO.f119680OooOoO0;
                    oooO00oOooO0O0.f119675OooO0Oo = C33101OoooOO0.OooO00o(SERVICE_NAME, "Write");
                    oooO00oOooO0O0.f119676OooO0o0 = true;
                    WriteRequest defaultInstance = WriteRequest.getDefaultInstance();
                    ExtensionRegistryLite extensionRegistryLite = C32080OooO0O0.f114903OooO00o;
                    oooO00oOooO0O0.f119672OooO00o = new C32080OooO0O0.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f119673OooO0O0 = new C32080OooO0O0.OooO00o(WriteResponse.getDefaultInstance());
                    c33101OoooOO0OooO00o = oooO00oOooO0O0.OooO00o();
                    getWriteMethod = c33101OoooOO0OooO00o;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c33101OoooOO0OooO00o;
    }

    public static FirestoreBlockingStub newBlockingStub(AbstractC33060OooO0Oo abstractC33060OooO0Oo) {
        return (FirestoreBlockingStub) OooO0O0.newStub(new AbstractC23924OooO0Oo.OooO00o<FirestoreBlockingStub>() { // from class: com.google.firestore.v1.FirestoreGrpc.2
            @Override // io.grpc.stub.AbstractC23924OooO0Oo.OooO00o
            public FirestoreBlockingStub newStub(AbstractC33060OooO0Oo abstractC33060OooO0Oo2, OooO0OO oooO0OO) {
                return new FirestoreBlockingStub(abstractC33060OooO0Oo2, oooO0OO);
            }
        }, abstractC33060OooO0Oo);
    }

    public static FirestoreFutureStub newFutureStub(AbstractC33060OooO0Oo abstractC33060OooO0Oo) {
        return (FirestoreFutureStub) io.grpc.stub.OooO0OO.newStub(new AbstractC23924OooO0Oo.OooO00o<FirestoreFutureStub>() { // from class: com.google.firestore.v1.FirestoreGrpc.3
            @Override // io.grpc.stub.AbstractC23924OooO0Oo.OooO00o
            public FirestoreFutureStub newStub(AbstractC33060OooO0Oo abstractC33060OooO0Oo2, OooO0OO oooO0OO) {
                return new FirestoreFutureStub(abstractC33060OooO0Oo2, oooO0OO);
            }
        }, abstractC33060OooO0Oo);
    }

    public static FirestoreStub newStub(AbstractC33060OooO0Oo abstractC33060OooO0Oo) {
        return (FirestoreStub) OooO00o.newStub(new AbstractC23924OooO0Oo.OooO00o<FirestoreStub>() { // from class: com.google.firestore.v1.FirestoreGrpc.1
            @Override // io.grpc.stub.AbstractC23924OooO0Oo.OooO00o
            public FirestoreStub newStub(AbstractC33060OooO0Oo abstractC33060OooO0Oo2, OooO0OO oooO0OO) {
                return new FirestoreStub(abstractC33060OooO0Oo2, oooO0OO);
            }
        }, abstractC33060OooO0Oo);
    }

    public static final class MethodHandlers<Req, Resp> {
        private final int methodId;
        private final AsyncService serviceImpl;

        public MethodHandlers(AsyncService asyncService, int i) {
            this.serviceImpl = asyncService;
            this.methodId = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void invoke(Req req, OooO<Resp> oooO) {
            switch (this.methodId) {
                case 0:
                    this.serviceImpl.getDocument((GetDocumentRequest) req, oooO);
                    return;
                case 1:
                    this.serviceImpl.listDocuments((ListDocumentsRequest) req, oooO);
                    return;
                case 2:
                    this.serviceImpl.updateDocument((UpdateDocumentRequest) req, oooO);
                    return;
                case 3:
                    this.serviceImpl.deleteDocument((DeleteDocumentRequest) req, oooO);
                    return;
                case 4:
                    this.serviceImpl.batchGetDocuments((BatchGetDocumentsRequest) req, oooO);
                    return;
                case 5:
                    this.serviceImpl.beginTransaction((BeginTransactionRequest) req, oooO);
                    return;
                case 6:
                    this.serviceImpl.commit((CommitRequest) req, oooO);
                    return;
                case 7:
                    this.serviceImpl.rollback((RollbackRequest) req, oooO);
                    return;
                case 8:
                    this.serviceImpl.runQuery((RunQueryRequest) req, oooO);
                    return;
                case 9:
                    this.serviceImpl.runAggregationQuery((RunAggregationQueryRequest) req, oooO);
                    return;
                case 10:
                    this.serviceImpl.listCollectionIds((ListCollectionIdsRequest) req, oooO);
                    return;
                case 11:
                    this.serviceImpl.createDocument((CreateDocumentRequest) req, oooO);
                    return;
                default:
                    throw new AssertionError();
            }
        }

        public OooO<Req> invoke(OooO<Resp> oooO) {
            int i = this.methodId;
            if (i == 12) {
                return (OooO<Req>) this.serviceImpl.write(oooO);
            }
            if (i == 13) {
                return (OooO<Req>) this.serviceImpl.listen(oooO);
            }
            throw new AssertionError();
        }
    }
}
