package o0OOo0o;

import android.graphics.Bitmap;
import android.os.Build;
import com.orion.penkit.models.ImageInfo;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import o0OOo0o.AbstractC27507o00OoooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.o00Ooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.SaveImageToGalleryUseCase$execute$2", m80623f = "SaveImageToGalleryUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27510o00Ooooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super AbstractC27507o00OoooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27515o00o0000 f96409OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ ImageInfo f96410OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27510o00Ooooo(ImageInfo imageInfo, C27515o00o0000 c27515o00o0000, Continuation<? super C27510o00Ooooo> continuation) {
        super(2, continuation);
        this.f96410OooOo0o = imageInfo;
        this.f96409OooOo = c27515o00o0000;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27510o00Ooooo(this.f96410OooOo0o, this.f96409OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super AbstractC27507o00OoooO> continuation) {
        return ((C27510o00Ooooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        C27515o00o0000 c27515o00o0000 = this.f96409OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        try {
            Bitmap bitmap = this.f96410OooOo0o.getBitmap();
            if (bitmap == null) {
                return AbstractC27507o00OoooO.OooO00o.f96403OooO00o;
            }
            String strOooO00o = C27515o00o0000.OooO00o(c27515o00o0000);
            return Build.VERSION.SDK_INT >= 29 ? C27515o00o0000.OooO0OO(c27515o00o0000, bitmap, strOooO00o) : C27515o00o0000.OooO0O0(c27515o00o0000, bitmap, strOooO00o);
        } catch (IOException e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("SaveImageToGallery");
            c20358OooO00o.OooO0Oo(e, "IO error while saving image", new Object[0]);
            return AbstractC27507o00OoooO.OooO0OO.f96405OooO00o;
        } catch (SecurityException e2) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("SaveImageToGallery");
            c20358OooO00o2.OooO0Oo(e2, "Permission denied", new Object[0]);
            return AbstractC27507o00OoooO.C27508OooO0Oo.f96406OooO00o;
        } catch (Exception e3) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("SaveImageToGallery");
            c20358OooO00o3.OooO0Oo(e3, "Unknown error while saving image", new Object[0]);
            return new AbstractC27507o00OoooO.OooO0o(e3.getMessage());
        }
    }
}
