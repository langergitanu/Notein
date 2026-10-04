package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p407st.C10358am;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10548mt;

/* JADX INFO: loaded from: classes3.dex */
class ri7 {

    /* JADX INFO: renamed from: du */
    private int f48594du = -1;

    /* JADX INFO: renamed from: h4 */
    private IFontData[] f48595h4;

    /* JADX INFO: renamed from: k4 */
    protected qah f48596k4;

    /* JADX INFO: renamed from: kk */
    private nt8 f48597kk;

    /* JADX INFO: renamed from: to */
    private klp f48598to;

    /* JADX INFO: renamed from: x1 */
    protected ISlideComponent f48599x1;

    public ri7(qah qahVar) {
        this.f48596k4 = qahVar;
    }

    /* JADX INFO: renamed from: k4 */
    private void m70137k4() {
        C10462h9 c10462h9M70140fa = m70140fa();
        if (c10462h9M70140fa == null) {
            return;
        }
        m70138x1();
        C10548mt c10548mtM50880ck = c10462h9M70140fa.m50880ck();
        if (c10548mtM50880ck != null && c10548mtM50880ck.m51346x1().m50606to()) {
            this.f48594du = c10548mtM50880ck.m51346x1().m50583ar().m50483x1();
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m70138x1() {
        C10358am c10358amMo50862jd = m70140fa().mo50862jd();
        if (c10358amMo50862jd == null) {
            return;
        }
        if (c10358amMo50862jd.m50424c5() != null) {
            this.f48597kk = new nt8(c10358amMo50862jd.m50424c5());
        }
        if (c10358amMo50862jd.m50436x6() != null) {
            this.f48597kk = new nt8(c10358amMo50862jd.m50436x6());
        }
        if (c10358amMo50862jd.m50430ks() != null) {
            this.f48597kk = new nt8(c10358amMo50862jd.m50430ks());
        }
    }

    /* JADX INFO: renamed from: c5 */
    public void mo6946c5() {
    }

    /* JADX INFO: renamed from: ck */
    public void m70139ck() {
        if (this.f48599x1 != null) {
            m70144ks().remove((IShape) this.f48599x1);
        }
    }

    /* JADX INFO: renamed from: fa */
    public final C10462h9 m70140fa() {
        return (C10462h9) this.f48596k4.m69489kk();
    }

    /* JADX INFO: renamed from: ix */
    public final klp m70141ix() {
        if (this.f48598to == null) {
            this.f48598to = new klp(this);
        }
        return this.f48598to;
    }

    /* JADX INFO: renamed from: jd */
    public final void m70142jd() {
        ISlideComponent iSlideComponentM2646up;
        switch (this.f48596k4.m69482dy()) {
            case 1:
                iSlideComponentM2646up = m70144ks().m2646up();
                break;
            case 2:
                iSlideComponentM2646up = m70144ks().m2630k4();
                break;
            case 3:
                iSlideComponentM2646up = m70144ks().m2615fa();
                break;
            case 4:
                iSlideComponentM2646up = m70144ks().m2643ne();
                break;
            case 5:
            case 6:
            default:
                this.f48599x1 = m70144ks().m2630k4();
                throw new NotImplementedException();
            case 7:
                iSlideComponentM2646up = m70144ks().m2618jd();
                break;
            case 8:
                iSlideComponentM2646up = m70144ks().m2644rv();
                break;
            case 9:
                iSlideComponentM2646up = m70144ks().m2653x6();
                break;
            case 10:
                iSlideComponentM2646up = m70144ks().m2647x1((IAudio) null);
                break;
            case 11:
                iSlideComponentM2646up = m70144ks().m2637kk("");
                break;
            case 12:
                iSlideComponentM2646up = m70144ks().m2611c5();
                break;
            case 13:
                iSlideComponentM2646up = m70144ks().m2614dy();
                break;
            case 14:
                iSlideComponentM2646up = m70144ks().m2645to();
                break;
            case 15:
                iSlideComponentM2646up = ((ControlCollection) m70149up().m64735up().getControls()).m1256k4();
                break;
        }
        this.f48599x1 = iSlideComponentM2646up;
    }

    /* JADX INFO: renamed from: ks */
    public final ShapeCollection m70144ks() {
        return this.f48596k4.m69491m9();
    }

    /* JADX INFO: renamed from: ne */
    public final nt8 m70145ne() {
        if (this.f48597kk == null) {
            m70137k4();
        }
        return this.f48597kk;
    }

    /* JADX INFO: renamed from: qq */
    public final IFontData[] m70146qq() {
        if (this.f48595h4 == null) {
            this.f48595h4 = m70148u4().getPresentation().getFontsManager().getFonts();
        }
        return this.f48595h4;
    }

    /* JADX INFO: renamed from: rv */
    public final qah m70147rv() {
        return this.f48596k4.m69480ck();
    }

    /* JADX INFO: renamed from: u4 */
    public ISlideComponent m70148u4() {
        if (this.f48599x1 == null) {
            m70142jd();
        }
        return this.f48599x1;
    }

    /* JADX INFO: renamed from: up */
    public final m4c m70149up() {
        return this.f48596k4.m69493to();
    }

    /* JADX INFO: renamed from: uz */
    public final int m70150uz() {
        return this.f48594du;
    }

    /* JADX INFO: renamed from: wl */
    public final int m70151wl() {
        return this.f48596k4.m69482dy();
    }

    /* JADX INFO: renamed from: x6 */
    public final qah m70152x6() {
        return this.f48596k4;
    }

    /* JADX INFO: renamed from: yj */
    public final sil m70153yj() {
        return this.f48596k4.m69484h4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70143k4(ISlideComponent iSlideComponent) {
        m70139ck();
        this.f48599x1 = iSlideComponent;
    }
}
