package com.aspose.slides.internal.p365qn;

import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: renamed from: com.aspose.slides.internal.qn.du */
/* JADX INFO: loaded from: classes4.dex */
public class C9894du {

    /* JADX INFO: renamed from: kk */
    private static final C11697x1 f35733kk = new C11697x1("en-US");

    /* JADX INFO: renamed from: k4 */
    private float f35734k4;

    /* JADX INFO: renamed from: x1 */
    private int f35735x1;

    public C9894du(float f, int i) {
        m48719k4(f);
        m48720k4(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m48718k4() {
        return this.f35735x1;
    }

    public String toString() {
        return C14113y2.m67391k4(f35733kk, "{0}{1}", Float.valueOf(this.f35734k4), m48717x1(m48718k4()));
    }

    /* JADX INFO: renamed from: x1 */
    public final float m48721x1() {
        return this.f35734k4;
    }

    /* JADX INFO: renamed from: x1 */
    public static String m48717x1(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "px" : TranslateLanguage.PORTUGUESE : BackupFile.EXTENSION_NOTEIN_FILE : "mm" : "cm";
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48719k4(float f) {
        this.f35734k4 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48720k4(int i) {
        this.f35735x1 = i;
    }
}
