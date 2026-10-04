package com.huawei.agconnect.config.ktx;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.remoteconfig.AGConnectConfig;
import com.huawei.agconnect.remoteconfig.ConfigValues;
import com.huawei.agconnect.remoteconfig.internal.AGConnectConfigImpl;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import o0O00OOO.OooO0o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0019\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0001\u0010\u0005\u001a\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\t\u001a\u00020\b2\u0018\u0010\u000e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\u000f\u001a\u0017\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0018\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0018\u00010\u0014¢\u0006\u0004\b\u0018\u0010\u0016\u001a!\u0010\u0018\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0018\u00010\u00142\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0018\u0010\u001b\u001a\u001f\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001f\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b!\u0010\u001f\u001a\u001f\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\"\u0010\u001f\u001a\u001f\u0010#\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b#\u0010\u001f\u001a\u001f\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b%\u0010\u001f\u001a\u001f\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b'\u0010\u001f\u001a\u001d\u0010(\u001a\u0012\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b\u0018\u00010\u0014¢\u0006\u0004\b(\u0010\u0016\u001a\r\u0010)\u001a\u00020\b¢\u0006\u0004\b)\u0010*\u001a\u0015\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u001d¢\u0006\u0004\b,\u0010-\u001a'\u0010.\u001a\u00020\b2\u0018\u0010\u000e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b¢\u0006\u0004\b.\u0010\u000f\u001a\u001d\u0010/\u001a\u0012\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b\u0018\u00010\u0014¢\u0006\u0004\b/\u0010\u0016\"\"\u00101\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0000008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, m80612d2 = {"Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;", "getInstance", "()Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;", "Lcom/huawei/agconnect/AGConnectInstance;", "instance", "(Lcom/huawei/agconnect/AGConnectInstance;)Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;", "", "resId", "LoO00ooO/OooOooO;", "applyDefault", "(I)V", "", "", "", "map", "(Ljava/util/Map;)V", "Lcom/huawei/agconnect/remoteconfig/ConfigValues;", C18437z2.f56756j, "apply", "(Lcom/huawei/agconnect/remoteconfig/ConfigValues;)V", "Ljava/lang/Class;", "loadLastFetched", "()Ljava/lang/Class;", "Lo0O00OOO/OooO0o;", RemoteConfigComponent.FETCH_FILE_NAME, "", "intervalSeconds", "(J)Ljava/lang/Class;", "key", "", "getValueAsBoolean", "(Ljava/lang/String;)Ljava/lang/Class;", "", "getValueAsDouble", "getValueAsLong", "getValueAsString", "", "getValueAsByteArray", "Lcom/huawei/agconnect/remoteconfig/AGConnectConfig$SOURCE;", "getSource", "getMergedAll", "clearAll", "()V", "isDeveloperMode", "setDeveloperMode", "(Z)V", "setCustomAttributes", "getCustomAttributes", "", "SERVICES_MAP", "Ljava/util/Map;", "agconnect-remoteconfig-ktx_release"}, m80613k = 2, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class ConfigKt {
    private static final Map<String, AGConnectConfig> SERVICES_MAP = new HashMap();

    public static final void apply(ConfigValues configValues) {
    }

    public static final void applyDefault(int i) {
    }

    public static final void clearAll() {
    }

    public static final Class<OooO0o<?>> fetch() {
        return OooO0o.class;
    }

    public static final Class<Map<?, ?>> getCustomAttributes() {
        return Map.class;
    }

    public static final AGConnectConfig getInstance() {
        AGConnectInstance aGConnectInstance = AGConnectInstance.getInstance();
        if (aGConnectInstance != null) {
            return AGConnectConfig.getInstance(aGConnectInstance);
        }
        throw new NullPointerException("The AGConnect SDK is not initialized. Please call the 'AGConnectInstance.initialize()' method first.");
    }

    public static final Class<Map<?, ?>> getMergedAll() {
        return Map.class;
    }

    public static final Class<AGConnectConfig.SOURCE> getSource(String str) {
        return AGConnectConfig.SOURCE.class;
    }

    public static final Class<Boolean> getValueAsBoolean(String str) {
        return Boolean.TYPE;
    }

    public static final Class<byte[]> getValueAsByteArray(String str) {
        return byte[].class;
    }

    public static final Class<Double> getValueAsDouble(String str) {
        return Double.TYPE;
    }

    public static final Class<Long> getValueAsLong(String str) {
        return Long.TYPE;
    }

    public static final Class<String> getValueAsString(String str) {
        return String.class;
    }

    public static final Class<ConfigValues> loadLastFetched() {
        return ConfigValues.class;
    }

    public static final void setCustomAttributes(Map<String, String> map) {
    }

    public static final void setDeveloperMode(boolean z) {
    }

    public static final void applyDefault(Map<String, ? extends Object> map) {
    }

    public static final Class<OooO0o<?>> fetch(long j) {
        return OooO0o.class;
    }

    public static final AGConnectConfig getInstance(AGConnectInstance aGConnectInstance) {
        if (aGConnectInstance != null) {
            Object service = aGConnectInstance.getService(AGConnectConfigImpl.class);
            if (service != null) {
                return (AGConnectConfig) service;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.huawei.agconnect.remoteconfig.AGConnectConfig");
        }
        throw new NullPointerException("AGConnectInstance can not be null.");
    }
}
