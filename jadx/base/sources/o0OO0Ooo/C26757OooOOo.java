package o0OO0Ooo;

import com.google.api.client.http.FileContent;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.File;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OO0Ooo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.google.GoogleDriveCloudService$updateFile$2", m80623f = "GoogleDriveCloudService.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26757OooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super File>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ java.io.File f92537OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C26759OooOOoo f92538OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ File f92539OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f92540OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26757OooOOo(C26759OooOOoo c26759OooOOoo, java.io.File file, String str, File file2, Continuation<? super C26757OooOOo> continuation) {
        super(2, continuation);
        this.f92538OooOo0o = c26759OooOOoo;
        this.f92537OooOo = file;
        this.f92540OooOoO0 = str;
        this.f92539OooOoO = file2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26757OooOOo(this.f92538OooOo0o, this.f92537OooOo, this.f92540OooOoO0, this.f92539OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super File> continuation) {
        return ((C26757OooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws IOException {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Drive driveOooO00o = C26759OooOOoo.OooO00o(this.f92538OooOo0o);
        File file = this.f92539OooOoO;
        String str = this.f92540OooOoO0;
        java.io.File file2 = this.f92537OooOo;
        if (file2 == null) {
            Drive.Files.Update update = driveOooO00o.files().update(str, file);
            update.setFields2("id,name,mimeType,size,properties,sha256Checksum,createdTime,modifiedTime,trashed,trashedTime,headRevisionId");
            return update.execute();
        }
        Drive.Files.Update update2 = driveOooO00o.files().update(str, file, new FileContent(null, file2));
        update2.setFields2("id,name,mimeType,size,properties,sha256Checksum,createdTime,modifiedTime,trashed,trashedTime,headRevisionId");
        update2.getMediaHttpUploader().setDirectUploadEnabled(file2.length() < 20971520);
        return update2.execute();
    }
}
