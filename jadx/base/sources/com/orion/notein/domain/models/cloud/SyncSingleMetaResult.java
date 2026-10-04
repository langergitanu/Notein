package com.orion.notein.domain.models.cloud;

import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloud/SyncSingleMetaResult;", "", "meta", "Lcom/orion/notein/domain/models/note/NoteMeta;", "syncType", "", "<init>", "(Lcom/orion/notein/domain/models/note/NoteMeta;I)V", "getMeta", "()Lcom/orion/notein/domain/models/note/NoteMeta;", "getSyncType", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class SyncSingleMetaResult {
    public static final int ALREADY_KEEP_SYNCED = 2;
    public static final int CLOUD_IS_NEWER = 1;
    public static final int LOCAL_IS_NEWER = 0;
    private final NoteMeta meta;
    private final int syncType;

    /* JADX WARN: Multi-variable type inference failed */
    public SyncSingleMetaResult() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SyncSingleMetaResult copy$default(SyncSingleMetaResult syncSingleMetaResult, NoteMeta noteMeta, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            noteMeta = syncSingleMetaResult.meta;
        }
        if ((i2 & 2) != 0) {
            i = syncSingleMetaResult.syncType;
        }
        return syncSingleMetaResult.copy(noteMeta, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NoteMeta getMeta() {
        return this.meta;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSyncType() {
        return this.syncType;
    }

    public final SyncSingleMetaResult copy(NoteMeta meta, int syncType) {
        return new SyncSingleMetaResult(meta, syncType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncSingleMetaResult)) {
            return false;
        }
        SyncSingleMetaResult syncSingleMetaResult = (SyncSingleMetaResult) other;
        return OooOOO0.OooO0O0(this.meta, syncSingleMetaResult.meta) && this.syncType == syncSingleMetaResult.syncType;
    }

    public final NoteMeta getMeta() {
        return this.meta;
    }

    public final int getSyncType() {
        return this.syncType;
    }

    public int hashCode() {
        NoteMeta noteMeta = this.meta;
        return Integer.hashCode(this.syncType) + ((noteMeta == null ? 0 : noteMeta.hashCode()) * 31);
    }

    public String toString() {
        return "SyncSingleMetaResult(meta=" + this.meta + ", syncType=" + this.syncType + ")";
    }

    public SyncSingleMetaResult(NoteMeta noteMeta, int i) {
        this.meta = noteMeta;
        this.syncType = i;
    }

    public /* synthetic */ SyncSingleMetaResult(NoteMeta noteMeta, int i, int i2, C24018OooO0oo c24018OooO0oo) {
        this((i2 & 1) != 0 ? null : noteMeta, (i2 & 2) != 0 ? 2 : i);
    }
}
