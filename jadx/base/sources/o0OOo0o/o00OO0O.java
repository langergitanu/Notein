package o0OOo0o;

import com.orion.notein.domain.models.page.TextBox;
import java.io.Serializable;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0O0oooO.C26264OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$getTextBoxesByPageId$2", m80623f = "NoteUseCase.kt", m80624l = {491}, m80625m = "invokeSuspend")
public final class o00OO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends TextBox>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96144OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96145OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f96146OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f96147OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0O(String str, String str2, Continuation continuation, C27449o00O0OoO c27449o00O0OoO) {
        super(2, continuation);
        this.f96144OooOo = c27449o00O0OoO;
        this.f96147OooOoO0 = str;
        this.f96146OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00OO0O(this.f96147OooOoO0, this.f96146OooOoO, continuation, this.f96144OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends TextBox>> continuation) {
        return ((o00OO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96145OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C26264OooOOO0 c26264OooOOO0 = this.f96144OooOo.f96046OooOOO;
        this.f96145OooOo0o = 1;
        Serializable serializableOooO0Oo = c26264OooOOO0.OooO0Oo(this.f96147OooOoO0, this.f96146OooOoO, this);
        return serializableOooO0Oo == enumC32485OooO00o ? enumC32485OooO00o : serializableOooO0Oo;
    }
}
