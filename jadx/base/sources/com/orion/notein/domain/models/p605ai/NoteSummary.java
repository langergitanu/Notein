package com.orion.notein.domain.models.p605ai;

import androidx.core.database.OooO00o;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m80612d2 = {"Lcom/orion/notein/domain/models/ai/NoteSummary;", "", "id", "", "summary", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getSummary", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteSummary {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final NoteSummary NONE = new NoteSummary("", "");
    private final String id;
    private final String summary;

    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/domain/models/ai/NoteSummary$Companion;", "", "<init>", "()V", "NONE", "Lcom/orion/notein/domain/models/ai/NoteSummary;", "getNONE", "()Lcom/orion/notein/domain/models/ai/NoteSummary;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final NoteSummary getNONE() {
            return NoteSummary.NONE;
        }

        private Companion() {
        }
    }

    public NoteSummary(String id, String summary) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(summary, "summary");
        this.id = id;
        this.summary = summary;
    }

    public static /* synthetic */ NoteSummary copy$default(NoteSummary noteSummary, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = noteSummary.id;
        }
        if ((i & 2) != 0) {
            str2 = noteSummary.summary;
        }
        return noteSummary.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    public final NoteSummary copy(String id, String summary) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(summary, "summary");
        return new NoteSummary(id, summary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteSummary)) {
            return false;
        }
        NoteSummary noteSummary = (NoteSummary) other;
        return OooOOO0.OooO0O0(this.id, noteSummary.id) && OooOOO0.OooO0O0(this.summary, noteSummary.summary);
    }

    public final String getId() {
        return this.id;
    }

    public final String getSummary() {
        return this.summary;
    }

    public int hashCode() {
        return this.summary.hashCode() + (this.id.hashCode() * 31);
    }

    public String toString() {
        return OooO00o.OooO00o("NoteSummary(id=", this.id, ", summary=", this.summary, ")");
    }
}
