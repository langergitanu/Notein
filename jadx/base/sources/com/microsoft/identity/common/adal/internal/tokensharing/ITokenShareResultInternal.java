package com.microsoft.identity.common.adal.internal.tokensharing;

import com.microsoft.identity.common.java.cache.ICacheRecord;

/* JADX INFO: loaded from: classes9.dex */
public interface ITokenShareResultInternal {

    public static class TokenShareExportFormatInternal {
        public static final String RAW = "RAW";
        public static final String SSO_STATE_SERIALIZER_BLOB = "SSO_STATE_SERIALIZER_BLOB";

        private TokenShareExportFormatInternal() {
        }
    }

    ICacheRecord getCacheRecord();

    String getFormat();

    String getRefreshToken();
}
