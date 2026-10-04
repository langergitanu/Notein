package com.microsoft.identity.client;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public interface IMultiTenantAccount extends IAccount {
    Map<String, ITenantProfile> getTenantProfiles();
}
