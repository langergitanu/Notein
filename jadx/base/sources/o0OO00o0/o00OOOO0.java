package o0OO00o0;

import com.orion.notein.data.p602db.entity.OutlineEntity;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.InterfaceC34877o00OooOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.OutlineLocalDataSource$getOutlinesByNoteIdSync$2", m80623f = "OutlineLocalDataSource.kt", m80624l = {37}, m80625m = "invokeSuspend")
public final class o00OOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC34877o00OooOo, Continuation<? super List<? extends OutlineEntity>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91835OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91836OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f91837OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOO0(String str, Continuation<? super o00OOOO0> continuation) {
        super(2, continuation);
        this.f91837OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o00OOOO0 o00oooo02 = new o00OOOO0(this.f91837OooOoO0, continuation);
        o00oooo02.f91835OooOo = obj;
        return o00oooo02;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC34877o00OooOo interfaceC34877o00OooOo, Continuation<? super List<? extends OutlineEntity>> continuation) {
        return ((o00OOOO0) create(interfaceC34877o00OooOo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91836OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC34877o00OooOo interfaceC34877o00OooOo = (InterfaceC34877o00OooOo) this.f91835OooOo;
        this.f91836OooOo0o = 1;
        Object objOooO0oO = interfaceC34877o00OooOo.OooO0oO(this.f91837OooOoO0, this);
        return objOooO0oO == enumC32485OooO00o ? enumC32485OooO00o : objOooO0oO;
    }
}
