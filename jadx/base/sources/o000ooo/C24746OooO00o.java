package o000ooo;

import android.database.SQLException;
import androidx.appcompat.widget.C21532OooOOo;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.orion.penkit.tools.DrawToolFactory;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Locale;
import kotlin.jvm.internal.OooOOO0;
import o0000OoO.C24224OooO00o;
import oO00O0o0.C32183OooO0Oo;
import oO0oO0.InterfaceC33931OooO0O0;

/* JADX INFO: renamed from: o000ooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24746OooO00o implements InterfaceC33931OooO0O0 {
    public static /* synthetic */ void OooO0O0(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = C18437z2.f56754h;
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = DrawToolFactory.LASSO_TYPE_CAPTURE;
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static String OooO0OO(String str) {
        try {
            if (C24224OooO00o.OooO0O0(str)) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance(IDevicePopManager.SHA_1);
            messageDigest.update(str.getBytes("UTF-8"));
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Charset OooO0Oo(C32183OooO0Oo c32183OooO0Oo) {
        OooOOO0.OooO0oO(c32183OooO0Oo, "<this>");
        String strOooO0OO = c32183OooO0Oo.OooO0OO("charset");
        if (strOooO0OO == null) {
            return null;
        }
        try {
            return Charset.forName(strOooO0OO);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static String OooO0o(int i) {
        if (i == 5) {
            return "qTESLA-p-I";
        }
        if (i == 6) {
            return "qTESLA-p-III";
        }
        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "unknown security category: "));
    }

    public static final void OooO0o0(InterfaceC24747OooO0O0 interfaceC24747OooO0O0, String sql) throws Exception {
        OooOOO0.OooO0oO(interfaceC24747OooO0O0, "<this>");
        OooOOO0.OooO0oO(sql, "sql");
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = interfaceC24747OooO0O0.o0ooOOo(sql);
        try {
            interfaceC24749OooO0OoO0ooOOo.o00oO0o();
            interfaceC24749OooO0OoO0ooOOo.close();
        } finally {
        }
    }

    public static final void OooO0oO(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i);
        if (str != null) {
            sb.append(", message: ".concat(str));
        }
        throw new SQLException(sb.toString());
    }

    public static final C32183OooO0Oo OooO0oo(C32183OooO0Oo c32183OooO0Oo, Charset charset) {
        OooOOO0.OooO0oO(c32183OooO0Oo, "<this>");
        OooOOO0.OooO0oO(charset, "charset");
        String lowerCase = c32183OooO0Oo.f115521OooO0Oo.toLowerCase(Locale.ROOT);
        OooOOO0.OooO0o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return !lowerCase.equals("text") ? c32183OooO0Oo : c32183OooO0Oo.OooO0o(oO00Oo00.OooO00o.OooO0Oo(charset));
    }

    @Override // oO0oO0.InterfaceC33931OooO0O0
    public void OooO00o(int i, float f) {
    }
}
