package com.orion.penkit.models;

import OooOoo0.o00000;
import OoooooO.C21445Oooo;
import android.graphics.RectF;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0011\u001a\u00020\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0010¨\u0006\u001d"}, m80612d2 = {"Lcom/orion/penkit/models/PdfTextInfo;", "", "text", "", "rects", "", "Landroid/graphics/RectF;", "isVerticalText", "", "isRtlOrBttText", "<init>", "(Ljava/lang/String;Ljava/util/List;ZZ)V", "getText", "()Ljava/lang/String;", "getRects", "()Ljava/util/List;", "()Z", "isEmpty", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PdfTextInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final PdfTextInfo EMPTY = new PdfTextInfo("", C34434OooOoO.f123453OooOo0o, false, false);
    private final boolean isRtlOrBttText;
    private final boolean isVerticalText;
    private final List<RectF> rects;
    private final String text;

    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/penkit/models/PdfTextInfo$Companion;", "", "<init>", "()V", "EMPTY", "Lcom/orion/penkit/models/PdfTextInfo;", "getEMPTY", "()Lcom/orion/penkit/models/PdfTextInfo;", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final PdfTextInfo getEMPTY() {
            return PdfTextInfo.EMPTY;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PdfTextInfo(String text, List<? extends RectF> rects, boolean z, boolean z2) {
        OooOOO0.OooO0oO(text, "text");
        OooOOO0.OooO0oO(rects, "rects");
        this.text = text;
        this.rects = rects;
        this.isVerticalText = z;
        this.isRtlOrBttText = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PdfTextInfo copy$default(PdfTextInfo pdfTextInfo, String str, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pdfTextInfo.text;
        }
        if ((i & 2) != 0) {
            list = pdfTextInfo.rects;
        }
        if ((i & 4) != 0) {
            z = pdfTextInfo.isVerticalText;
        }
        if ((i & 8) != 0) {
            z2 = pdfTextInfo.isRtlOrBttText;
        }
        return pdfTextInfo.copy(str, list, z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<RectF> component2() {
        return this.rects;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsVerticalText() {
        return this.isVerticalText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsRtlOrBttText() {
        return this.isRtlOrBttText;
    }

    public final PdfTextInfo copy(String text, List<? extends RectF> rects, boolean isVerticalText, boolean isRtlOrBttText) {
        OooOOO0.OooO0oO(text, "text");
        OooOOO0.OooO0oO(rects, "rects");
        return new PdfTextInfo(text, rects, isVerticalText, isRtlOrBttText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdfTextInfo)) {
            return false;
        }
        PdfTextInfo pdfTextInfo = (PdfTextInfo) other;
        return OooOOO0.OooO0O0(this.text, pdfTextInfo.text) && OooOOO0.OooO0O0(this.rects, pdfTextInfo.rects) && this.isVerticalText == pdfTextInfo.isVerticalText && this.isRtlOrBttText == pdfTextInfo.isRtlOrBttText;
    }

    public final List<RectF> getRects() {
        return this.rects;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isRtlOrBttText) + o00000.OooO0O0(C21445Oooo.OooO00o(this.rects, this.text.hashCode() * 31, 31), 31, this.isVerticalText);
    }

    public final boolean isEmpty() {
        return this.rects.isEmpty();
    }

    public final boolean isRtlOrBttText() {
        return this.isRtlOrBttText;
    }

    public final boolean isVerticalText() {
        return this.isVerticalText;
    }

    public String toString() {
        return "PdfTextInfo(text=" + this.text + ", rects=" + this.rects + ", isVerticalText=" + this.isVerticalText + ", isRtlOrBttText=" + this.isRtlOrBttText + ")";
    }
}
