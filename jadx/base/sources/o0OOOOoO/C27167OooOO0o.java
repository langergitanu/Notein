package o0OOOOoO;

import java.util.List;
import kotlin.coroutines.Continuation;
import o0000oOO.C24334OooO0O0;
import o0Oo00o.C28028OooO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OOOOoO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.textboxinfo.TextBoxInfoLocalDataSource$saveTextColors$2", m80623f = "TextBoxInfoLocalDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27167OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ List<Integer> f94835OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f94836OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27167OooOO0o(List<Integer> list, Continuation<? super C27167OooOO0o> continuation) {
        super(2, continuation);
        this.f94835OooOo = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27167OooOO0o c27167OooOO0o = new C27167OooOO0o(this.f94835OooOo, continuation);
        c27167OooOO0o.f94836OooOo0o = obj;
        return c27167OooOO0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
        return ((C27167OooOO0o) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        ((C24334OooO0O0) this.f94836OooOo0o).OooO0oO(OooOOO.f94839OooO0o, C28028OooO0o.OooO00o().toJson(this.f94835OooOo));
        return C32460OooOooO.f116667OooO00o;
    }
}
