package com.orion.notein.domain.models.ocr;

import OooOO0.OooO0OO;
import OooOo.C20485OooOoO;
import OooOoOO.C20519OooO0Oo;
import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import android.os.Bundle;
import androidx.ink.geometry.OooOO0;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0oo000O.C31185OooO0OO;
import oO00ooO.InterfaceC32440OooOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 32\u00020\u0001:\u00013BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JV\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0012J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0016R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b*\u0010\u0016R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010\u0019R%\u0010/\u001a\u0010\u0012\f\u0012\n .*\u0004\u0018\u00010\u00020\u00020-8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, m80612d2 = {"Lcom/orion/notein/domain/models/ocr/AiOcrTextPage;", "", "", "id", "", "sourceType", "sourceUri", FirebaseAnalytics.Param.CONTENT, "", C17625c.f52155b, NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "Landroid/os/Bundle;", "extras", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "()J", "component6", "component7", "()Landroid/os/Bundle;", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)Lcom/orion/notein/domain/models/ocr/AiOcrTextPage;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "I", "getSourceType", "getSourceUri", "getContent", "J", "getCreationTime", "getLastModificationTime", "Landroid/os/Bundle;", "getExtras", "LoO00ooO/OooOO0;", "kotlin.jvm.PlatformType", "contentMd5", "LoO00ooO/OooOO0;", "getContentMd5", "()LoO00ooO/OooOO0;", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class AiOcrTextPage {
    public static final String TAG = "AiOcrTextPage";
    private final String content;
    private final InterfaceC32440OooOO0<String> contentMd5;
    private final long creationTime;
    private final Bundle extras;
    private final String id;
    private final long lastModificationTime;
    private final int sourceType;
    private final String sourceUri;

    public AiOcrTextPage(String id, int i, String sourceUri, String content, long j, long j2, Bundle extras) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(sourceUri, "sourceUri");
        OooOOO0.OooO0oO(content, "content");
        OooOOO0.OooO0oO(extras, "extras");
        this.id = id;
        this.sourceType = i;
        this.sourceUri = sourceUri;
        this.content = content;
        this.creationTime = j;
        this.lastModificationTime = j2;
        this.extras = extras;
        this.contentMd5 = C20519OooO0Oo.OooO0OO(new OooOO0(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String contentMd5$lambda$0(AiOcrTextPage aiOcrTextPage) {
        return C31185OooO0OO.OooO00o(aiOcrTextPage.content);
    }

    public static /* synthetic */ AiOcrTextPage copy$default(AiOcrTextPage aiOcrTextPage, String str, int i, String str2, String str3, long j, long j2, Bundle bundle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aiOcrTextPage.id;
        }
        if ((i2 & 2) != 0) {
            i = aiOcrTextPage.sourceType;
        }
        if ((i2 & 4) != 0) {
            str2 = aiOcrTextPage.sourceUri;
        }
        if ((i2 & 8) != 0) {
            str3 = aiOcrTextPage.content;
        }
        if ((i2 & 16) != 0) {
            j = aiOcrTextPage.creationTime;
        }
        if ((i2 & 32) != 0) {
            j2 = aiOcrTextPage.lastModificationTime;
        }
        if ((i2 & 64) != 0) {
            bundle = aiOcrTextPage.extras;
        }
        Bundle bundle2 = bundle;
        long j3 = j2;
        long j4 = j;
        return aiOcrTextPage.copy(str, i, str2, str3, j4, j3, bundle2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSourceType() {
        return this.sourceType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSourceUri() {
        return this.sourceUri;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Bundle getExtras() {
        return this.extras;
    }

    public final AiOcrTextPage copy(String id, int sourceType, String sourceUri, String content, long creationTime, long lastModificationTime, Bundle extras) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(sourceUri, "sourceUri");
        OooOOO0.OooO0oO(content, "content");
        OooOOO0.OooO0oO(extras, "extras");
        return new AiOcrTextPage(id, sourceType, sourceUri, content, creationTime, lastModificationTime, extras);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiOcrTextPage)) {
            return false;
        }
        AiOcrTextPage aiOcrTextPage = (AiOcrTextPage) other;
        return OooOOO0.OooO0O0(this.id, aiOcrTextPage.id) && this.sourceType == aiOcrTextPage.sourceType && OooOOO0.OooO0O0(this.sourceUri, aiOcrTextPage.sourceUri) && OooOOO0.OooO0O0(this.content, aiOcrTextPage.content) && this.creationTime == aiOcrTextPage.creationTime && this.lastModificationTime == aiOcrTextPage.lastModificationTime && OooOOO0.OooO0O0(this.extras, aiOcrTextPage.extras);
    }

    public final String getContent() {
        return this.content;
    }

    public final InterfaceC32440OooOO0<String> getContentMd5() {
        return this.contentMd5;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    public final String getId() {
        return this.id;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final int getSourceType() {
        return this.sourceType;
    }

    public final String getSourceUri() {
        return this.sourceUri;
    }

    public int hashCode() {
        return this.extras.hashCode() + C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.sourceType, this.id.hashCode() * 31, 31), 31, this.sourceUri), 31, this.content), 31, this.creationTime), 31, this.lastModificationTime);
    }

    public String toString() {
        String str = this.id;
        int i = this.sourceType;
        String str2 = this.sourceUri;
        String str3 = this.content;
        long j = this.creationTime;
        long j2 = this.lastModificationTime;
        Bundle bundle = this.extras;
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "AiOcrTextPage(id=", str, ", sourceType=", ", sourceUri=");
        OooO0OO.OooO0o0(sbOooO0OO, str2, ", content=", str3, ", creationTime=");
        sbOooO0OO.append(j);
        C22205OooOOo.OooO0OO(j2, ", lastModificationTime=", ", extras=", sbOooO0OO);
        sbOooO0OO.append(bundle);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }

    public /* synthetic */ AiOcrTextPage(String str, int i, String str2, String str3, long j, long j2, Bundle bundle, int i2, C24018OooO0oo c24018OooO0oo) {
        this((i2 & 1) != 0 ? "" : str, i, str2, str3, (i2 & 16) != 0 ? 0L : j, (i2 & 32) != 0 ? 0L : j2, (i2 & 64) != 0 ? new Bundle() : bundle);
    }
}
