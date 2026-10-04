package o0OOo0o;

import com.orion.notein.domain.models.note.Note;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.ExportUseCase$exportDataLoader$1$loadNote$2", m80623f = "ExportUseCase.kt", m80624l = {39}, m80625m = "invokeSuspend")
public final class C27369OooooO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Note>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27596o00ooo f95287OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95288OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f95289OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f95290OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27369OooooO0(C27596o00ooo c27596o00ooo, String str, int i, Continuation<? super C27369OooooO0> continuation) {
        super(2, continuation);
        this.f95287OooOo = c27596o00ooo;
        this.f95290OooOoO0 = str;
        this.f95289OooOoO = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27369OooooO0(this.f95287OooOo, this.f95290OooOoO0, this.f95289OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Note> continuation) {
        return ((C27369OooooO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Exception {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95288OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27449o00O0OoO c27449o00O0OoO = this.f95287OooOo.f96912OooO0O0;
            this.f95288OooOo0o = 1;
            obj = c27449o00O0OoO.Oooo0O0(this.f95290OooOoO0, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        Note note = (Note) obj;
        if (note != null) {
            return note;
        }
        throw new Exception("Note not found");
    }
}
