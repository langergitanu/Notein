package com.orion.notein.domain.models.message;

import OooOO0.OooO0O0;
import OooOooo.C20785Oooo00o;
import Oooo0oO.C21023OooO0Oo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.agconnect.credential.obs.C17625c;
import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.orion.notein.domain.models.note.NoteMeta;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0001+BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010\u001dJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u0015\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003Ji\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\nHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006,"}, m80612d2 = {"Lcom/orion/notein/domain/models/message/NoteinMessage;", "", "id", "", CommonConstant.KEY_UID, NoteMeta.PROPERTY_TITLE, "", FirebaseAnalytics.Param.CONTENT, C17625c.f52155b, C18437z2.f56754h, "", "unread", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;II)V", "getId", "()Ljava/lang/String;", "getUid", "getTitle", "()Ljava/util/Map;", "getContent", "getCreationTime", "getType", "()I", "getUnread", "getCreationTimeMillis", "", "()Ljava/lang/Long;", "convertToMillis", "dateStr", "(Ljava/lang/String;)Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteinMessage {
    public static final int MSG_TYPE_BROADCAST = 0;
    public static final int MSG_TYPE_PERSONAL = 1;
    public static final int STATE_READ = 0;
    public static final int STATE_UNREAD = 1;
    private final Map<String, String> content;
    private final String creationTime;
    private final String id;
    private final Map<String, String> title;
    private final int type;
    private final String uid;
    private final int unread;

    public NoteinMessage(String id, String str, Map<String, String> title, Map<String, String> content, String creationTime, int i, int i2) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(content, "content");
        OooOOO0.OooO0oO(creationTime, "creationTime");
        this.id = id;
        this.uid = str;
        this.title = title;
        this.content = content;
        this.creationTime = creationTime;
        this.type = i;
        this.unread = i2;
    }

    private final Long convertToMillis(String dateStr) throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.CHINA).parse(dateStr);
        if (date == null) {
            return null;
        }
        return Long.valueOf(date.getTime());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NoteinMessage copy$default(NoteinMessage noteinMessage, String str, String str2, Map map, Map map2, String str3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = noteinMessage.id;
        }
        if ((i3 & 2) != 0) {
            str2 = noteinMessage.uid;
        }
        if ((i3 & 4) != 0) {
            map = noteinMessage.title;
        }
        if ((i3 & 8) != 0) {
            map2 = noteinMessage.content;
        }
        if ((i3 & 16) != 0) {
            str3 = noteinMessage.creationTime;
        }
        if ((i3 & 32) != 0) {
            i = noteinMessage.type;
        }
        if ((i3 & 64) != 0) {
            i2 = noteinMessage.unread;
        }
        int i4 = i;
        int i5 = i2;
        String str4 = str3;
        Map map3 = map;
        return noteinMessage.copy(str, str2, map3, map2, str4, i4, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    public final Map<String, String> component3() {
        return this.title;
    }

    public final Map<String, String> component4() {
        return this.content;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getUnread() {
        return this.unread;
    }

    public final NoteinMessage copy(String id, String uid, Map<String, String> title, Map<String, String> content, String creationTime, int type, int unread) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(content, "content");
        OooOOO0.OooO0oO(creationTime, "creationTime");
        return new NoteinMessage(id, uid, title, content, creationTime, type, unread);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteinMessage)) {
            return false;
        }
        NoteinMessage noteinMessage = (NoteinMessage) other;
        return OooOOO0.OooO0O0(this.id, noteinMessage.id) && OooOOO0.OooO0O0(this.uid, noteinMessage.uid) && OooOOO0.OooO0O0(this.title, noteinMessage.title) && OooOOO0.OooO0O0(this.content, noteinMessage.content) && OooOOO0.OooO0O0(this.creationTime, noteinMessage.creationTime) && this.type == noteinMessage.type && this.unread == noteinMessage.unread;
    }

    public final Map<String, String> getContent() {
        return this.content;
    }

    public final String getCreationTime() {
        return this.creationTime;
    }

    public final Long getCreationTimeMillis() {
        return convertToMillis(this.creationTime);
    }

    public final String getId() {
        return this.id;
    }

    public final Map<String, String> getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUid() {
        return this.uid;
    }

    public final int getUnread() {
        return this.unread;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.uid;
        return Integer.hashCode(this.unread) + C20785Oooo00o.OooO00o(this.type, OooO00o.OooO0O0((this.content.hashCode() + ((this.title.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.creationTime), 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.uid;
        Map<String, String> map = this.title;
        Map<String, String> map2 = this.content;
        String str3 = this.creationTime;
        int i = this.type;
        int i2 = this.unread;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("NoteinMessage(id=", str, ", uid=", str2, ", title=");
        sbOooO0O0.append(map);
        sbOooO0O0.append(", content=");
        sbOooO0O0.append(map2);
        sbOooO0O0.append(", creationTime=");
        OooO0O0.OooO0Oo(i, str3, ", type=", ", unread=", sbOooO0O0);
        return C21023OooO0Oo.OooO0OO(")", i2, sbOooO0O0);
    }
}
