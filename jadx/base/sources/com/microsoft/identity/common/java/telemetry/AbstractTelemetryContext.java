package com.microsoft.identity.common.java.telemetry;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public abstract class AbstractTelemetryContext extends Properties {
    private TelemetryPropertiesCache mTelemetryPropsCache;

    public AbstractTelemetryContext(TelemetryPropertiesCache telemetryPropertiesCache) {
        if (telemetryPropertiesCache == null) {
            throw new NullPointerException("telemetryPropertiesCache is marked non-null but is null");
        }
        this.mTelemetryPropsCache = telemetryPropertiesCache;
        put(TelemetryEventStrings.Device.f57084ID, telemetryPropertiesCache.getOrCreateRandomStableDeviceId());
        put(TelemetryEventStrings.Device.TIMEZONE, TimeZone.getDefault().getID());
    }

    public void addApplicationInfo(String str, String str2, String str3, String str4) {
        put(TelemetryEventStrings.App.NAME, str2);
        put(TelemetryEventStrings.App.PACKAGE, str);
        put(TelemetryEventStrings.App.VERSION, str3);
        put(TelemetryEventStrings.App.BUILD, str4);
    }

    public void addDeviceInfo(String str, String str2, String str3) {
        put(TelemetryEventStrings.Device.MANUFACTURER, str);
        put(TelemetryEventStrings.Device.MODEL, str2);
        put(TelemetryEventStrings.Device.NAME, str3);
    }

    public void addOsInfo(String str, String str2) {
        put(TelemetryEventStrings.C18741Os.NAME, str);
        put(TelemetryEventStrings.C18741Os.VERSION, str2);
    }
}
