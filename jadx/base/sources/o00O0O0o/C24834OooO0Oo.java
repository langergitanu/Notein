package o00O0O0o;

import android.net.Uri;
import java.util.HashSet;

/* JADX INFO: renamed from: o00O0O0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24834OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashSet f84240OooO00o = new HashSet();

    /* JADX INFO: renamed from: o00O0O0o.OooO0Oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Uri f84241OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f84242OooO0O0;

        public OooO00o(boolean z, Uri uri) {
            this.f84241OooO00o = uri;
            this.f84242OooO0O0 = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && OooO00o.class == obj.getClass()) {
                OooO00o oooO00o = (OooO00o) obj;
                if (this.f84242OooO0O0 == oooO00o.f84242OooO0O0 && this.f84241OooO00o.equals(oooO00o.f84241OooO00o)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.f84241OooO00o.hashCode() * 31) + (this.f84242OooO0O0 ? 1 : 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C24834OooO0Oo.class != obj.getClass()) {
            return false;
        }
        return this.f84240OooO00o.equals(((C24834OooO0Oo) obj).f84240OooO00o);
    }

    public final int hashCode() {
        return this.f84240OooO00o.hashCode();
    }
}
