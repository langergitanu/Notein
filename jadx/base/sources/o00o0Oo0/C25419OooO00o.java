package o00o0Oo0;

import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o00o0Oo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25419OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static C25419OooO00o f86696OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f86697OooO0O0 = 0;

    public static String OooO00o(String str) {
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            OooOOO0.OooO0o0(objInvoke, "null cannot be cast to non-null type kotlin.String");
            return (String) objInvoke;
        } catch (Throwable unused) {
            return "";
        }
    }
}
