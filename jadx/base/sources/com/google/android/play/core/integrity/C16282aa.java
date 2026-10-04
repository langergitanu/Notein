package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.aa */
/* JADX INFO: loaded from: classes7.dex */
final class C16282aa implements IntegrityManager {

    /* JADX INFO: renamed from: a */
    private final C16291aj f51404a;

    public C16282aa(C16291aj c16291aj) {
        this.f51404a = c16291aj;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f51404a.m74946c(integrityTokenRequest);
    }
}
