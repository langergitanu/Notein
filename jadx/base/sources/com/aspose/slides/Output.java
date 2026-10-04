package com.aspose.slides;

import android.graphics.Bitmap;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p077d8.C3099wl;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12001c5;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p505xn.C12577yj;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class Output {

    /* JADX INFO: renamed from: k4 */
    private final ITemplateEngine f2912k4;

    /* JADX INFO: renamed from: kk */
    private final IGenericDictionary<String, IOutputFile> f2913kk = new C12577yj(String.class, IOutputFile.class);

    /* JADX INFO: renamed from: to */
    private final IGenericDictionary<Object, IOutputFile> f2914to = new Dictionary();

    /* JADX INFO: renamed from: x1 */
    private final Storage f2915x1;

    public Output(ITemplateEngine iTemplateEngine, Storage storage) {
        this.f2912k4 = iTemplateEngine;
        this.f2915x1 = storage;
    }

    /* JADX INFO: renamed from: x1 */
    private String m2103x1(IOutputFile iOutputFile) {
        IGenericEnumerator<KeyValuePair<TKey, TValue>> it = this.f2913kk.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair keyValuePair = (KeyValuePair) it.next();
                if (((IOutputFile) keyValuePair.getValue()).equals(iOutputFile)) {
                    return (String) keyValuePair.getKey();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        throw new InvalidOperationException();
    }

    @Deprecated
    public final IOutputFile add(String str, Bitmap bitmap) {
        return m2106k4(str, C12009k4.m56586k4(bitmap));
    }

    public final void bindResource(IOutputFile iOutputFile, Object obj) {
        m2101k4(obj, iOutputFile);
    }

    public final String getResourcePath(Object obj) {
        if (obj == null) {
            throw new ArgumentNullException("obj");
        }
        if (this.f2914to.containsKey(obj)) {
            return m2103x1(this.f2914to.get_Item(obj));
        }
        throw new ArgumentException("Resource not found", "obj");
    }

    /* JADX INFO: renamed from: k4 */
    public final IGenericDictionary<String, IOutputFile> m2104k4() {
        return this.f2913kk;
    }

    public final IOutputFile add(String str, IFontData iFontData, int i) {
        if (str == null) {
            throw new ArgumentNullException("path");
        }
        if (iFontData == null) {
            throw new ArgumentNullException("fontData");
        }
        if (this.f2913kk.containsKey(str)) {
            throw new ArgumentException("Already added", "path");
        }
        if (!C7019kk.m27469x1(iFontData, C1141ge.class)) {
            throw new NotImplementedException(C14113y2.m67407k4("Export of ", C14067j2.m66727k4(iFontData), " type is not supported"));
        }
        C1141ge c1141ge = (C1141ge) iFontData;
        if (!c1141ge.m6502h4().containsKey(Integer.valueOf(i))) {
            throw new InvalidOperationException(C14113y2.m67408k4(C14042ak.m66410k4(C12001c5.class, i), " font style is not available for ", iFontData.getFontName(), " font"));
        }
        C14370r2 c14370r2 = new C14370r2(c1141ge, i);
        this.f2913kk.addItem(str, c14370r2);
        return c14370r2;
    }

    /* JADX INFO: renamed from: k4 */
    public final <TContextObject> IOutputFile m2105k4(AbstractC3150x6 abstractC3150x6, String str, TContextObject tcontextobject) {
        if (str == null) {
            throw new ArgumentNullException("templateKey");
        }
        if (tcontextobject == null) {
            throw new ArgumentNullException("contextObject");
        }
        if (this.f2913kk.containsKey("?index")) {
            throw new ArgumentException("Already added", "path");
        }
        v1i v1iVar = new v1i(this.f2912k4);
        v1iVar.m72051k4(new TemplateContext(tcontextobject, this, this.f2915x1));
        v1iVar.m72052k4(str);
        v1iVar.m72055x1(abstractC3150x6);
        this.f2913kk.addItem("?index", v1iVar);
        return v1iVar;
    }

    public final IOutputFile add(String str, IImage iImage) {
        return m2106k4(str, ((yyn) iImage).m74148k4());
    }

    /* JADX INFO: renamed from: k4 */
    public IOutputFile m2106k4(String str, AbstractC12002ck abstractC12002ck) {
        if (str == null) {
            throw new ArgumentNullException("path");
        }
        if (abstractC12002ck == null) {
            throw new ArgumentNullException("image");
        }
        if (this.f2913kk.containsKey(str)) {
            throw new ArgumentException("Already added", "path");
        }
        c7y c7yVar = new c7y(abstractC12002ck);
        this.f2913kk.addItem(str, c7yVar);
        return c7yVar;
    }

    public final IOutputFile add(String str, IPPImage iPPImage) {
        if (str == null) {
            throw new ArgumentNullException("path");
        }
        if (iPPImage == null) {
            throw new ArgumentNullException("image");
        }
        if (this.f2913kk.containsKey(str)) {
            throw new ArgumentException("Already added", "path");
        }
        PPImage pPImage = (PPImage) iPPImage;
        IOutputFile c7yVar = pPImage.m2129jd() ? new c7y(C3099wl.m13181k4(pPImage.getBinaryData(), C12023wl.m56853k4(pPImage.m2133kk().m56680m9()).Clone())) : new p9q(iPPImage);
        this.f2913kk.addItem(str, c7yVar);
        return c7yVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final IOutputFile m2107k4(String str, byte[] bArr) {
        if (str == null) {
            throw new ArgumentNullException("path");
        }
        if (bArr == null) {
            throw new ArgumentNullException("binaryData");
        }
        if (this.f2913kk.containsKey(str)) {
            throw new ArgumentException("Already added", "path");
        }
        C14806xl c14806xl = new C14806xl(bArr);
        this.f2913kk.addItem(str, c14806xl);
        return c14806xl;
    }

    /* JADX INFO: renamed from: k4 */
    private void m2101k4(Object obj, IOutputFile iOutputFile) {
        if (this.f2914to.containsKey(obj)) {
            throw new InvalidOperationException();
        }
        if (!m2102k4(iOutputFile)) {
            throw new InvalidOperationException();
        }
        this.f2914to.addItem(obj, iOutputFile);
    }

    public final IOutputFile add(String str, IVideo iVideo) {
        if (str == null) {
            throw new ArgumentNullException("path");
        }
        if (iVideo == null) {
            throw new ArgumentNullException("video");
        }
        if (this.f2913kk.containsKey(str)) {
            throw new ArgumentException("Already added", "path");
        }
        gb6 gb6Var = new gb6(iVideo);
        this.f2913kk.addItem(str, gb6Var);
        return gb6Var;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m2102k4(IOutputFile iOutputFile) {
        IGenericEnumerator<KeyValuePair<TKey, TValue>> it = this.f2913kk.iterator();
        while (it.hasNext()) {
            try {
                if (((IOutputFile) ((KeyValuePair) it.next()).getValue()).equals(iOutputFile)) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    public final IOutputFile add(String str, String str2) {
        if (str == null) {
            throw new ArgumentNullException("path");
        }
        if (C14113y2.m67411k4(str2)) {
            throw new ArgumentNullException("textContent");
        }
        if (this.f2913kk.containsKey(str)) {
            throw new ArgumentException("Already added", "path");
        }
        sw4 sw4Var = new sw4(str2);
        this.f2913kk.addItem(str, sw4Var);
        return sw4Var;
    }

    public final <TContextObject> IOutputFile add(String str, String str2, TContextObject tcontextobject) {
        if (str == null) {
            throw new ArgumentNullException("path");
        }
        if (str2 == null) {
            throw new ArgumentNullException("templateKey");
        }
        if (tcontextobject == null) {
            throw new ArgumentNullException("contextObject");
        }
        if (this.f2913kk.containsKey(str)) {
            throw new ArgumentException("Already added", "path");
        }
        v1i v1iVar = new v1i(this.f2912k4);
        v1iVar.m72051k4(new TemplateContext(tcontextobject, this, this.f2915x1));
        v1iVar.m72052k4(str2);
        this.f2913kk.addItem(str, v1iVar);
        return v1iVar;
    }
}
