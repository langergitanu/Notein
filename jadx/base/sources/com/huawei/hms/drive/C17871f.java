package com.huawei.hms.drive;

import android.content.Context;
import com.huawei.cloud.base.media.UploadID;
import com.huawei.cloud.base.util.StringUtils;
import com.huawei.cloud.base.util.store.DataStore;
import com.huawei.cloud.base.util.store.FileDataStoreFactory;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.huawei.hms.drive.f */
/* JADX INFO: loaded from: classes6.dex */
public class C17871f {

    /* JADX INFO: renamed from: a */
    private static FileDataStoreFactory f53404a;

    /* JADX INFO: renamed from: a */
    public static synchronized void m76780a(Context context, String str) {
        try {
            try {
                FileDataStoreFactory fileDataStoreFactory = new FileDataStoreFactory(new File(context.getCacheDir().getPath() + "/DriveSDK"));
                f53404a = fileDataStoreFactory;
                DataStore dataStore = fileDataStoreFactory.getDataStore(CommonConstant.KEY_UNION_ID);
                if (!str.equals(dataStore.get(CommonConstant.KEY_UNION_ID))) {
                    m76781a(f53404a, CommonConstant.KEY_UNION_ID);
                    m76781a(f53404a, "DriveConfig");
                    m76781a(f53404a, "UploadID");
                    dataStore.set(CommonConstant.KEY_UNION_ID, str);
                }
                DataStore dataStore2 = f53404a.getDataStore("UploadID");
                ArrayList arrayList = new ArrayList();
                for (UploadID uploadID : dataStore2.values()) {
                    if (uploadID.isExpiredTooLong()) {
                        arrayList.add(uploadID.getLocalID());
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    dataStore2.delete((String) it.next());
                }
            } catch (IOException unused) {
                f53404a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m76782b(String str, String str2) throws IOException {
        FileDataStoreFactory fileDataStoreFactory;
        if (StringUtils.isNullOrEmpty(str) || StringUtils.isNullOrEmpty(str2) || (fileDataStoreFactory = f53404a) == null) {
            return;
        }
        fileDataStoreFactory.getDataStore(str).delete(str2);
    }

    /* JADX INFO: renamed from: a */
    public static <T extends Serializable> T m76778a(String str, String str2) throws IOException {
        FileDataStoreFactory fileDataStoreFactory;
        if (StringUtils.isNullOrEmpty(str) || StringUtils.isNullOrEmpty(str2) || (fileDataStoreFactory = f53404a) == null) {
            return null;
        }
        return (T) fileDataStoreFactory.getDataStore(str).get(str2);
    }

    /* JADX INFO: renamed from: a */
    public static <T extends Serializable> T m76779a(String str, String str2, T t) throws IOException {
        FileDataStoreFactory fileDataStoreFactory;
        if (StringUtils.isNullOrEmpty(str) || StringUtils.isNullOrEmpty(str2) || t == null || (fileDataStoreFactory = f53404a) == null) {
            return null;
        }
        DataStore dataStore = fileDataStoreFactory.getDataStore(str);
        dataStore.set(str2, t);
        return (T) dataStore.get(str2);
    }

    /* JADX INFO: renamed from: a */
    public static <T extends Serializable> DataStore<T> m76777a(String str) throws IOException {
        FileDataStoreFactory fileDataStoreFactory;
        if (StringUtils.isNullOrEmpty(str) || (fileDataStoreFactory = f53404a) == null) {
            return null;
        }
        return fileDataStoreFactory.getDataStore(str);
    }

    /* JADX INFO: renamed from: a */
    private static void m76781a(FileDataStoreFactory fileDataStoreFactory, String str) throws IOException {
        DataStore dataStore = fileDataStoreFactory.getDataStore(str);
        if (dataStore != null) {
            dataStore.clear();
        }
    }
}
