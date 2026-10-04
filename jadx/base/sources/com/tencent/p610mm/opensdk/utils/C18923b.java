package com.tencent.p610mm.opensdk.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.utils.b */
/* JADX INFO: loaded from: classes10.dex */
public final class C18923b {

    /* JADX INFO: renamed from: a */
    public static Context f58127a;

    /* JADX INFO: renamed from: b */
    public static ThreadPoolExecutor f58128b = new ThreadPoolExecutor(5, 9, 1, TimeUnit.SECONDS, new LinkedBlockingDeque());

    /* JADX INFO: renamed from: a */
    public static int m80588a(ContentResolver contentResolver, Uri uri) {
        Log.m80585i("MicroMsg.SDK.Util", "getFileSize with content url");
        if (contentResolver == null || uri == null) {
            Log.m80587w("MicroMsg.SDK.Util", "getFileSize fail, resolver or uri is null");
            return 0;
        }
        InputStream inputStream = null;
        try {
            try {
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                if (inputStreamOpenInputStream == null) {
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    return 0;
                }
                int iAvailable = inputStreamOpenInputStream.available();
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused2) {
                }
                return iAvailable;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            Log.m80587w("MicroMsg.SDK.Util", "getFileSize fail, " + e.getMessage());
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m80592b(String str) {
        return str == null || str.length() <= 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m80589a(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        File file = new File(str);
        if (file.exists()) {
            return (int) file.length();
        }
        if (f58127a != null && str.startsWith(FirebaseAnalytics.Param.CONTENT)) {
            try {
                return m80588a(f58127a.getContentResolver(), Uri.parse(str));
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m80590a(String str, int i) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    return Integer.parseInt(str);
                }
            } catch (Exception unused) {
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m80591a(int i) {
        return i == 36 || i == 46;
    }
}
