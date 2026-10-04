package o0OOo0o;

import android.graphics.RectF;
import com.orion.notein.domain.models.page.Stroke;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27323Oooo0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$getStrokesInBoundsByPageId$2", m80623f = "NoteUseCase.kt", m80624l = {648}, m80625m = "invokeSuspend")
public final class o00OO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Stroke>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96148OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96149OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f96150OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f96151OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ RectF f96152OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0O0(C27449o00O0OoO c27449o00O0OoO, String str, String str2, RectF rectF, Continuation<? super o00OO0O0> continuation) {
        super(2, continuation);
        this.f96148OooOo = c27449o00O0OoO;
        this.f96151OooOoO0 = str;
        this.f96150OooOoO = str2;
        this.f96152OooOoOO = rectF;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00OO0O0(this.f96148OooOo, this.f96151OooOoO0, this.f96150OooOoO, this.f96152OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Stroke>> continuation) {
        return ((o00OO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96149OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC27323Oooo0oO interfaceC27323Oooo0oO = this.f96148OooOo.f96034OooO;
        this.f96149OooOo0o = 1;
        Object objOooOO0 = interfaceC27323Oooo0oO.OooOO0(this.f96151OooOoO0, this.f96150OooOoO, this.f96152OooOoOO, this);
        return objOooOO0 == enumC32485OooO00o ? enumC32485OooO00o : objOooOO0;
    }
}
