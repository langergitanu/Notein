package com.huawei.agconnect.common.api;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.huawei.agconnect.config.impl.Hex;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes8.dex */
public class PackageUtils {
    private static final String TAG = "PackageUtils";

    public static String getInstalledAppSign256(Context context, String str) {
        PackageManager packageManager;
        String str2;
        if (context == null || TextUtils.isEmpty(str) || (packageManager = context.getPackageManager()) == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo == null) {
                return null;
            }
            byte[] byteArray = packageInfo.signatures[0].toByteArray();
            MessageDigest messageDigest = MessageDigest.getInstance(KeyUtil.HMAC_KEY_HASH_ALGORITHM);
            if (messageDigest != null) {
                return Hex.encodeHexString(messageDigest.digest(byteArray));
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "not found: " + str;
            Logger.m75327e(TAG, str2);
            return null;
        } catch (RuntimeException unused2) {
            str2 = "get packageInfo runtimeException";
            Logger.m75327e(TAG, str2);
            return null;
        } catch (NoSuchAlgorithmException unused3) {
            str2 = "not found sha256 digest";
            Logger.m75327e(TAG, str2);
            return null;
        }
    }

    public static boolean isSystemApp(ApplicationInfo applicationInfo) {
        return (applicationInfo.flags & 1) != 0;
    }

    public static boolean isSystemApplication(Context context, String str) {
        PackageManager packageManager;
        StringBuilder sb;
        ApplicationInfo applicationInfo;
        if (context == null || TextUtils.isEmpty(str) || (packageManager = context.getPackageManager()) == null) {
            return false;
        }
        try {
            applicationInfo = packageManager.getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            sb = new StringBuilder("not found: ");
            sb.append(str);
            Logger.m75327e(TAG, sb.toString());
            applicationInfo = null;
        } catch (Exception unused2) {
            sb = new StringBuilder("getApplicationInfo Exception: ");
            sb.append(str);
            Logger.m75327e(TAG, sb.toString());
            applicationInfo = null;
        }
        if (applicationInfo != null) {
            return isSystemUpdateApp(applicationInfo) || isSystemApp(applicationInfo);
        }
        return false;
    }

    public static boolean isSystemUpdateApp(ApplicationInfo applicationInfo) {
        return (applicationInfo.flags & 128) != 0;
    }
}
