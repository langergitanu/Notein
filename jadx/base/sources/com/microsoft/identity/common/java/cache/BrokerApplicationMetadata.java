package com.microsoft.identity.common.java.cache;

import com.google.gson.annotations.SerializedName;
import com.microsoft.identity.common.java.cache.AbstractApplicationMetadata;

/* JADX INFO: loaded from: classes9.dex */
public class BrokerApplicationMetadata extends AbstractApplicationMetadata {

    @SerializedName("family_id")
    private String mFoci;

    public static final class SerializedNames extends AbstractApplicationMetadata.SerializedNames {
        static final String FAMILY_ID = "family_id";

        private SerializedNames() {
        }
    }

    @Override // com.microsoft.identity.common.java.cache.AbstractApplicationMetadata
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String getFoci() {
        return this.mFoci;
    }

    @Override // com.microsoft.identity.common.java.cache.AbstractApplicationMetadata
    public int hashCode() {
        return super.hashCode();
    }

    public void setFoci(String str) {
        this.mFoci = str;
    }
}
