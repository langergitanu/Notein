package oO0o0O0;

/* JADX INFO: renamed from: oO0o0O0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33559OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f121182OooO00o = new OooO00o();

    /* JADX INFO: renamed from: oO0o0O0.OooO0o0$OooO00o */
    public static class OooO00o {
        public final String toString() {
            return "NULL_VALUE";
        }
    }

    /* JADX INFO: renamed from: oO0o0O0.OooO0o0$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Throwable f121183OooO00o;

        public OooO0O0(Throwable th) {
            this.f121183OooO00o = th;
        }

        public final String toString() {
            return this.f121183OooO00o.toString();
        }
    }

    public static void OooO00o(Object obj) throws Throwable {
        if (obj instanceof OooO0O0) {
            throw ((OooO0O0) obj).f121183OooO00o;
        }
    }
}
