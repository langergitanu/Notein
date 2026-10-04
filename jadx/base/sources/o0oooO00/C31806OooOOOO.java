package o0oooO00;

import java.util.HashMap;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31448OooOOo;
import o0ooOoo.C31670OooO0O0;
import o0ooOoo.InterfaceC31671OooO0OO;

/* JADX INFO: renamed from: o0oooO00.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31806OooOOOO implements InterfaceC31671OooO0OO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C31436OooO0Oo f113425OooOo0o;

    public final C31807OooOOOo OooO00o() {
        C31436OooO0Oo c31436OooO0Oo = this.f113425OooOo0o;
        if (c31436OooO0Oo instanceof C31448OooOOo) {
            return new C31807OooOOOo((C31448OooOOo) c31436OooO0Oo);
        }
        throw new IllegalStateException("This entry is not an appearance stream");
    }

    public final C31670OooO0O0 OooO0O0() {
        C31436OooO0Oo c31436OooO0Oo = this.f113425OooOo0o;
        if (c31436OooO0Oo instanceof C31448OooOOo) {
            throw new IllegalStateException("This entry is not an appearance subdictionary");
        }
        HashMap map = new HashMap();
        for (C31441OooOO0 c31441OooOO0 : c31436OooO0Oo.f112222OooOoO0.keySet()) {
            AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = c31436OooO0Oo.o0000O0O(c31441OooOO0);
            if (abstractC31434OooO0O0O0000O0O instanceof C31448OooOOo) {
                map.put(c31441OooOO0, new C31807OooOOOo((C31448OooOOo) abstractC31434OooO0O0O0000O0O));
            }
        }
        return new C31670OooO0O0(map, c31436OooO0Oo);
    }

    @Override // o0ooOoo.InterfaceC31671OooO0OO
    public final AbstractC31434OooO0O0 OooOOo0() {
        return this.f113425OooOo0o;
    }
}
