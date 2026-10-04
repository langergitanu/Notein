package com.orion.notein.data.p602db.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/UpdateZoomEntity;", "", "id", "", "zoom", "", "<init>", "(Ljava/lang/String;F)V", "getId", "()Ljava/lang/String;", "getZoom", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class UpdateZoomEntity {
    private final String id;
    private final float zoom;

    public UpdateZoomEntity(String id, float f) {
        OooOOO0.OooO0oO(id, "id");
        this.id = id;
        this.zoom = f;
    }

    public static /* synthetic */ UpdateZoomEntity copy$default(UpdateZoomEntity updateZoomEntity, String str, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateZoomEntity.id;
        }
        if ((i & 2) != 0) {
            f = updateZoomEntity.zoom;
        }
        return updateZoomEntity.copy(str, f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getZoom() {
        return this.zoom;
    }

    public final UpdateZoomEntity copy(String id, float zoom) {
        OooOOO0.OooO0oO(id, "id");
        return new UpdateZoomEntity(id, zoom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateZoomEntity)) {
            return false;
        }
        UpdateZoomEntity updateZoomEntity = (UpdateZoomEntity) other;
        return OooOOO0.OooO0O0(this.id, updateZoomEntity.id) && Float.compare(this.zoom, updateZoomEntity.zoom) == 0;
    }

    public final String getId() {
        return this.id;
    }

    public final float getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        return Float.hashCode(this.zoom) + (this.id.hashCode() * 31);
    }

    public String toString() {
        return "UpdateZoomEntity(id=" + this.id + ", zoom=" + this.zoom + ")";
    }

    public /* synthetic */ UpdateZoomEntity(String str, float f, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, (i & 2) != 0 ? 1.0f : f);
    }
}
