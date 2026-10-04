package o0oooO0O;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;

/* JADX INFO: renamed from: o0oooO0O.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31809OooO implements Iterator<AbstractC31817OooO0oo> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayDeque f113429OooOo0o = new ArrayDeque();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Set<C31436OooO0Oo> f113428OooOo = Collections.newSetFromMap(new IdentityHashMap());

    public C31809OooO(C31811OooO0O0 c31811OooO0O0) {
        Iterator<AbstractC31817OooO0oo> it = c31811OooO0O0.OooO0O0().iterator();
        while (it.hasNext()) {
            OooO00o(it.next());
        }
    }

    public final void OooO00o(AbstractC31817OooO0oo abstractC31817OooO0oo) {
        this.f113429OooOo0o.add(abstractC31817OooO0oo);
        C31436OooO0Oo c31436OooO0Oo = abstractC31817OooO0oo.f113445OooOoO0;
        Set<C31436OooO0Oo> set = this.f113428OooOo;
        set.add(c31436OooO0Oo);
        if (abstractC31817OooO0oo instanceof C31819OooOO0O) {
            C31819OooOO0O c31819OooOO0O = (C31819OooOO0O) abstractC31817OooO0oo;
            ArrayList<AbstractC31817OooO0oo> arrayList = new ArrayList();
            C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112330o000Oo;
            C31436OooO0Oo c31436OooO0Oo2 = c31819OooOO0O.f113445OooOoO0;
            C31433OooO00o c31433OooO00oOooo0 = c31436OooO0Oo2.Oooo0(c31441OooOO0);
            if (c31433OooO00oOooo0 != null) {
                for (int i = 0; i < c31433OooO00oOooo0.f112214OooOo.size(); i++) {
                    AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO = c31433OooO00oOooo0.Oooo0OO(i);
                    if (abstractC31434OooO0O0Oooo0OO instanceof C31436OooO0Oo) {
                        abstractC31434OooO0O0Oooo0OO.getClass();
                        if (abstractC31434OooO0O0Oooo0OO == c31436OooO0Oo2) {
                            Log.w("PdfBox-Android", "Child field is same object as parent");
                        } else {
                            AbstractC31817OooO0oo abstractC31817OooO0ooOooO00o = OooOOOo.OooOOOO.OooO00o(c31819OooOO0O.f113444OooOo0o, (C31436OooO0Oo) abstractC31434OooO0O0Oooo0OO, c31819OooOO0O);
                            if (abstractC31817OooO0ooOooO00o != null) {
                                arrayList.add(abstractC31817OooO0ooOooO00o);
                            }
                        }
                    }
                }
            }
            for (AbstractC31817OooO0oo abstractC31817OooO0oo2 : arrayList) {
                if (set.contains(abstractC31817OooO0oo2.f113445OooOoO0)) {
                    Log.e("PdfBox-Android", "Child of field '" + abstractC31817OooO0oo.OooO00o() + "' already exists elsewhere, ignored to avoid recursion");
                } else {
                    OooO00o(abstractC31817OooO0oo2);
                }
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f113429OooOo0o.isEmpty();
    }

    @Override // java.util.Iterator
    public final AbstractC31817OooO0oo next() {
        if (hasNext()) {
            return (AbstractC31817OooO0oo) this.f113429OooOo0o.poll();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
