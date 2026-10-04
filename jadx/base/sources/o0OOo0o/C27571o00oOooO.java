package o0OOo0o;

import android.graphics.BitmapFactory;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.papertheme.ColorPaperTheme;
import com.orion.notein.domain.models.papertheme.LocalUriPaperTheme;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o00oOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.ThemeUseCase$generatePaperThemeByPic$2", m80623f = "ThemeUseCase.kt", m80624l = {80}, m80625m = "invokeSuspend")
public final class C27571o00oOooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32443OooOOO<? extends LocalUriPaperTheme, ? extends PaperSpec>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public PaperSpec f96745OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public PaperOrientation f96746OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f96747OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ColorPaperTheme f96748OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f96749OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f96750OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C27570o00oOoo0 f96751OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27571o00oOooO(String str, C27570o00oOoo0 c27570o00oOoo0, String str2, Continuation<? super C27571o00oOooO> continuation) {
        super(2, continuation);
        this.f96749OooOoOO = str;
        this.f96751OooOoo0 = c27570o00oOoo0;
        this.f96750OooOoo = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27571o00oOooO(this.f96749OooOoOO, this.f96751OooOoo0, this.f96750OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32443OooOOO<? extends LocalUriPaperTheme, ? extends PaperSpec>> continuation) {
        return ((C27571o00oOooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        PaperOrientation paperOrientation;
        int height;
        int height2;
        Object objOooO00o;
        PaperOrientation paperOrientation2;
        ColorPaperTheme colorPaperTheme;
        PaperSpec paperSpec;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96747OooOoO;
        String str = this.f96749OooOoOO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            if (options.outWidth > options.outHeight) {
                height = PaperSpec.INSTANCE.getA4().getHeight();
                height2 = (int) ((options.outHeight / options.outWidth) * r4.getA4().getHeight());
                paperOrientation = PaperOrientation.HORIZONTAL;
            } else {
                int height3 = PaperSpec.INSTANCE.getA4().getHeight();
                int height4 = (int) ((options.outWidth / options.outHeight) * r4.getA4().getHeight());
                paperOrientation = PaperOrientation.VERTICAL;
                height = height4;
                height2 = height3;
            }
            PaperSpec paperSpec2 = new PaperSpec("自定义图片", "", false, Math.min(height, height2), Math.max(height, height2), null, null, 0, 0, 96, null);
            ColorPaperTheme colorPaperTheme2 = new ColorPaperTheme(null, -1);
            this.f96746OooOo0o = paperOrientation;
            this.f96745OooOo = paperSpec2;
            this.f96748OooOoO0 = colorPaperTheme2;
            this.f96747OooOoO = 1;
            objOooO00o = C27570o00oOoo0.OooO00o(this.f96751OooOoo0, this);
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            paperOrientation2 = paperOrientation;
            colorPaperTheme = colorPaperTheme2;
            paperSpec = paperSpec2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ColorPaperTheme colorPaperTheme3 = this.f96748OooOoO0;
            paperSpec = this.f96745OooOo;
            PaperOrientation paperOrientation3 = this.f96746OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            colorPaperTheme = colorPaperTheme3;
            paperOrientation2 = paperOrientation3;
            objOooO00o = obj;
        }
        return new C32443OooOOO(new LocalUriPaperTheme(colorPaperTheme, (String) objOooO00o, o0OOOO00.OooOO0O.f94363OooOOo, paperOrientation2, str, str, this.f96750OooOoo), paperSpec);
    }
}
