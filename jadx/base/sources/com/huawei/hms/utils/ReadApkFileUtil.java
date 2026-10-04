package com.huawei.hms.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.content.OooO0OO;
import com.huawei.hms.network.embedded.C18241k5;
import com.huawei.hms.support.log.HMSLog;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes9.dex */
public class ReadApkFileUtil {
    public static final String EMUI10_PK = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAx4nUogUyMCmzHhaEb420yvpw9zBs+ETzE9Qm77bGxl1Iml9JEkBkNTsUWOstLgUBajNhV+BAMVBHKMEdzoQbL5kIHkTgUVM65yewd+5+BhrcB9OQ3LHp+0BN6aLKZh71T4WvsvHFhfhQpShuGWkRkSaVGLFTHxX70kpWLzeZ3RtqiEUNIufPR2SFCH6EmecJ+HdkmBOh603IblCpGxwSWse0fDI98wZBEmV88RFaiYEgyiezLlWvXzqIj6I/xuyd5nGAegjH2y3cmoDE6CubecoB1jf4KdgACXgdiQ4Oc63MfLGTor3l6RCqeUk4APAMtyhK83jc72W1sdXMd/sj2wIDAQAB";
    public static final String EMUI11_PK = "MIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIBigKCAYEAqq2eRTMYr2JHLtvuZzfgPrgU8oatD4Rar9fOD7E00es2VhtB3vTyaT2BvYPUPA/nbkHRPak3EZX77CfWj9tzLgSHJE8XLk9C+2ESkdrxCDA6z7I8X+cBDnA05OlCJeZFjnUbjYB8SP8M3BttdrvqtVPxTkEJhchC7UXnMLaJ3kQ3ZPjN7ubjYzO4rv7EtEpqr2bX+qjnSLIZZuUXraxqfdBuhGDIYq62dNsqiyrhX1mfvA3+43N4ZIs3BdfSYII8BNFmFxf+gyf1aoq386R2kAjHcrfOOhjAbZh+R1OAGLWPCqi3E9nB8EsZkeoTW/oIP6pJvgL3bnxq+1viT2dmZyipMgcx/3N6FJqkd67j/sPMtPlHJuq8/s0silzs13jAw1WBV6tWHFkLGpkWGs8jp50wQtndtY8cCPl2XPGmdPN72agH+zsHuKqr/HOB2TuzzaO8rKlGIDQlzZcCSHB28nnvOyBVN9xzLkbYiLnHfd6bTwzNPeqjWrTnPwKyH3BPAgMBAAE=";
    public static final String KEY_SIGNATURE = "Signature:";
    public static final String KEY_SIGNATURE2 = "Signature2:";
    public static final String KEY_SIGNATURE3 = "Signature3:";

    /* JADX INFO: renamed from: a */
    public static final String f57030a = "ReadApkFileUtil";

    /* JADX INFO: renamed from: b */
    public static String f57031b;

    /* JADX INFO: renamed from: c */
    public static String f57032c;

    /* JADX INFO: renamed from: d */
    public static String f57033d;

    /* JADX INFO: renamed from: e */
    public static String f57034e;

    /* JADX INFO: renamed from: f */
    public static String f57035f;

    /* JADX INFO: renamed from: a */
    public static byte[] m80232a(ZipFile zipFile) {
        return m80233a(zipFile, "META-INF/MANIFEST.MF");
    }

