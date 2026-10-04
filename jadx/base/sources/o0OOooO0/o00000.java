package o0OOooO0;

import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaRemoteEntity;
import com.orion.notein.domain.models.cloud.NoteCloudQuota;
import com.orion.notein.domain.models.cloudsync.CloudAuthRequest;
import com.orion.notein.domain.models.note.NoteHistoryVersion;
import java.io.File;
import java.io.Serializable;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.EnumC27285OooO;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0Oo.InterfaceC33721OooO0o;

/* JADX INFO: loaded from: classes9.dex */
public interface o00000 {
    Serializable OooO(AbstractC32479OooO0OO abstractC32479OooO0OO);

    InterfaceC33721OooO0o<NoteCloudQuota> OooO00o();

    InterfaceC33721OooO0o<Boolean> OooO0O0();

    Object OooO0OO(AbstractC32479OooO0OO abstractC32479OooO0OO);

    Serializable OooO0Oo(AbstractC32479OooO0OO abstractC32479OooO0OO);

    boolean OooO0o();

    Serializable OooO0o0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO);

    Object OooO0oO(String str, CloudMetaRemoteEntity cloudMetaRemoteEntity, AbstractC32479OooO0OO abstractC32479OooO0OO);

    Object OooO0oo(AbstractC32479OooO0OO abstractC32479OooO0OO);

    Object OooOO0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO);

    Object OooOO0O(AbstractC32479OooO0OO abstractC32479OooO0OO);

    Object OooOO0o(AbstractC32479OooO0OO abstractC32479OooO0OO);

    Object OooOOO(String str, Continuation<? super C32445OooOOOO<? extends List<NoteHistoryVersion>>> continuation);

    Object OooOOO0(o00000O o00000o, AbstractC32479OooO0OO abstractC32479OooO0OO);

    Object OooOOOO(File file, String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO);

    Object OooOOOo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO);

    Object OooOOo(String str, File file, String str2, long j, InterfaceC32507OooOO0o interfaceC32507OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO);

    Object OooOOo0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO);

    Object OooOOoo(CloudAuthRequest cloudAuthRequest, C27904OooOo c27904OooOo);

    Object OooOo0(AbstractC32479OooO0OO abstractC32479OooO0OO);

    InterfaceC33721OooO0o<String> OooOo00();

    EnumC27285OooO getType();
}
