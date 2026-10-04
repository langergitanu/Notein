package o0000oOO;

import java.util.Map;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0000oOO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24338OooO0o0 {

    /* JADX INFO: renamed from: o0000oOO.OooO0o0$OooO00o */
    public static final class OooO00o<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f81922OooO00o;

        public OooO00o(String name) {
            OooOOO0.OooO0oO(name, "name");
            this.f81922OooO00o = name;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            return OooOOO0.OooO0O0(this.f81922OooO00o, ((OooO00o) obj).f81922OooO00o);
        }

        public final int hashCode() {
            return this.f81922OooO00o.hashCode();
        }

        public final String toString() {
            return this.f81922OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0000oOO.OooO0o0$OooO0O0 */
    public static final class OooO0O0<T> {
    }

    public abstract Map<OooO00o<?>, Object> OooO00o();

    public abstract <T> boolean OooO0O0(OooO00o<T> oooO00o);

    public abstract <T> T OooO0OO(OooO00o<T> oooO00o);

    public final C24334OooO0O0 OooO0Oo() {
        return new C24334OooO0O0(C34444Oooo0O0.OooOOOO(OooO00o()), false);
    }
}
