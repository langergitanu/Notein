package o0OO0o00;

import com.huawei.cloud.services.drive.DriveScopes;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OO0o00.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26886OooOoo0 implements oO0O000o.OooO00o {
    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(DriveScopes.SCOPE_DRIVE_FILE);
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOooO0oO, 10));
        Iterator it = listOooO0oO.iterator();
        while (it.hasNext()) {
            arrayList.add(new Scope((String) it.next()));
        }
        return new HuaweiIdAuthParamsHelper(HuaweiIdAuthParams.DEFAULT_AUTH_REQUEST_PARAM).setIdToken().setAccessToken().setScopeList(oOo000Oo.OooOo.o0ooOoO(arrayList)).createParams();
    }
}
