package o0OOo0oo;

import Oooo.C20813OooO0o0;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOo0o0.InterfaceC27605OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.C33716OooO;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OOo0oo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.CloudMetaUseCase$getCloudMetaLocalsFlow$$inlined$flatMapLatest$1", m80623f = "CloudMetaUseCase.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C27621OooOO0O extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends CloudMetaLocal>>, String, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f97128OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f97129OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C20813OooO0o0 f97130OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f97131OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27621OooOO0O(Continuation continuation, C20813OooO0o0 c20813OooO0o0) {
        super(3, continuation);
        this.f97130OooOoO = c20813OooO0o0;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends CloudMetaLocal>> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
        C27621OooOO0O c27621OooOO0O = new C27621OooOO0O(continuation, this.f97130OooOoO);
        c27621OooOO0O.f97128OooOo = interfaceC33723OooO0oO;
        c27621OooOO0O.f97131OooOoO0 = str;
        return c27621OooOO0O.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f97129OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f97128OooOo;
            String str = (String) this.f97131OooOoO0;
            InterfaceC33721OooO0o c33716OooO = (str == null || str.length() == 0) ? new C33716OooO(C34434OooOoO.f123453OooOo0o) : ((InterfaceC27605OooO00o) this.f97130OooOoO.f59765OooO00o).OooOoO(str);
            this.f97129OooOo0o = 1;
            if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, c33716OooO, this) == enumC32485OooO00o) {
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
