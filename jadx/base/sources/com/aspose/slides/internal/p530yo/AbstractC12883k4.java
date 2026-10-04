package com.aspose.slides.internal.p530yo;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p080dd.C3125bv;
import com.aspose.slides.internal.p182ii.InterfaceC4916m4;
import com.aspose.slides.internal.p213jw.C5536c5;
import com.aspose.slides.internal.p213jw.C5546kk;
import com.aspose.slides.internal.p263m2.C6309m9;
import com.aspose.slides.internal.p263m2.InterfaceC6305du;
import com.aspose.slides.internal.p263m2.InterfaceC6306h4;
import com.aspose.slides.internal.p263m2.InterfaceC6307k4;
import com.aspose.slides.internal.p263m2.InterfaceC6308kk;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12762bv;
import com.aspose.slides.internal.p517y2.InterfaceC12765du;
import com.aspose.slides.internal.p517y2.InterfaceC12766dy;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.internal.p517y2.InterfaceC12770jd;
import com.aspose.slides.internal.p517y2.InterfaceC12775m9;
import com.aspose.slides.internal.p517y2.InterfaceC12776ne;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.internal.p517y2.InterfaceC12780u4;
import com.aspose.slides.internal.p517y2.InterfaceC12781um;
import com.aspose.slides.internal.p517y2.InterfaceC12783uz;
import com.aspose.slides.internal.p517y2.InterfaceC12784v4;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.yo.k4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12883k4 implements InterfaceC6305du {

    /* JADX INFO: renamed from: du */
    private boolean f43388du;

    /* JADX INFO: renamed from: dy */
    private C5546kk f43389dy;

    /* JADX INFO: renamed from: h4 */
    private String f43390h4;

    /* JADX INFO: renamed from: k4 */
    private InterfaceC6307k4 f43391k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC12770jd f43392kk;

    /* JADX INFO: renamed from: m9 */
    private InterfaceC6308kk f43393m9;

    /* JADX INFO: renamed from: to */
    private InterfaceC6306h4 f43394to;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC12766dy f43395x1;

    public AbstractC12883k4(C5546kk c5546kk) {
        this.f43389dy = c5546kk;
        this.f43391k4 = (InterfaceC6307k4) C7019kk.m27452k4((Object) c5546kk.m22750k4().mo22779h4(), InterfaceC6307k4.class);
        InterfaceC12766dy interfaceC12766dyMo22801qq = c5546kk.m22750k4().mo22801qq();
        this.f43395x1 = interfaceC12766dyMo22801qq;
        this.f43392kk = (InterfaceC12770jd) C7019kk.m27452k4(interfaceC12766dyMo22801qq.mo59451k4("error-handler"), InterfaceC12770jd.class);
        this.f43388du = ((Boolean) C7019kk.m27464to(this.f43395x1.mo59451k4("format-pretty-print"), Boolean.TYPE)).booleanValue();
        this.f43390h4 = C14052dq.m66570kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m59932kk(InterfaceC12777qq interfaceC12777qq) {
        IGenericEnumerator<InterfaceC12777qq> it = interfaceC12777qq.mo22671yd().iterator();
        while (it.hasNext()) {
            try {
                m59933x1(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017a A[PHI: r2
      0x017a: PHI (r2v5 com.aspose.slides.internal.y2.ix) = (r2v2 com.aspose.slides.internal.y2.ix), (r2v7 com.aspose.slides.internal.y2.ix) binds: [B:113:0x019e, B:103:0x0178] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x017e A[PHI: r2
      0x017e: PHI (r2v3 com.aspose.slides.internal.y2.ix) = (r2v2 com.aspose.slides.internal.y2.ix), (r2v7 com.aspose.slides.internal.y2.ix) binds: [B:113:0x019e, B:103:0x0178] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m59933x1(InterfaceC12777qq interfaceC12777qq) {
        InterfaceC12769ix interfaceC12769ix;
        short sMo22191k4;
        short sMo22191k42;
        short sMo22191k43;
        short sMo22191k44;
        short sMo22191k45;
        short sMo22191k46;
        short sMo22191k47;
        short sMo22191k48;
        short sMo22191k49;
        short sMo22191k410;
        switch (interfaceC12777qq.mo22608fa()) {
            case 1:
                InterfaceC4916m4 interfaceC4916m4 = (InterfaceC4916m4) C7019kk.m27452k4((Object) interfaceC12777qq, InterfaceC4916m4.class);
                InterfaceC6306h4 interfaceC6306h4 = this.f43394to;
                if (interfaceC6306h4 == null) {
                    interfaceC12769ix = (InterfaceC12769ix) interfaceC12777qq;
                    mo59937k4(interfaceC12769ix);
                    if (interfaceC4916m4 == null) {
                    }
                } else if ((interfaceC6306h4.m25860k4() & 1) != 0 && (sMo22191k4 = this.f43394to.mo22191k4(interfaceC12777qq)) != 2) {
                    if (sMo22191k4 == 3) {
                        if (interfaceC4916m4 != null) {
                            m59933x1(interfaceC4916m4.mo20310tq());
                        } else {
                            m59932kk(interfaceC12777qq);
                        }
                        break;
                    } else {
                        interfaceC12769ix = (InterfaceC12769ix) interfaceC12777qq;
                        mo59937k4(interfaceC12769ix);
                        if (interfaceC4916m4 == null) {
                            m59932kk(interfaceC12777qq);
                        } else {
                            m59933x1(interfaceC4916m4.mo20310tq());
                        }
                    }
                }
                mo59946x1(interfaceC12769ix);
                break;
            case 3:
                InterfaceC6306h4 interfaceC6306h42 = this.f43394to;
                if (interfaceC6306h42 == null || ((interfaceC6306h42.m25860k4() & 4) != 0 && (sMo22191k42 = this.f43394to.mo22191k4(interfaceC12777qq)) != 2 && sMo22191k42 != 3)) {
                    mo59943k4((InterfaceC12784v4) interfaceC12777qq);
                }
                break;
            case 4:
                InterfaceC6306h4 interfaceC6306h43 = this.f43394to;
                if (interfaceC6306h43 == null || ((interfaceC6306h43.m25860k4() & 8) != 0 && (sMo22191k43 = this.f43394to.mo22191k4(interfaceC12777qq)) != 2 && sMo22191k43 != 3)) {
                    mo59936k4((InterfaceC12765du) interfaceC12777qq);
                }
                break;
            case 5:
                InterfaceC6306h4 interfaceC6306h44 = this.f43394to;
                if (interfaceC6306h44 == null || ((interfaceC6306h44.m25860k4() & 16) != 0 && (sMo22191k44 = this.f43394to.mo22191k4(interfaceC12777qq)) != 2 && sMo22191k44 != 3)) {
                    mo59942k4((InterfaceC12783uz) interfaceC12777qq);
                }
                break;
            case 6:
                InterfaceC6306h4 interfaceC6306h45 = this.f43394to;
                if (interfaceC6306h45 == null || ((interfaceC6306h45.m25860k4() & 32) != 0 && (sMo22191k45 = this.f43394to.mo22191k4(interfaceC12777qq)) != 2 && sMo22191k45 != 3)) {
                    mo59940k4((InterfaceC12780u4) interfaceC12777qq);
                }
                break;
            case 7:
                InterfaceC6306h4 interfaceC6306h46 = this.f43394to;
                if (interfaceC6306h46 == null || ((interfaceC6306h46.m25860k4() & 64) != 0 && (sMo22191k46 = this.f43394to.mo22191k4(interfaceC12777qq)) != 2 && sMo22191k46 != 3)) {
                    mo59935k4((InterfaceC12762bv) interfaceC12777qq);
                }
                break;
            case 8:
                InterfaceC6306h4 interfaceC6306h47 = this.f43394to;
                if (interfaceC6306h47 == null || ((interfaceC6306h47.m25860k4() & 128) != 0 && (sMo22191k47 = this.f43394to.mo22191k4(interfaceC12777qq)) != 2 && sMo22191k47 != 3)) {
                    mo59938k4((InterfaceC12775m9) interfaceC12777qq);
                }
                break;
            case 9:
                InterfaceC6306h4 interfaceC6306h48 = this.f43394to;
                if (interfaceC6306h48 != null && ((interfaceC6306h48.m25860k4() & 256) == 0 || this.f43394to.mo22191k4(interfaceC12777qq) == 2)) {
                }
                m59932kk(interfaceC12777qq);
                break;
            case 10:
                InterfaceC6306h4 interfaceC6306h49 = this.f43394to;
                if (interfaceC6306h49 == null || ((interfaceC6306h49.m25860k4() & 512) != 0 && (sMo22191k48 = this.f43394to.mo22191k4(interfaceC12777qq)) != 2 && sMo22191k48 != 3)) {
                    mo59939k4((InterfaceC12776ne) interfaceC12777qq);
                }
                break;
            case 11:
                InterfaceC6306h4 interfaceC6306h410 = this.f43394to;
                if (interfaceC6306h410 != null) {
                    if ((interfaceC6306h410.m25860k4() & 1024) != 0 && (sMo22191k49 = this.f43394to.mo22191k4(interfaceC12777qq)) != 2) {
                        if (sMo22191k49 == 3) {
                            m59932kk(interfaceC12777qq);
                        }
                    }
                }
                m59932kk(interfaceC12777qq);
                break;
            case 12:
                InterfaceC6306h4 interfaceC6306h411 = this.f43394to;
                if (interfaceC6306h411 == null || ((interfaceC6306h411.m25860k4() & 2048) != 0 && (sMo22191k410 = this.f43394to.mo22191k4(interfaceC12777qq)) != 2 && sMo22191k410 != 3)) {
                    mo59941k4((InterfaceC12781um) interfaceC12777qq);
                }
                break;
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC3124b3 m59934k4() {
        return this.f43393m9.mo17107k4();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo59935k4(InterfaceC12762bv interfaceC12762bv);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo59936k4(InterfaceC12765du interfaceC12765du);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo59937k4(InterfaceC12769ix interfaceC12769ix);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo59938k4(InterfaceC12775m9 interfaceC12775m9);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo59939k4(InterfaceC12776ne interfaceC12776ne);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo59940k4(InterfaceC12780u4 interfaceC12780u4);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo59941k4(InterfaceC12781um interfaceC12781um);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo59942k4(InterfaceC12783uz interfaceC12783uz);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo59943k4(InterfaceC12784v4 interfaceC12784v4);

    /* JADX INFO: renamed from: x1 */
    public abstract void mo59946x1(InterfaceC12769ix interfaceC12769ix);

    @Override // com.aspose.slides.internal.p263m2.InterfaceC6305du
    /* JADX INFO: renamed from: k4 */
    public final String mo25859k4(InterfaceC12777qq interfaceC12777qq) {
        InterfaceC6308kk interfaceC6308kkMo22733to = this.f43391k4.mo22733to();
        try {
            C6765kp c6765kp = new C6765kp();
            interfaceC6308kkMo22733to.mo17108k4(new C3125bv(c6765kp));
            m59945k4(interfaceC12777qq, interfaceC6308kkMo22733to);
            String string = c6765kp.toString();
            interfaceC6308kkMo22733to.dispose();
            return string;
        } catch (Throwable th) {
            if (interfaceC6308kkMo22733to != null) {
                interfaceC6308kkMo22733to.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59944k4(String str) {
        C5536c5 c5536c5 = new C5536c5((byte) 3, str, "fatal", null, null, null);
        InterfaceC12770jd interfaceC12770jd = this.f43392kk;
        if (interfaceC12770jd != null) {
            interfaceC12770jd.m59452k4(c5536c5);
        }
        throw new C6309m9(82, str);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m59945k4(InterfaceC12777qq interfaceC12777qq, InterfaceC6308kk interfaceC6308kk) {
        if (interfaceC6308kk == null) {
            m59944k4("no-output-specified");
        }
        this.f43393m9 = interfaceC6308kk;
        boolean zM59933x1 = m59933x1(interfaceC12777qq);
        if (zM59933x1) {
            m59934k4().mo13308kk();
        }
        return zM59933x1;
    }
}
