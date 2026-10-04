package com.orion.notein.data.p602db.entity;

import OooOoo0.o00000;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.huawei.hms.network.embedded.C18437z2;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/UploadRecordEntity;", "", "md5", "", C18437z2.f56754h, "uploaded", "", "indexed", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getMd5", "()Ljava/lang/String;", "getType", "getUploaded", "()Z", "getIndexed", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class UploadRecordEntity {
    private final boolean indexed;
    private final String md5;
    private final String type;
    private final boolean uploaded;

    public UploadRecordEntity(String md5, String type, boolean z, boolean z2) {
        OooOOO0.OooO0oO(md5, "md5");
        OooOOO0.OooO0oO(type, "type");
        this.md5 = md5;
        this.type = type;
        this.uploaded = z;
        this.indexed = z2;
    }

    public static /* synthetic */ UploadRecordEntity copy$default(UploadRecordEntity uploadRecordEntity, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadRecordEntity.md5;
        }
        if ((i & 2) != 0) {
            str2 = uploadRecordEntity.type;
        }
        if ((i & 4) != 0) {
            z = uploadRecordEntity.uploaded;
        }
        if ((i & 8) != 0) {
            z2 = uploadRecordEntity.indexed;
        }
        return uploadRecordEntity.copy(str, str2, z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getUploaded() {
        return this.uploaded;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIndexed() {
        return this.indexed;
    }

    public final UploadRecordEntity copy(String md5, String type, boolean uploaded, boolean indexed) {
        OooOOO0.OooO0oO(md5, "md5");
        OooOOO0.OooO0oO(type, "type");
        return new UploadRecordEntity(md5, type, uploaded, indexed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadRecordEntity)) {
            return false;
        }
        UploadRecordEntity uploadRecordEntity = (UploadRecordEntity) other;
        return OooOOO0.OooO0O0(this.md5, uploadRecordEntity.md5) && OooOOO0.OooO0O0(this.type, uploadRecordEntity.type) && this.uploaded == uploadRecordEntity.uploaded && this.indexed == uploadRecordEntity.indexed;
    }

    public final boolean getIndexed() {
        return this.indexed;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getType() {
        return this.type;
    }

    public final boolean getUploaded() {
        return this.uploaded;
    }

    public int hashCode() {
        return Boolean.hashCode(this.indexed) + o00000.OooO0O0(OooO00o.OooO0O0(this.md5.hashCode() * 31, 31, this.type), 31, this.uploaded);
    }

    public String toString() {
        String str = this.md5;
        String str2 = this.type;
        boolean z = this.uploaded;
        boolean z2 = this.indexed;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("UploadRecordEntity(md5=", str, ", type=", str2, ", uploaded=");
        sbOooO0O0.append(z);
        sbOooO0O0.append(", indexed=");
        sbOooO0O0.append(z2);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }
}
