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

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiCloudService$createFile$2", m80623f = "HuaweiCloudService.kt", m80624l = {StyleIdentifier.BIBLIOGRAPHY, StyleIdentifier.GRID_TABLE_4}, m80625m = "invokeSuspend")
public final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super File>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f93171OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f93172OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f93173OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f93174OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f93175OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f93176OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f93177OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ Long f93178OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(OooO00o oooO00o, String str, String str2, String str3, LinkedHashMap linkedHashMap, String str4, Long l, Continuation continuation) {
        super(2, continuation);
        this.f93171OooOo = oooO00o;
        this.f93174OooOoO0 = str;
        this.f93173OooOoO = str2;
        this.f93175OooOoOO = str3;
        this.f93177OooOoo0 = linkedHashMap;
        this.f93176OooOoo = str4;
        this.f93178OooOooO = l;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0o(this.f93171OooOo, this.f93174OooOoO0, this.f93173OooOoO, this.f93175OooOoOO, this.f93177OooOoo0, this.f93176OooOoo, this.f93178OooOooO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super File> continuation) {
        return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if (r9 == r0) goto L18;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93172OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f93172OooOo0o = 1;
            obj = OooO00o.OooO00o(this.f93171OooOo, this);
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
        final java.io.File file = new java.io.File(this.f93174OooOoO0);
        final FileContent fileContent = new FileContent(null, file);
        final File file2 = new File();
        file2.setFileName(this.f93173OooOoO);
        file2.setMimeType(this.f93175OooOoOO);
        file2.setProperties(this.f93177OooOoo0);
        file2.setParentFolder(com.facebook.soloader.OooOo.OooO0oO(this.f93176OooOoo));
        Long l = this.f93178OooOooO;
        if (l != null) {
            file2.setEditedTime(new DateTime(l.longValue()));
        }
        oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o() { // from class: o0OO0o00.OooO0o0
            @Override // oO0O000o.OooO00o
            public final Object invoke() throws IOException {
                Drive.Files.Create create = drive.files().create(file2, fileContent);
                create.setFields2(C18358t1.g.f56183c);
                create.set("autoRename", (Object) Boolean.TRUE);
                create.getMediaHttpUploader().setDirectUploadEnabled(file.length() < 20971520);
                return create.execute();
            }
        };
        this.f93172OooOo0o = 2;
        obj = kotlin.jvm.internal.OooO0OO.OooO0OO(oooO00o, this);
    }
}
