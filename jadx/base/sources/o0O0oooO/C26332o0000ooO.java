package o0O0oooO;

import com.orion.notein.domain.models.NoteinFirebaseUser;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0O0oooO.o0000ooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$special$$inlined$flatMapLatest$3", m80623f = "UserViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C26332o0000ooO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends NoteMeta>>, NoteinFirebaseUser, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f90305OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90306OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C26320o0000OoO f90307OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f90308OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26332o0000ooO(Continuation continuation, C26320o0000OoO c26320o0000OoO) {
        super(3, continuation);
        this.f90307OooOoO = c26320o0000OoO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends NoteMeta>> interfaceC33723OooO0oO, NoteinFirebaseUser noteinFirebaseUser, Continuation<? super C32460OooOooO> continuation) {
        C26332o0000ooO c26332o0000ooO = new C26332o0000ooO(continuation, this.f90307OooOoO);
        c26332o0000ooO.f90305OooOo = interfaceC33723OooO0oO;
        c26332o0000ooO.f90308OooOoO0 = noteinFirebaseUser;
        return c26332o0000ooO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        String id;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90306OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f90305OooOo;
            NoteinFirebaseUser noteinFirebaseUser = (NoteinFirebaseUser) this.f90308OooOoO0;
            C27449o00O0OoO c27449o00O0OoO = this.f90307OooOoO.f90205OooO0Oo;
            if (noteinFirebaseUser == null || (id = noteinFirebaseUser.getId()) == null) {
                id = "";
            }
            InterfaceC33721OooO0o<List<NoteMeta>> interfaceC33721OooO0oOooOOo = c27449o00O0OoO.OooOOo(id);
            this.f90306OooOo0o = 1;
            if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, interfaceC33721OooO0oOooOOo, this) == enumC32485OooO00o) {
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
