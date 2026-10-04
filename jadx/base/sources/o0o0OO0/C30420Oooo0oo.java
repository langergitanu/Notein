package o0o0OO0;

import Oooo0.C20855OooooOO;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.orion.notein.domain.models.ocr.AiOcrSessionInputSource;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import java.io.FileNotFoundException;
import java.io.InputStream;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0OO0.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.ScannedPageSelectorViewModel$pagePreview$1", m80623f = "PdfPageSelectorViewModel.kt", m80624l = {84, 88, 92}, m80625m = "invokeSuspend")
public final class C30420Oooo0oo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<AiOcrSessionInputSource, Integer, Continuation<? super Bitmap>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ AiOcrSessionInputSource f108672OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108673OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30418Oooo0o0 f108674OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ int f108675OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30420Oooo0oo(C30418Oooo0o0 c30418Oooo0o0, Continuation<? super C30420Oooo0oo> continuation) {
        super(3, continuation);
        this.f108674OooOoO = c30418Oooo0o0;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(AiOcrSessionInputSource aiOcrSessionInputSource, Integer num, Continuation<? super Bitmap> continuation) {
        int iIntValue = num.intValue();
        C30420Oooo0oo c30420Oooo0oo = new C30420Oooo0oo(this.f108674OooOoO, continuation);
        c30420Oooo0oo.f108672OooOo = aiOcrSessionInputSource;
        c30420Oooo0oo.f108675OooOoO0 = iIntValue;
        return c30420Oooo0oo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c7, code lost:
    
        if (r7 == r0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0146, code lost:
    
        if (r2 == r0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0172, code lost:
    
        if (r2 == r0) goto L63;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws FileNotFoundException {
        Object obj2;
        Object objOooO0o0;
        Object objCreateScaledBitmap;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108673OooOo0o;
        if (i != 0) {
            if (i == 1) {
                C32446OooOOOo.OooO0O0(obj);
                obj2 = obj;
                return (Bitmap) obj2;
            }
            if (i == 2) {
                C32446OooOOOo.OooO0O0(obj);
                objCreateScaledBitmap = obj;
                return (Bitmap) objCreateScaledBitmap;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooO0o0 = obj;
            return (Bitmap) objOooO0o0;
        }
        C32446OooOOOo.OooO0O0(obj);
        AiOcrSessionInputSource aiOcrSessionInputSource = this.f108672OooOo;
        int i2 = this.f108675OooOoO0;
        obj2 = null;
        Integer num = aiOcrSessionInputSource != null ? new Integer(aiOcrSessionInputSource.getSourceType()) : null;
        C30418Oooo0o0 c30418Oooo0o0 = this.f108674OooOoO;
        if (num != null && num.intValue() == 1) {
            PdfDocument pdfDocument = c30418Oooo0o0.f108651OooO0oo;
            if (pdfDocument == null) {
                return null;
            }
            this.f108673OooOo0o = 1;
            int i3 = i2 - 1;
            PdfiumCore pdfiumCore = c30418Oooo0o0.f108650OooO0oO;
            pdfiumCore.openPage(pdfDocument, i3);
            Size pageSize = pdfiumCore.getPageSize(pdfDocument, i3);
            android.util.Size sizeOooO0o = c30418Oooo0o0.OooO0o(new android.util.Size(pageSize.getWidth(), pageSize.getHeight()));
            if (sizeOooO0o.getWidth() == 0 || sizeOooO0o.getHeight() == 0) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("PDFPageSelectorViewModel");
                c20358OooO00o.OooO0OO(C20855OooooOO.OooO0OO(sizeOooO0o.getWidth(), sizeOooO0o.getHeight(), "Invalid bitmap size: ", "x"), new Object[0]);
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeOooO0o.getWidth(), sizeOooO0o.getHeight(), Bitmap.Config.ARGB_8888);
                kotlin.jvm.internal.OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
                c30418Oooo0o0.f108650OooO0oO.renderPageBitmap(pdfDocument, bitmapCreateBitmap, i3, 0, 0, sizeOooO0o.getWidth(), sizeOooO0o.getHeight(), false);
                obj2 = bitmapCreateBitmap;
            }
        } else if (num != null && num.intValue() == 0) {
            Uri uri = Uri.parse(aiOcrSessionInputSource.getSourceUris().get(i2 - 1));
            kotlin.jvm.internal.OooOOO0.OooO0o(uri, "parse(...)");
            this.f108673OooOo0o = 2;
            InputStream inputStreamOpenInputStream = c30418Oooo0o0.f108647OooO0Oo.getContentResolver().openInputStream(uri);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                oO0O000.OooO00o.OooO00o(inputStreamOpenInputStream, null);
                if (bitmapDecodeStream.getWidth() == 0 || bitmapDecodeStream.getHeight() == 0) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("PDFPageSelectorViewModel");
                    c20358OooO00o2.OooO0OO(C20855OooooOO.OooO0OO(bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), "Invalid image size: ", "x"), new Object[0]);
                    objCreateScaledBitmap = null;
                } else {
                    android.util.Size sizeOooO0o2 = c30418Oooo0o0.OooO0o(new android.util.Size(bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight()));
                    objCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeStream, sizeOooO0o2.getWidth(), sizeOooO0o2.getHeight(), true);
                    bitmapDecodeStream.recycle();
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    oO0O000.OooO00o.OooO00o(inputStreamOpenInputStream, th);
                    throw th2;
                }
            }
        } else {
            if (num == null || num.intValue() != 3) {
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("PDFPageSelectorViewModel");
                c20358OooO00o3.OooO0OO("Unsupported input source type: " + (aiOcrSessionInputSource != null ? new Integer(aiOcrSessionInputSource.getSourceType()) : null), new Object[0]);
                return null;
            }
            this.f108673OooOo0o = 3;
            objOooO0o0 = C30418Oooo0o0.OooO0o0(c30418Oooo0o0, ((String) oOo000Oo.OooOo.Oooo0oO(aiOcrSessionInputSource.getSourceUris())).toString(), i2 - 1, this);
        }
        return enumC32485OooO00o;
    }
}
