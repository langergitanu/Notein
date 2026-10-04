package o0OOo0o;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.page.Page;
import kotlin.coroutines.Continuation;
import o0OOO0OO.C27020OooOoO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o00O0o0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$getPageByIdSync$2", m80623f = "NoteUseCase.kt", m80624l = {StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_3}, m80625m = "invokeSuspend")
public final class C27457o00O0o0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Page>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96102OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96103OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f96104OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f96105OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27457o00O0o0o(String str, String str2, Continuation continuation, C27449o00O0OoO c27449o00O0OoO) {
        super(2, continuation);
        this.f96102OooOo = c27449o00O0OoO;
        this.f96105OooOoO0 = str;
        this.f96104OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27457o00O0o0o(this.f96105OooOoO0, this.f96104OooOoO, continuation, this.f96102OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Page> continuation) {
        return ((C27457o00O0o0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96103OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27020OooOoO0 c27020OooOoO0 = this.f96102OooOo.f96039OooO0o;
            this.f96103OooOo0o = 1;
            obj = c27020OooOoO0.OooO0Oo(this.f96105OooOoO0, this.f96104OooOoO, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        kotlin.jvm.internal.OooOOO0.OooO0Oo(obj);
        return obj;
    }
}
