package o0OOo0o;

import android.net.Uri;

/* JADX INFO: renamed from: o0OOo0o.o00OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC27507o00OoooO {

    /* JADX INFO: renamed from: o0OOo0o.o00OoooO$OooO00o */
    public static final class OooO00o extends AbstractC27507o00OoooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f96403OooO00o = new OooO00o();
    }

    /* JADX INFO: renamed from: o0OOo0o.o00OoooO$OooO0O0 */
    public static final class OooO0O0 extends AbstractC27507o00OoooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f96404OooO00o;

        public OooO0O0(String str) {
            this.f96404OooO00o = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f96404OooO00o, ((OooO0O0) obj).f96404OooO00o);
        }

        public final int hashCode() {
            return this.f96404OooO00o.hashCode();
        }

        public final String toString() {
            return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("Failed(reason="), this.f96404OooO00o, ")");
        }
    }

    /* JADX INFO: renamed from: o0OOo0o.o00OoooO$OooO0OO */
    public static final class OooO0OO extends AbstractC27507o00OoooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0OO f96405OooO00o = new OooO0OO();
    }

    /* JADX INFO: renamed from: o0OOo0o.o00OoooO$OooO0Oo, reason: case insensitive filesystem */
    public static final class C27508OooO0Oo extends AbstractC27507o00OoooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C27508OooO0Oo f96406OooO00o = new C27508OooO0Oo();
    }

    /* JADX INFO: renamed from: o0OOo0o.o00OoooO$OooO0o */
    public static final class OooO0o extends AbstractC27507o00OoooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f96407OooO00o;

        public OooO0o(String str) {
            this.f96407OooO00o = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OooO0o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f96407OooO00o, ((OooO0o) obj).f96407OooO00o);
        }

        public final int hashCode() {
            String str = this.f96407OooO00o;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("UnknownError(message="), this.f96407OooO00o, ")");
        }
    }

    /* JADX INFO: renamed from: o0OOo0o.o00OoooO$OooO0o0, reason: case insensitive filesystem */
    public static final class C27509OooO0o0 extends AbstractC27507o00OoooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Uri f96408OooO00o;

        public C27509OooO0o0(Uri uri) {
            this.f96408OooO00o = uri;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27509OooO0o0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f96408OooO00o, ((C27509OooO0o0) obj).f96408OooO00o);
        }

        public final int hashCode() {
            Uri uri = this.f96408OooO00o;
            if (uri == null) {
                return 0;
            }
            return uri.hashCode();
        }

        public final String toString() {
            return "Success(uri=" + this.f96408OooO00o + ")";
        }
    }
}
