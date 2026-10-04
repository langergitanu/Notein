package o0OOo0o;

import com.orion.notein.domain.models.note.Note;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o000oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$createNoteByPages$2", m80623f = "NoteUseCase.kt", m80624l = {1506}, m80625m = "invokeSuspend")
public final class C27441o000oooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f95860OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f95861OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f95862OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f95863OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ List<String> f95864OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f95865OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27441o000oooo(String str, String str2, List list, Continuation continuation, C27449o00O0OoO c27449o00O0OoO) {
        super(2, continuation);
        this.f95863OooOoO0 = str;
        this.f95862OooOoO = c27449o00O0OoO;
        this.f95864OooOoOO = list;
        this.f95865OooOoo0 = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        List<String> list = this.f95864OooOoOO;
        return new C27441o000oooo(this.f95863OooOoO0, this.f95865OooOoo0, list, continuation, this.f95862OooOoO);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C27441o000oooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95860OooOo;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = this.f95861OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return str;
        }
        C32446OooOOOo.OooO0O0(obj);
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
        Note note = new Note(string, null, null, null, this.f95863OooOoO0, false, null, null, null, null, System.currentTimeMillis(), System.currentTimeMillis(), null, null, false, 0, null, 0.0f, null, false, false, 2094062, null);
        this.f95861OooOo0o = string;
        this.f95860OooOo = 1;
        return this.f95862OooOoO.OooO0oO(this.f95864OooOoOO, this.f95865OooOoo0, note, 0, this) == enumC32485OooO00o ? enumC32485OooO00o : string;
    }
}
