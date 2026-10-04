package o0o0OoO0;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.ocr.AiOcrSession;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorListContainer;
import com.orion.notein.p607ui.ocr.view.AiOcrRichEditor;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0Oo00oO.C28036OooO0O0;
import o0o0OO0.C30394OooOOOO;
import o0o0OO0.C30403OooOo0O;
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

/* JADX INFO: renamed from: o0o0OoO0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.view.AiOcrEditorListContainer$init$14$1", m80623f = "AiOcrEditorListContainer.kt", m80624l = {StyleIdentifier.GRID_TABLE_4_ACCENT_3}, m80625m = "invokeSuspend")
public final class C30678OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30394OooOOOO f109748OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109749OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Uri f109750OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AiOcrSession f109751OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ AiOcrEditorListContainer f109752OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30678OooO0oO(C30394OooOOOO c30394OooOOOO, AiOcrSession aiOcrSession, Uri uri, AiOcrEditorListContainer aiOcrEditorListContainer, Continuation<? super C30678OooO0oO> continuation) {
        super(2, continuation);
        this.f109748OooOo = c30394OooOOOO;
        this.f109751OooOoO0 = aiOcrSession;
        this.f109750OooOoO = uri;
        this.f109752OooOoOO = aiOcrEditorListContainer;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30678OooO0oO(this.f109748OooOo, this.f109751OooOoO0, this.f109750OooOoO, this.f109752OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30678OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109749OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String id = this.f109751OooOoO0.getId();
            this.f109749OooOo0o = 1;
            C30394OooOOOO c30394OooOOOO = this.f109748OooOo;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30403OooOo0O(c30394OooOOOO, id, this.f109750OooOoO, null), this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        File file = (File) obj;
        if (file == null || !file.exists()) {
            return C32460OooOooO.f116667OooO00o;
        }
        AiOcrEditorListContainer aiOcrEditorListContainer = this.f109752OooOoOO;
        Context context = aiOcrEditorListContainer.getContext();
        Context context2 = aiOcrEditorListContainer.getContext();
        OooOOO0.OooO0o(context2, "getContext(...)");
        Uri uriForFile = FileProvider.getUriForFile(context, C28036OooO0O0.OooO0O0(context2), file, file.getName());
        OooOOO0.OooO0o(uriForFile, "getUriForFile(...)");
        AiOcrRichEditor aiOcrRichEditor = aiOcrEditorListContainer.f78424OooOoO0;
        if (aiOcrRichEditor != null) {
            aiOcrRichEditor.insertImage(uriForFile);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
