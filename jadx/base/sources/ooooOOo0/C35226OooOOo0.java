package ooooOOo0;

import androidx.fragment.app.C21904OooOoo0;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33649OoooOOo;

/* JADX INFO: renamed from: ooooOOo0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35226OooOOo0 {

    /* JADX INFO: renamed from: ooooOOo0.OooOOo0$OooO00o */
    public static final class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Exception f126476OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f126477OooOo0o;

        public OooO00o(OooO0O0 oooO0O0, Exception exc) {
            this.f126477OooOo0o = oooO0O0;
            this.f126476OooOo = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C21904OooOoo0.OooO0o0(this.f126477OooOo0o).resumeWith(C32446OooOOOo.OooO00o(this.f126476OooOo));
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooOOo0$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "retrofit2.KotlinExtensions", m80623f = "KotlinExtensions.kt", m80624l = {113}, m80625m = "suspendAndThrow")
    public static final class OooO0O0 extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f126478OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f126479OooOo0o;

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f126479OooOo0o = obj;
            this.f126478OooOo |= Integer.MIN_VALUE;
            return C35226OooOOo0.OooO00o(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(Exception exc, Continuation<?> continuation) {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f126478OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f126478OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        }
        Object obj = oooO0O0.f126479OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0O0.f126478OooOo;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        oooO0O0.f126478OooOo = 1;
        C33649OoooOOo.f121328OooO00o.o0OoO0o(oooO0O0.getContext(), new OooO00o(oooO0O0, exc));
        return enumC32485OooO00o;
    }
}
