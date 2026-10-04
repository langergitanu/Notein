package oO00o0OO;

import java.util.concurrent.atomic.AtomicReference;
import o0Oo0oOo.o00Oo0;
import o0o0OO0.C30416Oooo0OO;
import oO00o00o.InterfaceC32331OooO0OO;
import oO0OooOO.AbstractC33485OooO;
import oO0OooOO.InterfaceC33495OooOO0O;
import oO0OooOO.InterfaceC33496OooOO0o;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: renamed from: oO00o0OO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32353OooO0oo<T, R> extends AbstractC32346OooO00o<T, R> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC32331OooO0OO<? super T, ? extends InterfaceC33496OooOO0o<? extends R>> f116310OooOo;

    /* JADX INFO: renamed from: oO00o0OO.OooO0oo$OooO00o */
    public static final class OooO00o<T, R> extends AtomicReference<oO0OOO00.OooO0O0> implements InterfaceC33495OooOO0O<T>, oO0OOO00.OooO0O0 {
        private static final long serialVersionUID = 4375739915521278546L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final InterfaceC32331OooO0OO<? super T, ? extends InterfaceC33496OooOO0o<? extends R>> f116311OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33495OooOO0O<? super R> f116312OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public oO0OOO00.OooO0O0 f116313OooOoO0;

        /* JADX INFO: renamed from: oO00o0OO.OooO0oo$OooO00o$OooO00o, reason: collision with other inner class name */
        public final class C20219OooO00o implements InterfaceC33495OooOO0O<R> {
            public C20219OooO00o() {
            }

            @Override // oO0OooOO.InterfaceC33495OooOO0O
            public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
                EnumC35109OooO0O0.OooO0Oo(OooO00o.this, oooO0O0);
            }

            @Override // oO0OooOO.InterfaceC33495OooOO0O
            public final void onComplete() {
                OooO00o.this.f116312OooOo0o.onComplete();
            }

            @Override // oO0OooOO.InterfaceC33495OooOO0O
            public final void onError(Throwable th) {
                OooO00o.this.f116312OooOo0o.onError(th);
            }

            @Override // oO0OooOO.InterfaceC33495OooOO0O
            public final void onSuccess(R r) {
                OooO00o.this.f116312OooOo0o.onSuccess(r);
            }
        }

        public OooO00o(InterfaceC33495OooOO0O<? super R> interfaceC33495OooOO0O, InterfaceC32331OooO0OO<? super T, ? extends InterfaceC33496OooOO0o<? extends R>> interfaceC32331OooO0OO) {
            this.f116312OooOo0o = interfaceC33495OooOO0O;
            this.f116311OooOo = interfaceC32331OooO0OO;
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            if (EnumC35109OooO0O0.OooO0o0(this.f116313OooOoO0, oooO0O0)) {
                this.f116313OooOoO0 = oooO0O0;
                this.f116312OooOo0o.OooO00o(this);
            }
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            EnumC35109OooO0O0.OooO00o(this);
            this.f116313OooOoO0.dispose();
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onComplete() {
            this.f116312OooOo0o.onComplete();
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onError(Throwable th) {
            this.f116312OooOo0o.onError(th);
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onSuccess(T t) {
            try {
                InterfaceC33496OooOO0o<? extends R> interfaceC33496OooOO0oApply = this.f116311OooOo.apply(t);
                o00Oo0.OooO00o(interfaceC33496OooOO0oApply, "The mapper returned a null MaybeSource");
                InterfaceC33496OooOO0o<? extends R> interfaceC33496OooOO0o = interfaceC33496OooOO0oApply;
                if (EnumC35109OooO0O0.OooO0O0(get())) {
                    return;
                }
                interfaceC33496OooOO0o.OooO00o(new C20219OooO00o());
            } catch (Exception e) {
                C30416Oooo0OO.OooO00o(e);
                this.f116312OooOo0o.onError(e);
            }
        }
    }

    public C32353OooO0oo(AbstractC33485OooO abstractC33485OooO, InterfaceC32331OooO0OO interfaceC32331OooO0OO) {
        super(abstractC33485OooO);
        this.f116310OooOo = interfaceC32331OooO0OO;
    }

    @Override // oO0OooOO.AbstractC33485OooO
    public final void OooO0OO(InterfaceC33495OooOO0O<? super R> interfaceC33495OooOO0O) {
        this.f116290OooOo0o.OooO00o(new OooO00o(interfaceC33495OooOO0O, this.f116310OooOo));
    }
}
