package Oooo0oO;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C24019OooOO0o;
import o000oOoO.C24639OooO0o;
import o000oOoO.C24640OooO0o0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OOo.C33693OooO0Oo;
import oO0o0oO0.InterfaceC33889OooO0o0;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0O implements InterfaceC33889OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f61215OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Serializable f61216OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Object f61217OooO0OO;

    public o000O0O() {
        this.f61216OooO0O0 = new AtomicReference(C24639OooO0o.f83459OooO00o);
        this.f61215OooO00o = new Object();
    }

    @Override // oO0o0oO0.InterfaceC33888OooO0o
    public InterfaceC32510OooOOo0 OooO00o() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.OooOO0o, oO0O000o.OooOOo0] */
    @Override // oO0o0oO0.InterfaceC33888OooO0o
    public InterfaceC32510OooOOo0 OooO0O0() {
        return (C24019OooOO0o) this.f61217OooO0OO;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.OooOO0o, oO0O000o.OooOOo0] */
    @Override // oO0o0oO0.InterfaceC33888OooO0o
    public InterfaceC32510OooOOo0 OooO0OO() {
        return (C24019OooOO0o) this.f61216OooO0O0;
    }

    @Override // oO0o0oO0.InterfaceC33888OooO0o
    public Object OooO0Oo() {
        return this.f61215OooO00o;
    }

    public void OooO0o(Object obj) {
        long id = Thread.currentThread().getId();
        if (id == C21021OooO0O0.f60881OooO00o) {
            this.f61217OooO0OO = obj;
            return;
        }
        synchronized (this.f61215OooO00o) {
            C24640OooO0o0 c24640OooO0o0 = (C24640OooO0o0) ((AtomicReference) this.f61216OooO0O0).get();
            int iOooO00o = c24640OooO0o0.OooO00o(id);
            if (iOooO00o >= 0) {
                c24640OooO0o0.f83462OooO0OO[iOooO00o] = obj;
            } else {
                ((AtomicReference) this.f61216OooO0O0).set(c24640OooO0o0.OooO0O0(id, obj));
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
        }
    }

    public Object OooO0o0() {
        long id = Thread.currentThread().getId();
        if (id == C21021OooO0O0.f60881OooO00o) {
            return this.f61217OooO0OO;
        }
        C24640OooO0o0 c24640OooO0o0 = (C24640OooO0o0) ((AtomicReference) this.f61216OooO0O0).get();
        int iOooO00o = c24640OooO0o0.OooO00o(id);
        if (iOooO00o >= 0) {
            return c24640OooO0o0.f83462OooO0OO[iOooO00o];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o000O0O(Object obj, InterfaceC32510OooOOo0 interfaceC32510OooOOo0, InterfaceC32510OooOOo0 interfaceC32510OooOOo02, C33693OooO0Oo c33693OooO0Oo) {
        this.f61215OooO00o = obj;
        this.f61216OooO0O0 = (C24019OooOO0o) interfaceC32510OooOOo0;
        this.f61217OooO0OO = (C24019OooOO0o) interfaceC32510OooOOo02;
    }
}
