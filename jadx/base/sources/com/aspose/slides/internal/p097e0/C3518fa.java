package com.aspose.slides.internal.p097e0;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p097e0.AbstractC3515du;
import com.aspose.slides.internal.p111em.C3753c5;
import com.aspose.slides.internal.p111em.C3756dy;
import com.aspose.slides.internal.p111em.C3763x1;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p111em.InterfaceC3760kk;
import com.aspose.slides.internal.p111em.InterfaceC3762to;
import com.aspose.slides.internal.p256lr.C6222k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p364qm.C9891kk;
import com.aspose.slides.internal.p364qm.C9892x1;
import com.aspose.slides.internal.p380ri.InterfaceC10011dy;
import com.aspose.slides.internal.p380ri.InterfaceC10012h4;
import com.aspose.slides.internal.p380ri.InterfaceC10016m9;
import com.aspose.slides.internal.p406ss.C10345uz;
import com.aspose.slides.internal.p523yd.C12814to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.e0.fa */
/* JADX INFO: loaded from: classes3.dex */
public class C3518fa extends C3763x1 {

    /* JADX INFO: renamed from: ck */
    private int f9809ck;

    /* JADX INFO: renamed from: du */
    private C3534up f9810du;

    /* JADX INFO: renamed from: dy */
    private C12814to f9811dy;

    /* JADX INFO: renamed from: h4 */
    private AbstractC3516dy f9812h4;

    /* JADX INFO: renamed from: k4 */
    protected C3519h4 f9814k4;

    /* JADX INFO: renamed from: kk */
    protected k4 f9815kk;

    /* JADX INFO: renamed from: m9 */
    private InterfaceC3757h4 f9816m9;

    /* JADX INFO: renamed from: to */
    protected InterfaceC3762to f9817to;

    /* JADX INFO: renamed from: x1 */
    protected C10345uz f9818x1 = null;

    /* JADX INFO: renamed from: c5 */
    private boolean f9808c5 = false;

    /* JADX INFO: renamed from: jd */
    private boolean f9813jd = true;

    /* JADX INFO: renamed from: com.aspose.slides.internal.e0.fa$k4 */
    public static class k4 extends C3763x1 {

        /* JADX INFO: renamed from: k4 */
        protected AbstractC3511c5 f9819k4 = null;

        /* JADX INFO: renamed from: kk */
        private int f9820kk = 0;

        /* JADX INFO: renamed from: to */
        private C3518fa f9821to;

        /* JADX INFO: renamed from: x1 */
        protected AbstractC3533um f9822x1;

        public k4(C3518fa c3518fa) {
            this.f9821to = c3518fa;
        }

        /* JADX INFO: renamed from: kk */
        private AbstractC3515du.k4 m14249kk(String str, String str2) {
            C3518fa c3518fa = this.f9821to;
            AbstractC3515du.k4 k4VarM14252k4 = c3518fa.f9814k4.m14252k4(str, str2, c3518fa.f9816m9);
            if (C7019kk.m27469x1(k4VarM14252k4, C9891kk.k4.class)) {
                InterfaceC3527ne interfaceC3527neM14416k4 = C3543yj.m14416k4(this.f9821to.f9811dy.m59580u4());
                AbstractC3511c5 abstractC3511c5 = this.f9819k4;
                interfaceC3527neM14416k4.mo14361x1(this, abstractC3511c5 != null ? abstractC3511c5.m14105ks() : C14113y2.m67408k4("{", str, "}", str2), new C9892x1(str, str2), this.f9821to.m14239k4());
            }
            return k4VarM14252k4;
        }

        @Override // com.aspose.slides.internal.p111em.C3763x1, com.aspose.slides.internal.p111em.InterfaceC3762to
        /* JADX INFO: renamed from: k4 */
        public void mo14243k4(String str, String str2, String str3) {
            AbstractC3511c5 abstractC3511c5 = this.f9819k4;
            if (abstractC3511c5 == null) {
                throw new C3756dy(C14113y2.m67408k4("endElement() called for ", str3, " where there is no current element."));
            }
            if (!C14113y2.m67363du(abstractC3511c5.mo14114rv(), str2) || !C14113y2.m67363du(this.f9819k4.mo14108ne(), str)) {
                throw new C3756dy(C14113y2.m67408k4("Mismatch: ", this.f9819k4.mo14114rv(), " (", this.f9819k4.mo14108ne(), ") vs. ", str2, " (", str, ")"));
            }
            if (this.f9819k4.mo14084ix() != 10) {
                this.f9819k4.mo14081dy();
            }
            AbstractC3533um abstractC3533um = this.f9822x1;
            if (abstractC3533um != null && abstractC3533um.m14393k4() == this.f9819k4 && !this.f9821to.f9810du.m14409to()) {
                this.f9822x1 = this.f9822x1.m14397kk();
            }
            if (this.f9819k4.mo14084ix() == 44) {
                int i = this.f9820kk;
                if (i == 0) {
                    this.f9821to.f9810du.m14407k4(false);
                } else {
                    this.f9820kk = i - 1;
                }
            }
            this.f9819k4.m14115s_();
            this.f9819k4 = this.f9819k4.m14115s_();
        }

