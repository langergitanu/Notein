package o0OOoo0o;

import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO00o0.C26613o00OOOoO;
import o0OO00o0.C26620o00Oo00o;
import o0OO00o0.o00OOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOoo0o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.outline.OutlineUseCase$deleteOutlines$2", m80623f = "OutlineUseCase.kt", m80624l = {188, 189}, m80625m = "invokeSuspend")
public final class C27860OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27869OooOOO f98454OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f98455OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f98456OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<String> f98457OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27860OooO0OO(C27869OooOOO c27869OooOOO, List<String> list, String str, Continuation<? super C27860OooO0OO> continuation) {
        super(2, continuation);
        this.f98454OooOo = c27869OooOOO;
        this.f98457OooOoO0 = list;
        this.f98456OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27860OooO0OO(this.f98454OooOo, this.f98457OooOoO0, this.f98456OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27860OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r3.OooO0OO(r2, r7) == r0) goto L21;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98455OooOo0o;
        String str = this.f98456OooOoO;
        C27869OooOOO c27869OooOOO = this.f98454OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C26620o00Oo00o c26620o00Oo00o = c27869OooOOO.f98487OooO00o;
            this.f98455OooOo0o = 1;
            C26613o00OOOoO c26613o00OOOoO = c26620o00Oo00o.f91878OooO00o;
            c26613o00OOOoO.getClass();
            Object objOooO00o = c26613o00OOOoO.OooO00o(str, new o00OOO0(this.f98457OooOoO0, null));
            if (objOooO00o != enumC32485OooO00o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o != enumC32485OooO00o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o != enumC32485OooO00o) {
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
        this.f98455OooOo0o = 2;
    }
}
