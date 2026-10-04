package com.orion.notein.data.p602db.entity;

import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.huawei.agconnect.credential.obs.C17625c;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\tHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, m80612d2 = {"Lcom/orion/notein/data/db/entity/NotePdfLostInfoEntity;", "", "id", "", "srcNoteId", C17625c.f52155b, "", "pdfFileName", "dbVersion", "", "contentDBVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;II)V", "getId", "()Ljava/lang/String;", "getSrcNoteId", "getCreationTime", "()J", "getPdfFileName", "getDbVersion", "()I", "getContentDBVersion", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NotePdfLostInfoEntity {
    private final int contentDBVersion;
    private final long creationTime;
    private final int dbVersion;
    private final String id;
    private final String pdfFileName;
    private final String srcNoteId;

    public NotePdfLostInfoEntity(String id, String srcNoteId, long j, String pdfFileName, int i, int i2) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(srcNoteId, "srcNoteId");
        OooOOO0.OooO0oO(pdfFileName, "pdfFileName");
        this.id = id;
        this.srcNoteId = srcNoteId;
        this.creationTime = j;
        this.pdfFileName = pdfFileName;
        this.dbVersion = i;
        this.contentDBVersion = i2;
    }

    public static /* synthetic */ NotePdfLostInfoEntity copy$default(NotePdfLostInfoEntity notePdfLostInfoEntity, String str, String str2, long j, String str3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = notePdfLostInfoEntity.id;
        }
        if ((i3 & 2) != 0) {
            str2 = notePdfLostInfoEntity.srcNoteId;
        }
        if ((i3 & 4) != 0) {
            j = notePdfLostInfoEntity.creationTime;
        }
        if ((i3 & 8) != 0) {
            str3 = notePdfLostInfoEntity.pdfFileName;
        }
        if ((i3 & 16) != 0) {
            i = notePdfLostInfoEntity.dbVersion;
        }
        if ((i3 & 32) != 0) {
            i2 = notePdfLostInfoEntity.contentDBVersion;
        }
        int i4 = i2;
        String str4 = str3;
        long j2 = j;
        return notePdfLostInfoEntity.copy(str, str2, j2, str4, i, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSrcNoteId() {
        return this.srcNoteId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPdfFileName() {
        return this.pdfFileName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDbVersion() {
        return this.dbVersion;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getContentDBVersion() {
        return this.contentDBVersion;
    }

    public final NotePdfLostInfoEntity copy(String id, String srcNoteId, long creationTime, String pdfFileName, int dbVersion, int contentDBVersion) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(srcNoteId, "srcNoteId");
        OooOOO0.OooO0oO(pdfFileName, "pdfFileName");
        return new NotePdfLostInfoEntity(id, srcNoteId, creationTime, pdfFileName, dbVersion, contentDBVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotePdfLostInfoEntity)) {
            return false;
        }
        NotePdfLostInfoEntity notePdfLostInfoEntity = (NotePdfLostInfoEntity) other;
        return OooOOO0.OooO0O0(this.id, notePdfLostInfoEntity.id) && OooOOO0.OooO0O0(this.srcNoteId, notePdfLostInfoEntity.srcNoteId) && this.creationTime == notePdfLostInfoEntity.creationTime && OooOOO0.OooO0O0(this.pdfFileName, notePdfLostInfoEntity.pdfFileName) && this.dbVersion == notePdfLostInfoEntity.dbVersion && this.contentDBVersion == notePdfLostInfoEntity.contentDBVersion;
    }

    public final int getContentDBVersion() {
        return this.contentDBVersion;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final int getDbVersion() {
        return this.dbVersion;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPdfFileName() {
        return this.pdfFileName;
    }

    public final String getSrcNoteId() {
        return this.srcNoteId;
    }

    public int hashCode() {
        return Integer.hashCode(this.contentDBVersion) + C20785Oooo00o.OooO00o(this.dbVersion, OooO00o.OooO0O0(C20703o000000o.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.srcNoteId), 31, this.creationTime), 31, this.pdfFileName), 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.srcNoteId;
        long j = this.creationTime;
        String str3 = this.pdfFileName;
        int i = this.dbVersion;
        int i2 = this.contentDBVersion;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("NotePdfLostInfoEntity(id=", str, ", srcNoteId=", str2, ", creationTime=");
        sbOooO0O0.append(j);
        sbOooO0O0.append(", pdfFileName=");
        sbOooO0O0.append(str3);
        sbOooO0O0.append(", dbVersion=");
        sbOooO0O0.append(i);
        sbOooO0O0.append(", contentDBVersion=");
        sbOooO0O0.append(i2);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }
}
