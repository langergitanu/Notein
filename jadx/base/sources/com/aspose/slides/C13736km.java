package com.aspose.slides;

import android.content.pm.PackageManager;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p353q7.C9774jd;
import com.aspose.slides.internal.p353q7.C9775k4;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.km */
/* JADX INFO: loaded from: classes3.dex */
class C13736km implements IDisposable {

    /* JADX INFO: renamed from: c5 */
    private final C14717vy[] f45784c5;

    /* JADX INFO: renamed from: du */
    private C14717vy f45785du;

    /* JADX INFO: renamed from: k4 */
    private int f45786k4;

    /* JADX INFO: renamed from: to */
    private final C14717vy f45788to;

    /* JADX INFO: renamed from: m9 */
    private static final C14717vy f45783m9 = new C14717vy(C9775k4.m48094x1());

    /* JADX INFO: renamed from: dy */
    private static final kbh f45781dy = new kbh();

    /* JADX INFO: renamed from: h4 */
    private static int f45782h4 = 0;

    /* JADX INFO: renamed from: x1 */
    private final Dictionary<String, Dictionary<Integer, C14251ot>> f45789x1 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private final C0758ap f45787kk = new C0758ap();

    public C13736km(IFontSources iFontSources) {
        String[] fontFolders;
        byte[][] memoryFonts;
        C14717vy c14717vy = new C14717vy(5, m64005k4());
        this.f45788to = c14717vy;
        if (iFontSources != null) {
            fontFolders = iFontSources.getFontFolders();
            memoryFonts = iFontSources.getMemoryFonts();
        } else {
            fontFolders = null;
            memoryFonts = null;
        }
        C14717vy c14717vy2 = new C14717vy(new C9774jd(fontFolders, memoryFonts));
        this.f45785du = c14717vy2;
        this.f45784c5 = new C14717vy[]{c14717vy, c14717vy2, f45783m9, f45781dy};
    }

    /* JADX INFO: renamed from: h4 */
    private void m64001h4() {
        if (this.f45786k4 != f45782h4) {
            m64004du();
            this.f45786k4 = f45782h4;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m64003x1() {
        f45783m9.m72584x1();
        f45782h4++;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        m64005k4().dispose();
        for (C14717vy c14717vy : this.f45784c5) {
            c14717vy.m72582k4();
        }
        this.f45788to.m72582k4();
        this.f45785du.m72582k4();
    }

    /* JADX INFO: renamed from: du */
    public final void m64004du() {
        this.f45789x1.clear();
    }

    /* JADX INFO: renamed from: k4 */
    public final C0758ap m64005k4() {
        return this.f45787kk;
    }

    /* JADX INFO: renamed from: kk */
    public final void m64008kk() {
        this.f45788to.m72584x1();
        m64004du();
    }

    /* JADX INFO: renamed from: to */
    public final void m64009to() {
        f45781dy.m72584x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final C12013m9 m64006k4(String str, float f, int i) {
        for (C14717vy c14717vy : this.f45784c5) {
            C12013m9 c12013m9M72580k4 = c14717vy.m72580k4(str, f, i);
            if (c12013m9M72580k4 != null) {
                return c12013m9M72580k4;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.content.pm.PackageInfo] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: k4 */
    public final C14251ot m64007k4(String str, byte b, int i, float f, int i2, boolean z) {
        m64001h4();
        int i3 = i;
        ?? r6 = f;
        int packageInfo = (((((((b & 255) << 8) + (i3 & 255)) << 12) + (PackageManager.getPackageInfo((String) r6, 1092616192) & 4095)) << 4) + i2) ^ (z ? -1 : 0);
        C14251ot c14251otM72581k4 = null;
        Dictionary<Integer, C14251ot>[] dictionaryArr = {null};
        boolean zTryGetValue = this.f45789x1.tryGetValue(str, dictionaryArr);
        Dictionary<Integer, C14251ot> dictionary = dictionaryArr[0];
        if (zTryGetValue) {
            C14251ot[] c14251otArr = {null};
            boolean zTryGetValue2 = dictionary.tryGetValue(Integer.valueOf(packageInfo), c14251otArr);
            c14251otM72581k4 = c14251otArr[0];
            if (zTryGetValue2) {
                return c14251otM72581k4;
            }
        }
        C14717vy[] c14717vyArr = this.f45784c5;
        int length = c14717vyArr.length;
        int i4 = 0;
        ?? r62 = r6;
        while (i4 < length) {
            c14251otM72581k4 = c14717vyArr[i4].m72581k4(str, b, i3, r62 == true ? 1.0f : 0.0f, i2, z);
            if (c14251otM72581k4 != null) {
                break;
            }
            i4++;
            i3 = i;
            r62 = f;
        }
        if (dictionary == null) {
            dictionary = new Dictionary<>();
            this.f45789x1.addItem(str, dictionary);
        }
        dictionary.addItem(Integer.valueOf(packageInfo), c14251otM72581k4);
        return c14251otM72581k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64002k4(byte[] bArr) {
        C9775k4.m48094x1().m48097k4(bArr);
        m64003x1();
    }
}
