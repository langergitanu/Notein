package Oooo0O0;

import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Locale;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33741OooOoO0;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0OoO.C33790OooO00o;
import oOo000Oo.C34429OooOOo0;
import oo0o0Oo.C34682OooO0Oo;
import oo0o0Oo.C34683OooO0o;
import oo0o0Oo.C34695OooOOo0;

/* JADX INFO: renamed from: Oooo0O0.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20945OoooO00 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Object obj, Object obj2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33741OooOoO0 c33741OooOoO0;
        if (abstractC32479OooO0OO instanceof C33741OooOoO0) {
            c33741OooOoO0 = (C33741OooOoO0) abstractC32479OooO0OO;
            int i = c33741OooOoO0.f121628OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33741OooOoO0.f121628OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c33741OooOoO0 = new C33741OooOoO0(abstractC32479OooO0OO);
            }
        }
        Object obj3 = c33741OooOoO0.f121626OooOo;
        Object obj4 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33741OooOoO0.f121628OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj3);
            c33741OooOoO0.f121627OooOo0o = obj2;
            c33741OooOoO0.f121628OooOoO0 = 1;
            if (interfaceC33723OooO0oO.emit(obj, c33741OooOoO0) == obj4) {
                return;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = c33741OooOoO0.f121627OooOo0o;
            C32446OooOOOo.OooO0O0(obj3);
        }
        throw new C33790OooO00o(obj2);
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

    public static final float OooO0OO(C34695OooOOo0 c34695OooOOo0, int i, boolean z, boolean z2) {
        boolean z3 = c34695OooOOo0.OooO00o(((!z || z2) && (z || !z2)) ? Math.max(i + (-1), 0) : i) == c34695OooOOo0.OooOO0O(i);
        C34682OooO0Oo c34682OooO0Oo = c34695OooOOo0.f124973OooO0O0;
        c34682OooO0Oo.OooO0OO(i);
        int length = c34682OooO0Oo.f124903OooO00o.f124918OooO00o.f124887OooOo0o.length();
        ArrayList arrayList = c34682OooO0Oo.f124910OooO0oo;
        C34683OooO0o c34683OooO0o = (C34683OooO0o) arrayList.get(i == length ? C34429OooOOo0.OooOO0O(arrayList) : C25252OooO0Oo.OooOOOO(i, arrayList));
        return c34683OooO0o.f124911OooO00o.OooO0Oo(c34683OooO0o.OooO00o(i), z3);
    }

    public static byte[] OooO0Oo(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        try {
            byte[] bytes = upperCase.getBytes("UTF-8");
            for (int i = 0; i < length; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append("0x");
                int i2 = i * 2;
                sb.append(new String(new byte[]{bytes[i2]}, "UTF-8"));
                bArr[i] = (byte) (((byte) (Byte.decode(sb.toString()).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{bytes[i2 + 1]}, "UTF-8")).byteValue());
            }
        } catch (UnsupportedEncodingException e) {
            e = e;
            Log.e("HexUtil", "hex string 2 byte UnsupportedEncodingException or NumberFormatException : " + e.getMessage());
        } catch (NumberFormatException e2) {
            e = e2;
            Log.e("HexUtil", "hex string 2 byte UnsupportedEncodingException or NumberFormatException : " + e.getMessage());
        } catch (Exception e3) {
            Log.e("HexUtil", "byte array 2 hex string exception : " + e3.getMessage());
        }
        return bArr;
    }
}
