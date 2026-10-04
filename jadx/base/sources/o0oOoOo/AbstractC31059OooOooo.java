package o0oOoOo;

import Oooo0oO.C21023OooO0Oo;
import o0000oOO.AbstractC24338OooO0o0;

/* JADX INFO: renamed from: o0oOoOo.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31059OooOooo {

    /* JADX INFO: renamed from: o0oOoOo.OooOooo$OooO00o */
    public static final class OooO00o extends AbstractC31059OooOooo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AbstractC24338OooO0o0.OooO00o<Integer> f110886OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f110887OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f110888OooO0OO;

        public OooO00o(int i, AbstractC24338OooO0o0.OooO00o key) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
            this.f110886OooO00o = key;
            this.f110887OooO0O0 = i;
            this.f110888OooO0OO = key.f81922OooO00o;
        }

        @Override // o0oOoOo.AbstractC31059OooOooo
        public final String OooO00o() {
            return this.f110888OooO0OO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110886OooO00o, oooO00o.f110886OooO00o) && this.f110887OooO0O0 == oooO00o.f110887OooO0O0;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f110887OooO0O0) + (this.f110886OooO00o.f81922OooO00o.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PenEvent(key=");
            sb.append(this.f110886OooO00o);
            sb.append(", value=");
            return C21023OooO0Oo.OooO0OO(")", this.f110887OooO0O0, sb);
        }
    }

    /* JADX INFO: renamed from: o0oOoOo.OooOooo$OooO0O0 */
    public static final class OooO0O0 extends AbstractC31059OooOooo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f110889OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f110890OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f110891OooO0OO;

        public OooO0O0(String preferenceName, String str) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(preferenceName, "preferenceName");
            this.f110889OooO00o = preferenceName;
            this.f110890OooO0O0 = str;
            this.f110891OooO0OO = preferenceName;
        }

        @Override // o0oOoOo.AbstractC31059OooOooo
        public final String OooO00o() {
            return this.f110891OooO0OO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110889OooO00o, oooO0O0.f110889OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110890OooO0O0, oooO0O0.f110890OooO0O0);
        }

        public final int hashCode() {
            return this.f110890OooO0O0.hashCode() + (this.f110889OooO00o.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StylusGesture(preferenceName=");
            sb.append(this.f110889OooO00o);
            sb.append(", value=");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f110890OooO0O0, ")");
        }
    }

    public abstract String OooO00o();
}
