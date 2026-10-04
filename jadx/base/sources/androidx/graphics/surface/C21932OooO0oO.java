package androidx.graphics.surface;

import android.view.Surface;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: androidx.graphics.surface.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21932OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long f65133OooO00o;

    /* JADX INFO: renamed from: androidx.graphics.surface.OooO0oO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Surface f65134OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public C21932OooO0oO f65135OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f65136OooO0OO;
    }

    /* JADX INFO: renamed from: androidx.graphics.surface.OooO0oO$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public long f65137OooO00o;

        public final void finalize() {
            long j = this.f65137OooO00o;
            if (j != 0) {
                JniBindings.f65114OooO00o.nTransactionDelete(j);
                this.f65137OooO00o = 0L;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (OooOOO0.OooO0O0(obj, this)) {
            return true;
        }
        if ((obj == null) || (!OooOOO0.OooO0O0(obj != null ? obj.getClass() : null, C21932OooO0oO.class))) {
            return false;
        }
        OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type androidx.graphics.surface.SurfaceControlWrapper");
        return ((C21932OooO0oO) obj).f65133OooO00o == this.f65133OooO00o;
    }

    public final void finalize() {
        long j = this.f65133OooO00o;
        if (j != 0) {
            JniBindings.f65114OooO00o.nRelease(j);
            this.f65133OooO00o = 0L;
        }
    }

    public final int hashCode() {
        return Long.hashCode(this.f65133OooO00o);
    }
}
