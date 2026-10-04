package oO0;

import oO00oooo.C32492OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o extends C32492OooO00o {

    /* JADX INFO: renamed from: oO0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20184OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Integer f113728OooO00o;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f113728OooO00o = num;
        }
    }
}
