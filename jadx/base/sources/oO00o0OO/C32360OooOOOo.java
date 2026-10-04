package oO00o0OO;

import java.util.concurrent.atomic.AtomicReference;
import o0Oo0oOo.o00Oo0;
import o0o0OO0.C30416Oooo0OO;
import oO00o00o.InterfaceC32331OooO0OO;
import oO0OooOO.AbstractC33485OooO;
import oO0OooOO.InterfaceC33495OooOO0O;
import oO0OooOO.InterfaceC33496OooOO0o;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: renamed from: oO00o0OO.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32360OooOOOo<T> extends AbstractC32346OooO00o<T, T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC32331OooO0OO<? super Throwable, ? extends InterfaceC33496OooOO0o<? extends T>> f116333OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final boolean f116334OooOoO0;

    /* JADX INFO: renamed from: oO00o0OO.OooOOOo$OooO00o */
    public static final class OooO00o<T> extends AtomicReference<oO0OOO00.OooO0O0> implements InterfaceC33495OooOO0O<T>, oO0OOO00.OooO0O0 {
        private static final long serialVersionUID = 2026620218879969836L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final InterfaceC32331OooO0OO<? super Throwable, ? extends InterfaceC33496OooOO0o<? extends T>> f116335OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33495OooOO0O<? super T> f116336OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final boolean f116337OooOoO0;

        /* JADX INFO: renamed from: oO00o0OO.OooOOOo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20220OooO00o<T> implements InterfaceC33495OooOO0O<T> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final OooO00o f116338OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final InterfaceC33495OooOO0O<? super T> f116339OooOo0o;

            public C20220OooO00o(InterfaceC33495OooOO0O interfaceC33495OooOO0O, OooO00o oooO00o) {
                this.f116339OooOo0o = interfaceC33495OooOO0O;
                this.f116338OooOo = oooO00o;
            }

            @Override // oO0OooOO.InterfaceC33495OooOO0O
            public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
                EnumC35109OooO0O0.OooO0Oo(this.f116338OooOo, oooO0O0);
            }

            @Override // oO0OooOO.InterfaceC33495OooOO0O
            public final void onComplete() {
                this.f116339OooOo0o.onComplete();
            }

            @Override // oO0OooOO.InterfaceC33495OooOO0O
            public final void onError(Throwable th) {
                this.f116339OooOo0o.onError(th);
            }

            @Override // oO0OooOO.InterfaceC33495OooOO0O
            public final void onSuccess(T t) {
                this.f116339OooOo0o.onSuccess(t);
            }
        }

        public OooO00o(InterfaceC33495OooOO0O<? super T> interfaceC33495OooOO0O, InterfaceC32331OooO0OO<? super Throwable, ? extends InterfaceC33496OooOO0o<? extends T>> interfaceC32331OooO0OO, boolean z) {
            this.f116336OooOo0o = interfaceC33495OooOO0O;
            this.f116335OooOo = interfaceC32331OooO0OO;
            this.f116337OooOoO0 = z;
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            if (EnumC35109OooO0O0.OooO0Oo(this, oooO0O0)) {
                this.f116336OooOo0o.OooO00o(this);
            }
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            EnumC35109OooO0O0.OooO00o(this);
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onComplete() {
            this.f116336OooOo0o.onComplete();
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onError(Throwable th) {
            boolean z = this.f116337OooOoO0;
            InterfaceC33495OooOO0O<? super T> interfaceC33495OooOO0O = this.f116336OooOo0o;
            if (!z && !(th instanceof Exception)) {
                interfaceC33495OooOO0O.onError(th);
                return;
            }
            try {
                InterfaceC33496OooOO0o<? extends T> interfaceC33496OooOO0oApply = this.f116335OooOo.apply(th);
                o00Oo0.OooO00o(interfaceC33496OooOO0oApply, "The resumeFunction returned a null MaybeSource");
                InterfaceC33496OooOO0o<? extends T> interfaceC33496OooOO0o = interfaceC33496OooOO0oApply;
                EnumC35109OooO0O0.OooO0OO(this, null);
                interfaceC33496OooOO0o.OooO00o(new C20220OooO00o(interfaceC33495OooOO0O, this));
            } catch (Throwable th2) {
                C30416Oooo0OO.OooO00o(th2);
                interfaceC33495OooOO0O.onError(new oO00o00O.OooO00o(th, th2));
            }
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onSuccess(T t) {
            this.f116336OooOo0o.onSuccess(t);
        }
    }

    public C32360OooOOOo(AbstractC33485OooO abstractC33485OooO, InterfaceC32331OooO0OO interfaceC32331OooO0OO) {
        super(abstractC33485OooO);
        this.f116333OooOo = interfaceC32331OooO0OO;
        this.f116334OooOoO0 = true;
    }

    @Override // oO0OooOO.AbstractC33485OooO
    public final void OooO0OO(InterfaceC33495OooOO0O<? super T> interfaceC33495OooOO0O) {
        this.f116290OooOo0o.OooO00o(new OooO00o(interfaceC33495OooOO0O, this.f116333OooOo, this.f116334OooOoO0));
    }
}
