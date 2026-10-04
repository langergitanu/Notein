package com.orion.notein.data.p602db.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/UpdatePageOffSetEntity;", "", "id", "", "pageOffset", "Lcom/orion/notein/data/db/entity/PageOffSet;", "<init>", "(Ljava/lang/String;Lcom/orion/notein/data/db/entity/PageOffSet;)V", "getId", "()Ljava/lang/String;", "getPageOffset", "()Lcom/orion/notein/data/db/entity/PageOffSet;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class UpdatePageOffSetEntity {
    private final String id;
    private final PageOffSet pageOffset;

    public UpdatePageOffSetEntity(String id, PageOffSet pageOffset) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(pageOffset, "pageOffset");
        this.id = id;
        this.pageOffset = pageOffset;
    }

    public static /* synthetic */ UpdatePageOffSetEntity copy$default(UpdatePageOffSetEntity updatePageOffSetEntity, String str, PageOffSet pageOffSet, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updatePageOffSetEntity.id;
        }
        if ((i & 2) != 0) {
            pageOffSet = updatePageOffSetEntity.pageOffset;
        }
        return updatePageOffSetEntity.copy(str, pageOffSet);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PageOffSet getPageOffset() {
        return this.pageOffset;
    }

    public final UpdatePageOffSetEntity copy(String id, PageOffSet pageOffset) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(pageOffset, "pageOffset");
        return new UpdatePageOffSetEntity(id, pageOffset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdatePageOffSetEntity)) {
            return false;
        }
        UpdatePageOffSetEntity updatePageOffSetEntity = (UpdatePageOffSetEntity) other;
        return OooOOO0.OooO0O0(this.id, updatePageOffSetEntity.id) && OooOOO0.OooO0O0(this.pageOffset, updatePageOffSetEntity.pageOffset);
    }

    public final String getId() {
        return this.id;
    }

    public final PageOffSet getPageOffset() {
        return this.pageOffset;
    }

    public int hashCode() {
        return this.pageOffset.hashCode() + (this.id.hashCode() * 31);
    }

    public String toString() {
        return "UpdatePageOffSetEntity(id=" + this.id + ", pageOffset=" + this.pageOffset + ")";
    }
}
