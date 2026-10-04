package oO00ooO;

import java.io.PrintWriter;
import java.io.StringWriter;
import oOo000o0.C34451OooO0O0;

/* JADX INFO: renamed from: oO00ooO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32435OooO0Oo {
    public static void OooO00o(Throwable th, Throwable exception) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(th, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(exception, "exception");
        if (th != exception) {
            C34451OooO0O0.f123481OooO00o.OooO00o(th, exception);
        }
    }

    public static String OooO0O0(Throwable th) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
        return string;
    }
}
