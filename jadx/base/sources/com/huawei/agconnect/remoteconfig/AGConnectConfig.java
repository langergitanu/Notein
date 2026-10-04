package com.huawei.agconnect.remoteconfig;

import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.remoteconfig.internal.C17671a;
import java.util.HashMap;
import java.util.Map;
import o0O00OOO.OooO0o;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AGConnectConfig {
    private static final Map<String, AGConnectConfig> SERVICES_MAP = new HashMap();
    private static final String TAG = "AGConnectConfig";

    public static final class DEFAULT {
        public static final boolean BOOLEAN_VALUE = false;
        public static final byte[] BYTE_ARRAY_VALUE = new byte[0];
        public static final double DOUBLE_VALUE = 0.0d;
        public static final long LONG_VALUE = 0;
        public static final String STRING_VALUE = "";
    }

    public enum SOURCE {
        STATIC,
        DEFAULT,
        REMOTE
    }

    public static AGConnectConfig getInstance() {
        AGConnectInstance aGConnectInstance = AGConnectInstance.getInstance();
        if (aGConnectInstance != null) {
            return getInstance(aGConnectInstance);
        }
        throw new NullPointerException("The AGConnect SDK is not initialized. Please call the 'AGConnectInstance.initialize()' method first.");
    }

    public abstract void apply(ConfigValues configValues);

    public abstract void applyDefault(int i);

    public abstract void applyDefault(Map<String, Object> map);

    public abstract void clearAll();

    public abstract OooO0o<ConfigValues> fetch();

    public abstract OooO0o<ConfigValues> fetch(long j);

    public abstract Map<String, String> getCustomAttributes();

    public abstract Map<String, Object> getMergedAll();

    public abstract SOURCE getSource(String str);

    public abstract Boolean getValueAsBoolean(String str);

    public abstract byte[] getValueAsByteArray(String str);

    public abstract Double getValueAsDouble(String str);

    public abstract Long getValueAsLong(String str);

    public abstract String getValueAsString(String str);

    public abstract ConfigValues loadLastFetched();

    public abstract void setCustomAttributes(Map<String, String> map);

    public abstract void setDeveloperMode(boolean z);

    public static AGConnectConfig getInstance(AGConnectInstance aGConnectInstance) {
        AGConnectConfig c17671a;
        if (aGConnectInstance == null) {
            throw new NullPointerException("AGConnectInstance can not be null.");
        }
        AGConnectConfig aGConnectConfig = (AGConnectConfig) aGConnectInstance.getService(C17671a.class);
        if (aGConnectConfig != null) {
            return aGConnectConfig;
        }
        synchronized (AGConnectConfig.class) {
            try {
                Map<String, AGConnectConfig> map = SERVICES_MAP;
                c17671a = map.get(aGConnectInstance.getIdentifier());
                if (c17671a == null) {
                    Logger.m75329i(TAG, "init config with constructor.");
                    c17671a = new C17671a(aGConnectInstance.getContext(), aGConnectInstance);
                    map.put(aGConnectInstance.getIdentifier(), c17671a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c17671a;
    }
}
