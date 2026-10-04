package o0OOoo;

import com.android.billingclient.api.C22194OoooOOo;
import com.orion.notein.domain.models.page.Page;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OOoo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.page.CheckPageRecoverableUseCase$checkPage$2", m80623f = "CheckPageRecoverableUseCase.kt", m80624l = {25, 26}, m80625m = "invokeSuspend")
public final class C27823OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f98286OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Page f98287OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f98288OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C22194OoooOOo f98289OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f98290OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27823OooO0O0(C22194OoooOOo c22194OoooOOo, String str, String str2, Continuation<? super C27823OooO0O0> continuation) {
        super(2, continuation);
        this.f98289OooOoO0 = c22194OoooOOo;
        this.f98288OooOoO = str;
        this.f98290OooOoOO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27823OooO0O0(this.f98289OooOoO0, this.f98288OooOoO, this.f98290OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C27823OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Page page;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98286OooOo;
        String str = this.f98288OooOoO;
        String str2 = this.f98290OooOoOO;
        C22194OoooOOo c22194OoooOOo = this.f98289OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27449o00O0OoO c27449o00O0OoO = (C27449o00O0OoO) c22194OoooOOo.f67065OooO00o;
            this.f98286OooOo = 1;
            obj = c27449o00O0OoO.OoooO0(str, str2, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            page = this.f98287OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            if (((Page) obj) != null) {
                return Boolean.FALSE;
            }
            c22194OoooOOo.getClass();
            return Boolean.valueOf(!C34429OooOOo0.OooOO0o(page.getPaperOrientation(), page.getPaperSpec(), page.getUnrotatedPaperPadding(), page.getPaddingStyle(), page.getPaperTheme()).equals(C34429OooOOo0.OooOO0o(r8.getPaperOrientation(), r8.getPaperSpec(), r8.getUnrotatedPaperPadding(), r8.getPaddingStyle(), r8.getPaperTheme())));
        }
        C32446OooOOOo.OooO0O0(obj);
        Page page2 = (Page) obj;
        if (page2 == null) {
            return Boolean.FALSE;
        }
        Ooooo00.OooO oooO = (Ooooo00.OooO) c22194OoooOOo.f67066OooO0O0;
        this.f98287OooOo0o = page2;
        this.f98286OooOo = 2;
        Object objOooO00o = oooO.OooO00o(str2, str, this);
        if (objOooO00o != enumC32485OooO00o) {
            page = page2;
            obj = objOooO00o;
            if (((Page) obj) != null) {
            }
        }
        return enumC32485OooO00o;
    }
}
