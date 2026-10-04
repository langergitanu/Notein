package o0OOO0OO;

import com.orion.notein.data.p602db.NoteContentDatabase;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34924o00oOOO0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.page.PageLocalDataSource$handleWithPageSizeDaoSync$2", m80623f = "PageLocalDataSource.kt", m80624l = {27}, m80625m = "invokeSuspend")
public final class OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<NoteContentDatabase, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f94013OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94014OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27009OooO0oO f94015OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(C27009OooO0oO c27009OooO0oO, Continuation continuation) {
        super(2, continuation);
        this.f94015OooOoO0 = c27009OooO0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooOOO oooOOO = new OooOOO(this.f94015OooOoO0, continuation);
        oooOOO.f94013OooOo = obj;
        return oooOOO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(NoteContentDatabase noteContentDatabase, Continuation<Object> continuation) {
        return ((OooOOO) create(noteContentDatabase, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94014OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        AbstractC34924o00oOOO0 abstractC34924o00oOOO0OooOooo = ((NoteContentDatabase) this.f94013OooOo).OooOooo();
        this.f94014OooOo0o = 1;
        Object objInvoke = this.f94015OooOoO0.invoke(abstractC34924o00oOOO0OooOooo, this);
        return objInvoke == enumC32485OooO00o ? enumC32485OooO00o : objInvoke;
    }
}
