package o0ooo0;

import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooOoo.InterfaceC31671OooO0OO;

/* JADX INFO: renamed from: o0ooo0.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31719OooOOOO implements InterfaceC31671OooO0OO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31436OooO0Oo f113306OooOo0o;

    public C31719OooOOOO(C31436OooO0Oo c31436OooO0Oo) {
        this.f113306OooOo0o = c31436OooO0Oo;
    }

    public final String OooO00o() {
        return this.f113306OooOo0o.o000OOO(C31441OooOO0.f112441o0O0ooO);
    }

    @Override // o0ooOoo.InterfaceC31671OooO0OO
    public final AbstractC31434OooO0O0 OooOOo0() {
        return this.f113306OooOo0o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112387o00O0OOo;
        C31436OooO0Oo c31436OooO0Oo = this.f113306OooOo0o;
        sb.append(c31436OooO0Oo.o000OOO(c31441OooOO0));
        sb.append(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
        sb.append(OooO00o());
        sb.append(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
        sb.append(c31436OooO0Oo.o000O00O(C31441OooOO0.f112409o00OO0O0, null, -1));
        return sb.toString();
    }
}
