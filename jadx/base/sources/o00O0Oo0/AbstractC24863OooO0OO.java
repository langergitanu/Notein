package o00O0Oo0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import o00O0O0o.OooOO0O;
import o00O0OOo.C24855OooO0Oo;
import o00O0OOo.InterfaceC24852OooO00o;
import o00O0OOo.InterfaceC24854OooO0OO;
import o00O0OoO.C24880OooOOoo;
import oo0oOO0.AbstractC35000OooO0Oo;

/* JADX INFO: renamed from: o00O0Oo0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24863OooO0OO<T> implements InterfaceC24852OooO00o<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f84430OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public T f84431OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractC35000OooO0Oo<T> f84432OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C24855OooO0Oo f84433OooO0Oo;

    public AbstractC24863OooO0OO(AbstractC35000OooO0Oo<T> abstractC35000OooO0Oo) {
        this.f84432OooO0OO = abstractC35000OooO0Oo;
    }

    @Override // o00O0OOo.InterfaceC24852OooO00o
    public final void OooO00o(T t) {
        this.f84431OooO0O0 = t;
        OooO0o0(this.f84433OooO0Oo, t);
    }

    public abstract boolean OooO0O0(C24880OooOOoo c24880OooOOoo);

    public abstract boolean OooO0OO(T t);

    public final void OooO0Oo(Collection collection) {
        this.f84430OooO00o.clear();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            C24880OooOOoo c24880OooOOoo = (C24880OooOOoo) it.next();
            if (OooO0O0(c24880OooOOoo)) {
                this.f84430OooO00o.add(c24880OooOOoo.f84457OooO00o);
            }
        }
        if (this.f84430OooO00o.isEmpty()) {
            this.f84432OooO0OO.OooO0O0(this);
        } else {
            AbstractC35000OooO0Oo<T> abstractC35000OooO0Oo = this.f84432OooO0OO;
            synchronized (abstractC35000OooO0Oo.f125691OooO0OO) {
                try {
                    if (abstractC35000OooO0Oo.f125692OooO0Oo.add(this)) {
                        if (abstractC35000OooO0Oo.f125692OooO0Oo.size() == 1) {
                            abstractC35000OooO0Oo.f125693OooO0o0 = abstractC35000OooO0Oo.OooO00o();
                            OooOO0O.OooO0OO().OooO00o(AbstractC35000OooO0Oo.f125688OooO0o, String.format("%s: initial state = %s", abstractC35000OooO0Oo.getClass().getSimpleName(), abstractC35000OooO0Oo.f125693OooO0o0), new Throwable[0]);
                            abstractC35000OooO0Oo.OooO0Oo();
                        }
                        OooO00o(abstractC35000OooO0Oo.f125693OooO0o0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        OooO0o0(this.f84433OooO0Oo, this.f84431OooO0O0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0o0(C24855OooO0Oo c24855OooO0Oo, Object obj) {
        if (this.f84430OooO00o.isEmpty() || c24855OooO0Oo == null) {
            return;
        }
        if (obj == 0 || OooO0OO(obj)) {
            ArrayList arrayList = this.f84430OooO00o;
            synchronized (c24855OooO0Oo.f84407OooO0OO) {
                InterfaceC24854OooO0OO interfaceC24854OooO0OO = c24855OooO0Oo.f84405OooO00o;
                if (interfaceC24854OooO0OO != null) {
                    interfaceC24854OooO0OO.OooO0Oo(arrayList);
                }
            }
            return;
        }
        ArrayList<String> arrayList2 = this.f84430OooO00o;
        synchronized (c24855OooO0Oo.f84407OooO0OO) {
            try {
                ArrayList arrayList3 = new ArrayList();
                for (String str : arrayList2) {
                    if (c24855OooO0Oo.OooO00o(str)) {
                        OooOO0O.OooO0OO().OooO00o(C24855OooO0Oo.f84404OooO0Oo, "Constraints met for " + str, new Throwable[0]);
                        arrayList3.add(str);
                    }
                }
                InterfaceC24854OooO0OO interfaceC24854OooO0OO2 = c24855OooO0Oo.f84405OooO00o;
                if (interfaceC24854OooO0OO2 != null) {
                    interfaceC24854OooO0OO2.OooO0o(arrayList3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
