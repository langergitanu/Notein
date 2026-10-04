package o0OOo0o;

import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteInFileUseCase$isToZipFilesValid$getNoteMeta$1", m80623f = "NoteInFileUseCase.kt", m80624l = {1926}, m80625m = "invokeSuspend")
public final class o000OOoO extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super NoteMeta>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27387o0000o0 f95638OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95639OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f95640OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOoO(C27387o0000o0 c27387o0000o0, String str, Continuation<? super o000OOoO> continuation) {
        super(1, continuation);
        this.f95638OooOo = c27387o0000o0;
        this.f95640OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
        return new o000OOoO(this.f95638OooOo, this.f95640OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Continuation<? super NoteMeta> continuation) {
        return ((o000OOoO) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95639OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C27387o0000o0 c27387o0000o0 = this.f95638OooOo;
        String strOooO0Oo = c27387o0000o0.f95426OooO00o.OooO0Oo();
        this.f95639OooOo0o = 1;
        Object objOooO0oo = c27387o0000o0.f95427OooO0O0.OooO0oo(this.f95640OooOoO0, strOooO0Oo, this);
        return objOooO0oo == enumC32485OooO00o ? enumC32485OooO00o : objOooO0oo;
    }
}
