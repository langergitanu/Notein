package o0OO00o0;

import com.orion.notein.data.p602db.entity.DualLinkRefEntity;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OO00o0.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.DualLinkRefLocalDataSource$getByNoteIdSync$2", m80623f = "DualLinkRefLocalDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26495Oooo00O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<oo0oO0.oo000o, Continuation<? super List<? extends DualLinkRefEntity>>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f91075OooOo0o;

    public C26495Oooo00O() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26495Oooo00O c26495Oooo00O = new C26495Oooo00O(2, continuation);
        c26495Oooo00O.f91075OooOo0o = obj;
        return c26495Oooo00O;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(oo0oO0.oo000o oo000oVar, Continuation<? super List<? extends DualLinkRefEntity>> continuation) {
        return ((C26495Oooo00O) create(oo000oVar, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return ((oo0oO0.oo000o) this.f91075OooOo0o).getAll();
    }
}
