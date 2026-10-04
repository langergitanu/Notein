package com.aspose.slides;

import android.content.pm.PackageManager;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p077d8.C3047dy;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3099wl;
import com.aspose.slides.internal.p077d8.C3101wy;
import com.aspose.slides.internal.p077d8.C3108y2;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p306ny.C6963x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.zn */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC14897zn implements IDisposable {

    /* JADX INFO: renamed from: c5 */
    private C4317dy f50614c5;

    /* JADX INFO: renamed from: ck */
    private boolean f50615ck;

    /* JADX INFO: renamed from: du */
    protected final C12019um f50616du;

    /* JADX INFO: renamed from: dy */
    private C12025x6 f50617dy;

    /* JADX INFO: renamed from: h4 */
    protected final Stack<C4317dy> f50618h4;

    /* JADX INFO: renamed from: jd */
    private kg7 f50619jd;

    /* JADX INFO: renamed from: k4 */
    protected C12009k4 f50620k4;

    /* JADX INFO: renamed from: kk */
    protected boolean f50621kk;

    /* JADX INFO: renamed from: m9 */
    protected C11913yj f50622m9;

    /* JADX INFO: renamed from: to */
    protected final boolean f50623to;

    /* JADX INFO: renamed from: x1 */
    protected AbstractC12008jd f50624x1;

    public AbstractC14897zn(AbstractC12008jd abstractC12008jd) {
        this.f50617dy = new C12025x6();
        Stack<C4317dy> stack = new Stack<>(3);
        this.f50618h4 = stack;
        this.f50617dy = new C12025x6(0.0f, 0.0f);
        C12019um c12019um = new C12019um(C12019um.m56799c5());
        this.f50616du = c12019um;
        c12019um.m56817kk(c12019um.m56816kk() | 2048);
        this.f50624x1 = abstractC12008jd;
        this.f50622m9 = abstractC12008jd.mo17577u4().m55760h4();
        stack.push(new C4317dy(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        float[] fArrM55776k4 = abstractC12008jd.mo17577u4().m55776k4();
        this.f50614c5 = new C4317dy(fArrM55776k4[0], fArrM55776k4[1], fArrM55776k4[2], fArrM55776k4[3], fArrM55776k4[4], fArrM55776k4[5]);
        this.f50624x1.mo17560kk(6);
        this.f50624x1.mo17586x1(4);
        this.f50624x1.mo17481h4(4);
        this.f50624x1.mo17478dy(4);
        this.f50620k4 = new C12009k4(C7019kk.m27462to(Float.valueOf(abstractC12008jd.mo17580uz().m56550c5()), 13), C7019kk.m27462to(Float.valueOf(abstractC12008jd.mo17580uz().m56575x1()), 13));
        this.f50621kk = true;
        this.f50623to = false;
    }

    /* JADX INFO: renamed from: k4 */
    private double m74596k4(C9790ts c9790ts, double d, String str, int i) {
        double dM48193k4 = 0.0d;
        if (c9790ts != null && c9790ts.m48220lr() != null) {
            int iM48287x1 = i < 0 ? Integer.MIN_VALUE : c9790ts.m48221m9().m48107x1(i).m48287x1();
            int i2 = 0;
            while (i2 < str.length()) {
                int iCharAt = str.charAt(i2);
                if (C3047dy.m12855ix(str.charAt(i2))) {
                    char cCharAt = str.charAt(i2);
                    i2++;
                    iCharAt = C14117yj.m67525k4(cCharAt, str.charAt(i2));
                }
                int iM48287x12 = c9790ts.m48221m9().m48107x1(iCharAt).m48287x1();
                if (iM48287x1 != Integer.MIN_VALUE) {
                    dM48193k4 = ((c9790ts.m48193k4(((long) iM48287x1) & 4294967295L, 4294967295L & ((long) iM48287x12)) / ((double) c9790ts.m48175c5())) * d) + dM48193k4;
                }
                i2++;
                iM48287x1 = iM48287x12;
            }
        }
        return dM48193k4;
    }

    /* JADX INFO: renamed from: x1 */
    private C11896dy m74606x1(List<C12025x6> list, azo azoVar) {
        if (azoVar.m3905jd() == 0) {
            return null;
        }
        C11896dy c11896dyM3893k4 = azo.m3893k4(azoVar.m3905jd(), azoVar.m3902fa(), azoVar.m3931yj(), new float[]{0.0f});
        list.reverse();
        C11896dy c11896dyM74599k4 = m74599k4(list, c11896dyM3893k4, azoVar, azoVar.m3905jd());
        list.reverse();
        return c11896dyM74599k4;
    }

    /* JADX INFO: renamed from: ar */
    public final AbstractC12008jd m74608ar() {
        return this.f50624x1;
    }

    /* JADX INFO: renamed from: c5 */
    public abstract C4317dy mo67706c5();

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        m74628uz();
        m74634x1(true);
    }

    /* JADX INFO: renamed from: du */
    public abstract float mo67707du();

    /* JADX INFO: renamed from: dy */
    public abstract int mo67708dy();

    /* JADX INFO: renamed from: fa */
    public abstract C12007ix mo64335fa();

    /* JADX INFO: renamed from: h4 */
    public abstract float mo67709h4();

    /* JADX INFO: renamed from: ix */
    public void mo72270ix() {
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo64337k4(IPPImage iPPImage, C12007ix c12007ix, C12007ix c12007ix2, qta qtaVar);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo67710k4(C4317dy c4317dy);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo64338k4(C11896dy c11896dy, azo azoVar, C0962es c0962es);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo64339k4(AbstractC12002ck abstractC12002ck, float f, float f2, float f3, float f4);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo64340k4(AbstractC12002ck abstractC12002ck, int i, int i2);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo64341k4(AbstractC12002ck abstractC12002ck, int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo64342k4(C12007ix c12007ix);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo64343k4(String str, C12007ix c12007ix, qy7 qy7Var);

    /* JADX INFO: renamed from: kk */
    public void mo68797kk() {
    }

    /* JADX INFO: renamed from: ks */
    public final C4317dy m74623ks() {
        C4317dy c4317dy = this.f50614c5;
        if (c4317dy != null) {
            return c4317dy.m17345kk();
        }
        return null;
    }

    /* JADX INFO: renamed from: m9 */
    public abstract int mo67711m9();

    /* JADX INFO: renamed from: ne */
    public void m74624ne() {
    }

    /* JADX INFO: renamed from: qq */
    public final C12009k4 m74625qq() {
        return this.f50620k4;
    }

    /* JADX INFO: renamed from: rv */
    public final C4317dy m74626rv() {
        C4317dy c4317dyPop = this.f50618h4.pop();
        m74632x1(c4317dyPop);
        return c4317dyPop;
    }

    /* JADX INFO: renamed from: to */
    public void mo68798to() {
        this.f50617dy.m56891k4(0.0f);
        this.f50617dy.m56898x1(0.0f);
    }

    /* JADX INFO: renamed from: u4 */
    public final C12025x6 m74627u4() {
        if (C14116yg.m67480k4(this.f50617dy.m56895kk()) + C14116yg.m67480k4(this.f50617dy.m56897x1()) < 1.0E-5d) {
            C4317dy c4317dyM13223k4 = C3108y2.m13223k4(mo67706c5().m17345kk());
            C12025x6[] c12025x6Arr = {new C12025x6(1.0f, 1.0f)};
            C3108y2.m13226k4(c4317dyM13223k4, c12025x6Arr);
            float fM56897x1 = c12025x6Arr[0].m56897x1() * c12025x6Arr[0].m56897x1();
            double dM67496rv = C14116yg.m67496rv(com.aspose.slides.internal.p040bg.OooO00o.OooO00o(c12025x6Arr[0], c12025x6Arr[0].m56895kk(), fM56897x1));
            this.f50617dy = new C12025x6((float) (((double) c12025x6Arr[0].m56897x1()) / dM67496rv), (float) (((double) c12025x6Arr[0].m56895kk()) / dM67496rv));
        }
        return this.f50617dy;
    }

    /* JADX INFO: renamed from: uz */
    public final void m74628uz() {
        C11913yj c11913yj;
        if (this.f50623to || (c11913yj = this.f50622m9) == null) {
            return;
        }
        this.f50624x1.mo17588x1(c11913yj);
    }

    /* JADX INFO: renamed from: wl */
    public final boolean m74629wl() {
        return this.f50624x1.mo17603x6() == 4;
    }

    /* JADX INFO: renamed from: x6 */
    public void m74635x6() {
    }

    /* JADX INFO: renamed from: yj */
    public final kg7 m74636yj() {
        return this.f50619jd;
    }

    public AbstractC14897zn(C12009k4 c12009k4) {
        this(c12009k4, false);
    }

    /* JADX INFO: renamed from: k4 */
    public static float m74597k4(C14251ot c14251ot, AbstractC12008jd abstractC12008jd) {
        C12004dy c12004dyM56651x1 = c14251ot.m68811k4().m56651x1();
        return (c14251ot.m68811k4().m56644k4(abstractC12008jd) * c12004dyM56651x1.m56536x1(c14251ot.m68816kk())) / c12004dyM56651x1.m56526du(c14251ot.m68816kk());
    }

    /* JADX INFO: renamed from: x1 */
    public static C12023wl m74607x1(C12007ix c12007ix) {
        return new C12023wl(C7019kk.m27462to(Double.valueOf(C14116yg.m67479k4(C14116yg.m67478k4(c12007ix.m56557jd() + c12007ix.m56550c5(), 1, (short) 1), (short) 1)), 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67479k4(C14116yg.m67478k4(c12007ix.m56551ck() + c12007ix.m56575x1(), 1, (short) 1), (short) 1)), 14));
    }

    /* JADX INFO: renamed from: kk */
    public final void m74622kk(C4317dy c4317dy) {
        m74615k4(c4317dy, true);
    }

    public AbstractC14897zn(C12009k4 c12009k4, boolean z) {
        this.f50617dy = new C12025x6();
        Stack<C4317dy> stack = new Stack<>(3);
        this.f50618h4 = stack;
        this.f50617dy = new C12025x6(0.0f, 0.0f);
        C12019um c12019um = new C12019um(C12019um.m56799c5());
        this.f50616du = c12019um;
        c12019um.m56817kk(c12019um.m56816kk() | 2048);
        if (c12009k4 != null) {
            this.f50620k4 = c12009k4;
            this.f50621kk = z;
        } else {
            this.f50620k4 = new C12009k4(32, 32);
            this.f50621kk = true;
        }
        this.f50620k4.m56332k4(96.0f, 96.0f);
        this.f50624x1 = AbstractC12008jd.m56582k4((AbstractC12002ck) this.f50620k4);
        stack.push(new C4317dy(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        this.f50614c5 = new C4317dy(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        this.f50624x1.mo17560kk(6);
        this.f50624x1.mo17586x1(4);
        this.f50624x1.mo17481h4(4);
        this.f50624x1.mo17478dy(4);
        this.f50623to = true;
    }

    /* JADX INFO: renamed from: k4 */
    private C11896dy m74598k4(List<C12025x6> list, azo azoVar) {
        if (azoVar.m3897c5() != 0) {
            return m74599k4(list, azo.m3893k4(azoVar.m3897c5(), azoVar.m3898ck(), azoVar.m3924up(), new float[]{0.0f}), azoVar, azoVar.m3897c5());
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public void mo68800x1() {
    }

    /* JADX INFO: renamed from: k4 */
    private C11896dy m74599k4(List<C12025x6> list, C11896dy c11896dy, azo azoVar, byte b) {
        if (c11896dy == null) {
            return null;
        }
        C12025x6 c12025x6Clone = list.get_Item(0).Clone();
        float fM3906k4 = (float) (azoVar.m3906k4() < 2.0d ? 2.0d : azoVar.m3906k4());
        float fM56575x1 = c11896dy.m55523c5().m56575x1();
        double d = (fM56575x1 * fM3906k4) - (fM56575x1 / 2.0f);
        double dM67496rv = C14116yg.m67496rv(C14116yg.m67469du(C14116yg.m67480k4(list.get_Item(1).m56895kk() - c12025x6Clone.m56895kk()), 2.0d) + C14116yg.m67469du(C14116yg.m67480k4(list.get_Item(1).m56897x1() - c12025x6Clone.m56897x1()), 2.0d));
        if (dM67496rv < d && list.size() > 3) {
            list.removeAt(0);
            while (dM67496rv < d && list.size() > 2) {
                list.removeAt(0);
                dM67496rv = C14116yg.m67496rv(C14116yg.m67469du(C14116yg.m67480k4(list.get_Item(0).m56895kk() - c12025x6Clone.m56895kk()), 2.0d) + C14116yg.m67469du(C14116yg.m67480k4(list.get_Item(0).m56897x1() - c12025x6Clone.m56897x1()), 2.0d));
            }
            list.insertItem(0, c12025x6Clone.Clone());
        }
        double dM67498to = C14116yg.m67498to(list.get_Item(1).m56895kk() - c12025x6Clone.m56895kk(), list.get_Item(1).m56897x1() - c12025x6Clone.m56897x1());
        C12025x6 c12025x6Clone2 = list.get_Item(0).Clone();
        if (b == 1) {
            c12025x6Clone2.m56891k4(c12025x6Clone2.m56897x1() + ((float) (C14116yg.m67470dy(dM67498to) * d)));
            c12025x6Clone2.m56898x1(c12025x6Clone2.m56895kk() + ((float) (C14116yg.m67495m9(dM67498to) * d)));
        } else {
            double d2 = fM3906k4;
            c12025x6Clone2.m56891k4(c12025x6Clone2.m56897x1() + ((float) (C14116yg.m67470dy(dM67498to) * d2)));
            c12025x6Clone2.m56898x1(c12025x6Clone2.m56895kk() + ((float) (C14116yg.m67495m9(dM67498to) * d2)));
        }
        list.removeAt(0);
        list.insertItem(0, c12025x6Clone2.Clone());
        C11913yj c11913yj = new C11913yj(fM3906k4, 0.0f, 0.0f, fM3906k4, c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk());
        c11913yj.m55762k4(90.0f);
        c11913yj.m55762k4((float) ((dM67498to * 180.0d) / 3.141592653589793d));
        c11896dy.m55577x1(c11913yj);
        return c11896dy;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74630x1(float f, float f2) {
        m74631x1(f, f2, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C11896dy m74609k4(C11896dy c11896dy, azo azoVar, C11896dy[] c11896dyArr, C11896dy[] c11896dyArr2) {
        C11896dy c11896dy2 = new C11896dy(c11896dy.m55565kk(), c11896dy.m55571to());
        c11896dy2.m55526dy();
        List<C12025x6> list = new List<>(AbstractC14092to.m67204k4((Object[]) c11896dy2.m55565kk()));
        c11896dyArr[0] = m74598k4(list, azoVar);
        c11896dyArr2[0] = m74606x1(list, azoVar);
        c11896dy2.m55527fa();
        c11896dy2.m55564kk(list.toArray(new C12025x6[0]));
        return c11896dy2;
    }

    /* JADX INFO: renamed from: x1 */
    public void m74631x1(float f, float f2, int i) {
        C4317dy c4317dyM74623ks = m74623ks();
        if (c4317dyM74623ks != null) {
            c4317dyM74623ks.m17336k4(f, f2, i);
        }
        m74632x1(c4317dyM74623ks);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12003du m74600k4(C12003du c12003du) {
        return m74601k4(c12003du, 157);
    }

    /* JADX INFO: renamed from: x1 */
    public void mo68801x1(IHyperlink iHyperlink) {
    }

    /* JADX INFO: renamed from: k4 */
    public static C12003du m74601k4(C12003du c12003du, int i) {
        return C12003du.m56398k4(C7019kk.m27462to(Double.valueOf((((255.0d - ((double) i)) * (((double) (c12003du.m56501c5() & 255)) / 255.0d)) / 255.0d) * 255.0d), 14), c12003du.m56507jd() & 255, c12003du.m56502ck() & 255, c12003du.m56505fa() & 255);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74632x1(C4317dy c4317dy) {
        if (c4317dy == null) {
            c4317dy = new C4317dy();
        }
        this.f50614c5 = c4317dy;
        mo67710k4(c4317dy);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12015qq m74610k4(String str, C14251ot c14251ot, qy7 qy7Var, int i) {
        boolean z;
        float f;
        String strM68812k4 = c14251ot.m68812k4(str);
        C6765kp c6765kp = new C6765kp();
        for (int i2 = 0; i2 < strM68812k4.length(); i2++) {
            char cCharAt = strM68812k4.charAt(i2);
            if (cCharAt != 8237 && cCharAt != 8236 && cCharAt != 8238 && !C3047dy.m12874kk((int) cCharAt)) {
                c6765kp.m26780k4(cCharAt);
            }
        }
        String string = c6765kp.toString();
        float f2 = 0.0f;
        C12015qq c12015qq = new C12015qq(0.0f, 0.0f);
        if (string.length() > 0) {
            float fM56636c5 = (c14251ot.m68811k4().m56636c5() * 4.0f) / 3.0f;
            c12015qq.m56700x1(c14251ot.m68819x1().m23112ck());
            if (qy7Var.m69921up() == 1 && C14117yj.m67517dy(string.charAt(0))) {
                fM56636c5 = ((c14251ot.m68811k4().m56636c5() * c14251ot.m68808du()) * 4.0f) / 3.0f;
                string = C14113y2.m67358c5(string);
                z = true;
            } else {
                z = false;
            }
            String strM67368h4 = string;
            int length = 0;
            boolean z2 = false;
            while (length < strM67368h4.length()) {
                int iCharAt = strM67368h4.charAt(length);
                if (C3047dy.m12855ix(strM67368h4.charAt(length))) {
                    int i3 = length + 1;
                    iCharAt = C14117yj.m67525k4(strM67368h4.charAt(length), strM67368h4.charAt(i3));
                    if (strM67368h4.length() <= 2 || !C3047dy.m12869k4(iCharAt)) {
                        f = f2;
                        length = i3;
                    } else {
                        C6963x1 c6963x1 = new C6963x1(this.f50624x1, this.f50616du);
                        try {
                            synchronized (C3101wy.m13201k4()) {
                                f = f2;
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= 3) {
                                        length = i3;
                                        break;
                                    }
                                    try {
                                        c12015qq.m56695k4(c6963x1.m27219k4(strM67368h4, c14251ot.m68811k4()).m56699x1());
                                        length = strM67368h4.length();
                                        break;
                                    } catch (RuntimeException e) {
                                        if (i4 == 2) {
                                            C3085sv.m13082k4(e);
                                        }
                                        i4++;
                                    }
                                }
                            }
                            c6963x1.dispose();
                            if (length == strM67368h4.length()) {
                                break;
                            }
                        } catch (Throwable th) {
                            c6963x1.dispose();
                            throw th;
                        }
                    }
                } else {
                    f = f2;
                }
                float fM48196k4 = c14251ot.m68819x1().m23120k4().m48196k4(iCharAt, fM56636c5);
                if (fM48196k4 == f) {
                    z2 = true;
                }
                if (fM56636c5 >= 45.0f || (strM67368h4.length() > 1 && C14113y2.m67359c5(strM67368h4, " ") && fM56636c5 < 9.3d)) {
                    c12015qq.m56695k4(c12015qq.m56699x1() + fM48196k4);
                } else {
                    c12015qq.m56695k4((((float) C14116yg.m67497to(fM48196k4 * 8.0f)) / 8.0f) + c12015qq.m56699x1());
                }
                length++;
                f2 = f;
            }
            if (m74604k4(qy7Var, fM56636c5, c14251ot.m68819x1().m23120k4(), strM67368h4)) {
                c12015qq.m56695k4(c12015qq.m56699x1() + ((float) m74596k4(c14251ot.m68819x1().m23120k4(), fM56636c5, strM67368h4, i)));
            }
            if (z2) {
                c14251ot.m68819x1().m23120k4().m48179dq();
            }
            if (z) {
                strM67368h4 = C14113y2.m67368h4(strM67368h4);
            }
            if (C14116yg.m67480k4(qy7Var.m69930x6()) > 0.005d || !C14064he.m66715kk(qy7Var.m69883bv())) {
                int i5 = 0;
                for (int i6 = 0; i6 < strM67368h4.length(); i6++) {
                    if (!C3047dy.m12849ck(strM67368h4.charAt(i6))) {
                        i5++;
                    }
                }
                if (!C14064he.m66715kk(qy7Var.m69883bv())) {
                    c12015qq.m56695k4(qy7Var.m69883bv() * i5);
                }
                c12015qq.m56695k4((i5 * qy7Var.m69930x6()) + c12015qq.m56699x1());
            }
        }
        return c12015qq;
    }

    /* JADX INFO: renamed from: x1 */
    public void mo68802x1(C12007ix c12007ix, azo azoVar, C0962es c0962es) {
        C11896dy c11896dy = new C11896dy();
        try {
            c11896dy.m55542k4(c12007ix.Clone());
            mo64338k4(c11896dy, azoVar, c0962es);
        } finally {
            c11896dy.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C12015qq m74611k4(String str, qy7 qy7Var) {
        return m74610k4(str, qy7Var.m69882b3(), qy7Var, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74633x1(String str, C12007ix c12007ix, qy7 qy7Var) {
        int i;
        qy7 qy7Var2;
        C14251ot c14251ot;
        C14251ot c14251otM69882b3 = qy7Var.m69882b3();
        qy7 qy7VarM69898k4 = !C14064he.m66715kk(c14251otM69882b3.m68808du()) ? qy7Var.m69898k4(qy7Var.m69915rv() * c14251otM69882b3.m68808du()) : qy7Var.cloneT();
        C14251ot c14251otM69882b32 = qy7VarM69898k4.m69882b3();
        C6765kp c6765kp = new C6765kp(str.length());
        boolean zM74605k4 = m74605k4(str, 0);
        int i2 = 0;
        while (i2 < str.length()) {
            while (true) {
                i = i2 + 1;
                c6765kp.m26780k4(str.charAt(i2));
                if (i >= str.length() || zM74605k4 != m74605k4(str, i)) {
                    break;
                } else {
                    i2 = i;
                }
            }
            String string = c6765kp.toString();
            if (zM74605k4) {
                string = C14113y2.m67371jd(string);
                qy7Var2 = qy7VarM69898k4;
                c14251ot = c14251otM69882b32;
            } else {
                qy7Var2 = qy7Var;
                c14251ot = c14251otM69882b3;
            }
            mo68705k4(string, c12007ix.Clone(), qy7Var2, c14251ot);
            if (i < str.length()) {
                c12007ix.m56567kk(m74610k4(string, c14251ot, qy7Var2, Integer.MIN_VALUE).Clone().m56699x1(), 0.0f);
                zM74605k4 = m74605k4(str, i);
                c6765kp.m26809x1(0, c6765kp.m26807x1());
            }
            i2 = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r4v5, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.content.pm.PackageInfo, int] */
    /* JADX INFO: renamed from: k4 */
    public static C12023wl m74602k4(C12023wl c12023wl, C12012lr c12012lr, float[] fArr) {
        fArr[0] = 1075209830;
        if (c12023wl.m56865x1() * 2.35f < c12012lr.m56619h4().mo15760yj() && c12023wl.m56862kk() * 2.35f < c12012lr.m56619h4().mo15757m9()) {
            return new C12023wl(PackageManager.getPackageInfo((String) c12023wl.m56865x1(), (int) fArr[0]), PackageManager.getPackageInfo((String) c12023wl.m56862kk(), (int) fArr[0]));
        }
        fArr[0] = 1065353216;
        return c12012lr.m56619h4().m56329fa();
    }

    /* JADX INFO: renamed from: x1 */
    public void m74634x1(boolean z) {
        if (this.f50615ck) {
            return;
        }
        if (z) {
            if (this.f50623to) {
                this.f50624x1.dispose();
                this.f50624x1 = null;
            }
            if (this.f50621kk) {
                this.f50620k4.dispose();
                this.f50620k4 = null;
                this.f50614c5 = null;
                this.f50619jd = null;
                this.f50617dy = null;
                C11913yj c11913yj = this.f50622m9;
                if (c11913yj != null) {
                    c11913yj.dispose();
                    this.f50622m9 = null;
                }
                C12019um c12019um = this.f50616du;
                if (c12019um != null) {
                    c12019um.dispose();
                }
                Stack<C4317dy> stack = this.f50618h4;
                if (stack != null) {
                    stack.clear();
                }
            }
        }
        this.f50615ck = true;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo68791k4() {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74612k4(float f, float f2) {
        m74613k4(f, f2, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public void m74613k4(float f, float f2, int i) {
        C4317dy c4317dyM74623ks = m74623ks();
        if (c4317dyM74623ks != null) {
            c4317dyM74623ks.m17349x1(f, f2, i);
        }
        m74632x1(c4317dyM74623ks);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo68792k4(IHyperlink iHyperlink) {
    }

    /* JADX INFO: renamed from: k4 */
    public void mo68793k4(IPPImage iPPImage, C12007ix c12007ix, qta qtaVar) {
        mo64337k4(iPPImage, c12007ix.Clone(), C12007ix.m56544k4(((PPImage) iPPImage).m2133kk()).Clone(), qtaVar);
    }

    /* JADX INFO: renamed from: k4 */
    public void m74614k4(azo azoVar, C12025x6... c12025x6Arr) {
        C11896dy c11896dy = new C11896dy();
        try {
            c11896dy.m55564kk(c12025x6Arr);
            mo64338k4(c11896dy, azoVar, (C0962es) null);
        } finally {
            c11896dy.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74615k4(C4317dy c4317dy, boolean z) {
        this.f50618h4.push(this.f50614c5);
        if (!z) {
            m74632x1(c4317dy);
            return;
        }
        C11913yj c11913yjM13229x1 = C3108y2.m13229x1(c4317dy);
        C11913yj c11913yjM13229x12 = C3108y2.m13229x1(this.f50614c5);
        c11913yjM13229x12.m55787x1(c11913yjM13229x1);
        m74632x1(C3108y2.m13224k4(c11913yjM13229x12));
    }

    /* JADX INFO: renamed from: k4 */
    public void mo68794k4(C12007ix c12007ix, azo azoVar, C0962es c0962es) {
        C11896dy c11896dy = new C11896dy();
        try {
            c11896dy.m55578x1(c12007ix.Clone());
            mo64338k4(c11896dy, azoVar, c0962es);
        } finally {
            c11896dy.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo68795k4(C12014ne c12014ne, azo azoVar, C0962es c0962es) {
        C11896dy c11896dy = new C11896dy();
        try {
            c11896dy.m55579x1(c12014ne.Clone());
            mo64338k4(c11896dy, azoVar, c0962es);
        } finally {
            c11896dy.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74616k4(kg7 kg7Var) {
        this.f50619jd = kg7Var;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo68796k4(String str) {
    }

    /* JADX INFO: renamed from: k4 */
    public void mo68705k4(String str, C12007ix c12007ix, qy7 qy7Var, C14251ot c14251ot) {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74617k4(boolean z) {
        this.f50624x1.mo17481h4(z ? 4 : 3);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m74618k4(Picture picture) {
        byte[] bArrM2134m9;
        if (picture == null || picture.getImage() == null || ((PPImage) picture.getImage()).m2133kk().m56679kk() || !tta.m71309k4(picture.getImageTransform()) || (bArrM2134m9 = ((PPImage) picture.getImage()).m2134m9()) == null) {
            return false;
        }
        if (C3099wl.m13196to(bArrM2134m9) || C3099wl.m13170du(bArrM2134m9) || C3099wl.m13171dy(bArrM2134m9) || C3099wl.m13194kk(bArrM2134m9) || C3099wl.m13199x1(bArrM2134m9)) {
            return true;
        }
        return C7019kk.m27469x1(this, vhx.class) && C3099wl.m13172h4(bArrM2134m9);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m74603k4(cxj cxjVar, C12023wl c12023wl, C12012lr c12012lr, C12007ix c12007ix) {
        if (c12023wl.m56865x1() >= c12012lr.m56619h4().mo15760yj() && c12023wl.m56862kk() >= c12012lr.m56619h4().mo15757m9()) {
            return false;
        }
        AbstractC12002ck abstractC12002ckM4846bv = cxjVar.m4846bv();
        return ((!C3099wl.m13195m9(cxjVar.m4845ar().m27674du()) || cxjVar.m4852lr() != 5) && C3085sv.m13089k4((float) abstractC12002ckM4846bv.mo15760yj(), c12007ix.m56550c5()) && C3085sv.m13089k4((float) abstractC12002ckM4846bv.mo15757m9(), c12007ix.m56575x1())) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m74619k4(C11896dy c11896dy) {
        if (c11896dy.m55525du() != 0) {
            for (byte b : c11896dy.m55571to()) {
                if ((b & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m74620k4(C11896dy c11896dy, azo azoVar, cxj cxjVar) {
        return m74621k4(c11896dy, azoVar, cxjVar, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m74621k4(C11896dy c11896dy, azo azoVar, cxj cxjVar, boolean z) {
        if (cxjVar.m5674h4() == null) {
            return false;
        }
        return ((c11896dy.m55525du() == 4 && cxjVar.m5674h4().f3916m9 == 5) || (cxjVar.m4860v4() && cxjVar.m4852lr() == 1)) && azoVar == null && cxjVar.m4858up() == 1 && (z || (cxjVar.m4851ks().m56557jd() >= 0.0f && cxjVar.m4851ks().m56551ck() >= 0.0f)) && !cxjVar.m4859uz();
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m74604k4(qy7 qy7Var, float f, C9790ts c9790ts, String str) {
        if (str.length() <= 1) {
            return false;
        }
        c9790ts.m48171ak();
        boolean z = C3047dy.m12881to((int) str.charAt(0)) == 2;
        lrb lrbVar = qy7Var.f48466du;
        boolean z2 = lrbVar != null && f >= lrbVar.getKerningMinimalSize() && !z && lrbVar.getKerningMinimalSize() > 0.0f;
        if (qy7Var.m69921up() == 1 && C14117yj.m67517dy(str.charAt(0))) {
            return false;
        }
        if (C14113y2.m67359c5(str, " ") && (!c9790ts.m48173b3() || qy7Var.m69930x6() != 0.0f)) {
            return false;
        }
        if (!z2 || c9790ts.m48220lr() == null) {
            return z2;
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m74605k4(String str, int i) {
        char cCharAt = str.charAt(i);
        return C14117yj.m67519h4(cCharAt) && C14117yj.m67517dy(cCharAt);
    }
}
