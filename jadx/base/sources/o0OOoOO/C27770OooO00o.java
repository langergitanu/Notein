package o0OOoOO;

import android.graphics.BitmapFactory;
import com.facebook.soloader.OooOo;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.papertheme.ColorPaperTheme;
import com.orion.notein.domain.models.papertheme.LocalUriPaperTheme;
import com.orion.notein.domain.models.papertheme.ThemeCategory;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import o0OOOO00.OooOO0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOoOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.createpage.CreateImagePagesUseCase$createImagePage$2", m80623f = "CreateImagePagesUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27770OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Page>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f98094OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f98095OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27770OooO00o(String str, String str2, Continuation<? super C27770OooO00o> continuation) {
        super(2, continuation);
        this.f98095OooOo0o = str;
        this.f98094OooOo = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27770OooO00o(this.f98095OooOo0o, this.f98094OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Page>> continuation) {
        return ((C27770OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        PaperOrientation paperOrientation;
        int height;
        int height2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(this.f98095OooOo0o, options);
        if (options.outWidth > options.outHeight) {
            height = PaperSpec.INSTANCE.getA4().getHeight();
            height2 = (int) ((options.outHeight / options.outWidth) * r2.getA4().getHeight());
            paperOrientation = PaperOrientation.HORIZONTAL;
        } else {
            int height3 = PaperSpec.INSTANCE.getA4().getHeight();
            int height4 = (int) ((options.outWidth / options.outHeight) * r2.getA4().getHeight());
            paperOrientation = PaperOrientation.VERTICAL;
            height = height4;
            height2 = height3;
        }
        PaperOrientation paperOrientation2 = paperOrientation;
        PaperSpec paperSpec = new PaperSpec("自定义图片", "", false, Math.min(height, height2), Math.max(height, height2), null, null, 0, 0, 96, null);
        ColorPaperTheme colorPaperTheme = new ColorPaperTheme(null, -1);
        ThemeCategory themeCategory = OooOO0O.f94356OooOO0;
        String str = this.f98095OooOo0o;
        return OooOo.OooO0oO(new Page(C24761OooO.OooO00o("toString(...)"), this.f98094OooOo, paperSpec, paperOrientation2, new LocalUriPaperTheme(colorPaperTheme, "", OooOO0O.f94363OooOOo, paperOrientation2, str, str, null, 64, null), null, 0 == true ? 1 : 0, "", false, 0, 0L, 0L, null, null, 0, false, null, null, null, 524128, null));
    }
}
