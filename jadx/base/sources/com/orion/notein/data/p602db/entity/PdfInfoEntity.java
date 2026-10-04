package com.orion.notein.data.p602db.entity;

import OoooooO.C21445Oooo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/PdfInfoEntity;", "", "id", "", "pdfPath", "tnPath", "password", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPdfPath", "getTnPath", "getPassword", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PdfInfoEntity {
    private final String id;
    private final String password;
    private final String pdfPath;
    private final String tnPath;

    public PdfInfoEntity(String id, String pdfPath, String tnPath, String str) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(pdfPath, "pdfPath");
        OooOOO0.OooO0oO(tnPath, "tnPath");
        this.id = id;
        this.pdfPath = pdfPath;
        this.tnPath = tnPath;
        this.password = str;
    }

    public static /* synthetic */ PdfInfoEntity copy$default(PdfInfoEntity pdfInfoEntity, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pdfInfoEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = pdfInfoEntity.pdfPath;
        }
        if ((i & 4) != 0) {
            str3 = pdfInfoEntity.tnPath;
        }
        if ((i & 8) != 0) {
            str4 = pdfInfoEntity.password;
        }
        return pdfInfoEntity.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPdfPath() {
        return this.pdfPath;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTnPath() {
        return this.tnPath;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    public final PdfInfoEntity copy(String id, String pdfPath, String tnPath, String password) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(pdfPath, "pdfPath");
        OooOOO0.OooO0oO(tnPath, "tnPath");
        return new PdfInfoEntity(id, pdfPath, tnPath, password);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdfInfoEntity)) {
            return false;
        }
        PdfInfoEntity pdfInfoEntity = (PdfInfoEntity) other;
        return OooOOO0.OooO0O0(this.id, pdfInfoEntity.id) && OooOOO0.OooO0O0(this.pdfPath, pdfInfoEntity.pdfPath) && OooOOO0.OooO0O0(this.tnPath, pdfInfoEntity.tnPath) && OooOOO0.OooO0O0(this.password, pdfInfoEntity.password);
    }

    public final String getId() {
        return this.id;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPdfPath() {
        return this.pdfPath;
    }

    public final String getTnPath() {
        return this.tnPath;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.pdfPath), 31, this.tnPath);
        String str = this.password;
        return iOooO0O0 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.pdfPath;
        return C21445Oooo.OooO0O0(OooO0o.OooO0O0("PdfInfoEntity(id=", str, ", pdfPath=", str2, ", tnPath="), this.tnPath, ", password=", this.password, ")");
    }

    public /* synthetic */ PdfInfoEntity(String str, String str2, String str3, String str4, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }
}
