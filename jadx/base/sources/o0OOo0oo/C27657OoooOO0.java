package o0OOo0oo;

import com.aspose.slides.C22205OooOOo;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import com.orion.notein.domain.models.folder.Folder;
import o0OOoooO.C28009OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27657OoooOO0 implements InterfaceC27661OoooOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C28009OooOOOO f97275OooO00o;

    public C27657OoooOO0(C28009OooOOOO c28009OooOOOO) {
        this.f97275OooO00o = c28009OooOOOO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0oo.InterfaceC27661OoooOoO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(CloudMetaLocal cloudMetaLocal, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27653OoooO c27653OoooO;
        if (abstractC32479OooO0OO instanceof C27653OoooO) {
            c27653OoooO = (C27653OoooO) abstractC32479OooO0OO;
            int i = c27653OoooO.f97260OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27653OoooO.f97260OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27653OoooO = new C27653OoooO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o0 = c27653OoooO.f97258OooOo;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27653OoooO.f97260OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o0);
            String id = cloudMetaLocal.getId();
            c27653OoooO.f97259OooOo0o = cloudMetaLocal;
            c27653OoooO.f97260OooOoO = 1;
            objOooO0o0 = this.f97275OooO00o.OooO0o0(id);
            if (objOooO0o0 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cloudMetaLocal = c27653OoooO.f97259OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o0);
        }
        Folder folder = (Folder) objOooO0o0;
        if (folder == null) {
            return Boolean.FALSE;
        }
        boolean zIsLastModifiedOldThan = cloudMetaLocal.getContentTag().isLastModifiedOldThan(folder.getLastModificationTime());
        if (zIsLastModifiedOldThan) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("FolderDirtyDetector");
            String id2 = cloudMetaLocal.getId();
            long lastModificationTime = folder.getLastModificationTime();
            long lastModified = cloudMetaLocal.getContentTag().getLastModified();
            String strOooO0O0 = C27666OooooOO.OooO0O0(folder.getTitle());
            String parentId = folder.getParentId();
            boolean favorite = folder.getFavorite();
            boolean inTrashBin = folder.getInTrashBin();
            Integer sortKey = folder.getSortKey();
            StringBuilder sb = new StringBuilder("Folder local modified: id=");
            sb.append(id2);
            sb.append(", lastMod=");
            sb.append(lastModificationTime);
            C22205OooOOo.OooO0OO(lastModified, ", contentTag.lastModified=", ", title=", sb);
            OooOO0.OooO0OO.OooO0o0(sb, strOooO0O0, ", parentId=", parentId, ", favorite=");
            sb.append(favorite);
            sb.append(", inTrash=");
            sb.append(inTrashBin);
            sb.append(", sortKey=");
            sb.append(sortKey);
            c20358OooO00o.OooO0o0(sb.toString(), new Object[0]);
        }
        return Boolean.valueOf(zIsLastModifiedOldThan);
    }

    @Override // o0OOo0oo.InterfaceC27661OoooOoO
    public final Boolean OooO0O0(CloudMetaRemote cloudMetaRemote, CloudMetaLocal cloudMetaLocal) {
        return Boolean.valueOf(cloudMetaRemote.getDeleted() && cloudMetaRemote.getMetaVersion() > cloudMetaLocal.getMetaVersion());
    }

    @Override // o0OOo0oo.InterfaceC27661OoooOoO
    public final Boolean OooO0OO(CloudMetaRemote cloudMetaRemote, CloudMetaLocal cloudMetaLocal) {
        return Boolean.valueOf(!cloudMetaRemote.getDeleted() && cloudMetaRemote.getMetaVersion() > cloudMetaLocal.getMetaVersion());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0oo.InterfaceC27661OoooOoO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(CloudMetaLocal cloudMetaLocal, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27656OoooO0O c27656OoooO0O;
        if (abstractC32479OooO0OO instanceof C27656OoooO0O) {
            c27656OoooO0O = (C27656OoooO0O) abstractC32479OooO0OO;
            int i = c27656OoooO0O.f97274OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27656OoooO0O.f97274OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27656OoooO0O = new C27656OoooO0O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o0 = c27656OoooO0O.f97273OooOo0o;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27656OoooO0O.f97274OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o0);
            if (cloudMetaLocal.getDeleted()) {
                return Boolean.TRUE;
            }
            if (C27666OooooOO.OooO00o(cloudMetaLocal)) {
                return Boolean.FALSE;
            }
            String id = cloudMetaLocal.getId();
            c27656OoooO0O.f97274OooOoO0 = 1;
            objOooO0o0 = this.f97275OooO00o.OooO0o0(id);
            if (objOooO0o0 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o0);
        }
        return Boolean.valueOf(objOooO0o0 == null);
    }
}
