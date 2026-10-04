package com.huawei.hms.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.AndroidException;
import com.huawei.hms.support.log.HMSLog;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* JADX INFO: loaded from: classes9.dex */
public class PackageManagerHelper {

    /* JADX INFO: renamed from: a */
    public final PackageManager f57028a;

    public enum PackageStates {
        ENABLED,
        DISABLED,
        NOT_INSTALLED,
        SPOOF
    }

    public PackageManagerHelper(Context context) {
        this.f57028a = context.getPackageManager();
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m80223a(String str) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = this.f57028a.getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length > 0) {
                return signatureArr[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException e) {
            HMSLog.m80172e("PackageManagerHelper", "Failed to get application signature certificate fingerprint." + e.getMessage());
        } catch (RuntimeException e2) {
            HMSLog.m80173e("PackageManagerHelper", "Failed to get application signature certificate fingerprint.", e2);
        }
        HMSLog.m80172e("PackageManagerHelper", "Failed to get application signature certificate fingerprint.");
        return new byte[0];
    }

    public String getApplicationName(String str) {
        try {
            return this.f57028a.getApplicationLabel(this.f57028a.getApplicationInfo(str, 128)).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.m80172e("PackageManagerHelper", "Failed to get application name for " + str);
            return null;
        }
    }

    public long getPackageFirstInstallTime(String str) {
        try {
            PackageInfo packageInfo = this.f57028a.getPackageInfo(str, 128);
            if (packageInfo != null) {
                return packageInfo.firstInstallTime;
            }
            return 0L;
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            return 0L;
        }
    }

    public String getPackageSignature(String str) {
        byte[] bArrM80223a = m80223a(str);
        if (bArrM80223a == null || bArrM80223a.length == 0) {
            return null;
        }
        return HEX.encodeHexString(SHA256.digest(bArrM80223a), true);
    }

    public PackageStates getPackageStates(String str) {
        if (TextUtils.isEmpty(str)) {
            return PackageStates.NOT_INSTALLED;
        }
        try {
            return this.f57028a.getApplicationInfo(str, 128).enabled ? PackageStates.ENABLED : PackageStates.DISABLED;
        } catch (PackageManager.NameNotFoundException unused) {
            return PackageStates.NOT_INSTALLED;
        }
    }

    public int getPackageVersionCode(String str) {
        try {
            PackageInfo packageInfo = this.f57028a.getPackageInfo(str, 16);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
            return 0;
        } catch (AndroidException e) {
            HMSLog.m80172e("PackageManagerHelper", "get PackageVersionCode failed " + e);
            return 0;
        } catch (RuntimeException e2) {
            HMSLog.m80173e("PackageManagerHelper", "get PackageVersionCode failed", e2);
            return 0;
        }
    }

    public String getPackageVersionName(String str) {
        try {
            PackageInfo packageInfo = this.f57028a.getPackageInfo(str, 16);
            if (packageInfo != null) {
                String str2 = packageInfo.versionName;
                if (str2 != null) {
                    return str2;
                }
            }
            return "";
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        } catch (RuntimeException e) {
            HMSLog.m80173e("PackageManagerHelper", "get getPackageVersionName failed", e);
            return "";
        }
    }

    public boolean hasProvider(String str, String str2) {
        ProviderInfo[] providerInfoArr;
        try {
            PackageInfo packageInfo = this.f57028a.getPackageInfo(str, 8);
            if (packageInfo != null && (providerInfoArr = packageInfo.providers) != null) {
                for (ProviderInfo providerInfo : providerInfoArr) {
                    if (str2.equals(providerInfo.authority)) {
                        return true;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
        }
        return false;
    }

    public boolean isPackageFreshInstall(String str) {
        try {
            PackageInfo packageInfo = this.f57028a.getPackageInfo(str, 128);
            if (packageInfo != null) {
                if (packageInfo.firstInstallTime == packageInfo.lastUpdateTime) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
        }
        return false;
    }

    public boolean verifyPackageArchive(String str, String str2, String str3) {
        PackageInfo packageArchiveInfo = this.f57028a.getPackageArchiveInfo(str, 64);
        if (packageArchiveInfo == null || packageArchiveInfo.signatures.length <= 0 || !str2.equals(packageArchiveInfo.packageName)) {
            return false;
        }
        InputStream inputStream = null;
        try {
            try {
                inputStream = IOUtils.toInputStream(packageArchiveInfo.signatures[0].toByteArray());
                return str3.equalsIgnoreCase(HEX.encodeHexString(SHA256.digest(CertificateFactory.getInstance("X.509").generateCertificate(inputStream).getEncoded()), true));
            } finally {
                IOUtils.closeQuietly((InputStream) null);
            }
        } catch (IOException | CertificateException e) {
            HMSLog.m80172e("PackageManagerHelper", "Failed to get application signature certificate fingerprint." + e.getMessage());
            return false;
        }
    }
}
