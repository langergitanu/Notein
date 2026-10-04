package o0OOoo0O;

import com.aspose.slides.C22201OooO0oO;
import com.aspose.slides.C22227OoooO;
import com.orion.notein.domain.models.material.Font;
import com.orion.notein.domain.models.material.Material;
import com.orion.notein.richeditor.fonts.FontManager;
import java.io.File;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOoo0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.material.AddFontToUserFontsUseCase$isApplied$2", m80623f = "AddFontToUserFontsUseCase.kt", m80624l = {40}, m80625m = "invokeSuspend")
public final class C27833OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f98331OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f98332OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27834OooO0OO f98333OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f98334OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27833OooO0O0(String str, String str2, C27834OooO0OO c27834OooO0OO, Continuation<? super C27833OooO0O0> continuation) {
        super(2, continuation);
        this.f98331OooOo = str;
        this.f98334OooOoO0 = str2;
        this.f98333OooOoO = c27834OooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27833OooO0O0(this.f98331OooOo, this.f98334OooOoO0, this.f98333OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C27833OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String fontFamily;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98332OooOo0o;
        C27834OooO0OO c27834OooO0OO = this.f98333OooOoO;
        String str = this.f98334OooOoO0;
        boolean z = true;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            fontFamily = this.f98331OooOo;
            if (C33599OooOo0O.Oooo0o0(fontFamily) && str != null) {
                this.f98332OooOo0o = 1;
                obj = c27834OooO0OO.f98336OooO0O0.OooO0o0(str, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
            if (!C33599OooOo0O.Oooo0o0(fontFamily)) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO00o(C22201OooO0oO.OooO0O0(c20358OooO00o, "AddFontToUserFontsUseCase", "isApplied: fontFamily is blank (materialId=", str, "), returning false"), new Object[0]);
                return Boolean.FALSE;
            }
            File file = new File(c27834OooO0OO.f98335OooO00o.getFilesDir(), FontManager.CUSTOM_FONT_DIR);
            if (!file.exists()) {
                return Boolean.FALSE;
            }
            File file2 = new File(file, fontFamily);
            File file3 = new File(file, fontFamily.concat(".ttf"));
            if (!file2.exists() && !file3.exists()) {
                z = false;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o2, "AddFontToUserFontsUseCase", "isApplied check: fontFamily=", fontFamily, ", exists=");
            sbOooO00o.append(z);
            c20358OooO00o2.OooO00o(sbOooO00o.toString(), new Object[0]);
            return Boolean.valueOf(z);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C32446OooOOOo.OooO0O0(obj);
        Material material = (Material) obj;
        Font font = material instanceof Font ? (Font) material : null;
        if (font == null || (fontFamily = font.getFontFamily()) == null) {
            fontFamily = "";
        }
        if (!C33599OooOo0O.Oooo0o0(fontFamily)) {
        }
    }
}
