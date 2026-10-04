package com.orion.notein.data.p602db.entity.old;

import androidx.concurrent.futures.OooO00o;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.orion.notein.domain.models.note.NoteMeta;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\f\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH\u0007J\u001a\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/old/PageConverter;", "", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "childrenToString", "", "pageIdList", "", "stringToChildren", "json", "PageLastModificationEntity", "PagePaddingEntity", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PageConverter {
    private final Gson gson = new Gson();

    @Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/old/PageConverter$PageLastModificationEntity;", "", "id", "", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "", "<init>", "(Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getLastModificationTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class PageLastModificationEntity {
        private final String id;
        private final long lastModificationTime;

        public PageLastModificationEntity(String id, long j) {
            OooOOO0.OooO0oO(id, "id");
            this.id = id;
            this.lastModificationTime = j;
        }

        public static /* synthetic */ PageLastModificationEntity copy$default(PageLastModificationEntity pageLastModificationEntity, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pageLastModificationEntity.id;
            }
            if ((i & 2) != 0) {
                j = pageLastModificationEntity.lastModificationTime;
            }
            return pageLastModificationEntity.copy(str, j);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getLastModificationTime() {
            return this.lastModificationTime;
        }

        public final PageLastModificationEntity copy(String id, long lastModificationTime) {
            OooOOO0.OooO0oO(id, "id");
            return new PageLastModificationEntity(id, lastModificationTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageLastModificationEntity)) {
                return false;
            }
            PageLastModificationEntity pageLastModificationEntity = (PageLastModificationEntity) other;
            return OooOOO0.OooO0O0(this.id, pageLastModificationEntity.id) && this.lastModificationTime == pageLastModificationEntity.lastModificationTime;
        }

        public final String getId() {
            return this.id;
        }

        public final long getLastModificationTime() {
            return this.lastModificationTime;
        }

        public int hashCode() {
            return Long.hashCode(this.lastModificationTime) + (this.id.hashCode() * 31);
        }

        public String toString() {
            return "PageLastModificationEntity(id=" + this.id + ", lastModificationTime=" + this.lastModificationTime + ")";
        }
    }

    public final String childrenToString(List<String> pageIdList) {
        if (pageIdList != null) {
            return this.gson.toJson(pageIdList);
        }
        return null;
    }

    public final List<String> stringToChildren(String json) {
        if (json == null) {
            return null;
        }
        Type type = new TypeToken<List<? extends String>>() { // from class: com.orion.notein.data.db.entity.old.PageConverter$stringToChildren$1$listType$1
        }.getType();
        OooOOO0.OooO0o(type, "getType(...)");
        return (List) this.gson.fromJson(json, type);
    }

    @Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\t\"\u0004\b\u000b\u0010\fR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/old/PageConverter$PagePaddingEntity;", "", "id", "", "paperSpecJson", "paperPaddingJson", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPaperSpecJson", "setPaperSpecJson", "(Ljava/lang/String;)V", "getPaperPaddingJson", "setPaperPaddingJson", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class PagePaddingEntity {
        private final String id;
        private String paperPaddingJson;
        private String paperSpecJson;

        public PagePaddingEntity(String id, String str, String str2) {
            OooOOO0.OooO0oO(id, "id");
            this.id = id;
            this.paperSpecJson = str;
            this.paperPaddingJson = str2;
        }

        public static /* synthetic */ PagePaddingEntity copy$default(PagePaddingEntity pagePaddingEntity, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pagePaddingEntity.id;
            }
            if ((i & 2) != 0) {
                str2 = pagePaddingEntity.paperSpecJson;
            }
            if ((i & 4) != 0) {
                str3 = pagePaddingEntity.paperPaddingJson;
            }
            return pagePaddingEntity.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPaperSpecJson() {
            return this.paperSpecJson;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getPaperPaddingJson() {
            return this.paperPaddingJson;
        }

        public final PagePaddingEntity copy(String id, String paperSpecJson, String paperPaddingJson) {
            OooOOO0.OooO0oO(id, "id");
            return new PagePaddingEntity(id, paperSpecJson, paperPaddingJson);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PagePaddingEntity)) {
                return false;
            }
            PagePaddingEntity pagePaddingEntity = (PagePaddingEntity) other;
            return OooOOO0.OooO0O0(this.id, pagePaddingEntity.id) && OooOOO0.OooO0O0(this.paperSpecJson, pagePaddingEntity.paperSpecJson) && OooOOO0.OooO0O0(this.paperPaddingJson, pagePaddingEntity.paperPaddingJson);
        }

        public final String getId() {
            return this.id;
        }

        public final String getPaperPaddingJson() {
            return this.paperPaddingJson;
        }

        public final String getPaperSpecJson() {
            return this.paperSpecJson;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.paperSpecJson;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.paperPaddingJson;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final void setPaperPaddingJson(String str) {
            this.paperPaddingJson = str;
        }

        public final void setPaperSpecJson(String str) {
            this.paperSpecJson = str;
        }

        public String toString() {
            String str = this.id;
            String str2 = this.paperSpecJson;
            return OooO00o.OooO0OO(OooO0o.OooO0O0("PagePaddingEntity(id=", str, ", paperSpecJson=", str2, ", paperPaddingJson="), this.paperPaddingJson, ")");
        }

        public /* synthetic */ PagePaddingEntity(String str, String str2, String str3, int i, C24018OooO0oo c24018OooO0oo) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }
}
