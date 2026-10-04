package o0OO00o0;

import com.orion.notein.data.p602db.entity.StrokeEntity;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34993o0ooOoOO;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.StrokeLocalDataSource$getStrokesByPageId$2", m80623f = "StrokeLocalDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class oo00oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34993o0ooOoOO, Continuation<? super List<? extends StrokeEntity>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f92172OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f92173OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00oO(String str, Continuation<? super oo00oO> continuation) {
        super(2, continuation);
        this.f92172OooOo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        oo00oO oo00oo = new oo00oO(this.f92172OooOo, continuation);
        oo00oo.f92173OooOo0o = obj;
        return oo00oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34993o0ooOoOO abstractC34993o0ooOoOO, Continuation<? super List<? extends StrokeEntity>> continuation) {
        return ((oo00oO) create(abstractC34993o0ooOoOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return ((AbstractC34993o0ooOoOO) this.f92173OooOo0o).OooO0o0(this.f92172OooOo);
    }
}
