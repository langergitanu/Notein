package o0OOO0Oo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34903o00o0OoO;

/* JADX INFO: renamed from: o0OOO0Oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.page.layer.PageLayerLocalDataSource$getAllItemsCountInLayer$2", m80623f = "PageLayerLocalDataSource.kt", m80624l = {150}, m80625m = "invokeSuspend")
public final class C27031OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34903o00o0OoO, Continuation<? super Long>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f94119OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94120OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f94121OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27031OooO0o0(String str, Continuation<? super C27031OooO0o0> continuation) {
        super(2, continuation);
        this.f94121OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27031OooO0o0 c27031OooO0o0 = new C27031OooO0o0(this.f94121OooOoO0, continuation);
        c27031OooO0o0.f94119OooOo = obj;
        return c27031OooO0o0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34903o00o0OoO abstractC34903o00o0OoO, Continuation<? super Long> continuation) {
        return ((C27031OooO0o0) create(abstractC34903o00o0OoO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94120OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        AbstractC34903o00o0OoO abstractC34903o00o0OoO = (AbstractC34903o00o0OoO) this.f94119OooOo;
        this.f94120OooOo0o = 1;
        Object objOooOO0 = abstractC34903o00o0OoO.OooOO0(this.f94121OooOoO0, this);
        return objOooOO0 == enumC32485OooO00o ? enumC32485OooO00o : objOooOO0;
    }
}
