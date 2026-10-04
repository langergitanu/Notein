package OooOoo;

import OooooO0.C21290OooO0o0;
import kotlin.coroutines.Continuation;
import o0000Ooo.C24243OooOOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", m80623f = "Scrollable.kt", m80624l = {442}, m80625m = "invokeSuspend")
public final class o00O0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC20633OoooOo0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public kotlin.jvm.internal.Oooo000 f59137OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public o0OoOo0 f59138OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f59139OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f59140OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f59141OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.Oooo000 f59142OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0 f59143OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ long f59144OooOooO;

    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C21290OooO0o0, C21290OooO0o0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC20633OoooOo0 f59145OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ o0OoOo0 f59146OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0OoOo0 o0oooo02, InterfaceC20633OoooOo0 interfaceC20633OoooOo0) {
            super(1);
            this.f59146OooOo0o = o0oooo02;
            this.f59145OooOo = interfaceC20633OoooOo0;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C21290OooO0o0 invoke(C21290OooO0o0 c21290OooO0o0) {
            long jOooO0oO = c21290OooO0o0.f61722OooO00o;
            o0OoOo0 o0oooo02 = this.f59146OooOo0o;
            if (o0oooo02.f59175OooO0O0) {
                jOooO0oO = C21290OooO0o0.OooO0oO(-1.0f, jOooO0oO);
            }
            long jOooO00o = o0oooo02.OooO00o(this.f59145OooOo, jOooO0oO, 2);
            if (o0oooo02.f59175OooO0O0) {
                jOooO00o = C21290OooO0o0.OooO0oO(-1.0f, jOooO00o);
            }
            return new C21290OooO0o0(jOooO00o);
        }
    }

    public static final class OooO0O0 implements InterfaceC20633OoooOo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0OoOo0 f59147OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ OooO00o f59148OooO0O0;

        public OooO0O0(o0OoOo0 o0oooo02, OooO00o oooO00o) {
            this.f59147OooO00o = o0oooo02;
            this.f59148OooO0O0 = oooO00o;
        }

        @Override // OooOoo.InterfaceC20633OoooOo0
        public final float OooO00o(float f) {
            o0OoOo0 o0oooo02 = this.f59147OooO00o;
            return o0oooo02.OooO0Oo(((C21290OooO0o0) this.f59148OooO0O0.invoke(new C21290OooO0o0(o0oooo02.OooO0o0(f)))).f61722OooO00o);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(o0OoOo0 o0oooo02, kotlin.jvm.internal.Oooo000 oooo000, long j, Continuation<? super o00O0O> continuation) {
        super(2, continuation);
        this.f59143OooOoo0 = o0oooo02;
        this.f59142OooOoo = oooo000;
        this.f59144OooOooO = j;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o00O0O o00o0o2 = new o00O0O(this.f59143OooOoo0, this.f59142OooOoo, this.f59144OooOooO, continuation);
        o00o0o2.f59141OooOoOO = obj;
        return o00o0o2;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC20633OoooOo0 interfaceC20633OoooOo0, Continuation<? super C32460OooOooO> continuation) {
        return ((o00O0O) create(interfaceC20633OoooOo0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        o0OoOo0 o0oooo02;
        kotlin.jvm.internal.Oooo000 oooo000;
        long j;
        o0OoOo0 o0oooo03;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f59139OooOoO;
        EnumC20624Oooo0oO enumC20624Oooo0oO = EnumC20624Oooo0oO.f59070OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC20633OoooOo0 interfaceC20633OoooOo0 = (InterfaceC20633OoooOo0) this.f59141OooOoOO;
            o0oooo02 = this.f59143OooOoo0;
            OooO0O0 oooO0O0 = new OooO0O0(o0oooo02, new OooO00o(o0oooo02, interfaceC20633OoooOo0));
            C20597OooO0oo c20597OooO0oo = o0oooo02.f59179OooO0o0;
            oooo000 = this.f59142OooOoo;
            long j2 = oooo000.f80941OooOo0o;
            EnumC20624Oooo0oO enumC20624Oooo0oO2 = o0oooo02.f59174OooO00o;
            long j3 = this.f59144OooOooO;
            float fOooO0O0 = enumC20624Oooo0oO2 == enumC20624Oooo0oO ? C24243OooOOo0.OooO0O0(j3) : C24243OooOOo0.OooO0OO(j3);
            if (o0oooo02.f59175OooO0O0) {
                fOooO0O0 *= -1;
            }
            this.f59141OooOoOO = o0oooo02;
            this.f59138OooOo0o = o0oooo02;
            this.f59137OooOo = oooo000;
            this.f59140OooOoO0 = j2;
            this.f59139OooOoO = 1;
            c20597OooO0oo.getClass();
            obj = C33609OooO0oo.OooO0o(c20597OooO0oo.f58908OooO0O0, new C20596OooO0oO(fOooO0O0, c20597OooO0oo, oooO0O0, null), this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            j = j2;
            o0oooo03 = o0oooo02;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.f59140OooOoO0;
            oooo000 = this.f59137OooOo;
            o0oooo02 = this.f59138OooOo0o;
            o0oooo03 = (o0OoOo0) this.f59141OooOoOO;
            C32446OooOOOo.OooO0O0(obj);
        }
        float fFloatValue = ((Number) obj).floatValue();
        if (o0oooo03.f59175OooO0O0) {
            fFloatValue *= -1;
        }
        oooo000.f80941OooOo0o = o0oooo02.f59174OooO00o == enumC20624Oooo0oO ? C24243OooOOo0.OooO00o(fFloatValue, 0.0f, j, 2) : C24243OooOOo0.OooO00o(0.0f, fFloatValue, j, 1);
        return C32460OooOooO.f116667OooO00o;
    }
}
