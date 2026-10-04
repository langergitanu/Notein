package o00Oo;

import OooOO0.OooO0OO;
import com.aspose.slides.C22218Oooo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.facebook.imagepipeline.producers.C22306Ooooooo;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.OooOOO0;
import o000oo0.C24684Oooo;
import oO0o0ooO.C33917OooOO0;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: renamed from: o00Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25025OooO00o {
    public static String OooO00o() {
        String str = new String();
        for (int i = 0; i < 58; i += 4) {
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(str);
            sbOooO0OO.append("idnjfhncnsfuobcnt847y929o449u474w7j3h22aoddc98euk#%&&)*&^%#".charAt(i));
            str = sbOooO0OO.toString();
        }
        return str;
    }

    public static String OooO0O0(String str, String str2) {
        try {
            PBEKeySpec pBEKeySpecOooO0OO = OooO0OO(str);
            byte[] bytes = str2.getBytes();
            byte[] bArrOooO0o0 = OooO0o0();
            SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(pBEKeySpecOooO0OO).getEncoded(), AES256KeyLoader.AES_ALGORITHM);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArrOooO0o0));
            byte[] salt = pBEKeySpecOooO0OO.getSalt();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(salt.length + cipher.getOutputSize(bytes.length));
            byteBufferAllocate.put(salt);
            cipher.doFinal(ByteBuffer.wrap(bytes), byteBufferAllocate);
            byte[] bArrArray = byteBufferAllocate.array();
            if (bArrArray == null) {
                return "";
            }
            StringBuffer stringBuffer = new StringBuffer(bArrArray.length * 2);
            for (byte b : bArrArray) {
                stringBuffer.append("0123456789ABCDEF".charAt((b >> 4) & 15));
                stringBuffer.append("0123456789ABCDEF".charAt(b & 15));
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static PBEKeySpec OooO0OO(String str) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        Class<?> cls = Class.forName(new String(C22306Ooooooo.OooO0O0("amF2YS5zZWN1cml0eS5TZWN1cmVSYW5kb20=")));
        Object objNewInstance = cls.newInstance();
        byte[] bArr = new byte[16];
        Method method = cls.getMethod("nextBytes", bArr.getClass());
        method.setAccessible(true);
        method.invoke(objNewInstance, bArr);
        return new PBEKeySpec(str.toCharArray(), bArr, 10, 128);
    }

    public static String OooO0Oo(String str, String str2) {
        boolean z;
        byte[] bArrDoFinal;
        try {
            PBEKeySpec pBEKeySpecOooO0OO = OooO0OO(str);
            int length = str2.length() / 2;
            byte[] bArr = new byte[length];
            z = false;
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = Integer.valueOf(str2.substring(i2, i2 + 2), 16).byteValue();
            }
            byte[] bArrOooO0o0 = OooO0o0();
            if (length <= 16) {
                bArrDoFinal = null;
            } else {
                SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(pBEKeySpecOooO0OO.getPassword(), Arrays.copyOf(bArr, 16), 10, 128)).getEncoded(), AES256KeyLoader.AES_ALGORITHM);
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(2, secretKeySpec, new IvParameterSpec(bArrOooO0o0));
                bArrDoFinal = cipher.doFinal(bArr, 16, length - 16);
            }
        } catch (Exception unused) {
        }
        if (bArrDoFinal == null) {
            throw new Exception();
        }
        String str3 = new String(bArrDoFinal);
        byte[] bytes = str3.getBytes();
        int length2 = bytes.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length2) {
                z = true;
                break;
            }
            byte b = bytes[i3];
            if ((b >= 0 && b <= 31) || b >= 127) {
                break;
            }
            i3++;
        }
        if (z) {
            return str3;
        }
        return null;
    }

    public static final void OooO0o(String str, InterfaceC34595OooO0Oo baseClass) {
        String string;
        OooOOO0.OooO0oO(baseClass, "baseClass");
        String str2 = "in the polymorphic scope of '" + baseClass.OooOO0() + '\'';
        if (str == null) {
            string = C24684Oooo.OooO00o(FilenameUtils.EXTENSION_SEPARATOR, "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbOooO0O0 = OooO0o.OooO0O0("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            OooO0OO.OooO0o0(sbOooO0O0, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbOooO0O0.append(baseClass.OooOO0());
            sbOooO0O0.append("' has to be sealed and '@Serializable'.");
            string = sbOooO0O0.toString();
        }
        throw new C33917OooOO0(string);
    }

    public static byte[] OooO0o0() {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 48; i += 2) {
                sb.append("AsAgAtA5A6AdAgABABACADAfAsAdAfAsAgAaAgA3A5A6=8=0".charAt(i));
            }
            return C22306Ooooooo.OooO0O0(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
