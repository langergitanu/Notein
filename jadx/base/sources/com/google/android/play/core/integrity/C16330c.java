package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.c */
/* JADX INFO: loaded from: classes7.dex */
final class C16330c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a */
    private long f51501a;

    /* JADX INFO: renamed from: b */
    private byte f51502b;

    /* JADX INFO: renamed from: a */
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder m74977a(int i) {
        this.f51502b = (byte) (this.f51502b | 2);
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f51502b == 3) {
            return new C16333e(this.f51501a, 0, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f51502b & 1) == 0) {
            sb.append(" cloudProjectNumber");
        }
        if ((this.f51502b & 2) == 0) {
            sb.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j) {
        this.f51501a = j;
        this.f51502b = (byte) (this.f51502b | 1);
        return this;
    }
}
