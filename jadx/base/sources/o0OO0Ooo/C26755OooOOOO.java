package o0OO0Ooo;

import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.FileList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OO0Ooo.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.google.GoogleDriveCloudService$listAllFiles$2", m80623f = "GoogleDriveCloudService.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26755OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<File>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f92533OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C26759OooOOoo f92534OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26755OooOOOO(C26759OooOOoo c26759OooOOoo, String str, Continuation<? super C26755OooOOOO> continuation) {
        super(2, continuation);
        this.f92534OooOo0o = c26759OooOOoo;
        this.f92533OooOo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26755OooOOOO(this.f92534OooOo0o, this.f92533OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<File>> continuation) {
        return ((C26755OooOOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.String] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws IOException {
        CharSequence charSequence;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Drive driveOooO00o = C26759OooOOoo.OooO00o(this.f92534OooOo0o);
        ArrayList arrayList = new ArrayList();
        C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
        do {
            Drive.Files.List list = driveOooO00o.files().list();
            list.setPageSize(new Integer(100));
            list.setFields2("nextPageToken,files(id,name,mimeType,size,properties,sha256Checksum,createdTime,modifiedTime,trashed,trashedTime,headRevisionId)");
            list.setSpaces("drive");
            String str = this.f92533OooOo;
            if (str != null) {
                list.setQ(str);
            }
            T t = c24034Oooo00O.f80942OooOo0o;
            if (t != 0) {
                list.setPageToken((String) t);
            }
            FileList fileListExecute = list.execute();
            List<File> files = fileListExecute.getFiles();
            if (files != null) {
                arrayList.addAll(files);
            }
            ?? nextPageToken = fileListExecute.getNextPageToken();
            c24034Oooo00O.f80942OooOo0o = nextPageToken;
            charSequence = (CharSequence) nextPageToken;
            if (charSequence == null) {
                break;
            }
        } while (charSequence.length() != 0);
        return arrayList;
    }
}
