package oO000o0;

import kotlin.coroutines.Continuation;
import oO00OOoO.AbstractC32246OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0O0OoO.C32709OooO0O0;
import oO0Oo0Oo.C33201OooO0Oo;
import ooOOooOo.C35183OooO00o;

/* JADX INFO: renamed from: oO000o0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.HttpClient$4", m80623f = "HttpClient.kt", m80624l = {177}, m80625m = "invokeSuspend")
public final class C32091OooO0Oo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<AbstractC32246OooO0o0<C33201OooO0Oo, ooOOOOOo.OooO0OO>, C33201OooO0Oo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ AbstractC32246OooO0o0 f114946OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f114947OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooO0o f114948OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32091OooO0Oo(OooO0o oooO0o, Continuation<? super C32091OooO0Oo> continuation) {
        super(3, continuation);
        this.f114948OooOoO0 = oooO0o;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(AbstractC32246OooO0o0<C33201OooO0Oo, ooOOOOOo.OooO0OO> abstractC32246OooO0o0, C33201OooO0Oo c33201OooO0Oo, Continuation<? super C32460OooOooO> continuation) {
        C32091OooO0Oo c32091OooO0Oo = new C32091OooO0Oo(this.f114948OooOoO0, continuation);
        c32091OooO0Oo.f114946OooOo = abstractC32246OooO0o0;
        return c32091OooO0Oo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC32246OooO0o0 abstractC32246OooO0o0;
        Throwable th;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f114947OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC32246OooO0o0 = this.f114946OooOo;
            try {
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            } catch (Throwable th2) {
                th = th2;
                C35183OooO00o c35183OooO00o = this.f114948OooOoO0.f114959Oooo000;
                OooO0O0.OooO0O0 oooO0O0 = C32709OooO0O0.f117614OooO0Oo;
                ((ooOOOOOo.OooO0OO) abstractC32246OooO0o0.f115817OooOo0o).OooO0o0();
                c35183OooO00o.OooO00o(oooO0O0);
                throw th;
            }
        }
        C32446OooOOOo.OooO0O0(obj);
        AbstractC32246OooO0o0 abstractC32246OooO0o02 = this.f114946OooOo;
        try {
            this.f114946OooOo = abstractC32246OooO0o02;
            this.f114947OooOo0o = 1;
            if (abstractC32246OooO0o02.OooO0Oo(this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th3) {
            abstractC32246OooO0o0 = abstractC32246OooO0o02;
            th = th3;
            C35183OooO00o c35183OooO00o2 = this.f114948OooOoO0.f114959Oooo000;
            OooO0O0.OooO0O0 oooO0O02 = C32709OooO0O0.f117614OooO0Oo;
            ((ooOOOOOo.OooO0OO) abstractC32246OooO0o0.f115817OooOo0o).OooO0o0();
            c35183OooO00o2.OooO00o(oooO0O02);
            throw th;
        }
    }
}
