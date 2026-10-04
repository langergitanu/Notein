package com.orion.notein.domain.models.cache;

import OooOo.C20485OooOoO;
import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import com.aspose.slides.internal.p332p7.OooO;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.domain.models.handwriting.RecognizedTextElement;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JK\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0005HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006/"}, m80612d2 = {"Lcom/orion/notein/domain/models/cache/PdfTextCache;", "", "pdfFileMd5", "", "pdfPageIndex", "", "pdfFilePath", C17625c.f52155b, "", "text", "elements", "", "Lcom/orion/notein/domain/models/handwriting/RecognizedTextElement;", "<init>", "(Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/util/List;)V", "getPdfFileMd5", "()Ljava/lang/String;", "setPdfFileMd5", "(Ljava/lang/String;)V", "getPdfPageIndex", "()I", "setPdfPageIndex", "(I)V", "getPdfFilePath", "setPdfFilePath", "getCreationTime", "()J", "setCreationTime", "(J)V", "getText", "setText", "getElements", "()Ljava/util/List;", "setElements", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PdfTextCache {
    private long creationTime;
    private List<RecognizedTextElement> elements;
    private String pdfFileMd5;
    private String pdfFilePath;
    private int pdfPageIndex;
    private String text;

    public PdfTextCache() {
        this(null, 0, null, 0L, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PdfTextCache copy$default(PdfTextCache pdfTextCache, String str, int i, String str2, long j, String str3, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = pdfTextCache.pdfFileMd5;
        }
        if ((i2 & 2) != 0) {
            i = pdfTextCache.pdfPageIndex;
        }
        if ((i2 & 4) != 0) {
            str2 = pdfTextCache.pdfFilePath;
        }
        if ((i2 & 8) != 0) {
            j = pdfTextCache.creationTime;
        }
        if ((i2 & 16) != 0) {
            str3 = pdfTextCache.text;
        }
        if ((i2 & 32) != 0) {
            list = pdfTextCache.elements;
        }
        long j2 = j;
        String str4 = str2;
        return pdfTextCache.copy(str, i, str4, j2, str3, list);
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

    public final List<RecognizedTextElement> component6() {
        return this.elements;
    }

    public final PdfTextCache copy(String pdfFileMd5, int pdfPageIndex, String pdfFilePath, long creationTime, String text, List<RecognizedTextElement> elements) {
        OooOOO0.OooO0oO(pdfFileMd5, "pdfFileMd5");
        OooOOO0.OooO0oO(pdfFilePath, "pdfFilePath");
        OooOOO0.OooO0oO(text, "text");
        OooOOO0.OooO0oO(elements, "elements");
        return new PdfTextCache(pdfFileMd5, pdfPageIndex, pdfFilePath, creationTime, text, elements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdfTextCache)) {
            return false;
        }
        PdfTextCache pdfTextCache = (PdfTextCache) other;
        return OooOOO0.OooO0O0(this.pdfFileMd5, pdfTextCache.pdfFileMd5) && this.pdfPageIndex == pdfTextCache.pdfPageIndex && OooOOO0.OooO0O0(this.pdfFilePath, pdfTextCache.pdfFilePath) && this.creationTime == pdfTextCache.creationTime && OooOOO0.OooO0O0(this.text, pdfTextCache.text) && OooOOO0.OooO0O0(this.elements, pdfTextCache.elements);
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final List<RecognizedTextElement> getElements() {
        return this.elements;
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
        return this.elements.hashCode() + OooO00o.OooO0O0(C20703o000000o.OooO0O0(OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.pdfPageIndex, this.pdfFileMd5.hashCode() * 31, 31), 31, this.pdfFilePath), 31, this.creationTime), 31, this.text);
    }

    public final void setCreationTime(long j) {
        this.creationTime = j;
    }

    public final void setElements(List<RecognizedTextElement> list) {
        OooOOO0.OooO0oO(list, "<set-?>");
        this.elements = list;
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
        List<RecognizedTextElement> list = this.elements;
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "PdfTextCache(pdfFileMd5=", str, ", pdfPageIndex=", ", pdfFilePath=");
        OooO.OooO00o(j, str2, ", creationTime=", sbOooO0OO);
        sbOooO0OO.append(", text=");
        sbOooO0OO.append(str3);
        sbOooO0OO.append(", elements=");
        sbOooO0OO.append(list);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }

    public PdfTextCache(String pdfFileMd5, int i, String pdfFilePath, long j, String text, List<RecognizedTextElement> elements) {
        OooOOO0.OooO0oO(pdfFileMd5, "pdfFileMd5");
        OooOOO0.OooO0oO(pdfFilePath, "pdfFilePath");
        OooOOO0.OooO0oO(text, "text");
        OooOOO0.OooO0oO(elements, "elements");
        this.pdfFileMd5 = pdfFileMd5;
        this.pdfPageIndex = i;
        this.pdfFilePath = pdfFilePath;
        this.creationTime = j;
        this.text = text;
        this.elements = elements;
    }

    public /* synthetic */ PdfTextCache(String str, int i, String str2, long j, String str3, List list, int i2, C24018OooO0oo c24018OooO0oo) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? new ArrayList() : list);
    }
}
