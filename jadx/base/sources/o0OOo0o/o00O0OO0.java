package o0OOo0o;

import com.orion.notein.domain.models.page.HyperLink;
import java.io.Serializable;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27301OooOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$getHyperLinkByPageId$2", m80623f = "NoteUseCase.kt", m80624l = {636}, m80625m = "invokeSuspend")
public final class o00O0OO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends HyperLink>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96003OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96004OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f96005OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f96006OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO0(String str, String str2, Continuation continuation, C27449o00O0OoO c27449o00O0OoO) {
        super(2, continuation);
        this.f96003OooOo = c27449o00O0OoO;
        this.f96006OooOoO0 = str;
        this.f96005OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00O0OO0(this.f96006OooOoO0, this.f96005OooOoO, continuation, this.f96003OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends HyperLink>> continuation) {
        return ((o00O0OO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96004OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC27301OooOOo interfaceC27301OooOOo = this.f96003OooOo.f96054OooOo0;
        this.f96004OooOo0o = 1;
        Serializable serializableOooO0o0 = interfaceC27301OooOOo.OooO0o0(this.f96006OooOoO0, this.f96005OooOoO, this);
        return serializableOooO0o0 == enumC32485OooO00o ? enumC32485OooO00o : serializableOooO0o0;
    }
}
