package com.orion.notein.domain.models.page;

import OooOooo.C20785Oooo00o;
import Oooo0oO.C21036OooOOo0;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.huawei.agconnect.credential.obs.C17625c;
import com.huawei.hms.network.embedded.C18437z2;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m80612d2 = {"Lcom/orion/notein/domain/models/page/QuoteTextAnno;", "", "id", "", "username", C18437z2.f56754h, "", "text", C17625c.f52155b, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getUsername", "getType", "()I", "getText", "getCreationTime", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class QuoteTextAnno {
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_REPLY = 1;
    private final long creationTime;
    private final String id;
    private final String text;
    private final int type;
    private final String username;

    public QuoteTextAnno(String id, String username, int i, String text, long j) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(username, "username");
        OooOOO0.OooO0oO(text, "text");
        this.id = id;
        this.username = username;
        this.type = i;
        this.text = text;
        this.creationTime = j;
    }

    public static /* synthetic */ QuoteTextAnno copy$default(QuoteTextAnno quoteTextAnno, String str, String str2, int i, String str3, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = quoteTextAnno.id;
        }
        if ((i2 & 2) != 0) {
            str2 = quoteTextAnno.username;
        }
        if ((i2 & 4) != 0) {
            i = quoteTextAnno.type;
        }
        if ((i2 & 8) != 0) {
            str3 = quoteTextAnno.text;
        }
        if ((i2 & 16) != 0) {
            j = quoteTextAnno.creationTime;
        }
        long j2 = j;
        return quoteTextAnno.copy(str, str2, i, str3, j2);
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

    public final QuoteTextAnno copy(String id, String username, int type, String text, long creationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(username, "username");
        OooOOO0.OooO0oO(text, "text");
        return new QuoteTextAnno(id, username, type, text, creationTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuoteTextAnno)) {
            return false;
        }
        QuoteTextAnno quoteTextAnno = (QuoteTextAnno) other;
        return OooOOO0.OooO0O0(this.id, quoteTextAnno.id) && OooOOO0.OooO0O0(this.username, quoteTextAnno.username) && this.type == quoteTextAnno.type && OooOOO0.OooO0O0(this.text, quoteTextAnno.text) && this.creationTime == quoteTextAnno.creationTime;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final String getId() {
        return this.id;
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
        return Long.hashCode(this.creationTime) + OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.type, OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.username), 31), 31, this.text);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.username;
        int i = this.type;
        String str3 = this.text;
        long j = this.creationTime;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("QuoteTextAnno(id=", str, ", username=", str2, ", type=");
        C21036OooOOo0.OooO0Oo(i, ", text=", str3, ", creationTime=", sbOooO0O0);
        return android.support.v4.media.session.OooO00o.OooO00o(j, ")", sbOooO0O0);
    }
}
