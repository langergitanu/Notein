package o00OO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0Ooo.AbstractC33316OooOo0o;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0OooO.InterfaceC33452OooO0O0;
import oO0o0000.InterfaceC33541OooO0oO;
import oO0o0000.InterfaceC33542OooO0oo;
import oO0o0000.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f84712OooO00o = 0;

    public static boolean OooO00o(Class cls) {
        return cls.isPrimitive() || cls.equals(String.class) || cls.equals(Integer.class) || cls.equals(Long.class) || cls.equals(Double.class) || cls.equals(Float.class) || cls.equals(Boolean.class) || cls.equals(Short.class) || cls.equals(Character.class) || cls.equals(Byte.class) || cls.equals(Void.class);
    }

    public static final long OooO0O0(String dateStr) {
        OooOOO0.OooO0oO(dateStr, "dateStr");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        try {
            Date date = new SimpleDateFormat[]{simpleDateFormat}[0].parse(dateStr);
            if (date != null) {
                return date.getTime();
            }
            return 0L;
        } catch (ParseException unused) {
            return 0L;
        }
    }

    public static boolean OooO0OO(InterfaceC33452OooO0O0 interfaceC33452OooO0O0, InterfaceC33542OooO0oo interfaceC33542OooO0oo, InterfaceC33542OooO0oo interfaceC33542OooO0oo2) {
        if (interfaceC33452OooO0O0.OoooO0O(interfaceC33542OooO0oo) == interfaceC33452OooO0O0.OoooO0O(interfaceC33542OooO0oo2) && interfaceC33452OooO0O0.OooOOo(interfaceC33542OooO0oo) == interfaceC33452OooO0O0.OooOOo(interfaceC33542OooO0oo2)) {
            if ((interfaceC33452OooO0O0.Oooo0O0(interfaceC33542OooO0oo) == null) == (interfaceC33452OooO0O0.Oooo0O0(interfaceC33542OooO0oo2) == null) && interfaceC33452OooO0O0.OooO0Oo(interfaceC33452OooO0O0.OooOo00(interfaceC33542OooO0oo), interfaceC33452OooO0O0.OooOo00(interfaceC33542OooO0oo2))) {
                if (!interfaceC33452OooO0O0.OoooOOo(interfaceC33542OooO0oo, interfaceC33542OooO0oo2)) {
                    int iOoooO0O = interfaceC33452OooO0O0.OoooO0O(interfaceC33542OooO0oo);
                    for (int i = 0; i < iOoooO0O; i++) {
                        OooOO0 oooOO0OooOo = interfaceC33452OooO0O0.OooOo(interfaceC33542OooO0oo, i);
                        OooOO0 oooOO0OooOo2 = interfaceC33452OooO0O0.OooOo(interfaceC33542OooO0oo2, i);
                        if (interfaceC33452OooO0O0.OoooOO0(oooOO0OooOo) == interfaceC33452OooO0O0.OoooOO0(oooOO0OooOo2) && (interfaceC33452OooO0O0.OoooOO0(oooOO0OooOo) || (interfaceC33452OooO0O0.Oooo(oooOO0OooOo) == interfaceC33452OooO0O0.Oooo(oooOO0OooOo2) && OooO0Oo(interfaceC33452OooO0O0, interfaceC33452OooO0O0.OooOoo0(oooOO0OooOo), interfaceC33452OooO0O0.OooOoo0(oooOO0OooOo2))))) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean OooO0Oo(InterfaceC33452OooO0O0 interfaceC33452OooO0O0, InterfaceC33541OooO0oO interfaceC33541OooO0oO, InterfaceC33541OooO0oO interfaceC33541OooO0oO2) {
        if (interfaceC33541OooO0oO == interfaceC33541OooO0oO2) {
            return true;
        }
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooOOOO = interfaceC33452OooO0O0.OooOOOO(interfaceC33541OooO0oO);
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooOOOO2 = interfaceC33452OooO0O0.OooOOOO(interfaceC33541OooO0oO2);
        if (abstractC33328Oooo0O0OooOOOO != null && abstractC33328Oooo0O0OooOOOO2 != null) {
            return OooO0OO(interfaceC33452OooO0O0, abstractC33328Oooo0O0OooOOOO, abstractC33328Oooo0O0OooOOOO2);
        }
        AbstractC33316OooOo0o abstractC33316OooOo0oOoOO = interfaceC33452OooO0O0.ooOO(interfaceC33541OooO0oO);
        AbstractC33316OooOo0o abstractC33316OooOo0oOoOO2 = interfaceC33452OooO0O0.ooOO(interfaceC33541OooO0oO2);
        return abstractC33316OooOo0oOoOO != null && abstractC33316OooOo0oOoOO2 != null && OooO0OO(interfaceC33452OooO0O0, interfaceC33452OooO0O0.OooOo0O(abstractC33316OooOo0oOoOO), interfaceC33452OooO0O0.OooOo0O(abstractC33316OooOo0oOoOO2)) && OooO0OO(interfaceC33452OooO0O0, interfaceC33452OooO0O0.Ooooo00(abstractC33316OooOo0oOoOO), interfaceC33452OooO0O0.Ooooo00(abstractC33316OooOo0oOoOO2));
    }
}
