package OooooOO;

import OooooO0.C21284OooO;
import OooooO0.C21285OooO00o;
import OooooO0.C21291OooO0oO;

/* JADX INFO: renamed from: OooooOO.o0OoOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21365o0OoOo0 {

    /* JADX INFO: renamed from: OooooOO.o0OoOo0$OooO00o */
    public static final class OooO00o extends AbstractC21365o0OoOo0 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            ((OooO00o) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: OooooOO.o0OoOo0$OooO0O0 */
    public static final class OooO0O0 extends AbstractC21365o0OoOo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C21291OooO0oO f61801OooO00o;

        public OooO0O0(C21291OooO0oO c21291OooO0oO) {
            this.f61801OooO00o = c21291OooO0oO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OooO0O0) {
                return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f61801OooO00o, ((OooO0O0) obj).f61801OooO00o);
            }
            return false;
        }

        public final int hashCode() {
            return this.f61801OooO00o.hashCode();
        }
    }

    /* JADX INFO: renamed from: OooooOO.o0OoOo0$OooO0OO */
    public static final class OooO0OO extends AbstractC21365o0OoOo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C21284OooO f61802OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C21334Oooo0o0 f61803OooO0O0;

        public OooO0OO(C21284OooO c21284OooO) {
            C21334Oooo0o0 c21334Oooo0o0;
            this.f61802OooO00o = c21284OooO;
            long j = c21284OooO.f61709OooO0oo;
            float fOooO0O0 = C21285OooO00o.OooO0O0(j);
            long j2 = c21284OooO.f61708OooO0oO;
            float fOooO0O02 = C21285OooO00o.OooO0O0(j2);
            boolean z = false;
            long j3 = c21284OooO.f61707OooO0o0;
            long j4 = c21284OooO.f61706OooO0o;
            boolean z2 = fOooO0O0 == fOooO0O02 && C21285OooO00o.OooO0O0(j2) == C21285OooO00o.OooO0O0(j4) && C21285OooO00o.OooO0O0(j4) == C21285OooO00o.OooO0O0(j3);
            if (C21285OooO00o.OooO0OO(j) == C21285OooO00o.OooO0OO(j2) && C21285OooO00o.OooO0OO(j2) == C21285OooO00o.OooO0OO(j4) && C21285OooO00o.OooO0OO(j4) == C21285OooO00o.OooO0OO(j3)) {
                z = true;
            }
            if (z2 && z) {
                c21334Oooo0o0 = null;
            } else {
                C21334Oooo0o0 c21334Oooo0o0OooO00o = C21335Oooo0oO.OooO00o();
                c21334Oooo0o0OooO00o.OooO0o(c21284OooO);
                c21334Oooo0o0 = c21334Oooo0o0OooO00o;
            }
            this.f61803OooO0O0 = c21334Oooo0o0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OooO0OO) {
                return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f61802OooO00o, ((OooO0OO) obj).f61802OooO00o);
            }
            return false;
        }

        public final int hashCode() {
            return this.f61802OooO00o.hashCode();
        }
    }
}
