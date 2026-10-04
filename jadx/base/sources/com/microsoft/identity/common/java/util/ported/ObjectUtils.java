package com.microsoft.identity.common.java.util.ported;

import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.java.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
public final class ObjectUtils {
    private static String TAG = "ObjectUtils";

    private ObjectUtils() {
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void throwIfArgumentIsNull(Object obj, String str, String str2) throws NullPointerException {
        if (str == null) {
            throw new NullPointerException("argumentName is marked non-null but is null");
        }
        if (str2 == null) {
            throw new NullPointerException("methodName is marked non-null but is null");
        }
        if (obj != null) {
            return;
        }
        Logger.error(OooO00o.OooO0OO(new StringBuilder(), TAG, str2), str.concat(" is null."), null);
        throw new NullPointerException(str.concat(" is null."));
    }
}
