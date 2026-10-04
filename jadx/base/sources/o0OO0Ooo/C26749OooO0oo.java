package o0OO0Ooo;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.api.client.googleapis.media.MediaHttpDownloaderProgressListener;
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
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OO0Ooo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.google.GoogleDriveCloudService$downloadFileWithProgress$2", m80623f = "GoogleDriveCloudService.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26749OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ File f92518OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C26759OooOOoo f92519OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ long f92520OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f92521OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32507OooOO0o<Integer, C32460OooOooO> f92522OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C26749OooO0oo(C26759OooOOoo c26759OooOOoo, File file, String str, long j, InterfaceC32507OooOO0o<? super Integer, C32460OooOooO> interfaceC32507OooOO0o, Continuation<? super C26749OooO0oo> continuation) {
        super(2, continuation);
        this.f92519OooOo0o = c26759OooOOoo;
        this.f92518OooOo = file;
        this.f92521OooOoO0 = str;
        this.f92520OooOoO = j;
        this.f92522OooOoOO = interfaceC32507OooOO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26749OooO0oo(this.f92519OooOo0o, this.f92518OooOo, this.f92521OooOoO0, this.f92520OooOoO, this.f92522OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C26749OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws IOException {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Drive driveOooO00o = C26759OooOOoo.OooO00o(this.f92519OooOo0o);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f92518OooOo);
        String str = this.f92521OooOoO0;
        final InterfaceC32507OooOO0o<Integer, C32460OooOooO> interfaceC32507OooOO0o = this.f92522OooOoOO;
        try {
            Drive.Files.Get get = driveOooO00o.files().get(str);
            MediaHttpDownloader mediaHttpDownloader = get.getMediaHttpDownloader();
            final long j = this.f92520OooOoO;
            mediaHttpDownloader.setDirectDownloadEnabled(j < 20971520);
            mediaHttpDownloader.setProgressListener(new MediaHttpDownloaderProgressListener() { // from class: o0OO0Ooo.OooO0oO
                @Override // com.google.api.client.googleapis.media.MediaHttpDownloaderProgressListener
                public final void progressChanged(MediaHttpDownloader mediaHttpDownloader2) {
                    interfaceC32507OooOO0o.invoke(Integer.valueOf(oO0O00oo.OooOO0.OooO0o((int) ((mediaHttpDownloader2.getNumBytesDownloaded() * ((long) 100)) / j), 0, 100)));
                }
            });
            get.executeMediaAndDownloadTo(fileOutputStream);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            fileOutputStream.close();
            return C32460OooOooO.f116667OooO00o;
        } finally {
        }
    }
}
