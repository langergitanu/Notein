package o0OOO0OO;

import android.graphics.RectF;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34924o00oOOO0;

/* JADX INFO: renamed from: o0OOO0OO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.page.PageLocalDataSource$getDisplayItemBounds$2", m80623f = "PageLocalDataSource.kt", m80624l = {137}, m80625m = "invokeSuspend")
public final class C27009OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34924o00oOOO0, Continuation<? super RectF>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f93996OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f93997OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f93998OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27009OooO0oO(String str, Continuation<? super C27009OooO0oO> continuation) {
        super(2, continuation);
        this.f93998OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27009OooO0oO c27009OooO0oO = new C27009OooO0oO(this.f93998OooOoO0, continuation);
        c27009OooO0oO.f93996OooOo = obj;
        return c27009OooO0oO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34924o00oOOO0 abstractC34924o00oOOO0, Continuation<? super RectF> continuation) {
        return ((C27009OooO0oO) create(abstractC34924o00oOOO0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93997OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        AbstractC34924o00oOOO0 abstractC34924o00oOOO0 = (AbstractC34924o00oOOO0) this.f93996OooOo;
        this.f93997OooOo0o = 1;
        Object objOooO00o = abstractC34924o00oOOO0.OooO00o(this.f93998OooOoO0, this);
        return objOooO00o == enumC32485OooO00o ? enumC32485OooO00o : objOooO00o;
    }
}
