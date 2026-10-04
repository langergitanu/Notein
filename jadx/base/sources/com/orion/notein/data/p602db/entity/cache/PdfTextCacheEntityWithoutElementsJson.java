package com.orion.notein.data.p602db.entity.cache;

import OooOo.C20485OooOoO;
import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import com.aspose.slides.OooOOO;
import com.aspose.slides.internal.p332p7.OooO;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.huawei.agconnect.credential.obs.C17625c;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J;\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006'"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/cache/PdfTextCacheEntityWithoutElementsJson;", "", "pdfFileMd5", "", "pdfPageIndex", "", "pdfFilePath", C17625c.f52155b, "", "text", "<init>", "(Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;)V", "getPdfFileMd5", "()Ljava/lang/String;", "setPdfFileMd5", "(Ljava/lang/String;)V", "getPdfPageIndex", "()I", "setPdfPageIndex", "(I)V", "getPdfFilePath", "setPdfFilePath", "getCreationTime", "()J", "setCreationTime", "(J)V", "getText", "setText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PdfTextCacheEntityWithoutElementsJson {
    private long creationTime;
    private String pdfFileMd5;
    private String pdfFilePath;
    private int pdfPageIndex;
    private String text;

    public PdfTextCacheEntityWithoutElementsJson() {
        this(null, 0, null, 0L, null, 31, null);
    }

    public static /* synthetic */ PdfTextCacheEntityWithoutElementsJson copy$default(PdfTextCacheEntityWithoutElementsJson pdfTextCacheEntityWithoutElementsJson, String str, int i, String str2, long j, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = pdfTextCacheEntityWithoutElementsJson.pdfFileMd5;
        }
        if ((i2 & 2) != 0) {
            i = pdfTextCacheEntityWithoutElementsJson.pdfPageIndex;
        }
        if ((i2 & 4) != 0) {
            str2 = pdfTextCacheEntityWithoutElementsJson.pdfFilePath;
        }
        if ((i2 & 8) != 0) {
            j = pdfTextCacheEntityWithoutElementsJson.creationTime;
        }
        if ((i2 & 16) != 0) {
            str3 = pdfTextCacheEntityWithoutElementsJson.text;
        }
        String str4 = str3;
        String str5 = str2;
        return pdfTextCacheEntityWithoutElementsJson.copy(str, i, str5, j, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPdfFileMd5() {
        return this.pdfFileMd5;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPdfPageIndex() {
        return this.pdfPageIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPdfFilePath() {
        return this.pdfFilePath;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final PdfTextCacheEntityWithoutElementsJson copy(String pdfFileMd5, int pdfPageIndex, String pdfFilePath, long creationTime, String text) {
        OooOOO0.OooO0oO(pdfFileMd5, "pdfFileMd5");
        OooOOO0.OooO0oO(pdfFilePath, "pdfFilePath");
        OooOOO0.OooO0oO(text, "text");
        return new PdfTextCacheEntityWithoutElementsJson(pdfFileMd5, pdfPageIndex, pdfFilePath, creationTime, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdfTextCacheEntityWithoutElementsJson)) {
            return false;
        }
        PdfTextCacheEntityWithoutElementsJson pdfTextCacheEntityWithoutElementsJson = (PdfTextCacheEntityWithoutElementsJson) other;
        return OooOOO0.OooO0O0(this.pdfFileMd5, pdfTextCacheEntityWithoutElementsJson.pdfFileMd5) && this.pdfPageIndex == pdfTextCacheEntityWithoutElementsJson.pdfPageIndex && OooOOO0.OooO0O0(this.pdfFilePath, pdfTextCacheEntityWithoutElementsJson.pdfFilePath) && this.creationTime == pdfTextCacheEntityWithoutElementsJson.creationTime && OooOOO0.OooO0O0(this.text, pdfTextCacheEntityWithoutElementsJson.text);
    }

    public final long getCreationTime() {
        return this.creationTime;
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
        return this.text.hashCode() + C20703o000000o.OooO0O0(OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.pdfPageIndex, this.pdfFileMd5.hashCode() * 31, 31), 31, this.pdfFilePath), 31, this.creationTime);
    }

    public final void setCreationTime(long j) {
        this.creationTime = j;
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
        String str = this.pdfFileMd5;
        int i = this.pdfPageIndex;
        String str2 = this.pdfFilePath;
        long j = this.creationTime;
        String str3 = this.text;
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "PdfTextCacheEntityWithoutElementsJson(pdfFileMd5=", str, ", pdfPageIndex=", ", pdfFilePath=");
        OooO.OooO00o(j, str2, ", creationTime=", sbOooO0OO);
        return OooOOO.OooO0O0(sbOooO0OO, ", text=", str3, ")");
    }

    public PdfTextCacheEntityWithoutElementsJson(String pdfFileMd5, int i, String pdfFilePath, long j, String text) {
        OooOOO0.OooO0oO(pdfFileMd5, "pdfFileMd5");
        OooOOO0.OooO0oO(pdfFilePath, "pdfFilePath");
        OooOOO0.OooO0oO(text, "text");
        this.pdfFileMd5 = pdfFileMd5;
        this.pdfPageIndex = i;
        this.pdfFilePath = pdfFilePath;
        this.creationTime = j;
        this.text = text;
    }

    public /* synthetic */ PdfTextCacheEntityWithoutElementsJson(String str, int i, String str2, long j, String str3, int i2, C24018OooO0oo c24018OooO0oo) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? "" : str3);
    }
}
