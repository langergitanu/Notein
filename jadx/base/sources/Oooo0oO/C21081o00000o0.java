package Oooo0oO;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import o00OO0o0.C24998OooO0O0;
import o00OO0o0.C24999OooO0OO;
import o00Oo00.C25033OooO0Oo;
import o0O00o0o.C25846OooO00o;
import oO00oO0.EnumC32398OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0OO0oO.C32928OooO0o0;
import oO0OO0oO.InterfaceC32925OooO0O0;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33651OoooOoO;
import oO0o0Ooo.C33822OooO0OO;
import oO0o0o0O.C33857OooO;
import oO0o0o0O.C33866OooOO0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: Oooo0oO.o00000o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21081o00000o0 implements o00OO0OO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f61071OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f61072OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f61073OooO0OO = 0;

    /* JADX WARN: Type inference failed for: r6v4, types: [T, oO0o0OO.OoooOoO] */
    public static final InterfaceC32925OooO0O0 OooO00o(C33822OooO0OO c33822OooO0OO, Runnable runnable, long j, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        InterfaceC34415OooO0oo interfaceC34415OooO0oo = c33822OooO0OO.f121916OooOo0o;
        final C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
        C32928OooO0o0 c32928OooO0o0 = new C32928OooO0o0(new Runnable() { // from class: oO0o0o0O.OooO0oO
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC33651OoooOoO interfaceC33651OoooOoO = (InterfaceC33651OoooOoO) c24034Oooo00O.f80942OooOo0o;
                if (interfaceC33651OoooOoO != null) {
                    interfaceC33651OoooOoO.dispose();
                }
            }
        });
        Objects.requireNonNull(runnable, "run is null");
        Runnable runnable2 = (Runnable) interfaceC32507OooOO0o.invoke(new C33866OooOO0(c32928OooO0o0, interfaceC34415OooO0oo, runnable));
        if (!C33633Oooo0.OooO0o(c33822OooO0OO)) {
            return EnumC32398OooO0OO.f116503OooOo0o;
        }
        if (j <= 0) {
            runnable2.run();
            return c32928OooO0o0;
        }
        c24034Oooo00O.f80942OooOo0o = C33644OoooO0.OooO0O0(interfaceC34415OooO0oo).OooOooo(j, runnable2, interfaceC34415OooO0oo);
        return c32928OooO0o0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0O0(C32928OooO0o0 c32928OooO0o0, InterfaceC34415OooO0oo interfaceC34415OooO0oo, final Runnable runnable, Continuation continuation) {
        C33857OooO c33857OooO;
        if (continuation instanceof C33857OooO) {
            c33857OooO = (C33857OooO) continuation;
            int i = c33857OooO.f121984OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33857OooO.f121984OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c33857OooO = new C33857OooO(continuation);
            }
        }
        Object obj = c33857OooO.f121982OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33857OooO.f121984OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                if (c32928OooO0o0.OooO00o()) {
                    return C32460OooOooO.f116667OooO00o;
                }
                oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o() { // from class: oO0o0o0O.OooO0oo
                    @Override // oO0O000o.OooO00o
                    public final Object invoke() {
                        runnable.run();
                        return C32460OooOooO.f116667OooO00o;
                    }
                };
                c33857OooO.f121983OooOo0o = interfaceC34415OooO0oo;
                c33857OooO.f121984OooOoO0 = 1;
                if (kotlin.jvm.internal.OooO0OO.OooO0OO(oooO00o, c33857OooO) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC34415OooO0oo = c33857OooO.f121983OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
        } catch (Throwable th) {
            o000000O.OooO00o(th, interfaceC34415OooO0oo);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    public static String OooO0OO(String str, String str2) {
        String str3;
        String str4;
        if (TextUtils.isEmpty(str)) {
            C24999OooO0OO.OooO0O0("CBC", "decrypt 1 content is null");
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            C24999OooO0OO.OooO0O0("CBC", "decrypt 1 key is null");
            return "";
        }
        byte[] bArrOooO0o0 = C24998OooO0O0.OooO0o0(str2);
        if (bArrOooO0o0.length < 16) {
            C24999OooO0OO.OooO0O0("CBC", "decrypt 1 key error: 1 key length less than 16 bytes.");
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            C24999OooO0OO.OooO0O0("CBC", "decrypt 2 content is null");
            return "";
        }
        if (bArrOooO0o0.length < 16) {
            C24999OooO0OO.OooO0O0("CBC", "decrypt 2 key error: 2 key length less than 16 bytes.");
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            str3 = "";
        } else {
            try {
                str3 = str.substring(6, 12) + str.substring(16, 26) + str.substring(32, 48);
            } catch (Exception e) {
                C24999OooO0OO.OooO0O0("CBC", "getIv exception : " + e.getMessage());
                str3 = "";
            }
        }
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            try {
                str4 = str.substring(0, 6) + str.substring(12, 16) + str.substring(26, 32) + str.substring(48);
            } catch (Exception e2) {
                C24999OooO0OO.OooO0O0("CBC", "get encryptword exception : " + e2.getMessage());
                str4 = "";
            }
        }
        if (TextUtils.isEmpty(str3)) {
            C24999OooO0OO.OooO0O0("CBC", "decrypt 2 iv is null");
            return "";
        }
        if (TextUtils.isEmpty(str4)) {
            C24999OooO0OO.OooO0O0("CBC", "decrypt 2 encrypt content is null");
            return "";
        }
        byte[] bArrOooO0o02 = C24998OooO0O0.OooO0o0(str3);
        if (TextUtils.isEmpty(str4)) {
            C24999OooO0OO.OooO0O0("CBC", "decrypt 4 content is null");
            return "";
        }
        if (bArrOooO0o0.length < 16) {
            C24999OooO0OO.OooO0O0("CBC", "decrypt 4 key error: 4 key length less than 16 bytes.");
            return "";
        }
        if (bArrOooO0o02.length < 16) {
            C24999OooO0OO.OooO0O0("CBC", "decrypt 4 iv error: 4 iv length less than 16 bytes.");
            return "";
        }
        try {
            return new String(OooO0Oo(C24998OooO0O0.OooO0o0(str4), bArrOooO0o0, bArrOooO0o02), "UTF-8");
        } catch (UnsupportedEncodingException e3) {
            C24999OooO0OO.OooO0O0("CBC", " cbc decrypt data error" + e3.getMessage());
            return "";
        }
    }

    public static byte[] OooO0Oo(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length == 0) {
            C24999OooO0OO.OooO0O0("CBC", "decrypt 6 content length is 0");
            return new byte[0];
        }
        if (bArr2.length < 16) {
            C24999OooO0OO.OooO0O0("CBC", "decrypt 6 key error: 6 key length less than 16 bytes.");
            return new byte[0];
        }
        if (bArr3 == null) {
            C24999OooO0OO.OooO0O0("CBC", "decrypt 6 iv is null");
            return new byte[0];
        }
        if (bArr3.length < 16) {
            C24999OooO0OO.OooO0O0("CBC", "decrypt 6 iv error: 6 iv length less than 16 bytes.");
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, AES256KeyLoader.AES_ALGORITHM);
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (NullPointerException e) {
            C24999OooO0OO.OooO0O0("CBC", "NullPointerException: " + e.getMessage());
            return new byte[0];
        } catch (InvalidAlgorithmParameterException e2) {
            C24999OooO0OO.OooO0O0("CBC", "InvalidAlgorithmParameterException: " + e2.getMessage());
            return new byte[0];
        } catch (InvalidKeyException e3) {
            C24999OooO0OO.OooO0O0("CBC", "InvalidKeyException: " + e3.getMessage());
            return new byte[0];
        } catch (NoSuchAlgorithmException e4) {
            C24999OooO0OO.OooO0O0("CBC", "NoSuchAlgorithmException: " + e4.getMessage());
            return new byte[0];
        } catch (BadPaddingException e5) {
            C24999OooO0OO.OooO0O0("CBC", "BadPaddingException: " + e5.getMessage());
            C24999OooO0OO.OooO0O0("CBC", "key is not right");
            return new byte[0];
        } catch (IllegalBlockSizeException e6) {
            C24999OooO0OO.OooO0O0("CBC", "IllegalBlockSizeException: " + e6.getMessage());
            return new byte[0];
        } catch (NoSuchPaddingException e7) {
            C24999OooO0OO.OooO0O0("CBC", "NoSuchPaddingException: " + e7.getMessage());
            return new byte[0];
        }
    }

    public static byte[] OooO0o(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            C24999OooO0OO.OooO0O0("CBC", "encrypt 6 content is null");
            return new byte[0];
        }
        if (bArr.length == 0) {
            C24999OooO0OO.OooO0O0("CBC", "encrypt 6 content length is 0");
            return new byte[0];
        }
        if (bArr2.length < 16) {
            C24999OooO0OO.OooO0O0("CBC", "encrypt 6 key error: 6 key length less than 16 bytes.");
            return new byte[0];
        }
        if (bArr3.length < 16) {
            C24999OooO0OO.OooO0O0("CBC", "encrypt 6 iv error: 6 iv length less than 16 bytes.");
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, AES256KeyLoader.AES_ALGORITHM);
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (NullPointerException e) {
            C24999OooO0OO.OooO0O0("CBC", "NullPointerException: " + e.getMessage());
            return new byte[0];
        } catch (InvalidAlgorithmParameterException e2) {
            C24999OooO0OO.OooO0O0("CBC", "InvalidAlgorithmParameterException: " + e2.getMessage());
            return new byte[0];
        } catch (InvalidKeyException e3) {
            C24999OooO0OO.OooO0O0("CBC", "InvalidKeyException: " + e3.getMessage());
            return new byte[0];
        } catch (NoSuchAlgorithmException e4) {
            C24999OooO0OO.OooO0O0("CBC", "NoSuchAlgorithmException: " + e4.getMessage());
            return new byte[0];
        } catch (BadPaddingException e5) {
            C24999OooO0OO.OooO0O0("CBC", "BadPaddingException: " + e5.getMessage());
            return new byte[0];
        } catch (IllegalBlockSizeException e6) {
            C24999OooO0OO.OooO0O0("CBC", "IllegalBlockSizeException: " + e6.getMessage());
            return new byte[0];
        } catch (NoSuchPaddingException e7) {
            C24999OooO0OO.OooO0O0("CBC", "NoSuchPaddingException: " + e7.getMessage());
            return new byte[0];
        }
    }

    public static String OooO0o0(String str, String str2) {
        byte[] bArrOooO0o;
        if (TextUtils.isEmpty(str)) {
            C24999OooO0OO.OooO0O0("CBC", "encrypt 1 content is null");
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            C24999OooO0OO.OooO0O0("CBC", "encrypt 1 key is null");
            return "";
        }
        byte[] bArrOooO0o0 = C24998OooO0O0.OooO0o0(str2);
        if (bArrOooO0o0.length < 16) {
            C24999OooO0OO.OooO0O0("CBC", "encrypt 1 key error: 1 key length less than 16 bytes.");
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            C24999OooO0OO.OooO0O0("CBC", "encrypt 2 content is null");
            return "";
        }
        if (bArrOooO0o0.length < 16) {
            C24999OooO0OO.OooO0O0("CBC", "encrypt 2 key error: 2 key length less than 16 bytes.");
            return "";
        }
        byte[] bArrOooO00o = C25846OooO00o.OooO00o(16);
        if (TextUtils.isEmpty(str)) {
            C24999OooO0OO.OooO0O0("CBC", "encrypt 5 content is null");
            bArrOooO0o = new byte[0];
        } else if (bArrOooO0o0.length < 16) {
            C24999OooO0OO.OooO0O0("CBC", "encrypt 5 key error: 5 key length less than 16 bytes.");
            bArrOooO0o = new byte[0];
        } else if (bArrOooO00o.length < 16) {
            C24999OooO0OO.OooO0O0("CBC", "encrypt 5 iv error: 5 iv length less than 16 bytes.");
            bArrOooO0o = new byte[0];
        } else {
            try {
                bArrOooO0o = OooO0o(str.getBytes("UTF-8"), bArrOooO0o0, bArrOooO00o);
            } catch (UnsupportedEncodingException e) {
                C24999OooO0OO.OooO0O0("CBC", " cbc encrypt data error" + e.getMessage());
                bArrOooO0o = new byte[0];
            }
        }
        if (bArrOooO0o == null || bArrOooO0o.length == 0) {
            return "";
        }
        String strOooO0OO = C24998OooO0O0.OooO0OO(bArrOooO00o);
        String strOooO0OO2 = C24998OooO0O0.OooO0OO(bArrOooO0o);
        if (TextUtils.isEmpty(strOooO0OO) || TextUtils.isEmpty(strOooO0OO2)) {
            return "";
        }
        try {
            return strOooO0OO2.substring(0, 6) + strOooO0OO.substring(0, 6) + strOooO0OO2.substring(6, 10) + strOooO0OO.substring(6, 16) + strOooO0OO2.substring(10, 16) + strOooO0OO.substring(16) + strOooO0OO2.substring(16);
        } catch (Exception e2) {
            C24999OooO0OO.OooO0O0("CBC", "mix exception: " + e2.getMessage());
            return "";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List OooO0oO(List list) {
        Integer num;
        ArrayList<String> arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO(list);
        arrayListO0ooOoO.add("stroke");
        arrayListO0ooOoO.add("ink_stroke");
        arrayListO0ooOoO.add("quote");
        if (arrayListO0ooOoO.contains("image")) {
            arrayListO0ooOoO.add("dual_link_ref");
        }
        ArrayList arrayList = new ArrayList();
        for (String str : arrayListO0ooOoO) {
            switch (str.hashCode()) {
                case -1091941199:
                    if (str.equals("ink_stroke")) {
                        num = 9;
                    } else {
                        Log.e("LassoFilter", "unknown filter: ".concat(str));
                        num = null;
                    }
                    break;
                case -891980232:
                    if (str.equals("stroke")) {
                        num = 0;
                        break;
                    }
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        num = 4;
                        break;
                    }
                    break;
                case 100313435:
                    if (str.equals("image")) {
                        num = 5;
                        break;
                    }
                    break;
                case 107953788:
                    if (str.equals("quote")) {
                        num = 3;
                        break;
                    }
                    break;
                case 109399969:
                    if (str.equals("shape")) {
                        num = 2;
                        break;
                    }
                    break;
                case 1973079857:
                    if (str.equals("dual_link_ref")) {
                        num = 7;
                        break;
                    }
                    break;
            }
            if (num != null) {
                arrayList.add(num);
            }
        }
        return oOo000Oo.OooOo.Oooo0(arrayList);
    }

    public static final int OooO0oo(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    @Override // o00OO0OO.OooO00o
    /* JADX INFO: renamed from: a */
    public String mo1a(Context context) {
        if (context != null) {
            o00Oo00.OooO0OO.OooO00o(context).getClass();
            if (o00Oo00.OooO0OO.f85002OooO0O0) {
                o00Oo00.OooO0OO.OooO00o(context).getClass();
                if (o00Oo00.OooO0OO.f85002OooO0O0) {
                    String str = o00Oo00.OooO0OO.f85008OooO0oo;
                    if (str != null) {
                        return str;
                    }
                    o00Oo00.OooO0OO.OooO0O0(0);
                    if (o00Oo00.OooO0OO.f85003OooO0OO == null) {
                        Context context2 = o00Oo00.OooO0OO.f85001OooO00o;
                        o00Oo00.OooO0OO oooO0OO = o00Oo00.OooO0OO.f85000OooO;
                        C25033OooO0Oo c25033OooO0Oo = new C25033OooO0Oo(null);
                        c25033OooO0Oo.f85011OooO0O0 = oooO0OO;
                        c25033OooO0Oo.f85010OooO00o = 0;
                        o00Oo00.OooO0OO.f85003OooO0OO = c25033OooO0Oo;
                        context2.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, o00Oo00.OooO0OO.f85003OooO0OO);
                    }
                    return o00Oo00.OooO0OO.f85008OooO0oo;
                }
            }
        }
        return null;
    }
}
