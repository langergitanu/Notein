package oO0Ooo0O;

import com.google.common.net.HttpHeaders;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000ooo.C24746OooO00o;
import oO000oo.C32132OooO0Oo;
import oO00O0o0.C32183OooO0Oo;
import oO00O0o0.C32187OooOO0o;
import oO00O0o0.C32190OooOOo0;
import oO00O0o0.InterfaceC32191OooOOoo;
import oO00O0oO.C32214OooO0Oo;
import oO00OOoO.AbstractC32246OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOO00OOo.InterfaceC34352OooO0O0;

/* JADX INFO: renamed from: oO0Ooo0O.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.HttpPlainText$Plugin$install$1", m80623f = "HttpPlainText.kt", m80624l = {130}, m80625m = "invokeSuspend")
public final class C33401OooOoOO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<AbstractC32246OooO0o0<Object, C32132OooO0Oo>, Object, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ AbstractC32246OooO0o0 f120758OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f120759OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C33399OooOoO f120760OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f120761OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33401OooOoOO(C33399OooOoO c33399OooOoO, Continuation<? super C33401OooOoOO> continuation) {
        super(3, continuation);
        this.f120760OooOoO = c33399OooOoO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(AbstractC32246OooO0o0<Object, C32132OooO0Oo> abstractC32246OooO0o0, Object obj, Continuation<? super C32460OooOooO> continuation) {
        C33401OooOoOO c33401OooOoOO = new C33401OooOoOO(this.f120760OooOoO, continuation);
        c33401OooOoOO.f120758OooOo = abstractC32246OooO0o0;
        c33401OooOoOO.f120761OooOoO0 = obj;
        return c33401OooOoOO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Charset charset;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f120759OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC32246OooO0o0 abstractC32246OooO0o0 = this.f120758OooOo;
            Object obj2 = this.f120761OooOoO0;
            C32132OooO0Oo context = (C32132OooO0Oo) abstractC32246OooO0o0.f115817OooOo0o;
            C33399OooOoO c33399OooOoO = this.f120760OooOoO;
            c33399OooOoO.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
            List<String> list = C32190OooOOo0.f115537OooO00o;
            C32187OooOO0o c32187OooOO0o = context.f115205OooO0OO;
            if (c32187OooOO0o.OooO0o0(HttpHeaders.ACCEPT_CHARSET) == null) {
                InterfaceC34352OooO0O0 interfaceC34352OooO0O0 = C33405OooOooo.f120766OooO00o;
                StringBuilder sb = new StringBuilder("Adding Accept-Charset=");
                String value = c33399OooOoO.f120753OooO0OO;
                sb.append(value);
                sb.append(" to ");
                sb.append(context.f115203OooO00o);
                interfaceC34352OooO0O0.OooO0oo(sb.toString());
                kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
                c32187OooOO0o.OooO0oo(value);
                List<String> listOooO0Oo = c32187OooOO0o.OooO0Oo(HttpHeaders.ACCEPT_CHARSET);
                listOooO0Oo.clear();
                listOooO0Oo.add(value);
            }
            if (!(obj2 instanceof String)) {
                return C32460OooOooO.f116667OooO00o;
            }
            TContext tcontext = abstractC32246OooO0o0.f115817OooOo0o;
            C32183OooO0Oo c32183OooO0OoOooO0O0 = oO00O0o0.OooOo00.OooO0O0((InterfaceC32191OooOOoo) tcontext);
            if (c32183OooO0OoOooO0O0 != null) {
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(c32183OooO0OoOooO0O0.f115521OooO0Oo, C32183OooO0Oo.OooO0OO.f115525OooO00o.f115521OooO0Oo)) {
                    return C32460OooOooO.f116667OooO00o;
                }
            }
            C32132OooO0Oo c32132OooO0Oo = (C32132OooO0Oo) tcontext;
            String str = (String) obj2;
            C32183OooO0Oo c32183OooO0Oo = c32183OooO0OoOooO0O0 == null ? C32183OooO0Oo.OooO0OO.f115525OooO00o : c32183OooO0OoOooO0O0;
            if (c32183OooO0OoOooO0O0 == null || (charset = C24746OooO00o.OooO0Oo(c32183OooO0OoOooO0O0)) == null) {
                charset = c33399OooOoO.f120752OooO0O0;
            }
            C33405OooOooo.f120766OooO00o.OooO0oo("Sending request body to " + c32132OooO0Oo.f115203OooO00o + " as text/plain with charset " + charset);
            kotlin.jvm.internal.OooOOO0.OooO0oO(c32183OooO0Oo, "<this>");
            kotlin.jvm.internal.OooOOO0.OooO0oO(charset, "charset");
            C32214OooO0Oo c32214OooO0Oo = new C32214OooO0Oo(str, c32183OooO0Oo.OooO0o(oO00Oo00.OooO00o.OooO0Oo(charset)));
            this.f120758OooOo = null;
            this.f120759OooOo0o = 1;
            if (abstractC32246OooO0o0.OooO0o0(c32214OooO0Oo, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
