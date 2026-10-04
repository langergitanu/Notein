package o0OOooo0;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import o000O00.C24378OooOoO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOooo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.quote.QuoteUseCase$createQuote$2", m80623f = "QuoteUseCase.kt", m80624l = {99, 100}, m80625m = "invokeSuspend")
public final class C27982OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27994OooOOOO f99213OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99214OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f99215OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f99216OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27982OooO0O0(C27994OooOOOO c27994OooOOOO, ArrayList arrayList, String str, Continuation continuation) {
        super(2, continuation);
        this.f99213OooOo = c27994OooOOOO;
        this.f99216OooOoO0 = arrayList;
        this.f99215OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27982OooO0O0(this.f99213OooOo, this.f99216OooOoO0, this.f99215OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27982OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (o0OOooo0.C27994OooOOOO.OooO00o(r3, r2, r6) == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99214OooOo0o;
        String str = this.f99215OooOoO;
        C27994OooOOOO c27994OooOOOO = this.f99213OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C24378OooOoO0 c24378OooOoO0 = c27994OooOOOO.f99260OooO00o;
            this.f99214OooOo0o = 1;
            if (c24378OooOoO0.OooO00o(str, this.f99216OooOoO0, this) != enumC32485OooO00o) {
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
        this.f99214OooOo0o = 2;
    }
}
