package com.google.firebase.firestore.remote;

import Oooo0oO.C21111o0ooOoO;
import android.content.Context;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.auth.CredentialsProvider;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.core.DatabaseInfo;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Util;
import java.util.BitSet;
import oO0OOo0o.AbstractC33075OooOoO0;
import oO0OOo0o.C33094OoooO;
import oO0OOo0o.C33101OoooOO0;
import oO0OOo0o.OooO0o;
import oO0OOo0o.o00Oo0;

/* JADX INFO: loaded from: classes8.dex */
public class FirestoreChannel {
    private static final C33094OoooO.AbstractC33095OooO0Oo<String> RESOURCE_PREFIX_HEADER;
    private static final C33094OoooO.AbstractC33095OooO0Oo<String> X_GOOG_API_CLIENT_HEADER;
    private static final C33094OoooO.AbstractC33095OooO0Oo<String> X_GOOG_REQUEST_PARAMS_HEADER;
    private static volatile String clientLanguage;
    private final CredentialsProvider<String> appCheckProvider;
    private final AsyncQueue asyncQueue;
    private final CredentialsProvider<User> authProvider;
    private final GrpcCallProvider callProvider;
    private final GrpcMetadataProvider metadataProvider;
    private final String resourcePrefixValue;

    public static abstract class StreamingListener<T> {
        public void onClose(o00Oo0 o00oo02) {
        }

        public void onMessage(T t) {
        }
    }

    static {
        C33094OoooO.OooO00o oooO00o = C33094OoooO.f119652OooO0Oo;
        BitSet bitSet = C33094OoooO.AbstractC33095OooO0Oo.f119657OooO0Oo;
        X_GOOG_API_CLIENT_HEADER = new C33094OoooO.OooO0O0("x-goog-api-client", oooO00o);
        RESOURCE_PREFIX_HEADER = new C33094OoooO.OooO0O0("google-cloud-resource-prefix", oooO00o);
        X_GOOG_REQUEST_PARAMS_HEADER = new C33094OoooO.OooO0O0("x-goog-request-params", oooO00o);
        clientLanguage = "gl-java/";
    }

