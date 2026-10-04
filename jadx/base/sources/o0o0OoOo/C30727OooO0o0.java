package o0o0OoOo;

import android.os.Environment;
import com.aspose.slides.C22200OooO0o0;
import java.io.File;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import o0oo000O.C31190OooO0oo;
import o0oo000O.C31193OooOOo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0OoOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.viewmodel.DebugViewModel$exportThemes$2", m80623f = "DebugViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30727OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32443OooOOO<? extends Boolean, ? extends String>>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C30722OooO00o f109899OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30727OooO0o0(C30722OooO00o c30722OooO00o, Continuation<? super C30727OooO0o0> continuation) {
        super(2, continuation);
        this.f109899OooOo0o = c30722OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30727OooO0o0(this.f109899OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32443OooOOO<? extends Boolean, ? extends String>> continuation) {
        return ((C30727OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws IOException {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS).getAbsoluteFile() + "/Notein/themes");
        C31190OooO0oo.OooO0o(file);
        C31190OooO0oo.OooO(file);
        File file2 = new File(file.getAbsolutePath(), C22200OooO0o0.OooO0O0(System.currentTimeMillis(), "theme_", ".zip"));
        C31190OooO0oo.OooO0oO(file2);
        C31193OooOOo.OooO0o(C31190OooO0oo.OooOo00(new File(this.f109899OooOo0o.f109859OooO0Oo.getFilesDir(), "theme"), false), file2);
        return new C32443OooOOO(Boolean.TRUE, file.getAbsolutePath());
    }
}
