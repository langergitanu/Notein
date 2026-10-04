package o0OO00o0;

import com.orion.notein.data.p602db.entity.OutlineUpdateQuoteEntity;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.InterfaceC34877o00OooOo;

/* JADX INFO: renamed from: o0OO00o0.o00OOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.OutlineLocalDataSource$updateOutlineQuoteId$2", m80623f = "OutlineLocalDataSource.kt", m80624l = {110}, m80625m = "invokeSuspend")
public final class C26612o00OOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC34877o00OooOo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91844OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91845OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f91846OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f91847OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26612o00OOOo0(String str, String str2, Continuation<? super C26612o00OOOo0> continuation) {
        super(2, continuation);
        this.f91847OooOoO0 = str;
        this.f91846OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26612o00OOOo0 c26612o00OOOo0 = new C26612o00OOOo0(this.f91847OooOoO0, this.f91846OooOoO, continuation);
        c26612o00OOOo0.f91844OooOo = obj;
        return c26612o00OOOo0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC34877o00OooOo interfaceC34877o00OooOo, Continuation<? super C32460OooOooO> continuation) {
        return ((C26612o00OOOo0) create(interfaceC34877o00OooOo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91845OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC34877o00OooOo interfaceC34877o00OooOo = (InterfaceC34877o00OooOo) this.f91844OooOo;
            OutlineUpdateQuoteEntity[] outlineUpdateQuoteEntityArr = {new OutlineUpdateQuoteEntity(this.f91847OooOoO0, this.f91846OooOoO)};
            this.f91845OooOo0o = 1;
            if (interfaceC34877o00OooOo.OooO0Oo(outlineUpdateQuoteEntityArr, this) == enumC32485OooO00o) {
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