        @Override // com.aspose.slides.internal.p111em.C3763x1, com.aspose.slides.internal.p111em.InterfaceC3762to
        /* JADX INFO: renamed from: x1 */
        public void mo14248x1(char[] cArr, int i, int i2) {
            if (this.f9819k4 == null || this.f9822x1.m14402to(StyleIdentifier.SUBTLE_EMPHASIS).mo17251du() != 179) {
                return;
            }
            this.f9819k4.mo14124x1(cArr, i, i2, this.f9822x1, this.f9821to.m14239k4());
        }

        /* JADX WARN: Multi-variable type inference failed */
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
        @Override // com.aspose.slides.internal.p111em.C3763x1, com.aspose.slides.internal.p111em.InterfaceC3762to
        /* JADX INFO: renamed from: k4 */
        public void mo14244k4(String str, String str2, String str3, InterfaceC3760kk interfaceC3760kk) {
            C3518fa c3518fa = this.f9821to;
            if (c3518fa.f9818x1 == null) {
                c3518fa.f9813jd = false;
                if (!C14113y2.m67363du(str, "http://www.w3.org/1999/XSL/Format") || !C14113y2.m67363du(str2, "root")) {
                    C3543yj.m14416k4(this.f9821to.f9811dy.m59580u4()).mo14354kk(this, AbstractC3511c5.m14072k4(str, str2), this.f9821to.m14239k4());
                }
            } else if (C14113y2.m67363du(this.f9819k4.mo14108ne(), "http://www.w3.org/1999/XSL/Format") || C14113y2.m67363du(this.f9819k4.mo14108ne(), "http://xmlgraphics.apache.org/fop/extensions")) {
                this.f9819k4.mo14094k4(this.f9821to.f9816m9, str, str2);
            }
            AbstractC3511c5 abstractC3511c5Mo14166k4 = m14249kk(str, str2).mo14166k4(this.f9819k4);
            C3518fa c3518fa2 = this.f9821to;
            if (c3518fa2.f9818x1 == null) {
                C10345uz c10345uz = (C10345uz) abstractC3511c5Mo14166k4;
                c3518fa2.f9818x1 = c10345uz;
                c10345uz.m50401k4(c3518fa2.f9810du);
                C3518fa c3518fa3 = this.f9821to;
                c3518fa3.f9818x1.m50400k4(c3518fa3.f9812h4);
            }
            AbstractC3533um abstractC3533umMo14088k4 = abstractC3511c5Mo14166k4.mo14088k4(this.f9822x1, this.f9821to.f9812h4);
            abstractC3511c5Mo14166k4.mo14098k4(str2, this.f9821to.m14239k4(), interfaceC3760kk, abstractC3533umMo14088k4);
            if (abstractC3511c5Mo14166k4.mo14084ix() == 44) {
                if (this.f9821to.f9810du.m14409to()) {
                    this.f9820kk++;
                } else {
                    this.f9821to.f9810du.m14407k4(true);
                }
            }
            if (abstractC3511c5Mo14166k4.mo14084ix() == 53) {
                this.f9821to.f9810du.m14408kk().m14229k4();
            }
            InterfaceC10012h4 interfaceC10012h4M14119uz = abstractC3511c5Mo14166k4.m14119uz();
            if (interfaceC10012h4M14119uz != null) {
                InterfaceC3762to interfaceC3762toM49142k4 = interfaceC10012h4M14119uz.m49142k4();
                if (C7019kk.m27469x1(interfaceC3762toM49142k4, InterfaceC10011dy.class) && C7019kk.m27469x1(abstractC3511c5Mo14166k4, InterfaceC10016m9.class)) {
                    ((InterfaceC10011dy) interfaceC3762toM49142k4).m49141k4((InterfaceC10016m9) abstractC3511c5Mo14166k4);
                }
                interfaceC3762toM49142k4.mo14247x1();
                interfaceC3762toM49142k4.mo14244k4(str, str2, str3, interfaceC3760kk);
                this.f9821to.f9809ck = 1;
                this.f9821to.f9817to = interfaceC3762toM49142k4;
            }
            AbstractC3511c5 abstractC3511c5 = this.f9819k4;
            if (abstractC3511c5 != null) {
                abstractC3511c5.mo14089k4(abstractC3511c5Mo14166k4);
            }
            this.f9819k4 = abstractC3511c5Mo14166k4;
            if (abstractC3533umMo14088k4 != null && !this.f9821to.f9810du.m14409to()) {
                this.f9822x1 = abstractC3533umMo14088k4;
            }
            if (this.f9819k4.mo14084ix() != 10) {
                this.f9819k4.mo14083h4();
            }
        }

        @Override // com.aspose.slides.internal.p111em.C3763x1, com.aspose.slides.internal.p111em.InterfaceC3762to
        /* JADX INFO: renamed from: kk */
        public void mo14246kk() {
            this.f9819k4 = null;
        }

