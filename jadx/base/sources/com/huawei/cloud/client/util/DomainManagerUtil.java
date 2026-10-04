package com.huawei.cloud.client.util;

import android.content.Context;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.hihonor.honorid.core.data.UserInfo;
import com.huawei.cloud.base.MediaOverride;
import com.huawei.cloud.base.auth.DriveCredential;
import com.huawei.cloud.base.http.HttpRequestInitializer;
import com.huawei.cloud.base.util.StringUtils;
import com.huawei.cloud.base.util.store.DataStore;
import com.huawei.cloud.base.util.store.FileDataStoreFactory;
import com.huawei.cloud.client.grs.GRSRouting;
import com.huawei.cloud.services.drive.model.About;
import com.huawei.hms.network.embedded.C18250l0;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class DomainManagerUtil {

    /* JADX INFO: renamed from: a */
    private static FileDataStoreFactory f52345a;

    /* JADX INFO: renamed from: b */
    private static Map<String, Long> f52346b = new HashMap();

    /* JADX INFO: renamed from: c */
    private static Map<String, Long> f52347c = new HashMap();

    /* JADX INFO: renamed from: d */
    private static long f52348d = C18250l0.g.f55493g;

    /* JADX INFO: renamed from: e */
    private static String f52349e;

    /* JADX INFO: renamed from: f */
    private static String f52350f;

    private DomainManagerUtil() {
    }

    /* JADX INFO: renamed from: a */
    private static boolean m75710a(Context context, HttpRequestInitializer httpRequestInitializer, DataStore<String> dataStore) throws IOException {
        if (NationalCodeUtil.requestNationalCode(context, (DriveCredential) httpRequestInitializer, GRSRouting.getPrimaryDomain()) == null) {
            return false;
        }
        dataStore.clear();
        dataStore.set("DriveDomain", "primary");
        return true;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m75711b(Context context, HttpRequestInitializer httpRequestInitializer, DataStore<String> dataStore) throws IOException {
        if (NationalCodeUtil.requestNationalCode(context, (DriveCredential) httpRequestInitializer, GRSRouting.getBackUpDomain()) == null) {
            return false;
        }
        dataStore.clear();
        dataStore.set("DriveDomain", "backup");
        return true;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m75712c(Context context, HttpRequestInitializer httpRequestInitializer, DataStore<String> dataStore) throws IOException {
        if (NationalCodeUtil.requestNationalCode(context, (DriveCredential) httpRequestInitializer, GRSRouting.getRuDomain()) == null) {
            return false;
        }
        dataStore.clear();
        dataStore.set("DriveDomain", TranslateLanguage.RUSSIAN);
        return true;
    }

    public static void clearExpiredTime() {
        if (!StringUtils.isNullOrEmpty(f52349e)) {
            if ("primary".equals(f52349e) && f52346b.containsKey("primary")) {
                f52346b.remove("primary");
            } else if ("backup".equals(f52349e)) {
                f52346b.remove("backup");
            } else if (TranslateLanguage.RUSSIAN.equals(f52349e)) {
                f52346b.remove(TranslateLanguage.RUSSIAN);
            }
        }
        if (StringUtils.isNullOrEmpty(f52350f) || !f52346b.containsKey(f52350f)) {
            return;
        }
        f52346b.remove("nearby");
    }

    public static boolean isActiveTooLong(long j, String str) {
        if (!f52347c.containsKey(str)) {
            f52347c.put(str, Long.valueOf(j));
            return false;
        }
        if (j - f52347c.get(str).longValue() < f52348d) {
            return false;
        }
        f52347c.remove(str);
        return true;
    }

    public static boolean isExpiredTooLong(long j, String str) {
        if (!f52346b.containsKey(str)) {
            f52346b.put(str, Long.valueOf(j));
            return false;
        }
        if (j - f52346b.get(str).longValue() < f52348d) {
            return false;
        }
        f52346b.remove(str);
        return true;
    }

    public static synchronized void switchDriveDomain(Context context, String str, HttpRequestInitializer httpRequestInitializer) {
        try {
            FileDataStoreFactory fileDataStoreFactory = new FileDataStoreFactory(new File(context.getCacheDir().getPath() + "/DriveSDK"));
            f52345a = fileDataStoreFactory;
            DataStore dataStore = fileDataStoreFactory.getDataStore("DriveDomain");
            DataStore dataStore2 = f52345a.getDataStore(CommonConstant.KEY_UNION_ID);
            DataStore dataStore3 = f52345a.getDataStore("DriveConfig");
            String str2 = (String) dataStore2.get(CommonConstant.KEY_UNION_ID);
            String str3 = (String) dataStore3.get(str2 + "_host");
            f52350f = str3;
            if (str3 == null || !str3.equals(str)) {
                String str4 = (String) dataStore.get("DriveDomain");
                f52349e = str4;
                if (str4 != null) {
                    if ("primary".equals(str4)) {
                        if (!m75711b(context, httpRequestInitializer, dataStore)) {
                            m75712c(context, httpRequestInitializer, dataStore);
                        }
                    } else if ("backup".equals(f52349e)) {
                        if (!m75712c(context, httpRequestInitializer, dataStore)) {
                            m75710a(context, httpRequestInitializer, dataStore);
                        }
                    } else if (TranslateLanguage.RUSSIAN.equals(f52349e) && !m75710a(context, httpRequestInitializer, dataStore)) {
                        m75711b(context, httpRequestInitializer, dataStore);
                    }
                }
            } else if (isExpiredTooLong(System.currentTimeMillis(), "nearby")) {
                About aboutRequestNationalCode = NationalCodeUtil.requestNationalCode(context, (DriveCredential) httpRequestInitializer, GRSRouting.getDriveURL(context));
                NationalCodeUtil.saveNationalCode(dataStore3, str2, NationalCodeUtil.getValue(aboutRequestNationalCode, UserInfo.NATIONALCODE), NationalCodeUtil.getValue(aboutRequestNationalCode, "domain"), System.currentTimeMillis());
                MediaOverride.setInitFlag(false);
            }
        } catch (IOException unused) {
            f52345a = null;
        }
    }
}
