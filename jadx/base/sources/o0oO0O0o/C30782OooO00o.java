package o0oO0O0o;

import OooOOO0.AbstractC20449OooO0Oo;
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
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import o0O0oooO.o00oO0O;

/* JADX INFO: renamed from: o0oO0O0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C30782OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Uri f110064OooO00o = Uri.parse("content://com.huawei.hwid");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String[] f110065OooO0O0 = {"B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05", "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539"};

    /* JADX WARN: Can't wrap try/catch for region: R(18:21|(1:(2:23|(2:80|25)(1:26))(3:79|27|(3:29|30|31)(0)))|72|32|76|33|34|74|35|(8:36|(1:38)(1:81)|61|62|63|64|65|66)|43|78|44|(1:52)(1:49)|53|64|65|66) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ee, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0116, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0118, code lost:
    
        r4 = r2;
        r2 = r4;
        r3 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized FileInputStream OooO(Context context) {
        Object obj;
        ?? r0;
        ByteArrayInputStream byteArrayInputStream;
        ?? r02;
        ByteArrayInputStream byteArrayInputStream2;
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        InputStream inputStreamOpenInputStream;
        byte[] bArr;
        try {
            o00OOOo.OooO0OO.OooO0Oo("BksUtil", "get bks from tss begin");
            if (context != null) {
                o00oO0O.OooO00o(context);
            }
            Context context2 = o00oO0O.f90432OooO0OO;
            Object obj2 = null;
            byteArrayInputStream = null;
            ByteArrayInputStream byteArrayInputStream3 = null;
            if (context2 == null) {
                o00OOOo.OooO0OO.OooO0OO("BksUtil", "context is null");
                return null;
            }
            if (!OooO0o(C30784OooO0OO.OooO00o("com.huawei.hwid")) && !OooO0o(C30784OooO0OO.OooO00o(PackageConstants.SERVICES_PACKAGE_ALL_SCENE))) {
                o00OOOo.OooO0OO.OooO0OO("BksUtil", "hms version code is too low : " + C30784OooO0OO.OooO00o("com.huawei.hwid"));
                return null;
            }
            byte[] bArrOooO0Oo = OooO0Oo(context2, "com.huawei.hwid");
            String[] strArr = f110065OooO0O0;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    boolean zEqualsIgnoreCase = "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539".equalsIgnoreCase(OooO0oO(OooO0Oo(context2, PackageConstants.SERVICES_PACKAGE_ALL_SCENE)));
                    r0 = zEqualsIgnoreCase;
                    obj = "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539";
                    if (!zEqualsIgnoreCase) {
                        o00OOOo.OooO0OO.OooO0OO("BksUtil", "hms sign error");
                        return null;
                    }
                } else {
                    if (strArr[i].equalsIgnoreCase(OooO0oO(bArrOooO0Oo))) {
                        r0 = bArrOooO0Oo;
                        obj = strArr;
                        break;
                    }
                    i++;
                }
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th) {
                th = th;
                Object obj3 = obj;
                byteArrayInputStream = null;
                obj2 = obj3;
                r02 = r0;
            }
            try {
                inputStreamOpenInputStream = context2.getContentResolver().openInputStream(Uri.withAppendedPath(f110064OooO00o, "files/hmsrootcas.bks"));
                try {
                    bArr = new byte[1024];
                } catch (Exception e) {
                    e = e;
                    inputStream = inputStreamOpenInputStream;
                }
            } catch (Exception e2) {
                e = e2;
                inputStream = null;
            } catch (Throwable th2) {
                th = th2;
                byteArrayInputStream = null;
                r02 = byteArrayOutputStream;
                byteArrayInputStream2 = byteArrayInputStream;
                ?? r3 = obj2;
                ?? r03 = r02;
                AbstractC20449OooO0Oo.OooO0o(r3);
                AbstractC20449OooO0Oo.OooO0o(r03);
                AbstractC20449OooO0Oo.OooO0o(byteArrayInputStream2);
                throw th;
            }
            while (true) {
                int i2 = inputStreamOpenInputStream.read(bArr);
                if (i2 <= -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
                o00OOOo.OooO0OO.OooO0OO("BksUtil", "Get bks from HMS_VERSION_CODE exception : No content provider" + e.getMessage());
                AbstractC20449OooO0Oo.OooO0o(inputStream);
                AbstractC20449OooO0Oo.OooO0o(byteArrayOutputStream);
                AbstractC20449OooO0Oo.OooO0o(byteArrayInputStream3);
                return OooOO0(context2);
            }
            byteArrayOutputStream.flush();
            byteArrayInputStream2 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            String string = C30785OooO0Oo.OooO00o(context2).getString("bks_hash", "");
            String strOooO0o0 = OooO0o0(byteArrayOutputStream.toByteArray());
            if (OooO0oo(context2) && string.equals(strOooO0o0)) {
                o00OOOo.OooO0OO.OooO0Oo("BksUtil", "bks not update");
            } else {
                o00OOOo.OooO0OO.OooO0Oo("BksUtil", "update bks and sp");
                OooO0OO(byteArrayInputStream2, context2);
                C30785OooO0Oo.OooO00o(context2).edit().putString("bks_hash", strOooO0o0).apply();
            }
            AbstractC20449OooO0Oo.OooO0o(inputStreamOpenInputStream);
            AbstractC20449OooO0Oo.OooO0o(byteArrayOutputStream);
            AbstractC20449OooO0Oo.OooO0o(byteArrayInputStream2);
            return OooOO0(context2);
        } finally {
        }
    }

    public static String OooO00o(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.createDeviceProtectedStorageContext().getFilesDir());
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, File.separator, "aegis");
    }

    public static String OooO0O0(byte[] bArr) {
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

    public static void OooO0OO(ByteArrayInputStream byteArrayInputStream, Context context) throws Throwable {
        FileOutputStream fileOutputStream;
        String strOooO00o = OooO00o(context);
        if (!new File(strOooO00o).exists() && !TextUtils.isEmpty(strOooO00o)) {
            File file = new File(strOooO00o);
            if (file.exists()) {
                Log.w(o00OOOo.OooO0OO.OooO00o("BksUtil"), "The directory  has already exists");
            } else if (!file.mkdirs()) {
                o00OOOo.OooO0OO.OooO0OO("BksUtil", "create directory  failed");
            }
        }
        File file2 = new File(strOooO00o, "hmsrootcas.bks");
        if (file2.exists()) {
            file2.delete();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                o00OOOo.OooO0OO.OooO0Oo("BksUtil", "write output stream ");
                fileOutputStream = new FileOutputStream(file2);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException unused) {
        }
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int i = byteArrayInputStream.read(bArr, 0, 2048);
                if (i == -1) {
                    AbstractC20449OooO0Oo.OooO0o(fileOutputStream);
                    return;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (IOException unused2) {
            fileOutputStream2 = fileOutputStream;
            o00OOOo.OooO0OO.OooO0OO("BksUtil", " IOException");
            AbstractC20449OooO0Oo.OooO0o(fileOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            AbstractC20449OooO0Oo.OooO0o(fileOutputStream2);
            throw th;
        }
    }

    public static byte[] OooO0Oo(Context context, String str) {
        PackageInfo packageInfo;
        if (TextUtils.isEmpty(str)) {
            Log.e("BksUtil", "packageName is null or context is null");
            return new byte[0];
        }
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

    public static boolean OooO0o(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        o00OOOo.OooO0OO.OooO0Oo("BksUtil", "hms version code is : " + str);
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
                    o00OOOo.OooO0OO.OooO0OO("BksUtil", " exception : " + e.getMessage());
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

    public static String OooO0o0(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(KeyUtil.HMAC_KEY_HASH_ALGORITHM);
            messageDigest.update(bArr);
            return OooO0O0(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            o00OOOo.OooO0OO.OooO0OO("BksUtil", "inputstraem exception");
            return "";
        }
    }

    public static String OooO0oO(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                return OooO0O0(MessageDigest.getInstance(KeyUtil.HMAC_KEY_HASH_ALGORITHM).digest(bArr));
            } catch (NoSuchAlgorithmException e) {
                Log.e("BksUtil", "NoSuchAlgorithmException" + e.getMessage());
            }
        }
        return "";
    }

    public static boolean OooO0oo(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(OooO00o(context));
        return new File(androidx.concurrent.futures.OooO00o.OooO0OO(sb, File.separator, "hmsrootcas.bks")).exists();
    }

    public static FileInputStream OooOO0(Context context) {
        if (!OooO0oo(context)) {
            return null;
        }
        o00OOOo.OooO0OO.OooO0Oo("BksUtil", "getFilesBksIS ");
        try {
            return new FileInputStream(OooO00o(context) + File.separator + "hmsrootcas.bks");
        } catch (FileNotFoundException unused) {
            o00OOOo.OooO0OO.OooO0OO("BksUtil", "FileNotFoundExceptio: ");
            return null;
        }
    }
}
