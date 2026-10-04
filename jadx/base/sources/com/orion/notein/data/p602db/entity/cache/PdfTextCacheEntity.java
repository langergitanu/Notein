package com.orion.notein.data.p602db.entity.cache;

import OooOO0.OooO0OO;
import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.huawei.agconnect.credential.obs.C17625c;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003JE\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0006HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u0006+"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/cache/PdfTextCacheEntity;", "", "pdfFilePath", "", "pdfFileMd5", "pdfPageIndex", "", C17625c.f52155b, "", "text", "elementsJson", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;)V", "getPdfFilePath", "()Ljava/lang/String;", "setPdfFilePath", "(Ljava/lang/String;)V", "getPdfFileMd5", "setPdfFileMd5", "getPdfPageIndex", "()I", "setPdfPageIndex", "(I)V", "getCreationTime", "()J", "setCreationTime", "(J)V", "getText", "setText", "getElementsJson", "setElementsJson", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PdfTextCacheEntity {
    private long creationTime;
    private String elementsJson;
    private String pdfFileMd5;
    private String pdfFilePath;
    private int pdfPageIndex;
    private String text;

    public PdfTextCacheEntity() {
        this(null, null, 0, 0L, null, null, 63, null);
    }

    public static /* synthetic */ PdfTextCacheEntity copy$default(PdfTextCacheEntity pdfTextCacheEntity, String str, String str2, int i, long j, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = pdfTextCacheEntity.pdfFilePath;
        }
        if ((i2 & 2) != 0) {
            str2 = pdfTextCacheEntity.pdfFileMd5;
        }
        if ((i2 & 4) != 0) {
            i = pdfTextCacheEntity.pdfPageIndex;
        }
        if ((i2 & 8) != 0) {
            j = pdfTextCacheEntity.creationTime;
        }
        if ((i2 & 16) != 0) {
            str3 = pdfTextCacheEntity.text;
        }
        if ((i2 & 32) != 0) {
            str4 = pdfTextCacheEntity.elementsJson;
        }
        long j2 = j;
        int i3 = i;
        return pdfTextCacheEntity.copy(str, str2, i3, j2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPdfFilePath() {
        return this.pdfFilePath;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPdfFileMd5() {
        return this.pdfFileMd5;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPdfPageIndex() {
        return this.pdfPageIndex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getElementsJson() {
        return this.elementsJson;
    }

    public final PdfTextCacheEntity copy(String pdfFilePath, String pdfFileMd5, int pdfPageIndex, long creationTime, String text, String elementsJson) {
        OooOOO0.OooO0oO(pdfFilePath, "pdfFilePath");
        OooOOO0.OooO0oO(pdfFileMd5, "pdfFileMd5");
        OooOOO0.OooO0oO(text, "text");
        OooOOO0.OooO0oO(elementsJson, "elementsJson");
        return new PdfTextCacheEntity(pdfFilePath, pdfFileMd5, pdfPageIndex, creationTime, text, elementsJson);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdfTextCacheEntity)) {
            return false;
        }
        PdfTextCacheEntity pdfTextCacheEntity = (PdfTextCacheEntity) other;
        return OooOOO0.OooO0O0(this.pdfFilePath, pdfTextCacheEntity.pdfFilePath) && OooOOO0.OooO0O0(this.pdfFileMd5, pdfTextCacheEntity.pdfFileMd5) && this.pdfPageIndex == pdfTextCacheEntity.pdfPageIndex && this.creationTime == pdfTextCacheEntity.creationTime && OooOOO0.OooO0O0(this.text, pdfTextCacheEntity.text) && OooOOO0.OooO0O0(this.elementsJson, pdfTextCacheEntity.elementsJson);
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final String getElementsJson() {
        return this.elementsJson;
    }

    public final String getPdfFileMd5() {
        return this.pdfFileMd5;
    }

    public final String getPdfFilePath() {
        return this.pdfFilePath;
    }

    public final int getPdfPageIndex() {
        return this.pdfPageIndex;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.elementsJson.hashCode() + OooO00o.OooO0O0(C20703o000000o.OooO0O0(C20785Oooo00o.OooO00o(this.pdfPageIndex, OooO00o.OooO0O0(this.pdfFilePath.hashCode() * 31, 31, this.pdfFileMd5), 31), 31, this.creationTime), 31, this.text);
    }

    public final void setCreationTime(long j) {
        this.creationTime = j;
    }

    public final void setElementsJson(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.elementsJson = str;
    }

    public final void setPdfFileMd5(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.pdfFileMd5 = str;
    }

    public final void setPdfFilePath(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.pdfFilePath = str;
    }

    public final void setPdfPageIndex(int i) {
        this.pdfPageIndex = i;
    }

    public final void setText(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.text = str;
    }

    public String toString() {
        String str = this.pdfFilePath;
        String str2 = this.pdfFileMd5;
        int i = this.pdfPageIndex;
        long j = this.creationTime;
        String str3 = this.text;
        String str4 = this.elementsJson;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("PdfTextCacheEntity(pdfFilePath=", str, ", pdfFileMd5=", str2, ", pdfPageIndex=");
        sbOooO0O0.append(i);
        sbOooO0O0.append(", creationTime=");
        sbOooO0O0.append(j);
        OooO0OO.OooO0o0(sbOooO0O0, ", text=", str3, ", elementsJson=", str4);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    public PdfTextCacheEntity(String pdfFilePath, String pdfFileMd5, int i, long j, String text, String elementsJson) {
        OooOOO0.OooO0oO(pdfFilePath, "pdfFilePath");
        OooOOO0.OooO0oO(pdfFileMd5, "pdfFileMd5");
        OooOOO0.OooO0oO(text, "text");
        OooOOO0.OooO0oO(elementsJson, "elementsJson");
        this.pdfFilePath = pdfFilePath;
        this.pdfFileMd5 = pdfFileMd5;
        this.pdfPageIndex = i;
        this.creationTime = j;
        this.text = text;
        this.elementsJson = elementsJson;
    }

    public /* synthetic */ PdfTextCacheEntity(String str, String str2, int i, long j, String str3, String str4, int i2, C24018OooO0oo c24018OooO0oo) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? -1 : i, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4);
    }
}
