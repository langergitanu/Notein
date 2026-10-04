package com.huawei.hms.support.hwid;

import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIServiceImpl;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class HuaweiIdAuthAPIManager {
    public static final Scope HUAWEIID_BASE_SCOPE;
    public static final Api<HuaweiIdAuthParams> HUAWEI_OAUTH_API;
    public static final HuaweiIdAuthAPIService HuaweiIdAuthAPIService;

    /* JADX INFO: renamed from: a */
    private static final Api.Options<HuaweiIdAuthParams> f56937a;

    static {
        Api.Options<HuaweiIdAuthParams> options = new Api.Options<HuaweiIdAuthParams>() { // from class: com.huawei.hms.support.hwid.HuaweiIdAuthAPIManager.1
            @Override // com.huawei.hms.api.Api.Options
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public List<Scope> getScopeList(HuaweiIdAuthParams huaweiIdAuthParams) {
                return huaweiIdAuthParams.getRequestScopeList();
            }

            @Override // com.huawei.hms.api.Api.Options
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public List<PermissionInfo> getPermissionInfoList(HuaweiIdAuthParams huaweiIdAuthParams) {
                return huaweiIdAuthParams.getPermissionInfos();
            }
        };
        f56937a = options;
        HuaweiIdAuthAPIService = new HuaweiIdAuthAPIServiceImpl();
        HUAWEI_OAUTH_API = new Api<>(HuaweiApiAvailability.HMS_API_NAME_ID, options);
        HUAWEIID_BASE_SCOPE = new Scope(CommonConstant.SCOPE.ACCOUNT_BASEPROFILE);
    }
}
