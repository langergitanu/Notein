package o0Ooo0oO;

import android.graphics.Bitmap;
import android.graphics.Rect;
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

/* JADX INFO: renamed from: o0Ooo0oO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.viewmodel.PagePaddingViewModel$createPageContentBitmap$2", m80623f = "PagePaddingViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29430OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Bitmap>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C33163OooO0oO f104445OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Page f104446OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C29423OooO00o f104447OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ float f104448OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29430OooO0OO(Page page, C33163OooO0oO c33163OooO0oO, float f, C29423OooO00o c29423OooO00o, Continuation continuation) {
        super(2, continuation);
        this.f104446OooOo0o = page;
        this.f104445OooOo = c33163OooO0oO;
        this.f104448OooOoO0 = f;
        this.f104447OooOoO = c29423OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C29423OooO00o c29423OooO00o = this.f104447OooOoO;
        return new C29430OooO0OO(this.f104446OooOo0o, this.f104445OooOo, this.f104448OooOoO0, c29423OooO00o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Bitmap> continuation) {
        return ((C29430OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Page page = this.f104446OooOo0o;
        C32443OooOOO<Integer, Integer> unrotatedPageSize = page.getUnrotatedPageSize();
        int iIntValue = unrotatedPageSize.f116638OooOo0o.intValue();
        int iIntValue2 = unrotatedPageSize.f116637OooOo.intValue();
        Rect unrotatedPaperPadding = page.getUnrotatedPaperPadding();
        return C29423OooO00o.OooO0o0(this.f104447OooOoO, page.createTnBitmapWithBounds(this.f104445OooOo, new RectF(unrotatedPaperPadding.left * 1.0f, unrotatedPaperPadding.top * 1.0f, iIntValue - (unrotatedPaperPadding.right * 1.0f), iIntValue2 - (unrotatedPaperPadding.bottom * 1.0f)), this.f104448OooOoO0, 64), page.getRotationDirection());
    }
}
