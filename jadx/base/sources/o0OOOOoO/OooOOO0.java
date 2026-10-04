package o0OOOOoO;

import java.util.Map;
import kotlin.coroutines.Continuation;
import o0000oOO.C24334OooO0O0;
import o0Oo00o.C28028OooO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.textboxinfo.TextBoxInfoLocalDataSource$saveTextStyle$2", m80623f = "TextBoxInfoLocalDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Map<Integer, Object> f94843OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f94844OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(Map<Integer, ? extends Object> map, Continuation<? super OooOOO0> continuation) {
        super(2, continuation);
        this.f94843OooOo = map;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooOOO0 oooOOO0 = new OooOOO0(this.f94843OooOo, continuation);
        oooOOO0.f94844OooOo0o = obj;
        return oooOOO0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOOO0) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        ((C24334OooO0O0) this.f94844OooOo0o).OooO0oO(OooOOO.f94840OooO0o0, C28028OooO0o.OooO00o().toJson(this.f94843OooOo));
        return C32460OooOooO.f116667OooO00o;
    }
}
