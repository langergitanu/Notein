package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p077d8.C3099wl;
import com.aspose.slides.internal.p077d8.C3108y2;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p129fe.C3978du;
import com.aspose.slides.internal.p129fe.C3981h4;
import com.aspose.slides.internal.p129fe.C3982jd;
import com.aspose.slides.internal.p129fe.C3986m9;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p302nm.C6926m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p323op.C7130du;
import com.aspose.slides.internal.p323op.C7131h4;
import com.aspose.slides.internal.p323op.C7134m9;
import com.aspose.slides.internal.p323op.C7135to;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p504xm.C12549du;
import com.aspose.slides.internal.p505xn.C12567ne;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class ku2 extends AbstractC1137ga<Picture, ku2> implements IPictureEffectiveData {

    /* JADX INFO: renamed from: k4 */
    String f45874k4 = null;

    /* JADX INFO: renamed from: kk */
    private ImageTransformOCollectionEffectiveData f45875kk = new ImageTransformOCollectionEffectiveData();

    /* JADX INFO: renamed from: to */
    private Presentation f45876to;

    /* JADX INFO: renamed from: x1 */
    PPImage f45877x1;

    @Override // com.aspose.slides.IPictureEffectiveData
    public final IPPImage getImage() {
        return this.f45877x1;
    }

    @Override // com.aspose.slides.IPictureEffectiveData
    public final IImageTransformOCollectionEffectiveData getImageTransform() {
        return this.f45875kk;
    }

    @Override // com.aspose.slides.IPictureEffectiveData
    public final String getLinkPathLong() {
        return this.f45874k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7131h4 m64175k4(C4317dy c4317dy, C12015qq c12015qq, kg7 kg7Var) {
        C7131h4 c7131h4;
        float f;
        float fM63832ck;
        float fM63832ck2;
        double d;
        C7134m9 c7134m9M27683k4 = C7134m9.m27683k4(this.f45877x1.m2134m9());
        String strM67402k4 = C14113y2.m67402k4("{0}:{1}PVI", this.f45877x1.m2127fa().toString(), this.f45875kk.m1747x1());
        if (!m64174k4(this.f45875kk)) {
            c7134m9M27683k4 = C7134m9.m27682k4(c7134m9M27683k4, new C7130du(strM67402k4));
        }
        C7134m9 c7134m9M27682k4 = C7134m9.m27682k4(c7134m9M27683k4, new C7130du(C14113y2.m67408k4(strM67402k4, tta.m71307k4(null, kg7Var, c12015qq.Clone(), false, c4317dy))));
        Presentation presentation = this.f45876to;
        int iM2355k4 = presentation != null ? presentation.m2355k4(c7134m9M27682k4) : 1;
        C7131h4[] c7131h4Arr = {null};
        boolean z = iM2355k4 > 2 && this.f45876to.m2345ar().m56973k4(c7134m9M27682k4, c7131h4Arr);
        C7131h4 c7131h42 = c7131h4Arr[0];
        if (z) {
            return c7131h42;
        }
        C7134m9[] c7134m9Arr = {c7134m9M27683k4};
        C7131h4 c7131h4M64176k4 = m64176k4(kg7Var, c7134m9Arr);
        C7134m9 c7134m9 = c7134m9Arr[0];
        if (!c7131h4M64176k4.m27680x1()) {
            c7131h4M64176k4 = new C7131h4(C3099wl.m13169ck(c7131h4M64176k4.m27674du()), c7131h4M64176k4.m27674du());
        }
        if (kg7Var != null && !C14064he.m66717x1(kg7Var.m63832ck())) {
            kg7Var.m63846ks().m56971k4(c7134m9, c7131h4M64176k4);
            if (iM2355k4 > 1) {
                this.f45876to.m2369k4(c7134m9, c7134m9M27682k4, c7131h4M64176k4);
            }
            if (!kg7Var.m63836h4() || !C3099wl.m13198x1(c7131h4M64176k4.m27678kk())) {
                if (c4317dy != null) {
                    C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 2);
                    c12025x6Arr[0] = new C12025x6(1.0f, 0.0f);
                    c12025x6Arr[1] = new C12025x6(0.0f, 1.0f);
                    C3108y2.m13226k4(c4317dy, c12025x6Arr);
                    c7131h4 = null;
                    f = 0.0f;
                    fM63832ck = (float) (((double) kg7Var.m63832ck()) / C14116yg.m67496rv(com.aspose.slides.internal.p040bg.OooO00o.OooO00o(c12025x6Arr[0], c12025x6Arr[0].m56895kk(), c12025x6Arr[0].m56897x1() * c12025x6Arr[0].m56897x1())));
                    fM63832ck2 = (float) (((double) kg7Var.m63832ck()) / C14116yg.m67496rv(com.aspose.slides.internal.p040bg.OooO00o.OooO00o(c12025x6Arr[1], c12025x6Arr[1].m56895kk(), c12025x6Arr[1].m56897x1() * c12025x6Arr[1].m56897x1())));
                } else {
                    c7131h4 = null;
                    f = 0.0f;
                    fM63832ck = kg7Var.m63832ck();
                    fM63832ck2 = fM63832ck;
                }
                double dM67496rv = C14116yg.m67496rv(2.0d);
                double dM56699x1 = ((double) (((c12015qq.m56699x1() > f ? c12015qq.m56699x1() : 1.0f) * fM63832ck) / 72.0f)) * dM67496rv;
                double dM56697kk = ((double) (((c12015qq.m56697kk() > f ? c12015qq.m56697kk() : 1.0f) * fM63832ck2) / 72.0f)) * dM67496rv;
                double d2 = 1.0d;
                while (true) {
                    d = dM56697kk;
                    if (c7131h4M64176k4.m27678kk().mo15760yj() / ((float) d2) <= dM56699x1) {
                        break;
                    }
                    d2 *= dM67496rv;
                    dM56697kk = d;
                }
                double d3 = 1.0d;
                while (c7131h4M64176k4.m27678kk().mo15757m9() / ((float) d3) > d) {
                    d3 *= dM67496rv;
                }
                if (d2 == dM67496rv * d3) {
                    d2 = d3;
                } else if (d3 == dM67496rv * d2) {
                    d3 = d2;
                }
                if (C14116yg.m67475k4(d2 - 1.0d) >= 0.05d || C14116yg.m67475k4(d3 - 1.0d) >= 0.05d) {
                    C7134m9 c7134m9M27682k42 = C7134m9.m27682k4(c7134m9, new C7135to(d2, d3));
                    C7131h4[] c7131h4Arr2 = {c7131h4};
                    boolean zM56973k4 = kg7Var.m63846ks().m56973k4(c7134m9M27682k42, c7131h4Arr2);
                    C7131h4 c7131h43 = c7131h4Arr2[0];
                    if (!zM56973k4) {
                        AbstractC12002ck abstractC12002ckM27678kk = c7131h4M64176k4.m27678kk();
                        C12023wl c12023wl = new C12023wl(OooO.OooO00o(abstractC12002ckM27678kk.mo15760yj() / ((float) d2), 14), OooO.OooO00o(abstractC12002ckM27678kk.mo15757m9() / ((float) d3), 14));
                        if (c12023wl.m56865x1() < 1) {
                            c12023wl.m56860k4(1);
                        }
                        if (c12023wl.m56862kk() < 1) {
                            c12023wl.m56866x1(1);
                        }
                        c7131h43 = new C7131h4((c7131h4M64176k4.m27679to() && C3099wl.m13195m9(c7131h4M64176k4.m27674du())) ? C3099wl.m13178k4(c7131h4M64176k4.m27674du(), c12023wl.m56865x1(), c12023wl.m56862kk()) : new C12009k4(abstractC12002ckM27678kk, c12023wl.Clone()));
                        kg7Var.m63846ks().m56971k4(c7134m9M27682k42, c7131h43);
                    }
                    if (iM2355k4 > 1) {
                        this.f45876to.m2369k4(c7134m9M27682k42, c7134m9M27682k4, c7131h43);
                    }
                    return c7131h43;
                }
            }
        }
        return c7131h4M64176k4;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C7131h4 m64176k4(kg7 kg7Var, C7134m9[] c7134m9Arr) {
        float fM63831c5;
        C7131h4 c7131h4;
        boolean zM63833du;
        boolean z;
        boolean z2;
        byte[] bArrM13188k4;
        boolean z3;
        boolean z4;
        float fM58657k4;
        float fM58660x1;
        AbstractC12002ck abstractC12002ckM1744k4 = null;
        if (kg7Var != null) {
            fM63831c5 = kg7Var.m63831c5();
            C7131h4[] c7131h4Arr = {null};
            boolean zM56973k4 = kg7Var.m63846ks().m56973k4(c7134m9Arr[0], c7131h4Arr);
            c7131h4 = c7131h4Arr[0];
            if (zM56973k4) {
                return c7131h4;
            }
        } else {
            fM63831c5 = 3000000.0f;
            c7131h4 = null;
        }
        if (c7131h4 != null) {
            return c7131h4;
        }
        C7131h4 c7131h42 = new C7131h4(this.f45877x1.m2134m9());
        if (kg7Var == null) {
            zM63833du = false;
        } else if (!kg7Var.m63850to() || kg7Var.m63836h4()) {
            zM63833du = false;
            if (zM63833du && C3099wl.m13195m9(c7131h42.m27674du())) {
                zM63833du &= kg7Var.m63833du();
            }
        } else {
            c7131h42.m27676k4(((PPImage) getImage()).m2131k4());
            if (!C3099wl.m13198x1(c7131h42.m27678kk())) {
                zM63833du = true;
            }
            if (zM63833du) {
                zM63833du &= kg7Var.m63833du();
            }
        }
        if (this.f45875kk.size() != 0 || zM63833du) {
            if (!c7131h42.m27680x1()) {
                c7131h42.m27676k4(((PPImage) getImage()).m2131k4());
            }
            C12023wl c12023wlClone = c7131h42.m27678kk().m56329fa().Clone();
            if (C3099wl.m13195m9(c7131h42.m27674du())) {
                if (c12023wlClone.m56865x1() * c12023wlClone.m56862kk() > fM63831c5) {
                    float fM67496rv = (float) C14116yg.m67496rv((fM63831c5 / c12023wlClone.m56865x1()) / c12023wlClone.m56862kk());
                    C12023wl c12023wl = new C12023wl(OooO.OooO00o(c12023wlClone.m56865x1() * fM67496rv, 14), OooO.OooO00o(c12023wlClone.m56862kk() * fM67496rv, 14));
                    if (c12023wl.m56865x1() < 1) {
                        c12023wl.m56860k4(1);
                    }
                    if (c12023wl.m56862kk() < 1) {
                        c12023wl.m56866x1(1);
                    }
                    c12023wlClone = c12023wl;
                    z4 = true;
                } else {
                    z4 = false;
                }
                C12009k4 c12009k4 = new C12009k4(c12023wlClone.m56865x1(), c12023wlClone.m56862kk(), 2498570);
                if (z4) {
                    fM58657k4 = (C12567ne.m58657k4(c7131h42.m27678kk()) * c12009k4.mo15760yj()) / c7131h42.m27678kk().mo15760yj();
                    fM58660x1 = (C12567ne.m58660x1(c7131h42.m27678kk()) * c12009k4.mo15757m9()) / c7131h42.m27678kk().mo15757m9();
                } else {
                    fM58657k4 = C12567ne.m58657k4(c7131h42.m27678kk());
                    fM58660x1 = C12567ne.m58660x1(c7131h42.m27678kk());
                }
                c12009k4.m56332k4(fM58657k4, fM58660x1);
                AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
                try {
                    abstractC12008jdM56582k4.mo17503k4(c7131h42.m27678kk(), 0, 0);
                    abstractC12008jdM56582k4.dispose();
                    abstractC12002ckM1744k4 = c12009k4;
                    z = true;
                } catch (Throwable th) {
                    if (abstractC12008jdM56582k4 != null) {
                        abstractC12008jdM56582k4.dispose();
                    }
                    throw th;
                }
            } else {
                z = false;
            }
            if (m64174k4(this.f45875kk)) {
                if (abstractC12002ckM1744k4 == null) {
                    abstractC12002ckM1744k4 = (AbstractC12002ck) C7019kk.m27452k4((Object) c7131h42.m27678kk(), C12009k4.class);
                }
                z2 = false;
            } else {
                if (abstractC12002ckM1744k4 == null) {
                    abstractC12002ckM1744k4 = (AbstractC12002ck) c7131h42.m27678kk().deepClone();
                }
                abstractC12002ckM1744k4 = this.f45875kk.m1744k4((C12009k4) C7019kk.m27452k4((Object) abstractC12002ckM1744k4, C12009k4.class), zM63833du);
                z2 = true;
            }
            C7131h4 c7131h4M63830x1 = kg7.m63830x1(kg7Var, c7134m9Arr[0], this.f45877x1);
            byte[] bArrM27674du = c7131h4M63830x1 != null ? c7131h4M63830x1.m27674du() : this.f45877x1.m2134m9();
            if (bArrM27674du == null || C12549du.m58515x1(bArrM27674du) != 4 || z2) {
                bArrM13188k4 = (z2 || z) ? C3099wl.m13188k4(abstractC12002ckM1744k4) : c7131h42.m27674du();
                z3 = false;
            } else {
                C3152yj c3152yj = new C3152yj();
                try {
                    C3982jd c3982jdM27185k4 = C6926m9.m27185k4(C3977ck.m15678dy());
                    C3986m9 c3986m9 = new C3986m9();
                    c3986m9.m15744k4()[0] = new C3981h4(C3978du.f10783du, 100L);
                    abstractC12002ckM1744k4.m56334k4(c3152yj, c3982jdM27185k4, c3986m9);
                    byte[] array = c3152yj.toArray();
                    AbstractC12002ck abstractC12002ckM13169ck = C3099wl.m13169ck(array);
                    c3152yj.dispose();
                    z3 = true;
                    bArrM13188k4 = array;
                    abstractC12002ckM1744k4 = abstractC12002ckM13169ck;
                } catch (Throwable th2) {
                    c3152yj.dispose();
                    throw th2;
                }
            }
            if (z2 || z || z3) {
                if (c7131h42.m27678kk() != null) {
                    c7131h42.m27678kk().dispose();
                }
                C7131h4 c7131h43 = new C7131h4(abstractC12002ckM1744k4, bArrM13188k4);
                if (kg7Var != null) {
                    c7134m9Arr[0] = C7134m9.m27683k4(bArrM13188k4);
                    kg7Var.m63846ks().m56971k4(c7134m9Arr[0], c7131h43);
                }
                return c7131h43;
            }
        }
        return c7131h42;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64177k4() {
        this.f45875kk.m1745k4();
        this.f45874k4 = null;
        this.f45877x1 = null;
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4 */
    public void mo4833k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        IGenericEnumerator<IEffectEffectiveData> it = this.f45875kk.iterator();
        while (it.hasNext()) {
            try {
                IEffectEffectiveData next = it.next();
                if (C7019kk.m27469x1(next, InterfaceC13788lo.class)) {
                    ((InterfaceC13788lo) next).mo4351k4(iBaseSlide, dm6Var);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64178k4(Picture picture) {
        this.f45876to = (Presentation) picture.getPresentation();
        this.f45874k4 = picture.getLinkPathLong();
        this.f45877x1 = (PPImage) picture.getImage();
        this.f45875kk = new ImageTransformOCollectionEffectiveData();
        IGenericEnumerator<IImageTransformOperation> it = picture.getImageTransform().iterator();
        while (it.hasNext()) {
            try {
                this.f45875kk.m1743k4((ImageTransformOperation) it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64179k4(InterfaceC14672vc interfaceC14672vc) {
        ku2 ku2Var = (ku2) interfaceC14672vc;
        this.f45874k4 = ku2Var.getLinkPathLong();
        this.f45877x1 = (PPImage) ku2Var.getImage();
        this.f45875kk = new ImageTransformOCollectionEffectiveData();
        IGenericEnumerator<IEffectEffectiveData> it = ku2Var.getImageTransform().iterator();
        while (it.hasNext()) {
            try {
                this.f45875kk.m1742k4(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, Picture picture) {
        m64179k4(interfaceC14672vc);
        m64178k4(picture);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m64174k4(ImageTransformOCollectionEffectiveData imageTransformOCollectionEffectiveData) {
        if (imageTransformOCollectionEffectiveData == null || imageTransformOCollectionEffectiveData.size() == 0) {
            return true;
        }
        IGenericEnumerator<IEffectEffectiveData> it = imageTransformOCollectionEffectiveData.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                IEffectEffectiveData next = it.next();
                if (C7019kk.m27469x1(next, C14352qm.class)) {
                    if (((C14352qm) C7019kk.m27452k4((Object) next, C14352qm.class)).getAmount() == 100.0f) {
                        i++;
                    }
                } else if (C7019kk.m27469x1(next, oaz.class)) {
                    oaz oazVar = (oaz) C7019kk.m27452k4((Object) next, oaz.class);
                    if (oazVar.getBrightness() == 0.0f && oazVar.getContrast() == 0.0f) {
                        i++;
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return imageTransformOCollectionEffectiveData.size() - i <= 0;
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(ku2 ku2Var) {
        if (ku2Var == null) {
            return false;
        }
        if (this.f45877x1 == null && ku2Var.getImage() != null) {
            return false;
        }
        PPImage pPImage = this.f45877x1;
        return (pPImage == null || pPImage.equals(ku2Var.getImage())) && this.f45875kk.m1746k4(ku2Var.f45875kk) && C14113y2.m67363du(this.f45874k4, ku2Var.f45874k4);
    }
}
