package com.orion.notein.data.p602db.entity.cloudsync;

import OooOO0.OooO0OO;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\t\u0010-\u001a\u00020\u0010HÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J{\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\fHÆ\u0001J\u0013\u00100\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001e¨\u00065"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/cloudsync/DriveSnapshotCacheEntity;", "", "id", "", "driveId", "cloudMetaId", "mimeType", "cTag", "Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "extra", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "sizeBytes", "", "createdTimeMillis", "editedTimeMillis", "recycled", "", "recycledTimeMillis", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;JJJZJ)V", "getId", "()Ljava/lang/String;", "getDriveId", "getCloudMetaId", "getMimeType", "getCTag", "()Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "getExtra", "()Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "getSizeBytes", "()J", "getCreatedTimeMillis", "getEditedTimeMillis", "getRecycled", "()Z", "getRecycledTimeMillis", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class DriveSnapshotCacheEntity {
    private final CloudContentTag cTag;
    private final String cloudMetaId;
    private final long createdTimeMillis;
    private final String driveId;
    private final long editedTimeMillis;
    private final CloudMetaExtra extra;
    private final String id;
    private final String mimeType;
    private final boolean recycled;
    private final long recycledTimeMillis;
    private final long sizeBytes;

    public DriveSnapshotCacheEntity(String id, String driveId, String str, String str2, CloudContentTag cTag, CloudMetaExtra extra, long j, long j2, long j3, boolean z, long j4) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(driveId, "driveId");
        OooOOO0.OooO0oO(cTag, "cTag");
        OooOOO0.OooO0oO(extra, "extra");
        this.id = id;
        this.driveId = driveId;
        this.cloudMetaId = str;
        this.mimeType = str2;
        this.cTag = cTag;
        this.extra = extra;
        this.sizeBytes = j;
        this.createdTimeMillis = j2;
        this.editedTimeMillis = j3;
        this.recycled = z;
        this.recycledTimeMillis = j4;
    }

    public static /* synthetic */ DriveSnapshotCacheEntity copy$default(DriveSnapshotCacheEntity driveSnapshotCacheEntity, String str, String str2, String str3, String str4, CloudContentTag cloudContentTag, CloudMetaExtra cloudMetaExtra, long j, long j2, long j3, boolean z, long j4, int i, Object obj) {
        long j5;
        String str5;
        DriveSnapshotCacheEntity driveSnapshotCacheEntity2;
        String str6;
        String str7;
        String str8;
        CloudContentTag cloudContentTag2;
        CloudMetaExtra cloudMetaExtra2;
        long j6;
        long j7;
        long j8;
        boolean z2;
        String str9 = (i & 1) != 0 ? driveSnapshotCacheEntity.id : str;
        String str10 = (i & 2) != 0 ? driveSnapshotCacheEntity.driveId : str2;
        String str11 = (i & 4) != 0 ? driveSnapshotCacheEntity.cloudMetaId : str3;
        String str12 = (i & 8) != 0 ? driveSnapshotCacheEntity.mimeType : str4;
        CloudContentTag cloudContentTag3 = (i & 16) != 0 ? driveSnapshotCacheEntity.cTag : cloudContentTag;
        CloudMetaExtra cloudMetaExtra3 = (i & 32) != 0 ? driveSnapshotCacheEntity.extra : cloudMetaExtra;
        long j9 = (i & 64) != 0 ? driveSnapshotCacheEntity.sizeBytes : j;
        long j10 = (i & 128) != 0 ? driveSnapshotCacheEntity.createdTimeMillis : j2;
        long j11 = (i & 256) != 0 ? driveSnapshotCacheEntity.editedTimeMillis : j3;
        boolean z3 = (i & 512) != 0 ? driveSnapshotCacheEntity.recycled : z;
        if ((i & 1024) != 0) {
            str5 = str9;
            j5 = driveSnapshotCacheEntity.recycledTimeMillis;
            str6 = str10;
            str7 = str11;
            str8 = str12;
            cloudContentTag2 = cloudContentTag3;
            cloudMetaExtra2 = cloudMetaExtra3;
            j6 = j9;
            j7 = j10;
            j8 = j11;
            z2 = z3;
            driveSnapshotCacheEntity2 = driveSnapshotCacheEntity;
        } else {
            j5 = j4;
            str5 = str9;
            driveSnapshotCacheEntity2 = driveSnapshotCacheEntity;
            str6 = str10;
            str7 = str11;
            str8 = str12;
            cloudContentTag2 = cloudContentTag3;
            cloudMetaExtra2 = cloudMetaExtra3;
            j6 = j9;
            j7 = j10;
            j8 = j11;
            z2 = z3;
        }
        return driveSnapshotCacheEntity2.copy(str5, str6, str7, str8, cloudContentTag2, cloudMetaExtra2, j6, j7, j8, z2, j5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getRecycled() {
        return this.recycled;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getRecycledTimeMillis() {
        return this.recycledTimeMillis;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDriveId() {
        return this.driveId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCloudMetaId() {
        return this.cloudMetaId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CloudContentTag getCTag() {
        return this.cTag;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CloudMetaExtra getExtra() {
        return this.extra;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getCreatedTimeMillis() {
        return this.createdTimeMillis;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getEditedTimeMillis() {
        return this.editedTimeMillis;
    }

    public final DriveSnapshotCacheEntity copy(String id, String driveId, String cloudMetaId, String mimeType, CloudContentTag cTag, CloudMetaExtra extra, long sizeBytes, long createdTimeMillis, long editedTimeMillis, boolean recycled, long recycledTimeMillis) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(driveId, "driveId");
        OooOOO0.OooO0oO(cTag, "cTag");
        OooOOO0.OooO0oO(extra, "extra");
        return new DriveSnapshotCacheEntity(id, driveId, cloudMetaId, mimeType, cTag, extra, sizeBytes, createdTimeMillis, editedTimeMillis, recycled, recycledTimeMillis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DriveSnapshotCacheEntity)) {
            return false;
        }
        DriveSnapshotCacheEntity driveSnapshotCacheEntity = (DriveSnapshotCacheEntity) other;
        return OooOOO0.OooO0O0(this.id, driveSnapshotCacheEntity.id) && OooOOO0.OooO0O0(this.driveId, driveSnapshotCacheEntity.driveId) && OooOOO0.OooO0O0(this.cloudMetaId, driveSnapshotCacheEntity.cloudMetaId) && OooOOO0.OooO0O0(this.mimeType, driveSnapshotCacheEntity.mimeType) && OooOOO0.OooO0O0(this.cTag, driveSnapshotCacheEntity.cTag) && OooOOO0.OooO0O0(this.extra, driveSnapshotCacheEntity.extra) && this.sizeBytes == driveSnapshotCacheEntity.sizeBytes && this.createdTimeMillis == driveSnapshotCacheEntity.createdTimeMillis && this.editedTimeMillis == driveSnapshotCacheEntity.editedTimeMillis && this.recycled == driveSnapshotCacheEntity.recycled && this.recycledTimeMillis == driveSnapshotCacheEntity.recycledTimeMillis;
    }

    public final CloudContentTag getCTag() {
        return this.cTag;
    }

    public final String getCloudMetaId() {
        return this.cloudMetaId;
    }

    public final long getCreatedTimeMillis() {
        return this.createdTimeMillis;
    }

    public final String getDriveId() {
        return this.driveId;
    }

    public final long getEditedTimeMillis() {
        return this.editedTimeMillis;
    }

    public final CloudMetaExtra getExtra() {
        return this.extra;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final boolean getRecycled() {
        return this.recycled;
    }

    public final long getRecycledTimeMillis() {
        return this.recycledTimeMillis;
    }

    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.driveId);
        String str = this.cloudMetaId;
        int iHashCode = (iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mimeType;
        return Long.hashCode(this.recycledTimeMillis) + o00000.OooO0O0(C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(C20703o000000o.OooO0O0((this.extra.hashCode() + ((this.cTag.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.sizeBytes), 31, this.createdTimeMillis), 31, this.editedTimeMillis), 31, this.recycled);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.driveId;
        String str3 = this.cloudMetaId;
        String str4 = this.mimeType;
        CloudContentTag cloudContentTag = this.cTag;
        CloudMetaExtra cloudMetaExtra = this.extra;
        long j = this.sizeBytes;
        long j2 = this.createdTimeMillis;
        long j3 = this.editedTimeMillis;
        boolean z = this.recycled;
        long j4 = this.recycledTimeMillis;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("DriveSnapshotCacheEntity(id=", str, ", driveId=", str2, ", cloudMetaId=");
        OooO0OO.OooO0o0(sbOooO0O0, str3, ", mimeType=", str4, ", cTag=");
        sbOooO0O0.append(cloudContentTag);
        sbOooO0O0.append(", extra=");
        sbOooO0O0.append(cloudMetaExtra);
        sbOooO0O0.append(", sizeBytes=");
        sbOooO0O0.append(j);
        C22205OooOOo.OooO0OO(j2, ", createdTimeMillis=", ", editedTimeMillis=", sbOooO0O0);
        sbOooO0O0.append(j3);
        sbOooO0O0.append(", recycled=");
        sbOooO0O0.append(z);
        return com.facebook.soloader.OooO0OO.OooO00o(j4, ", recycledTimeMillis=", ")", sbOooO0O0);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ DriveSnapshotCacheEntity(java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, com.orion.notein.domain.models.cloudsync.CloudContentTag r33, com.orion.notein.domain.models.cloudsync.CloudMetaExtra r34, long r35, long r37, long r39, boolean r41, long r42, int r44, kotlin.jvm.internal.C24018OooO0oo r45) {
        /*
            r28 = this;
            r0 = r44
            r1 = r0 & 8
            if (r1 == 0) goto L9
            r1 = 0
            r6 = r1
            goto Lb
        L9:
            r6 = r32
        Lb:
            r1 = r0 & 16
            if (r1 == 0) goto L1b
            com.orion.notein.domain.models.cloudsync.CloudContentTag r7 = new com.orion.notein.domain.models.cloudsync.CloudContentTag
            r12 = 7
            r13 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r7.<init>(r8, r9, r10, r12, r13)
            goto L1d
        L1b:
            r7 = r33
        L1d:
            r1 = r0 & 32
            if (r1 == 0) goto L47
            com.orion.notein.domain.models.cloudsync.CloudMetaExtra r8 = new com.orion.notein.domain.models.cloudsync.CloudMetaExtra
            r26 = 131071(0x1ffff, float:1.8367E-40)
            r27 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L49
        L47:
            r8 = r34
        L49:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L51
            r9 = r2
            goto L53
        L51:
            r9 = r35
        L53:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L59
            r11 = r2
            goto L5b
        L59:
            r11 = r37
        L5b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L61
            r13 = r2
            goto L63
        L61:
            r13 = r39
        L63:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L6a
            r1 = 0
            r15 = r1
            goto L6c
        L6a:
            r15 = r41
        L6c:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L7b
            r16 = r2
            r4 = r30
            r5 = r31
            r2 = r28
            r3 = r29
            goto L85
        L7b:
            r16 = r42
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r31
        L85:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r13, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.data.p602db.entity.cloudsync.DriveSnapshotCacheEntity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.orion.notein.domain.models.cloudsync.CloudContentTag, com.orion.notein.domain.models.cloudsync.CloudMetaExtra, long, long, long, boolean, long, int, kotlin.jvm.internal.OooO0oo):void");
    }
}
