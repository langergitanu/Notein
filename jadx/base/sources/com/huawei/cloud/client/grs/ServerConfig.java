package com.huawei.cloud.client.grs;

import com.huawei.cloud.base.json.GenericJson;
import com.huawei.cloud.base.util.Key;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class ServerConfig extends GenericJson {

    /* JADX INFO: renamed from: a */
    @Key("driver_server")
    private DriverServer f52298a;

    public static final class DriverServer extends GenericJson {

        /* JADX INFO: renamed from: a */
        @Key("base_url")
        List<String> f52299a;

        public List<String> getBaseUrl() {
            return this.f52299a;
        }

        public void setBaseUrl(List<String> list) {
            this.f52299a = list;
        }
    }

    public DriverServer getDriverServer() {
        return this.f52298a;
    }

    public void setDriverServer(DriverServer driverServer) {
        this.f52298a = driverServer;
    }
}
