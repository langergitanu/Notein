package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p077d8.C3065k4;
import com.aspose.slides.internal.p077d8.C3091u4;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3126c5;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14057f9;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class PresentationFactory implements IPresentationFactory {

    /* JADX INFO: renamed from: k4 */
    private static final PresentationFactory f3141k4 = new PresentationFactory();

    public static PresentationFactory getInstance() {
        return f3141k4;
    }

    @Override // com.aspose.slides.IPresentationFactory
    public final IPresentation createPresentation() {
        return new Presentation();
    }

    @Override // com.aspose.slides.IPresentationFactory
    public final IPresentationInfo getPresentationInfo(InputStream inputStream) {
        return m2410k4(AbstractC3150x6.fromJava(inputStream));
    }

    @Override // com.aspose.slides.IPresentationFactory
    public final IPresentationText getPresentationText(InputStream inputStream, int i) {
        return m2411k4(AbstractC3150x6.fromJava(inputStream), i);
    }

    /* JADX INFO: renamed from: k4 */
    public IPresentation m2409k4(AbstractC3150x6 abstractC3150x6, ILoadOptions iLoadOptions) {
        return new Presentation(abstractC3150x6, (LoadOptions) C7019kk.m27452k4((Object) iLoadOptions, LoadOptions.class));
    }

    @Override // com.aspose.slides.IPresentationFactory
    public final IPresentation readPresentation(InputStream inputStream) {
        return m2413x1(AbstractC3150x6.fromJava(inputStream));
    }

    /* JADX INFO: renamed from: x1 */
    public IPresentation m2413x1(AbstractC3150x6 abstractC3150x6) {
        return new Presentation(abstractC3150x6);
    }

    @Override // com.aspose.slides.IPresentationFactory
    public final IPresentation createPresentation(ILoadOptions iLoadOptions) {
        return new Presentation((LoadOptions) C7019kk.m27452k4((Object) iLoadOptions, LoadOptions.class));
    }

    @Override // com.aspose.slides.IPresentationFactory
    public final IPresentationInfo getPresentationInfo(String str) {
        C3130fa c3130fa = new C3130fa(str, 3, 1);
        try {
            return m2407k4(c3130fa, new C3126c5(str));
        } finally {
            c3130fa.dispose();
        }
    }

    @Override // com.aspose.slides.IPresentationFactory
    public final IPresentationText getPresentationText(InputStream inputStream, int i, ILoadOptions iLoadOptions) {
        return m2412k4(AbstractC3150x6.fromJava(inputStream), i, iLoadOptions);
    }

    /* JADX INFO: renamed from: k4 */
    public IPresentationInfo m2410k4(AbstractC3150x6 abstractC3150x6) {
        C3126c5[] c3126c5Arr = {null};
        return m2408k4(abstractC3150x6, c3126c5Arr) ? m2407k4(abstractC3150x6, c3126c5Arr[0]) : m2407k4(abstractC3150x6, (C3126c5) null);
    }

    @Override // com.aspose.slides.IPresentationFactory
    public final IPresentation readPresentation(InputStream inputStream, ILoadOptions iLoadOptions) {
        return m2409k4(AbstractC3150x6.fromJava(inputStream), iLoadOptions);
    }

    /* JADX INFO: renamed from: k4 */
    private IPresentationInfo m2407k4(AbstractC3150x6 abstractC3150x6, C3126c5 c3126c5) {
        return new PresentationInfo(abstractC3150x6, c3126c5);
    }

    @Override // com.aspose.slides.IPresentationFactory
    public final IPresentationText getPresentationText(String str, int i) {
        C3130fa c3130fa = new C3130fa(str, 3, 1, 1);
        try {
            return m2411k4(c3130fa, i);
        } finally {
            c3130fa.dispose();
        }
    }

    @Override // com.aspose.slides.IPresentationFactory
    public final IPresentation readPresentation(String str) {
        return new Presentation(str);
    }

    /* JADX INFO: renamed from: k4 */
    public IPresentationText m2411k4(AbstractC3150x6 abstractC3150x6, int i) {
        return m2412k4(abstractC3150x6, i, null);
    }

    @Override // com.aspose.slides.IPresentationFactory
    public final IPresentation readPresentation(String str, ILoadOptions iLoadOptions) {
        return new Presentation(str, (LoadOptions) C7019kk.m27452k4((Object) iLoadOptions, LoadOptions.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IPresentationText m2412k4(AbstractC3150x6 abstractC3150x6, int i, ILoadOptions iLoadOptions) {
        boolean z;
        if (abstractC3150x6 == null) {
            throw new NullReferenceException("Stream is null");
        }
        if (abstractC3150x6.getLength() == 0) {
            throw new ArgumentException("The stream is empty.", "stream");
        }
        try {
            C14057f9.m66582k4("1");
            C14047bz c14047bzClone = C14047bz.m66536x1().Clone();
            try {
                v7f.m72086k4(c14047bzClone.Clone());
                AbstractC3150x6 abstractC3150x6M13133k4 = C3091u4.m13133k4(abstractC3150x6);
                int i2 = abstractC3150x6M13133k4.readByte();
                if (i2 > 0) {
                    abstractC3150x6M13133k4.seek(-1L, 1);
                    z = ((byte) i2) == 80;
                }
                ctm ctmVarM1919k4 = iLoadOptions != null ? ((LoadOptions) iLoadOptions).m1919k4() : null;
                PresentationText presentationTextM70965k4 = z ? new t5f(abstractC3150x6, i, ctmVarM1919k4).m70965k4() : new PresentationText(new rtn(gni.m6834x1(abstractC3150x6), ctmVarM1919k4).m70347k4(i));
                v7f.m72084k4(c14047bzClone.Clone(), abstractC3150x6M13133k4);
                try {
                    v7f.m72086k4(c14047bzClone.Clone());
                    C6765kp c6765kp = new C6765kp();
                    for (ISlideText iSlideText : presentationTextM70965k4.getSlidesText()) {
                        c6765kp.m26792k4(iSlideText.getMasterText());
                        c6765kp.m26792k4(iSlideText.getLayoutText());
                        c6765kp.m26792k4(iSlideText.getText());
                        c6765kp.m26792k4(iSlideText.getNotesText());
                    }
                    v7f.m72089k4(c14047bzClone.Clone(), c6765kp.toString());
                    return presentationTextM70965k4;
                } catch (RuntimeException e) {
                    v7f.m72090x1(c14047bzClone.Clone());
                    throw e;
                }
            } catch (C3065k4 e2) {
                v7f.m72090x1(c14047bzClone.Clone());
                throw new PptxReadException("Presentation reading aborted.", e2);
            } catch (RuntimeException e3) {
                v7f.m72090x1(c14047bzClone.Clone());
                throw e3;
            }
        } catch (ArgumentException e4) {
            throw new IllegalArgumentException(e4.getMessage());
        }
    }

    @Override // com.aspose.slides.IPresentationFactory
    public final IPresentation readPresentation(byte[] bArr) {
        C3152yj c3152yj = new C3152yj(bArr, false);
        try {
            return new Presentation(c3152yj);
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m2408k4(AbstractC3150x6 abstractC3150x6, C3126c5[] c3126c5Arr) {
        c3126c5Arr[0] = null;
        try {
            C3130fa c3130fa = (C3130fa) C7019kk.m27452k4((Object) abstractC3150x6, C3130fa.class);
            if (c3130fa != null) {
                c3126c5Arr[0] = new C3126c5(c3130fa.m13345k4());
                return true;
            }
        } catch (RuntimeException unused) {
        }
        return false;
    }

    @Override // com.aspose.slides.IPresentationFactory
    public final IPresentation readPresentation(byte[] bArr, ILoadOptions iLoadOptions) {
        C3152yj c3152yj = new C3152yj(bArr, false);
        try {
            return new Presentation(c3152yj, (LoadOptions) C7019kk.m27452k4((Object) iLoadOptions, LoadOptions.class));
        } finally {
            c3152yj.dispose();
        }
    }
}
