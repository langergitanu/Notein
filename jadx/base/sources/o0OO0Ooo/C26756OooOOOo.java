package o0OO0Ooo;

import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.Change;
import com.google.api.services.drive.model.ChangeList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OO0Ooo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.google.GoogleDriveCloudService$listChanges$2", m80623f = "GoogleDriveCloudService.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26756OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32443OooOOO<? extends List<Change>, ? extends String>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f92535OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C26759OooOOoo f92536OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26756OooOOOo(C26759OooOOoo c26759OooOOoo, String str, Continuation<? super C26756OooOOOo> continuation) {
        super(2, continuation);
        this.f92536OooOo0o = c26759OooOOoo;
        this.f92535OooOo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26756OooOOOo(this.f92536OooOo0o, this.f92535OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32443OooOOO<? extends List<Change>, ? extends String>> continuation) {
        return ((C26756OooOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws IOException {
        String newStartPageToken;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Drive driveOooO00o = C26759OooOOoo.OooO00o(this.f92536OooOo0o);
        ArrayList arrayList = new ArrayList();
        String nextPageToken = this.f92535OooOo;
        do {
            Drive.Changes.List list = driveOooO00o.changes().list(nextPageToken);
            list.setFields2("nextPageToken,newStartPageToken,changes(fileId,removed,file(id,name,mimeType,size,properties,sha256Checksum,createdTime,modifiedTime,trashed,trashedTime,headRevisionId))");
            list.setPageSize(new Integer(100));
            ChangeList changeListExecute = list.execute();
            List<Change> changes = changeListExecute.getChanges();
            if (changes != null) {
                arrayList.addAll(changes);
            }
            newStartPageToken = changeListExecute.getNewStartPageToken();
            nextPageToken = changeListExecute.getNextPageToken();
            if (nextPageToken == null) {
                break;
            }
        } while (nextPageToken.length() != 0);
        return new C32443OooOOO(arrayList, newStartPageToken);
    }
}
