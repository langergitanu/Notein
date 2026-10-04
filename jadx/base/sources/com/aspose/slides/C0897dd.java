package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;

/* JADX INFO: renamed from: com.aspose.slides.dd */
/* JADX INFO: loaded from: classes3.dex */
class C0897dd {

    /* JADX INFO: renamed from: k4 */
    private final C14365qy f4575k4;

    public C0897dd(C14365qy c14365qy) {
        this.f4575k4 = c14365qy;
    }

    /* JADX INFO: renamed from: c5 */
    private void m5052c5(C14365qy c14365qy) {
        int type = c14365qy.m69834fa().getType();
        if (type == 25) {
            new tva(c14365qy).m71334k4();
            return;
        }
        if (type == 33) {
            if (c14365qy.m69834fa().m514m9() == 3) {
                new C14377r7(c14365qy).m70029k4();
                return;
            } else {
                new C14377r7(c14365qy).m70032x1();
                return;
            }
        }
        if (type == 62) {
            new ql5(c14365qy).m69695k4();
            return;
        }
        switch (type) {
            case 3:
            case 7:
            case 11:
            case 15:
                new C14718vz(c14365qy).m72604k4();
                break;
            case 4:
            case 8:
            case 12:
            case 16:
                new C14848yi(c14365qy).m73899k4();
                break;
            case 5:
            case 9:
            case 13:
            case 17:
                new C14848yi(c14365qy).m73900x1();
                break;
            case 6:
            case 10:
            case 14:
            case 18:
                new C14441sa(c14365qy).m70497k4();
                break;
            default:
                switch (type) {
                    case 36:
                    case 39:
                    case 42:
                    case 45:
                        new C14377r7(c14365qy).m70030kk();
                        break;
                    case 37:
                    case 40:
                    case 43:
                    case 46:
                        new C14377r7(c14365qy).m70031to();
                        break;
                    case 38:
                    case 41:
                    case 44:
                        new C14377r7(c14365qy).m70032x1();
                        break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ck */
    private void m5053ck(C14365qy c14365qy) {
        if (c14365qy.m69834fa().hasDataTable()) {
            new C13764l6(c14365qy).m64313k4();
        }
    }

    /* JADX INFO: renamed from: du */
    private void m5054du(C14365qy c14365qy) {
        new C14738wh(c14365qy).m72749k4();
    }

    /* JADX INFO: renamed from: dy */
    private void m5055dy(C14365qy c14365qy) {
        if (c14365qy.m69834fa().hasLegend()) {
            boolean zIsChartTypeBar = ChartTypeCharacterizer.isChartTypeBar(c14365qy.m69834fa().getType());
            C13847mr c13847mr = c14365qy.m69865up().get_Item(0);
            if (c14365qy.m69834fa().getType() == 30 || c14365qy.m69834fa().getType() == 27 || c14365qy.m69826c5().m74376fa()) {
                gfh.m6620k4(c13847mr, c14365qy, (Legend) c14365qy.m69834fa().getLegend(), c14365qy.m69865up().get_Item(0));
            } else {
                gfh.m6621k4(zIsChartTypeBar, c13847mr, c14365qy, (Legend) c14365qy.m69834fa().getLegend());
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    private void m5056h4(C14365qy c14365qy) throws Throwable {
        new C14710vt(c14365qy).m72520k4();
    }

    /* JADX INFO: renamed from: jd */
    private void m5057jd(C14365qy c14365qy) {
        IRotation3D rotation3D = c14365qy.m69834fa().getRotation3D();
        boolean rightAngleAxes = rotation3D.getRightAngleAxes();
        rotation3D.setRightAngleAxes(true);
        float depthPercents = ((rotation3D.getDepthPercents() & 65535) / 100.0f) * c14365qy.m69833e0().m64102dy();
        if (c14365qy.m69863u4().m73384dy() != null && c14365qy.m69863u4().m73384dy().hasTitle() && c14365qy.m69863u4().m73384dy().isVisible()) {
            float fOooO00o = OooOOOO.OooO00o(OooOO0O.OooO0O0(c14365qy.m69834fa(), 0) & 65535, 100.0f, depthPercents, depthPercents);
            if (c14365qy.m69863u4().m73384dy().getPosition() == 3) {
                fOooO00o = 0.0f;
            }
            if (!rightAngleAxes) {
                fOooO00o = 0.0f;
            }
            c14365qy.m69863u4().m73408m9().m68740k4(c14365qy, fOooO00o);
        }
        if (c14365qy.m69854ne().m73384dy() != null && c14365qy.m69854ne().m73384dy().hasTitle() && c14365qy.m69854ne().m73384dy().isVisible()) {
            c14365qy.m69854ne().m73408m9().m68740k4(c14365qy, OooOOOO.OooO00o(OooOO0O.OooO0O0(c14365qy.m69834fa(), 0) & 65535, 100.0f, depthPercents, depthPercents));
        }
        if (c14365qy.m69868wl().m73384dy() != null && c14365qy.m69868wl().m73384dy().hasTitle() && c14365qy.m69868wl().m73384dy().isVisible()) {
            c14365qy.m69868wl().m73408m9().m68740k4(c14365qy, (rightAngleAxes ? ((((OooOO0O.OooO0O0(c14365qy.m69834fa(), 0) & 65535) / 100.0f) * depthPercents) / 2.0f) + depthPercents : 0.0f) / 2.0f);
        }
        rotation3D.setRightAngleAxes(rightAngleAxes);
    }

    /* JADX INFO: renamed from: kk */
    private void m5059kk(C14365qy c14365qy) throws Throwable {
        if (m5062x1(c14365qy)) {
            return;
        }
        c14365qy.m69835g8();
        c14365qy.f48440k4.m7072k4();
        c14365qy.m69836h4();
        m5061to(c14365qy);
        m5054du(c14365qy);
        m5052c5(c14365qy);
        m5056h4(c14365qy);
        m5057jd(c14365qy);
        m5053ck(c14365qy);
        c14365qy.m69853m9();
        m5060m9(c14365qy);
        m5055dy(c14365qy);
    }

    /* JADX INFO: renamed from: m9 */
    private void m5060m9(C14365qy c14365qy) {
        if (c14365qy.m69834fa().hasTitle()) {
            c14365qy.m69828ck().m68739k4(c14365qy);
        }
    }

    /* JADX INFO: renamed from: to */
    private void m5061to(C14365qy c14365qy) {
        c14365qy.m69827c6().m64126x6();
        c14365qy.m69825bz().m64126x6();
        c14365qy.m69862ts().m64126x6();
        c14365qy.m69827c6().mo5519k4();
        c14365qy.m69825bz().mo5519k4();
        c14365qy.m69862ts().mo5519k4();
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m5062x1(C14365qy c14365qy) {
        return c14365qy.m69865up().size() == 0 || C14365qy.m69819to(c14365qy.m69865up()) == 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5063k4() {
        try {
            m5058k4(this.f4575k4);
            m5059kk(this.f4575k4);
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m5058k4(C14365qy c14365qy) {
        new C1097fe().m6146k4(c14365qy);
    }
}
