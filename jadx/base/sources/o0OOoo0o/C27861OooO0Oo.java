package o0OOoo0o;

import com.orion.notein.domain.models.note.Outline;
import java.io.Serializable;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO00o0.C26620o00Oo00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOoo0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.outline.OutlineUseCase$getOutlineByNoteSync$2", m80623f = "OutlineUseCase.kt", m80624l = {210}, m80625m = "invokeSuspend")
public final class C27861OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Outline>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27869OooOOO f98458OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f98459OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f98460OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27861OooO0Oo(C27869OooOOO c27869OooOOO, String str, Continuation<? super C27861OooO0Oo> continuation) {
        super(2, continuation);
        this.f98458OooOo = c27869OooOOO;
        this.f98460OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27861OooO0Oo(this.f98458OooOo, this.f98460OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Outline>> continuation) {
        return ((C27861OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98459OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C26620o00Oo00o c26620o00Oo00o = this.f98458OooOo.f98487OooO00o;
        this.f98459OooOo0o = 1;
        Serializable serializableOooO0O0 = c26620o00Oo00o.OooO0O0(this.f98460OooOoO0, this);
        return serializableOooO0O0 == enumC32485OooO00o ? enumC32485OooO00o : serializableOooO0O0;
    }
}
