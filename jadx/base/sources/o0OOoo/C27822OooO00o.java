package o0OOoo;

import com.android.billingclient.api.C22194OoooOOo;
import com.orion.notein.domain.models.page.Page;
import java.util.Iterator;
import java.util.List;
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

/* JADX INFO: renamed from: o0OOoo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.page.CheckPageRecoverableUseCase$checkAnyPageRecoverable$2", m80623f = "CheckPageRecoverableUseCase.kt", m80624l = {36, 39}, m80625m = "invokeSuspend")
public final class C27822OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Page f98281OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Iterator f98282OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C22194OoooOOo f98283OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f98284OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f98285OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27822OooO00o(C22194OoooOOo c22194OoooOOo, String str, Continuation<? super C27822OooO00o> continuation) {
        super(2, continuation);
        this.f98283OooOoO = c22194OoooOOo;
        this.f98285OooOoOO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27822OooO00o(this.f98283OooOoO, this.f98285OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C27822OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r11 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if (r11 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005a -> B:19:0x005d). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98284OooOoO0;
        String str = this.f98285OooOoOO;
        C22194OoooOOo c22194OoooOOo = this.f98283OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27449o00O0OoO c27449o00O0OoO = (C27449o00O0OoO) c22194OoooOOo.f67065OooO00o;
            this.f98284OooOoO0 = 1;
            obj = c27449o00O0OoO.OooOooO(str, this);
        } else if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Page page = this.f98281OooOo;
            it = this.f98282OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            Page page2 = (Page) obj;
            if (page2 != null) {
                c22194OoooOOo.getClass();
                if (!C34429OooOOo0.OooOO0o(page.getPaperOrientation(), page.getPaperSpec(), page.getUnrotatedPaperPadding(), page.getPaddingStyle(), page.getPaperTheme()).equals(C34429OooOOo0.OooOO0o(page2.getPaperOrientation(), page2.getPaperSpec(), page2.getUnrotatedPaperPadding(), page2.getPaddingStyle(), page2.getPaperTheme()))) {
                    return Boolean.TRUE;
                }
            }
            if (it.hasNext()) {
                return Boolean.FALSE;
            }
            page = (Page) it.next();
            Ooooo00.OooO oooO = (Ooooo00.OooO) c22194OoooOOo.f67066OooO0O0;
            String id = page.getId();
            this.f98282OooOo0o = it;
            this.f98281OooOo = page;
            this.f98284OooOoO0 = 2;
            obj = oooO.OooO00o(str, id, this);
        }
        it = ((List) obj).iterator();
        if (it.hasNext()) {
        }
    }
}
