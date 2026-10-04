package com.huawei.cloud.base;

import com.huawei.cloud.base.auth.DriveCredential;
import com.huawei.cloud.base.http.GenericUrl;
import com.huawei.cloud.base.http.HttpRequestInitializer;
import com.huawei.cloud.base.util.Logger;
import com.huawei.cloud.base.util.StringUtils;
import com.huawei.cloud.base.util.store.DataStore;
import com.huawei.hms.drive.C17871f;
import com.huawei.hms.network.base.util.HttpUtils;
import java.net.URL;

/* JADX INFO: loaded from: classes8.dex */
public class MediaOverride {
    private static final String HOST = "_host";
    private static final String TIME = "_time";
    private static String host;
    private static long invalidTime;
    private static String scheme;
    private HttpRequestInitializer initializer;
    private static final String TAG = "MediaHttpInterceptor";
    private static final Logger LOGGER = Logger.getLogger(TAG);
    private static final Object LOCK = new Object();
    private static boolean initFlag = false;
    private static int port = -1;

    public MediaOverride(HttpRequestInitializer httpRequestInitializer) {
        this.initializer = httpRequestInitializer;
    }

    public static void setInitFlag(boolean z) {
        initFlag = z;
    }

    public void intercept(GenericUrl genericUrl) {
        synchronized (LOCK) {
            if (!initFlag) {
                HttpRequestInitializer httpRequestInitializer = this.initializer;
                if (httpRequestInitializer instanceof DriveCredential) {
                    String unionID = ((DriveCredential) httpRequestInitializer).getUnionID();
                    if (StringUtils.isNullOrEmpty(unionID)) {
                        return;
                    }
                    try {
                        DataStore dataStoreM76777a = C17871f.m76777a("DriveConfig");
                        if (dataStoreM76777a != null) {
                            String str = (String) dataStoreM76777a.get(unionID + TIME);
                            invalidTime = str == null ? 0L : Long.valueOf(str).longValue();
                            String strConcat = (String) dataStoreM76777a.get(unionID + HOST);
                            if (!strConcat.startsWith(HttpUtils.HTTP_PREFIX) && !strConcat.startsWith("https://")) {
                                strConcat = "https://".concat(strConcat);
                            }
                            URL url = new URL(strConcat);
                            scheme = url.getProtocol();
                            host = url.getHost();
                            port = url.getPort();
                        }
                    } catch (Exception unused) {
                        LOGGER.m75690e("init drive file proxy host error.");
                    }
                    initFlag = true;
                }
            }
            if (System.currentTimeMillis() > invalidTime) {
                initFlag = false;
                scheme = "";
                host = "";
                port = -1;
            }
            if (!StringUtils.isNullOrEmpty(scheme) && !StringUtils.isNullOrEmpty(host)) {
                genericUrl.setScheme(scheme);
                genericUrl.setHost(host);
                genericUrl.setPort(port);
            }
        }
    }
}
