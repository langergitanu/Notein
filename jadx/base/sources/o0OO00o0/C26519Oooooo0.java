package o0OO00o0;

import com.orion.notein.data.p602db.entity.DualLinkSourceEntity;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OO00o0.Oooooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.DualLinkSourceLocalDataSource$getByIdSync$2", m80623f = "DualLinkSourceLocalDataSource.kt", m80624l = {59}, m80625m = "invokeSuspend")
public final class C26519Oooooo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<oo0oO0.o0O0O00, Continuation<? super DualLinkSourceEntity>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91187OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91188OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f91189OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26519Oooooo0(String str, Continuation<? super C26519Oooooo0> continuation) {
        super(2, continuation);
        this.f91189OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26519Oooooo0 c26519Oooooo0 = new C26519Oooooo0(this.f91189OooOoO0, continuation);
        c26519Oooooo0.f91187OooOo = obj;
        return c26519Oooooo0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(oo0oO0.o0O0O00 o0o0o00, Continuation<? super DualLinkSourceEntity> continuation) {
        return ((C26519Oooooo0) create(o0o0o00, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91188OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oo0oO0.o0O0O00 o0o0o00 = (oo0oO0.o0O0O00) this.f91187OooOo;
            List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(this.f91189OooOoO0);
            this.f91188OooOo0o = 1;
            obj = o0o0o00.OooO0o(listOooO0oO, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return oOo000Oo.OooOo.Oooo((List) obj);
    }
}
