package oO0o0OOo;

/* JADX INFO: renamed from: oO0o0OOo.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33702OooOOO<T> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0O0 f121483OooO0O0 = new OooO0O0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f121484OooO00o;

    /* JADX INFO: renamed from: oO0o0OOo.OooOOO$OooO00o */
    public static final class OooO00o extends OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Throwable f121485OooO00o;

        public OooO00o(Throwable th) {
            this.f121485OooO00o = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof OooO00o) {
                return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f121485OooO00o, ((OooO00o) obj).f121485OooO00o);
            }
            return false;
        }

        public final int hashCode() {
            Throwable th = this.f121485OooO00o;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // oO0o0OOo.C33702OooOOO.OooO0O0
        public final String toString() {
            return "Closed(" + this.f121485OooO00o + ')';
        }
    }

    /* JADX INFO: renamed from: oO0o0OOo.OooOOO$OooO0O0 */
    public static class OooO0O0 {
        public String toString() {
            return "Failed";
        }
    }

    public static final Throwable OooO00o(Object obj) {
        OooO00o oooO00o = obj instanceof OooO00o ? (OooO00o) obj : null;
        if (oooO00o != null) {
            return oooO00o.f121485OooO00o;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T OooO0O0(Object obj) {
        if (obj instanceof OooO0O0) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C33702OooOOO) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f121484OooO00o, ((C33702OooOOO) obj).f121484OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f121484OooO00o;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f121484OooO00o;
        if (obj instanceof OooO00o) {
            return ((OooO00o) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
