package o00OOooo;

import OooOooo.C20782Oooo0;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.aspose.slides.PatternStyle;
import com.google.common.primitives.SignedBytes;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import o00OOOo.C25012OooO00o;
import o00OOOo.C25013OooO0Oo;
import o00OOOo.C25014OooO0o0;
import o00OOoo.C25018OooO00o;

/* JADX INFO: renamed from: o00OOooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25023OooO0OO {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Object f84961OooO0oO = new Object();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static C25023OooO0OO f84962OooO0oo;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25024OooO0Oo f84964OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f84965OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C25018OooO00o f84966OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C25018OooO00o f84968OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f84963OooO00o = null;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Pattern f84967OooO0o = Pattern.compile("[^0-9a-zA-Z=/+]+");

    static {
        androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(".UTSystemConfig"), File.separator, "Global");
    }

    public C25023OooO0OO(Context context) {
        this.f84964OooO0O0 = null;
        this.f84965OooO0OO = "xx_utdid_key";
        this.f84966OooO0Oo = null;
        this.f84968OooO0o0 = null;
        this.f84968OooO0o0 = new C25018OooO00o(context, "Alvin2");
        this.f84966OooO0Oo = new C25018OooO00o(context, "ContextData");
        this.f84964OooO0O0 = new C25024OooO0Oo();
        this.f84965OooO0OO = String.format("K_%d", Integer.valueOf(C25014OooO0o0.OooO00o("xx_utdid_key")));
        String.format("D_%d", Integer.valueOf(C25014OooO0o0.OooO00o("xx_utdid_domain")));
    }

    public final synchronized String OooO00o() {
        C25018OooO00o c25018OooO00o;
        SharedPreferences sharedPreferences;
        String strOooO0Oo = OooO0Oo();
        this.f84963OooO00o = strOooO0Oo;
        if (!TextUtils.isEmpty(strOooO0Oo)) {
            return this.f84963OooO00o;
        }
        try {
            byte[] bArrOooO0o = OooO0o();
            if (bArrOooO0o != null) {
                String strOooO0OO = o00OOOo.OooO0O0.OooO0OO(bArrOooO0o);
                this.f84963OooO00o = strOooO0OO;
                OooO0OO(strOooO0OO);
                this.f84964OooO0O0.getClass();
                String strOooO00o = C25012OooO00o.OooO00o(o00OOOo.OooO0O0.OooO0OO(bArrOooO0o));
                if (strOooO00o != null && (c25018OooO00o = this.f84966OooO0Oo) != null) {
                    String str = this.f84965OooO0OO;
                    if (!strOooO00o.equals(c25018OooO00o.OooO00o(str))) {
                        if (!C25014OooO0o0.OooO0O0(str) && !str.equals("t")) {
                            if (c25018OooO00o.f84949OooO0OO == null && (sharedPreferences = c25018OooO00o.f84948OooO0O0) != null) {
                                c25018OooO00o.f84949OooO0OO = sharedPreferences.edit();
                            }
                            SharedPreferences.Editor editor = c25018OooO00o.f84949OooO0OO;
                            if (editor != null) {
                                editor.putString(str, strOooO00o);
                            }
                        }
                        c25018OooO00o.OooO0O0();
                    }
                }
                return this.f84963OooO00o;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public final boolean OooO0O0(String str) {
        if (str != null) {
            if (str.endsWith(IOUtils.LINE_SEPARATOR_UNIX)) {
                str = androidx.core.content.OooO0OO.OooO00o(1, 0, str);
            }
            if (24 == str.length() && !this.f84967OooO0o.matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    public final void OooO0OO(String str) {
        C25018OooO00o c25018OooO00o;
        SharedPreferences sharedPreferences;
        if (OooO0O0(str)) {
            if (str.endsWith(IOUtils.LINE_SEPARATOR_UNIX)) {
                str = androidx.core.content.OooO0OO.OooO00o(1, 0, str);
            }
            if (str.length() != 24 || (c25018OooO00o = this.f84968OooO0o0) == null) {
                return;
            }
            if (!C25014OooO0o0.OooO0O0("UTDID2")) {
                if (c25018OooO00o.f84949OooO0OO == null && (sharedPreferences = c25018OooO00o.f84948OooO0O0) != null) {
                    c25018OooO00o.f84949OooO0OO = sharedPreferences.edit();
                }
                SharedPreferences.Editor editor = c25018OooO00o.f84949OooO0OO;
                if (editor != null) {
                    editor.putString("UTDID2", str);
                }
            }
            c25018OooO00o.OooO0O0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized String OooO0Oo() {
        String strOooO00o;
        C25018OooO00o c25018OooO00o;
        SharedPreferences sharedPreferences;
        C25018OooO00o c25018OooO00o2 = this.f84968OooO0o0;
        if (c25018OooO00o2 != null) {
            strOooO00o = c25018OooO00o2.OooO00o("UTDID2");
            if (!C25014OooO0o0.OooO0O0(strOooO00o)) {
                this.f84964OooO0O0.getClass();
                if (C25012OooO00o.OooO00o(strOooO00o) == null) {
                    strOooO00o = null;
                }
            }
        }
        if (!OooO0O0(strOooO00o)) {
            String strOooO00o2 = this.f84966OooO0Oo.OooO00o(this.f84965OooO0OO);
            if (!C25014OooO0o0.OooO0O0(strOooO00o2)) {
                String strOooO0OO = C25012OooO00o.OooO0OO(strOooO00o2);
                if (!OooO0O0(strOooO0OO)) {
                    this.f84964OooO0O0.getClass();
                    strOooO0OO = C25012OooO00o.OooO0OO(strOooO00o2);
                }
                if (OooO0O0(strOooO0OO) && !C25014OooO0o0.OooO0O0(strOooO0OO)) {
                    this.f84963OooO00o = strOooO0OO;
                    OooO0OO(strOooO0OO);
                    return this.f84963OooO00o;
                }
            }
            return null;
        }
        this.f84964OooO0O0.getClass();
        String strOooO00o3 = C25012OooO00o.OooO00o(strOooO00o);
        if (strOooO00o3 != null && (c25018OooO00o = this.f84966OooO0Oo) != null) {
            String str = this.f84965OooO0OO;
            if (!strOooO00o3.equals(c25018OooO00o.OooO00o(str))) {
                if (!C25014OooO0o0.OooO0O0(str) && !str.equals("t")) {
                    if (c25018OooO00o.f84949OooO0OO == null && (sharedPreferences = c25018OooO00o.f84948OooO0O0) != null) {
                        c25018OooO00o.f84949OooO0OO = sharedPreferences.edit();
                    }
                    SharedPreferences.Editor editor = c25018OooO00o.f84949OooO0OO;
                    if (editor != null) {
                        editor.putString(str, strOooO00o3);
                    }
                }
                c25018OooO00o.OooO0O0();
            }
        }
        this.f84963OooO00o = strOooO00o;
        return strOooO00o;
    }

    public final byte[] OooO0o() throws Exception {
        String strOooO00o;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int iNextInt = new Random().nextInt();
        byte[] bArrOooO0O0 = o00OOOo.OooO0OO.OooO0O0(iCurrentTimeMillis);
        byte[] bArrOooO0O02 = o00OOOo.OooO0OO.OooO0O0(iNextInt);
        byteArrayOutputStream.write(bArrOooO0O0, 0, 4);
        byteArrayOutputStream.write(bArrOooO0O02, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            strOooO00o = C20782Oooo0.OooO00o();
        } catch (Exception unused) {
            strOooO00o = "" + new Random().nextInt();
        }
        byteArrayOutputStream.write(o00OOOo.OooO0OO.OooO0O0(C25014OooO0o0.OooO00o(strOooO00o)), 0, 4);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArr = {69, 114, 116, -33, 125, -54, -31, 86, -11, 11, -78, -96, -17, -99, SignedBytes.MAX_POWER_OF_TWO, 23, -95, -126, -82, -64, 113, 116, -16, -103, PatternStyle.Horizontal, -30, 9, -39, 33, -80, -68, -78, -117, PatternStyle.UpwardDiagonal, 30, -122, SignedBytes.MAX_POWER_OF_TWO, -104, 74, -49, 106, 85, -38, -93};
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(C25013OooO0Oo.OooO00o(bArr), mac.getAlgorithm()));
        byteArrayOutputStream.write(o00OOOo.OooO0OO.OooO0O0(C25014OooO0o0.OooO00o(o00OOOo.OooO0O0.OooO0OO(mac.doFinal(byteArray)))));
        return byteArrayOutputStream.toByteArray();
    }

    public final void OooO0o0() {
        boolean z;
        C25018OooO00o c25018OooO00o = this.f84968OooO0o0;
        if (c25018OooO00o != null) {
            if (C25014OooO0o0.OooO0O0(c25018OooO00o.OooO00o("UTDID2"))) {
                String strOooO00o = c25018OooO00o.OooO00o("UTDID");
                if (!C25014OooO0o0.OooO0O0(strOooO00o)) {
                    OooO0OO(strOooO00o);
                }
            }
            boolean z2 = true;
            if (C25014OooO0o0.OooO0O0(c25018OooO00o.OooO00o("DID"))) {
                z = false;
            } else {
                c25018OooO00o.OooO0OO("DID");
                z = true;
            }
            if (!C25014OooO0o0.OooO0O0(c25018OooO00o.OooO00o("EI"))) {
                c25018OooO00o.OooO0OO("EI");
                z = true;
            }
            if (C25014OooO0o0.OooO0O0(c25018OooO00o.OooO00o("SI"))) {
                z2 = z;
            } else {
                c25018OooO00o.OooO0OO("SI");
            }
            if (z2) {
                c25018OooO00o.OooO0O0();
            }
        }
    }
}