    /* JADX INFO: renamed from: b */
    public static void m80234b(byte[] bArr) throws Throwable {
        Throwable th;
        ByteArrayInputStream byteArrayInputStream;
        BufferedReader bufferedReader;
        if (bArr == null) {
            HMSLog.m80172e(f57030a, "manifest is null！");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader2 = null;
        f57031b = null;
        f57032c = null;
        f57033d = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(byteArrayInputStream, StandardCharsets.UTF_8));
            } catch (Exception unused) {
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                String strM80224a = m80224a(bufferedReader);
                while (strM80224a != null) {
                    if (strM80224a.length() != 0) {
                        if (strM80224a.startsWith("ApkHash:")) {
                            f57034e = m80225a(strM80224a.substring(strM80224a.indexOf(C18241k5.f55433h) + 1));
                        }
                        if (strM80224a.startsWith(KEY_SIGNATURE)) {
                            f57031b = m80225a(strM80224a.substring(strM80224a.indexOf(C18241k5.f55433h) + 1));
                            strM80224a = m80224a(bufferedReader);
                        } else if (strM80224a.startsWith(KEY_SIGNATURE2)) {
                            f57032c = m80225a(strM80224a.substring(strM80224a.indexOf(C18241k5.f55433h) + 1));
                            strM80224a = m80224a(bufferedReader);
                        } else if (strM80224a.startsWith(KEY_SIGNATURE3)) {
                            f57033d = m80225a(strM80224a.substring(strM80224a.indexOf(C18241k5.f55433h) + 1));
                            strM80224a = m80224a(bufferedReader);
                        } else {
                            stringBuffer.append(strM80224a);
                            stringBuffer.append(com.orion.notein.richeditor.utils.p606io.IOUtils.LINE_SEPARATOR_WINDOWS);
                        }
                    }
                    strM80224a = m80224a(bufferedReader);
                }
                f57035f = stringBuffer.toString();
            } catch (Exception unused2) {
                bufferedReader2 = bufferedReader;
                try {
                    HMSLog.m80172e(f57030a, "loadApkCert Exception!");
                    bufferedReader = bufferedReader2;
                } catch (Throwable th3) {
                    th = th3;
                    IOUtils.closeQuietly((InputStream) byteArrayInputStream);
                    IOUtils.closeQuietly((Reader) bufferedReader2);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedReader2 = bufferedReader;
                IOUtils.closeQuietly((InputStream) byteArrayInputStream);
                IOUtils.closeQuietly((Reader) bufferedReader2);
                throw th;
            }
        } catch (Exception unused3) {
            byteArrayInputStream = null;
        } catch (Throwable th5) {
            th = th5;
            byteArrayInputStream = null;
        }
        IOUtils.closeQuietly((InputStream) byteArrayInputStream);
        IOUtils.closeQuietly((Reader) bufferedReader);
    }

    public static String bytesToString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            cArr2[i2] = cArr[(b & 255) >>> 4];
            cArr2[i2 + 1] = cArr[b & 15];
        }
        return String.valueOf(cArr2);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m80237c() {
        try {
        } catch (Exception e) {
            HMSLog.m80174i(f57030a, "verifyMDMSignatureV3 MDM verify Exception!:" + e.getMessage());
        }
        if (m80229a(Base64.decode(EMUI11_PK, 0), m80230a(f57035f, "SHA-384"), m80236b(f57033d), "SHA384withRSA")) {
            HMSLog.m80174i(f57030a, "verifyMDMSignatureV3 verify successful!");
            return true;
        }
        HMSLog.m80174i(f57030a, "verifyMDMSignatureV3 verify failure!");
        return false;
    }

    public static boolean checkSignature() {
        if (f57033d != null) {
            return m80237c();
        }
        if (f57032c != null) {
            return m80235b();
        }
        if (f57031b != null) {
            return m80227a();
        }
        return false;
    }

    public static String getHmsPath(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo("com.huawei.hwid", 128).sourceDir;
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.m80172e(f57030a, "HMS is not found!");
            return null;
        }
    }

    public static boolean isCertFound(String str) throws Throwable {
        ZipFile zipFile;
        boolean z = false;
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            boolean z2 = zipFile.getEntry("META-INF/HUAWEI.CER") != null;
            if (z2) {
                m80234b(m80233a(zipFile, "META-INF/HUAWEI.CER"));
            }
            try {
                zipFile.close();
            } catch (IOException e2) {
                HMSLog.m80172e(f57030a, "zipFile.close Exception!" + e2.getMessage());
            }
            z = z2;
        } catch (Exception e3) {
            e = e3;
            zipFile2 = zipFile;
            HMSLog.m80172e(f57030a, "isCertFound Exception!" + e.getMessage());
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException e4) {
                    HMSLog.m80172e(f57030a, "zipFile.close Exception!" + e4.getMessage());
                }
            }
        } catch (Throwable th2) {
            th = th2;
            zipFile2 = zipFile;
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException e5) {
                    HMSLog.m80172e(f57030a, "zipFile.close Exception!" + e5.getMessage());
                }
            }
            throw th;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean verifyApkHash(String str) throws Throwable {
        ZipFile zipFile;
        ?? sb = 0;
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            byte[] bArrM80232a = m80232a(zipFile);
            ArrayList<String> arrayListM80226a = m80226a(bArrM80232a);
            if (arrayListM80226a != null) {
                bArrM80232a = m80231a(arrayListM80226a);
            }
            MessageDigest messageDigest = MessageDigest.getInstance(KeyUtil.HMAC_KEY_HASH_ALGORITHM);
            messageDigest.update(bArrM80232a);
            String strBytesToString = bytesToString(messageDigest.digest());
            String str2 = f57034e;
            if (str2 != null) {
                if (str2.equals(strBytesToString)) {
                    try {
                        zipFile.close();
                        return true;
                    } catch (Exception e2) {
                        HMSLog.m80174i(f57030a, "close stream Exception!" + e2.getMessage());
                        return true;
                    }
                }
            }
            try {
                zipFile.close();
                return false;
            } catch (Exception e3) {
                HMSLog.m80174i(f57030a, "close stream Exception!" + e3.getMessage());
                return false;
            }
        } catch (Exception e4) {
            e = e4;
            zipFile2 = zipFile;
            HMSLog.m80174i(f57030a, "verifyApkHash Exception!" + e.getMessage());
            if (zipFile2 == null) {
                return false;
            }
            try {
                zipFile2.close();
                return false;
            } catch (Exception e5) {
                String str3 = f57030a;
                sb = new StringBuilder("close stream Exception!");
                sb.append(e5.getMessage());
                HMSLog.m80174i(str3, sb.toString());
                return false;
            }
            if (sb != 0) {
                try {
                    sb.close();
                } catch (Exception e6) {
                    HMSLog.m80174i(f57030a, "close stream Exception!" + e6.getMessage());
                }
            }
            throw th;
        } catch (Throwable th2) {
            th = th2;
            sb = zipFile;
            if (sb != 0) {
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.BufferedOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX INFO: renamed from: a */
    public static byte[] m80233a(ZipFile zipFile, String str) throws Throwable {
        Throwable th;
        InputStream inputStream;
        Exception e;
        Throwable th2;
        BufferedInputStream bufferedInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ?? bufferedOutputStream;
        byte[] bArr;
        ZipEntry entry = zipFile.getEntry(str);
        ?? r0 = 0;
        r0 = 0;
        r0 = 0;
        if (entry == null) {
            return null;
        }
        try {
            inputStream = zipFile.getInputStream(entry);
            if (inputStream == null) {
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((InputStream) null);
                IOUtils.closeQuietly((OutputStream) null);
                IOUtils.closeQuietly((OutputStream) null);
                return null;
            }
            try {
                bufferedInputStream = new BufferedInputStream(inputStream);
                try {
                    bArr = new byte[4096];
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (Exception e2) {
                    e = e2;
                    byteArrayOutputStream = null;
                    bufferedOutputStream = byteArrayOutputStream;
                    HMSLog.m80174i(f57030a, "getManifestBytes Exception!" + e.getMessage());
                    IOUtils.closeQuietly(inputStream);
                    IOUtils.closeQuietly((InputStream) bufferedInputStream);
                    IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                    IOUtils.closeQuietly((OutputStream) bufferedOutputStream);
                    return null;
                } catch (Throwable th3) {
                    th2 = th3;
                    byteArrayOutputStream = null;
                }
            } catch (Exception e3) {
                e = e3;
                bufferedInputStream = null;
                byteArrayOutputStream = null;
                bufferedOutputStream = byteArrayOutputStream;
                HMSLog.m80174i(f57030a, "getManifestBytes Exception!" + e.getMessage());
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((InputStream) bufferedInputStream);
                IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                IOUtils.closeQuietly((OutputStream) bufferedOutputStream);
                return null;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                bufferedInputStream = null;
                byteArrayOutputStream = null;
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((InputStream) bufferedInputStream);
                IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                IOUtils.closeQuietly((OutputStream) r0);
                throw th2;
            }
            try {
                bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream);
                try {
                    try {
                        for (int i = bufferedInputStream.read(bArr, 0, 4096); i > 0; i = bufferedInputStream.read(bArr, 0, 4096)) {
                            bufferedOutputStream.write(bArr, 0, i);
                        }
                        bufferedOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        IOUtils.closeQuietly(inputStream);
                        IOUtils.closeQuietly((InputStream) bufferedInputStream);
                        IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                        IOUtils.closeQuietly((OutputStream) bufferedOutputStream);
                        return byteArray;
                    } catch (Exception e4) {
                        e = e4;
                        bufferedOutputStream = bufferedOutputStream;
                        HMSLog.m80174i(f57030a, "getManifestBytes Exception!" + e.getMessage());
                        IOUtils.closeQuietly(inputStream);
                        IOUtils.closeQuietly((InputStream) bufferedInputStream);
                        IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                        IOUtils.closeQuietly((OutputStream) bufferedOutputStream);
                        return null;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    r0 = bufferedOutputStream;
                    IOUtils.closeQuietly(inputStream);
                    IOUtils.closeQuietly((InputStream) bufferedInputStream);
                    IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                    IOUtils.closeQuietly((OutputStream) r0);
                    throw th2;
                }
            } catch (Exception e5) {
                e = e5;
                bufferedOutputStream = 0;
            } catch (Throwable th6) {
                th2 = th6;
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((InputStream) bufferedInputStream);
                IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                IOUtils.closeQuietly((OutputStream) r0);
                throw th2;
            }
        } catch (Exception e6) {
            e = e6;
            inputStream = null;
        } catch (Throwable th7) {
            th = th7;
            inputStream = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList<String> m80226a(byte[] bArr) {
        if (bArr == null) {
            HMSLog.m80172e(f57030a, "manifest is null！");
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(byteArrayInputStream, StandardCharsets.UTF_8));
                try {
                    if (m80228a(bufferedReader, arrayList)) {
                        bufferedReader.close();
                        byteArrayInputStream.close();
                        return arrayList;
                    }
                    bufferedReader.close();
                    byteArrayInputStream.close();
                    return null;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            HMSLog.m80172e(f57030a, "getManifestLinesArrary IOException!");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m80235b() {
        try {
        } catch (Exception e) {
            HMSLog.m80174i(f57030a, "verifyMDMSignatureV2 MDM verify Exception!:" + e.getMessage());
        }
        if (m80229a(Base64.decode(EMUI10_PK, 0), m80230a(f57035f, KeyUtil.HMAC_KEY_HASH_ALGORITHM), m80236b(f57032c), "SHA256withRSA")) {
            HMSLog.m80174i(f57030a, "verifyMDMSignatureV2 verify successful!");
            return true;
        }
        HMSLog.m80174i(f57030a, "verifyMDMSignatureV2 verify failure!");
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m80236b(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        int length = str.length();
        if (length % 2 == 0) {
            i = length / 2;
        } else {
            i = (length / 2) + 1;
        }
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < length; i2 += 2) {
            int i3 = i2 + 1;
            if (i3 < length) {
                bArr[i2 / 2] = (byte) (Character.digit(str.charAt(i3), 16) + (Character.digit(str.charAt(i2), 16) << 4));
            } else {
                bArr[i2 / 2] = (byte) (Character.digit(str.charAt(i2), 16) << 4);
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m80231a(ArrayList<String> arrayList) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, StandardCharsets.UTF_8));
        try {
            try {
                Collections.sort(arrayList);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    String str = arrayList.get(i);
                    bufferedWriter.write(str, 0, str.length());
                    bufferedWriter.write(com.orion.notein.richeditor.utils.p606io.IOUtils.LINE_SEPARATOR_WINDOWS, 0, 2);
                }
                bufferedWriter.flush();
            } catch (Exception e) {
                HMSLog.m80174i(f57030a, "getManifestBytesbySorted Exception!" + e.getMessage());
            }
            IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
            IOUtils.closeQuietly((Writer) bufferedWriter);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
            IOUtils.closeQuietly((Writer) bufferedWriter);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m80228a(BufferedReader bufferedReader, ArrayList<String> arrayList) throws IOException {
        String strM80224a = m80224a(bufferedReader);
        boolean z = false;
        while (strM80224a != null) {
            if (strM80224a.equals("Name: META-INF/HUAWEI.CER")) {
                String strM80224a2 = m80224a(bufferedReader);
                while (true) {
                    if (strM80224a2 == null) {
                        break;
                    }
                    if (strM80224a2.startsWith("Name:")) {
                        strM80224a = strM80224a2;
                        break;
                    }
                    strM80224a2 = m80224a(bufferedReader);
                }
                z = true;
            }
            if (strM80224a.length() != 0) {
                arrayList.add(strM80224a);
            }
            strM80224a = m80224a(bufferedReader);
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public static String m80224a(BufferedReader bufferedReader) throws IOException {
        int i;
        if (bufferedReader == null || (i = bufferedReader.read()) == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder(10);
        while (i != -1) {
            char c = (char) i;
            if (c == '\n') {
                break;
            }
            if (sb.length() < 4096) {
                sb.append(c);
                i = bufferedReader.read();
            } else {
                throw new IOException("cert line is too long!");
            }
        }
        String string = sb.toString();
        return (string.isEmpty() || !string.endsWith("\r")) ? string : OooO0OO.OooO00o(1, 0, string);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m80227a() {
        try {
            if (m80229a(m80236b("30820122300d06092a864886f70d01010105000382010f003082010a0282010100a3d269348ac59923f65e8111c337605e29a1d1bc54fa96c1445050dd14d8d63b10f9f0230bb87ef348183660bedcabfdec045e235ed96935799fcdb4af5c97717ff3b0954eaf1b723225b3a00f81cbd67ce6dc5a4c07f7741ad3bf1913a480c6e267ab1740f409edd2dc33c8b718a8e30e56d9a93f321723c1d0c9ea62115f996812ceef186954595e39a19b74245542c407f7dddb1d12e6eedcfc0bd7cd945ef7255ad0fc9e796258e0fb5e52a23013d15033a32b4071b65f3f924ae5c5761e22327b4d2ae60f4158a5eb15565ba079de29b81540f5fbb3be101a95357f367fc661d797074ff3826950029c52223e4594673a24a334cae62d63b838ba3df9770203010001"), m80230a(f57035f, KeyUtil.HMAC_KEY_HASH_ALGORITHM), m80236b(f57031b), "SHA256withRSA")) {
                HMSLog.m80174i(f57030a, "verifyMDMSignatureV1 verify successful!");
                return true;
            }
            HMSLog.m80174i(f57030a, "verifyMDMSignatureV1 verify failure!");
            return false;
        } catch (Exception e) {
            HMSLog.m80174i(f57030a, "verifyMDMSignatureV1 MDM verify Exception!:" + e.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m80229a(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) throws Exception {
        Signature signature = Signature.getInstance(str);
        signature.initVerify(KeyFactory.getInstance(AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA).generatePublic(new X509EncodedKeySpec(bArr)));
        signature.update(bArr2);
        return signature.verify(bArr3);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m80230a(String str, String str2) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        messageDigest.update(str.getBytes(StandardCharsets.UTF_8.name()));
        return messageDigest.digest();
    }

    /* JADX INFO: renamed from: a */
    public static String m80225a(String str) {
        return str != null ? Pattern.compile("\\s*|\t|\r|\n").matcher(str).replaceAll("") : "";
    }
}
