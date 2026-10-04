package com.microsoft.identity.common.java.providers.microsoft.azureactivedirectory;

import com.microsoft.identity.common.java.exception.ServiceException;
import com.microsoft.identity.common.java.util.JsonUtil;
import com.microsoft.identity.common.java.util.StringUtil;
import java.io.Serializable;
import java.util.Map;
import oO0000oO.C31932OooO00o;
import org.json.JSONException;

/* JADX INFO: loaded from: classes9.dex */
public class ClientInfo implements Serializable {
    private static final String UNIQUE_IDENTIFIER = "uid";
    private static final String UNIQUE_TENANT_IDENTIFIER = "utid";
    private static final long serialVersionUID = 3326461566190095403L;
    private String mRawClientInfo;
    private String mUid;
    private String mUtid;

    public ClientInfo(String str) throws ServiceException {
        if (str == null) {
            throw new NullPointerException("rawClientInfo is marked non-null but is null");
        }
        if (StringUtil.isNullOrEmpty(str)) {
            throw new IllegalArgumentException("ClientInfo cannot be null or blank.");
        }
        try {
            Map<String, String> mapExtractJsonObjectIntoMap = JsonUtil.extractJsonObjectIntoMap(StringUtil.fromByteArray(C31932OooO00o.OooO00o(str, 8)));
            this.mUid = mapExtractJsonObjectIntoMap.get("uid");
            this.mUtid = mapExtractJsonObjectIntoMap.get(UNIQUE_TENANT_IDENTIFIER);
            this.mRawClientInfo = str;
        } catch (JSONException e) {
            throw new ServiceException("", "invalid_jwt", e);
        }
    }

    public String getRawClientInfo() {
        return this.mRawClientInfo;
    }

    public String getUid() {
        return this.mUid;
    }

    public String getUtid() {
        return this.mUtid;
    }
}
