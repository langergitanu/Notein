package o0ooo0;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import o0ooO0O.InterfaceC31429OooO00o;
import o0ooO0OO.C31431OooO00o;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.AbstractC31443OooOO0o;
import o0ooO0Oo.C31448OooOOo;
import o0ooO0oo.C31491OooO0oO;
import o0ooOoo.C31676OooO0oo;
import o0ooOoo.InterfaceC31671OooO0OO;

/* JADX INFO: renamed from: o0ooo0.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31730OooOoOO implements InterfaceC31671OooO0OO, InterfaceC31429OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31448OooOOo f113352OooOo0o;

    public C31730OooOoOO(C31448OooOOo c31448OooOOo) {
        this.f113352OooOo0o = c31448OooOOo;
    }

    @Override // o0ooO0O.InterfaceC31429OooO00o
    public final InputStream OooO00o() throws IOException {
        return this.f113352OooOo0o.o000o00O();
    }

    public final C31676OooO0oo OooO0O0() throws IOException {
        ArrayList arrayList = new ArrayList();
        C31491OooO0oO c31491OooO0oO = new C31491OooO0oO(this);
        for (Object objOooOo0O = c31491OooO0oO.OooOo0O(); objOooOo0O != null; objOooOo0O = c31491OooO0oO.OooOo0O()) {
            if (objOooOo0O instanceof C31431OooO00o) {
                if (!((C31431OooO00o) objOooOo0O).f112205OooO00o.equals("d1") || arrayList.size() != 6) {
                    return null;
                }
                for (int i = 0; i < 6; i++) {
                    if (!(arrayList.get(i) instanceof AbstractC31443OooOO0o)) {
                        return null;
                    }
                }
                return new C31676OooO0oo(((AbstractC31443OooOO0o) arrayList.get(2)).OooOooo(), ((AbstractC31443OooOO0o) arrayList.get(3)).OooOooo(), ((AbstractC31443OooOO0o) arrayList.get(4)).OooOooo() - ((AbstractC31443OooOO0o) arrayList.get(2)).OooOooo(), ((AbstractC31443OooOO0o) arrayList.get(5)).OooOooo() - ((AbstractC31443OooOO0o) arrayList.get(3)).OooOooo());
            }
            arrayList.add((AbstractC31434OooO0O0) objOooOo0O);
        }
        return null;
    }

    @Override // o0ooOoo.InterfaceC31671OooO0OO
    public final AbstractC31434OooO0O0 OooOOo0() {
        return this.f113352OooOo0o;
    }
}
