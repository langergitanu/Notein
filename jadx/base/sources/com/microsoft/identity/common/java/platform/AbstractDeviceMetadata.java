package com.microsoft.identity.common.java.platform;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractDeviceMetadata implements IDeviceMetadata {
    private static final String SEPARATOR = ":";

    @Override // com.microsoft.identity.common.java.platform.IDeviceMetadata
    public String getAllMetadata() {
        return getDeviceModel() + ":" + getManufacturer() + ":" + getCpu() + ":" + getOsForEsts() + ":" + getOsForDrs();
    }
}
