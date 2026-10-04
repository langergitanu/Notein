package com.aspose.slides.internal.p159h0;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p159h0.AbstractC4434bz;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.bv */
/* JADX INFO: loaded from: classes.dex */
public class C4433bv implements IGenericEnumerable<AbstractC4434bz.k4> {

    /* JADX INFO: renamed from: du */
    private int f12165du;

    /* JADX INFO: renamed from: h4 */
    private short f12166h4;

    /* JADX INFO: renamed from: k4 */
    private C4489zj[] f12167k4;

    /* JADX INFO: renamed from: kk */
    private C4459os[] f12168kk;

    /* JADX INFO: renamed from: to */
    private int[] f12169to;

    /* JADX INFO: renamed from: x1 */
    private C4489zj[] f12170x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.h0.bv$k4 */
    public static class k4 implements IGenericEnumerator<AbstractC4434bz.k4> {

        /* JADX INFO: renamed from: k4 */
        private C4433bv f12171k4;

        /* JADX INFO: renamed from: x1 */
        private int f12173x1 = -3;

        /* JADX INFO: renamed from: kk */
        private AbstractC4434bz.k4 f12172kk = new AbstractC4434bz.k4();

        public k4(C4433bv c4433bv) {
            if (c4433bv == null) {
                throw new ArgumentNullException("mesh");
            }
            this.f12171k4 = c4433bv.m18074h4();
        }

        @Override // com.aspose.slides.p559ms.System.IDisposable
        public final void dispose() {
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public final boolean hasNext() {
            int i = this.f12173x1 + 3;
            this.f12173x1 = i;
            return i < this.f12171k4.m18084kk().length + (-2);
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public final AbstractC4434bz.k4 next() {
            int i = this.f12171k4.m18084kk()[this.f12173x1];
            this.f12171k4.f12167k4[i].CloneTo(this.f12172kk.f12178k4.f12185k4);
            this.f12171k4.f12170x1[i].CloneTo(this.f12172kk.f12178k4.f12187x1);
            this.f12171k4.m18087x1()[i].CloneTo(this.f12172kk.f12178k4.f12186kk);
            int i2 = this.f12171k4.m18084kk()[this.f12173x1 + 1];
            this.f12171k4.f12167k4[i2].CloneTo(this.f12172kk.f12180x1.f12185k4);
            this.f12171k4.f12170x1[i2].CloneTo(this.f12172kk.f12180x1.f12187x1);
            this.f12171k4.m18087x1()[i2].CloneTo(this.f12172kk.f12180x1.f12186kk);
            int i3 = this.f12171k4.m18084kk()[this.f12173x1 + 2];
            this.f12171k4.f12167k4[i3].CloneTo(this.f12172kk.f12179kk.f12185k4);
            this.f12171k4.f12170x1[i3].CloneTo(this.f12172kk.f12179kk.f12187x1);
            this.f12171k4.m18087x1()[i3].CloneTo(this.f12172kk.f12179kk.f12186kk);
            return this.f12172kk;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public final void reset() {
            this.f12173x1 = -3;
        }
    }

    public C4433bv(int i) {
        this.f12165du = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public C4433bv m18074h4() {
        if (this.f12170x1 == null) {
            this.f12170x1 = (C4489zj[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C4489zj.class), this.f12167k4.length));
        }
        C4489zj[] c4489zjArr = this.f12170x1;
        int length = c4489zjArr.length;
        C4489zj[] c4489zjArr2 = this.f12167k4;
        if (length < c4489zjArr2.length) {
            int length2 = c4489zjArr.length;
            C4489zj[][] c4489zjArr3 = {c4489zjArr};
            AbstractC14092to.m67239k4((Object[][]) c4489zjArr3, c4489zjArr2.length);
            this.f12170x1 = c4489zjArr3[0];
        }
        if (this.f12168kk == null) {
            this.f12168kk = (C4459os[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C4459os.class), this.f12167k4.length));
        }
        C4459os[] c4459osArr = this.f12168kk;
        int length3 = c4459osArr.length;
        C4489zj[] c4489zjArr4 = this.f12167k4;
        if (length3 < c4489zjArr4.length) {
            int length4 = c4459osArr.length;
            C4459os[][] c4459osArr2 = {c4459osArr};
            AbstractC14092to.m67239k4((Object[][]) c4459osArr2, c4489zjArr4.length);
            this.f12168kk = c4459osArr2[0];
        }
        return this;
    }

    /* JADX INFO: renamed from: du */
    public final short m18078du() {
        return this.f12166h4;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<AbstractC4434bz.k4> iterator() {
        return new k4(this);
    }

    /* JADX INFO: renamed from: kk */
    public final int[] m18084kk() {
        return this.f12169to;
    }

    /* JADX INFO: renamed from: to */
    public final int m18085to() {
        return this.f12165du;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m18086x1(C4489zj[] c4489zjArr) {
        this.f12170x1 = c4489zjArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18079k4(short s) {
        this.f12166h4 = s;
    }

    /* JADX INFO: renamed from: x1 */
    public final C4459os[] m18087x1() {
        return this.f12168kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18080k4(int[] iArr) {
        if (iArr == null) {
            throw new ArgumentNullException("Triangles");
        }
        this.f12169to = iArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18081k4(C4459os[] c4459osArr) {
        this.f12168kk = c4459osArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18082k4(C4489zj[] c4489zjArr) {
        if (c4489zjArr == null) {
            throw new ArgumentNullException("value");
        }
        this.f12167k4 = c4489zjArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final C4489zj[] m18083k4() {
        return this.f12167k4;
    }
}
