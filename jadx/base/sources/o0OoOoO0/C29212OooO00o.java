package o0OoOoO0;

import android.graphics.Bitmap;
import com.orion.notein.p607ui.noteeditor.captureeditor.CaptureEditorPanel;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoOoO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.captureeditor.CaptureEditorPanel$saveImageBitmap$2", m80623f = "CaptureEditorPanel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29212OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Bitmap f103597OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ CaptureEditorPanel f103598OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29212OooO00o(CaptureEditorPanel captureEditorPanel, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        this.f103598OooOo0o = captureEditorPanel;
        this.f103597OooOo = bitmap;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        Bitmap bitmap = this.f103597OooOo;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        return new C29212OooO00o(this.f103598OooOo0o, bitmap, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C29212OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        try {
            File file = new File(this.f103598OooOo0o.getContext().getExternalFilesDir(null), UUID.randomUUID() + ".png");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            this.f103597OooOo.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return file.getAbsolutePath();
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("CaptureEditorPanel");
            c20358OooO00o.OooO0Oo(e, "saveImageBitmap: failed to save image bitmap", new Object[0]);
            return null;
        }
    }
}
