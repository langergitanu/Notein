package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.am */
/* JADX INFO: loaded from: classes7.dex */
final class C16294am extends IntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a */
    private String f51432a;

    /* JADX INFO: renamed from: b */
    private Long f51433b;

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.f51432a;
        if (str == null) {
            throw new IllegalStateException("Missing required properties: nonce");
        }
        C16295an c16295an = null;
        return new C16296ao(str, this.f51433b, c16295an, c16295an);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j) {
        this.f51433b = Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str == null) {
            throw new NullPointerException("Null nonce");
        }
        this.f51432a = str;
        return this;
    }
}
