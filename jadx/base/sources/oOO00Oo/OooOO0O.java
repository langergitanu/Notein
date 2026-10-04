package oOO00Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static OooO00o f123333OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static boolean f123334OooO0O0 = false;

    public static final class OooO00o extends SecurityManager {
        @Override // java.lang.SecurityManager
        public final Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    public static final void OooO00o(String str) {
        System.err.println("SLF4J: " + str);
    }

    public static final void OooO0O0(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }
}
