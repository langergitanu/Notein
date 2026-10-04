package o0OOo0o;

import com.google.gson.Gson;
import com.orion.notein.domain.models.folder.Folder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import o0Oo00o.C28028OooO0o;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33580OooO00o;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteInFileUseCase$getFolderJsonFile$2", m80623f = "NoteInFileUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class o000O00O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super File>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ File f95545OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Folder f95546OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(Folder folder, File file, Continuation<? super o000O00O> continuation) {
        super(2, continuation);
        this.f95546OooOo0o = folder;
        this.f95545OooOo = file;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o000O00O(this.f95546OooOo0o, this.f95545OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super File> continuation) {
        return ((o000O00O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws IOException {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Gson gsonOooO00o = C28028OooO0o.OooO00o();
        Folder folder = this.f95546OooOo0o;
        String json = gsonOooO00o.toJson(folder);
        File file = new File(this.f95545OooOo.getAbsolutePath(), com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("folder_", folder.getTitle()));
        C31190OooO0oo.OooO0oO(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            try {
                kotlin.jvm.internal.OooOOO0.OooO0Oo(json);
                byte[] bytes = json.getBytes(C33580OooO00o.f121231OooO0O0);
                kotlin.jvm.internal.OooOOO0.OooO0o(bytes, "getBytes(...)");
                fileOutputStream.write(bytes);
                return file;
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteInFileUseCase");
                c20358OooO00o.OooO0OO("Write folder json to file failed, error: " + e, new Object[0]);
                fileOutputStream.close();
                return null;
            }
        } finally {
            fileOutputStream.close();
        }
    }
}
