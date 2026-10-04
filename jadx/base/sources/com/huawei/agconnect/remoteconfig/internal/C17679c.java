package com.huawei.agconnect.remoteconfig.internal;

import com.aspose.slides.C22226Oooo0oo;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.AgcCrypto;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;
import com.huawei.agconnect.remoteconfig.AGConnectConfig;
import com.huawei.agconnect.remoteconfig.ConfigValues;
import com.huawei.agconnect.remoteconfig.internal.p572c.InterfaceC17680a;
import com.huawei.hms.network.embedded.C18115b5;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: renamed from: com.huawei.agconnect.remoteconfig.internal.c */
/* JADX INFO: loaded from: classes8.dex */
public class C17679c implements ConfigValues {

    /* JADX INFO: renamed from: a */
    private ConfigContainer f52280a;

    /* JADX INFO: renamed from: b */
    private final String f52281b;

    public C17679c(String str, AGConnectInstance aGConnectInstance) {
        StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str, C18115b5.CONNECTOR);
        sbOooO0OO.append(aGConnectInstance.getIdentifier());
        String string = sbOooO0OO.toString();
        this.f52281b = string;
        this.f52280a = (ConfigContainer) SharedPrefUtil.getInstance().get("com.huawei.agconnect.config", string, ConfigContainer.class, null, AgcCrypto.class);
    }

    /* JADX INFO: renamed from: a */
    public ConfigContainer m75668a() {
        return this.f52280a;
    }

    /* JADX INFO: renamed from: b */
    public void m75670b() {
        this.f52280a = null;
        SharedPrefUtil.getInstance().remove("com.huawei.agconnect.config", this.f52281b);
    }

    /* JADX INFO: renamed from: c */
    public Map<String, Object> m75671c() {
        HashMap map = new HashMap();
        ConfigContainer configContainer = this.f52280a;
        if (configContainer != null) {
            Iterator<String> itKeys = configContainer.m75653a().keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = this.f52280a.m75653a().opt(next);
                if (objOpt != null) {
                    map.put(next, objOpt);
                }
            }
        }
        return map;
    }

    @Override // com.huawei.agconnect.remoteconfig.ConfigValues
    public boolean containKey(String str) {
        ConfigContainer configContainer = this.f52280a;
        return (configContainer == null || configContainer.m75653a().opt(str) == null) ? false : true;
    }

    @Override // com.huawei.agconnect.remoteconfig.ConfigValues
    public Boolean getValueAsBoolean(String str) {
        String string = null;
        try {
            ConfigContainer configContainer = this.f52280a;
            if (configContainer != null) {
                string = configContainer.m75653a().getString(str);
            }
        } catch (JSONException unused) {
            Logger.m75326d("RemoteConfig", "not find in config values for key : " + str);
        }
        if (string != null) {
            if (InterfaceC17680a.a.f52282a.matcher(string).matches()) {
                return Boolean.TRUE;
            }
            if (InterfaceC17680a.a.f52283b.matcher(string).matches()) {
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }

    @Override // com.huawei.agconnect.remoteconfig.ConfigValues
    public byte[] getValueAsByteArray(String str) {
        String string = null;
        try {
            ConfigContainer configContainer = this.f52280a;
            if (configContainer != null) {
                string = configContainer.m75653a().getString(str);
            }
        } catch (JSONException unused) {
            Logger.m75326d("RemoteConfig", "not find in config values for key : " + str);
        }
        return string != null ? string.getBytes(Charset.forName("UTF-8")) : AGConnectConfig.DEFAULT.BYTE_ARRAY_VALUE;
    }

    @Override // com.huawei.agconnect.remoteconfig.ConfigValues
    public Double getValueAsDouble(String str) {
        Double dValueOf = null;
        try {
            ConfigContainer configContainer = this.f52280a;
            if (configContainer != null) {
                dValueOf = Double.valueOf(configContainer.m75653a().getDouble(str));
            }
        } catch (JSONException unused) {
            Logger.m75326d("RemoteConfig", "not find in config values for key : " + str);
        }
        return dValueOf != null ? dValueOf : Double.valueOf(0.0d);
    }

    @Override // com.huawei.agconnect.remoteconfig.ConfigValues
    public Long getValueAsLong(String str) {
        Long lValueOf = null;
        try {
            ConfigContainer configContainer = this.f52280a;
            if (configContainer != null) {
                lValueOf = Long.valueOf(configContainer.m75653a().getLong(str));
            }
        } catch (JSONException unused) {
            Logger.m75326d("RemoteConfig", "not find in config values for key : " + str);
        }
        if (lValueOf != null) {
            return lValueOf;
        }
        return 0L;
    }

    @Override // com.huawei.agconnect.remoteconfig.ConfigValues
    public String getValueAsString(String str) {
        String string = null;
        try {
            ConfigContainer configContainer = this.f52280a;
            if (configContainer != null) {
                string = configContainer.m75653a().getString(str);
            }
        } catch (JSONException unused) {
            Logger.m75326d("RemoteConfig", "not find in config values for key : " + str);
        }
        return string != null ? string : "";
    }

    /* JADX INFO: renamed from: a */
    public void m75669a(ConfigContainer configContainer) {
        this.f52280a = configContainer;
        SharedPrefUtil.getInstance().put("com.huawei.agconnect.config", this.f52281b, ConfigContainer.class, configContainer, AgcCrypto.class);
    }
}
