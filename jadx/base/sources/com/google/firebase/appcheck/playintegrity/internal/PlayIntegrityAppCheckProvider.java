package com.google.firebase.appcheck.playintegrity.internal;

import com.aspose.slides.C22222Oooo0OO;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.AppCheckProvider;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.internal.AppCheckTokenResponse;
import com.google.firebase.appcheck.internal.DefaultAppCheckToken;
import com.google.firebase.appcheck.internal.NetworkClient;
import com.google.firebase.appcheck.internal.RetryManager;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public class PlayIntegrityAppCheckProvider implements AppCheckProvider {
    private static final String UTF_8 = "UTF-8";
    private final Executor blockingExecutor;
    private final IntegrityManager integrityManager;
    private final Executor liteExecutor;
    private final NetworkClient networkClient;
    private final String projectNumber;
    private final RetryManager retryManager;

    public PlayIntegrityAppCheckProvider(FirebaseApp firebaseApp, Executor executor, Executor executor2) {
        this(firebaseApp.getOptions().getGcmSenderId(), IntegrityManagerFactory.create(firebaseApp.getApplicationContext()), new NetworkClient(firebaseApp), executor, executor2, new RetryManager());
    }

    private Task<IntegrityTokenResponse> getPlayIntegrityAttestation() {
        final GeneratePlayIntegrityChallengeRequest generatePlayIntegrityChallengeRequest = new GeneratePlayIntegrityChallengeRequest();
        return Tasks.call(this.blockingExecutor, new Callable() { // from class: com.google.firebase.appcheck.playintegrity.internal.OooO0O0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f67905OooOo0o.lambda$getPlayIntegrityAttestation$3(generatePlayIntegrityChallengeRequest);
            }
        }).onSuccessTask(this.liteExecutor, new SuccessContinuation() { // from class: com.google.firebase.appcheck.playintegrity.internal.OooO0OO
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f67906OooOo0o.lambda$getPlayIntegrityAttestation$4((GeneratePlayIntegrityChallengeResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ GeneratePlayIntegrityChallengeResponse lambda$getPlayIntegrityAttestation$3(GeneratePlayIntegrityChallengeRequest generatePlayIntegrityChallengeRequest) throws Exception {
        return GeneratePlayIntegrityChallengeResponse.fromJsonString(this.networkClient.generatePlayIntegrityChallenge(generatePlayIntegrityChallengeRequest.toJsonString().getBytes("UTF-8"), this.retryManager));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getPlayIntegrityAttestation$4(GeneratePlayIntegrityChallengeResponse generatePlayIntegrityChallengeResponse) throws Exception {
        return this.integrityManager.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(this.projectNumber)).setNonce(generatePlayIntegrityChallengeResponse.getChallenge()).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AppCheckTokenResponse lambda$getToken$0(ExchangePlayIntegrityTokenRequest exchangePlayIntegrityTokenRequest) throws Exception {
        return this.networkClient.exchangeAttestationForAppCheckToken(exchangePlayIntegrityTokenRequest.toJsonString().getBytes("UTF-8"), 3, this.retryManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getToken$1(IntegrityTokenResponse integrityTokenResponse) throws Exception {
        final ExchangePlayIntegrityTokenRequest exchangePlayIntegrityTokenRequest = new ExchangePlayIntegrityTokenRequest(integrityTokenResponse.token());
        return Tasks.call(this.blockingExecutor, new Callable() { // from class: com.google.firebase.appcheck.playintegrity.internal.OooO00o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f67903OooOo0o.lambda$getToken$0(exchangePlayIntegrityTokenRequest);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$getToken$2(AppCheckTokenResponse appCheckTokenResponse) throws Exception {
        return Tasks.forResult(DefaultAppCheckToken.constructFromAppCheckTokenResponse(appCheckTokenResponse));
    }

    @Override // com.google.firebase.appcheck.AppCheckProvider
    public Task<AppCheckToken> getToken() {
        return getPlayIntegrityAttestation().onSuccessTask(this.liteExecutor, new SuccessContinuation() { // from class: com.google.firebase.appcheck.playintegrity.internal.OooO0Oo
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f67907OooOo0o.lambda$getToken$1((IntegrityTokenResponse) obj);
            }
        }).onSuccessTask(this.liteExecutor, new C22222Oooo0OO());
    }

    public PlayIntegrityAppCheckProvider(String str, IntegrityManager integrityManager, NetworkClient networkClient, Executor executor, Executor executor2, RetryManager retryManager) {
        this.projectNumber = str;
        this.integrityManager = integrityManager;
        this.networkClient = networkClient;
        this.liteExecutor = executor;
        this.blockingExecutor = executor2;
        this.retryManager = retryManager;
    }
}
