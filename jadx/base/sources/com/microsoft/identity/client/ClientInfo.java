package com.microsoft.identity.client;

import android.util.Base64;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.microsoft.identity.client.exception.MsalClientException;
import com.microsoft.identity.client.internal.MsalUtils;
import java.nio.charset.Charset;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes9.dex */
final class ClientInfo {
    private final String mUniqueIdentifier;
    private final String mUniqueTenantIdentifier;

    public static final class ClientInfoClaim {
        static final String UNIQUE_IDENTIFIER = "uid";
        static final String UNIQUE_TENANT_IDENTIFIER = "utid";
    }

    public ClientInfo(String str) throws MsalClientException {
        if (MsalUtils.isEmpty(str)) {
            this.mUniqueIdentifier = "";
            this.mUniqueTenantIdentifier = "";
        } else {
            try {
                Map<String, String> mapExtractJsonObjectIntoMap = MsalUtils.extractJsonObjectIntoMap(new String(Base64.decode(str, 8), Charset.forName("UTF-8")));
                this.mUniqueIdentifier = mapExtractJsonObjectIntoMap.get(CommonConstant.KEY_UID);
                this.mUniqueTenantIdentifier = mapExtractJsonObjectIntoMap.get("utid");
            } catch (JSONException unused) {
                throw new MsalClientException("json_parse_failure", "Failed to parse the returned raw client info.");
            }
        }
    }

    public String getUniqueIdentifier() {
        return MsalUtils.isEmpty(this.mUniqueIdentifier) ? "" : this.mUniqueIdentifier;
    }

    public String getUniqueTenantIdentifier() {
        return MsalUtils.isEmpty(this.mUniqueTenantIdentifier) ? "" : this.mUniqueTenantIdentifier;
    }
}
