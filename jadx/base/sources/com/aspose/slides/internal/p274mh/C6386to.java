package com.aspose.slides.internal.p274mh;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p167hh.C4587x1;
import com.aspose.slides.internal.p347px.AbstractC9608yj;
import com.aspose.slides.internal.p347px.C9577ar;
import com.aspose.slides.internal.p347px.C9581ck;
import com.aspose.slides.internal.p410sx.C10799k4;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.backend.System.Drawing.GraphicsEnv;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.mh.to */
/* JADX INFO: loaded from: classes4.dex */
public final class C6386to extends AbstractC6384k4 {

    /* JADX INFO: renamed from: kk */
    private HashSet<Integer> f18161kk;

    public C6386to() {
        super(C10799k4.m52367k4());
        this.f18161kk = new HashSet<>();
    }

    /* JADX INFO: renamed from: k4 */
    private int m26213k4(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    /* JADX INFO: renamed from: to */
    private int m26216to(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: x1 */
    private void m26217x1(AbstractC9608yj abstractC9608yj) {
        Collection<C4587x1> collectionMo67580k4 = GraphicsEnv.m67573du().mo67580k4(abstractC9608yj);
        synchronized (this.f18160x1) {
            try {
                Iterator<C4587x1> it = collectionMo67580k4.iterator();
                while (it.hasNext()) {
                    this.f18159k4.m52372k4(it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public void m26219kk(String str) throws FileNotFoundException {
        if (str == null) {
            throw new ArgumentNullException("filename");
        }
        String strM13406kk = C3141rv.m13406kk(str);
        int iM26216to = m26216to(strM13406kk);
        if (this.f18161kk.contains(Integer.valueOf(iM26216to))) {
            return;
        }
        m26214k4(new C9581ck(strM13406kk));
        this.f18161kk.add(Integer.valueOf(iM26216to));
    }

    /* JADX INFO: renamed from: k4 */
    private void m26214k4(AbstractC9608yj abstractC9608yj) throws Throwable {
        AbstractC3150x6 abstractC3150x6Mo46753x1;
        try {
            try {
                abstractC3150x6Mo46753x1 = abstractC9608yj.mo46753x1();
                try {
                    m26217x1(abstractC9608yj);
                    if (abstractC3150x6Mo46753x1 != null) {
                        abstractC3150x6Mo46753x1.dispose();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (abstractC3150x6Mo46753x1 != null) {
                        abstractC3150x6Mo46753x1.dispose();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                abstractC3150x6Mo46753x1 = null;
            }
        } catch (ArgumentException e) {
            throw e;
        } catch (Exception e2) {
            throw new FileNotFoundException(abstractC9608yj instanceof C9581ck ? C14113y2.m67402k4("The specified font '{0}' is not supported or the font file cannot be found", ((C9581ck) abstractC9608yj).m46810k4()) : "File not found", e2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m26218k4(C14112xw c14112xw, int i) {
        if (c14112xw == null) {
            throw new ArgumentException("Pointer can't be null");
        }
        try {
            byte[] bArrCopyOfRange = (byte[]) c14112xw.m67356kk().m19850k4();
            if (bArrCopyOfRange.length != i) {
                bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, 0, i);
            }
            int iM26213k4 = m26213k4(bArrCopyOfRange);
            if (this.f18161kk.contains(Integer.valueOf(iM26213k4))) {
                return;
            }
            m26214k4(new C9577ar(bArrCopyOfRange));
            this.f18161kk.add(Integer.valueOf(iM26213k4));
        } catch (Exception e) {
            throw new FileNotFoundException("File not found", e);
        }
    }

    @Override // com.aspose.slides.internal.p274mh.AbstractC6384k4
    /* JADX INFO: renamed from: k4 */
    public void mo26210k4(boolean z) {
        this.f18159k4 = null;
        this.f18161kk = null;
        super.mo26210k4(z);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m26215k4(C6386to c6386to, C6386to c6386to2) {
        return false;
    }
}
