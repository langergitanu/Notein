package com.microsoft.identity.common.java.telemetry.events;

import com.microsoft.identity.common.java.cache.CacheRecord;
import com.microsoft.identity.common.java.dto.AccessTokenRecord;
import com.microsoft.identity.common.java.eststelemetry.EstsTelemetry;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.microsoft.identity.common.java.util.StringUtil;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class CacheEndEvent extends BaseEvent {
    public CacheEndEvent() {
        names(TelemetryEventStrings.Event.CACHE_END_EVENT);
        types(TelemetryEventStrings.EventType.CACHE_EVENT);
    }

    public CacheEndEvent putAtStatus(String str) {
        put("Microsoft.MSAL.at_status", str);
        return this;
    }

    public CacheEndEvent putCacheRecordStatus(CacheRecord cacheRecord) {
        if (cacheRecord == null) {
            return this;
        }
        AccessTokenRecord accessToken = cacheRecord.getAccessToken();
        String str = TelemetryEventStrings.Value.FALSE;
        put("Microsoft.MSAL.at_status", accessToken == null ? TelemetryEventStrings.Value.FALSE : TelemetryEventStrings.Value.TRUE);
        if (cacheRecord.getRefreshToken() != null) {
            put("Microsoft.MSAL.mrrt_status", TelemetryEventStrings.Value.TRUE);
            put("Microsoft.MSAL.rt_status", TelemetryEventStrings.Value.TRUE);
            put("Microsoft.MSAL.frt_status", StringUtil.isNullOrEmpty(cacheRecord.getRefreshToken().getFamilyId()) ? TelemetryEventStrings.Value.FALSE : TelemetryEventStrings.Value.TRUE);
        } else {
            put("Microsoft.MSAL.rt_status", TelemetryEventStrings.Value.FALSE);
        }
        put("Microsoft.MSAL.id_token_status", cacheRecord.getIdToken() == null ? TelemetryEventStrings.Value.FALSE : TelemetryEventStrings.Value.TRUE);
        put(TelemetryEventStrings.Key.V1_ID_TOKEN_STATUS, cacheRecord.getV1IdToken() == null ? TelemetryEventStrings.Value.FALSE : TelemetryEventStrings.Value.TRUE);
        if (cacheRecord.getAccount() != null) {
            str = TelemetryEventStrings.Value.TRUE;
        }
        put("Microsoft.MSAL.account_status", str);
        EstsTelemetry.getInstance().emit(getProperties());
        return this;
    }

    public CacheEndEvent putFrtStatus(String str) {
        put("Microsoft.MSAL.frt_status", str);
        return this;
    }

    public CacheEndEvent putRtStatus(String str) {
        put("Microsoft.MSAL.rt_status", str);
        return this;
    }

    public CacheEndEvent putSpeInfo(String str) {
        put(TelemetryEventStrings.Key.SPE_INFO, str);
        return this;
    }
}
