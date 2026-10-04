package o0oooO0O;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooOO0o.C31610OooO;
import o0ooOO0o.C31611OooO00o;
import o0ooOoo.C31669OooO00o;
import o0ooOoo.InterfaceC31671OooO0OO;

/* JADX INFO: renamed from: o0oooO0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31811OooO0O0 implements InterfaceC31671OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C31436OooO0Oo f113436OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31611OooO00o f113437OooOo0o;

    public C31811OooO0O0(C31436OooO0Oo c31436OooO0Oo, C31611OooO00o c31611OooO00o) {
        this.f113437OooOo0o = c31611OooO00o;
        this.f113436OooOo = c31436OooO0Oo;
    }

    public final C31610OooO OooO00o() {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = this.f113436OooOo.o0000O0O(C31441OooOO0.f112277o0000);
        if (abstractC31434OooO0O0O0000O0O instanceof C31436OooO0Oo) {
            return new C31610OooO((C31436OooO0Oo) abstractC31434OooO0O0O0000O0O, this.f113437OooOo0o.f113014OooOooO);
        }
        return null;
    }

    public final List<AbstractC31817OooO0oo> OooO0O0() {
        AbstractC31817OooO0oo abstractC31817OooO0ooOooO00o;
        C31433OooO00o c31433OooO00oOooo0 = this.f113436OooOo.Oooo0(C31441OooOO0.f112294o0000OOO);
        if (c31433OooO00oOooo0 == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c31433OooO00oOooo0.f112214OooOo.size(); i++) {
            C31436OooO0Oo c31436OooO0Oo = (C31436OooO0Oo) c31433OooO00oOooo0.Oooo0OO(i);
            if (c31436OooO0Oo != null && (abstractC31817OooO0ooOooO00o = OooOOOo.OooOOOO.OooO00o(this, c31436OooO0Oo, null)) != null) {
                arrayList.add(abstractC31817OooO0ooOooO00o);
            }
        }
        return new C31669OooO00o(arrayList, c31433OooO00oOooo0);
    }

    public final void OooO0OO() throws IOException {
        C31809OooO c31809OooO = new C31809OooO(this);
        while (c31809OooO.hasNext()) {
            AbstractC31817OooO0oo abstractC31817OooO0oo = (AbstractC31817OooO0oo) c31809OooO.next();
            if (abstractC31817OooO0oo instanceof AbstractC31823OooOOOO) {
                ((AbstractC31823OooOOOO) abstractC31817OooO0oo).OooO0OO();
            }
        }
    }

    @Override // o0ooOoo.InterfaceC31671OooO0OO
    public final AbstractC31434OooO0O0 OooOOo0() {
        return this.f113436OooOo;
    }
}
