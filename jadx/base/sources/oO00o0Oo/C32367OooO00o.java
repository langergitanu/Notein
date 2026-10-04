package oO00o0Oo;

import com.aspose.slides.internal.p332p7.OooO0o;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager;
import o0o0OO0.C30416Oooo0OO;
import oO0OooOO.AbstractC33502OooOOo0;
import oO0OooOO.InterfaceC33501OooOOo;

/* JADX INFO: renamed from: oO00o0Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32367OooO00o<T> extends AbstractC33502OooOOo0<T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO0o f116372OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AbstractC33502OooOOo0 f116373OooOo0o;

    /* JADX INFO: renamed from: oO00o0Oo.OooO00o$OooO00o, reason: collision with other inner class name */
    public final class C20222OooO00o implements InterfaceC33501OooOOo<T> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33501OooOOo<? super T> f116375OooOo0o;

        public C20222OooO00o(InterfaceC33501OooOOo<? super T> interfaceC33501OooOOo) {
            this.f116375OooOo0o = interfaceC33501OooOOo;
        }

        @Override // oO0OooOO.InterfaceC33501OooOOo
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            this.f116375OooOo0o.OooO00o(oooO0O0);
        }

        @Override // oO0OooOO.InterfaceC33501OooOOo
        public final void onError(Throwable th) {
            try {
                C32367OooO00o.this.f116372OooOo.getClass();
                InAppMessageStreamManager.lambda$createFirebaseInAppMessageStream$7(th);
            } catch (Throwable th2) {
                C30416Oooo0OO.OooO00o(th2);
                th = new oO00o00O.OooO00o(th, th2);
            }
            this.f116375OooOo0o.onError(th);
        }

        @Override // oO0OooOO.InterfaceC33501OooOOo
        public final void onSuccess(T t) {
            this.f116375OooOo0o.onSuccess(t);
        }
    }

    public C32367OooO00o(AbstractC33502OooOOo0 abstractC33502OooOOo0, OooO0o oooO0o) {
        this.f116373OooOo0o = abstractC33502OooOOo0;
        this.f116372OooOo = oooO0o;
    }

    @Override // oO0OooOO.AbstractC33502OooOOo0
    public final void OooO0o0(InterfaceC33501OooOOo<? super T> interfaceC33501OooOOo) {
        this.f116373OooOo0o.OooO00o(new C20222OooO00o(interfaceC33501OooOOo));
    }
}
