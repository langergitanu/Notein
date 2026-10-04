package com.aspose.slides.internal.p481wp;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p048bv.C1869to;

/* JADX INFO: renamed from: com.aspose.slides.internal.wp.wy */
/* JADX INFO: loaded from: classes5.dex */
public class C12240wy extends AbstractC12244yj {

    /* JADX INFO: renamed from: x1 */
    private List<du> f40765x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.wp.wy$du */
    public interface du {
        /* JADX INFO: renamed from: k4 */
        void mo57161k4(AbstractC12244yj abstractC12244yj);
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.wp.wy$h4 */
    public static class h4 implements du {

        /* JADX INFO: renamed from: k4 */
        private AbstractC12228lr f40766k4;

        public h4(AbstractC12228lr abstractC12228lr) {
            this.f40766k4 = abstractC12228lr;
        }

        @Override // com.aspose.slides.internal.p481wp.C12240wy.du
        /* JADX INFO: renamed from: k4 */
        public final void mo57161k4(AbstractC12244yj abstractC12244yj) {
            abstractC12244yj.mo57077x1(this.f40766k4);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.wp.wy$k4 */
    public static class k4 implements du {

        /* JADX INFO: renamed from: k4 */
        private C12234u4 f40767k4;

        public k4(C12234u4 c12234u4) {
            this.f40767k4 = c12234u4;
        }

        @Override // com.aspose.slides.internal.p481wp.C12240wy.du
        /* JADX INFO: renamed from: k4 */
        public final void mo57161k4(AbstractC12244yj abstractC12244yj) {
            abstractC12244yj.mo57073k4(this.f40767k4);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.wp.wy$kk */
    public static class kk implements du {
        @Override // com.aspose.slides.internal.p481wp.C12240wy.du
        /* JADX INFO: renamed from: k4 */
        public final void mo57161k4(AbstractC12244yj abstractC12244yj) {
            abstractC12244yj.mo57076x1();
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.wp.wy$m9 */
    public static class m9 implements du {

        /* JADX INFO: renamed from: k4 */
        private C12243yd f40768k4;

        public m9(C12243yd c12243yd) {
            this.f40768k4 = c12243yd;
        }

        @Override // com.aspose.slides.internal.p481wp.C12240wy.du
        /* JADX INFO: renamed from: k4 */
        public final void mo57161k4(AbstractC12244yj abstractC12244yj) {
            abstractC12244yj.mo57074k4(this.f40768k4);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.wp.wy$to */
    public static class to implements du {
        @Override // com.aspose.slides.internal.p481wp.C12240wy.du
        /* JADX INFO: renamed from: k4 */
        public final void mo57161k4(AbstractC12244yj abstractC12244yj) {
            abstractC12244yj.mo57071k4();
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.wp.wy$x1 */
    public static class x1 implements du {

        /* JADX INFO: renamed from: k4 */
        private AbstractC12228lr f40769k4;

        public x1(AbstractC12228lr abstractC12228lr) {
            this.f40769k4 = abstractC12228lr;
        }

        @Override // com.aspose.slides.internal.p481wp.C12240wy.du
        /* JADX INFO: renamed from: k4 */
        public final void mo57161k4(AbstractC12244yj abstractC12244yj) {
            abstractC12244yj.mo57072k4(this.f40769k4);
        }
    }

    public C12240wy(C12232rv c12232rv) {
        super(c12232rv);
        this.f40765x1 = new List<>();
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12244yj
    /* JADX INFO: renamed from: k4 */
    public void mo57071k4() {
        this.f40765x1.addItem(new to());
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12244yj
    /* JADX INFO: renamed from: kk */
    public void mo57075kk() {
        C12229m9 c12229m9 = new C12229m9(this.f40800k4);
        C1869to c1869to = new C1869to(this.f40765x1);
        while (c1869to.mo9764x1()) {
            ((du) c1869to.mo9760kk()).mo57161k4(c12229m9);
        }
        c12229m9.mo57075kk();
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12244yj
    /* JADX INFO: renamed from: x1 */
    public void mo57076x1() {
        this.f40765x1.addItem(new kk());
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12244yj
    /* JADX INFO: renamed from: k4 */
    public void mo57072k4(AbstractC12228lr abstractC12228lr) {
        this.f40765x1.addItem(new x1(abstractC12228lr));
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12244yj
    /* JADX INFO: renamed from: x1 */
    public void mo57077x1(AbstractC12228lr abstractC12228lr) {
        this.f40765x1.addItem(new h4(abstractC12228lr));
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12244yj
    /* JADX INFO: renamed from: k4 */
    public void mo57073k4(C12234u4 c12234u4) {
        this.f40765x1.addItem(new k4(c12234u4));
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12244yj
    /* JADX INFO: renamed from: k4 */
    public void mo57074k4(C12243yd c12243yd) {
        this.f40765x1.addItem(new m9(c12243yd));
    }
}
