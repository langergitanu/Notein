package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.f */
/* JADX INFO: loaded from: classes7.dex */
final class C16334f extends StandardIntegrityManager.StandardIntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a */
    private String f51504a;

    /* JADX INFO: renamed from: b */
    private Set f51505b;

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.StandardIntegrityTokenRequest build() {
        Set set = this.f51505b;
        if (set != null) {
            return new C16336h(this.f51504a, set, null);
        }
        throw new IllegalStateException("Missing required properties: verdictOptOut");
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setRequestHash(String str) {
        this.f51504a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setVerdictOptOut(Set<Integer> set) {
        if (set == null) {
            throw new NullPointerException("Null verdictOptOut");
        }
        this.f51505b = set;
        return this;
    }
}
