package o0OO00o0;

import android.graphics.RectF;
import com.orion.notein.data.p602db.entity.ImageEntity;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34767o0000oOO;

/* JADX INFO: renamed from: o0OO00o0.o00O00Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ImageLocalDataSource$getImagesInBoundsByPageIdSync$2", m80623f = "ImageLocalDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26586o00O00Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34767o0000oOO, Continuation<? super List<? extends ImageEntity>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f91662OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f91663OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ RectF f91664OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26586o00O00Oo(String str, RectF rectF, Continuation<? super C26586o00O00Oo> continuation) {
        super(2, continuation);
        this.f91662OooOo = str;
        this.f91664OooOoO0 = rectF;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26586o00O00Oo c26586o00O00Oo = new C26586o00O00Oo(this.f91662OooOo, this.f91664OooOoO0, continuation);
        c26586o00O00Oo.f91663OooOo0o = obj;
        return c26586o00O00Oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34767o0000oOO abstractC34767o0000oOO, Continuation<? super List<? extends ImageEntity>> continuation) {
        return ((C26586o00O00Oo) create(abstractC34767o0000oOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        AbstractC34767o0000oOO abstractC34767o0000oOO = (AbstractC34767o0000oOO) this.f91663OooOo0o;
        RectF rectF = this.f91664OooOoO0;
        return abstractC34767o0000oOO.OooOO0(this.f91662OooOo, rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
