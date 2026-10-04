package o0ooO0Oo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import o0ooOO0O.C31607OooO0O0;

/* JADX INFO: renamed from: o0ooO0Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31433OooO00o extends AbstractC31434OooO0O0 implements Iterable<AbstractC31434OooO0O0>, InterfaceC31452OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ArrayList f112214OooOo = new ArrayList();

    @Override // o0ooO0Oo.InterfaceC31452OooOo00
    public final boolean OooO0OO() {
        return false;
    }

    @Override // o0ooO0Oo.AbstractC31434OooO0O0
    public final Object OooOOoo(C31607OooO0O0 c31607OooO0O0) throws IOException {
        c31607OooO0O0.f112981OooOoO.write(C31607OooO0O0.f112974Ooooo00);
        Iterator it = this.f112214OooOo.iterator();
        int i = 0;
        while (it.hasNext()) {
            AbstractC31434OooO0O0 abstractC31434OooO0O0 = (AbstractC31434OooO0O0) it.next();
            if (abstractC31434OooO0O0 instanceof C31436OooO0Oo) {
                if (abstractC31434OooO0O0.f112215OooOo0o) {
                    c31607OooO0O0.OooOooo((C31436OooO0Oo) abstractC31434OooO0O0);
                } else {
                    c31607OooO0O0.OooO00o(abstractC31434OooO0O0);
                    c31607OooO0O0.Oooo00o(abstractC31434OooO0O0);
                }
            } else if (abstractC31434OooO0O0 instanceof C31445OooOOO0) {
                AbstractC31434OooO0O0 abstractC31434OooO0O02 = ((C31445OooOOO0) abstractC31434OooO0O0).f112467OooOo;
                if (c31607OooO0O0.f112995Oooo0o0 || (abstractC31434OooO0O02 instanceof C31436OooO0Oo) || abstractC31434OooO0O02 == null) {
                    c31607OooO0O0.OooO00o(abstractC31434OooO0O0);
                    c31607OooO0O0.Oooo00o(abstractC31434OooO0O0);
                } else {
                    abstractC31434OooO0O02.OooOOoo(c31607OooO0O0);
                }
            } else if (abstractC31434OooO0O0 == null) {
                C31442OooOO0O.f112464OooOoO0.OooOOoo(c31607OooO0O0);
            } else {
                abstractC31434OooO0O0.OooOOoo(c31607OooO0O0);
            }
            i++;
            if (it.hasNext()) {
                if (i % 10 == 0) {
                    c31607OooO0O0.f112981OooOoO.OooO00o();
                } else {
                    c31607OooO0O0.f112981OooOoO.write(C31607OooO0O0.f112961Oooo);
                }
            }
        }
        c31607OooO0O0.f112981OooOoO.write(C31607OooO0O0.f112975Ooooo0o);
        c31607OooO0O0.f112981OooOoO.OooO00o();
        return null;
    }

    public final void OooOooo(AbstractC31434OooO0O0 abstractC31434OooO0O0) {
        this.f112214OooOo.add(abstractC31434OooO0O0);
    }

    public final AbstractC31434OooO0O0 Oooo0(int i) {
        return (AbstractC31434OooO0O0) this.f112214OooOo.get(i);
    }

    public final void Oooo00o(C31433OooO00o c31433OooO00o) {
        if (c31433OooO00o != null) {
            this.f112214OooOo.addAll(c31433OooO00o.f112214OooOo);
        }
    }

    public final AbstractC31434OooO0O0 Oooo0OO(int i) {
        AbstractC31434OooO0O0 abstractC31434OooO0O0 = (AbstractC31434OooO0O0) this.f112214OooOo.get(i);
        if (abstractC31434OooO0O0 instanceof C31445OooOOO0) {
            abstractC31434OooO0O0 = ((C31445OooOOO0) abstractC31434OooO0O0).f112467OooOo;
        }
        if (abstractC31434OooO0O0 instanceof C31442OooOO0O) {
            return null;
        }
        return abstractC31434OooO0O0;
    }

    @Override // java.lang.Iterable
    public final Iterator<AbstractC31434OooO0O0> iterator() {
        return this.f112214OooOo.iterator();
    }

    public final void o0000O0O(int i, AbstractC31434OooO0O0 abstractC31434OooO0O0) {
        this.f112214OooOo.set(i, abstractC31434OooO0O0);
    }

    public final AbstractC31434OooO0O0 o0Oo0oo(int i) {
        return (AbstractC31434OooO0O0) this.f112214OooOo.remove(i);
    }

    public final String toString() {
        return "COSArray{" + this.f112214OooOo + "}";
    }
}
