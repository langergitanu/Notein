package com.huawei.cloud.client.util;

import android.content.Context;
import com.huawei.cloud.base.auth.DriveCredential;
import com.huawei.cloud.base.json.gson.GsonFactory;
import com.huawei.cloud.base.util.Logger;
import com.huawei.cloud.base.util.StringUtils;
import com.huawei.cloud.base.util.store.DataStore;
import com.huawei.cloud.services.drive.model.About;
import com.huawei.hms.drive.C17795be;
import com.huawei.hms.drive.C17798bh;
import com.huawei.hms.drive.C17800bj;
import com.huawei.hms.drive.C17873h;
import com.huawei.hms.network.embedded.C18385v2;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class NationalCodeUtil {

    /* JADX INFO: renamed from: a */
    private static final Logger f52352a = Logger.getLogger("NationalCode");
    public static long invalidTime;

    private NationalCodeUtil() {
    }

    public static String getValue(About about, String str) {
        if (about == null) {
            return null;
        }
        Object obj = about.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.huawei.hms.drive.bj] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static About requestNationalCode(Context context, DriveCredential driveCredential, String str) throws Throwable {
        C17795be c17795beMo76786a;
        C17800bj c17800bjMo75980b;
        ?? r1 = 0;
        try {
            c17795beMo76786a = new C17873h(context).mo76786a(30);
        } catch (IOException unused) {
            f52352a.m75690e("Use default OkHttpClient error");
            c17795beMo76786a = null;
        }
        if (c17795beMo76786a == null || StringUtils.isNullOrEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!str.endsWith("/")) {
            sb.append("/");
        }
        sb.append("drive/v1/about?fields=*");
        String accessToken = driveCredential.getAccessToken();
        C17798bh.a aVar = new C17798bh.a();
        aVar.m76274a(sb.toString()).m76279b("Authorization", "Bearer " + accessToken).m76279b("version", AppInfo.SDK_VERSION);
        try {
            try {
                c17800bjMo75980b = c17795beMo76786a.m76193a(aVar.m76277a()).mo75980b();
                try {
                    About about = (About) GsonFactory.getDefaultInstance().createJsonParser(c17800bjMo75980b.m76287f().m76313b()).parseAndClose(About.class);
                    c17800bjMo75980b.close();
                    return about;
                } catch (IOException e) {
                    e = e;
                    f52352a.m75690e("get code error: " + e.toString());
                    if (c17800bjMo75980b != null) {
                        c17800bjMo75980b.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r1 = c17795beMo76786a;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            c17800bjMo75980b = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
            }
            throw th;
        }
    }

    public static void saveNationalCode(DataStore<String> dataStore, String str, String str2, String str3, long j) {
        if (dataStore != null) {
            try {
                invalidTime = j + C18385v2.f56338j;
                dataStore.set(str + "_time", String.valueOf(invalidTime));
                if (!StringUtils.isNullOrEmpty(str2)) {
                    dataStore.set(str, str2);
                }
                if (StringUtils.isNullOrEmpty(str3)) {
                    dataStore.delete(str + "_host");
                    return;
                }
                dataStore.set(str + "_host", str3);
            } catch (IOException e) {
                f52352a.m75690e("init config error: " + e.toString());
            }
        }
    }
}
