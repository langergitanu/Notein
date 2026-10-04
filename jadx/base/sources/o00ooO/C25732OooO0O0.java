package o00ooO;

/* JADX INFO: renamed from: o00ooO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25732OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C25732OooO0O0 f87823OooO00o = new C25732OooO0O0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static C25731OooO00o f87824OooO0O0;

    /* JADX INFO: renamed from: o00ooO.OooO0O0$OooO00o */
    public interface OooO00o {
    }

    public static final boolean OooO00o() {
        f87823OooO00o.getClass();
        if (f87824OooO0O0 != null) {
            return false;
        }
        synchronized (C25732OooO0O0.class) {
            f87824OooO0O0 = new C25731OooO00o();
        }
        return false;
    }
}
