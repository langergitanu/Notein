package com.google.android.play.core.integrity;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.ao */
/* JADX INFO: loaded from: classes7.dex */
final class C16296ao extends IntegrityTokenRequest {

    /* JADX INFO: renamed from: a */
    private final String f51434a;

    /* JADX INFO: renamed from: b */
    private final Long f51435b;

    /* JADX INFO: renamed from: c */
    private final Object f51436c = null;

    public /* synthetic */ C16296ao(String str, Long l, Object obj, C16295an c16295an) {
        this.f51434a = str;
        this.f51435b = l;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m74947a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f51435b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        Long l;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            z = this.f51434a.equals(integrityTokenRequest.nonce()) && ((l = this.f51435b) != null ? l.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() == null);
        }
        if (!(obj instanceof C16296ao) || !m74947a()) {
            return z;
        }
        C16296ao c16296ao = (C16296ao) obj;
        if (!z) {
            return false;
        }
        Object obj2 = c16296ao.f51436c;
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f51434a.hashCode() ^ 1000003;
        Long l = this.f51435b;
        int iHashCode2 = (iHashCode * 1000003) ^ (l == null ? 0 : l.hashCode());
        return m74947a() ? iHashCode2 * 1000003 : iHashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f51434a;
    }

    public final String toString() {
        String strConcat = "IntegrityTokenRequest{nonce=" + this.f51434a + ", cloudProjectNumber=" + this.f51435b;
        if (m74947a()) {
            strConcat = strConcat.concat(", network=null");
        }
        return strConcat.concat("}");
    }
}
