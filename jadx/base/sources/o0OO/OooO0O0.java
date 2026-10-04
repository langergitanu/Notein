package o0OO;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.o00O0O00;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.note.NoteContentLocalDataSource$deleteNoteContentById$2", m80623f = "NoteContentLocalDataSource.kt", m80624l = {59}, m80625m = "invokeSuspend")
public final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<o00O0O00, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f90625OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90626OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f90627OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(String str, Continuation<? super OooO0O0> continuation) {
        super(2, continuation);
        this.f90627OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooO0O0 oooO0O0 = new OooO0O0(this.f90627OooOoO0, continuation);
        oooO0O0.f90625OooOo = obj;
        return oooO0O0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(o00O0O00 o00o0o002, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0O0) create(o00o0o002, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90626OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o00O0O00 o00o0o002 = (o00O0O00) this.f90625OooOo;
            this.f90626OooOo0o = 1;
            if (o00o0o002.OooO0O0(this.f90627OooOoO0, this) == enumC32485OooO00o) {
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
