package com.huawei.hms.hatool;

import com.alibaba.sdk.android.oss.internal.OooO00o;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import o00OO0o0.C24998OooO0O0;
import o00OO0o0.C24999OooO0OO;
import o0O00o0o.C25846OooO00o;

/* JADX INFO: renamed from: com.huawei.hms.hatool.c0 */
/* JADX INFO: loaded from: classes8.dex */
public class C17974c0 {

    /* JADX INFO: renamed from: a */
    public String f53767a = AbstractC17970b.m77230i().getFilesDir().getPath();

    /* JADX INFO: renamed from: d */
    public static boolean m77258d() {
        return m77257b(new File(AbstractC17970b.m77230i().getFilesDir().getPath() + "/hms"));
    }

    /* JADX INFO: renamed from: a */
    public final String m77260a(String str) {
        return this.f53767a + "/hms/component/".replace("component", str);
    }

    /* JADX INFO: renamed from: b */
    public final String m77264b(String str) throws Throwable {
        File file = new File(m77260a(str), OooO00o.OooO00o("hianalytics_", str));
        if (m77262a(file)) {
            return C18021t0.m77531a(file);
        }
        String strOooO0O0 = C25846OooO00o.OooO0O0(128);
        C18021t0.m77534a(file, strOooO0O0);
        return strOooO0O0;
    }

    /* JADX INFO: renamed from: c */
    public final String m77266c() {
        return "f6040d0e807aaec325ecf44823765544e92905158169f694b282bf17388632cf95a83bae7d2d235c1f039b0df1dcca5fda619b6f7f459f2ff8d70ddb7b601592fe29fcae58c028f319b3b12495e67aa5390942a997a8cb572c8030b2df5c2b622608bea02b0c3e5d4dff3f72c9e3204049a45c0760cd3604af8d57f0e0c693cc";
    }

    /* JADX INFO: renamed from: a */
    public final void m77261a(String str, String str2) throws Throwable {
        File file = new File(m77260a(str));
        File file2 = new File(m77260a(str), OooO00o.OooO00o("hianalytics_", str));
        if (!file.exists() && file.mkdirs()) {
            C18030y.m77586c("hmsSdk", "file directory is mkdirs");
        }
        if (m77262a(file2)) {
            C18021t0.m77534a(file2, str2);
        } else {
            C18030y.m77591f("hmsSdk", "refreshComponent():file is not found,and file is create failed");
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m77265b() {
        long jM77328a = C17986g0.m77328a(AbstractC17970b.m77230i(), "Privacy_MY", "assemblyFlash", -1L);
        if (-1 != jM77328a) {
            return System.currentTimeMillis() - jM77328a > 31536000000L;
        }
        C18030y.m77586c("hmsSdk", "First init components");
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m77257b(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0) {
            return false;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isFile()) {
                if (!file2.delete()) {
                    C18030y.m77586c("hmsSdk", "delete file failed : " + file2.getName());
                }
            } else if (file2.isDirectory()) {
                m77257b(file2);
            }
        }
        return file.delete();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m77262a(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            C18030y.m77591f("hmsSdk", "create new file error!");
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final char[] m77263a(String str, String str2, String str3, String str4) {
        byte[] bArrOooO0o0 = C24998OooO0O0.OooO0o0(str);
        byte[] bArrOooO0o02 = C24998OooO0O0.OooO0o0(str2);
        byte[] bArrOooO0o03 = C24998OooO0O0.OooO0o0(str3);
        byte[] bArrOooO0o04 = C24998OooO0O0.OooO0o0(str4);
        int length = bArrOooO0o0.length;
        if (length > bArrOooO0o02.length) {
            length = bArrOooO0o02.length;
        }
        if (length > bArrOooO0o03.length) {
            length = bArrOooO0o03.length;
        }
        if (length > bArrOooO0o04.length) {
            length = bArrOooO0o04.length;
        }
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) (((bArrOooO0o0[i] ^ bArrOooO0o02[i]) ^ bArrOooO0o03[i]) ^ bArrOooO0o04[i]);
        }
        return cArr;
    }

    /* JADX INFO: renamed from: a */
    public String m77259a() throws Throwable {
        String strM77264b;
        String strM77264b2;
        String strM77264b3;
        String strM77264b4;
        byte[] encoded;
        String strM77266c = m77266c();
        if (m77265b()) {
            C18030y.m77586c("hmsSdk", "refresh components");
            strM77264b = C25846OooO00o.OooO0O0(128);
            m77261a("aprpap", strM77264b);
            strM77264b2 = C25846OooO00o.OooO0O0(128);
            m77261a("febdoc", strM77264b2);
            strM77264b3 = C25846OooO00o.OooO0O0(128);
            m77261a("marfil", strM77264b3);
            strM77264b4 = C25846OooO00o.OooO0O0(128);
            m77261a("maywnj", strM77264b4);
            C17986g0.m77333b(AbstractC17970b.m77230i(), "Privacy_MY", "assemblyFlash", System.currentTimeMillis());
        } else {
            strM77264b = m77264b("aprpap");
            strM77264b2 = m77264b("febdoc");
            strM77264b3 = m77264b("marfil");
            strM77264b4 = m77264b("maywnj");
        }
        try {
            encoded = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(m77263a(strM77264b, strM77264b2, strM77264b3, strM77266c), C24998OooO0O0.OooO0o0(strM77264b4), 10000, 16)).getEncoded();
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            C24999OooO0OO.OooO0O0("PBKDF2", "pbkdf exception : " + e.getMessage());
            encoded = new byte[0];
        }
        return C24998OooO0O0.OooO0OO(encoded);
    }
}
