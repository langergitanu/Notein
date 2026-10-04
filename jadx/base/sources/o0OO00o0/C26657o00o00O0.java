package o0OO00o0;

import android.graphics.RectF;
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

/* JADX INFO: renamed from: o0OO00o0.o00o00O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.StrokeLocalDataSource$getStrokesInBoundsByPageId$4", m80623f = "StrokeLocalDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26657o00o00O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34993o0ooOoOO, Continuation<? super List<? extends StrokeEntity>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f91996OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f91997OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ RectF f91998OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26657o00o00O0(String str, RectF rectF, Continuation<? super C26657o00o00O0> continuation) {
        super(2, continuation);
        this.f91996OooOo = str;
        this.f91998OooOoO0 = rectF;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26657o00o00O0 c26657o00o00O0 = new C26657o00o00O0(this.f91996OooOo, this.f91998OooOoO0, continuation);
        c26657o00o00O0.f91997OooOo0o = obj;
        return c26657o00o00O0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34993o0ooOoOO abstractC34993o0ooOoOO, Continuation<? super List<? extends StrokeEntity>> continuation) {
        return ((C26657o00o00O0) create(abstractC34993o0ooOoOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        AbstractC34993o0ooOoOO abstractC34993o0ooOoOO = (AbstractC34993o0ooOoOO) this.f91997OooOo0o;
        RectF rectF = this.f91998OooOoO0;
        return abstractC34993o0ooOoOO.OooO0oo(this.f91996OooOo, rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
