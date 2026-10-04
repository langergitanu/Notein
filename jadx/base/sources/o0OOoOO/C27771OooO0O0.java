package o0OOoOO;

import android.graphics.BitmapFactory;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.papertheme.ColorPaperTheme;
import com.orion.notein.domain.models.papertheme.LocalUriPaperTheme;
import com.orion.notein.domain.models.papertheme.ThemeCategory;
import java.io.File;
import java.util.ArrayList;
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
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OOoOO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.createpage.CreateImagePagesUseCase$createLongImagePages$2", m80623f = "CreateImagePagesUseCase.kt", m80624l = {128}, m80625m = "invokeSuspend")
public final class C27771OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Page>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f98096OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f98097OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f98098OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27774OooO0o0 f98099OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27771OooO0O0(String str, C27774OooO0o0 c27774OooO0o0, String str2, Continuation<? super C27771OooO0O0> continuation) {
        super(2, continuation);
        this.f98096OooOo = str;
        this.f98099OooOoO0 = c27774OooO0o0;
        this.f98098OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27771OooO0O0(this.f98096OooOo, this.f98099OooOoO0, this.f98098OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Page>> continuation) {
        return ((C27771OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooO0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98097OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String str = this.f98096OooOo;
            File parentFile = new File(str).getParentFile();
            if (parentFile == null) {
                throw new IllegalStateException("no dir");
            }
            this.f98097OooOo0o = 1;
            PaperSpec.Companion companion = PaperSpec.INSTANCE;
            int width = companion.getA4().getWidth();
            int height = companion.getA4().getHeight();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27773OooO0Oo(str, width, height, parentFile, null), this);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooO0o = obj;
        }
        List list = (List) objOooO0o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        int i2 = 0;
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            String str2 = (String) obj2;
            ColorPaperTheme colorPaperTheme = new ColorPaperTheme(null, -1);
            ThemeCategory themeCategory = OooOO0O.f94363OooOOo;
            PaperOrientation paperOrientation = PaperOrientation.VERTICAL;
            LocalUriPaperTheme localUriPaperTheme = new LocalUriPaperTheme(colorPaperTheme, "", themeCategory, paperOrientation, str2, str2, null, 64, null);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str2, options);
            boolean z = false;
            PaperSpec paperSpec = new PaperSpec("长图切片", null, z, options.outWidth, options.outHeight, null, null, 0, 0, 102, null);
            arrayList.add(new Page(C24761OooO.OooO00o("toString(...)"), this.f98098OooOoO, paperSpec, paperOrientation, localUriPaperTheme, null, null, "", z, 0, 0L, 0L, null, null, 0, false, null, null, null, 524128, null));
            i2 = i3;
        }
        return arrayList;
    }
}
