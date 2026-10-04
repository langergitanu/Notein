package com.huawei.agconnect.credential.obs;

import com.huawei.agconnect.common.api.AgcCrypto;
import com.huawei.agconnect.core.service.auth.Token;
import com.huawei.agconnect.datastore.annotation.SharedPreference;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.am */
/* JADX INFO: loaded from: classes8.dex */
public class C17611am implements Token {

    /* JADX INFO: renamed from: a */
    private static final long f52118a = 120000;

    /* JADX INFO: renamed from: b */
    private static final String f52119b = "com.huawei.agconnect";

    @SharedPreference(crypto = AgcCrypto.class, fileName = f52119b, isDynamic = true, key = "expires")
    long expires;

    @SharedPreference(crypto = AgcCrypto.class, fileName = f52119b, isDynamic = true, key = "tokenString")
    String tokenString;

    @SharedPreference(crypto = AgcCrypto.class, fileName = f52119b, isDynamic = true, key = "validTime")
    long validTime;

    public C17611am() {
        this.validTime = 0L;
    }

    /* JADX INFO: renamed from: a */
    private void m75472a(String str, long j) {
        this.tokenString = str;
        this.expires = j;
        this.validTime = ((j * 1000) + System.currentTimeMillis()) - 120000;
    }

    @Override // com.huawei.agconnect.core.service.auth.Token
    public long getExpiration() {
        return this.expires;
    }

    @Override // com.huawei.agconnect.core.service.auth.Token
    public long getIssuedAt() {
        return 0L;
    }

    @Override // com.huawei.agconnect.core.service.auth.Token
    public long getNotBefore() {
        return 0L;
    }

    @Override // com.huawei.agconnect.core.service.auth.Token
    public String getTokenString() {
        return this.tokenString;
    }

    public C17611am(Token token) {
        this(token.getTokenString(), token.getExpiration());
    }

    /* JADX INFO: renamed from: a */
    public boolean m75473a() {
        return this.tokenString != null && System.currentTimeMillis() <= this.validTime;
    }

    public C17611am(String str, long j) {
        this.validTime = 0L;
        m75472a(str, j);
    }
}
