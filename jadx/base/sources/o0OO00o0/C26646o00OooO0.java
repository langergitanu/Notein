package o0OO00o0;

import android.graphics.RectF;
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

/* JADX INFO: renamed from: o0OO00o0.o00OooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ShapeLocalDataSource$getShapesInBoundsByPageIdSync$2", m80623f = "ShapeLocalDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26646o00OooO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34967o00ooo00, Continuation<? super List<? extends ShapeEntity>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f91965OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f91966OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ RectF f91967OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26646o00OooO0(String str, RectF rectF, Continuation<? super C26646o00OooO0> continuation) {
        super(2, continuation);
        this.f91965OooOo = str;
        this.f91967OooOoO0 = rectF;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26646o00OooO0 c26646o00OooO0 = new C26646o00OooO0(this.f91965OooOo, this.f91967OooOoO0, continuation);
        c26646o00OooO0.f91966OooOo0o = obj;
        return c26646o00OooO0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34967o00ooo00 abstractC34967o00ooo00, Continuation<? super List<? extends ShapeEntity>> continuation) {
        return ((C26646o00OooO0) create(abstractC34967o00ooo00, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        AbstractC34967o00ooo00 abstractC34967o00ooo00 = (AbstractC34967o00ooo00) this.f91966OooOo0o;
        RectF rectF = this.f91967OooOoO0;
        return abstractC34967o00ooo00.OooO0o(this.f91965OooOo, rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
