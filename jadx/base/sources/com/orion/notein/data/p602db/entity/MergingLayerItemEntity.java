package com.orion.notein.data.p602db.entity;

import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.huawei.agconnect.credential.obs.C17625c;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/MergingLayerItemEntity;", "", "id", "", "layerId", C17625c.f52155b, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getLayerId", "getCreationTime", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class MergingLayerItemEntity {
    private final long creationTime;
    private final String id;
    private final String layerId;

    public MergingLayerItemEntity(String id, String layerId, long j) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(layerId, "layerId");
        this.id = id;
        this.layerId = layerId;
        this.creationTime = j;
    }

    public static /* synthetic */ MergingLayerItemEntity copy$default(MergingLayerItemEntity mergingLayerItemEntity, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mergingLayerItemEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = mergingLayerItemEntity.layerId;
        }
        if ((i & 4) != 0) {
            j = mergingLayerItemEntity.creationTime;
        }
        return mergingLayerItemEntity.copy(str, str2, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLayerId() {
        return this.layerId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    public final MergingLayerItemEntity copy(String id, String layerId, long creationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(layerId, "layerId");
        return new MergingLayerItemEntity(id, layerId, creationTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MergingLayerItemEntity)) {
            return false;
        }
        MergingLayerItemEntity mergingLayerItemEntity = (MergingLayerItemEntity) other;
        return OooOOO0.OooO0O0(this.id, mergingLayerItemEntity.id) && OooOOO0.OooO0O0(this.layerId, mergingLayerItemEntity.layerId) && this.creationTime == mergingLayerItemEntity.creationTime;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLayerId() {
        return this.layerId;
    }

    public int hashCode() {
        return Long.hashCode(this.creationTime) + OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.layerId);
    }

    public String toString() {
        return android.support.v4.media.session.OooO00o.OooO00o(this.creationTime, ")", OooO0o.OooO0O0("MergingLayerItemEntity(id=", this.id, ", layerId=", this.layerId, ", creationTime="));
    }
}
