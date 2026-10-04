package com.aspose.slides.internal.p420th;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.th.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C10965m9 extends AbstractC10972up {

    /* JADX INFO: renamed from: k4 */
    private C10962kk f38219k4;

    /* JADX INFO: renamed from: to */
    private boolean f38221to;

    /* JADX INFO: renamed from: x1 */
    private C12007ix f38222x1 = new C12007ix();

    /* JADX INFO: renamed from: kk */
    private Stack<Float> f38220kk = new Stack<>();

    /* JADX INFO: renamed from: du */
    private Stack<C4317dy> f38218du = new Stack<>();

    /* JADX INFO: renamed from: x1 */
    private C10962kk m53021x1() {
        if (this.f38219k4 == null) {
            this.f38219k4 = new C10962kk();
        }
        return this.f38219k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12007ix m53022k4(AbstractC10973uz abstractC10973uz) {
        C12007ix.f40519k4.CloneTo(this.f38222x1);
        this.f38221to = false;
        if (abstractC10973uz == null) {
            return C12007ix.f40519k4;
        }
        m53112x1(abstractC10973uz);
        return this.f38222x1;
    }

    /* JADX INFO: renamed from: k4 */
    private void m53017k4() {
        this.f38218du.pop();
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo16981x1(C10948ar c10948ar) {
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16971k4(C10947ak c10947ak) {
        m53019k4(c10947ak.mo52867to().Clone());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo13529x1(C10950bv c10950bv) {
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16972k4(C10948ar c10948ar) {
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo13530x1(C10951c5 c10951c5) {
        m53017k4();
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13521k4(C10950bv c10950bv) {
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo13516x1(C10971um c10971um) {
        m53018k4((InterfaceC10954dq) c10971um);
        if (c10971um.m53098k4() != null) {
            this.f38220kk.push(Float.valueOf(c10971um.m53098k4().m17375x1() / 2.0f));
        } else {
            this.f38220kk.push(Float.valueOf(0.0f));
        }
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13522k4(C10951c5 c10951c5) {
        m53018k4((InterfaceC10954dq) c10951c5);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16973k4(C10953ck c10953ck) {
        m53019k4(c10953ck.mo52867to().Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private void m53018k4(InterfaceC10954dq interfaceC10954dq) {
        C4317dy c4317dyMo52909to = interfaceC10954dq.mo52909to();
        if (c4317dyMo52909to == null) {
            c4317dyMo52909to = new C4317dy();
        }
        if (this.f38218du.size() > 0) {
            C4317dy c4317dyPeek = this.f38218du.peek();
            c4317dyMo52909to = c4317dyMo52909to.m17345kk();
            c4317dyMo52909to.m17341k4(c4317dyPeek, 1);
        }
        this.f38218du.push(c4317dyMo52909to);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13523k4(C10955du c10955du) {
        m53019k4(m53021x1().m52971k4(c10955du).Clone().Clone());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16974k4(C10956dy c10956dy) {
        m53019k4(c10956dy.mo52867to().Clone());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16975k4(C10958h4 c10958h4) {
        m53020k4(c10958h4.m52933k4().Clone());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16976k4(C10960jd c10960jd) {
        m53019k4(c10960jd.mo52867to().Clone());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13524k4(C10963ks c10963ks) {
        m53018k4((InterfaceC10954dq) c10963ks);
        m53019k4(c10963ks.m52998ne().Clone());
        m53017k4();
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16977k4(C10967qq c10967qq) {
        m53020k4(c10967qq.m53027k4().Clone());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13525k4(C10970u4 c10970u4) {
        m53019k4(c10970u4.m53080kk().Clone());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13515k4(C10971um c10971um) {
        this.f38220kk.pop();
        m53017k4();
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13528k4(C10974v4 c10974v4) {
        List.Enumerator<C12025x6> it = c10974v4.m53117k4().iterator();
        while (it.hasNext()) {
            try {
                m53020k4(it.next().Clone());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16979k4(C10980yd c10980yd) {
        m53019k4(c10980yd.mo52867to().Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private void m53019k4(C12007ix c12007ix) {
        if (this.f38220kk.size() > 0) {
            float fFloatValue = this.f38220kk.peek().floatValue();
            C12007ix.m56542k4(c12007ix.Clone(), fFloatValue, fFloatValue).CloneTo(c12007ix);
        }
        if (this.f38218du.size() > 0) {
            this.f38218du.peek().m17332k4(c12007ix.Clone()).CloneTo(c12007ix);
        }
        if (this.f38221to) {
            C12007ix.m56549x1(this.f38222x1.Clone(), c12007ix.Clone()).CloneTo(this.f38222x1);
        } else {
            c12007ix.CloneTo(this.f38222x1);
            this.f38221to = true;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m53020k4(C12025x6 c12025x6) {
        m53019k4(new C12007ix(c12025x6.Clone(), C12015qq.f40552k4.Clone()));
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public boolean mo22157k4(C10966ne c10966ne) {
        return true;
    }
}
