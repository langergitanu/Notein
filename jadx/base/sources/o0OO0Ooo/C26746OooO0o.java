package o0OO0Ooo;

import com.google.api.services.drive.Drive;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OO0Ooo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.google.GoogleDriveCloudService$downloadFile$2", m80623f = "GoogleDriveCloudService.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26746OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f92511OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C26759OooOOoo f92512OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ File f92513OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26746OooO0o(C26759OooOOoo c26759OooOOoo, String str, File file, Continuation<? super C26746OooO0o> continuation) {
        super(2, continuation);
        this.f92512OooOo0o = c26759OooOOoo;
        this.f92511OooOo = str;
        this.f92513OooOoO0 = file;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26746OooO0o(this.f92512OooOo0o, this.f92511OooOo, this.f92513OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C26746OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws IOException {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Drive driveOooO00o = C26759OooOOoo.OooO00o(this.f92512OooOo0o);
        Drive.Files files = driveOooO00o.files();
        String str = this.f92511OooOo;
        Drive.Files.Get get = files.get(str);
        get.setFields2("id,size");
        Long size = get.execute().getSize();
        FileOutputStream fileOutputStream = new FileOutputStream(this.f92513OooOoO0);
        try {
            Drive.Files.Get get2 = driveOooO00o.files().get(str);
            get2.getMediaHttpDownloader().setDirectDownloadEnabled(size.longValue() < 20971520);
            get2.executeMediaAndDownloadTo(fileOutputStream);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            fileOutputStream.close();
            return C32460OooOooO.f116667OooO00o;
        } finally {
        }
    }
}
