package o0ooOO0O;

import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31444OooOOO;

/* JADX INFO: renamed from: o0ooOO0O.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31608OooO0OO implements Comparable<C31608OooO0OO> {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final C31608OooO0OO f112996OooOoOO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AbstractC31434OooO0O0 f112997OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final long f112998OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f112999OooOoO = false;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C31444OooOOO f113000OooOoO0;

    static {
        C31608OooO0OO c31608OooO0OO = new C31608OooO0OO(0L, null, new C31444OooOOO(0L, 65535));
        f112996OooOoOO = c31608OooO0OO;
        c31608OooO0OO.f112999OooOoO = true;
    }

    public C31608OooO0OO(long j, AbstractC31434OooO0O0 abstractC31434OooO0O0, C31444OooOOO c31444OooOOO) {
        this.f112998OooOo0o = j;
        this.f112997OooOo = abstractC31434OooO0O0;
        this.f113000OooOoO0 = c31444OooOOO;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C31608OooO0OO c31608OooO0OO) {
        C31608OooO0OO c31608OooO0OO2 = c31608OooO0OO;
        if (c31608OooO0OO2 == null) {
            return -1;
        }
        long j = this.f113000OooOoO0.f112466OooOo0o;
        long j2 = c31608OooO0OO2.f113000OooOoO0.f112466OooOo0o;
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }
}
