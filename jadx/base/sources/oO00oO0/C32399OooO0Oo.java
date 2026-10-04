package oO00oO0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import oO00oOO.RunnableC32421OooO0oo;
import oO0OO0oO.InterfaceC32925OooO0O0;
import oO0OO0oO.InterfaceC32926OooO0OO;
import oO0o0OO.C33669o000oOoO;
import oOo00o0o.C34554OooO00o;
import oOo00oO0.C34561OooO0O0;

/* JADX INFO: renamed from: oO00oO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32399OooO0Oo implements InterfaceC32925OooO0O0, InterfaceC32926OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public volatile boolean f116504OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public LinkedList f116505OooOo0o;

    @Override // oO0OO0oO.InterfaceC32926OooO0OO
    public final boolean OooO00o(InterfaceC32925OooO0O0 interfaceC32925OooO0O0) {
        if (this.f116504OooOo) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f116504OooOo) {
                    return false;
                }
                LinkedList linkedList = this.f116505OooOo0o;
                if (linkedList != null && linkedList.remove(interfaceC32925OooO0O0)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // oO0OO0oO.InterfaceC32926OooO0OO
    public final boolean OooO0O0(InterfaceC32925OooO0O0 interfaceC32925OooO0O0) {
        if (!OooO00o(interfaceC32925OooO0O0)) {
            return false;
        }
        ((RunnableC32421OooO0oo) interfaceC32925OooO0O0).dispose();
        return true;
    }

    @Override // oO0OO0oO.InterfaceC32926OooO0OO
    public final boolean OooO0OO(InterfaceC32925OooO0O0 interfaceC32925OooO0O0) {
        if (!this.f116504OooOo) {
            synchronized (this) {
                try {
                    if (!this.f116504OooOo) {
                        LinkedList linkedList = this.f116505OooOo0o;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f116505OooOo0o = linkedList;
                        }
                        linkedList.add(interfaceC32925OooO0O0);
                        return true;
                    }
                } finally {
                }
            }
        }
        interfaceC32925OooO0O0.dispose();
        return false;
    }

    @Override // oO0OO0oO.InterfaceC32925OooO0O0
    public final void dispose() {
        if (this.f116504OooOo) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f116504OooOo) {
                    return;
                }
                this.f116504OooOo = true;
                LinkedList linkedList = this.f116505OooOo0o;
                ArrayList arrayList = null;
                this.f116505OooOo0o = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    try {
                        ((InterfaceC32925OooO0O0) it.next()).dispose();
                    } catch (Throwable th) {
                        C33669o000oOoO.OooO0O0(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new C34554OooO00o(arrayList);
                    }
                    throw C34561OooO0O0.OooO0O0((Throwable) arrayList.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
