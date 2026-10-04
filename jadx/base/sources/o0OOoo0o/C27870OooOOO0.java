package o0OOoo0o;

import com.orion.notein.domain.models.note.Outline;
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

/* JADX INFO: renamed from: o0OOoo0o.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.outline.OutlineUseCase$updateOutlines$2", m80623f = "OutlineUseCase.kt", m80624l = {216, 217}, m80625m = "invokeSuspend")
public final class C27870OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27869OooOOO f98491OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f98492OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f98493OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<Outline> f98494OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27870OooOOO0(C27869OooOOO c27869OooOOO, List<Outline> list, String str, Continuation<? super C27870OooOOO0> continuation) {
        super(2, continuation);
        this.f98491OooOo = c27869OooOOO;
        this.f98494OooOoO0 = list;
        this.f98493OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27870OooOOO0(this.f98491OooOo, this.f98494OooOoO0, this.f98493OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27870OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r3.OooO0OO(r2, r6) == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98492OooOo0o;
        String str = this.f98493OooOoO;
        C27869OooOOO c27869OooOOO = this.f98491OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C26620o00Oo00o c26620o00Oo00o = c27869OooOOO.f98487OooO00o;
            this.f98492OooOo0o = 1;
            if (c26620o00Oo00o.OooO0o(this.f98494OooOoO0, str, this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        this.f98492OooOo0o = 2;
    }
}
