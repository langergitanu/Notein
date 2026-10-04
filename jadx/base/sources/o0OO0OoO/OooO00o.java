package o0OO0OoO;

import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaLocalEntity;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaRemoteEntity;
import com.orion.notein.domain.models.cloudsync.CloudAuthRequest;
import com.orion.notein.domain.models.cloudsync.CloudBundle;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import java.util.List;
import o0OOo0Oo.EnumC27285OooO;
import o0OOo0oo.C27624OooOOO0;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0Oo.C33768Ooooo00;
import oO0o0Oo.InterfaceC33721OooO0o;

/* JADX INFO: loaded from: classes9.dex */
public interface OooO00o {
    Object OooO(String str, OooOOO0 oooOOO0);

    InterfaceC33721OooO0o OooO00o();

    InterfaceC33721OooO0o<Boolean> OooO0O0();

    Object OooO0Oo(AbstractC32479OooO0OO abstractC32479OooO0OO);

    boolean OooO0o();

    InterfaceC33721OooO0o<String> OooO0o0();

    C33768Ooooo00 OooO0oO();

    Object OooO0oo(String str, CloudBundle cloudBundle, boolean z, Oooo0 oooo0);

    Object OooOO0(CloudMetaLocalEntity cloudMetaLocalEntity, C26739Oooo0oO c26739Oooo0oO);

    Object OooOO0O(String str, CloudContentTag cloudContentTag, OooO0O0 oooO0O0);

    Object OooOO0o(String str, OooO oooO);

    Object OooOOO(String str, C26716OooO0oo c26716OooO0oo);

    Object OooOOO0(String str, String str2, String str3, long j, InterfaceC32507OooOO0o interfaceC32507OooOO0o, C26717OooOO0o c26717OooOO0o);

    C32460OooOooO OooOOOO();

    InterfaceC33721OooO0o<List<CloudMetaRemoteEntity>> OooOOOo(String str);

    Object OooOOo(String str, C26723OooOo0O c26723OooOo0O);

    Object OooOOo0(String str, C26728OooOoo c26728OooOoo);

    InterfaceC33721OooO0o<List<CloudMetaLocalEntity>> OooOOoo(String str);

    Object OooOo(CloudAuthRequest cloudAuthRequest, C27624OooOOO0 c27624OooOOO0);

    Object OooOo0(OooO0OO oooO0OO);

    Object OooOo00(Oooo000 oooo000);

    Object OooOo0O(String str, C26715OooO0oO c26715OooO0oO);

    Object OooOo0o(String str, OooOO0 oooOO02);

    Object OooOoO(OooOo oooOo);

    Object OooOoO0(C26713OooO0Oo c26713OooO0Oo);

    Object OooOoOO(String str, CloudBundle cloudBundle, boolean z, C26734Oooo00o c26734Oooo00o);

    Object OooOoo(String str, String str2, C26724OooOo0o c26724OooOo0o);

    Object OooOoo0(String str, C26733Oooo00O c26733Oooo00O);

    Object OooOooO(String str, String str2, String str3, OooOO0O oooOO0O);

    default Object OooOooo(OooO0o oooO0o) {
        return C32460OooOooO.f116667OooO00o;
    }

    Object Oooo000(String str, OooOOOO oooOOOO);

    Object Oooo00O(String str, C26721OooOOoo c26721OooOOoo);

    EnumC27285OooO getType();
}
