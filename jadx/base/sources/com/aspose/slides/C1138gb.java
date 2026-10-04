package com.aspose.slides;

import OooooOo.C21392OooOo00;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.ObjectModel.ReadOnlyCollection;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.gb */
/* JADX INFO: loaded from: classes3.dex */
final class C1138gb extends el1 {

    /* JADX INFO: renamed from: du */
    private float f5180du;

    /* JADX INFO: renamed from: fa */
    private oju f5181fa;

    /* JADX INFO: renamed from: h4 */
    private float f5182h4;

    /* JADX INFO: renamed from: k4 */
    public final C14327q4 f5183k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC1182h2<oss> f5184kk;

    /* JADX INFO: renamed from: to */
    private InterfaceC1182h2<oss> f5185to;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC1182h2<oss> f5186x1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1138gb(MathDelimiter mathDelimiter, InterfaceC0851ce interfaceC0851ce, C14327q4 c14327q4) {
        super(mathDelimiter, interfaceC0851ce);
        C14327q4 c14327q42 = new C14327q4();
        this.f5183k4 = c14327q42;
        this.f5181fa = new oju();
        c14327q4.CloneTo(c14327q42);
        IGenericEnumerator<IMathElement> it = mathDelimiter.getArguments().iterator();
        while (it.hasNext()) {
            try {
                m5579k4(it.next(), c14327q4.Clone());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final MathDelimiter m6463k4() {
        return (MathDelimiter) this.f4820c5;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m6464x1() {
        return this.f5184kk.mo6969k4().f47913kk;
    }

    /* JADX INFO: renamed from: k4 */
    private h2y m6462k4(h2y h2yVar, float f, nn2 nn2Var, oju[] ojuVarArr) {
        wsf wsfVarClone = h2yVar.f5390x1.Clone();
        this.f5186x1 = mo4555du().m69386k4().mo64920k4(m6463k4().getBeginningCharacter(), this.f5183k4.f48231du, f);
        this.f5184kk = mo4555du().m69386k4().mo64920k4(m6463k4().getEndingCharacter(), this.f5183k4.f48231du, f);
        oss ossVarClone = this.f5186x1.mo6969k4().Clone();
        oss ossVarClone2 = this.f5184kk.mo6969k4().Clone();
        float fM68101c5 = wsfVarClone.f49849k4 - nn2Var.m68101c5();
        this.f5182h4 = fM68101c5 - (ossVarClone.f47913kk / 2.0f);
        oju ojuVar = this.f5181fa;
        ojuVar.f47837x1 = fM68101c5 - (ossVarClone2.f47913kk / 2.0f);
        ojuVar.f47836k4 = ossVarClone.f47912k4 + h2yVar.f5389k4;
        h2y h2yVar2 = new h2y();
        wsfVarClone.CloneTo(h2yVar2.f5390x1);
        h2yVar2.f5389k4 = ossVarClone.f47912k4 + h2yVar.f5389k4 + ossVarClone2.f47912k4;
        h2yVar2.f5390x1.f49850x1 = C14116yg.m67481k4(C14116yg.m67481k4(this.f5182h4 + ossVarClone.f47913kk, this.f5181fa.f47837x1 + ossVarClone2.f47913kk), wsfVarClone.m72912k4()) - wsfVarClone.f49849k4;
        float fM67504x1 = C14116yg.m67504x1(C14116yg.m67504x1(this.f5182h4, this.f5181fa.f47837x1), 0.0f);
        h2yVar2.f5390x1.f49849k4 = wsfVarClone.f49849k4 - fM67504x1;
        if (fM67504x1 >= 0.0f) {
            ojuVarArr[0] = new oju(ossVarClone.f47912k4, 0.0f);
            return h2yVar2;
        }
        ojuVarArr[0] = new oju(ossVarClone.f47912k4, -fM67504x1);
        this.f5182h4 -= fM67504x1;
        this.f5181fa.f47837x1 -= fM67504x1;
        return h2yVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b5, code lost:
    
        r7 = r5.m72912k4() * 1.1f;
     */
    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h2y mo3934k4(oju ojuVar) {
        float fM72912k4;
        float f;
        if (m6463k4().getArguments().getCount() == 0) {
            return new h2y();
        }
        nn2 nn2VarM69387k4 = mo4555du().m69387k4(this.f5183k4.f48231du);
        int i = 1;
        if (m6463k4().getArguments().getCount() != 1) {
            h2y h2yVarClone = this.f4826m9.get_Item(0).m5578h4().Clone();
            float[] fArr = new float[this.f4826m9.size()];
            for (int i2 = 1; i2 < this.f4826m9.size(); i2++) {
                wsf.m72910k4(h2yVarClone.f5390x1.Clone(), this.f4826m9.get_Item(i2).m5578h4().f5390x1.Clone()).CloneTo(h2yVarClone.f5390x1);
            }
            InterfaceC1182h2<oss> interfaceC1182h2Mo64920k4 = mo4555du().m69386k4().mo64920k4(m6463k4().getSeparatorCharacter(), this.f5183k4.f48231du, h2yVarClone.f5390x1.m72912k4());
            this.f5185to = interfaceC1182h2Mo64920k4;
            float f2 = interfaceC1182h2Mo64920k4.mo6969k4().f47912k4;
            loop2: while (true) {
                h2yVarClone.f5389k4 += f2;
                while (i < this.f4826m9.size()) {
                    el1 el1Var = this.f4826m9.get_Item(i);
                    float f3 = h2yVarClone.f5389k4;
                    fArr[i] = f3;
                    h2yVarClone.f5389k4 = f3 + el1Var.m5578h4().f5389k4;
                    i++;
                    if (i < this.f4826m9.size()) {
                        break;
                    }
                }
            }
            oju ojuVar2 = new oju();
            oju[] ojuVarArr = {ojuVar2};
            h2y h2yVarClone2 = m6462k4(h2yVarClone.Clone(), h2yVarClone.f5390x1.m72912k4(), nn2VarM69387k4, ojuVarArr).Clone();
            ojuVarArr[0].CloneTo(ojuVar2);
            wsf wsfVar = new wsf((this.f5185to.mo6969k4().f47913kk / 2.0f) + nn2VarM69387k4.m68101c5(), this.f5185to.mo6969k4().f47913kk - ((this.f5185to.mo6969k4().f47913kk / 2.0f) + nn2VarM69387k4.m68101c5()));
            wsf.m72910k4(h2yVarClone2.f5390x1.Clone(), wsfVar.Clone()).CloneTo(h2yVarClone2.f5390x1);
            this.f5180du = (h2yVarClone.f5390x1.f49849k4 - wsfVar.f49849k4) + ojuVar2.f47837x1;
            for (int i3 = 0; i3 < this.f4826m9.size(); i3++) {
                el1 el1Var2 = this.f4826m9.get_Item(i3);
                el1Var2.m5584x1(fArr[i3] + ojuVar2.f47836k4, (h2yVarClone.f5390x1.f49849k4 - el1Var2.m5578h4().f5390x1.f49849k4) + ojuVar2.f47837x1);
            }
            return h2yVarClone2;
        }
        el1 el1Var3 = this.f4826m9.get_Item(0);
        h2y h2yVarClone3 = el1Var3.m5578h4().Clone();
        wsf wsfVarClone = h2yVarClone3.f5390x1.Clone();
        oju ojuVar3 = new oju();
        float fM72912k42 = wsfVarClone.m72912k4() * 1.087f;
        if (C7019kk.m27469x1(el1Var3, t8a.class)) {
            fM72912k42 = wsfVarClone.m72912k4() * (m6463k4().getBeginningCharacter() == '(' ? 0.934f : 0.924f);
            IGenericEnumerator<el1> it = el1Var3.f4826m9.iterator();
            while (true) {
                try {
                    if (!it.hasNext()) {
                        break;
                    }
                    el1 next = it.next();
                    if (C7019kk.m27469x1(next, dxs.class) && C7019kk.m27469x1(next.f4820c5, MathSuperscriptElement.class) && next.m5578h4().f5390x1.m72912k4() * 1.2f > h2yVarClone3.f5390x1.m72912k4()) {
                        break;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        if (C7019kk.m27469x1(el1Var3, b0t.class)) {
            fM72912k42 = 0.8f * wsfVarClone.m72912k4();
        }
        if (C7019kk.m27469x1(el1Var3, dxs.class)) {
            if (C7019kk.m27469x1(el1Var3.f4826m9.get_Item(1), C14431s3.class)) {
                nn2VarM69387k4 = mo4555du().m69387k4(wsfVarClone.m72912k4() * 1.74f);
                fM72912k4 = wsfVarClone.m72912k4();
                f = 0.87f;
            } else if (C7019kk.m27469x1(el1Var3.f4826m9.get_Item(1), dxs.class)) {
                fM72912k4 = wsfVarClone.m72912k4();
                f = 1.3f;
            }
            fM72912k42 = fM72912k4 * f;
        }
        if (this.f5183k4.f48238m9 || C7019kk.m27469x1(el1Var3, C13818m2.class)) {
            fM72912k42 = wsfVarClone.m72912k4() * 1.01f;
        }
        if (C7019kk.m27469x1(el1Var3, C14431s3.class)) {
            C14431s3 c14431s3 = (C14431s3) C7019kk.m27452k4((Object) el1Var3, C14431s3.class);
            fM72912k42 = (!mo4555du().f48222h4.m1999k4() || this.f5183k4.f48241x1 > 0) ? wsfVarClone.m72912k4() * 0.85f : C21392OooOo00.OooO00o(c14431s3.m70433k4().m5578h4().f5390x1.f49850x1, 0.9f, c14431s3.m70433k4().m5578h4().f5390x1.m72912k4(), 2.95f);
        }
        oju[] ojuVarArr2 = {ojuVar3};
        h2y h2yVarClone4 = m6462k4(h2yVarClone3.Clone(), fM72912k42, nn2VarM69387k4, ojuVarArr2).Clone();
        ojuVarArr2[0].CloneTo(ojuVar3);
        el1Var3.m5585x1(ojuVar3.Clone());
        return h2yVarClone4;
    }

    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    public void mo3976k4(yvz yvzVar) {
        pzd pzdVar;
        AbstractC12024x1 abstractC12024x1M5580k4 = m5580k4(yvzVar.f50412x1);
        InterfaceC1182h2<oss> interfaceC1182h2 = this.f5186x1;
        if (interfaceC1182h2 != null && interfaceC1182h2.mo6969k4().f47912k4 != 0.0f) {
            pzdVar = new pzd(yvzVar.f50411k4);
            try {
                yvzVar.f50411k4.m74612k4(0.0f, this.f5182h4);
                this.f5186x1.mo7635k4(yvzVar.f50411k4, abstractC12024x1M5580k4);
            } finally {
            }
        }
        ReadOnlyCollection<el1> readOnlyCollection = this.f4826m9;
        if (readOnlyCollection.size() > 1) {
            for (int i = 0; i < readOnlyCollection.size(); i++) {
                el1 el1Var = readOnlyCollection.get_Item(i);
                oju ojuVarClone = el1Var.m5583m9().Clone();
                pzdVar = new pzd(yvzVar.f50411k4);
                if (i > 0) {
                    try {
                        yvzVar.f50411k4.m74612k4(ojuVarClone.f47836k4 - this.f5185to.mo6969k4().f47912k4, this.f5180du);
                        this.f5185to.mo7635k4(yvzVar.f50411k4, abstractC12024x1M5580k4);
                    } finally {
                    }
                }
                pzdVar.dispose();
                pzdVar = new pzd(yvzVar.f50411k4);
                try {
                    yvzVar.f50411k4.m74612k4(ojuVarClone.f47836k4, ojuVarClone.f47837x1);
                    el1Var.mo3976k4(yvzVar.Clone());
                    pzdVar.dispose();
                } finally {
                }
            }
        } else {
            super.mo3976k4(yvzVar.Clone());
        }
        InterfaceC1182h2<oss> interfaceC1182h22 = this.f5184kk;
        if (interfaceC1182h22 == null || interfaceC1182h22.mo6969k4().f47912k4 == 0.0f) {
            return;
        }
        pzdVar = new pzd(yvzVar.f50411k4);
        try {
            AbstractC14897zn abstractC14897zn = yvzVar.f50411k4;
            oju ojuVar = this.f5181fa;
            abstractC14897zn.m74612k4(ojuVar.f47836k4, ojuVar.f47837x1);
            this.f5184kk.mo7635k4(yvzVar.f50411k4, abstractC12024x1M5580k4);
        } finally {
        }
    }
}
