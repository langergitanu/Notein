package o0OOo0o;

import android.graphics.RectF;
import com.orion.notein.domain.models.page.Shape;
import java.io.Serializable;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO00o0.C26649o00OoooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o00O0oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$getShapesInBoundsByPageIdSync$2", m80623f = "NoteUseCase.kt", m80624l = {443}, m80625m = "invokeSuspend")
public final class C27462o00O0oo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Shape>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96117OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96118OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f96119OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f96120OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ RectF f96121OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27462o00O0oo0(C27449o00O0OoO c27449o00O0OoO, String str, String str2, RectF rectF, Continuation<? super C27462o00O0oo0> continuation) {
        super(2, continuation);
        this.f96117OooOo = c27449o00O0OoO;
        this.f96120OooOoO0 = str;
        this.f96119OooOoO = str2;
        this.f96121OooOoOO = rectF;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27462o00O0oo0(this.f96117OooOo, this.f96120OooOoO0, this.f96119OooOoO, this.f96121OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Shape>> continuation) {
        return ((C27462o00O0oo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96118OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C26649o00OoooO c26649o00OoooO = this.f96117OooOo.f96051OooOOo0;
        this.f96118OooOo0o = 1;
        Serializable serializableOooO0Oo = c26649o00OoooO.OooO0Oo(this.f96120OooOoO0, this.f96119OooOoO, this.f96121OooOoOO, this);
        return serializableOooO0Oo == enumC32485OooO00o ? enumC32485OooO00o : serializableOooO0Oo;
    }
}
