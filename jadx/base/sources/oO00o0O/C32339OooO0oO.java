package oO00o0O;

import com.aspose.slides.internal.p332p7.C22236OooO0Oo;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager;
import o0o0OO0.C30416Oooo0OO;
import oO0OooOO.AbstractC33487OooO0O0;
import oO0OooOO.InterfaceC33488OooO0OO;
import oO0OooOO.InterfaceC33489OooO0Oo;
import ooOOo0.C35112OooO0o0;

/* JADX INFO: renamed from: oO00o0O.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32339OooO0oO extends AbstractC33487OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C22236OooO0Oo f116277OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C32337OooO0o f116278OooOo0o;

    /* JADX INFO: renamed from: oO00o0O.OooO0oO$OooO00o */
    public final class OooO00o implements InterfaceC33488OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final C35112OooO0o0 f116279OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33488OooO0OO f116280OooOo0o;

        /* JADX INFO: renamed from: oO00o0O.OooO0oO$OooO00o$OooO00o, reason: collision with other inner class name */
        public final class C20218OooO00o implements InterfaceC33488OooO0OO {
            public C20218OooO00o() {
            }

            @Override // oO0OooOO.InterfaceC33488OooO0OO
            public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
                OooO00o.this.f116279OooOo.OooO0O0(oooO0O0);
            }

            @Override // oO0OooOO.InterfaceC33488OooO0OO
            public final void onComplete() {
                OooO00o.this.f116280OooOo0o.onComplete();
            }

            @Override // oO0OooOO.InterfaceC33488OooO0OO
            public final void onError(Throwable th) {
                OooO00o.this.f116280OooOo0o.onError(th);
            }
        }

        public OooO00o(InterfaceC33488OooO0OO interfaceC33488OooO0OO, C35112OooO0o0 c35112OooO0o0) {
            this.f116280OooOo0o = interfaceC33488OooO0OO;
            this.f116279OooOo = c35112OooO0o0;
        }

        @Override // oO0OooOO.InterfaceC33488OooO0OO
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            this.f116279OooOo.OooO0O0(oooO0O0);
        }

        @Override // oO0OooOO.InterfaceC33488OooO0OO
        public final void onComplete() {
            this.f116280OooOo0o.onComplete();
        }

        @Override // oO0OooOO.InterfaceC33488OooO0OO
        public final void onError(Throwable th) {
            InterfaceC33488OooO0OO interfaceC33488OooO0OO = this.f116280OooOo0o;
            try {
                C32339OooO0oO.this.f116277OooOo.getClass();
                InterfaceC33489OooO0Oo interfaceC33489OooO0OoLambda$createFirebaseInAppMessageStream$5 = InAppMessageStreamManager.lambda$createFirebaseInAppMessageStream$5(th);
                if (interfaceC33489OooO0OoLambda$createFirebaseInAppMessageStream$5 != null) {
                    interfaceC33489OooO0OoLambda$createFirebaseInAppMessageStream$5.OooO00o(new C20218OooO00o());
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("The CompletableConsumable returned is null");
                nullPointerException.initCause(th);
                interfaceC33488OooO0OO.onError(nullPointerException);
            } catch (Throwable th2) {
                C30416Oooo0OO.OooO00o(th2);
                interfaceC33488OooO0OO.onError(new oO00o00O.OooO00o(th2, th));
            }
        }
    }

    public C32339OooO0oO(C32337OooO0o c32337OooO0o, C22236OooO0Oo c22236OooO0Oo) {
        this.f116278OooOo0o = c32337OooO0o;
        this.f116277OooOo = c22236OooO0Oo;
    }

    @Override // oO0OooOO.AbstractC33487OooO0O0
    public final void OooO0o0(InterfaceC33488OooO0OO interfaceC33488OooO0OO) {
        C35112OooO0o0 c35112OooO0o0 = new C35112OooO0o0();
        interfaceC33488OooO0OO.OooO00o(c35112OooO0o0);
        this.f116278OooOo0o.OooO00o(new OooO00o(interfaceC33488OooO0OO, c35112OooO0o0));
    }
}
