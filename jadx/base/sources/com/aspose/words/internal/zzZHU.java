package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.NativeLibSettings;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZHU {
    private static final File zzZHj;
    private static final boolean zzZHk;
    private static final int zzZHl;
    private File zzZHi;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class zzY {
        public static final int ANDROID$558eba37 = 4;
        public static final int MAC$558eba37 = 2;
        public static final int UNIX$558eba37 = 3;
        public static final int WINDOWS$558eba37 = 1;
        private static final /* synthetic */ int[] zzZHg = {1, 2, 3, 4};
    }

    public static class zzZ {
        private final String name;
        private final String zzZHh;

        public zzZ(String str, String str2) {
            this.name = str;
            this.zzZHh = str2;
        }

        public final String getName() {
            return this.name;
        }

        public final String zzcu() {
            return this.zzZHh;
        }
    }

    static {
        File file = new File(NativeLibSettings.getTmpDirectoryPath(), "AsposeNative");
        zzZHj = file;
        if (!file.exists()) {
            file.mkdir();
        }
        zzZHl = zzcw();
        zzZHk = zzcv();
        zzcx();
    }

    private String getResourceFolder() {
        String strZzcA = zzZHk ? zzcA() : zzcB();
        return strZzcA.endsWith("/") ? strZzcA : strZzcA.concat("/");
    }

    private static void zzX(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            try {
                if (file2.isDirectory()) {
                    zzX(file2);
                }
                file2.delete();
            } catch (Throwable unused) {
            }
        }
    }

    private static String zzY(File file) throws Throwable {
        int i;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                byte[] bArr = new byte[1024];
                while (true) {
                    int i2 = fileInputStream2.read(bArr);
                    if (i2 == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i2);
                }
                byte[] bArrDigest = messageDigest.digest();
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    String hexString = Integer.toHexString(b & 255);
                    if (hexString.length() == 1) {
                        sb.append('0');
                    }
                    sb.append(hexString);
                }
                String string = sb.toString();
                fileInputStream2.close();
                return string;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void zzZ(File file, zzZ zzz) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append(zzz.getName());
        sb.append(zzss() ? ".dll" : ".so");
        String string = sb.toString();
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), getResourceFolder(), string);
        File file2 = new File(file, string);
        zzZ(file2, strOooO0OO);
        if (zzY(file2, zzz.zzcu())) {
            System.load(file2.getAbsolutePath());
            return;
        }
        throw new IllegalStateException("Native " + zzz.getName() + " checksum is not valid");
    }

    private static boolean zzcv() {
        String property = System.getProperty("os.arch");
        if (property != null && property.contains("64")) {
            return true;
        }
        String property2 = System.getProperty("sun.arch.data.model");
        return (property2 == null || "unknown".equals(property2)) ? zzss() && System.getenv("ProgramFiles(x86)") != null : property2.contains("64");
    }

    private static int zzcw() {
        String property = System.getProperty("os.name");
        return property.startsWith("Windows") ? zzY.WINDOWS$558eba37 : property.startsWith("Mac OS") ? zzY.MAC$558eba37 : System.getProperty("java.runtime.name").startsWith(AuthenticationConstants.AAD.ADAL_ID_PLATFORM_VALUE) ? zzY.ANDROID$558eba37 : zzY.UNIX$558eba37;
    }

    private static void zzcx() {
        zzX(zzZHj);
    }

    private File zzcy() {
        File file = new File(zzZHj, zzcE());
        if (file.exists()) {
            zzX(file);
            return file;
        }
        file.mkdirs();
        return file;
    }

    private zzZ[] zzcz() {
        return zzZHk ? zzcC() : zzcD();
    }

    public static boolean zzss() {
        return zzZHl == zzY.WINDOWS$558eba37;
    }

    public boolean load() {
        try {
            zzZ[] zzzArrZzcz = zzcz();
            if (zzzArrZzcz != null && zzzArrZzcz.length != 0) {
                File file = new File(zzcy(), String.valueOf(System.currentTimeMillis()));
                this.zzZHi = file;
                if (!file.exists()) {
                    this.zzZHi.mkdir();
                }
                boolean z = false;
                for (zzZ zzz : zzzArrZzcz) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        if (i >= 3) {
                            break;
                        }
                        try {
                            zzZ(this.zzZHi, zzz);
                            z = true;
                            break;
                        } catch (Throwable th) {
                            zzZHV.zzZ(th);
                            System.err.println("Aspose.Words native libs cannot be loaded.  " + th.getMessage());
                            z = false;
                            i = i2;
                        }
                    }
                    if (!z) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable th2) {
            zzZHV.zzZ(th2);
            System.err.println("Aspose.Words native libs cannot be loaded. " + th2.getMessage());
            return false;
        }
    }

    public abstract String zzcA();

    public abstract String zzcB();

    public abstract zzZ[] zzcC();

    public abstract zzZ[] zzcD();

    public abstract String zzcE();

    private void zzZ(File file, String str) throws Exception {
        InputStream resourceAsStream = getClass().getResourceAsStream(str);
        if (resourceAsStream != null) {
            zzZ(resourceAsStream, file);
            return;
        }
        throw new FileNotFoundException(C21111o0ooOoO.OooO0Oo(str, " cannot be found"));
    }

    private static boolean zzY(File file, String str) throws Exception {
        if (file.exists()) {
            if (str != null && str.length() != 0) {
                return str.equals(zzY(file));
            }
            throw new IllegalStateException("Original hash cannot be empty");
        }
        throw new IllegalStateException("File " + file + " does not exist.");
    }

    private static void zzZ(InputStream inputStream, File file) throws IOException {
        try {
            ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(inputStream);
            try {
                FileChannel channel = new FileOutputStream(file).getChannel();
                try {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1024);
                    while (true) {
                        if (readableByteChannelNewChannel.read(byteBufferAllocate) < 0 && byteBufferAllocate.position() <= 0) {
                            break;
                        }
                        byteBufferAllocate.flip();
                        channel.write(byteBufferAllocate);
                        byteBufferAllocate.compact();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    readableByteChannelNewChannel.close();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
