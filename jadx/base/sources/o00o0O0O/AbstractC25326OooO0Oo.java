package o00o0O0O;

/* JADX INFO: renamed from: o00o0O0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25326OooO0Oo {

    /* JADX INFO: renamed from: o00o0O0O.OooO0Oo$OooO00o */
    public static class OooO00o extends AbstractC25326OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public volatile boolean f86172OooO00o;

        public final void OooO00o() {
            if (this.f86172OooO00o) {
                throw new IllegalStateException("Already released");
            }
        }
    }
}
