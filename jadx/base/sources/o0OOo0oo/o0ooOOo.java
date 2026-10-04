package o0OOo0oo;

import com.orion.notein.domain.models.cloudsync.CloudMetaType;
import java.util.Iterator;
import java.util.List;
import o0OOoO00.C27723OooO0O0;
import o0oOo0o0.AbstractC30978OooO;

/* JADX INFO: loaded from: classes9.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f97663OooO00o;

    public o0ooOOo(C27723OooO0O0 cloudSyncFacade) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudSyncFacade, "cloudSyncFacade");
        this.f97663OooO00o = cloudSyncFacade;
    }

    public void OooO00o(String id, CloudMetaType type) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
        C27723OooO0O0.OooO0o0((C27723OooO0O0) this.f97663OooO00o, id, type);
    }

    public void OooO0O0(String folderId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(folderId, "folderId");
        CloudMetaType cloudMetaType = CloudMetaType.FOLDER;
        ((C27723OooO0O0) this.f97663OooO00o).OooO0OO(folderId, cloudMetaType);
        OooO00o(folderId, cloudMetaType);
    }

    public void OooO0OO(List folderIds) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(folderIds, "folderIds");
        Iterator it = folderIds.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            CloudMetaType cloudMetaType = CloudMetaType.FOLDER;
            ((C27723OooO0O0) this.f97663OooO00o).OooO0OO(str, cloudMetaType);
            OooO00o(str, cloudMetaType);
        }
    }

    public void OooO0Oo(String noteId, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        CloudMetaType cloudMetaType = CloudMetaType.NOTE;
        ((C27723OooO0O0) this.f97663OooO00o).OooO0OO(noteId, cloudMetaType);
        if (z) {
            OooO00o(noteId, cloudMetaType);
        }
    }

    public void OooO0o(String templateId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(templateId, "templateId");
        CloudMetaType cloudMetaType = CloudMetaType.TEMPLATE;
        ((C27723OooO0O0) this.f97663OooO00o).OooO0OO(templateId, cloudMetaType);
        OooO00o(templateId, cloudMetaType);
    }

    public void OooO0o0(List noteIds) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteIds, "noteIds");
        Iterator it = noteIds.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            CloudMetaType cloudMetaType = CloudMetaType.NOTE;
            ((C27723OooO0O0) this.f97663OooO00o).OooO0OO(str, cloudMetaType);
            OooO00o(str, cloudMetaType);
        }
    }

    public o0ooOOo(AbstractC30978OooO abstractC30978OooO) {
        this.f97663OooO00o = abstractC30978OooO;
    }
}
