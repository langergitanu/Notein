package OooOoo;

import kotlin.coroutines.Continuation;
import o0000Ooo.C24243OooOOo0;
import o00Oo0.C25027OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", m80623f = "Scrollable.kt", m80624l = {406, 408, 410}, m80625m = "invokeSuspend")
public final class o00Ooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24243OooOOo0, Continuation<? super C24243OooOOo0>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f59153OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f59154OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0 f59155OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ long f59156OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(o0OoOo0 o0oooo02, Continuation<? super o00Ooo> continuation) {
        super(2, continuation);
        this.f59155OooOoO = o0oooo02;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o00Ooo o00ooo2 = new o00Ooo(this.f59155OooOoO, continuation);
        o00ooo2.f59156OooOoO0 = ((C24243OooOOo0) obj).f81503OooO00o;
        return o00ooo2;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C24243OooOOo0 c24243OooOOo0, Continuation<? super C24243OooOOo0> continuation) {
        return ((o00Ooo) create(new C24243OooOOo0(c24243OooOOo0.f81503OooO00o), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f59153OooOo;
        o0OoOo0 o0oooo02 = this.f59155OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            j = this.f59156OooOoO0;
            C25027OooO0O0 c25027OooO0O0 = (C25027OooO0O0) o0oooo02.f59176OooO0OO.getValue();
            this.f59156OooOoO0 = j;
            this.f59153OooOo = 1;
            obj = c25027OooO0O0.OooO0O0(j, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j4 = this.f59154OooOo0o;
                j3 = this.f59156OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                return new C24243OooOOo0(C24243OooOOo0.OooO0Oo(j3, C24243OooOOo0.OooO0Oo(j4, ((C24243OooOOo0) obj).f81503OooO00o)));
            }
            j2 = this.f59154OooOo0o;
            j = this.f59156OooOoO0;
            C32446OooOOOo.OooO0O0(obj);
            long j5 = ((C24243OooOOo0) obj).f81503OooO00o;
            C25027OooO0O0 c25027OooO0O02 = (C25027OooO0O0) o0oooo02.f59176OooO0OO.getValue();
            long jOooO0Oo = C24243OooOOo0.OooO0Oo(j2, j5);
            this.f59156OooOoO0 = j;
            this.f59154OooOo0o = j5;
            this.f59153OooOo = 3;
            obj = c25027OooO0O02.OooO00o(jOooO0Oo, j5, this);
            if (obj != enumC32485OooO00o) {
                j3 = j;
                j4 = j5;
                return new C24243OooOOo0(C24243OooOOo0.OooO0Oo(j3, C24243OooOOo0.OooO0Oo(j4, ((C24243OooOOo0) obj).f81503OooO00o)));
            }
            return enumC32485OooO00o;
        }
        j = this.f59156OooOoO0;
        C32446OooOOOo.OooO0O0(obj);
        long jOooO0Oo2 = C24243OooOOo0.OooO0Oo(j, ((C24243OooOOo0) obj).f81503OooO00o);
        this.f59156OooOoO0 = j;
        this.f59154OooOo0o = jOooO0Oo2;
        this.f59153OooOo = 2;
        obj = o0oooo02.OooO0O0(jOooO0Oo2, this);
        if (obj != enumC32485OooO00o) {
            j2 = jOooO0Oo2;
            long j52 = ((C24243OooOOo0) obj).f81503OooO00o;
            C25027OooO0O0 c25027OooO0O022 = (C25027OooO0O0) o0oooo02.f59176OooO0OO.getValue();
            long jOooO0Oo3 = C24243OooOOo0.OooO0Oo(j2, j52);
            this.f59156OooOoO0 = j;
            this.f59154OooOo0o = j52;
            this.f59153OooOo = 3;
            obj = c25027OooO0O022.OooO00o(jOooO0Oo3, j52, this);
            if (obj != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }
}
