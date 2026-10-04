package oO0o0Ooo;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32480OooO0Oo;
import oO0o0OO.AbstractC33630OooOooO;
import oO0o0OO.AbstractC33647OoooOO0;
import oO0o0OO.AbstractC33655OooooO0;
import oO0o0OO.C33620OooOo;
import oO0o0OO.C33640Oooo0o0;
import oO0o0OO.o0000Ooo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0Ooo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33824OooO0o<T> extends AbstractC33647OoooOO0<T> implements InterfaceC32480OooO0Oo, Continuation<T> {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f121918OooOooO = AtomicReferenceFieldUpdater.newUpdater(C33824OooO0o.class, Object.class, "_reusableCancellableContinuation$volatile");

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final AbstractC33630OooOooO f121919OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final AbstractC32479OooO0OO f121920OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final Object f121921OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Object f121922OooOoo0;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    public C33824OooO0o(AbstractC33630OooOooO abstractC33630OooOooO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(-1);
        this.f121919OooOoO = abstractC33630OooOooO;
        this.f121920OooOoOO = abstractC32479OooO0OO;
        this.f121922OooOoo0 = C33826OooO0oO.f121924OooO00o;
        this.f121921OooOoo = C33844OooOoO0.OooO0O0(abstractC32479OooO0OO.getContext());
    }

    @Override // oO0o0OO.AbstractC33647OoooOO0
    public final Continuation<T> OooO0Oo() {
        return this;
    }

    @Override // oO0o0OO.AbstractC33647OoooOO0
    public final Object OooO0oo() {
        Object obj = this.f121922OooOoo0;
        this.f121922OooOoo0 = C33826OooO0oO.f121924OooO00o;
        return obj;
    }

    @Override // oO00ooo.InterfaceC32480OooO0Oo
    public final InterfaceC32480OooO0Oo getCallerFrame() {
        AbstractC32479OooO0OO abstractC32479OooO0OO = this.f121920OooOoOO;
        if (abstractC32479OooO0OO != null) {
            return abstractC32479OooO0OO;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final InterfaceC34415OooO0oo getContext() {
        return this.f121920OooOoOO.getContext();
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable thOooO00o = C32445OooOOOO.OooO00o(obj);
        Object c33620OooOo = thOooO00o == null ? obj : new C33620OooOo(false, thOooO00o);
        AbstractC32479OooO0OO abstractC32479OooO0OO = this.f121920OooOoOO;
        InterfaceC34415OooO0oo context = abstractC32479OooO0OO.getContext();
        AbstractC33630OooOooO abstractC33630OooOooO = this.f121919OooOoO;
        if (abstractC33630OooOooO.o000OOO(context)) {
            this.f121922OooOoo0 = c33620OooOo;
            this.f121326OooOoO0 = 0;
            abstractC33630OooOooO.o0OoO0o(abstractC32479OooO0OO.getContext(), this);
            return;
        }
        AbstractC33655OooooO0 abstractC33655OooooO0OooO00o = o0000Ooo.OooO00o();
        if (abstractC33655OooooO0OooO00o.f121336OooOoO0 >= 4294967296L) {
            this.f121922OooOoo0 = c33620OooOo;
            this.f121326OooOoO0 = 0;
            abstractC33655OooooO0OooO00o.o000Oo00(this);
            return;
        }
        abstractC33655OooooO0OooO00o.o000Oo0O(true);
        try {
            InterfaceC34415OooO0oo context2 = abstractC32479OooO0OO.getContext();
            Object objOooO0OO = C33844OooOoO0.OooO0OO(context2, this.f121921OooOoo);
            try {
                abstractC32479OooO0OO.resumeWith(obj);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                while (abstractC33655OooooO0OooO00o.o000Oo()) {
                }
            } finally {
                C33844OooOoO0.OooO00o(context2, objOooO0OO);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f121919OooOoO + ", " + C33640Oooo0o0.OooO0O0(this.f121920OooOoOO) + ']';
    }
}
