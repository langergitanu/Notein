package com.orion.notein.data.p602db.entity;

import androidx.core.database.OooO00o;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/CommentUpdateTitleEntity;", "", "id", "", NoteMeta.PROPERTY_TITLE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class CommentUpdateTitleEntity {
    private final String id;
    private final String title;

    public CommentUpdateTitleEntity(String id, String title) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(title, "title");
        this.id = id;
        this.title = title;
    }

    public static /* synthetic */ CommentUpdateTitleEntity copy$default(CommentUpdateTitleEntity commentUpdateTitleEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commentUpdateTitleEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = commentUpdateTitleEntity.title;
        }
        return commentUpdateTitleEntity.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final CommentUpdateTitleEntity copy(String id, String title) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(title, "title");
        return new CommentUpdateTitleEntity(id, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentUpdateTitleEntity)) {
            return false;
        }
        CommentUpdateTitleEntity commentUpdateTitleEntity = (CommentUpdateTitleEntity) other;
        return OooOOO0.OooO0O0(this.id, commentUpdateTitleEntity.id) && OooOOO0.OooO0O0(this.title, commentUpdateTitleEntity.title);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + (this.id.hashCode() * 31);
    }

    public String toString() {
        return OooO00o.OooO00o("CommentUpdateTitleEntity(id=", this.id, ", title=", this.title, ")");
    }
}
