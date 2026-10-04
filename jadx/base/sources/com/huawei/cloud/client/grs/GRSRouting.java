package com.huawei.cloud.client.grs;

import android.content.Context;
import android.content.res.AssetManager;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.cloud.base.json.gson.GsonFactory;
import com.huawei.cloud.base.util.Logger;
import com.huawei.cloud.base.util.StringUtils;
import com.huawei.cloud.base.util.store.DataStore;
import com.huawei.cloud.base.util.store.FileDataStoreFactory;
import com.huawei.cloud.client.util.DomainManagerUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class GRSRouting {

    /* JADX INFO: renamed from: a */
    private static final Logger f52290a = Logger.getLogger("GRSRouting");

    /* JADX INFO: renamed from: b */
    private static final Object f52291b = new Object();

    /* JADX INFO: renamed from: c */
    private static volatile String f52292c;

    /* JADX INFO: renamed from: d */
    private static volatile String f52293d;

    /* JADX INFO: renamed from: e */
    private static volatile String f52294e;

    /* JADX INFO: renamed from: f */
    private static volatile String f52295f;

    /* JADX INFO: renamed from: g */
    private static FileDataStoreFactory f52296g;

    /* JADX INFO: renamed from: h */
    private static Map<String, Map<String, String>> f52297h;

    static {
        HashMap map = new HashMap();
        f52297h = map;
        map.put("com.huawei.cloud.hianalytics", new HashMap());
    }

    /* JADX INFO: renamed from: a */
    private static void m75695a(Context context) {
        try {
            FileDataStoreFactory fileDataStoreFactory = new FileDataStoreFactory(new File(context.getCacheDir().getPath() + "/DriveSDK"));
            f52296g = fileDataStoreFactory;
            DataStore dataStore = fileDataStoreFactory.getDataStore("DriveDomain");
            if (dataStore != null && !dataStore.isEmpty()) {
                f52295f = (String) dataStore.get("DriveDomain");
                if (f52295f == null || f52295f.equals("primary") || !DomainManagerUtil.isActiveTooLong(System.currentTimeMillis(), f52295f)) {
                    return;
                }
                f52295f = "primary";
                return;
            }
            dataStore.set("DriveDomain", "primary");
            f52295f = "primary";
        } catch (IOException e) {
            f52290a.m75690e("getDomainTypeFromStore: " + e.toString());
        }
    }

    public static String getBackUpDomain() {
        return f52293d;
    }

    public static String getDriveURL(Context context) {
        List<String> driveURLs;
        if (f52292c == null && f52293d == null && f52294e == null) {
            synchronized (f52291b) {
                try {
                    if (f52292c == null && f52293d == null && f52294e == null && (driveURLs = getDriveURLs(context)) != null && !driveURLs.isEmpty() && driveURLs.size() >= 3) {
                        f52292c = driveURLs.get(0);
                        f52293d = driveURLs.get(1);
                        f52294e = driveURLs.get(2);
                    }
                } finally {
                }
            }
        }
        m75695a(context);
        return StringUtils.isNullOrEmpty(f52295f) ? f52292c : "backup".equals(f52295f) ? f52293d : TranslateLanguage.RUSSIAN.equals(f52295f) ? f52294e : f52292c;
    }

    public static List<String> getDriveURLs(Context context) {
        try {
            AssetManager assets = context.getAssets();
            if (assets != null) {
                return ((ServerConfig) GsonFactory.getDefaultInstance().createJsonParser(assets.open("huawei_drive_server_config.json")).parseAndClose(ServerConfig.class)).getDriverServer().getBaseUrl();
            }
        } catch (IOException e) {
            f52290a.m75690e("getGlobalDriveURL: " + e.toString());
        }
        return new ArrayList();
    }

    public static String getPrimaryDomain() {
        return f52292c;
    }

    public static String getRuDomain() {
        return f52294e;
    }
}
