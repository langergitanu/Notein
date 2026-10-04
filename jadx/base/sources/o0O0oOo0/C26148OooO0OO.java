package o0O0oOo0;

import OooOooo.C20785Oooo00o;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0O0oOo0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26148OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PdfiumCore f89223OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final PdfDocument f89224OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f89225OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f89226OooO0Oo;

    public C26148OooO0OO(PdfiumCore pdfiumCore, PdfDocument pdfDoc, int i, long j) {
        OooOOO0.OooO0oO(pdfiumCore, "pdfiumCore");
        OooOOO0.OooO0oO(pdfDoc, "pdfDoc");
        this.f89223OooO00o = pdfiumCore;
        this.f89224OooO0O0 = pdfDoc;
        this.f89225OooO0OO = i;
        this.f89226OooO0Oo = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26148OooO0OO)) {
            return false;
        }
        C26148OooO0OO c26148OooO0OO = (C26148OooO0OO) obj;
        return OooOOO0.OooO0O0(this.f89223OooO00o, c26148OooO0OO.f89223OooO00o) && OooOOO0.OooO0O0(this.f89224OooO0O0, c26148OooO0OO.f89224OooO0O0) && this.f89225OooO0OO == c26148OooO0OO.f89225OooO0OO && this.f89226OooO0Oo == c26148OooO0OO.f89226OooO0Oo;
    }

    public final int hashCode() {
        return Long.hashCode(this.f89226OooO0Oo) + C20785Oooo00o.OooO00o(this.f89225OooO0OO, (this.f89224OooO0O0.hashCode() + (this.f89223OooO00o.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "PdfiumTargetInfo(pdfiumCore=" + this.f89223OooO00o + ", pdfDoc=" + this.f89224OooO0O0 + ", pageIndex=" + this.f89225OooO0OO + ", pagePtr=" + this.f89226OooO0Oo + ")";
    }
}
