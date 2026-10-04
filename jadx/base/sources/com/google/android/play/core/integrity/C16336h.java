package com.google.android.play.core.integrity;

import OoooooO.C21445Oooo;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.h */
/* JADX INFO: loaded from: classes7.dex */
final class C16336h extends StandardIntegrityManager.StandardIntegrityTokenRequest {

    /* JADX INFO: renamed from: a */
    private final String f51506a;

    /* JADX INFO: renamed from: b */
    private final Set f51507b;

    public /* synthetic */ C16336h(String str, Set set, C16335g c16335g) {
        this.f51506a = str;
        this.f51507b = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest) {
            StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = (StandardIntegrityManager.StandardIntegrityTokenRequest) obj;
            String str = this.f51506a;
            if (str != null ? str.equals(standardIntegrityTokenRequest.requestHash()) : standardIntegrityTokenRequest.requestHash() == null) {
                if (this.f51507b.equals(standardIntegrityTokenRequest.verdictOptOut())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f51506a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f51507b.hashCode();
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final String requestHash() {
        return this.f51506a;
    }

    public final String toString() {
        return C21445Oooo.OooO0O0(new StringBuilder("StandardIntegrityTokenRequest{requestHash="), this.f51506a, ", verdictOptOut=", this.f51507b.toString(), "}");
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final Set<Integer> verdictOptOut() {
        return this.f51507b;
    }
}
