package o0OO00o0;

import android.net.Uri;
import android.os.Environment;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOo0Oo.InterfaceC27298OooOOO0;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32460OooOooO;
import oO0o0O0o.C33580OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final class o00O0O implements InterfaceC27298OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f91672OooO00o;

    public o00O0O(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        this.f91672OooO00o = abstractApplicationC26277OooOoOO;
    }

    @Override // o0OOo0Oo.InterfaceC27298OooOOO0
    public final File OooO00o() {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS).getAbsoluteFile() + "/Notein/sticker");
        C31190OooO0oo.OooO0o(file);
        return file;
    }

    @Override // o0OOo0Oo.InterfaceC27298OooOOO0
    public final void OooO0O0(File file, File file2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, InvalidAlgorithmParameterException {
        BufferedOutputStream bufferedOutputStream;
        byte[] bArr;
        Charset charset = C33580OooO00o.f121231OooO0O0;
        byte[] bytes = "NoteininStickers".getBytes(charset);
        kotlin.jvm.internal.OooOOO0.OooO0o(bytes, "getBytes(...)");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, AES256KeyLoader.AES_ALGORITHM);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        byte[] bytes2 = "NoteininStickers".getBytes(charset);
        kotlin.jvm.internal.OooOOO0.OooO0o(bytes2, "getBytes(...)");
        cipher.init(1, secretKeySpec, new IvParameterSpec(bytes2));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
            try {
                bArr = new byte[4096];
            } finally {
            }
        } finally {
        }
        while (true) {
            int i = bufferedInputStream.read(bArr);
            if (i == -1) {
                bufferedOutputStream.write(cipher.doFinal());
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                bufferedOutputStream.close();
                bufferedInputStream.close();
                return;
            }
            bufferedOutputStream.write(cipher.update(bArr, 0, i));
        }
    }

    @Override // o0OOo0Oo.InterfaceC27298OooOOO0
    public final void OooO0OO(Uri inputUri, File file) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, InvalidAlgorithmParameterException {
        BufferedOutputStream bufferedOutputStream;
        kotlin.jvm.internal.OooOOO0.OooO0oO(inputUri, "inputUri");
        Charset charset = C33580OooO00o.f121231OooO0O0;
        byte[] bytes = "NoteininStickers".getBytes(charset);
        kotlin.jvm.internal.OooOOO0.OooO0o(bytes, "getBytes(...)");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, AES256KeyLoader.AES_ALGORITHM);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        byte[] bytes2 = "NoteininStickers".getBytes(charset);
        kotlin.jvm.internal.OooOOO0.OooO0o(bytes2, "getBytes(...)");
        cipher.init(2, secretKeySpec, new IvParameterSpec(bytes2));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f91672OooO00o.getContentResolver().openInputStream(inputUri));
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        } finally {
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i == -1) {
                    bufferedOutputStream.write(cipher.doFinal());
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    bufferedOutputStream.close();
                    bufferedInputStream.close();
                    return;
                }
                bufferedOutputStream.write(cipher.update(bArr, 0, i));
            }
        } finally {
        }
    }
}
