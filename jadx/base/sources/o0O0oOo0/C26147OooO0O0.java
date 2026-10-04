package o0O0oOo0;

import android.content.Context;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.SizeF;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0O0oOo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26147OooO0O0 implements o0O0oo00.OooO0O0<C26148OooO0OO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PdfiumCore f89218OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final PdfDocument f89219OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f89220OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f89221OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Context f89222OooO0o0;

    public C26147OooO0O0(Context context, PdfiumCore pdfiumCore, PdfDocument pdfDoc, int i) {
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(pdfiumCore, "pdfiumCore");
        OooOOO0.OooO0oO(pdfDoc, "pdfDoc");
        this.f89218OooO00o = pdfiumCore;
        this.f89219OooO0O0 = pdfDoc;
        this.f89220OooO0OO = i;
        this.f89221OooO0Oo = pdfiumCore.openPage(pdfDoc, i);
        this.f89222OooO0o0 = context;
    }

    @Override // o0O0oo00.OooO0O0
    public final Context OooO00o() {
        return this.f89222OooO0o0;
    }

    @Override // o0O0oo00.OooO0O0
    public final boolean OooO0O0() {
        return false;
    }

    @Override // o0O0oo00.OooO0O0
    public final void clear() {
        C34406OooO00o.f123390OooO00o.OooO00o("clear", new Object[0]);
    }

    @Override // o0O0oo00.OooO0O0
    public final C32443OooOOO<Float, Float> getOffset() {
        SizeF pageOffset = this.f89218OooO00o.getPageOffset(this.f89219OooO0O0, this.f89220OooO0OO);
        C34406OooO00o.f123390OooO00o.OooO00o("offset: " + pageOffset, new Object[0]);
        return new C32443OooOOO<>(Float.valueOf(pageOffset.getWidth()), Float.valueOf(pageOffset.getHeight()));
    }

    @Override // o0O0oo00.OooO0O0
    public final C32443OooOOO<Float, Float> getSize() {
        PdfiumCore pdfiumCore = this.f89218OooO00o;
        PdfDocument pdfDocument = this.f89219OooO0O0;
        int i = this.f89220OooO0OO;
        return new C32443OooOOO<>(Float.valueOf(pdfiumCore.getPageWidthPoint(pdfDocument, i)), Float.valueOf(pdfiumCore.getPageHeightPoint(pdfDocument, i)));
    }

    @Override // o0O0oo00.OooO0O0
    public final C26148OooO0OO getTarget() {
        return new C26148OooO0OO(this.f89218OooO00o, this.f89219OooO0O0, this.f89220OooO0OO, this.f89221OooO0Oo);
    }
}
