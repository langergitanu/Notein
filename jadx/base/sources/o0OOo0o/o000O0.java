package o0OOo0o;

import com.orion.notein.domain.models.folder.Folder;
import java.io.File;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOoOo0.C27807OooOOOo;
import o0OOoOo0.C27819OooOoo;
import o0Oo00o.C28028OooO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteInFileUseCase$getFolderLabelJsonFile$2", m80623f = "NoteInFileUseCase.kt", m80624l = {1994}, m80625m = "invokeSuspend")
public final class o000O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super File>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27387o0000o0 f95535OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95536OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ File f95537OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Folder f95538OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(Folder folder, File file, Continuation continuation, C27387o0000o0 c27387o0000o0) {
        super(2, continuation);
        this.f95535OooOo = c27387o0000o0;
        this.f95538OooOoO0 = folder;
        this.f95537OooOoO = file;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o000O0(this.f95538OooOoO0, this.f95537OooOoO, continuation, this.f95535OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super File> continuation) {
        return ((o000O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95536OooOo0o;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C27819OooOoo c27819OooOoo = this.f95535OooOo.f95448OooOo0o;
                String folderId = this.f95538OooOoO0.getId();
                kotlin.jvm.internal.OooOOO0.OooO0oO(folderId, "folderId");
                C27807OooOOOo c27807OooOOOo = new C27807OooOOOo(c27819OooOoo.f98267OooO00o.OooOOOO(com.facebook.soloader.OooOo.OooO0oO(folderId)), folderId);
                this.f95536OooOo0o = 1;
                obj = C25252OooO0Oo.OooOo00(c27807OooOOOo, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            Object obj2 = (List) obj;
            if (obj2 == null) {
                obj2 = C34434OooOoO.f123453OooOo0o;
            }
            String json = C28028OooO0o.OooO00o().toJson(obj2);
            File file = new File(this.f95537OooOoO.getAbsolutePath(), "folder_labels.json");
            kotlin.jvm.internal.OooOOO0.OooO0Oo(json);
            C32501OooO0oO.OooO(file, json);
            return file;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteInFileUseCase");
            c20358OooO00o.OooO0Oo(e, "getFolderLabelJsonFile failed.", new Object[0]);
            return null;
        }
    }
}
