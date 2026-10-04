package o0Ooo0oO;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PaperSpec;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Ooo0oO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.viewmodel.PagePaddingViewModel$createPageDisplayItemsBitmap$2", m80623f = "PagePaddingViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29431OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Bitmap>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Context f104449OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Page f104450OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C29423OooO00o f104451OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ float f104452OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29431OooO0Oo(Page page, Context context, float f, C29423OooO00o c29423OooO00o, Continuation<? super C29431OooO0Oo> continuation) {
        super(2, continuation);
        this.f104450OooOo0o = page;
        this.f104449OooOo = context;
        this.f104452OooOoO0 = f;
        this.f104451OooOoO = c29423OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29431OooO0Oo(this.f104450OooOo0o, this.f104449OooOo, this.f104452OooOoO0, this.f104451OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Bitmap> continuation) {
        return ((C29431OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Page page = this.f104450OooOo0o;
        C32443OooOOO<Integer, Integer> unrotatedPageSize = page.getUnrotatedPageSize();
        int iIntValue = unrotatedPageSize.f116638OooOo0o.intValue();
        int iIntValue2 = unrotatedPageSize.f116637OooOo.intValue();
        Rect unrotatedPaperPadding = page.getUnrotatedPaperPadding();
        int i = (iIntValue - unrotatedPaperPadding.left) - unrotatedPaperPadding.right;
        int i2 = (iIntValue2 - unrotatedPaperPadding.top) - unrotatedPaperPadding.bottom;
        PaperSpec paperSpec = new PaperSpec("", "", false, 5000, 5000, null, null, 0, 0, 480, null);
        return C29423OooO00o.OooO0o0(this.f104451OooOoO, Page.copy$default(this.f104450OooOo0o, null, null, paperSpec, null, null, null, new Rect((paperSpec.getWidth() - i) / 2, (paperSpec.getHeight() - i2) / 2, (paperSpec.getWidth() - i) / 2, (paperSpec.getHeight() - i2) / 2), null, false, 0, 0L, 0L, null, null, 0, false, null, null, null, 524219, null).createTnBitmapWithBounds(this.f104449OooOo, new RectF(0.0f, 0.0f, paperSpec.getWidth() * 1.0f, paperSpec.getHeight() * 1.0f), this.f104452OooOoO0, 63), page.getRotationDirection());
    }
}
