package o0oooO00;

import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooOoo.InterfaceC31671OooO0OO;
import o0ooo0o.AbstractC31763OooO0O0;
import o0ooo0o.C31762OooO00o;
import o0ooo0o.C31764OooO0OO;
import o0ooo0o.C31765OooO0Oo;

/* JADX INFO: renamed from: o0oooO00.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31805OooOOO0 implements InterfaceC31671OooO0OO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31436OooO0Oo f113424OooOo0o;

    public C31805OooOOO0(C31436OooO0Oo c31436OooO0Oo) {
        this.f113424OooOo0o = c31436OooO0Oo;
    }

    public final C31762OooO00o OooO00o(C31441OooOO0 c31441OooOO0) {
        AbstractC31763OooO0O0 abstractC31763OooO0O0;
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0OoO0o = this.f113424OooOo0o.o0OoO0o(c31441OooOO0);
        if (!(abstractC31434OooO0O0O0OoO0o instanceof C31433OooO00o)) {
            return null;
        }
        C31433OooO00o c31433OooO00o = (C31433OooO00o) abstractC31434OooO0O0O0OoO0o;
        int size = c31433OooO00o.f112214OooOo.size();
        if (size == 1) {
            abstractC31763OooO0O0 = C31764OooO0OO.f113413OooOo0o;
        } else {
            if (size != 3) {
                return null;
            }
            abstractC31763OooO0O0 = C31765OooO0Oo.f113414OooOo;
        }
        return new C31762OooO00o(c31433OooO00o, abstractC31763OooO0O0);
    }

    @Override // o0ooOoo.InterfaceC31671OooO0OO
    public final AbstractC31434OooO0O0 OooOOo0() {
        return this.f113424OooOo0o;
    }
}
