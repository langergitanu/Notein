package ooOOo0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import o0o0OO0.C30416Oooo0OO;
import oO00o0o0.RunnableC32383OooO0oo;
import oO00o0oO.C32390OooO0o;

/* JADX INFO: renamed from: ooOOo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35111OooO0Oo implements oO0OOO00.OooO0O0, InterfaceC35108OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public volatile boolean f126095OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public LinkedList f126096OooOo0o;

    @Override // ooOOo0.InterfaceC35108OooO00o
    public final boolean OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
        if (!this.f126095OooOo) {
            synchronized (this) {
                try {
                    if (!this.f126095OooOo) {
                        LinkedList linkedList = this.f126096OooOo0o;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f126096OooOo0o = linkedList;
                        }
                        linkedList.add(oooO0O0);
                        return true;
                    }
                } finally {
                }
            }
        }
        oooO0O0.dispose();
        return false;
    }

    @Override // ooOOo0.InterfaceC35108OooO00o
    public final boolean OooO0O0(oO0OOO00.OooO0O0 oooO0O0) {
        if (!OooO0OO(oooO0O0)) {
            return false;
        }
        ((RunnableC32383OooO0oo) oooO0O0).dispose();
        return true;
    }

    @Override // ooOOo0.InterfaceC35108OooO00o
    public final boolean OooO0OO(oO0OOO00.OooO0O0 oooO0O0) {
        if (this.f126095OooOo) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f126095OooOo) {
                    return false;
                }
                LinkedList linkedList = this.f126096OooOo0o;
                if (linkedList != null && linkedList.remove(oooO0O0)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // oO0OOO00.OooO0O0
    public final void dispose() {
        if (this.f126095OooOo) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f126095OooOo) {
                    return;
                }
                this.f126095OooOo = true;
                LinkedList linkedList = this.f126096OooOo0o;
                ArrayList arrayList = null;
                this.f126096OooOo0o = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    try {
                        ((oO0OOO00.OooO0O0) it.next()).dispose();
                    } catch (Throwable th) {
                        C30416Oooo0OO.OooO00o(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new oO00o00O.OooO00o(arrayList);
                    }
                    throw C32390OooO0o.OooO0OO((Throwable) arrayList.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
