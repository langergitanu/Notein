package o0OOoo;

import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27585o00ooO0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOoo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.page.RecoverPageUseCase$updateThumbnailsAsync$1", m80623f = "RecoverPageUseCase.kt", m80624l = {94}, m80625m = "invokeSuspend")
public final class C27829OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f98317OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f98318OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Set<String> f98319OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27821OooO f98320OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f98321OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27829OooO0oo(C27821OooO c27821OooO, Set<String> set, String str, Continuation<? super C27829OooO0oo> continuation) {
        super(2, continuation);
        this.f98320OooOoO0 = c27821OooO;
        this.f98319OooOoO = set;
        this.f98321OooOoOO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27829OooO0oo c27829OooO0oo = new C27829OooO0oo(this.f98320OooOoO0, this.f98319OooOoO, this.f98321OooOoOO, continuation);
        c27829OooO0oo.f98317OooOo = obj;
        return c27829OooO0oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27829OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object objOooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98318OooOo0o;
        Set<String> set = this.f98319OooOoO;
        String str = this.f98321OooOoOO;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C27585o00ooO0 c27585o00ooO0 = this.f98320OooOoO0.f98279OooO0O0;
                this.f98318OooOo0o = 1;
                obj = c27585o00ooO0.OooO00o(set, str, true, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            objOooO00o = (Map) obj;
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("RecoverPageUseCase");
            c20358OooO00o.OooO0Oo(thOooO00o, "TN update failed: noteId=%s, pageIds=%s", str, set);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
