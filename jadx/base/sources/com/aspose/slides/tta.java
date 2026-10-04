package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p052c0.C1937to;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3099wl;
import com.aspose.slides.internal.p077d8.C3108y2;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p129fe.C3978du;
import com.aspose.slides.internal.p129fe.C3981h4;
import com.aspose.slides.internal.p129fe.C3982jd;
import com.aspose.slides.internal.p129fe.C3986m9;
import com.aspose.slides.internal.p129fe.C3989up;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p302nm.C6926m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p323op.C7130du;
import com.aspose.slides.internal.p323op.C7131h4;
import com.aspose.slides.internal.p323op.C7134m9;
import com.aspose.slides.internal.p323op.C7135to;
import com.aspose.slides.internal.p323op.C7136x1;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p505xn.C12567ne;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14051ck;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class tta {

    /* JADX INFO: renamed from: h4 */
    private static final Object f49190h4 = new Object();

    /* JADX INFO: renamed from: du */
    private long f49191du;

    /* JADX INFO: renamed from: k4 */
    private String f49192k4 = null;

    /* JADX INFO: renamed from: kk */
    private final jyr f49193kk;

    /* JADX INFO: renamed from: to */
    private final ImageTransformOperationCollection f49194to;

    /* JADX INFO: renamed from: x1 */
    private PPImage f49195x1;

    public tta(ImageTransformOperationCollection imageTransformOperationCollection, jyr jyrVar) {
        this.f49194to = imageTransformOperationCollection;
        this.f49193kk = jyrVar;
    }

    /* JADX INFO: renamed from: h4 */
    private void m71305h4() {
        this.f49191du++;
    }

    /* JADX INFO: renamed from: du */
    public final long m71312du() {
        long j = this.f49191du & 4294967295L;
        PPImage pPImage = this.f49195x1;
        return (((j + ((pPImage != null ? pPImage.m2136up() : 0L) & 4294967295L)) & 4294967295L) + (this.f49194to.getVersion() & 4294967295L)) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public final PPImage m71313k4() {
        return this.f49195x1;
    }

    /* JADX INFO: renamed from: kk */
    public final String m71319kk() {
        return this.f49192k4;
    }

    /* JADX INFO: renamed from: to */
    public final void m71320to() {
        this.f49192k4 = null;
        this.f49195x1 = null;
        this.f49194to.clear();
        m71305h4();
    }

    /* JADX INFO: renamed from: x1 */
    public final String m71321x1() {
        return this.f49192k4;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ed  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C7131h4 m71314k4(ajz ajzVar, C12015qq c12015qq, kg7 kg7Var, IBaseSlide iBaseSlide, boolean z, PictureFillFormat pictureFillFormat) {
        AbstractC14897zn abstractC14897zn;
        double d;
        double d2;
        int i;
        byte[] bArrM13188k4;
        byte[] bArrM13188k42;
        double d3;
        C7134m9 c7134m9M27683k4 = C7134m9.m27683k4(this.f49195x1.m2134m9());
        String strM67402k4 = C14113y2.m67402k4("{0}:{1}", this.f49195x1.m2127fa().toString(), this.f49194to.m1756k4(iBaseSlide, (C14321pz) null));
        if (!m71309k4(this.f49194to)) {
            c7134m9M27683k4 = C7134m9.m27682k4(c7134m9M27683k4, new C7130du(strM67402k4));
        }
        C7134m9 c7134m9 = c7134m9M27683k4;
        C7134m9 c7134m9M27682k4 = C7134m9.m27682k4(c7134m9, new C7130du(C14113y2.m67408k4(strM67402k4, m71307k4(ajzVar, kg7Var, c12015qq.Clone(), z, null))));
        int iM2355k4 = iBaseSlide != null ? ((Presentation) iBaseSlide.getPresentation()).m2355k4(c7134m9M27682k4) : 1;
        C7131h4[] c7131h4Arr = {null};
        boolean z2 = iM2355k4 > 2 && ((Presentation) iBaseSlide.getPresentation()).m2345ar().m56973k4(c7134m9M27682k4, c7131h4Arr);
        C7131h4 c7131h4 = c7131h4Arr[0];
        if (z2) {
            return c7131h4;
        }
        C7131h4 c7131h4M63829k4 = kg7.m63829k4(kg7Var, c7134m9, this.f49195x1);
        if (kg7Var == null || C14064he.m66717x1(kg7Var.m63832ck()) || (kg7Var.m63836h4() && C3099wl.m13198x1(c7131h4M63829k4.m27678kk()))) {
            int i2 = iM2355k4;
            C7131h4 c7131h4M71306k4 = m71306k4(kg7Var, c7131h4M63829k4, iBaseSlide, c7131h4M63829k4.m27678kk().m56329fa().Clone());
            if (i2 > 1) {
                ((Presentation) iBaseSlide.getPresentation()).m2369k4(C7134m9.m27683k4(c7131h4M71306k4.m27674du()), c7134m9M27682k4, c7131h4M71306k4);
            }
            return c7131h4M71306k4;
        }
        double[] dArr = {0.0d};
        double[] dArr2 = {0.0d};
        int i3 = iM2355k4;
        m71308k4(c7131h4M63829k4, kg7Var.m63832ck(), c12015qq.Clone(), ajzVar, dArr, dArr2);
        double d4 = dArr[0];
        double d5 = dArr2[0];
        AbstractC14897zn abstractC14897zn2 = ajzVar.f3914k4;
        if (abstractC14897zn2 == null || abstractC14897zn2.m74608ar().mo17577u4().m55776k4()[0] == 0.0f || abstractC14897zn2.m74608ar().mo17577u4().m55776k4()[3] == 0.0f || d4 <= 1.0d || d5 <= 1.0d) {
            abstractC14897zn = abstractC14897zn2;
            d = d5;
            d2 = d4;
        } else {
            C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 2);
            c12025x6Arr[0] = new C12025x6(1.0f, 0.0f);
            c12025x6Arr[1] = new C12025x6(0.0f, 1.0f);
            abstractC14897zn2.m74608ar().mo17577u4().m55788x1(c12025x6Arr);
            float fM67496rv = (float) C14116yg.m67496rv(com.aspose.slides.internal.p040bg.OooO00o.OooO00o(c12025x6Arr[0], c12025x6Arr[0].m56895kk(), c12025x6Arr[0].m56897x1() * c12025x6Arr[0].m56897x1()));
            float fM67496rv2 = (float) C14116yg.m67496rv(com.aspose.slides.internal.p040bg.OooO00o.OooO00o(c12025x6Arr[1], c12025x6Arr[1].m56895kk(), c12025x6Arr[1].m56897x1() * c12025x6Arr[1].m56897x1()));
            double d6 = d4 / ((double) fM67496rv);
            double d7 = d5 / ((double) fM67496rv2);
            if (!C7019kk.m27469x1(abstractC14897zn2, C14250os.class) || C3099wl.m13195m9(c7131h4M63829k4.m27674du())) {
                abstractC14897zn = abstractC14897zn2;
                d = d7;
                d2 = d6;
            } else {
                if (c7131h4M63829k4.m27678kk().mo15752dy() > 144.0f) {
                    abstractC14897zn = abstractC14897zn2;
                    float fM67497to = (float) C14116yg.m67497to(c7131h4M63829k4.m27678kk().mo15752dy() / 144.0f);
                    if (fM67497to > 2.5f) {
                        fM67497to = 2.5f;
                    }
                    d6 /= (double) fM67497to;
                } else {
                    abstractC14897zn = abstractC14897zn2;
                    if (d6 < 2.5f) {
                        d3 = 1.0d;
                    }
                    if (c7131h4M63829k4.m27678kk().mo15758up() <= 144.0f) {
                        float fM67497to2 = (float) C14116yg.m67497to(c7131h4M63829k4.m27678kk().mo15758up() / 144.0f);
                        d7 /= (double) (fM67497to2 <= 2.5f ? fM67497to2 : 2.5f);
                        d2 = d3;
                    } else {
                        d2 = d3;
                        if (d7 < 2.5f) {
                            d = 1.0d;
                        }
                    }
                    d = d7;
                }
                d3 = d6;
                if (c7131h4M63829k4.m27678kk().mo15758up() <= 144.0f) {
                }
                d = d7;
            }
        }
        if (C14116yg.m67475k4(d2 - 1.0d) < 0.05d && C14116yg.m67475k4(d - 1.0d) < 0.05d) {
            C7131h4[] c7131h4Arr2 = {null};
            boolean zM56973k4 = kg7Var.m63846ks().m56973k4(c7134m9, c7131h4Arr2);
            C7131h4 c7131h4M71306k42 = c7131h4Arr2[0];
            if (!zM56973k4) {
                c7131h4M71306k42 = m71306k4(kg7Var, c7131h4M63829k4, iBaseSlide, c7131h4M63829k4.m27678kk().m56329fa().Clone());
            }
            if (!C3099wl.m13195m9(c7131h4M63829k4.m27674du()) || (!z && c12015qq.m56699x1() <= c7131h4M63829k4.m27678kk().mo15760yj() && c12015qq.m56697kk() <= c7131h4M63829k4.m27678kk().mo15757m9())) {
                if (i3 > 1) {
                    ((Presentation) iBaseSlide.getPresentation()).m2369k4(C7134m9.m27683k4(c7131h4M71306k42.m27674du()), c7134m9M27682k4, c7131h4M71306k42);
                }
                return c7131h4M71306k42;
            }
            C7134m9 c7134m9M27682k42 = C7134m9.m27682k4(c7134m9, new C7136x1(c12015qq.m56699x1(), c12015qq.m56697kk()));
            C7131h4[] c7131h4Arr3 = {null};
            boolean zM56973k42 = kg7Var.m63846ks().m56973k4(c7134m9M27682k42, c7131h4Arr3);
            C7131h4 c7131h42 = c7131h4Arr3[0];
            if (!zM56973k42) {
                C12015qq c12015qq2 = new C12015qq(c12015qq.m56699x1() * 4.0f, c12015qq.m56697kk() * 4.0f);
                C12009k4 c12009k4M13183k4 = C3099wl.m13183k4(c7131h4M63829k4.m27674du(), c12015qq2.Clone(), pictureFillFormat.m2250k4(C7019kk.m27462to(Float.valueOf(c12015qq2.m56699x1()), 13), C7019kk.m27462to(Float.valueOf(c12015qq2.m56697kk()), 13)).Clone().Clone());
                AbstractC12002ck abstractC12002ckM1755k4 = c12009k4M13183k4;
                if (!m71309k4(this.f49194to)) {
                    abstractC12002ckM1755k4 = this.f49194to.m1755k4(iBaseSlide, c12009k4M13183k4);
                }
                c7131h42 = new C7131h4(abstractC12002ckM1755k4, z);
                kg7Var.m63846ks().m56971k4(c7134m9M27682k42, c7131h42);
            }
            if (i3 > 1) {
                ((Presentation) iBaseSlide.getPresentation()).m2369k4(c7134m9M27682k42, c7134m9M27682k4, c7131h42);
            }
            return c7131h42;
        }
        double d8 = d2;
        double d9 = d;
        C7131h4[] c7131h4Arr4 = {null};
        boolean zM56973k43 = kg7Var.m63846ks().m56973k4(C7134m9.m27682k4(c7134m9, new C7135to(new C7130du(strM67402k4), d2, d)), c7131h4Arr4);
        C7131h4 c7131h43 = c7131h4Arr4[0];
        if (!zM56973k43) {
            C12023wl c12023wl = new C12023wl(OooO.OooO00o(c7131h4M63829k4.m27678kk().mo15760yj() / ((float) d8), 14), OooO.OooO00o(c7131h4M63829k4.m27678kk().mo15757m9() / ((float) d9), 14));
            if (c12023wl.m56861k4()) {
                i = 1;
                c12023wl = new C12023wl(1, 1);
            } else {
                i = 1;
            }
            C7131h4 c7131h4M71306k43 = m71306k4(kg7Var, c7131h4M63829k4, iBaseSlide, c12023wl.Clone());
            AbstractC12002ck abstractC12002ckM27678kk = c7131h4M71306k43.m27678kk();
            if (abstractC12002ckM27678kk.m56329fa().equals(c12023wl.Clone())) {
                if (i3 > i) {
                    ((Presentation) iBaseSlide.getPresentation()).m2369k4(C7134m9.m27683k4(c7131h4M71306k43.m27674du()), c7134m9M27682k4, c7131h4M71306k43);
                }
                return c7131h4M71306k43;
            }
            if (C3099wl.m13195m9(c7131h4M71306k43.m27674du())) {
                byte[] binaryData = m71313k4().getBinaryData();
                C1937to c1937to = new C1937to(binaryData);
                boolean z3 = c1937to.m9994rv() == 5 && c1937to.m9986fa().m56550c5() != c1937to.m9991ks().m56699x1() && c1937to.m9986fa().m56557jd() > 0.0f && c1937to.m9986fa().m56551ck() > 0.0f && c1937to.m9986fa().m56550c5() < 2000.0f;
                if (abstractC14897zn != null && abstractC14897zn.m74608ar().mo17577u4().m55776k4()[0] != 0.0f && abstractC14897zn.m74608ar().mo17577u4().m55776k4()[3] != 0.0f && z3) {
                    c12023wl = new C12023wl(C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(abstractC14897zn.m74608ar().mo17577u4().m55776k4()[0]) * c12015qq.m56699x1()), 13), C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(abstractC14897zn.m74608ar().mo17577u4().m55776k4()[3]) * c12015qq.m56697kk()), 13));
                } else if (!z3) {
                    c12023wl = c1937to.m9994rv() == 2 ? new C12023wl(C7019kk.m27462to(Float.valueOf((c1937to.m9996up().m10004x1().m56550c5() / c1937to.m9988jd()) * 96.0f * 1.7f), 13), C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4((c1937to.m9996up().m10004x1().m56575x1() / c1937to.m9983ck()) * 96.0f * 1.7f)), 13)) : ((c1937to.m9986fa().m56550c5() * 96.0f) / c1937to.m9988jd()) / c12015qq.m56699x1() < 4.0f ? new C12023wl(C7019kk.m27462to(Float.valueOf(c12015qq.m56699x1() * 4.0f), 13), C7019kk.m27462to(Float.valueOf(c12015qq.m56697kk() * 4.0f), 13)) : new C12023wl(C7019kk.m27462to(Float.valueOf((c12015qq.m56699x1() * 4.0f) / 2.0f), 13), C7019kk.m27462to(Float.valueOf((c12015qq.m56697kk() * 4.0f) / 2.0f), 13));
                }
                AbstractC14897zn abstractC14897zn3 = abstractC14897zn;
                C12015qq c12015qqClone = (C7019kk.m27469x1(abstractC14897zn3, C14250os.class) ? new C12015qq(((c12023wl.m56865x1() / c12015qq.m56699x1()) * 3.0f) / 4.0f, ((c12023wl.m56862kk() / c12015qq.m56697kk()) * 3.0f) / 4.0f) : new C12015qq(1.0f, 1.0f)).Clone();
                synchronized (f49190h4) {
                    if (abstractC14897zn3 != null) {
                        try {
                            AbstractC12008jd abstractC12008jdM74608ar = c1937to.m9994rv() == 3 ? abstractC14897zn3.m74608ar() : null;
                            C12009k4 c12009k4M13179k4 = C3099wl.m13179k4(binaryData, abstractC12008jdM74608ar, C12023wl.m56853k4(c12023wl).Clone(), c12015qqClone.Clone());
                            try {
                                bArrM13188k42 = C3099wl.m13188k4((AbstractC12002ck) c12009k4M13179k4);
                            } finally {
                                if (c12009k4M13179k4 != null) {
                                    c12009k4M13179k4.dispose();
                                }
                            }
                        } finally {
                        }
                    }
                }
                c7131h43 = new C7131h4(C3099wl.m13169ck(bArrM13188k42), bArrM13188k42);
                kg7Var.m63846ks().m56971k4(C7134m9.m27683k4(c7131h43.m27674du()), c7131h43);
            } else {
                C12009k4 c12009k4 = new C12009k4(abstractC12002ckM27678kk, c12023wl.Clone());
                try {
                    if (!C14047bz.m66535k4(abstractC12002ckM27678kk.mo15750ck().m15685k4(), C3977ck.m15678dy().m15685k4()) || abstractC12002ckM27678kk.mo15752dy() > c12009k4.mo15752dy()) {
                        bArrM13188k4 = C3099wl.m13188k4((AbstractC12002ck) c12009k4);
                    } else {
                        C3152yj c3152yj = new C3152yj();
                        try {
                            C3982jd c3982jdM27185k4 = C6926m9.m27185k4(C3977ck.m15678dy());
                            C3986m9 c3986m9 = new C3986m9();
                            c3986m9.m15744k4()[0] = new C3981h4(C3978du.f10783du, 100L);
                            c12009k4.m56334k4(c3152yj, c3982jdM27185k4, c3986m9);
                            bArrM13188k4 = c3152yj.toArray();
                            c3152yj.dispose();
                        } catch (Throwable th) {
                            c3152yj.dispose();
                            throw th;
                        }
                    }
                    c7131h43 = new C7131h4(C3099wl.m13169ck(bArrM13188k4), bArrM13188k4);
                    kg7Var.m63846ks().m56971k4(C7134m9.m27683k4(c7131h43.m27674du()), c7131h43);
                    c12009k4.dispose();
                } catch (Throwable th2) {
                    c12009k4.dispose();
                    throw th2;
                }
            }
        }
        if (i3 > 1) {
            ((Presentation) iBaseSlide.getPresentation()).m2369k4(C7134m9.m27683k4(c7131h43.m27674du()), c7134m9M27682k4, c7131h43);
        }
        return c7131h43;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m71322x1(String str) {
        if (C14113y2.m67363du(str, this.f49192k4)) {
            return;
        }
        if (str != null && str.length() == 0) {
            str = null;
        }
        this.f49192k4 = str;
        m71305h4();
    }

    /* JADX INFO: renamed from: k4 */
    private C7131h4 m71306k4(kg7 kg7Var, C7131h4 c7131h4, IBaseSlide iBaseSlide, C12023wl c12023wl) {
        boolean z;
        AbstractC12002ck abstractC12002ckM1755k4;
        byte[] bArrM13188k4;
        float fM63831c5 = kg7Var != null ? kg7Var.m63831c5() : 3000000.0f;
        if (!m71310k4(kg7Var, c7131h4.m27678kk(), c7131h4.m27674du())) {
            if (kg7Var != null && c7131h4.m27679to()) {
                kg7Var.m63846ks().m56971k4(C7134m9.m27683k4(c7131h4.m27674du()), c7131h4);
            }
            return c7131h4;
        }
        C12023wl c12023wlClone = c12023wl.Clone();
        boolean z2 = true;
        if (!C3099wl.m13195m9(c7131h4.m27674du()) || c12023wlClone.m56865x1() * c12023wlClone.m56862kk() <= fM63831c5) {
            z = false;
        } else {
            float fM67496rv = (float) C14116yg.m67496rv((fM63831c5 / c12023wlClone.m56865x1()) / c12023wlClone.m56862kk());
            C12023wl c12023wl2 = new C12023wl(OooO.OooO00o(c12023wlClone.m56865x1() * fM67496rv, 14), OooO.OooO00o(c12023wlClone.m56862kk() * fM67496rv, 14));
            if (c12023wl2.m56865x1() < 1) {
                c12023wl2.m56860k4(1);
            }
            if (c12023wl2.m56862kk() < 1) {
                c12023wl2.m56866x1(1);
            }
            c12023wlClone = c12023wl2;
            z = true;
        }
        C12009k4 c12009k4M13181k4 = (c7131h4.m27679to() && C3099wl.m13195m9(c7131h4.m27674du())) ? c7131h4.m27679to() ? C3099wl.m13181k4(c7131h4.m27674du(), C12023wl.m56853k4(c12023wlClone).Clone()) : C3099wl.m13176k4((C3989up) c7131h4.m27678kk(), C12023wl.m56853k4(c12023wlClone).Clone()) : new C12009k4(c7131h4.m27678kk(), c12023wlClone.m56865x1(), c12023wlClone.m56862kk());
        if (z) {
            c12009k4M13181k4.m56332k4((C12567ne.m58657k4(c7131h4.m27678kk()) * c12009k4M13181k4.mo15760yj()) / c7131h4.m27678kk().mo15760yj(), (C12567ne.m58660x1(c7131h4.m27678kk()) * c12009k4M13181k4.mo15757m9()) / c7131h4.m27678kk().mo15757m9());
        }
        if (m71309k4(this.f49194to)) {
            abstractC12002ckM1755k4 = c12009k4M13181k4;
            z2 = false;
        } else {
            abstractC12002ckM1755k4 = this.f49194to.m1755k4(iBaseSlide, c12009k4M13181k4);
        }
        if (c7131h4.m27679to() && C3099wl.m13170du(c7131h4.m27674du()) && !z2) {
            C3152yj c3152yj = new C3152yj();
            try {
                C3982jd c3982jdM27185k4 = C6926m9.m27185k4(C3977ck.m15678dy());
                C3986m9 c3986m9 = new C3986m9();
                c3986m9.m15744k4()[0] = new C3981h4(C3978du.f10783du, 100L);
                abstractC12002ckM1755k4.m56334k4(c3152yj, c3982jdM27185k4, c3986m9);
                bArrM13188k4 = c3152yj.toArray();
            } finally {
                c3152yj.dispose();
            }
        } else {
            bArrM13188k4 = C3099wl.m13188k4(abstractC12002ckM1755k4);
        }
        AbstractC12002ck abstractC12002ckM13169ck = C3099wl.m13169ck(bArrM13188k4);
        c12009k4M13181k4.dispose();
        C7134m9 c7134m9M27683k4 = C7134m9.m27683k4(bArrM13188k4);
        C7131h4 c7131h42 = new C7131h4(abstractC12002ckM13169ck, bArrM13188k4);
        if (kg7Var != null) {
            kg7Var.m63846ks().m56971k4(c7134m9M27683k4, c7131h42);
        }
        return c7131h42;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m71307k4(ajz ajzVar, kg7 kg7Var, C12015qq c12015qq, boolean z, C4317dy c4317dy) {
        C6765kp c6765kpOooO00o = com.aspose.slides.Collections.Specialized.OooO00o.OooO00o("|");
        c6765kpOooO00o.m26792k4(c12015qq.toString());
        c6765kpOooO00o.m26792k4("|");
        c6765kpOooO00o.m26792k4(C14051ck.m66557x1(z));
        c6765kpOooO00o.m26792k4("|");
        if (ajzVar != null) {
            c6765kpOooO00o.m26792k4(C14042ak.m66410k4(ShapeType.class, ajzVar.f3916m9));
            c6765kpOooO00o.m26792k4("|");
            IShapeFrame iShapeFrame = ajzVar.f3918x1;
            if (iShapeFrame != null) {
                c6765kpOooO00o.m26792k4(((ShapeFrame) iShapeFrame).m2660k4().toString());
                c6765kpOooO00o.m26792k4("|");
            }
            C11896dy c11896dy = ajzVar.f3917to;
            if (c11896dy != null) {
                c6765kpOooO00o.m26792k4(c11896dy.getClass().getName());
                c6765kpOooO00o.m26792k4("|");
            }
            AbstractC14897zn abstractC14897zn = ajzVar.f3914k4;
            if (abstractC14897zn != null) {
                c6765kpOooO00o.m26792k4(C14057f9.m66591x1(abstractC14897zn.mo67708dy()));
                c6765kpOooO00o.m26792k4("|");
                c6765kpOooO00o.m26792k4(C14057f9.m66591x1(ajzVar.f3914k4.mo67711m9()));
                c6765kpOooO00o.m26792k4("|");
            }
        }
        if (kg7Var != null) {
            c6765kpOooO00o.m26792k4(kg7Var.m63849rv().toString());
            c6765kpOooO00o.m26792k4("|");
            c6765kpOooO00o.m26792k4(C14051ck.m66557x1(kg7Var.m63850to()));
            c6765kpOooO00o.m26792k4("|");
            c6765kpOooO00o.m26792k4(C14051ck.m66557x1(kg7Var.m63853yj()));
            c6765kpOooO00o.m26792k4("|");
            c6765kpOooO00o.m26792k4(C14057f9.m66591x1(kg7Var.m63838jd()));
            c6765kpOooO00o.m26792k4("|");
            c6765kpOooO00o.m26792k4(C14064he.m66704h4(kg7Var.m63831c5()));
            c6765kpOooO00o.m26792k4("|");
            c6765kpOooO00o.m26792k4(C14057f9.m66591x1(kg7Var.m63851up()));
            c6765kpOooO00o.m26792k4("|");
            c6765kpOooO00o.m26792k4(C14064he.m66704h4(kg7Var.m63832ck()));
            c6765kpOooO00o.m26792k4("|");
        }
        if (c4317dy != null) {
            c6765kpOooO00o.m26792k4(c4317dy.toString());
        }
        return c6765kpOooO00o.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71315k4(IPictureEffectiveData iPictureEffectiveData) {
        if (iPictureEffectiveData == null) {
            return;
        }
        this.f49192k4 = iPictureEffectiveData.getLinkPathLong();
        this.f49195x1 = (PPImage) iPictureEffectiveData.getImage();
        this.f49194to.clear();
        IGenericEnumerator<IEffectEffectiveData> it = iPictureEffectiveData.getImageTransform().iterator();
        while (it.hasNext()) {
            try {
                this.f49194to.m1757k4(EffectFactory.m1380k4().m1764k4(it.next()));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m71305h4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71316k4(PPImage pPImage) {
        if (C14067j2.m66729x1(this.f49195x1, pPImage)) {
            return;
        }
        if (pPImage == null) {
            this.f49193kk.m63575k4(false);
            this.f49191du = m71312du();
        }
        this.f49195x1 = pPImage;
        this.f49193kk.m63577kk(null);
        m71305h4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71317k4(Picture picture) {
        this.f49192k4 = picture.getLinkPathLong();
        this.f49195x1 = (PPImage) C7019kk.m27452k4((Object) picture.getImage(), PPImage.class);
        this.f49194to.clear();
        IGenericEnumerator<IImageTransformOperation> it = picture.getImageTransform().iterator();
        while (it.hasNext()) {
            try {
                this.f49194to.m1757k4((IImageTransformOperation) it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m71305h4();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m71308k4(C7131h4 c7131h4, float f, C12015qq c12015qq, ajz ajzVar, double[] dArr, double[] dArr2) {
        float fM67496rv;
        double d;
        C4317dy c4317dy = ajzVar.f3915kk;
        float f2 = 1.0f;
        if (c4317dy == null || c4317dy.m17344k4()) {
            fM67496rv = 1.0f;
        } else {
            C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 2);
            c12025x6Arr[0] = new C12025x6(1.0f, 0.0f);
            c12025x6Arr[1] = new C12025x6(0.0f, 1.0f);
            C3108y2.m13226k4(c4317dy, c12025x6Arr);
            float fM56897x1 = c12025x6Arr[0].m56897x1() * c12025x6Arr[0].m56897x1();
            float fM67496rv2 = (float) C14116yg.m67496rv(com.aspose.slides.internal.p040bg.OooO00o.OooO00o(c12025x6Arr[0], c12025x6Arr[0].m56895kk(), fM56897x1));
            float fM56897x12 = c12025x6Arr[1].m56897x1() * c12025x6Arr[1].m56897x1();
            f2 = fM67496rv2;
            fM67496rv = (float) C14116yg.m67496rv(com.aspose.slides.internal.p040bg.OooO00o.OooO00o(c12025x6Arr[1], c12025x6Arr[1].m56895kk(), fM56897x12));
        }
        float f3 = f / f2;
        float f4 = f / fM67496rv;
        C12023wl c12023wlClone = c7131h4.m27678kk().m56329fa().Clone();
        if (C3099wl.m13195m9(c7131h4.m27674du())) {
            C3099wl.m13173jd(c7131h4.m27674du()).m56680m9().CloneTo(c12023wlClone);
        }
        double dM67496rv = C14116yg.m67496rv(2.0d);
        double dM56699x1 = ((double) ((c12015qq.m56699x1() * f3) / 72.0f)) * dM67496rv;
        double dM56697kk = ((double) ((c12015qq.m56697kk() * f4) / 72.0f)) * dM67496rv;
        dArr[0] = 1.0d;
        dArr2[0] = 1.0d;
        while (true) {
            double dM56865x1 = c12023wlClone.m56865x1();
            double d2 = dArr[0];
            if (dM56865x1 / d2 <= dM56699x1 - 0.0010000000474974513d) {
                break;
            } else {
                dArr[0] = d2 * dM67496rv;
            }
        }
        while (true) {
            double dM56862kk = c12023wlClone.m56862kk();
            d = dArr2[0];
            if (dM56862kk / d <= dM56697kk - 0.0010000000474974513d) {
                break;
            } else {
                dArr2[0] = d * dM67496rv;
            }
        }
        double d3 = dArr[0];
        if (d3 == dM67496rv * d) {
            dArr[0] = d;
        } else if (d == dM67496rv * d3) {
            dArr2[0] = d3;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71318k4(String str) {
        if (C14113y2.m67363du(str, this.f49192k4)) {
            return;
        }
        this.f49191du = m71312du();
        if (!this.f49193kk.m63570du()) {
            this.f49195x1 = null;
        } else if (this.f49192k4 == null && !C14113y2.m67411k4(str)) {
            this.f49195x1 = null;
            this.f49193kk.m63575k4(false);
            this.f49193kk.m63577kk(null);
        }
        if (str == null || str.length() != 0) {
            this.f49192k4 = str;
        } else {
            this.f49192k4 = null;
        }
        m71305h4();
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m71309k4(IImageTransformOperationCollection iImageTransformOperationCollection) {
        if (iImageTransformOperationCollection == null || iImageTransformOperationCollection.size() == 0) {
            return true;
        }
        IGenericEnumerator<IImageTransformOperation> it = iImageTransformOperationCollection.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                IImageTransformOperation next = it.next();
                if (C7019kk.m27469x1(next, AlphaModulateFixed.class)) {
                    if (((AlphaModulateFixed) C7019kk.m27452k4((Object) next, AlphaModulateFixed.class)).getAmount() == 100.0f) {
                        i++;
                    }
                } else if (C7019kk.m27469x1(next, Luminance.class)) {
                    Luminance luminance = (Luminance) C7019kk.m27452k4((Object) next, Luminance.class);
                    if (luminance.m1926to() == 0.0f && luminance.m1925du() == 0.0f) {
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
        return iImageTransformOperationCollection.size() - i <= 0;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m71310k4(kg7 kg7Var, AbstractC12002ck abstractC12002ck, byte[] bArr) {
        boolean zM63833du;
        if (kg7Var != null) {
            zM63833du = kg7Var.m63850to() && !(kg7Var.m63836h4() && C3099wl.m13198x1(abstractC12002ck));
            if (zM63833du && C3099wl.m13195m9(bArr)) {
                zM63833du &= kg7Var.m63833du();
            }
        } else {
            zM63833du = false;
        }
        return !m71309k4(this.f49194to) || C3099wl.m13193kk(abstractC12002ck) || zM63833du;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m71311k4(tta ttaVar, tta ttaVar2) {
        if (C14067j2.m66729x1(ttaVar, ttaVar2)) {
            return true;
        }
        if (ttaVar == null || ttaVar2 == null || ttaVar.f49194to.size() != ttaVar2.f49194to.size()) {
            return false;
        }
        for (int i = 0; i < ttaVar.f49194to.size(); i++) {
            if (!C14067j2.m66728k4(ttaVar.f49194to.get_Item(i), ttaVar2.f49194to.get_Item(i))) {
                return false;
            }
        }
        return C3085sv.m13090k4(ttaVar.m71321x1(), ttaVar2.m71321x1()) && C3085sv.m13090k4(ttaVar.f49195x1, ttaVar2.m71313k4());
    }
}
