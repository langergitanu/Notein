package com.orion.notein.data.p602db.entity;

import OooOoO.C20509OooO0oo;
import Oooo00o.OooO0OO;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/UpdateOffsetEntity;", "", "id", "", "unboundedPageOffsetX", "", "unboundedPageOffsetY", "<init>", "(Ljava/lang/String;FF)V", "getId", "()Ljava/lang/String;", "getUnboundedPageOffsetX", "()F", "getUnboundedPageOffsetY", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class UpdateOffsetEntity {
    private final String id;
    private final float unboundedPageOffsetX;
    private final float unboundedPageOffsetY;

    public UpdateOffsetEntity(String id, float f, float f2) {
        OooOOO0.OooO0oO(id, "id");
        this.id = id;
        this.unboundedPageOffsetX = f;
        this.unboundedPageOffsetY = f2;
    }

    public static /* synthetic */ UpdateOffsetEntity copy$default(UpdateOffsetEntity updateOffsetEntity, String str, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateOffsetEntity.id;
        }
        if ((i & 2) != 0) {
            f = updateOffsetEntity.unboundedPageOffsetX;
        }
        if ((i & 4) != 0) {
            f2 = updateOffsetEntity.unboundedPageOffsetY;
        }
        return updateOffsetEntity.copy(str, f, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getUnboundedPageOffsetX() {
        return this.unboundedPageOffsetX;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getUnboundedPageOffsetY() {
        return this.unboundedPageOffsetY;
    }

    public final UpdateOffsetEntity copy(String id, float unboundedPageOffsetX, float unboundedPageOffsetY) {
        OooOOO0.OooO0oO(id, "id");
        return new UpdateOffsetEntity(id, unboundedPageOffsetX, unboundedPageOffsetY);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateOffsetEntity)) {
            return false;
        }
        UpdateOffsetEntity updateOffsetEntity = (UpdateOffsetEntity) other;
        return OooOOO0.OooO0O0(this.id, updateOffsetEntity.id) && Float.compare(this.unboundedPageOffsetX, updateOffsetEntity.unboundedPageOffsetX) == 0 && Float.compare(this.unboundedPageOffsetY, updateOffsetEntity.unboundedPageOffsetY) == 0;
    }

    public final String getId() {
        return this.id;
    }

    public final float getUnboundedPageOffsetX() {
        return this.unboundedPageOffsetX;
    }

    public final float getUnboundedPageOffsetY() {
        return this.unboundedPageOffsetY;
    }

    public int hashCode() {
        return Float.hashCode(this.unboundedPageOffsetY) + C20509OooO0oo.OooO0OO(this.unboundedPageOffsetX, this.id.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.id;
        float f = this.unboundedPageOffsetX;
        float f2 = this.unboundedPageOffsetY;
        StringBuilder sb = new StringBuilder("UpdateOffsetEntity(id=");
        sb.append(str);
        sb.append(", unboundedPageOffsetX=");
        sb.append(f);
        sb.append(", unboundedPageOffsetY=");
        return OooO0OO.OooO0OO(sb, f2, ")");
    }

    public /* synthetic */ UpdateOffsetEntity(String str, float f, float f2, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2);
    }
}
