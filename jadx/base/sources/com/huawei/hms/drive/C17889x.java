package com.huawei.hms.drive;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.common.PackageConstants;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: com.huawei.hms.drive.x */
/* JADX INFO: loaded from: classes6.dex */
public class C17889x {

    /* JADX INFO: renamed from: a */
    private static final Uri f53488a = Uri.parse("content://com.huawei.hwid");

    /* JADX INFO: renamed from: b */
    private static final String[] f53489b = {"B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05", "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539"};

    /* JADX WARN: Can't wrap try/catch for region: R(15:28|66|29|30|63|31|(7:32|(1:34)(1:69)|51|52|53|54|55)|35|68|36|(1:44)(1:41)|45|53|54|55) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c5, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c6, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e1, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fe, code lost:
    
        com.huawei.hms.drive.AbstractC17765ab.m75930a(r3);
        com.huawei.hms.drive.AbstractC17765ab.m75931a((java.io.OutputStream) r0);
        com.huawei.hms.drive.AbstractC17765ab.m75930a((java.io.InputStream) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0107, code lost:
    
        throw r7;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized InputStream m76890a(Context context) {
        InputStream inputStreamOpenInputStream;
        byte[] bArr;
        try {
            C17766ac.m75934b("BksUtil", "get bks from tss begin");
            if (context != null) {
                C17891z.m76905a(context);
            }
            Context contextM76904a = C17891z.m76904a();
            ByteArrayInputStream byteArrayInputStream = null;
            if (contextM76904a == null) {
                C17766ac.m75936d("BksUtil", "context is null");
                return null;
            }
            if (!m76897b(C17767ad.m75937a("com.huawei.hwid")) && !m76897b(C17767ad.m75937a(PackageConstants.SERVICES_PACKAGE_ALL_SCENE))) {
                C17766ac.m75936d("BksUtil", "hms version code is too low : " + C17767ad.m75937a("com.huawei.hwid"));
                return null;
            }
            if (!m76893a(contextM76904a, "com.huawei.hwid") && !m76896b(contextM76904a, PackageConstants.SERVICES_PACKAGE_ALL_SCENE)) {
                C17766ac.m75936d("BksUtil", "hms sign error");
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                inputStreamOpenInputStream = contextM76904a.getContentResolver().openInputStream(Uri.withAppendedPath(f53488a, "files/hmsrootcas.bks"));
                try {
                    try {
                        bArr = new byte[1024];
                    } catch (Exception unused) {
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception unused2) {
                inputStreamOpenInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                inputStreamOpenInputStream = null;
            }
            while (true) {
                int i = inputStreamOpenInputStream.read(bArr);
                if (i <= -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
                C17766ac.m75936d("BksUtil", "Get bks from HMS_VERSION_CODE exception : No content provider");
                AbstractC17765ab.m75930a(inputStreamOpenInputStream);
                AbstractC17765ab.m75931a((OutputStream) byteArrayOutputStream);
                AbstractC17765ab.m75930a((InputStream) byteArrayInputStream);
                return m76894b(contextM76904a);
            }
            byteArrayOutputStream.flush();
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            String strM75940b = C17768ae.m75940b("bks_hash", "", contextM76904a);
            String strM76899c = m76899c(byteArrayOutputStream.toByteArray());
            if (m76901d(contextM76904a) && strM75940b.equals(strM76899c)) {
                C17766ac.m75934b("BksUtil", "bks not update");
            } else {
                C17766ac.m75934b("BksUtil", "update bks and sp");
                m76892a(byteArrayInputStream2, contextM76904a);
                C17768ae.m75939a("bks_hash", strM76899c, contextM76904a);
            }
            AbstractC17765ab.m75930a(inputStreamOpenInputStream);
            AbstractC17765ab.m75931a((OutputStream) byteArrayOutputStream);
            AbstractC17765ab.m75930a((InputStream) byteArrayInputStream2);
            return m76894b(contextM76904a);
        } finally {
        }
    }

    /* JADX INFO: renamed from: b */
    public static InputStream m76894b(Context context) {
        if (!m76901d(context)) {
            return null;
        }
        C17766ac.m75934b("BksUtil", "getFilesBksIS ");
        try {
            return new FileInputStream(m76902e(context));
        } catch (FileNotFoundException unused) {
            C17766ac.m75936d("BksUtil", "FileNotFoundExceptio: ");
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m76899c(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(KeyUtil.HMAC_KEY_HASH_ALGORITHM);
            messageDigest.update(bArr);
            return m76895b(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            C17766ac.m75936d("BksUtil", "inputstraem exception");
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    private static boolean m76901d(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(m76898c(context));
        return new File(androidx.concurrent.futures.OooO00o.OooO0OO(sb, File.separator, "hmsrootcas.bks")).exists();
    }

    /* JADX INFO: renamed from: e */
    private static String m76902e(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(m76898c(context));
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, File.separator, "hmsrootcas.bks");
    }

    /* JADX INFO: renamed from: b */
    private static boolean m76897b(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C17766ac.m75934b("BksUtil", "hms version code is : " + str);
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = "4.0.2.300".split("\\.");
        int length = strArrSplit.length;
        int length2 = strArrSplit2.length;
        int iMax = Math.max(length, length2);
        int i2 = 0;
        while (i2 < iMax) {
            if (i2 < length) {
                try {
                    i = Integer.parseInt(strArrSplit[i2]);
                } catch (Exception e) {
                    C17766ac.m75936d("BksUtil", " exception : " + e.getMessage());
                    return i2 >= length2;
                }
            } else {
                i = 0;
            }
            int i3 = i2 < length2 ? Integer.parseInt(strArrSplit2[i2]) : 0;
            if (i < i3) {
                return false;
            }
            if (i > i3) {
                return true;
            }
            i2++;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private static String m76898c(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.createDeviceProtectedStorageContext().getFilesDir());
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, File.separator, "aegis");
    }

    /* JADX INFO: renamed from: c */
    private static byte[] m76900c(Context context, String str) {
        PackageInfo packageInfo;
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (packageInfo = packageManager.getPackageInfo(str, 64)) != null) {
                    return packageInfo.signatures[0].toByteArray();
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("BksUtil", "PackageManager.NameNotFoundException : " + e.getMessage());
            } catch (Exception e2) {
                Log.e("BksUtil", "get pm exception : " + e2.getMessage());
            }
            return new byte[0];
        }
        Log.e("BksUtil", "packageName is null or context is null");
        return new byte[0];
    }

    /* JADX INFO: renamed from: b */
    private static boolean m76896b(Context context, String str) {
        return "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539".equalsIgnoreCase(m76891a(m76900c(context, str)));
    }

    /* JADX INFO: renamed from: b */
    private static String m76895b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private static void m76892a(InputStream inputStream, Context context) throws Throwable {
        FileOutputStream fileOutputStream;
        if (inputStream == null || context == null) {
            return;
        }
        String strM76898c = m76898c(context);
        if (!new File(strM76898c).exists()) {
            m76889a(strM76898c);
        }
        File file = new File(strM76898c, "hmsrootcas.bks");
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                C17766ac.m75934b("BksUtil", "write output stream ");
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException unused) {
        }
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int i = inputStream.read(bArr, 0, 2048);
                if (i != -1) {
                    fileOutputStream.write(bArr, 0, i);
                } else {
                    AbstractC17765ab.m75931a((OutputStream) fileOutputStream);
                    return;
                }
            }
        } catch (IOException unused2) {
            fileOutputStream2 = fileOutputStream;
            C17766ac.m75936d("BksUtil", " IOException");
            AbstractC17765ab.m75931a((OutputStream) fileOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            AbstractC17765ab.m75931a((OutputStream) fileOutputStream2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m76893a(Context context, String str) {
        byte[] bArrM76900c = m76900c(context, str);
        for (String str2 : f53489b) {
            if (str2.equalsIgnoreCase(m76891a(bArrM76900c))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static String m76891a(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                return m76895b(MessageDigest.getInstance(KeyUtil.HMAC_KEY_HASH_ALGORITHM).digest(bArr));
            } catch (NoSuchAlgorithmException e) {
                Log.e("BksUtil", "NoSuchAlgorithmException" + e.getMessage());
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    private static int m76889a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        File file = new File(str);
        if (file.exists()) {
            C17766ac.m75935c("BksUtil", "The directory  has already exists");
            return 1;
        }
        if (file.mkdirs()) {
            C17766ac.m75933a("BksUtil", "create directory  success");
            return 0;
        }
        C17766ac.m75936d("BksUtil", "create directory  failed");
        return -1;
    }
}
