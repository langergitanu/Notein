package o0ooO0Oo;

import java.io.IOException;
import o0ooOO0O.C31606OooO00o;
import o0ooOO0O.C31607OooO0O0;

/* JADX INFO: renamed from: o0ooO0Oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31435OooO0OO extends AbstractC31434OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final boolean f112220OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final byte[] f112217OooOoO0 = {116, 114, 117, 101};

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final byte[] f112216OooOoO = {102, 97, 108, 115, 101};

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final C31435OooO0OO f112218OooOoOO = new C31435OooO0OO(true);

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final C31435OooO0OO f112219OooOoo0 = new C31435OooO0OO(false);

    public C31435OooO0OO(boolean z) {
        this.f112220OooOo = z;
    }

    @Override // o0ooO0Oo.AbstractC31434OooO0O0
    public final Object OooOOoo(C31607OooO0O0 c31607OooO0O0) throws IOException {
        C31606OooO00o c31606OooO00o = c31607OooO0O0.f112981OooOoO;
        if (this.f112220OooOo) {
            c31606OooO00o.write(f112217OooOoO0);
            return null;
        }
        c31606OooO00o.write(f112216OooOoO);
        return null;
    }

    public final String toString() {
        return String.valueOf(this.f112220OooOo);
    }
}
