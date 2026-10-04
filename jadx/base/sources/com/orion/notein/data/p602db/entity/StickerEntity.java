package com.orion.notein.data.p602db.entity;

import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import com.aspose.slides.internal.p332p7.OooO;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/StickerEntity;", "", "id", "", NoteMeta.PROPERTY_PARENT_ID, "path", "lastUsedTime", "", "builtIn", "", "svgAspectRatio", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZF)V", "getId", "()Ljava/lang/String;", "getParentId", "getPath", "getLastUsedTime", "()J", "getBuiltIn", "()Z", "getSvgAspectRatio", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class StickerEntity {
    private final boolean builtIn;
    private final String id;
    private final long lastUsedTime;
    private final String parentId;
    private final String path;
    private final float svgAspectRatio;

    public StickerEntity(String id, String parentId, String path, long j, boolean z, float f) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(parentId, "parentId");
        OooOOO0.OooO0oO(path, "path");
        this.id = id;
        this.parentId = parentId;
        this.path = path;
        this.lastUsedTime = j;
        this.builtIn = z;
        this.svgAspectRatio = f;
    }

    public static /* synthetic */ StickerEntity copy$default(StickerEntity stickerEntity, String str, String str2, String str3, long j, boolean z, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stickerEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = stickerEntity.parentId;
        }
        if ((i & 4) != 0) {
            str3 = stickerEntity.path;
        }
        if ((i & 8) != 0) {
            j = stickerEntity.lastUsedTime;
        }
        if ((i & 16) != 0) {
            z = stickerEntity.builtIn;
        }
        if ((i & 32) != 0) {
            f = stickerEntity.svgAspectRatio;
        }
        long j2 = j;
        String str4 = str3;
        return stickerEntity.copy(str, str2, str4, j2, z, f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getLastUsedTime() {
        return this.lastUsedTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getBuiltIn() {
        return this.builtIn;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getSvgAspectRatio() {
        return this.svgAspectRatio;
    }

    public final StickerEntity copy(String id, String parentId, String path, long lastUsedTime, boolean builtIn, float svgAspectRatio) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(parentId, "parentId");
        OooOOO0.OooO0oO(path, "path");
        return new StickerEntity(id, parentId, path, lastUsedTime, builtIn, svgAspectRatio);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickerEntity)) {
            return false;
        }
        StickerEntity stickerEntity = (StickerEntity) other;
        return OooOOO0.OooO0O0(this.id, stickerEntity.id) && OooOOO0.OooO0O0(this.parentId, stickerEntity.parentId) && OooOOO0.OooO0O0(this.path, stickerEntity.path) && this.lastUsedTime == stickerEntity.lastUsedTime && this.builtIn == stickerEntity.builtIn && Float.compare(this.svgAspectRatio, stickerEntity.svgAspectRatio) == 0;
    }

    public final boolean getBuiltIn() {
        return this.builtIn;
    }

    public final String getId() {
        return this.id;
    }

    public final long getLastUsedTime() {
        return this.lastUsedTime;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getPath() {
        return this.path;
    }

    public final float getSvgAspectRatio() {
        return this.svgAspectRatio;
    }

    public int hashCode() {
        return Float.hashCode(this.svgAspectRatio) + o00000.OooO0O0(C20703o000000o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.parentId), 31, this.path), 31, this.lastUsedTime), 31, this.builtIn);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.parentId;
        String str3 = this.path;
        long j = this.lastUsedTime;
        boolean z = this.builtIn;
        float f = this.svgAspectRatio;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("StickerEntity(id=", str, ", parentId=", str2, ", path=");
        OooO.OooO00o(j, str3, ", lastUsedTime=", sbOooO0O0);
        sbOooO0O0.append(", builtIn=");
        sbOooO0O0.append(z);
        sbOooO0O0.append(", svgAspectRatio=");
        sbOooO0O0.append(f);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    public /* synthetic */ StickerEntity(String str, String str2, String str3, long j, boolean z, float f, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, str3, j, (i & 16) != 0 ? false : z, (i & 32) != 0 ? 1.0f : f);
    }
}
