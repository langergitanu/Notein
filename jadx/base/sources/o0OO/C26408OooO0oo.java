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

/* JADX INFO: renamed from: o0OO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.note.NoteContentLocalDataSource$updateNoteContent$2", m80623f = "NoteContentLocalDataSource.kt", m80624l = {83}, m80625m = "invokeSuspend")
public final class C26408OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<o00O0O00, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f90646OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90647OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ NoteContentEntity f90648OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26408OooO0oo(NoteContentEntity noteContentEntity, Continuation<? super C26408OooO0oo> continuation) {
        super(2, continuation);
        this.f90648OooOoO0 = noteContentEntity;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26408OooO0oo c26408OooO0oo = new C26408OooO0oo(this.f90648OooOoO0, continuation);
        c26408OooO0oo.f90646OooOo = obj;
        return c26408OooO0oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(o00O0O00 o00o0o002, Continuation<? super C32460OooOooO> continuation) {
        return ((C26408OooO0oo) create(o00o0o002, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90647OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o00O0O00 o00o0o002 = (o00O0O00) this.f90646OooOo;
            NoteContentEntity[] noteContentEntityArr = {this.f90648OooOoO0};
            this.f90647OooOo0o = 1;
            if (o00o0o002.OooOO0(noteContentEntityArr, this) == enumC32485OooO00o) {
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
