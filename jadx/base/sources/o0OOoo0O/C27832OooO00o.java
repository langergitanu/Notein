package o0OOoo0O;

import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.orion.notein.domain.models.material.Font;
import com.orion.notein.richeditor.fonts.FontManager;
import java.io.File;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOoo0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.material.AddFontToUserFontsUseCase$execute$2", m80623f = "AddFontToUserFontsUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27832OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27834OooO0OO f98328OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f98329OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Font f98330OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27832OooO00o(String str, C27834OooO0OO c27834OooO0OO, Font font, Continuation<? super C27832OooO00o> continuation) {
        super(2, continuation);
        this.f98329OooOo0o = str;
        this.f98328OooOo = c27834OooO0OO;
        this.f98330OooOoO0 = font;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27832OooO00o(this.f98329OooOo0o, this.f98328OooOo, this.f98330OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27832OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws IOException {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        String str = this.f98329OooOo0o;
        File file = new File(str);
        if (!file.exists()) {
            throw new IllegalStateException("Font file not found at: ".concat(str));
        }
        File file2 = new File(this.f98328OooOo.f98335OooO00o.getFilesDir(), FontManager.CUSTOM_FONT_DIR);
        C31190OooO0oo.OooO0o(file2);
        Font font = this.f98330OooOoO0;
        File file3 = new File(file2, font.getFontFamily());
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("AddFontToUserFontsUseCase");
        c20358OooO00o.OooO00o(C22237OooO0o0.OooO00o("Copying font: ", file.getAbsolutePath(), " -> ", file3.getAbsolutePath()), new Object[0]);
        C32501OooO0oO.OooO0OO(file, file3);
        c20358OooO00o.OooOOO0("AddFontToUserFontsUseCase");
        c20358OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Font applied: ", font.getFontFamily()), new Object[0]);
        return C32460OooOooO.f116667OooO00o;
    }
}
