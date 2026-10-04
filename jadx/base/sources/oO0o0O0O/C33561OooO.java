package oO0o0O0O;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32484OooO0oo;
import oO00ooo0.EnumC32485OooO00o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0O0O.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33561OooO<T> extends AbstractC33570OooOO0<T> implements Iterator<T>, Continuation<C32460OooOooO>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public T f121184OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f121185OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Continuation<? super C32460OooOooO> f121186OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator<? extends T> f121187OooOoO0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0o0O0O.AbstractC33570OooOO0
    public final void OooO00o(Object obj, AbstractC32484OooO0oo abstractC32484OooO0oo) {
        this.f121184OooOo = obj;
        this.f121185OooOo0o = 3;
        this.f121186OooOoO = abstractC32484OooO0oo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
    }

    @Override // oO0o0O0O.AbstractC33570OooOO0
    public final Object OooO0Oo(Iterator<? extends T> it, Continuation<? super C32460OooOooO> continuation) {
        if (!it.hasNext()) {
            return C32460OooOooO.f116667OooO00o;
        }
        this.f121187OooOoO0 = it;
        this.f121185OooOo0o = 2;
        this.f121186OooOoO = continuation;
        return EnumC32485OooO00o.f116726OooOo0o;
    }

    public final RuntimeException OooO0o0() {
        int i = this.f121185OooOo0o;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f121185OooOo0o);
    }

    @Override // kotlin.coroutines.Continuation
    public final InterfaceC34415OooO0oo getContext() {
        return oOo0000O.OooO.f123416OooOo0o;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f121185OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw OooO0o0();
                }
                Iterator<? extends T> it = this.f121187OooOoO0;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(it);
                if (it.hasNext()) {
                    this.f121185OooOo0o = 2;
                    return true;
                }
                this.f121187OooOoO0 = null;
            }
            this.f121185OooOo0o = 5;
            Continuation<? super C32460OooOooO> continuation = this.f121186OooOoO;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(continuation);
            this.f121186OooOoO = null;
            continuation.resumeWith(C32460OooOooO.f116667OooO00o);
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        int i = this.f121185OooOo0o;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f121185OooOo0o = 1;
            Iterator<? extends T> it = this.f121187OooOoO0;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(it);
            return it.next();
        }
        if (i != 3) {
            throw OooO0o0();
        }
        this.f121185OooOo0o = 0;
        T t = this.f121184OooOo;
        this.f121184OooOo = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        C32446OooOOOo.OooO0O0(obj);
        this.f121185OooOo0o = 4;
    }
}
