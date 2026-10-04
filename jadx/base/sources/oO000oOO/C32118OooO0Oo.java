package oO000oOO;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import oO000oo.C32132OooO0Oo;
import oO00OOoO.AbstractC32246OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: oO000oOO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiation$Plugin$install$1", m80623f = "ContentNegotiation.kt", m80624l = {StyleIdentifier.MEDIUM_LIST_1_ACCENT_6, StyleIdentifier.MEDIUM_LIST_2_ACCENT_6}, m80625m = "invokeSuspend")
public final class C32118OooO0Oo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<AbstractC32246OooO0o0<Object, C32132OooO0Oo>, Object, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ AbstractC32246OooO0o0 f115157OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f115158OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C32116OooO0O0 f115159OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32118OooO0Oo(C32116OooO0O0 c32116OooO0O0, Continuation<? super C32118OooO0Oo> continuation) {
        super(3, continuation);
        this.f115159OooOoO0 = c32116OooO0O0;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(AbstractC32246OooO0o0<Object, C32132OooO0Oo> abstractC32246OooO0o0, Object obj, Continuation<? super C32460OooOooO> continuation) {
        C32118OooO0Oo c32118OooO0Oo = new C32118OooO0Oo(this.f115159OooOoO0, continuation);
        c32118OooO0Oo.f115157OooOo = abstractC32246OooO0o0;
        return c32118OooO0Oo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r1.OooO0o0(r6, r5) == r0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC32246OooO0o0 abstractC32246OooO0o0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f115158OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            abstractC32246OooO0o0 = this.f115157OooOo;
            C32132OooO0Oo c32132OooO0Oo = (C32132OooO0Oo) abstractC32246OooO0o0.f115817OooOo0o;
            Object objOooO0O0 = abstractC32246OooO0o0.OooO0O0();
            this.f115157OooOo = abstractC32246OooO0o0;
            this.f115158OooOo0o = 1;
            obj = this.f115159OooOoO0.OooO00o(c32132OooO0Oo, objOooO0O0, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        abstractC32246OooO0o0 = this.f115157OooOo;
        C32446OooOOOo.OooO0O0(obj);
        if (obj == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        this.f115157OooOo = null;
        this.f115158OooOo0o = 2;
    }
}
