package o0OOoO0;

import com.orion.notein.domain.models.cloudsync.CloudBundle;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import com.orion.notein.domain.models.cloudsync.CloudMetaType;
import com.orion.notein.domain.models.cloudsync.SyncPhase;
import com.orion.notein.domain.models.cloudsync.SyncState;
import com.orion.notein.domain.models.note.NoteFile;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.Map;
import kotlin.jvm.internal.C24018OooO0oo;
import o0OOo0oo.InterfaceC27660OoooOo0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOoO0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27718OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<CloudMetaType, InterfaceC27660OoooOo0> f97774OooO00o;

    public C27718OooO0oo(Map<CloudMetaType, InterfaceC27660OoooOo0> map) {
        this.f97774OooO00o = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(CloudMetaRemote cloudMetaRemote, NoteFile noteFile, String str, NoteMeta noteMeta, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27717OooO0oO c27717OooO0oO;
        String id;
        String mimeType;
        NoteFile noteFile2;
        String str2;
        NoteMeta noteMeta2;
        CloudMetaRemote cloudMetaRemote2;
        String str3;
        Object obj;
        String str4;
        String str5;
        String metaHash;
        if (abstractC32479OooO0OO instanceof C27717OooO0oO) {
            c27717OooO0oO = (C27717OooO0oO) abstractC32479OooO0OO;
            int i = c27717OooO0oO.f97773OooOooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27717OooO0oO.f97773OooOooo = i - Integer.MIN_VALUE;
            } else {
                c27717OooO0oO = new C27717OooO0oO(this, abstractC32479OooO0OO);
            }
        }
        Object obj2 = c27717OooO0oO.f97770OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27717OooO0oO.f97773OooOooo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            id = cloudMetaRemote.getId();
            mimeType = cloudMetaRemote.getMimeType();
            CloudMetaType cloudMetaTypeFromMime = CloudMetaType.INSTANCE.fromMime(mimeType);
            if (cloudMetaTypeFromMime == null) {
                return null;
            }
            InterfaceC27660OoooOo0 interfaceC27660OoooOo0 = this.f97774OooO00o.get(cloudMetaTypeFromMime);
            if (interfaceC27660OoooOo0 == null) {
                noteFile2 = noteFile;
                str2 = str;
                noteMeta2 = noteMeta;
                cloudMetaRemote2 = cloudMetaRemote;
                str4 = mimeType;
                str5 = "";
                String str6 = id;
                SyncPhase syncPhase = noteMeta2 == null ? SyncPhase.DIRTY_CLOUD : SyncPhase.CLEAN;
                long lastModificationTime = noteFile2.getLastModificationTime();
                CloudContentTag cloudContentTag = noteMeta2 == null ? new CloudContentTag((String) null, (String) null, 0L, 7, (C24018OooO0oo) null) : new CloudContentTag((String) null, (String) null, Math.min(lastModificationTime, noteMeta2.getLastModificationTime()), 3, (C24018OooO0oo) null);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("MigrationMetaBuilder");
                c20358OooO00o.OooO0o0("Built migration meta: id=%s, mimeType=%s, metaHash=%s, syncPhase=%s, legacyCloudLastModified=%s, noteMetaLastModified=%s, hasNoteMeta=%s", str6, str4, str5, syncPhase, new Long(lastModificationTime), noteMeta2 != null ? new Long(noteMeta2.getLastModificationTime()) : "N/A", Boolean.valueOf(noteMeta2 != null));
                return new CloudMetaLocal(str6, str2, str4, 0, cloudContentTag, str5, null, new SyncState(syncPhase, (String) null, 2, (C24018OooO0oo) null), false, cloudMetaRemote2.getDeleted(), lastModificationTime, null, 2048, null);
            }
            c27717OooO0oO.f97766OooOo0o = cloudMetaRemote;
            noteFile2 = noteFile;
            c27717OooO0oO.f97765OooOo = noteFile2;
            str2 = str;
            c27717OooO0oO.f97768OooOoO0 = str2;
            noteMeta2 = noteMeta;
            c27717OooO0oO.f97767OooOoO = noteMeta2;
            c27717OooO0oO.f97769OooOoOO = id;
            c27717OooO0oO.f97771OooOoo0 = mimeType;
            c27717OooO0oO.f97773OooOooo = 1;
            Object objOooO00o = interfaceC27660OoooOo0.OooO00o(id, c27717OooO0oO);
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            str3 = mimeType;
            obj = objOooO00o;
            cloudMetaRemote2 = cloudMetaRemote;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = c27717OooO0oO.f97771OooOoo0;
            id = c27717OooO0oO.f97769OooOoOO;
            NoteMeta noteMeta3 = c27717OooO0oO.f97767OooOoO;
            String str7 = c27717OooO0oO.f97768OooOoO0;
            noteFile2 = c27717OooO0oO.f97765OooOo;
            cloudMetaRemote2 = c27717OooO0oO.f97766OooOo0o;
            C32446OooOOOo.OooO0O0(obj2);
            obj = ((C32445OooOOOO) obj2).f116639OooOo0o;
            noteMeta2 = noteMeta3;
            str2 = str7;
        }
        if (obj instanceof C32445OooOOOO.OooO00o) {
            obj = null;
        }
        CloudBundle cloudBundle = (CloudBundle) obj;
        if (cloudBundle != null && (metaHash = cloudBundle.getMetaHash()) != null) {
            str5 = metaHash;
            str4 = str3;
            String str62 = id;
            SyncPhase syncPhase2 = noteMeta2 == null ? SyncPhase.DIRTY_CLOUD : SyncPhase.CLEAN;
            long lastModificationTime2 = noteFile2.getLastModificationTime();
            CloudContentTag cloudContentTag2 = noteMeta2 == null ? new CloudContentTag((String) null, (String) null, 0L, 7, (C24018OooO0oo) null) : new CloudContentTag((String) null, (String) null, Math.min(lastModificationTime2, noteMeta2.getLastModificationTime()), 3, (C24018OooO0oo) null);
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("MigrationMetaBuilder");
            c20358OooO00o2.OooO0o0("Built migration meta: id=%s, mimeType=%s, metaHash=%s, syncPhase=%s, legacyCloudLastModified=%s, noteMetaLastModified=%s, hasNoteMeta=%s", str62, str4, str5, syncPhase2, new Long(lastModificationTime2), noteMeta2 != null ? new Long(noteMeta2.getLastModificationTime()) : "N/A", Boolean.valueOf(noteMeta2 != null));
            return new CloudMetaLocal(str62, str2, str4, 0, cloudContentTag2, str5, null, new SyncState(syncPhase2, (String) null, 2, (C24018OooO0oo) null), false, cloudMetaRemote2.getDeleted(), lastModificationTime2, null, 2048, null);
        }
        mimeType = str3;
        str4 = mimeType;
        str5 = "";
        String str622 = id;
        SyncPhase syncPhase22 = noteMeta2 == null ? SyncPhase.DIRTY_CLOUD : SyncPhase.CLEAN;
        long lastModificationTime22 = noteFile2.getLastModificationTime();
        CloudContentTag cloudContentTag22 = noteMeta2 == null ? new CloudContentTag((String) null, (String) null, 0L, 7, (C24018OooO0oo) null) : new CloudContentTag((String) null, (String) null, Math.min(lastModificationTime22, noteMeta2.getLastModificationTime()), 3, (C24018OooO0oo) null);
        C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o22.OooOOO0("MigrationMetaBuilder");
        c20358OooO00o22.OooO0o0("Built migration meta: id=%s, mimeType=%s, metaHash=%s, syncPhase=%s, legacyCloudLastModified=%s, noteMetaLastModified=%s, hasNoteMeta=%s", str622, str4, str5, syncPhase22, new Long(lastModificationTime22), noteMeta2 != null ? new Long(noteMeta2.getLastModificationTime()) : "N/A", Boolean.valueOf(noteMeta2 != null));
        return new CloudMetaLocal(str622, str2, str4, 0, cloudContentTag22, str5, null, new SyncState(syncPhase22, (String) null, 2, (C24018OooO0oo) null), false, cloudMetaRemote2.getDeleted(), lastModificationTime22, null, 2048, null);
    }
}
