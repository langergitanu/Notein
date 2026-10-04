package com.orion.notein.data.p602db.entity;

import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import Oooo0oO.C21036OooOOo0;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.facebook.soloader.OooO0OO;
import com.huawei.agconnect.credential.obs.C17625c;
import com.huawei.hms.network.embedded.C18437z2;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, m80612d2 = {"Lcom/orion/notein/data/db/entity/QuoteTextAnnoEntity;", "", "id", "", "username", C18437z2.f56754h, "", "text", C17625c.f52155b, "", "lastModifiedTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JJ)V", "getId", "()Ljava/lang/String;", "getUsername", "getType", "()I", "getText", "getCreationTime", "()J", "getLastModifiedTime", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class QuoteTextAnnoEntity {
    private final long creationTime;
    private final String id;
    private final long lastModifiedTime;
    private final String text;
    private final int type;
    private final String username;

    public QuoteTextAnnoEntity(String id, String username, int i, String text, long j, long j2) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(username, "username");
        OooOOO0.OooO0oO(text, "text");
        this.id = id;
        this.username = username;
        this.type = i;
        this.text = text;
        this.creationTime = j;
        this.lastModifiedTime = j2;
    }

    public static /* synthetic */ QuoteTextAnnoEntity copy$default(QuoteTextAnnoEntity quoteTextAnnoEntity, String str, String str2, int i, String str3, long j, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = quoteTextAnnoEntity.id;
        }
        if ((i2 & 2) != 0) {
            str2 = quoteTextAnnoEntity.username;
        }
        if ((i2 & 4) != 0) {
            i = quoteTextAnnoEntity.type;
        }
        if ((i2 & 8) != 0) {
            str3 = quoteTextAnnoEntity.text;
        }
        if ((i2 & 16) != 0) {
            j = quoteTextAnnoEntity.creationTime;
        }
        if ((i2 & 32) != 0) {
            j2 = quoteTextAnnoEntity.lastModifiedTime;
        }
        long j3 = j2;
        long j4 = j;
        return quoteTextAnnoEntity.copy(str, str2, i, str3, j4, j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public final QuoteTextAnnoEntity copy(String id, String username, int type, String text, long creationTime, long lastModifiedTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(username, "username");
        OooOOO0.OooO0oO(text, "text");
        return new QuoteTextAnnoEntity(id, username, type, text, creationTime, lastModifiedTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuoteTextAnnoEntity)) {
            return false;
        }
        QuoteTextAnnoEntity quoteTextAnnoEntity = (QuoteTextAnnoEntity) other;
        return OooOOO0.OooO0O0(this.id, quoteTextAnnoEntity.id) && OooOOO0.OooO0O0(this.username, quoteTextAnnoEntity.username) && this.type == quoteTextAnnoEntity.type && OooOOO0.OooO0O0(this.text, quoteTextAnnoEntity.text) && this.creationTime == quoteTextAnnoEntity.creationTime && this.lastModifiedTime == quoteTextAnnoEntity.lastModifiedTime;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final String getId() {
        return this.id;
    }

    public final long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public final String getText() {
        return this.text;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return Long.hashCode(this.lastModifiedTime) + C20703o000000o.OooO0O0(OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.type, OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.username), 31), 31, this.text), 31, this.creationTime);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.username;
        int i = this.type;
        String str3 = this.text;
        long j = this.creationTime;
        long j2 = this.lastModifiedTime;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("QuoteTextAnnoEntity(id=", str, ", username=", str2, ", type=");
        C21036OooOOo0.OooO0Oo(i, ", text=", str3, ", creationTime=", sbOooO0O0);
        sbOooO0O0.append(j);
        return OooO0OO.OooO00o(j2, ", lastModifiedTime=", ")", sbOooO0O0);
    }

    public /* synthetic */ QuoteTextAnnoEntity(String str, String str2, int i, String str3, long j, long j2, int i2, C24018OooO0oo c24018OooO0oo) {
        this((i2 & 1) != 0 ? "" : str, str2, i, str3, j, j2);
    }
}
