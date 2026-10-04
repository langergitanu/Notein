package com.orion.notein.domain.models.ocr;

import OooOoo0.C20703o000000o;
import OoooooO.C21445Oooo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.facebook.soloader.OooO0OO;
import com.hihonor.honorid.core.data.TmemberRight;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 32\u00020\u0001:\u00013BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003JU\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"¨\u00064"}, m80612d2 = {"Lcom/orion/notein/domain/models/ocr/AiOcrSession;", "", "id", "", TmemberRight.TAG_USERID, NoteMeta.PROPERTY_TITLE, "pageIds", "", "inputSource", "Lcom/orion/notein/domain/models/ocr/AiOcrSessionInputSource;", C17625c.f52155b, "", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/orion/notein/domain/models/ocr/AiOcrSessionInputSource;JJ)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getUserId", "setUserId", "getTitle", "setTitle", "getPageIds", "()Ljava/util/List;", "setPageIds", "(Ljava/util/List;)V", "getInputSource", "()Lcom/orion/notein/domain/models/ocr/AiOcrSessionInputSource;", "setInputSource", "(Lcom/orion/notein/domain/models/ocr/AiOcrSessionInputSource;)V", "getCreationTime", "()J", "setCreationTime", "(J)V", "getLastModificationTime", "setLastModificationTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class AiOcrSession {
    public static final String TAG = "AiOcrSession";
    private long creationTime;
    private String id;
    private AiOcrSessionInputSource inputSource;
    private long lastModificationTime;
    private List<String> pageIds;
    private String title;
    private String userId;

    public AiOcrSession() {
        this(null, null, null, null, null, 0L, 0L, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiOcrSession copy$default(AiOcrSession aiOcrSession, String str, String str2, String str3, List list, AiOcrSessionInputSource aiOcrSessionInputSource, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aiOcrSession.id;
        }
        if ((i & 2) != 0) {
            str2 = aiOcrSession.userId;
        }
        if ((i & 4) != 0) {
            str3 = aiOcrSession.title;
        }
        if ((i & 8) != 0) {
            list = aiOcrSession.pageIds;
        }
        if ((i & 16) != 0) {
            aiOcrSessionInputSource = aiOcrSession.inputSource;
        }
        if ((i & 32) != 0) {
            j = aiOcrSession.creationTime;
        }
        if ((i & 64) != 0) {
            j2 = aiOcrSession.lastModificationTime;
        }
        long j3 = j2;
        long j4 = j;
        AiOcrSessionInputSource aiOcrSessionInputSource2 = aiOcrSessionInputSource;
        String str4 = str3;
        return aiOcrSession.copy(str, str2, str4, list, aiOcrSessionInputSource2, j4, j3);
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
    public final String getTitle() {
        return this.title;
    }

    public final List<String> component4() {
        return this.pageIds;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AiOcrSessionInputSource getInputSource() {
        return this.inputSource;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final AiOcrSession copy(String id, String userId, String title, List<String> pageIds, AiOcrSessionInputSource inputSource, long creationTime, long lastModificationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(userId, "userId");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(pageIds, "pageIds");
        OooOOO0.OooO0oO(inputSource, "inputSource");
        return new AiOcrSession(id, userId, title, pageIds, inputSource, creationTime, lastModificationTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiOcrSession)) {
            return false;
        }
        AiOcrSession aiOcrSession = (AiOcrSession) other;
        return OooOOO0.OooO0O0(this.id, aiOcrSession.id) && OooOOO0.OooO0O0(this.userId, aiOcrSession.userId) && OooOOO0.OooO0O0(this.title, aiOcrSession.title) && OooOOO0.OooO0O0(this.pageIds, aiOcrSession.pageIds) && OooOOO0.OooO0O0(this.inputSource, aiOcrSession.inputSource) && this.creationTime == aiOcrSession.creationTime && this.lastModificationTime == aiOcrSession.lastModificationTime;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final String getId() {
        return this.id;
    }

    public final AiOcrSessionInputSource getInputSource() {
        return this.inputSource;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final List<String> getPageIds() {
        return this.pageIds;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Long.hashCode(this.lastModificationTime) + C20703o000000o.OooO0O0((this.inputSource.hashCode() + C21445Oooo.OooO00o(this.pageIds, OooO00o.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.userId), 31, this.title), 31)) * 31, 31, this.creationTime);
    }

    public final void setCreationTime(long j) {
        this.creationTime = j;
    }

    public final void setId(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.id = str;
    }

    public final void setInputSource(AiOcrSessionInputSource aiOcrSessionInputSource) {
        OooOOO0.OooO0oO(aiOcrSessionInputSource, "<set-?>");
        this.inputSource = aiOcrSessionInputSource;
    }

    public final void setLastModificationTime(long j) {
        this.lastModificationTime = j;
    }

    public final void setPageIds(List<String> list) {
        OooOOO0.OooO0oO(list, "<set-?>");
        this.pageIds = list;
    }

    public final void setTitle(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.title = str;
    }

    public final void setUserId(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.userId = str;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.userId;
        String str3 = this.title;
        List<String> list = this.pageIds;
        AiOcrSessionInputSource aiOcrSessionInputSource = this.inputSource;
        long j = this.creationTime;
        long j2 = this.lastModificationTime;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("AiOcrSession(id=", str, ", userId=", str2, ", title=");
        sbOooO0O0.append(str3);
        sbOooO0O0.append(", pageIds=");
        sbOooO0O0.append(list);
        sbOooO0O0.append(", inputSource=");
        sbOooO0O0.append(aiOcrSessionInputSource);
        sbOooO0O0.append(", creationTime=");
        sbOooO0O0.append(j);
        return OooO0OO.OooO00o(j2, ", lastModificationTime=", ")", sbOooO0O0);
    }

    public AiOcrSession(String id, String userId, String title, List<String> pageIds, AiOcrSessionInputSource inputSource, long j, long j2) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(userId, "userId");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(pageIds, "pageIds");
        OooOOO0.OooO0oO(inputSource, "inputSource");
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.pageIds = pageIds;
        this.inputSource = inputSource;
        this.creationTime = j;
        this.lastModificationTime = j2;
    }

    public /* synthetic */ AiOcrSession(String str, String str2, String str3, List list, AiOcrSessionInputSource aiOcrSessionInputSource, long j, long j2, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? C34434OooOoO.f123453OooOo0o : list, (i & 16) != 0 ? AiOcrSessionInputSource.INSTANCE.getNONE() : aiOcrSessionInputSource, (i & 32) != 0 ? 0L : j, (i & 64) != 0 ? 0L : j2);
    }
}
