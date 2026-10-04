package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.az */
/* JADX INFO: loaded from: classes7.dex */
final class C16307az implements StandardIntegrityManager {

    /* JADX INFO: renamed from: a */
    private final C16322bn f51453a;

    /* JADX INFO: renamed from: b */
    private final C16328bt f51454b;

    public C16307az(C16322bn c16322bn, C16328bt c16328bt) {
        this.f51453a = c16322bn;
        this.f51454b = c16328bt;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Task m74954a(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, Long l) throws Exception {
        final long jMo74929b = prepareIntegrityTokenRequest.mo74929b();
        final long jLongValue = l.longValue();
        prepareIntegrityTokenRequest.mo74928a();
        final C16328bt c16328bt = this.f51454b;
        final int i = 0;
        return Tasks.forResult(new StandardIntegrityManager.StandardIntegrityTokenProvider(jMo74929b, jLongValue, i) { // from class: com.google.android.play.core.integrity.bs

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ long f51497b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ long f51498c;

            @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider
            public final Task request(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
                return this.f51496a.m74976a(this.f51497b, this.f51498c, 0, standardIntegrityTokenRequest);
            }
        });
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager
    public final Task<StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(final StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        long jMo74929b = prepareIntegrityTokenRequest.mo74929b();
        prepareIntegrityTokenRequest.mo74928a();
        return this.f51453a.m74975e(jMo74929b, 0).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.play.core.integrity.ay
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f51451a.m74954a(prepareIntegrityTokenRequest, (Long) obj);
            }
        });
    }
}
