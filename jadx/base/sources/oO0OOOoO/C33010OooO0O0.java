package oO0OOOoO;

import o0o0OO0.C30416Oooo0OO;
import oO00o0.OooO00o;
import oO0OooOO.InterfaceC33499OooOOOO;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: renamed from: oO0OOOoO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33010OooO0O0<T> extends AbstractC33009OooO00o<T, Boolean> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO00o.C32323OooO0o0 f119411OooOo;

    /* JADX INFO: renamed from: oO0OOOoO.OooO0O0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33499OooOOOO<T>, oO0OOO00.OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final OooO00o.C32323OooO0o0 f119412OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33499OooOOOO<? super Boolean> f119413OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public boolean f119414OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public oO0OOO00.OooO0O0 f119415OooOoO0;

        public OooO00o(InterfaceC33499OooOOOO interfaceC33499OooOOOO, OooO00o.C32323OooO0o0 c32323OooO0o0) {
            this.f119413OooOo0o = interfaceC33499OooOOOO;
            this.f119412OooOo = c32323OooO0o0;
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            if (EnumC35109OooO0O0.OooO0o0(this.f119415OooOoO0, oooO0O0)) {
                this.f119415OooOoO0 = oooO0O0;
                this.f119413OooOo0o.OooO00o(this);
            }
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            this.f119415OooOoO0.dispose();
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void onComplete() {
            if (this.f119414OooOoO) {
                return;
            }
            this.f119414OooOoO = true;
            Boolean bool = Boolean.FALSE;
            InterfaceC33499OooOOOO<? super Boolean> interfaceC33499OooOOOO = this.f119413OooOo0o;
            interfaceC33499OooOOOO.onNext(bool);
            interfaceC33499OooOOOO.onComplete();
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void onError(Throwable th) {
            if (this.f119414OooOoO) {
                oO0OOO0O.OooO00o.OooO0O0(th);
            } else {
                this.f119414OooOoO = true;
                this.f119413OooOo0o.onError(th);
            }
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void onNext(T t) {
            if (this.f119414OooOoO) {
                return;
            }
            try {
                if (this.f119412OooOo.test(t)) {
                    this.f119414OooOoO = true;
                    this.f119415OooOoO0.dispose();
                    Boolean bool = Boolean.TRUE;
                    InterfaceC33499OooOOOO<? super Boolean> interfaceC33499OooOOOO = this.f119413OooOo0o;
                    interfaceC33499OooOOOO.onNext(bool);
                    interfaceC33499OooOOOO.onComplete();
                }
            } catch (Throwable th) {
                C30416Oooo0OO.OooO00o(th);
                this.f119415OooOoO0.dispose();
                onError(th);
            }
        }
    }

    public C33010OooO0O0(C33018OooOO0O c33018OooOO0O, OooO00o.C32323OooO0o0 c32323OooO0o0) {
        super(c33018OooOO0O);
        this.f119411OooOo = c32323OooO0o0;
    }

    @Override // oO0OooOO.AbstractC33498OooOOO0
    public final void OooO0OO(InterfaceC33499OooOOOO<? super Boolean> interfaceC33499OooOOOO) {
        this.f119410OooOo0o.OooO0O0(new OooO00o(interfaceC33499OooOOOO, this.f119411OooOo));
    }
}
