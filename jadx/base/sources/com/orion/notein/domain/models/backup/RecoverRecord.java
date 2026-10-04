package com.orion.notein.domain.models.backup;

import OooOooo.C20785Oooo00o;
import android.os.Bundle;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.huawei.hms.network.embedded.C18437z2;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m80612d2 = {"Lcom/orion/notein/domain/models/backup/RecoverRecord;", "", "id", "", "originId", C18437z2.f56754h, "", "extra", "Landroid/os/Bundle;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILandroid/os/Bundle;)V", "getId", "()Ljava/lang/String;", "getOriginId", "getType", "()I", "getExtra", "()Landroid/os/Bundle;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class RecoverRecord {
    public static final int RECORD_TYPE_FOLDER = 0;
    public static final int RECORD_TYPE_NOTE = 1;
    private final Bundle extra;
    private final String id;
    private final String originId;
    private final int type;

    public RecoverRecord(String id, String originId, int i, Bundle bundle) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(originId, "originId");
        this.id = id;
        this.originId = originId;
        this.type = i;
        this.extra = bundle;
    }

    public static /* synthetic */ RecoverRecord copy$default(RecoverRecord recoverRecord, String str, String str2, int i, Bundle bundle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = recoverRecord.id;
        }
        if ((i2 & 2) != 0) {
            str2 = recoverRecord.originId;
        }
        if ((i2 & 4) != 0) {
            i = recoverRecord.type;
        }
        if ((i2 & 8) != 0) {
            bundle = recoverRecord.extra;
        }
        return recoverRecord.copy(str, str2, i, bundle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOriginId() {
        return this.originId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Bundle getExtra() {
        return this.extra;
    }

    public final RecoverRecord copy(String id, String originId, int type, Bundle extra) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(originId, "originId");
        return new RecoverRecord(id, originId, type, extra);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecoverRecord)) {
            return false;
        }
        RecoverRecord recoverRecord = (RecoverRecord) other;
        return OooOOO0.OooO0O0(this.id, recoverRecord.id) && OooOOO0.OooO0O0(this.originId, recoverRecord.originId) && this.type == recoverRecord.type && OooOOO0.OooO0O0(this.extra, recoverRecord.extra);
    }

    public final Bundle getExtra() {
        return this.extra;
    }

    public final String getId() {
        return this.id;
    }

    public final String getOriginId() {
        return this.originId;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iOooO00o = C20785Oooo00o.OooO00o(this.type, OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.originId), 31);
        Bundle bundle = this.extra;
        return iOooO00o + (bundle == null ? 0 : bundle.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.originId;
        int i = this.type;
        Bundle bundle = this.extra;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("RecoverRecord(id=", str, ", originId=", str2, ", type=");
        sbOooO0O0.append(i);
        sbOooO0O0.append(", extra=");
        sbOooO0O0.append(bundle);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    public /* synthetic */ RecoverRecord(String str, String str2, int i, Bundle bundle, int i2, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, i, (i2 & 8) != 0 ? null : bundle);
    }
}
