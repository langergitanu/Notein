package com.google.android.recaptcha.internal;

import android.content.Context;
import com.aspose.words.EditingLanguage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import kotlin.jvm.internal.OooOOO0;
import o00o00oo.C25298OooO0o;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes7.dex */
public final class zzcd {
    public zzcd(Context context) {
    }

    public static final byte[] zza(File file) throws GeneralSecurityException, IOException {
        OooOOO0.OooO0oO(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopyOf = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream.read(bArrCopyOf, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
                OooOOO0.OooO0o(bArrCopyOf, "copyOf(...)");
            } else {
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    oO0O000.OooO0O0 oooO0O0 = new oO0O000.OooO0O0(EditingLanguage.ARABIC_OMAN);
                    oooO0O0.write(i5);
                    C25298OooO0o.OooO00o(fileInputStream, oooO0O0);
                    int size = oooO0O0.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrOooO00o = oooO0O0.OooO00o();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    OooOOO0.OooO0o(bArrCopyOf, "copyOf(...)");
                    Oooo.OooO0OO.OooO0o0(i, 0, oooO0O0.size(), bArrOooO00o, bArrCopyOf);
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                oO0O000.OooO00o.OooO00o(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final void zzb(File file, byte[] array) throws GeneralSecurityException, IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException("Unable to delete existing encrypted file");
        }
        OooOOO0.OooO0oO(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            fileOutputStream.close();
        } finally {
        }
    }
}
