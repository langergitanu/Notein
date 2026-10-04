package com.huawei.hms.drive;

import com.huawei.hms.network.embedded.C18388v5;
import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.drive.bf */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC17796bf {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC(C18388v5.f56369c);


    /* JADX INFO: renamed from: g */
    private final String f52878g;

    EnumC17796bf(String str) {
        this.f52878g = str;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC17796bf m76243a(String str) throws IOException {
        EnumC17796bf enumC17796bf = HTTP_1_0;
        if (str.equals(enumC17796bf.f52878g)) {
            return enumC17796bf;
        }
        EnumC17796bf enumC17796bf2 = HTTP_1_1;
        if (str.equals(enumC17796bf2.f52878g)) {
            return enumC17796bf2;
        }
        EnumC17796bf enumC17796bf3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(enumC17796bf3.f52878g)) {
            return enumC17796bf3;
        }
        EnumC17796bf enumC17796bf4 = HTTP_2;
        if (str.equals(enumC17796bf4.f52878g)) {
            return enumC17796bf4;
        }
        EnumC17796bf enumC17796bf5 = SPDY_3;
        if (str.equals(enumC17796bf5.f52878g)) {
            return enumC17796bf5;
        }
        EnumC17796bf enumC17796bf6 = QUIC;
        if (str.equals(enumC17796bf6.f52878g)) {
            return enumC17796bf6;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f52878g;
    }
}
