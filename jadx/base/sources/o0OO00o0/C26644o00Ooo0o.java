package o0OO00o0;

import com.orion.notein.data.p602db.entity.ShapeEntity;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34967o00ooo00;

/* JADX INFO: renamed from: o0OO00o0.o00Ooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ShapeLocalDataSource$getShapesByPageIdSync$2", m80623f = "ShapeLocalDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26644o00Ooo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34967o00ooo00, Continuation<? super List<? extends ShapeEntity>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f91960OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f91961OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26644o00Ooo0o(String str, Continuation<? super C26644o00Ooo0o> continuation) {
        super(2, continuation);
        this.f91960OooOo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26644o00Ooo0o c26644o00Ooo0o = new C26644o00Ooo0o(this.f91960OooOo, continuation);
        c26644o00Ooo0o.f91961OooOo0o = obj;
        return c26644o00Ooo0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34967o00ooo00 abstractC34967o00ooo00, Continuation<? super List<? extends ShapeEntity>> continuation) {
        return ((C26644o00Ooo0o) create(abstractC34967o00ooo00, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return ((AbstractC34967o00ooo00) this.f91961OooOo0o).OooO0o0(this.f91960OooOo);
    }
}
