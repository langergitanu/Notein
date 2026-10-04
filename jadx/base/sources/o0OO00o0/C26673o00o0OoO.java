package o0OO00o0;

import android.graphics.RectF;
import com.orion.notein.data.p602db.entity.TextBoxEntity;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34981o0O00OoO;

/* JADX INFO: renamed from: o0OO00o0.o00o0OoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.TextBoxLocalDataSource$getTextBoxesInBoundsByPageIdSync$2", m80623f = "TextBoxLocalDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26673o00o0OoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34981o0O00OoO, Continuation<? super List<? extends TextBoxEntity>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f92050OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f92051OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ RectF f92052OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26673o00o0OoO(String str, RectF rectF, Continuation<? super C26673o00o0OoO> continuation) {
        super(2, continuation);
        this.f92050OooOo = str;
        this.f92052OooOoO0 = rectF;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26673o00o0OoO c26673o00o0OoO = new C26673o00o0OoO(this.f92050OooOo, this.f92052OooOoO0, continuation);
        c26673o00o0OoO.f92051OooOo0o = obj;
        return c26673o00o0OoO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34981o0O00OoO abstractC34981o0O00OoO, Continuation<? super List<? extends TextBoxEntity>> continuation) {
        return ((C26673o00o0OoO) create(abstractC34981o0O00OoO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        AbstractC34981o0O00OoO abstractC34981o0O00OoO = (AbstractC34981o0O00OoO) this.f92051OooOo0o;
        RectF rectF = this.f92052OooOoO0;
        return abstractC34981o0O00OoO.OooO0o(this.f92050OooOo, rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
