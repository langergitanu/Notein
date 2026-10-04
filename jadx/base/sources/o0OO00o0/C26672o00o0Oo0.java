package o0OO00o0;

import com.orion.notein.data.p602db.entity.TextBoxEntity;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34981o0O00OoO;

/* JADX INFO: renamed from: o0OO00o0.o00o0Oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.TextBoxLocalDataSource$getTextBoxByIdSync$2", m80623f = "TextBoxLocalDataSource.kt", m80624l = {55}, m80625m = "invokeSuspend")
public final class C26672o00o0Oo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34981o0O00OoO, Continuation<? super TextBoxEntity>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f92047OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92048OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f92049OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26672o00o0Oo0(String str, Continuation<? super C26672o00o0Oo0> continuation) {
        super(2, continuation);
        this.f92049OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26672o00o0Oo0 c26672o00o0Oo0 = new C26672o00o0Oo0(this.f92049OooOoO0, continuation);
        c26672o00o0Oo0.f92047OooOo = obj;
        return c26672o00o0Oo0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34981o0O00OoO abstractC34981o0O00OoO, Continuation<? super TextBoxEntity> continuation) {
        return ((C26672o00o0Oo0) create(abstractC34981o0O00OoO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92048OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        AbstractC34981o0O00OoO abstractC34981o0O00OoO = (AbstractC34981o0O00OoO) this.f92047OooOo;
        this.f92048OooOo0o = 1;
        Object objOooO0o0 = abstractC34981o0O00OoO.OooO0o0(this.f92049OooOoO0, this);
        return objOooO0o0 == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o0;
    }
}
