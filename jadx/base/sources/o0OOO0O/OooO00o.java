package o0OOO0O;

import OooOooO.C20741OooOOoo;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.StorageReference;
import java.io.File;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.oss.GoogleStorageDataSource$download$2", m80623f = "GoogleStorageDataSource.kt", m80624l = {31}, m80625m = "invokeSuspend")
public final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super File>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f93895OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public File f93896OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f93897OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ StorageReference f93898OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(StorageReference storageReference, String str, Continuation<? super OooO00o> continuation) {
        super(2, continuation);
        this.f93898OooOoO0 = storageReference;
        this.f93897OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO00o(this.f93898OooOoO0, this.f93897OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super File> continuation) {
        return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws IOException {
        File file;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93895OooOo;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                File fileCreateTempFile = File.createTempFile("GoogleStorageDataSource", ".download");
                FileDownloadTask file2 = this.f93898OooOoO0.getFile(fileCreateTempFile);
                OooOOO0.OooO0o(file2, "getFile(...)");
                this.f93896OooOo0o = fileCreateTempFile;
                this.f93895OooOo = 1;
                Object objOooO0o = C20741OooOOoo.OooO0o(file2, this);
                if (objOooO0o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                file = fileCreateTempFile;
                obj = objOooO0o;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                file = this.f93896OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            FileDownloadTask.TaskSnapshot taskSnapshot = (FileDownloadTask.TaskSnapshot) obj;
            if (taskSnapshot.getError() != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("GoogleStorageDataSource");
                c20358OooO00o.OooO0OO("download error: " + taskSnapshot.getError(), new Object[0]);
                return null;
            }
            File file3 = new File(this.f93897OooOoO);
            C31190OooO0oo.OooO0o(file3.getParentFile());
            if (!file3.exists()) {
                boolean zRenameTo = file.renameTo(file3);
                file.delete();
                if (!zRenameTo) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("GoogleStorageDataSource");
                    c20358OooO00o2.OooO0OO("Can't rename file", new Object[0]);
                    return null;
                }
            } else {
                if (C31190OooO0oo.OooOOO(file).equals(C31190OooO0oo.OooOOO(file3))) {
                    file.delete();
                    return file3;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("GoogleStorageDataSource");
                c20358OooO00o3.OooO00o("download file md5 not match, delete local file", new Object[0]);
                file3.delete();
                boolean zRenameTo2 = file.renameTo(file3);
                file.delete();
                if (!zRenameTo2) {
                    c20358OooO00o3.OooOOO0("GoogleStorageDataSource");
                    c20358OooO00o3.OooO0OO("Can't rename file", new Object[0]);
                    return null;
                }
            }
            return file3;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("GoogleStorageDataSource");
            c20358OooO00o4.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("download error: ", e.getMessage()), new Object[0]);
            return null;
        }
    }
}