        @Override // com.aspose.slides.internal.p111em.C3763x1, com.aspose.slides.internal.p111em.InterfaceC3762to
        /* JADX INFO: renamed from: k4 */
        public void mo14245k4(char[] cArr, int i, int i2) {
            AbstractC3511c5 abstractC3511c5 = this.f9819k4;
            if (abstractC3511c5 != null) {
                abstractC3511c5.mo14124x1(cArr, i, i2, this.f9822x1, this.f9821to.m14239k4());
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.e0.fa$x1 */
    public static class x1 implements InterfaceC3532u4 {
        private x1() {
        }

        @Override // com.aspose.slides.internal.p097e0.InterfaceC3532u4
        /* JADX INFO: renamed from: k4 */
        public final AbstractC3533um mo14250k4(AbstractC3524ks abstractC3524ks, AbstractC3533um abstractC3533um) {
            return new C3509b3(abstractC3524ks, abstractC3533um);
        }
    }

    public C3518fa(String str, C12814to c12814to, AbstractC3150x6 abstractC3150x6) {
        this.f9811dy = c12814to;
        this.f9814k4 = c12814to.m59556du().m59530h4();
        this.f9812h4 = c12814to.m59575ne().m53590k4(c12814to, str, abstractC3150x6);
        if (this.f9811dy.m59583wl()) {
            this.f9812h4 = new C6222k4(c12814to.m59576qq(), this.f9812h4);
        }
        C3534up c3534up = new C3534up();
        this.f9810du = c3534up;
        c3534up.m14406k4(new x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC3757h4 m14239k4() {
        if (this.f9811dy.m59560ix()) {
            return this.f9816m9;
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p111em.C3763x1, com.aspose.slides.internal.p111em.InterfaceC3762to
    /* JADX INFO: renamed from: kk */
    public void mo14246kk() {
        this.f9817to.mo14246kk();
        if (this.f9818x1 == null && this.f9813jd) {
            C3543yj.m14416k4(this.f9811dy.m59580u4()).mo14342k4(this);
        }
        this.f9818x1 = null;
        this.f9812h4.mo8560x1();
    }

    @Override // com.aspose.slides.internal.p111em.C3763x1, com.aspose.slides.internal.p111em.InterfaceC3762to
    /* JADX INFO: renamed from: x1 */
    public void mo14247x1() {
        if (this.f9808c5) {
            throw new InvalidOperationException(C14113y2.m67408k4("FOTreeBuilder (and the Fop class) cannot be reused.", " Please instantiate a new instance."));
        }
        this.f9808c5 = true;
        this.f9813jd = true;
        this.f9818x1 = null;
        this.f9812h4.mo8552k4();
        k4 k4Var = new k4(this);
        this.f9815kk = k4Var;
        k4Var.mo14247x1();
        this.f9817to = this.f9815kk;
    }

    @Override // com.aspose.slides.internal.p111em.C3763x1, com.aspose.slides.internal.p111em.InterfaceC3762to
    /* JADX INFO: renamed from: x1 */
    public void mo14248x1(char[] cArr, int i, int i2) {
        this.f9817to.mo14248x1(cArr, i, i2);
    }

    @Override // com.aspose.slides.internal.p111em.C3763x1, com.aspose.slides.internal.p111em.InterfaceC3755du
    /* JADX INFO: renamed from: k4 */
    public void mo14240k4(C3753c5 c3753c5) {
    }

    @Override // com.aspose.slides.internal.p111em.C3763x1, com.aspose.slides.internal.p111em.InterfaceC3762to
    /* JADX INFO: renamed from: k4 */
    public void mo14241k4(InterfaceC3757h4 interfaceC3757h4) {
        this.f9816m9 = interfaceC3757h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14242k4(String str) {
        C12814to c12814to = this.f9811dy;
        if (c12814to != null) {
            c12814to.m59567k4(str);
        }
    }

    @Override // com.aspose.slides.internal.p111em.C3763x1, com.aspose.slides.internal.p111em.InterfaceC3762to
    /* JADX INFO: renamed from: k4 */
    public void mo14243k4(String str, String str2, String str3) {
        InterfaceC3762to interfaceC3762to;
        this.f9817to.mo14243k4(str, str2, str3);
        int i = this.f9809ck - 1;
        this.f9809ck = i;
        if (i != 0 || (interfaceC3762to = this.f9817to) == this.f9815kk) {
            return;
        }
        interfaceC3762to.mo14246kk();
        k4 k4Var = this.f9815kk;
        this.f9817to = k4Var;
        k4Var.mo14243k4(str, str2, str3);
    }

    @Override // com.aspose.slides.internal.p111em.C3763x1, com.aspose.slides.internal.p111em.InterfaceC3762to
    /* JADX INFO: renamed from: k4 */
    public void mo14244k4(String str, String str2, String str3, InterfaceC3760kk interfaceC3760kk) {
        this.f9809ck++;
        this.f9817to.mo14244k4(str, str2, str3, interfaceC3760kk);
    }

    @Override // com.aspose.slides.internal.p111em.C3763x1, com.aspose.slides.internal.p111em.InterfaceC3762to
    /* JADX INFO: renamed from: k4 */
    public void mo14245k4(char[] cArr, int i, int i2) {
        this.f9817to.mo14245k4(cArr, i, i2);
    }
}
