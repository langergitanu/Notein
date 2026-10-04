package o0oo000O;

import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.aspose.slides.C22218Oooo;
import com.aspose.slides.C22226Oooo0oo;
import com.huawei.hms.network.embedded.C18101a5;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* JADX INFO: renamed from: o0oo000O.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31190OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f111228OooO00o = 0;

    /* JADX INFO: renamed from: o0oo000O.OooO0oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long[] f111229OooO00o = new long[3];

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f111230OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f111231OooO0OO;
    }

    static {
        System.getProperty(C18101a5.f54156e);
    }

    public static void OooO(File file) {
        OooOO0O(file, new C31188OooO0o0());
    }

    public static boolean OooO00o(File file, File file2) {
        if (file == null) {
            return false;
        }
        return file.isDirectory() ? OooO0Oo(file, file2) : OooO0o0(file, file2);
    }

    public static boolean OooO0O0(Context context, Uri uri, File file) {
        OooO0oO(file);
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(inputStreamOpenInputStream);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file.getAbsolutePath());
                    try {
                        WritableByteChannel writableByteChannelNewChannel = Channels.newChannel(fileOutputStream);
                        try {
                            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(16384);
                            while (readableByteChannelNewChannel.read(byteBufferAllocateDirect) != -1) {
                                byteBufferAllocateDirect.flip();
                                writableByteChannelNewChannel.write(byteBufferAllocateDirect);
                                byteBufferAllocateDirect.compact();
                            }
                            byteBufferAllocateDirect.flip();
                            while (byteBufferAllocateDirect.hasRemaining()) {
                                writableByteChannelNewChannel.write(byteBufferAllocateDirect);
                            }
                            if (writableByteChannelNewChannel != null) {
                                writableByteChannelNewChannel.close();
                            }
                            fileOutputStream.close();
                            readableByteChannelNewChannel.close();
                            if (inputStreamOpenInputStream != null) {
                                inputStreamOpenInputStream.close();
                            }
                            return true;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean OooO0OO(ContextWrapper contextWrapper, File file, Uri uri) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                OutputStream outputStreamOpenOutputStream = contextWrapper.getContentResolver().openOutputStream(uri);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        outputStreamOpenOutputStream.write(bArr, 0, i);
                    }
                    if (outputStreamOpenOutputStream != null) {
                        outputStreamOpenOutputStream.close();
                    }
                    fileInputStream.close();
                    return true;
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            Log.e("FileUtils", "copyFile to Uri failed", e);
            return false;
        }
    }

    public static boolean OooO0Oo(File file, File file2) {
        if (file != null && file2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(file.getPath());
            String str = File.separator;
            sb.append(str);
            String string = sb.toString();
            String str2 = file2.getPath() + str;
            if (!str2.contains(string) && file.exists() && file.isDirectory() && OooO0o(file2)) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                    return true;
                }
                for (File file3 : fileArrListFiles) {
                    StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(str2);
                    sbOooO0OO.append(file3.getName());
                    File file4 = new File(sbOooO0OO.toString());
                    if (file3.isFile()) {
                        if (OooO0o0(file3, file4)) {
                        }
                    } else if (!file3.isDirectory() || OooO0Oo(file3, file4)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean OooO0o(File file) {
        if (file != null) {
            return file.exists() ? file.isDirectory() : file.mkdirs();
        }
        return false;
    }

    public static boolean OooO0o0(File file, File file2) {
        if (file != null && file2 != null && !file.equals(file2) && file.exists() && file.isFile() && ((!file2.exists() || file2.delete()) && OooO0o(file2.getParentFile()))) {
            try {
                String absolutePath = file2.getAbsolutePath();
                if (C31186OooO0Oo.OooO0OO(OooOOO0(absolutePath), new FileInputStream(file))) {
                    return true;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean OooO0oO(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!OooO0o(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean OooO0oo(File file) {
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            return OooOO0(file);
        }
        if (file.exists()) {
            return file.isFile() && file.delete();
        }
        return true;
    }

    public static boolean OooOO0(File file) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    if (!file2.delete()) {
                        return false;
                    }
                } else if (file2.isDirectory() && !OooOO0(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static boolean OooOO0O(File file, FileFilter fileFilter) {
        if (file != null) {
            if (!file.exists()) {
                return true;
            }
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                    return true;
                }
                for (File file2 : fileArrListFiles) {
                    if (fileFilter.accept(file2)) {
                        if (file2.isFile()) {
                            if (!file2.delete()) {
                            }
                        } else if (!file2.isDirectory() || OooOO0(file2)) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static byte[] OooOO0o(OooO00o oooO00o) {
        byte[] bArr = new byte[20];
        long[] jArr = oooO00o.f111229OooO00o;
        int length = jArr.length - 1;
        int i = 0;
        while (i < length) {
            long j = jArr[i];
            int i2 = i * 8;
            int i3 = 0;
            while (i3 < 8) {
                int i4 = i2 + i3;
                if (i4 >= 20) {
                    break;
                }
                bArr[i4] = (byte) (j & 255);
                j >>>= 8;
                i3++;
                i = i;
            }
            i++;
        }
        int i5 = length * 8;
        long j2 = jArr[length];
        int i6 = 20 - i5;
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = i5 + i7;
            if (i8 >= 20) {
                break;
            }
            bArr[i8] = (byte) (j2 & 255);
            j2 >>>= 8;
        }
        long j3 = oooO00o.f111230OooO0O0;
        byte[] bArr2 = new byte[8];
        for (int i9 = 0; i9 < 8; i9++) {
            bArr2[i9] = (byte) (j3 & 255);
            j3 >>>= 8;
        }
        for (int i10 = 0; i10 < 8; i10++) {
            int i11 = 12 + i10;
            bArr[i11] = (byte) ((bArr[i11] & 255) ^ (bArr2[i10] & 255));
        }
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0042 A[Catch: IOException -> 0x002a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x002a, blocks: (B:11:0x0026, B:29:0x0042), top: B:39:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String OooOOO(File file) throws Throwable {
        DigestInputStream digestInputStream;
        byte[] bArrDigest = null;
        bArrDigest = null;
        bArrDigest = null;
        DigestInputStream digestInputStream2 = null;
        bArrDigest = null;
        try {
            try {
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (file != null) {
                try {
                    digestInputStream = new DigestInputStream(new FileInputStream(file), MessageDigest.getInstance("MD5"));
                    try {
                        while (digestInputStream.read(new byte[262144]) > 0) {
                        }
                        bArrDigest = digestInputStream.getMessageDigest().digest();
                        digestInputStream.close();
                    } catch (IOException e2) {
                        e = e2;
                        e.printStackTrace();
                        if (digestInputStream != null) {
                            digestInputStream.close();
                        }
                        return C31184OooO0O0.OooO00o(bArrDigest);
                    } catch (NoSuchAlgorithmException e3) {
                        e = e3;
                        e.printStackTrace();
                        if (digestInputStream != null) {
                        }
                        return C31184OooO0O0.OooO00o(bArrDigest);
                    }
                } catch (IOException e4) {
                    e = e4;
                    digestInputStream = null;
                    e.printStackTrace();
                    if (digestInputStream != null) {
                    }
                    return C31184OooO0O0.OooO00o(bArrDigest);
                } catch (NoSuchAlgorithmException e5) {
                    e = e5;
                    digestInputStream = null;
                    e.printStackTrace();
                    if (digestInputStream != null) {
                    }
                    return C31184OooO0O0.OooO00o(bArrDigest);
                } catch (Throwable th) {
                    th = th;
                    if (digestInputStream2 != null) {
                        try {
                            digestInputStream2.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
            return C31184OooO0O0.OooO00o(bArrDigest);
        } catch (Throwable th2) {
            th = th2;
            digestInputStream2 = digestInputStream;
        }
    }

    public static File OooOOO0(String str) {
        if (OooOOOO.OooO0O0(str)) {
            return null;
        }
        return new File(str);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x002c: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:14:0x002c */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String OooOOOO(File file) throws Throwable {
        byte[] bArrOooOO0o;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        BufferedInputStream bufferedInputStream3 = null;
        if (file.exists()) {
            try {
                if (file.isFile()) {
                    try {
                        OooO00o oooO00o = new OooO00o();
                        bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                        try {
                            byte[] bArr = new byte[262144];
                            while (true) {
                                int i = bufferedInputStream2.read(bArr);
                                if (i <= 0) {
                                    break;
                                }
                                OooOo0O(oooO00o, bArr, i);
                            }
                            bArrOooOO0o = OooOO0o(oooO00o);
                            try {
                                bufferedInputStream2.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        } catch (IOException e2) {
                            e = e2;
                            e.printStackTrace();
                            if (bufferedInputStream2 != null) {
                                try {
                                    bufferedInputStream2.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                            }
                            bArrOooOO0o = null;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        bufferedInputStream2 = null;
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedInputStream3 != null) {
                            try {
                                bufferedInputStream3.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } else {
                    bArrOooOO0o = null;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream3 = bufferedInputStream;
            }
        }
        if (bArrOooOO0o == null) {
            return null;
        }
        return Base64.encodeToString(bArrOooOO0o, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0052 A[Catch: IOException -> 0x003b, TRY_ENTER, TRY_LEAVE, TryCatch #6 {IOException -> 0x003b, blocks: (B:15:0x0037, B:32:0x0052), top: B:44:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String OooOOOo(File file) throws Throwable {
        DigestInputStream digestInputStream;
        if (!file.exists() || !file.isFile()) {
            return "";
        }
        DigestInputStream digestInputStream2 = null;
        try {
            try {
                try {
                    digestInputStream = new DigestInputStream(new FileInputStream(file), MessageDigest.getInstance(KeyUtil.HMAC_KEY_HASH_ALGORITHM));
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e) {
                e = e;
            } catch (NoSuchAlgorithmException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        try {
            while (digestInputStream.read(new byte[262144]) > 0) {
            }
            String strOooO00o = C31184OooO0O0.OooO00o(digestInputStream.getMessageDigest().digest());
            digestInputStream.close();
            return strOooO00o;
        } catch (IOException e4) {
            e = e4;
            digestInputStream2 = digestInputStream;
            e.printStackTrace();
            if (digestInputStream2 != null) {
                digestInputStream2.close();
            }
            return "";
        } catch (NoSuchAlgorithmException e5) {
            e = e5;
            digestInputStream2 = digestInputStream;
            e.printStackTrace();
            if (digestInputStream2 != null) {
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
            digestInputStream2 = digestInputStream;
            if (digestInputStream2 != null) {
                try {
                    digestInputStream2.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static boolean OooOOo(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return true;
        }
        return OooOOoo(file.getAbsolutePath());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String OooOOo0(File file) {
        String strSubstring;
        File parentFile = file.getParentFile();
        String path = file.getPath();
        String strSubstring2 = "";
        if (OooOOOO.OooO0O0(path)) {
            strSubstring = "";
        } else {
            int iLastIndexOf = path.lastIndexOf(46);
            int iLastIndexOf2 = path.lastIndexOf(File.separator);
            if (iLastIndexOf != -1 && iLastIndexOf2 < iLastIndexOf) {
                strSubstring = path.substring(iLastIndexOf + 1);
            }
        }
        String path2 = file.getPath();
        if (!OooOOOO.OooO0O0(path2)) {
            int iLastIndexOf3 = path2.lastIndexOf(46);
            int iLastIndexOf4 = path2.lastIndexOf(File.separator);
            strSubstring2 = iLastIndexOf4 == -1 ? iLastIndexOf3 == -1 ? path2 : path2.substring(0, iLastIndexOf3) : (iLastIndexOf3 == -1 || iLastIndexOf4 > iLastIndexOf3) ? path2.substring(iLastIndexOf4 + 1) : path2.substring(iLastIndexOf4 + 1, iLastIndexOf3);
        }
        for (int i = 1; file.exists() && i < 1000; i++) {
            StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(strSubstring2, " ");
            sbOooO0OO.append(i);
            sbOooO0OO.append(".");
            sbOooO0OO.append(strSubstring);
            file = new File(parentFile, sbOooO0OO.toString());
        }
        return file.getName();
    }

    public static boolean OooOOoo(String str) {
        File fileOooOOO0 = OooOOO0(str);
        return fileOooOOO0 != null && fileOooOOO0.exists();
    }

    public static ArrayList OooOo0(File file, C31189OooO0oO c31189OooO0oO, boolean z) {
        File[] fileArrListFiles;
        ArrayList arrayList = new ArrayList();
        if (file != null && file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                arrayList.add(file2);
                if (z && file2.isDirectory()) {
                    arrayList.addAll(OooOo0(file2, c31189OooO0oO, true));
                }
            }
        }
        return arrayList;
    }

    public static ArrayList OooOo00(File file, boolean z) {
        return OooOo0(file, new C31189OooO0oO(), z);
    }

    public static void OooOo0O(OooO00o oooO00o, byte[] bArr, int i) {
        int i2;
        int i3 = oooO00o.f111231OooO0OO;
        int i4 = i3 / 64;
        int i5 = 64;
        int i6 = i3 % 64;
        int iMin = Math.min(i, 160);
        int i7 = 0;
        while (i7 < iMin) {
            long[] jArr = oooO00o.f111229OooO00o;
            boolean z = i4 == jArr.length - 1;
            int i8 = z ? 32 : i5;
            if (i6 <= i8 - 8) {
                int i9 = i7;
                while (i9 < i) {
                    jArr[i4] = jArr[i4] ^ ((((long) bArr[i9]) & 255) << i6);
                    i9 += 160;
                    i7 = i7;
                }
                i2 = i7;
            } else {
                i2 = i7;
                int i10 = z ? 0 : i4 + 1;
                int i11 = i8 - i6;
                int i12 = 0;
                for (int i13 = i2; i13 < i; i13 += 160) {
                    i12 ^= bArr[i13] & 255;
                }
                long j = ((long) i12) & 255;
                jArr[i4] = jArr[i4] ^ (j << i6);
                jArr[i10] = (j >>> i11) ^ jArr[i10];
            }
            i6 += 11;
            while (i6 >= i8) {
                i4 = z ? 0 : i4 + 1;
                i6 -= i8;
            }
            i7 = i2 + 1;
            i5 = 64;
        }
        oooO00o.f111231OooO0OO = (((i % 160) * 11) + oooO00o.f111231OooO0OO) % 160;
        oooO00o.f111230OooO0O0 += (long) i;
    }
}
