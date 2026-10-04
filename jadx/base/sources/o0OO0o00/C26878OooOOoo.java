package o0OO0o00;

import com.huawei.cloud.services.drive.Drive;
import com.huawei.cloud.services.drive.model.File;
import com.huawei.cloud.services.drive.model.FileList;
import com.huawei.hms.network.embedded.C18358t1;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OO0o00.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiCloudService$listAllFiles$2", m80623f = "HuaweiCloudService.kt", m80624l = {76}, m80625m = "invokeSuspend")
public final class C26878OooOOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<File>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f93224OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f93225OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26878OooOOoo(OooO00o oooO00o, Continuation<? super C26878OooOOoo> continuation) {
        super(2, continuation);
        this.f93224OooOo = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26878OooOOoo(this.f93224OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<File>> continuation) {
        return ((C26878OooOOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93225OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f93225OooOo0o = 1;
            obj = OooO00o.OooO00o(this.f93224OooOo, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        Drive.Files.List list = ((Drive) obj).files().list();
        list.setPageSize(new Integer(200));
        list.setFields2(C18358t1.g.f56183c);
        list.setQueryParam("recycled = false");
        ArrayList arrayList = new ArrayList();
        String nextCursor = null;
        do {
            FileList fileListExecute = list.setCursor(nextCursor).execute();
            List<File> files = fileListExecute.getFiles();
            kotlin.jvm.internal.OooOOO0.OooO0o(files, "getFiles(...)");
            arrayList.addAll(files);
            nextCursor = fileListExecute.getNextCursor();
            if (nextCursor == null) {
                break;
            }
        } while (nextCursor.length() != 0);
        return arrayList;
    }
}
