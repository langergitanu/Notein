package o0OO00o0;

import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34981o0O00OoO;

/* JADX INFO: renamed from: o0OO00o0.o00o0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.TextBoxLocalDataSource$deleteTextBoxesByIds$2$1", m80623f = "TextBoxLocalDataSource.kt", m80624l = {48}, m80625m = "invokeSuspend")
public final class C26667o00o0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34981o0O00OoO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f92031OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92032OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<String> f92033OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26667o00o0OO(List<String> list, Continuation<? super C26667o00o0OO> continuation) {
        super(2, continuation);
        this.f92033OooOoO0 = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26667o00o0OO c26667o00o0OO = new C26667o00o0OO(this.f92033OooOoO0, continuation);
        c26667o00o0OO.f92031OooOo = obj;
        return c26667o00o0OO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34981o0O00OoO abstractC34981o0O00OoO, Continuation<? super C32460OooOooO> continuation) {
        return ((C26667o00o0OO) create(abstractC34981o0O00OoO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92032OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC34981o0O00OoO abstractC34981o0O00OoO = (AbstractC34981o0O00OoO) this.f92031OooOo;
            this.f92032OooOo0o = 1;
            if (abstractC34981o0O00OoO.OooO0O0(this.f92033OooOoO0, this) == enumC32485OooO00o) {
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
