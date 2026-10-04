package oO0OOOoO;

import o0o0OO0.C30416Oooo0OO;
import oO00o0.OooO00o;
import oO0OOOoo.InterfaceC33026OooO0Oo;
import oO0OooOO.AbstractC33498OooOOO0;
import oO0OooOO.AbstractC33502OooOOo0;
import oO0OooOO.InterfaceC33499OooOOOO;
import oO0OooOO.InterfaceC33501OooOOo;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: renamed from: oO0OOOoO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33011OooO0OO<T> extends AbstractC33502OooOOo0<Boolean> implements InterfaceC33026OooO0Oo<Boolean> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO00o.C32323OooO0o0 f119416OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C33018OooOO0O f119417OooOo0o;

    /* JADX INFO: renamed from: oO0OOOoO.OooO0OO$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33499OooOOOO<T>, oO0OOO00.OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final OooO00o.C32323OooO0o0 f119418OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33501OooOOo<? super Boolean> f119419OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public boolean f119420OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public oO0OOO00.OooO0O0 f119421OooOoO0;

        public OooO00o(InterfaceC33501OooOOo interfaceC33501OooOOo, OooO00o.C32323OooO0o0 c32323OooO0o0) {
            this.f119419OooOo0o = interfaceC33501OooOOo;
            this.f119418OooOo = c32323OooO0o0;
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            if (EnumC35109OooO0O0.OooO0o0(this.f119421OooOoO0, oooO0O0)) {
                this.f119421OooOoO0 = oooO0O0;
                this.f119419OooOo0o.OooO00o(this);
            }
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            this.f119421OooOoO0.dispose();
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void onComplete() {
            if (this.f119420OooOoO) {
                return;
            }
            this.f119420OooOoO = true;
            this.f119419OooOo0o.onSuccess(Boolean.FALSE);
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void onError(Throwable th) {
            if (this.f119420OooOoO) {
                oO0OOO0O.OooO00o.OooO0O0(th);
            } else {
                this.f119420OooOoO = true;
                this.f119419OooOo0o.onError(th);
            }
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void onNext(T t) {
            if (this.f119420OooOoO) {
                return;
            }
            try {
                if (this.f119418OooOo.test(t)) {
                    this.f119420OooOoO = true;
                    this.f119421OooOoO0.dispose();
                    this.f119419OooOo0o.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th) {
                C30416Oooo0OO.OooO00o(th);
                this.f119421OooOoO0.dispose();
                onError(th);
            }
        }
    }

    public C33011OooO0OO(C33018OooOO0O c33018OooOO0O, OooO00o.C32323OooO0o0 c32323OooO0o0) {
        this.f119417OooOo0o = c33018OooOO0O;
        this.f119416OooOo = c32323OooO0o0;
    }

    @Override // oO0OOOoo.InterfaceC33026OooO0Oo
    public final AbstractC33498OooOOO0<Boolean> OooO0O0() {
        return new C33010OooO0O0(this.f119417OooOo0o, this.f119416OooOo);
    }

    @Override // oO0OooOO.AbstractC33502OooOOo0
    public final void OooO0o0(InterfaceC33501OooOOo<? super Boolean> interfaceC33501OooOOo) {
        this.f119417OooOo0o.OooO0O0(new OooO00o(interfaceC33501OooOOo, this.f119416OooOo));
    }
}
