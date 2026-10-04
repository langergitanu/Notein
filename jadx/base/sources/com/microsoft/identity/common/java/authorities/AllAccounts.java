package com.microsoft.identity.common.java.authorities;

/* JADX INFO: loaded from: classes9.dex */
public class AllAccounts extends AzureActiveDirectoryAudience {
    public static final String ALL_ACCOUNTS_TENANT_ID = "common";

    public AllAccounts() {
        setTenantId("common");
    }

    public AllAccounts(String str) {
        if (str != null) {
            setCloudUrl(str);
            setTenantId("common");
            return;
        }
        throw new NullPointerException("cloudUrl is marked non-null but is null");
    }
}
