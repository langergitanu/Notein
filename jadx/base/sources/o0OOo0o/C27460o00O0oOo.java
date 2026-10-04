package o0OOo0o;

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

/* JADX INFO: renamed from: o0OOo0o.o00O0oOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$getShapesByPageIdSync$2", m80623f = "NoteUseCase.kt", m80624l = {437}, m80625m = "invokeSuspend")
public final class C27460o00O0oOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Shape>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96112OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96113OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f96114OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f96115OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27460o00O0oOo(String str, String str2, Continuation continuation, C27449o00O0OoO c27449o00O0OoO) {
        super(2, continuation);
        this.f96112OooOo = c27449o00O0OoO;
        this.f96115OooOoO0 = str;
        this.f96114OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27460o00O0oOo(this.f96115OooOoO0, this.f96114OooOoO, continuation, this.f96112OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Shape>> continuation) {
        return ((C27460o00O0oOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96113OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C26649o00OoooO c26649o00OoooO = this.f96112OooOo.f96051OooOOo0;
        this.f96113OooOo0o = 1;
        Serializable serializableOooO0OO = c26649o00OoooO.OooO0OO(this.f96115OooOoO0, this.f96114OooOoO, this);
        return serializableOooO0OO == enumC32485OooO00o ? enumC32485OooO00o : serializableOooO0OO;
    }
}
