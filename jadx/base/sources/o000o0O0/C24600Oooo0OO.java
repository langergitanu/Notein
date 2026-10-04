package o000o0O0;

import OooOoo.C20593OooO0Oo;
import java.util.LinkedHashMap;
import o000o0O0.Oooo0;

/* JADX INFO: renamed from: o000o0O0.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24600Oooo0OO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final LinkedHashMap f83364OooO0O0 = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LinkedHashMap f83365OooO00o = new LinkedHashMap();

    /* JADX INFO: renamed from: o000o0O0.Oooo0OO$OooO00o */
    public static final class OooO00o {
        public static String OooO00o(Class cls) {
            LinkedHashMap linkedHashMap = C24600Oooo0OO.f83364OooO0O0;
            String strValue = (String) linkedHashMap.get(cls);
            if (strValue == null) {
                Oooo0.OooO00o oooO00o = (Oooo0.OooO00o) cls.getAnnotation(Oooo0.OooO00o.class);
                strValue = oooO00o != null ? oooO00o.value() : null;
                if (strValue == null || strValue.length() <= 0) {
                    throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
                }
                linkedHashMap.put(cls, strValue);
            }
            kotlin.jvm.internal.OooOOO0.OooO0Oo(strValue);
            return strValue;
        }
    }

    public final void OooO00o(Oooo0 oooo0) {
        String strOooO00o = OooO00o.OooO00o(oooo0.getClass());
        if (strOooO00o.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f83365OooO00o;
        Oooo0 oooo02 = (Oooo0) linkedHashMap.get(strOooO00o);
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(oooo02, oooo0)) {
            return;
        }
        boolean z = false;
        if (oooo02 != null && oooo02.f83358OooO0O0) {
            z = true;
        }
        if (z) {
            throw new IllegalStateException(("Navigator " + oooo0 + " is replacing an already attached " + oooo02).toString());
        }
        if (!oooo0.f83358OooO0O0) {
            return;
        }
        throw new IllegalStateException(("Navigator " + oooo0 + " is already attached to another NavController").toString());
    }

    public final <T extends Oooo0<?>> T OooO0O0(String name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        T t = (T) this.f83365OooO00o.get(name);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(C20593OooO0Oo.OooO0O0("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
