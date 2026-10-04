package oO00oooo;

import kotlin.jvm.internal.OooOOO0;
import oOo000o0.C34450OooO00o;

/* JADX INFO: renamed from: oO00oooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C32492OooO00o extends C34450OooO00o {

    /* JADX INFO: renamed from: oO00oooo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20234OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Integer f116739OooO00o;

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
            f116739OooO00o = num;
        }
    }

    @Override // oOo000o0.C34450OooO00o
    public final void OooO00o(Throwable cause, Throwable exception) {
        OooOOO0.OooO0oO(cause, "cause");
        OooOOO0.OooO0oO(exception, "exception");
        Integer num = C20234OooO00o.f116739OooO00o;
        if (num == null || num.intValue() >= 19) {
            cause.addSuppressed(exception);
        } else {
            super.OooO00o(cause, exception);
        }
    }
}
