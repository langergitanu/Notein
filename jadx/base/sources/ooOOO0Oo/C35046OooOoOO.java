package ooOOO0Oo;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import o00Oo0oO.C25052OooO0Oo;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33477OooO0OO;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: renamed from: ooOOO0Oo.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35046OooOoOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C33477OooO0OO f125831OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C33476OooO0O0 f125832OooO0O0;

    static {
        C33477OooO0OO c33477OooO0OO = new C33477OooO0OO("kotlin.jvm.JvmField");
        f125831OooO00o = c33477OooO0OO;
        C33476OooO0O0.OooOO0(c33477OooO0OO);
        C33476OooO0O0.OooOO0(new C33477OooO0OO("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f125832OooO0O0 = C33476OooO0O0.OooO0o0("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String OooO00o(String propertyName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(propertyName, "propertyName");
        if (OooO0OO(propertyName)) {
            return propertyName;
        }
        return "get" + C25052OooO0Oo.OooO0O0(propertyName);
    }

    public static final String OooO0O0(String str) {
        String strOooO0O0;
        StringBuilder sb = new StringBuilder("set");
        if (OooO0OO(str)) {
            strOooO0O0 = str.substring(2);
            kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0O0, "this as java.lang.String).substring(startIndex)");
        } else {
            strOooO0O0 = C25052OooO0Oo.OooO0O0(str);
        }
        sb.append(strOooO0O0);
        return sb.toString();
    }

    public static final boolean OooO0OO(String name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        if (C33595OooOOo.OooOoO0(name, TranslateLanguage.ICELANDIC, false) && name.length() != 2) {
            char cCharAt = name.charAt(2);
            if (kotlin.jvm.internal.OooOOO0.OooO(97, cCharAt) > 0 || kotlin.jvm.internal.OooOOO0.OooO(cCharAt, 122) > 0) {
                return true;
            }
        }
        return false;
    }
}
