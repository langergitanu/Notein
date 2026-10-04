package o0OO0o00;

import OooOoo.C20593OooO0Oo;
import com.huawei.cloud.services.drive.Drive;
import com.huawei.cloud.services.drive.model.File;
import com.huawei.cloud.services.drive.model.FileList;
import com.huawei.hms.network.embedded.C18358t1;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OO0o00.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiCloudService$listFilesByName$2", m80623f = "HuaweiCloudService.kt", m80624l = {132}, m80625m = "invokeSuspend")
public final class C26879OooOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends File>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f93229OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f93230OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26879OooOo0(OooO00o oooO00o, Continuation continuation) {
        super(2, continuation);
        this.f93229OooOo = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26879OooOo0(this.f93229OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends File>> continuation) {
        return ((C26879OooOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93230OooOo0o;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (C33599OooOo0O.Oooo0o0("NoteIn")) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("HuaweiCloudSyncDS");
                c20358OooO00o.OooOO0O("listFilesByName called with blank filename", new Object[0]);
                return c34434OooOoO;
            }
            Charset UTF_8 = StandardCharsets.UTF_8;
            kotlin.jvm.internal.OooOOO0.OooO0o(UTF_8, "UTF_8");
            byte[] bytes = "NoteIn".getBytes(UTF_8);
            kotlin.jvm.internal.OooOOO0.OooO0o(bytes, "getBytes(...)");
            if (bytes.length > 250) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("HuaweiCloudSyncDS");
                c20358OooO00o2.OooOO0O("listFilesByName rejected over-length filename: %s", "NoteIn");
                return c34434OooOoO;
            }
            Set setOoooOo0 = oOo000Oo.OooOOO.OoooOo0(new Character[]{new Character('<'), new Character('>'), new Character('|'), new Character(':'), new Character('\"'), new Character('*'), new Character('?'), new Character(IOUtils.DIR_SEPARATOR_UNIX), new Character(IOUtils.DIR_SEPARATOR_WINDOWS)});
            for (int i2 = 0; i2 < 6; i2++) {
                if (setOoooOo0.contains(new Character("NoteIn".charAt(i2)))) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("HuaweiCloudSyncDS");
                    c20358OooO00o3.OooOO0O("listFilesByName rejected invalid filename: %s", "NoteIn");
                    return c34434OooOoO;
                }
            }
            this.f93230OooOo0o = 1;
            objOooO00o = OooO00o.OooO00o(this.f93229OooOo, this);
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooO00o = obj;
        }
        ArrayList arrayListOooOOO = C34429OooOOo0.OooOOO("recycled = false", C20593OooO0Oo.OooO0O0("fileName = '", C33595OooOOo.OooOo0O("NoteIn", "'", "\\'"), "'"));
        Drive.Files.List list = ((Drive) objOooO00o).files().list();
        list.setPageSize(new Integer(200));
        list.setFields2(C18358t1.g.f56183c);
        list.setQueryParam(oOo000Oo.OooOo.o000oOoO(arrayListOooOOO, " and ", null, null, null, 62));
        ArrayList arrayList = new ArrayList();
        String nextCursor = null;
        do {
            FileList fileListExecute = list.setCursor(nextCursor).execute();
            List<File> files = fileListExecute.getFiles();
            arrayList.addAll(files != null ? files : c34434OooOoO);
            nextCursor = fileListExecute.getNextCursor();
            if (nextCursor == null) {
                break;
            }
        } while (nextCursor.length() != 0);
        return arrayList;
    }
}
