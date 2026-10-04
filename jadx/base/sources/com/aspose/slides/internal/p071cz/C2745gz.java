package com.aspose.slides.internal.p071cz;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.gz */
/* JADX INFO: loaded from: classes3.dex */
public final class C2745gz implements IGenericCloneable<C2745gz> {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f8601jd = new C7017h4("ctr", BackupFile.EXTENSION_NOTEIN_FILE, "flat", "rnd", TranslateLanguage.ALBANIAN, "dbl", "sng", "thickThin", "thinThick", "tri");

    /* JADX INFO: renamed from: k4 */
    private int f8606k4 = -1;

    /* JADX INFO: renamed from: x1 */
    private int f8610x1 = 1;

    /* JADX INFO: renamed from: kk */
    private int f8607kk = -1;

    /* JADX INFO: renamed from: to */
    private double f8609to = m12290k4();

    /* JADX INFO: renamed from: du */
    private double f8603du = m12291x1();

    /* JADX INFO: renamed from: h4 */
    private int f8605h4 = 0;

    /* JADX INFO: renamed from: m9 */
    private AbstractC2746h0 f8608m9 = new C2690cx(0);

    /* JADX INFO: renamed from: dy */
    private C2691cz f8604dy = new C2691cz();

    /* JADX INFO: renamed from: c5 */
    private C2691cz f8602c5 = new C2691cz();

    /* JADX INFO: renamed from: k4 */
    public static double m12290k4() {
        return 800000.0d;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m12291x1() {
        return 25400;
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: du, reason: merged with bridge method [inline-methods] */
    public C2745gz cloneT() {
        C2745gz c2745gz = new C2745gz();
        c2745gz.f8606k4 = this.f8606k4;
        c2745gz.f8610x1 = this.f8610x1;
        c2745gz.f8607kk = this.f8607kk;
        c2745gz.f8609to = this.f8609to;
        c2745gz.f8603du = this.f8603du;
        c2745gz.f8605h4 = this.f8605h4;
        c2745gz.f8608m9 = this.f8608m9.cloneT();
        c2745gz.f8604dy = this.f8604dy.cloneT();
        c2745gz.f8602c5 = this.f8602c5.cloneT();
        return c2745gz;
    }

    /* JADX INFO: renamed from: kk */
    public C2691cz m12296kk() {
        return this.f8604dy;
    }

    /* JADX INFO: renamed from: to */
    public C2691cz m12298to() {
        return this.f8602c5;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12293k4(double d) {
        if (d < 0.0d) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f8609to = d;
    }

    /* JADX INFO: renamed from: kk */
    public void m12297kk(int i) {
        this.f8607kk = i;
    }

    /* JADX INFO: renamed from: to */
    public void m12299to(int i) {
        this.f8605h4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public void m12300x1(double d) {
        if (d < 0.0d) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f8603du = d;
        if (d < 9525.0d) {
            this.f8603du = 9525.0d;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m12294k4(int i) {
        this.f8606k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public void m12301x1(int i) {
        this.f8610x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12295k4(AbstractC2746h0 abstractC2746h0) {
        if (this.f8608m9 != abstractC2746h0) {
            if (abstractC2746h0 == null) {
                throw new ArgumentNullException("value");
            }
            this.f8608m9 = abstractC2746h0.cloneT();
        }
    }
}