    public FirestoreChannel(AsyncQueue asyncQueue, Context context, CredentialsProvider<User> credentialsProvider, CredentialsProvider<String> credentialsProvider2, DatabaseInfo databaseInfo, GrpcMetadataProvider grpcMetadataProvider) {
        this(asyncQueue, credentialsProvider, credentialsProvider2, databaseInfo.getDatabaseId(), grpcMetadataProvider, getGrpcCallProvider(asyncQueue, context, credentialsProvider, credentialsProvider2, databaseInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FirebaseFirestoreException exceptionFromStatus(o00Oo0 o00oo02) {
        return Datastore.isMissingSslCiphers(o00oo02) ? new FirebaseFirestoreException("The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.", FirebaseFirestoreException.Code.fromValue(o00oo02.f119728OooO00o.f119750OooOo0o), o00oo02.f119730OooO0OO) : Util.exceptionFromStatus(o00oo02);
    }

    private String getGoogApiClientValue() {
        return C21111o0ooOoO.OooO0Oo(clientLanguage, " fire/26.0.0 grpc/");
    }

    private static GrpcCallProvider getGrpcCallProvider(AsyncQueue asyncQueue, Context context, CredentialsProvider<User> credentialsProvider, CredentialsProvider<String> credentialsProvider2, DatabaseInfo databaseInfo) {
        return new GrpcCallProvider(asyncQueue, context, databaseInfo, new FirestoreCallCredentials(credentialsProvider, credentialsProvider2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runBidiStreamingRpc$0(final oO0OOo0o.OooO0o[] oooO0oArr, final IncomingStreamObserver incomingStreamObserver, Task task) {
        oO0OOo0o.OooO0o oooO0o = (oO0OOo0o.OooO0o) task.getResult();
        oooO0oArr[0] = oooO0o;
        oooO0o.start(new OooO0o.OooO00o<RespT>() { // from class: com.google.firebase.firestore.remote.FirestoreChannel.1
            @Override // oO0OOo0o.OooO0o.OooO00o
            public void onClose(o00Oo0 o00oo02, C33094OoooO c33094OoooO) {
                try {
                    incomingStreamObserver.onClose(o00oo02);
                } catch (Throwable th) {
                    FirestoreChannel.this.asyncQueue.panic(th);
                }
            }

            @Override // oO0OOo0o.OooO0o.OooO00o
            public void onHeaders(C33094OoooO c33094OoooO) {
                try {
                    incomingStreamObserver.onHeaders(c33094OoooO);
                } catch (Throwable th) {
                    FirestoreChannel.this.asyncQueue.panic(th);
                }
            }

            @Override // oO0OOo0o.OooO0o.OooO00o
            public void onMessage(RespT respt) {
                try {
                    incomingStreamObserver.onNext(respt);
                    oooO0oArr[0].request(1);
                } catch (Throwable th) {
                    FirestoreChannel.this.asyncQueue.panic(th);
                }
            }

            @Override // oO0OOo0o.OooO0o.OooO00o
            public void onReady() {
            }
        }, requestHeaders());
        incomingStreamObserver.onOpen();
        oooO0oArr[0].request(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runRpc$2(final TaskCompletionSource taskCompletionSource, Object obj, Task task) {
        oO0OOo0o.OooO0o oooO0o = (oO0OOo0o.OooO0o) task.getResult();
        oooO0o.start(new OooO0o.OooO00o<RespT>() { // from class: com.google.firebase.firestore.remote.FirestoreChannel.4
            @Override // oO0OOo0o.OooO0o.OooO00o
            public void onClose(o00Oo0 o00oo02, C33094OoooO c33094OoooO) {
                if (!o00oo02.OooO0o()) {
                    taskCompletionSource.setException(FirestoreChannel.this.exceptionFromStatus(o00oo02));
                } else {
                    if (taskCompletionSource.getTask().isComplete()) {
                        return;
                    }
                    taskCompletionSource.setException(new FirebaseFirestoreException("Received onClose with status OK, but no message.", FirebaseFirestoreException.Code.INTERNAL));
                }
            }

            @Override // oO0OOo0o.OooO0o.OooO00o
            public void onMessage(RespT respt) {
                taskCompletionSource.setResult(respt);
            }
        }, requestHeaders());
        oooO0o.request(2);
        oooO0o.sendMessage(obj);
        oooO0o.halfClose();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runStreamingResponseRpc$1(final StreamingListener streamingListener, Object obj, Task task) {
        final oO0OOo0o.OooO0o oooO0o = (oO0OOo0o.OooO0o) task.getResult();
        oooO0o.start(new OooO0o.OooO00o<RespT>() { // from class: com.google.firebase.firestore.remote.FirestoreChannel.3
            @Override // oO0OOo0o.OooO0o.OooO00o
            public void onClose(o00Oo0 o00oo02, C33094OoooO c33094OoooO) {
                streamingListener.onClose(o00oo02);
            }

            @Override // oO0OOo0o.OooO0o.OooO00o
            public void onMessage(RespT respt) {
                streamingListener.onMessage(respt);
                oooO0o.request(1);
            }
        }, requestHeaders());
        oooO0o.request(1);
        oooO0o.sendMessage(obj);
        oooO0o.halfClose();
    }

    private C33094OoooO requestHeaders() {
        C33094OoooO c33094OoooO = new C33094OoooO();
        c33094OoooO.OooO0o(X_GOOG_API_CLIENT_HEADER, getGoogApiClientValue());
        c33094OoooO.OooO0o(RESOURCE_PREFIX_HEADER, this.resourcePrefixValue);
        c33094OoooO.OooO0o(X_GOOG_REQUEST_PARAMS_HEADER, this.resourcePrefixValue);
        GrpcMetadataProvider grpcMetadataProvider = this.metadataProvider;
        if (grpcMetadataProvider != null) {
            grpcMetadataProvider.updateMetadata(c33094OoooO);
        }
        return c33094OoooO;
    }

    public static void setClientLanguage(String str) {
        clientLanguage = str;
    }

    public void invalidateToken() {
        this.authProvider.invalidateToken();
        this.appCheckProvider.invalidateToken();
    }

    public <ReqT, RespT> oO0OOo0o.OooO0o<ReqT, RespT> runBidiStreamingRpc(C33101OoooOO0<ReqT, RespT> c33101OoooOO0, final IncomingStreamObserver<RespT> incomingStreamObserver) {
        final oO0OOo0o.OooO0o[] oooO0oArr = {null};
        final Task<oO0OOo0o.OooO0o<ReqT, RespT>> taskCreateClientCall = this.callProvider.createClientCall(c33101OoooOO0);
        taskCreateClientCall.addOnCompleteListener(this.asyncQueue.getExecutor(), new OnCompleteListener() { // from class: com.google.firebase.firestore.remote.OooOO0o
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f68375OooO00o.lambda$runBidiStreamingRpc$0(oooO0oArr, incomingStreamObserver, task);
            }
        });
        return new AbstractC33075OooOoO0<ReqT, RespT>() { // from class: com.google.firebase.firestore.remote.FirestoreChannel.2
            @Override // oO0OOo0o.AbstractC33075OooOoO0, oO0OOo0o.AbstractC33104OoooOo0
            public oO0OOo0o.OooO0o<ReqT, RespT> delegate() {
                Assert.hardAssert(oooO0oArr[0] != null, "ClientCall used before onOpen() callback", new Object[0]);
                return oooO0oArr[0];
            }

            @Override // oO0OOo0o.AbstractC33075OooOoO0, oO0OOo0o.AbstractC33104OoooOo0, oO0OOo0o.OooO0o
            public void halfClose() {
                if (oooO0oArr[0] == null) {
                    taskCreateClientCall.addOnSuccessListener(FirestoreChannel.this.asyncQueue.getExecutor(), new OooOOOO());
                } else {
                    super.halfClose();
                }
            }
        };
    }

    public <ReqT, RespT> Task<RespT> runRpc(C33101OoooOO0<ReqT, RespT> c33101OoooOO0, final ReqT reqt) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.callProvider.createClientCall(c33101OoooOO0).addOnCompleteListener(this.asyncQueue.getExecutor(), new OnCompleteListener() { // from class: com.google.firebase.firestore.remote.OooOOO0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f68381OooO00o.lambda$runRpc$2(taskCompletionSource, reqt, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    public <ReqT, RespT> void runStreamingResponseRpc(C33101OoooOO0<ReqT, RespT> c33101OoooOO0, final ReqT reqt, final StreamingListener<RespT> streamingListener) {
        this.callProvider.createClientCall(c33101OoooOO0).addOnCompleteListener(this.asyncQueue.getExecutor(), new OnCompleteListener() { // from class: com.google.firebase.firestore.remote.OooOOO
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f68378OooO00o.lambda$runStreamingResponseRpc$1(streamingListener, reqt, task);
            }
        });
    }

    public void shutdown() {
        this.callProvider.shutdown();
    }

    public FirestoreChannel(AsyncQueue asyncQueue, CredentialsProvider<User> credentialsProvider, CredentialsProvider<String> credentialsProvider2, DatabaseId databaseId, GrpcMetadataProvider grpcMetadataProvider, GrpcCallProvider grpcCallProvider) {
        this.asyncQueue = asyncQueue;
        this.metadataProvider = grpcMetadataProvider;
        this.authProvider = credentialsProvider;
        this.appCheckProvider = credentialsProvider2;
        this.callProvider = grpcCallProvider;
        this.resourcePrefixValue = C22237OooO0o0.OooO00o("projects/", databaseId.getProjectId(), "/databases/", databaseId.getDatabaseId());
    }
}
