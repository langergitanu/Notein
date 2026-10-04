package o0OO;

import com.orion.notein.data.p602db.entity.NoteContentEntity;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.o00O0O00;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.note.NoteContentLocalDataSource$getNoteContentsByIdsSync$2$1", m80623f = "NoteContentLocalDataSource.kt", m80624l = {46}, m80625m = "invokeSuspend")
public final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<o00O0O00, Continuation<? super NoteContentEntity>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f90634OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90635OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f90636OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(String str, Continuation<? super OooO0o> continuation) {
        super(2, continuation);
        this.f90636OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooO0o oooO0o = new OooO0o(this.f90636OooOoO0, continuation);
        oooO0o.f90634OooOo = obj;
        return oooO0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(o00O0O00 o00o0o002, Continuation<? super NoteContentEntity> continuation) {
        return ((OooO0o) create(o00o0o002, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90635OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        o00O0O00 o00o0o002 = (o00O0O00) this.f90634OooOo;
        this.f90635OooOo0o = 1;
        Object objOooO0OO = o00o0o002.OooO0OO(this.f90636OooOoO0, this);
        return objOooO0OO == enumC32485OooO00o ? enumC32485OooO00o : objOooO0OO;
    }
}
