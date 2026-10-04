package oO000oOO;

import com.aspose.words.StyleIdentifier;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.network.embedded.C18358t1;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0OOo0o.o0O0o;
import oO00O0o0.C32183OooO0Oo;
import oO00O0o0.C32186OooO0oo;
import oO00O0o0.C32188OooOOOo;
import oO00O0o0.C32190OooOOo0;
import oO00O0o0.C32211OoooO0;
import oO00O0o0.OooOo00;
import oO00OOoO.AbstractC32246OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0Oo0Oo.C33201OooO0Oo;
import oO0o0O0o.C33580OooO00o;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: oO000oOO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiation$Plugin$install$2", m80623f = "ContentNegotiation.kt", m80624l = {StyleIdentifier.SUBTLE_REFERENCE, StyleIdentifier.BIBLIOGRAPHY}, m80625m = "invokeSuspend")
public final class C32120OooO0o0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<AbstractC32246OooO0o0<C33201OooO0Oo, ooOOOOOo.OooO0OO>, C33201OooO0Oo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ AbstractC32246OooO0o0 f115169OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f115170OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C32116OooO0O0 f115171OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f115172OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32120OooO0o0(C32116OooO0O0 c32116OooO0O0, Continuation<? super C32120OooO0o0> continuation) {
        super(3, continuation);
        this.f115171OooOoO = c32116OooO0O0;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(AbstractC32246OooO0o0<C33201OooO0Oo, ooOOOOOo.OooO0OO> abstractC32246OooO0o0, C33201OooO0Oo c33201OooO0Oo, Continuation<? super C32460OooOooO> continuation) {
        C32120OooO0o0 c32120OooO0o0 = new C32120OooO0o0(this.f115171OooOoO, continuation);
        c32120OooO0o0.f115169OooOo = abstractC32246OooO0o0;
        c32120OooO0o0.f115172OooOoO0 = c33201OooO0Oo;
        return c32120OooO0o0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d5, code lost:
    
        if (r2.OooO0o0(r5, r12) == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC32246OooO0o0 abstractC32246OooO0o0;
        Charset charsetForName;
        C32120OooO0o0 c32120OooO0o0;
        oOOoOoOO.OooO00o oooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f115170OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            abstractC32246OooO0o0 = this.f115169OooOo;
            C33201OooO0Oo c33201OooO0Oo = (C33201OooO0Oo) this.f115172OooOoO0;
            oOOoOoOO.OooO00o oooO00o2 = c33201OooO0Oo.f120151OooO00o;
            C32183OooO0Oo c32183OooO0OoOooO00o = OooOo00.OooO00o(((ooOOOOOo.OooO0OO) abstractC32246OooO0o0.f115817OooOo0o).OooO0o0());
            if (c32183OooO0OoOooO00o == null) {
                C32114OooO.f115145OooO00o.OooO0oo("Response doesn't have \"Content-Type\" header, skipping ContentNegotiation plugin");
                return C32460OooOooO.f116667OooO00o;
            }
            ooOOOOOo.OooO0OO oooO0OO = (ooOOOOOo.OooO0OO) abstractC32246OooO0o0.f115817OooOo0o;
            oO00O0o0.OooOO0O headers = oooO0OO.OooO0Oo().getHeaders();
            Charset defaultCharset = C33580OooO00o.f121231OooO0O0;
            OooOOO0.OooO0oO(headers, "<this>");
            OooOOO0.OooO0oO(defaultCharset, "defaultCharset");
            List<String> list = C32190OooOOo0.f115537OooO00o;
            Iterator it = OooOo.o00O0O(C32188OooOOOo.OooO00o(headers.get(HttpHeaders.ACCEPT_CHARSET)), new o0O0o(1)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    charsetForName = null;
                    break;
                }
                String str = ((C32186OooO0oo) it.next()).f115529OooO00o;
                if (OooOOO0.OooO0O0(str, C18358t1.g.f56183c)) {
                    charsetForName = defaultCharset;
                    break;
                }
                if (Charset.isSupported(str)) {
                    charsetForName = Charset.forName(str);
                    break;
                }
            }
            Charset charset = charsetForName == null ? defaultCharset : charsetForName;
            C32211OoooO0 url = oooO0OO.OooO0Oo().getUrl();
            this.f115169OooOo = abstractC32246OooO0o0;
            this.f115172OooOoO0 = oooO00o2;
            this.f115170OooOo0o = 1;
            c32120OooO0o0 = this;
            obj = this.f115171OooOoO.OooO0O0(url, oooO00o2, c33201OooO0Oo.f120152OooO0O0, c32183OooO0OoOooO00o, charset, c32120OooO0o0);
            if (obj != enumC32485OooO00o) {
                oooO00o = oooO00o2;
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
        oooO00o = (oOOoOoOO.OooO00o) this.f115172OooOoO0;
        abstractC32246OooO0o0 = this.f115169OooOo;
        C32446OooOOOo.OooO0O0(obj);
        c32120OooO0o0 = this;
        if (obj == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        C33201OooO0Oo c33201OooO0Oo2 = new C33201OooO0Oo(oooO00o, obj);
        c32120OooO0o0.f115169OooOo = null;
        c32120OooO0o0.f115172OooOoO0 = null;
        c32120OooO0o0.f115170OooOo0o = 2;
    }
}
