package o0OO00o0;

import com.orion.notein.data.p602db.entity.ImageEntity;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34767o0000oOO;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ImageLocalDataSource$getImagesByNoteId$2", m80623f = "ImageLocalDataSource.kt", m80624l = {69}, m80625m = "invokeSuspend")
public final class o00O00O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34767o0000oOO, Continuation<? super List<? extends ImageEntity>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91654OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91655OooOo0o;

    public o00O00O() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o00O00O o00o00o2 = new o00O00O(2, continuation);
        o00o00o2.f91654OooOo = obj;
        return o00o00o2;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34767o0000oOO abstractC34767o0000oOO, Continuation<? super List<? extends ImageEntity>> continuation) {
        return ((o00O00O) create(abstractC34767o0000oOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91655OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        AbstractC34767o0000oOO abstractC34767o0000oOO = (AbstractC34767o0000oOO) this.f91654OooOo;
        this.f91655OooOo0o = 1;
        Object objOooO0o0 = abstractC34767o0000oOO.OooO0o0(this);
        return objOooO0o0 == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o0;
    }
}
