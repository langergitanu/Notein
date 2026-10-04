package o0OO0o00;

import com.aspose.words.StyleIdentifier;
import com.huawei.cloud.base.http.FileContent;
import com.huawei.cloud.base.util.DateTime;
import com.huawei.cloud.services.drive.Drive;
import com.huawei.cloud.services.drive.model.File;
import com.huawei.hms.network.embedded.C18358t1;
import java.io.IOException;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OO0o00.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiCloudService$updateFile$2", m80623f = "HuaweiCloudService.kt", m80624l = {StyleIdentifier.GRID_TABLE_4_ACCENT_3, 308}, m80625m = "invokeSuspend")
public final class C26882OooOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super File>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f93243OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f93244OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f93245OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f93246OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f93247OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f93248OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f93249OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ Long f93250OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ String f93251OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26882OooOoO(OooO00o oooO00o, String str, String str2, String str3, LinkedHashMap linkedHashMap, String str4, Long l, String str5, Continuation continuation) {
        super(2, continuation);
        this.f93243OooOo = oooO00o;
        this.f93246OooOoO0 = str;
        this.f93245OooOoO = str2;
        this.f93247OooOoOO = str3;
        this.f93249OooOoo0 = linkedHashMap;
        this.f93248OooOoo = str4;
        this.f93250OooOooO = l;
        this.f93251OooOooo = str5;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26882OooOoO(this.f93243OooOo, this.f93246OooOoO0, this.f93245OooOoO, this.f93247OooOoOO, this.f93249OooOoo0, this.f93248OooOoo, this.f93250OooOooO, this.f93251OooOooo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super File> continuation) {
        return ((C26882OooOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (r8 == r0) goto L21;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93244OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f93244OooOo0o = 1;
            obj = OooO00o.OooO00o(this.f93243OooOo, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return (File) obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        final Drive drive = (Drive) obj;
        String str = this.f93246OooOoO0;
        final FileContent fileContent = str != null ? new FileContent(null, new java.io.File(str)) : null;
        final File file = new File();
        file.setFileName(this.f93245OooOoO);
        file.setMimeType(this.f93247OooOoOO);
        file.setProperties(this.f93249OooOoo0);
        file.setParentFolder(com.facebook.soloader.OooOo.OooO0oO(this.f93248OooOoo));
        Long l = this.f93250OooOooO;
        if (l != null) {
            file.setEditedTime(new DateTime(l.longValue()));
        }
        final String str2 = this.f93251OooOooo;
        oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o() { // from class: o0OO0o00.OooOoO0
            @Override // oO0O000o.OooO00o
            public final Object invoke() throws IOException {
                Drive.Files.Update update;
                FileContent fileContent2 = fileContent;
                Drive drive2 = drive;
                String str3 = str2;
                File file2 = file;
                if (fileContent2 != null) {
                    update = drive2.files().update(str3, file2, fileContent2);
                    update.setFields2(C18358t1.g.f56183c);
                    update.set("autoRename", (Object) Boolean.TRUE);
                    java.io.File file3 = fileContent2.getFile();
                    update.getMediaHttpUploader().setDirectUploadEnabled((file3 != null ? file3.length() : 0L) < 20971520);
                } else {
                    update = drive2.files().update(str3, file2);
                }
                return update.execute();
            }
        };
        this.f93244OooOo0o = 2;
        obj = kotlin.jvm.internal.OooO0OO.OooO0OO(oooO00o, this);
    }
}
