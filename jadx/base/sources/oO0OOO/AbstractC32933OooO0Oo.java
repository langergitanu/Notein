package oO0OOO;

import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: oO0OOO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32933OooO0Oo {

    /* JADX INFO: renamed from: oO0OOO.OooO0Oo$OooO00o */
    public static final class OooO00o extends AbstractC32933OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f118816OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f118817OooO0O0;

        public OooO00o(String name, String desc) {
            OooOOO0.OooO0oO(name, "name");
            OooOOO0.OooO0oO(desc, "desc");
            this.f118816OooO00o = name;
            this.f118817OooO0O0 = desc;
        }

        @Override // oO0OOO.AbstractC32933OooO0Oo
        public final String OooO00o() {
            return this.f118816OooO00o + ':' + this.f118817OooO0O0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return OooOOO0.OooO0O0(this.f118816OooO00o, oooO00o.f118816OooO00o) && OooOOO0.OooO0O0(this.f118817OooO0O0, oooO00o.f118817OooO0O0);
        }

        public final int hashCode() {
            return this.f118817OooO0O0.hashCode() + (this.f118816OooO00o.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: oO0OOO.OooO0Oo$OooO0O0 */
    public static final class OooO0O0 extends AbstractC32933OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f118818OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f118819OooO0O0;

        public OooO0O0(String name, String desc) {
            OooOOO0.OooO0oO(name, "name");
            OooOOO0.OooO0oO(desc, "desc");
            this.f118818OooO00o = name;
            this.f118819OooO0O0 = desc;
        }

        @Override // oO0OOO.AbstractC32933OooO0Oo
        public final String OooO00o() {
            return this.f118818OooO00o + this.f118819OooO0O0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return OooOOO0.OooO0O0(this.f118818OooO00o, oooO0O0.f118818OooO00o) && OooOOO0.OooO0O0(this.f118819OooO0O0, oooO0O0.f118819OooO0O0);
        }

        public final int hashCode() {
            return this.f118819OooO0O0.hashCode() + (this.f118818OooO00o.hashCode() * 31);
        }
    }

    public abstract String OooO00o();

    public final String toString() {
        return OooO00o();
    }
}
