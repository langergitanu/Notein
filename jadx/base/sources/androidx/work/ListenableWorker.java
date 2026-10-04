package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import o00O0O0o.C24836OooO0oO;
import o00O0o00.C24932OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public abstract class ListenableWorker {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final WorkerParameters f66668OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Context f66669OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f66670OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public volatile boolean f66671OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f66672OooOoOO;

    public static abstract class OooO00o {

        /* JADX INFO: renamed from: androidx.work.ListenableWorker$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19046OooO00o extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final androidx.work.OooO0O0 f66673OooO00o = androidx.work.OooO0O0.f66685OooO0OO;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C19046OooO00o.class != obj.getClass()) {
                    return false;
                }
                return this.f66673OooO00o.equals(((C19046OooO00o) obj).f66673OooO00o);
            }

            public final int hashCode() {
                return this.f66673OooO00o.hashCode() + (C19046OooO00o.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Failure {mOutputData=" + this.f66673OooO00o + '}';
            }
        }

        public static final class OooO0O0 extends OooO00o {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && OooO0O0.class == obj.getClass();
            }

            public final int hashCode() {
                return OooO0O0.class.getName().hashCode();
            }

            public final String toString() {
                return "Retry";
            }
        }

        public static final class OooO0OO extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final androidx.work.OooO0O0 f66674OooO00o;

            public OooO0OO() {
                this(androidx.work.OooO0O0.f66685OooO0OO);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || OooO0OO.class != obj.getClass()) {
                    return false;
                }
                return this.f66674OooO00o.equals(((OooO0OO) obj).f66674OooO00o);
            }

            public final int hashCode() {
                return this.f66674OooO00o.hashCode() + (OooO0OO.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Success {mOutputData=" + this.f66674OooO00o + '}';
            }

            public OooO0OO(androidx.work.OooO0O0 oooO0O0) {
                this.f66674OooO00o = oooO0O0;
            }
        }
    }

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f66669OooOo0o = context;
        this.f66668OooOo = workerParameters;
    }

    public ListenableFuture<C24836OooO0oO> OooO00o() {
        C24932OooO0OO c24932OooO0OO = new C24932OooO0OO();
        c24932OooO0OO.OooOO0(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return c24932OooO0OO;
    }

    public boolean OooO0O0() {
        return this.f66672OooOoOO;
    }

    public void OooO0OO() {
    }

    public abstract C24932OooO0OO OooO0o0();

    public final void OooO0oO() {
        this.f66671OooOoO0 = true;
        OooO0OO();
    }
}
