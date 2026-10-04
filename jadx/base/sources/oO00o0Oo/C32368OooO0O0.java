package oO00o0Oo;

import o0o0OO0.C30416Oooo0OO;
import oO00o00o.InterfaceC32330OooO0O0;
import oO0OooOO.AbstractC33502OooOOo0;
import oO0OooOO.InterfaceC33501OooOOo;

/* JADX INFO: renamed from: oO00o0Oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32368OooO0O0<T> extends AbstractC33502OooOOo0<T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC32330OooO0O0<? super T> f116376OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AbstractC33502OooOOo0 f116377OooOo0o;

    /* JADX INFO: renamed from: oO00o0Oo.OooO0O0$OooO00o */
    public final class OooO00o implements InterfaceC33501OooOOo<T> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33501OooOOo<? super T> f116379OooOo0o;

        public OooO00o(InterfaceC33501OooOOo<? super T> interfaceC33501OooOOo) {
            this.f116379OooOo0o = interfaceC33501OooOOo;
        }

        @Override // oO0OooOO.InterfaceC33501OooOOo
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            this.f116379OooOo0o.OooO00o(oooO0O0);
        }

        @Override // oO0OooOO.InterfaceC33501OooOOo
        public final void onError(Throwable th) {
            this.f116379OooOo0o.onError(th);
        }

        @Override // oO0OooOO.InterfaceC33501OooOOo
        public final void onSuccess(T t) {
            InterfaceC33501OooOOo<? super T> interfaceC33501OooOOo = this.f116379OooOo0o;
            try {
                C32368OooO0O0.this.f116376OooOo.accept(t);
                interfaceC33501OooOOo.onSuccess(t);
            } catch (Throwable th) {
                C30416Oooo0OO.OooO00o(th);
                interfaceC33501OooOOo.onError(th);
            }
        }
    }

    public C32368OooO0O0(AbstractC33502OooOOo0 abstractC33502OooOOo0, InterfaceC32330OooO0O0 interfaceC32330OooO0O0) {
        this.f116377OooOo0o = abstractC33502OooOOo0;
        this.f116376OooOo = interfaceC32330OooO0O0;
    }

    @Override // oO0OooOO.AbstractC33502OooOOo0
    public final void OooO0o0(InterfaceC33501OooOOo<? super T> interfaceC33501OooOOo) {
        this.f116377OooOo0o.OooO00o(new OooO00o(interfaceC33501OooOOo));
    }
}
