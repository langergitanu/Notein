package o0OO0o00;

import com.aspose.words.StyleIdentifier;
import com.huawei.cloud.services.drive.Drive;
import com.huawei.cloud.services.drive.model.Change;
import com.huawei.cloud.services.drive.model.ChangeList;
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
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OO0o00.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiCloudService$fetchDriveChanges$2", m80623f = "HuaweiCloudService.kt", m80624l = {StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3}, m80625m = "invokeSuspend")
public final class C26874OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Change>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f93205OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f93206OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooO00o f93207OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26874OooOO0o(String str, Continuation continuation, OooO00o oooO00o) {
        super(2, continuation);
        this.f93205OooOo = str;
        this.f93207OooOoO0 = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26874OooOO0o(this.f93205OooOo, continuation, this.f93207OooOoO0);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Change>> continuation) {
        return ((C26874OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93206OooOo0o;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        String nextCursor = this.f93205OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (C33599OooOo0O.Oooo0o0(nextCursor)) {
                return c34434OooOoO;
            }
            this.f93206OooOo0o = 1;
            obj = OooO00o.OooO00o(this.f93207OooOoO0, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        Drive drive = (Drive) obj;
        ArrayList arrayList = new ArrayList();
        do {
            Drive.Changes.List list = drive.changes().list(nextCursor);
            list.setFields2(C18358t1.g.f56183c);
            ChangeList changeListExecute = list.execute();
            List<Change> changes = changeListExecute.getChanges();
            arrayList.addAll(changes != null ? changes : c34434OooOoO);
            nextCursor = changeListExecute.getNextCursor();
            if (nextCursor == null) {
                break;
            }
        } while (nextCursor.length() != 0);
        return arrayList;
    }
}
