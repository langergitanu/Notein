package com.huawei.hms.network.embedded;

import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.c8 */
/* JADX INFO: loaded from: classes9.dex */
public enum EnumC18132c8 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC(C18388v5.f56369c);


    /* JADX INFO: renamed from: a */
    public final String f54471a;

    EnumC18132c8(String str) {
        this.f54471a = str;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC18132c8 m78133a(String str) throws IOException {
        EnumC18132c8 enumC18132c8 = HTTP_1_0;
        if (str.equals(enumC18132c8.f54471a)) {
            return enumC18132c8;
        }
        EnumC18132c8 enumC18132c82 = HTTP_1_1;
        if (str.equals(enumC18132c82.f54471a)) {
            return enumC18132c82;
        }
        EnumC18132c8 enumC18132c83 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(enumC18132c83.f54471a)) {
            return enumC18132c83;
        }
        EnumC18132c8 enumC18132c84 = HTTP_2;
        if (str.equals(enumC18132c84.f54471a)) {
            return enumC18132c84;
        }
        EnumC18132c8 enumC18132c85 = SPDY_3;
        if (str.equals(enumC18132c85.f54471a)) {
            return enumC18132c85;
        }
        EnumC18132c8 enumC18132c86 = QUIC;
        if (str.equals(enumC18132c86.f54471a)) {
            return enumC18132c86;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f54471a;
    }
}
