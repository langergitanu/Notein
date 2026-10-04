package o0OOo0o;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import kotlin.coroutines.Continuation;
import o0OOOO00.C27095OooOo0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o00oOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.ThemeUseCase$getMyTemplateByIdSync$2", m80623f = "ThemeUseCase.kt", m80624l = {StyleIdentifier.GRID_TABLE_3_ACCENT_5}, m80625m = "invokeSuspend")
public final class C27563o00oOo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super MyTemplate>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27570o00oOoo0 f96706OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96707OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f96708OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27563o00oOo0O(C27570o00oOoo0 c27570o00oOoo0, String str, Continuation<? super C27563o00oOo0O> continuation) {
        super(2, continuation);
        this.f96706OooOo = c27570o00oOoo0;
        this.f96708OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27563o00oOo0O(this.f96706OooOo, this.f96708OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super MyTemplate> continuation) {
        return ((C27563o00oOo0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96707OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C27095OooOo0O c27095OooOo0O = this.f96706OooOo.f96740OooO0O0;
        this.f96707OooOo0o = 1;
        Object objOooOO0o = c27095OooOo0O.OooOO0o(this.f96708OooOoO0, this);
        return objOooOO0o == enumC32485OooO00o ? enumC32485OooO00o : objOooOO0o;
    }
}
