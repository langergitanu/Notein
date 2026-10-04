package o0OOo0oo;

import com.aspose.slides.C22205OooOOo;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtraKt;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import com.orion.notein.domain.models.note.NoteMeta;
import java.security.NoSuchAlgorithmException;
import o0OOo0Oo.InterfaceC27309OooOoO;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.o0ooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27700o0ooOO0 implements InterfaceC27661OoooOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27313OooOoo0 f97661OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC27309OooOoO f97662OooO0O0;

    public C27700o0ooOO0(InterfaceC27313OooOoo0 noteMetaRepo, InterfaceC27309OooOoO noteContentRepo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteMetaRepo, "noteMetaRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteContentRepo, "noteContentRepo");
        this.f97661OooO00o = noteMetaRepo;
        this.f97662OooO0O0 = noteContentRepo;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o0OOo0oo.InterfaceC27661OoooOoO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(CloudMetaLocal cloudMetaLocal, AbstractC32479OooO0OO abstractC32479OooO0OO) throws NoSuchAlgorithmException {
        o00oO0O o00oo0o;
        CloudMetaLocal cloudMetaLocal2;
        C27700o0ooOO0 c27700o0ooOO0;
        String str;
        CloudMetaLocal cloudMetaLocal3;
        NoteMeta noteMeta;
        Long l;
        if (abstractC32479OooO0OO instanceof o00oO0O) {
            o00oo0o = (o00oO0O) abstractC32479OooO0OO;
            int i = o00oo0o.f97638OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00oo0o.f97638OooOoOO = i - Integer.MIN_VALUE;
            } else {
                o00oo0o = new o00oO0O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = o00oo0o.f97637OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00oo0o.f97638OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            String id = cloudMetaLocal.getId();
            o00oo0o.f97635OooOo0o = this;
            cloudMetaLocal2 = cloudMetaLocal;
            o00oo0o.f97634OooOo = cloudMetaLocal2;
            o00oo0o.f97638OooOoOO = 1;
            objOooOOo = this.f97661OooO00o.OooOOo(id, o00oo0o);
            if (objOooOOo != enumC32485OooO00o) {
                c27700o0ooOO0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            noteMeta = (NoteMeta) o00oo0o.f97634OooOo;
            cloudMetaLocal3 = (CloudMetaLocal) o00oo0o.f97635OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo);
            str = ", usingOwnPdf=";
            l = (Long) objOooOOo;
            if (l != null) {
                return Boolean.FALSE;
            }
            long jLongValue = l.longValue();
            boolean zIsLastModifiedOldThan = cloudMetaLocal3.getContentTag().isLastModifiedOldThan(jLongValue);
            if (zIsLastModifiedOldThan) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteDirtyDetector");
                String id2 = cloudMetaLocal3.getId();
                long lastModified = cloudMetaLocal3.getContentTag().getLastModified();
                long lastModificationTime = noteMeta.getLastModificationTime();
                int totalPagesCount = noteMeta.getTotalPagesCount();
                boolean usingOwnPdf = noteMeta.getUsingOwnPdf();
                StringBuilder sb = new StringBuilder("Note local modified (content time): id=");
                sb.append(id2);
                sb.append(", contentLastModificationTime=");
                sb.append(jLongValue);
                C22205OooOOo.OooO0OO(lastModified, ", contentTag.lastModified=", ", noteLastMod=", sb);
                sb.append(lastModificationTime);
                sb.append(", pages=");
                sb.append(totalPagesCount);
                sb.append(str);
                sb.append(usingOwnPdf);
                c20358OooO00o.OooO0o0(sb.toString(), new Object[0]);
            }
            return Boolean.valueOf(zIsLastModifiedOldThan);
        }
        cloudMetaLocal2 = (CloudMetaLocal) o00oo0o.f97634OooOo;
        c27700o0ooOO0 = (C27700o0ooOO0) o00oo0o.f97635OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOOo);
        NoteMeta noteMeta2 = (NoteMeta) objOooOOo;
        if (noteMeta2 == null) {
            return Boolean.FALSE;
        }
        String strComputeMetaHash = CloudMetaExtraKt.computeMetaHash(CloudMetaExtra.INSTANCE.fromNoteMeta(noteMeta2));
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(strComputeMetaHash, cloudMetaLocal2.getMetaHash())) {
            str = ", usingOwnPdf=";
            InterfaceC27309OooOoO interfaceC27309OooOoO = c27700o0ooOO0.f97662OooO0O0;
            String id3 = cloudMetaLocal2.getId();
            o00oo0o.f97635OooOo0o = cloudMetaLocal2;
            o00oo0o.f97634OooOo = noteMeta2;
            o00oo0o.f97638OooOoOO = 2;
            objOooOOo = interfaceC27309OooOoO.OooOO0O(id3, o00oo0o);
            if (objOooOOo != enumC32485OooO00o) {
                cloudMetaLocal3 = cloudMetaLocal2;
                noteMeta = noteMeta2;
                l = (Long) objOooOOo;
                if (l != null) {
                }
            }
            return enumC32485OooO00o;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("NoteDirtyDetector");
        String id4 = cloudMetaLocal2.getId();
        String metaHash = cloudMetaLocal2.getMetaHash();
        String strOooO0O0 = C27666OooooOO.OooO0O0(noteMeta2.getTitle());
        String parentId = noteMeta2.getParentId();
        boolean favorite = noteMeta2.getFavorite();
        boolean inTrashBin = noteMeta2.getInTrashBin();
        Integer sortKey = noteMeta2.getSortKey();
        boolean lockAdded = noteMeta2.getLockAdded();
        long lastModificationTime2 = noteMeta2.getLastModificationTime();
        long lastOpenedTime = noteMeta2.getLastOpenedTime();
        int totalPagesCount2 = noteMeta2.getTotalPagesCount();
        boolean usingOwnPdf2 = noteMeta2.getUsingOwnPdf();
        StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("Note local modified (meta hash mismatch): id=", id4, ", metaHash=", metaHash, ", computed=");
        OooOO0.OooO0OO.OooO0o0(sbOooO0O0, strComputeMetaHash, ", title=", strOooO0O0, ", parentId=");
        sbOooO0O0.append(parentId);
        sbOooO0O0.append(", favorite=");
        sbOooO0O0.append(favorite);
        sbOooO0O0.append(", inTrash=");
        sbOooO0O0.append(inTrashBin);
        sbOooO0O0.append(", sortKey=");
        sbOooO0O0.append(sortKey);
        sbOooO0O0.append(", lockAdded=");
        sbOooO0O0.append(lockAdded);
        sbOooO0O0.append(", lastMod=");
        sbOooO0O0.append(lastModificationTime2);
        C22205OooOOo.OooO0OO(lastOpenedTime, ", lastOpened=", ", pages=", sbOooO0O0);
        sbOooO0O0.append(totalPagesCount2);
        sbOooO0O0.append(", usingOwnPdf=");
        sbOooO0O0.append(usingOwnPdf2);
        c20358OooO00o2.OooO0o0(sbOooO0O0.toString(), new Object[0]);
        return Boolean.TRUE;
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
        C27698o00oO0o c27698o00oO0o;
        if (abstractC32479OooO0OO instanceof C27698o00oO0o) {
            c27698o00oO0o = (C27698o00oO0o) abstractC32479OooO0OO;
            int i = c27698o00oO0o.f97641OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27698o00oO0o.f97641OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27698o00oO0o = new C27698o00oO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = c27698o00oO0o.f97640OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27698o00oO0o.f97641OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            if (cloudMetaLocal.getDeleted()) {
                return Boolean.TRUE;
            }
            if (C27666OooooOO.OooO00o(cloudMetaLocal)) {
                return Boolean.FALSE;
            }
            String id = cloudMetaLocal.getId();
            c27698o00oO0o.f97641OooOoO0 = 1;
            objOooOOo = this.f97661OooO00o.OooOOo(id, c27698o00oO0o);
            if (objOooOOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOOo);
        }
        return Boolean.valueOf(objOooOOo == null);
    }
}
