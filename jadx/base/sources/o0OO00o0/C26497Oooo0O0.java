package o0OO00o0;

import com.orion.notein.data.p602db.NoteContentDatabase;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OO00o0.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.DualLinkRefLocalDataSource$handleWithDualLinkRefDaoSync$2", m80623f = "DualLinkRefLocalDataSource.kt", m80624l = {20}, m80625m = "invokeSuspend")
public final class C26497Oooo0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<NoteContentDatabase, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91078OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91079OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractC32476OooO f91080OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C26497Oooo0O0(InterfaceC32508OooOOOo<? super oo0oO0.oo000o, ? super Continuation<Object>, ? extends Object> interfaceC32508OooOOOo, Continuation<? super C26497Oooo0O0> continuation) {
        super(2, continuation);
        this.f91080OooOoO0 = (AbstractC32476OooO) interfaceC32508OooOOOo;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26497Oooo0O0 c26497Oooo0O0 = new C26497Oooo0O0(this.f91080OooOoO0, continuation);
        c26497Oooo0O0.f91078OooOo = obj;
        return c26497Oooo0O0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(NoteContentDatabase noteContentDatabase, Continuation<Object> continuation) {
        return ((C26497Oooo0O0) create(noteContentDatabase, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91079OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        oo0oO0.oo000o oo000oVarOooOo0o = ((NoteContentDatabase) this.f91078OooOo).OooOo0o();
        this.f91079OooOo0o = 1;
        Object objInvoke = this.f91080OooOoO0.invoke(oo000oVarOooOo0o, this);
        return objInvoke == enumC32485OooO00o ? enumC32485OooO00o : objInvoke;
    }
}
