package o0Ooo0oO;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.orion.notein.domain.models.page.Page;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0OOooo.C33163OooO0oO;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Ooo0oO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.viewmodel.PagePaddingViewModel$createPagePaddingStyleBitmap$2", m80623f = "PagePaddingViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29433OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Bitmap>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C33163OooO0oO f104458OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Page f104459OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C29423OooO00o f104460OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ float f104461OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29433OooO0o0(Page page, C33163OooO0oO c33163OooO0oO, float f, C29423OooO00o c29423OooO00o, Continuation continuation) {
        super(2, continuation);
        this.f104459OooOo0o = page;
        this.f104458OooOo = c33163OooO0oO;
        this.f104461OooOoO0 = f;
        this.f104460OooOoO = c29423OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C29423OooO00o c29423OooO00o = this.f104460OooOoO;
        return new C29433OooO0o0(this.f104459OooOo0o, this.f104458OooOo, this.f104461OooOoO0, c29423OooO00o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Bitmap> continuation) {
        return ((C29433OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Page page = this.f104459OooOo0o;
        C32443OooOOO<Integer, Integer> unrotatedPageSize = page.getUnrotatedPageSize();
        return C29423OooO00o.OooO0o0(this.f104460OooOoO, page.createTnBitmapWithBounds(this.f104458OooOo, new RectF(0.0f, 0.0f, unrotatedPageSize.f116638OooOo0o.intValue(), unrotatedPageSize.f116637OooOo.intValue()), this.f104461OooOoO0, 128), page.getRotationDirection());
    }
}
