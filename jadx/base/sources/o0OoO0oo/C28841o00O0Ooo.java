package o0OoO0oo;

import Oooo0oO.C21030OooOO0o;
import android.graphics.Bitmap;
import android.net.Uri;
import com.aspose.slides.C22201OooO0oO;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import java.io.File;
import kotlin.coroutines.Continuation;
import o0Oo00o.C28026OooO0OO;
import o0oo000O.C31194OooOOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO0oo.o00O0Ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$addBitmap2Sticker$1", m80623f = "NoteEditorFragment.kt", m80624l = {4303}, m80625m = "invokeSuspend")
public final class C28841o00O0Ooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102142OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102143OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f102144OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Bitmap f102145OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f102146OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28841o00O0Ooo(NoteEditorFragment noteEditorFragment, Bitmap bitmap, String str, String str2, Continuation<? super C28841o00O0Ooo> continuation) {
        super(2, continuation);
        this.f102142OooOo = noteEditorFragment;
        this.f102145OooOoO0 = bitmap;
        this.f102144OooOoO = str;
        this.f102146OooOoOO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28841o00O0Ooo(this.f102142OooOo, this.f102145OooOoO0, this.f102144OooOoO, this.f102146OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28841o00O0Ooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102143OooOo0o;
        NoteEditorFragment noteEditorFragment = this.f102142OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
            this.f102143OooOo0o = 1;
            obj = c23344OooOOoOoooOO0.OooOOo0(this.f102145OooOoO0, this.f102144OooOoO, this.f102146OooOoOO, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        String str = (String) obj;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO00o(C22201OooO0oO.OooO0O0(c20358OooO00o, "NoteEditorFragment", "NoteEditorFragment.initLassoCutImage2StickerListener, filePath: ", str, "."), new Object[0]);
        File file = new File(str);
        if (file.exists()) {
            Uri uriOooO00o = C31194OooOOo0.OooO00o(noteEditorFragment.requireContext(), file);
            kotlin.jvm.internal.OooOOO0.OooO0o(uriOooO00o, "file2Uri(...)");
            Uri[] toAddedUris = (Uri[]) com.facebook.soloader.OooOo.OooO0oO(uriOooO00o).toArray(new Uri[0]);
            kotlin.jvm.internal.OooOOO0.OooO0oO(toAddedUris, "toAddedUris");
            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(noteEditorFragment), new C28795o000Oo0(toAddedUris));
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
