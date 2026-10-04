package o0OOO0o0;

import android.graphics.RectF;
import android.util.LruCache;
import android.util.Size;
import com.orion.notein.domain.models.handwriting.RecognizedTextElement;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfPasswordException;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.PdfText;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.OooOOO0;
import o0O0OoO0.C25898OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0o0O0o.C33587OooO0oo;
import oOO00oo.C34406OooO00o;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0OOO0o0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27052OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f94188OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f94189OooO0O0;

    /* JADX INFO: renamed from: o0OOO0o0.OooO0OO$OooO00o */
    public static final class OooO00o extends LruCache<String, PdfDocument> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AbstractApplicationC26277OooOoOO f94190OooO00o;

        public OooO00o(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
            super(3);
            this.f94190OooO00o = abstractApplicationC26277OooOoOO;
        }

        @Override // android.util.LruCache
        public final void entryRemoved(boolean z, String str, PdfDocument pdfDocument, PdfDocument pdfDocument2) {
            String key = str;
            PdfDocument oldValue = pdfDocument;
            OooOOO0.OooO0oO(key, "key");
            OooOOO0.OooO0oO(oldValue, "oldValue");
            try {
                new PdfiumCore(this.f94190OooO00o).closeDocument(oldValue);
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("PdfiumDataSource");
                c20358OooO00o.OooO0OO("entryRemoved: ".concat(C32435OooO0Oo.OooO0O0(e)), new Object[0]);
            }
        }
    }

    public C27052OooO0OO(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        this.f94188OooO00o = abstractApplicationC26277OooOoOO;
        this.f94189OooO0O0 = new OooO00o(abstractApplicationC26277OooOoOO);
    }

    public static ArrayList OooO00o(List list, Size size, Size size2) {
        String string;
        ArrayList arrayList = new ArrayList();
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (!OooOOO0.OooO0O0(((PdfText) obj).getText(), IOUtils.LINE_SEPARATOR_UNIX)) {
                arrayList3.add(obj);
            } else if (!arrayList3.isEmpty()) {
                arrayList2.add(OooOo.o0ooOO0(arrayList3));
                arrayList3.clear();
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(OooOo.o0ooOO0(arrayList3));
        }
        for (List<PdfText> list2 : arrayList2) {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList4 = new ArrayList();
            RectF rectF = null;
            for (PdfText pdfText : list2) {
                String text = pdfText.getText();
                OooOOO0.OooO0o(text, "getText(...)");
                Pattern patternCompile = Pattern.compile("[\\x00-\\x08\\x0b-\\x0c\\x0e-\\x1f\ud800-\udbff][\\uDC00-\\uDFFF]");
                OooOOO0.OooO0o(patternCompile, "compile(...)");
                Matcher matcher = patternCompile.matcher(text);
                OooOOO0.OooO0o(matcher, "matcher(...)");
                C33587OooO0oo c33587OooO0ooOooO00o = C25898OooO0Oo.OooO00o(matcher, 0, text);
                if (c33587OooO0ooOooO00o == null) {
                    string = text.toString();
                } else {
                    int length = text.length();
                    StringBuilder sb2 = new StringBuilder(length);
                    int i = 0;
                    do {
                        sb2.append((CharSequence) text, i, c33587OooO0ooOooO00o.OooO0O0().f116812OooOo0o);
                        sb2.append((CharSequence) (Character.isDefined(c33587OooO0ooOooO00o.getValue().codePointAt(0)) ? c33587OooO0ooOooO00o.getValue() : ""));
                        i = c33587OooO0ooOooO00o.OooO0O0().f116811OooOo + 1;
                        c33587OooO0ooOooO00o = c33587OooO0ooOooO00o.next();
                        if (i >= length) {
                            break;
                        }
                    } while (c33587OooO0ooOooO00o != null);
                    if (i < length) {
                        sb2.append((CharSequence) text, i, length);
                    }
                    String string2 = sb2.toString();
                    OooOOO0.OooO0o(string2, "toString(...)");
                    string = string2;
                }
                RectF bounds = pdfText.getBounds();
                OooOOO0.OooO0o(bounds, "getBounds(...)");
                int height = size.getHeight();
                float f = bounds.left;
                float f2 = height;
                float f3 = f2 - bounds.top;
                float f4 = bounds.right;
                float f5 = f2 - bounds.bottom;
                RectF rectF2 = new RectF(f, Math.min(f3, f5), f4, Math.max(f3, f5));
                float width = (size2.getWidth() * 1.0f) / size.getWidth();
                float height2 = (size2.getHeight() * 1.0f) / size.getHeight();
                rectF2.left *= width;
                rectF2.top *= height2;
                rectF2.right *= width;
                rectF2.bottom *= height2;
                arrayList4.add(new RecognizedTextElement.CharElement(string, rectF2));
                sb.append(string);
                if (rectF != null) {
                    rectF.union(rectF2);
                } else {
                    rectF = new RectF(rectF2);
                }
            }
            String string3 = sb.toString();
            OooOOO0.OooO0o(string3, "toString(...)");
            OooOOO0.OooO0Oo(rectF);
            arrayList.add(new RecognizedTextElement(string3, rectF, arrayList4));
        }
        return arrayList;
    }

    public final ArrayList OooO0O0(PdfInfo pdfInfo, int i, Size noteinPageSize) {
        OooOOO0.OooO0oO(pdfInfo, "pdfInfo");
        OooOOO0.OooO0oO(noteinPageSize, "noteinPageSize");
        PdfiumCore pdfiumCore = new PdfiumCore(this.f94188OooO00o);
        synchronized (this.f94189OooO0O0) {
            if (this.f94189OooO0O0.get(pdfInfo.getPdfPath()) == null) {
                try {
                    this.f94189OooO0O0.put(pdfInfo.getPdfPath(), pdfiumCore.newDocument(pdfInfo.getPdfPath(), pdfInfo.getPassword()));
                } catch (PdfPasswordException unused) {
                    return null;
                }
            }
            PdfDocument pdfDocument = this.f94189OooO0O0.get(pdfInfo.getPdfPath());
            if (pdfDocument == null) {
                return null;
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            pdfiumCore.openPage(pdfDocument, i);
            try {
                int pageWidthPoint = pdfiumCore.getPageWidthPoint(pdfDocument, i);
                int pageHeightPoint = pdfiumCore.getPageHeightPoint(pdfDocument, i);
                List<PdfText> pageContent = pdfiumCore.getPageContent(pdfDocument, i);
                return pageContent != null ? OooO00o(pageContent, new Size(pageWidthPoint, pageHeightPoint), noteinPageSize) : null;
            } finally {
                pdfiumCore.closePage(pdfDocument, i);
            }
        }
    }
}
