package o00O0ooo;

import OooOoo.C20593OooO0Oo;
import com.airbnb.lottie.C22139OooO0Oo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: o00O0ooo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24979OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C22139OooO0Oo f84710OooO00o;

    public C24979OooO0Oo(C22139OooO0Oo c22139OooO0Oo) {
        this.f84710OooO00o = c22139OooO0Oo;
    }

    public static String OooO00o(String str, EnumC24978OooO0OO enumC24978OooO0OO, boolean z) {
        String strConcat = enumC24978OooO0OO.f84709OooOo0o;
        if (z) {
            strConcat = ".temp".concat(strConcat);
        }
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strConcat.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    sb.append(String.format("%02x", Byte.valueOf(b)));
                }
                strReplaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return C20593OooO0Oo.OooO0O0("lottie_cache_", strReplaceAll, strConcat);
    }

    public final File OooO0O0() {
        C22139OooO0Oo c22139OooO0Oo = this.f84710OooO00o;
        c22139OooO0Oo.getClass();
        File file = new File(c22139OooO0Oo.f66762OooO00o.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File OooO0OO(String str, InputStream inputStream, EnumC24978OooO0OO enumC24978OooO0OO) throws IOException {
        File file = new File(OooO0O0(), OooO00o(str, enumC24978OooO0OO, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }
}
