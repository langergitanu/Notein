package oOo0000O;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import oO00ooO.C32445OooOOOO;
import oO00ooo.InterfaceC32480OooO0Oo;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0<T> implements Continuation<T>, InterfaceC32480OooO0Oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<OooOO0<?>, Object> f123426OooOo = AtomicReferenceFieldUpdater.newUpdater(OooOO0.class, Object.class, "result");

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Continuation<T> f123427OooOo0o;
    private volatile Object result;

    public OooOO0(Continuation continuation, EnumC32485OooO00o enumC32485OooO00o) {
        this.f123427OooOo0o = continuation;
        this.result = enumC32485OooO00o;
    }

    public final Object OooO00o() throws Throwable {
        Object obj = this.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116725OooOo;
        if (obj == enumC32485OooO00o) {
            AtomicReferenceFieldUpdater<OooOO0<?>, Object> atomicReferenceFieldUpdater = f123426OooOo;
            EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC32485OooO00o, enumC32485OooO00o2)) {
                if (atomicReferenceFieldUpdater.get(this) != enumC32485OooO00o) {
                    obj = this.result;
                }
            }
            return EnumC32485OooO00o.f116726OooOo0o;
        }
        if (obj == EnumC32485OooO00o.f116728OooOoO0) {
            return EnumC32485OooO00o.f116726OooOo0o;
        }
        if (obj instanceof C32445OooOOOO.OooO00o) {
            throw ((C32445OooOOOO.OooO00o) obj).f116640OooOo0o;
        }
        return obj;
    }

    @Override // oO00ooo.InterfaceC32480OooO0Oo
    public final InterfaceC32480OooO0Oo getCallerFrame() {
        Continuation<T> continuation = this.f123427OooOo0o;
        if (continuation instanceof InterfaceC32480OooO0Oo) {
            return (InterfaceC32480OooO0Oo) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final InterfaceC34415OooO0oo getContext() {
        return this.f123427OooOo0o.getContext();
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116725OooOo;
            if (obj2 == enumC32485OooO00o) {
                AtomicReferenceFieldUpdater<OooOO0<?>, Object> atomicReferenceFieldUpdater = f123426OooOo;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC32485OooO00o, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != enumC32485OooO00o) {
                        break;
                    }
                }
                return;
            }
            EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
            if (obj2 != enumC32485OooO00o2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater<OooOO0<?>, Object> atomicReferenceFieldUpdater2 = f123426OooOo;
            EnumC32485OooO00o enumC32485OooO00o3 = EnumC32485OooO00o.f116728OooOoO0;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, enumC32485OooO00o2, enumC32485OooO00o3)) {
                if (atomicReferenceFieldUpdater2.get(this) != enumC32485OooO00o2) {
                    break;
                }
            }
            this.f123427OooOo0o.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f123427OooOo0o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OooOO0(Continuation<? super T> continuation) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116725OooOo;
        this.f123427OooOo0o = continuation;
        this.result = enumC32485OooO00o;
    }
}
