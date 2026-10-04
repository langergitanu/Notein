package oO0Ooo0o;

import androidx.core.location.LocationRequestCompat;
import com.aspose.words.StyleIdentifier;
import java.nio.charset.Charset;
import kotlin.coroutines.Continuation;
import o00OooO0.C25150OooO00o;
import oO00Oo0.AbstractC32268OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: oO0Ooo0o.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.logging.Logging$logRequestBody$2", m80623f = "Logging.kt", m80624l = {StyleIdentifier.PLAIN_TABLE_2}, m80625m = "invokeSuspend")
public final class C33428OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f120834OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Charset f120835OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Charset f120836OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.p616io.OooO00o f120837OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ StringBuilder f120838OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33428OooO(io.ktor.utils.p616io.OooO00o oooO00o, Charset charset, StringBuilder sb, Continuation continuation) {
        super(2, continuation);
        this.f120837OooOoO0 = oooO00o;
        this.f120836OooOoO = charset;
        this.f120838OooOoOO = sb;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C33428OooO(this.f120837OooOoO0, this.f120836OooOoO, this.f120838OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C33428OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        String strOooO0oo;
        Charset charset;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f120834OooOo;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                io.ktor.utils.p616io.OooO00o oooO00o = this.f120837OooOoO0;
                Charset charset2 = this.f120836OooOoO;
                this.f120835OooOo0o = charset2;
                this.f120834OooOo = 1;
                obj = oooO00o.OooOo0O(LocationRequestCompat.PASSIVE_INTERVAL, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                charset = charset2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                charset = this.f120835OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            strOooO0oo = C25150OooO00o.OooO0oo((AbstractC32268OooO0oO) obj, charset);
        } catch (Throwable unused) {
            strOooO0oo = null;
        }
        if (strOooO0oo == null) {
            strOooO0oo = "[request body omitted]";
        }
        StringBuilder sb = this.f120838OooOoOO;
        sb.append("BODY START");
        sb.append('\n');
        sb.append(strOooO0oo);
        sb.append('\n');
        sb.append("BODY END");
        return C32460OooOooO.f116667OooO00o;
    }
}
