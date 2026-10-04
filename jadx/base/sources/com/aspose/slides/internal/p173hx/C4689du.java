package com.aspose.slides.internal.p173hx;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p169hl.C4598to;
import com.aspose.slides.internal.p416tb.C10922yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.hx.du */
/* JADX INFO: loaded from: classes.dex */
public class C4689du extends AbstractC4691k4 {

    /* JADX INFO: renamed from: c5 */
    private boolean f13091c5;

    /* JADX INFO: renamed from: du */
    private boolean f13092du;

    /* JADX INFO: renamed from: dy */
    private boolean f13093dy;

    /* JADX INFO: renamed from: kk */
    private boolean f13096kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f13097m9;

    /* JADX INFO: renamed from: k4 */
    private int f13095k4 = 10;

    /* JADX INFO: renamed from: x1 */
    private int f13099x1 = 1;

    /* JADX INFO: renamed from: to */
    private int f13098to = 1;

    /* JADX INFO: renamed from: h4 */
    private int f13094h4 = 8;

    @Override // com.aspose.slides.internal.p173hx.AbstractC4691k4
    /* JADX INFO: renamed from: k4 */
    public AbstractC3150x6 mo19544k4(AbstractC3150x6 abstractC3150x6) {
        m19543k4();
        return this.f13095k4 == 1 ? new C4598to(abstractC3150x6) : new C4598to(abstractC3150x6, this.f13095k4, this.f13099x1, this.f13098to, this.f13094h4);
    }

    /* JADX INFO: renamed from: kk */
    public final void m19548kk(int i) {
        if (i != 8) {
            this.f13094h4 = i;
            this.f13097m9 = true;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19549x1(int i) {
        if (i != 1) {
            this.f13098to = i;
            this.f13092du = true;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m19543k4() {
        int i;
        if (this.f13091c5 || this.f13096kk || this.f13097m9 || this.f13092du) {
            if (this.f13093dy) {
                if (this.f13099x1 < 3) {
                    this.f13095k4 = 1;
                    return;
                }
                i = 14;
            } else {
                if (this.f13099x1 < 3) {
                    this.f13095k4 = 1;
                    return;
                }
                i = 15;
            }
            this.f13095k4 = i;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19545k4(int i) {
        if (i != 1) {
            this.f13099x1 = i;
            this.f13096kk = true;
        }
    }

    @Override // com.aspose.slides.internal.p173hx.AbstractC4691k4
    /* JADX INFO: renamed from: k4 */
    public void mo19546k4(C10922yj c10922yj) {
        m19543k4();
        c10922yj.m52666kk("/Filter", "/LZWDecode");
        if (this.f13095k4 != 1) {
            c10922yj.m52650k4("/DecodeParms");
            c10922yj.m52643dy();
            c10922yj.m52652k4("/Predictor", this.f13095k4);
            if (this.f13096kk) {
                c10922yj.m52652k4("/Colors", this.f13099x1);
            }
            if (this.f13092du) {
                c10922yj.m52652k4("/Columns", this.f13098to);
            }
            if (this.f13097m9) {
                c10922yj.m52652k4("/BitsPerComponent", this.f13094h4);
            }
            c10922yj.m52640c5();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19547k4(boolean z) {
        this.f13093dy = z;
        this.f13091c5 = true;
    }
}
