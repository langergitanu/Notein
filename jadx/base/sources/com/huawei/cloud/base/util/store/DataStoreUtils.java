package com.huawei.cloud.base.util.store;

import com.huawei.cloud.base.exception.HttpClientException;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class DataStoreUtils {
    private DataStoreUtils() {
    }

    public static String toString(DataStore<?> dataStore) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append('{');
            boolean z = true;
            for (String str : dataStore.keySet()) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append('=');
                sb.append(dataStore.get(str));
            }
            sb.append('}');
            return sb.toString();
        } catch (IOException e) {
            throw new HttpClientException(e);
        }
    }
}
