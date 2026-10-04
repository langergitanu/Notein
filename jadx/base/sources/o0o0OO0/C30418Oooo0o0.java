package o0o0OO0;

import Oooo0.C20855OooooOO;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Size;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.ocr.AiOcrSessionInputSource;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.global.R;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfPasswordException;
import com.shockwave.pdfium.PdfiumCore;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27545o00o0oo0;
import o0OOo0o.C27585o00ooO0;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: renamed from: o0o0OO0.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lo0o0OO0/Oooo0o0;", "Landroidx/lifecycle/Ooooooo;", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C30418Oooo0o0 extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO00o f108646OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f108647OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C27585o00ooO0 f108648OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C27449o00O0OoO f108649OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final PdfiumCore f108650OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public PdfDocument f108651OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C33781o00o0O f108652OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C33781o00o0O f108653OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C33781o00o0O f108654OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C33781o00o0O f108655OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C33781o00o0O f108656OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final C33769Ooooo0o f108657OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final C33781o00o0O f108658OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final C33781o00o0O f108659OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final C33781o00o0O f108660OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final C33781o00o0O f108661OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final C33769Ooooo0o f108662OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final C33769Ooooo0o f108663OooOo00;

    /* JADX INFO: renamed from: o0o0OO0.Oooo0o0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Uri f108664OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f108665OooO0O0;

        public OooO00o(Uri uri, String str) {
            this.f108664OooO00o = uri;
            this.f108665OooO0O0 = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f108664OooO00o, oooO00o.f108664OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f108665OooO0O0, oooO00o.f108665OooO0O0);
        }

        public final int hashCode() {
            int iHashCode = this.f108664OooO00o.hashCode() * 31;
            String str = this.f108665OooO0O0;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "PDFInfo(pdfUri=" + this.f108664OooO00o + ", pdfPassword=" + this.f108665OooO0O0 + ")";
        }
    }

    public C30418Oooo0o0(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, C27545o00o0oo0 c27545o00o0oo0, C27449o00O0OoO c27449o00O0OoO, C27585o00ooO0 c27585o00ooO0) {
        this.f108647OooO0Oo = abstractApplicationC26277OooOoOO;
        this.f108649OooO0o0 = c27449o00O0OoO;
        this.f108648OooO0o = c27585o00ooO0;
        this.f108650OooO0oO = new PdfiumCore(abstractApplicationC26277OooOoOO);
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(null);
        this.f108652OooOO0 = c33781o00o0OOooO00o;
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o(1);
        this.f108653OooOO0O = c33781o00o0OOooO00o2;
        this.f108654OooOO0o = c33781o00o0OOooO00o2;
        C33781o00o0O c33781o00o0OOooO00o3 = C33784o00ooo.OooO00o(0);
        this.f108656OooOOO0 = c33781o00o0OOooO00o3;
        this.f108655OooOOO = c33781o00o0OOooO00o3;
        this.f108657OooOOOO = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33781o00o0OOooO00o2, c33781o00o0OOooO00o3, new C30421OoooO00(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), "");
        C33781o00o0O c33781o00o0OOooO00o4 = C33784o00ooo.OooO00o(0);
        this.f108658OooOOOo = c33781o00o0OOooO00o4;
        this.f108660OooOOo0 = c33781o00o0OOooO00o4;
        C33781o00o0O c33781o00o0OOooO00o5 = C33784o00ooo.OooO00o(0);
        this.f108659OooOOo = c33781o00o0OOooO00o5;
        this.f108661OooOOoo = c33781o00o0OOooO00o5;
        this.f108663OooOo00 = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33781o00o0OOooO00o4, c33781o00o0OOooO00o5, new C30417Oooo0o(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), "");
        this.f108662OooOo0 = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33781o00o0OOooO00o, c33781o00o0OOooO00o2, new C30420Oooo0oo(this, null)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), ExecutorC33873OooO0O0.f122045OooOoO0), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o0(C30418Oooo0o0 c30418Oooo0o0, String str, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C30419Oooo0oO c30419Oooo0oO;
        Page page;
        C30418Oooo0o0 c30418Oooo0o02;
        Page page2;
        Page page3;
        String tnPath;
        File file;
        Bitmap bitmapDecodeFile;
        c30418Oooo0o0.getClass();
        if (abstractC32479OooO0OO instanceof C30419Oooo0oO) {
            c30419Oooo0oO = (C30419Oooo0oO) abstractC32479OooO0OO;
            int i2 = c30419Oooo0oO.f108671OooOoo0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c30419Oooo0oO.f108671OooOoo0 = i2 - Integer.MIN_VALUE;
            } else {
                c30419Oooo0oO = new C30419Oooo0oO(c30418Oooo0o0, abstractC32479OooO0OO);
            }
        }
        Object objOooOoO0 = c30419Oooo0oO.f108668OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c30419Oooo0oO.f108671OooOoo0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooOoO0);
            c30419Oooo0oO.f108667OooOo0o = c30418Oooo0o0;
            c30419Oooo0oO.f108666OooOo = str;
            c30419Oooo0oO.f108669OooOoO0 = i;
            c30419Oooo0oO.f108671OooOoo0 = 1;
            objOooOoO0 = c30418Oooo0o0.f108649OooO0o0.OooOoO0(str, c30419Oooo0oO);
            if (objOooOoO0 != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            page2 = (Page) c30419Oooo0oO.f108666OooOo;
            c30418Oooo0o02 = c30419Oooo0oO.f108667OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOoO0);
            page3 = (Page) ((Map) objOooOoO0).get(page2.getId());
            if (page3 != null && (tnPath = page3.getTnPath()) != null) {
                file = new File(tnPath);
                try {
                    bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                    if (bitmapDecodeFile.getWidth() != 0 || bitmapDecodeFile.getHeight() == 0) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("PDFPageSelectorViewModel");
                        c20358OooO00o.OooO0OO(C20855OooooOO.OooO0OO(bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), "Invalid thumbnail size: ", "x"), new Object[0]);
                        return null;
                    }
                    Size sizeOooO0o = c30418Oooo0o02.OooO0o(new Size(bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight()));
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeFile, sizeOooO0o.getWidth(), sizeOooO0o.getHeight(), true);
                    bitmapDecodeFile.recycle();
                    return bitmapCreateScaledBitmap;
                } catch (Exception e) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("PDFPageSelectorViewModel");
                    c20358OooO00o2.OooO0Oo(e, "Failed to decode thumbnail file: " + file, new Object[0]);
                }
            }
            return null;
        }
        i = c30419Oooo0oO.f108669OooOoO0;
        str = (String) c30419Oooo0oO.f108666OooOo;
        c30418Oooo0o0 = c30419Oooo0oO.f108667OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOoO0);
        NoteContent noteContent = (NoteContent) objOooOoO0;
        if (noteContent != null && (page = (Page) oOo000Oo.OooOo.OoooO00(i, noteContent.getPages())) != null) {
            C27585o00ooO0 c27585o00ooO0 = c30418Oooo0o0.f108648OooO0o;
            Set setOooOO0 = C34449Oooo0oo.OooOO0(page.getId());
            c30419Oooo0oO.f108667OooOo0o = c30418Oooo0o0;
            c30419Oooo0oO.f108666OooOo = page;
            c30419Oooo0oO.f108671OooOoo0 = 2;
            objOooOoO0 = c27585o00ooO0.OooO00o(setOooOO0, str, false, c30419Oooo0oO);
            if (objOooOoO0 != enumC32485OooO00o) {
                c30418Oooo0o02 = c30418Oooo0o0;
                page2 = page;
                page3 = (Page) ((Map) objOooOoO0).get(page2.getId());
                if (page3 != null) {
                    file = new File(tnPath);
                    bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                    if (bitmapDecodeFile.getWidth() != 0) {
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("PDFPageSelectorViewModel");
                    c20358OooO00o3.OooO0OO(C20855OooooOO.OooO0OO(bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), "Invalid thumbnail size: ", "x"), new Object[0]);
                    return null;
                }
            }
            return enumC32485OooO00o;
        }
        return null;
    }

    public final void OooO(int i) {
        Integer numValueOf = Integer.valueOf(i);
        C33781o00o0O c33781o00o0O = this.f108653OooOO0O;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, numValueOf);
    }

    @Override // androidx.lifecycle.AbstractC22019Ooooooo
    public final void OooO0OO() {
        PdfDocument pdfDocument = this.f108651OooO0oo;
        if (pdfDocument != null) {
            this.f108650OooO0oO.closeDocument(pdfDocument);
        }
    }

    public final Size OooO0o(Size size) {
        int dimensionPixelSize = this.f108647OooO0Oo.getResources().getDimensionPixelSize(R.dimen.ocr_page_preview_long_side_size);
        int iMax = (int) ((dimensionPixelSize / Math.max(size.getWidth(), size.getHeight())) * Math.min(size.getWidth(), size.getHeight()));
        if (iMax < 1) {
            iMax = 1;
        }
        return size.getWidth() > size.getHeight() ? new Size(dimensionPixelSize, iMax) : new Size(iMax, dimensionPixelSize);
    }

    public final void OooO0oO(AiOcrSessionInputSource aiOcrSessionInputSource) throws IOException {
        PdfDocument pdfDocumentNewDocument;
        int sourceType = aiOcrSessionInputSource.getSourceType();
        ParcelFileDescriptor parcelFileDescriptor = null;
        C33781o00o0O c33781o00o0O = this.f108652OooOO0;
        C33781o00o0O c33781o00o0O2 = this.f108656OooOOO0;
        if (sourceType == 0) {
            Integer numValueOf = Integer.valueOf(aiOcrSessionInputSource.getSourceUris().size());
            c33781o00o0O2.getClass();
            c33781o00o0O2.OooOO0(null, numValueOf);
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, aiOcrSessionInputSource);
            return;
        }
        if (sourceType != 1) {
            if (sourceType != 3) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("PDFPageSelectorViewModel");
                c20358OooO00o.OooO0OO(C21532OooOOo.OooO0OO(aiOcrSessionInputSource.getSourceType(), "Unsupported input source type: "), new Object[0]);
                return;
            } else {
                String str = (String) oOo000Oo.OooOo.Oooo0oO(aiOcrSessionInputSource.getSourceUris());
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30412Oooo(this, str, aiOcrSessionInputSource, null), 2);
                return;
            }
        }
        String pdfPassword = aiOcrSessionInputSource.getPdfPassword();
        String str2 = (String) oOo000Oo.OooOo.Oooo0oO(aiOcrSessionInputSource.getSourceUris());
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.f108647OooO0Oo.getContentResolver().openFileDescriptor(Uri.parse(str2), "r");
            PdfiumCore pdfiumCore = this.f108650OooO0oO;
            try {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        pdfDocumentNewDocument = pdfiumCore.newDocument(parcelFileDescriptorOpenFileDescriptor, pdfPassword);
                    } catch (PdfPasswordException e) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("PDFPageSelectorViewModel");
                        c20358OooO00o2.OooO0Oo(e, "Failed to open PDF document: " + str2, new Object[0]);
                        pdfDocumentNewDocument = null;
                    }
                } else {
                    pdfDocumentNewDocument = null;
                }
                this.f108651OooO0oo = pdfDocumentNewDocument;
                if (pdfDocumentNewDocument == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("PDFPageSelectorViewModel");
                    c20358OooO00o3.OooO0OO("Failed to open PDF document: " + str2, new Object[0]);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return;
                    }
                    return;
                }
                Integer numValueOf2 = Integer.valueOf(pdfiumCore.getPageCount(pdfDocumentNewDocument));
                c33781o00o0O2.getClass();
                c33781o00o0O2.OooOO0(null, numValueOf2);
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, aiOcrSessionInputSource);
                Uri uri = Uri.parse(str2);
                kotlin.jvm.internal.OooOOO0.OooO0o(uri, "parse(...)");
                this.f108646OooO = new OooO00o(uri, pdfPassword);
            } catch (FileNotFoundException e2) {
                e = e2;
                parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooO0Oo(e, androidx.core.app.OooO.OooO0O0(c20358OooO00o4, "PDFPageSelectorViewModel", "File not found: ", str2), new Object[0]);
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                }
            }
        } catch (FileNotFoundException e3) {
            e = e3;
        }
    }

    public final void OooO0oo() {
        int iIntValue = ((Number) this.f108654OooOO0o.getValue()).intValue();
        if (iIntValue < ((Number) this.f108655OooOOO.getValue()).intValue()) {
            Integer numValueOf = Integer.valueOf(iIntValue + 1);
            C33781o00o0O c33781o00o0O = this.f108653OooOO0O;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, numValueOf);
        }
    }

    public final void OooOO0() {
        int iIntValue = ((Number) this.f108654OooOO0o.getValue()).intValue();
        if (iIntValue > 1) {
            Integer numValueOf = Integer.valueOf(iIntValue - 1);
            C33781o00o0O c33781o00o0O = this.f108653OooOO0O;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, numValueOf);
        }
    }
}
