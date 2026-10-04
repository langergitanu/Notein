package o0OO00o0;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OO00o0.OooooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.DualLinkSourceLocalDataSource$deleteByNoteId$2", m80623f = "DualLinkSourceLocalDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26517OooooOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<oo0oO0.o0O0O00, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f91183OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f91184OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26517OooooOo(String str, Continuation<? super C26517OooooOo> continuation) {
        super(2, continuation);
        this.f91183OooOo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26517OooooOo c26517OooooOo = new C26517OooooOo(this.f91183OooOo, continuation);
        c26517OooooOo.f91184OooOo0o = obj;
        return c26517OooooOo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(oo0oO0.o0O0O00 o0o0o00, Continuation<? super C32460OooOooO> continuation) {
        return ((C26517OooooOo) create(o0o0o00, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        ((oo0oO0.o0O0O00) this.f91184OooOo0o).OooO0Oo(this.f91183OooOo);
        return C32460OooOooO.f116667OooO00o;
    }
}
