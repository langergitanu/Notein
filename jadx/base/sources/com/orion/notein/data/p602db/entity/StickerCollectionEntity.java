package com.orion.notein.data.p602db.entity;

import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import Oooo0oO.C21023OooO0Oo;
import OoooooO.C21445Oooo;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.hihonor.honorid.core.data.ChildrenInfo;
import com.hihonor.honorid.core.data.TmemberRight;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u000eHÆ\u0003J_\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u000eHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/StickerCollectionEntity;", "", "id", "", TmemberRight.TAG_USERID, "name", ChildrenInfo.TAG_CHILDREN_INFO, "", "builtIn", "", C17625c.f52155b, "", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "sortKey", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZJJI)V", "getId", "()Ljava/lang/String;", "getUserId", "getName", "getChildren", "()Ljava/util/List;", "getBuiltIn", "()Z", "getCreationTime", "()J", "getLastModificationTime", "getSortKey", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class StickerCollectionEntity {
    private final boolean builtIn;
    private final List<String> children;
    private final long creationTime;
    private final String id;
    private final long lastModificationTime;
    private final String name;
    private final int sortKey;
    private final String userId;

    public StickerCollectionEntity(String id, String userId, String name, List<String> children, boolean z, long j, long j2, int i) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(userId, "userId");
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(children, "children");
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.children = children;
        this.builtIn = z;
        this.creationTime = j;
        this.lastModificationTime = j2;
        this.sortKey = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StickerCollectionEntity copy$default(StickerCollectionEntity stickerCollectionEntity, String str, String str2, String str3, List list, boolean z, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = stickerCollectionEntity.id;
        }
        if ((i2 & 2) != 0) {
            str2 = stickerCollectionEntity.userId;
        }
        if ((i2 & 4) != 0) {
            str3 = stickerCollectionEntity.name;
        }
        if ((i2 & 8) != 0) {
            list = stickerCollectionEntity.children;
        }
        if ((i2 & 16) != 0) {
            z = stickerCollectionEntity.builtIn;
        }
        if ((i2 & 32) != 0) {
            j = stickerCollectionEntity.creationTime;
        }
        if ((i2 & 64) != 0) {
            j2 = stickerCollectionEntity.lastModificationTime;
        }
        if ((i2 & 128) != 0) {
            i = stickerCollectionEntity.sortKey;
        }
        int i3 = i;
        long j3 = j2;
        long j4 = j;
        boolean z2 = z;
        String str4 = str3;
        return stickerCollectionEntity.copy(str, str2, str4, list, z2, j4, j3, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<String> component4() {
        return this.children;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getBuiltIn() {
        return this.builtIn;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getSortKey() {
        return this.sortKey;
    }

    public final StickerCollectionEntity copy(String id, String userId, String name, List<String> children, boolean builtIn, long creationTime, long lastModificationTime, int sortKey) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(userId, "userId");
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(children, "children");
        return new StickerCollectionEntity(id, userId, name, children, builtIn, creationTime, lastModificationTime, sortKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickerCollectionEntity)) {
            return false;
        }
        StickerCollectionEntity stickerCollectionEntity = (StickerCollectionEntity) other;
        return OooOOO0.OooO0O0(this.id, stickerCollectionEntity.id) && OooOOO0.OooO0O0(this.userId, stickerCollectionEntity.userId) && OooOOO0.OooO0O0(this.name, stickerCollectionEntity.name) && OooOOO0.OooO0O0(this.children, stickerCollectionEntity.children) && this.builtIn == stickerCollectionEntity.builtIn && this.creationTime == stickerCollectionEntity.creationTime && this.lastModificationTime == stickerCollectionEntity.lastModificationTime && this.sortKey == stickerCollectionEntity.sortKey;
    }

    public final boolean getBuiltIn() {
        return this.builtIn;
    }

    public final List<String> getChildren() {
        return this.children;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final String getId() {
        return this.id;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSortKey() {
        return this.sortKey;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Integer.hashCode(this.sortKey) + C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(o00000.OooO0O0(C21445Oooo.OooO00o(this.children, OooO00o.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.userId), 31, this.name), 31), 31, this.builtIn), 31, this.creationTime), 31, this.lastModificationTime);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.userId;
        String str3 = this.name;
        List<String> list = this.children;
        boolean z = this.builtIn;
        long j = this.creationTime;
        long j2 = this.lastModificationTime;
        int i = this.sortKey;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("StickerCollectionEntity(id=", str, ", userId=", str2, ", name=");
        sbOooO0O0.append(str3);
        sbOooO0O0.append(", children=");
        sbOooO0O0.append(list);
        sbOooO0O0.append(", builtIn=");
        sbOooO0O0.append(z);
        sbOooO0O0.append(", creationTime=");
        sbOooO0O0.append(j);
        C22205OooOOo.OooO0OO(j2, ", lastModificationTime=", ", sortKey=", sbOooO0O0);
        return C21023OooO0Oo.OooO0OO(")", i, sbOooO0O0);
    }

    public /* synthetic */ StickerCollectionEntity(String str, String str2, String str3, List list, boolean z, long j, long j2, int i, int i2, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, str3, list, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? System.currentTimeMillis() : j, (i2 & 64) != 0 ? System.currentTimeMillis() : j2, (i2 & 128) != 0 ? 0 : i);
    }
}
