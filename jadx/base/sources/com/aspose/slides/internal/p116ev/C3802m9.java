package com.aspose.slides.internal.p116ev;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p264m3.InterfaceC6313x1;
import com.aspose.slides.internal.p275mi.AbstractC6395x1;
import com.aspose.slides.internal.p275mi.C6393m9;
import com.aspose.slides.internal.p275mi.C6394to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p558zz.C13637dy;
import com.aspose.slides.internal.p558zz.C13641m9;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ev.m9 */
/* JADX INFO: loaded from: classes.dex */
public class C3802m9 extends C6393m9 {

    /* JADX INFO: renamed from: kk */
    private int f10352kk;

    /* JADX INFO: renamed from: to */
    private int f10353to;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ev.m9$k4 */
    public static class k4 extends C6393m9.k4 {

        /* JADX INFO: renamed from: k4 */
        private int f10354k4;

        /* JADX INFO: renamed from: kk */
        private List<Integer> f10355kk;

        /* JADX INFO: renamed from: x1 */
        private int f10356x1;

        private k4(C6394to c6394to, C13637dy c13637dy) {
            super(c6394to, c13637dy);
            this.f10354k4 = 1;
            this.f10356x1 = -1;
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: ck */
        public int mo14943ck() {
            List<Integer> list = this.f10355kk;
            if (list == null) {
                return 0;
            }
            int i = this.f10354k4;
            int size = list.size();
            return i == 1 ? size * 4 : size * 2;
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: fa */
        public void mo14944fa() {
            m15201x1(m26247kk());
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: jd */
        public boolean mo14945jd() {
            return this.f10355kk != null;
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: k4 */
        public int mo14946k4(C13637dy c13637dy) {
            List.Enumerator<Integer> it = this.f10355kk.iterator();
            int iM62962k4 = 0;
            while (it.hasNext()) {
                try {
                    int iIntValue = ((Integer) C7019kk.m27464to(it.next(), Integer.TYPE)).intValue();
                    iM62962k4 += this.f10354k4 == 1 ? c13637dy.m62962k4(iM62962k4, iIntValue) : c13637dy.m62968to(iM62962k4, iIntValue / 2);
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
            this.f10356x1 = this.f10355kk.size() - 1;
            return iM62962k4;
        }

        /* JADX INFO: renamed from: x1 */
        public final void m15204x1(int i) {
            this.f10356x1 = i;
        }

        /* JADX INFO: renamed from: k4 */
        public static k4 m15200k4(C6394to c6394to, C13637dy c13637dy) {
            return new k4(c6394to, c13637dy);
        }

        /* JADX INFO: renamed from: x1 */
        private void m15201x1(C13641m9 c13641m9) {
            m15202x1(false);
            if (this.f10355kk == null) {
                this.f10355kk = new List<>();
            }
            if (c13641m9 != null) {
                if (this.f10356x1 < 0) {
                    throw new InvalidOperationException("numglyphs not set on LocaTable Builder.");
                }
                InterfaceC6313x1 interfaceC6313x1M15196h4 = new C3802m9(m26228up(), c13641m9, this.f10354k4, this.f10356x1).m15196h4();
                while (interfaceC6313x1M15196h4.mo14953k4()) {
                    this.f10355kk.addItem((Integer) C7019kk.m27464to(interfaceC6313x1M15196h4.mo14954x1(), Integer.TYPE));
                }
            }
        }

        /* JADX INFO: renamed from: x1 */
        private void m15202x1(boolean z) {
            List<Integer> list = this.f10355kk;
            if (list != null) {
                list.clear();
            }
            if (z) {
                this.f10355kk = null;
            }
            m26246k4(false);
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: k4 */
        public AbstractC6395x1 mo14947k4(C13641m9 c13641m9) {
            return new C3802m9(m26228up(), c13641m9, this.f10354k4, this.f10356x1);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m15203k4(int i) {
            this.f10354k4 = i;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.ev.m9$x1 */
    public static class x1 implements InterfaceC6313x1 {

        /* JADX INFO: renamed from: k4 */
        private int f10357k4;

        /* JADX INFO: renamed from: x1 */
        private C3802m9 f10358x1;

        public x1(C3802m9 c3802m9) {
            this.f10358x1 = c3802m9;
        }

        @Override // com.aspose.slides.internal.p264m3.InterfaceC6313x1
        /* JADX INFO: renamed from: k4 */
        public final boolean mo14953k4() {
            return this.f10357k4 <= this.f10358x1.f10353to;
        }

        @Override // com.aspose.slides.internal.p264m3.InterfaceC6313x1
        /* JADX INFO: renamed from: x1 */
        public final Object mo14954x1() {
            C3802m9 c3802m9 = this.f10358x1;
            int i = this.f10357k4;
            this.f10357k4 = i + 1;
            return Integer.valueOf(c3802m9.m15198kk(i));
        }
    }

    private C3802m9(C6394to c6394to, C13641m9 c13641m9, int i, int i2) {
        super(c6394to, c13641m9);
        this.f10352kk = i;
        this.f10353to = i2;
    }

    /* JADX INFO: renamed from: du */
    public final int m15195du() {
        return this.f10353to;
    }

    /* JADX INFO: renamed from: h4 */
    public final InterfaceC6313x1 m15196h4() {
        return new x1(this);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m15197k4(int i) {
        if (i < 0 || i >= this.f10353to) {
            throw new IndexOutOfRangeException("Glyph ID is out of bounds.");
        }
        return m15198kk(i);
    }

    /* JADX INFO: renamed from: kk */
    public final int m15198kk(int i) {
        if (i <= this.f10353to) {
            return this.f10352kk == 0 ? this.f18176k4.m62997du(i * 2) * 2 : this.f18176k4.m62998dy(i * 4);
        }
        throw new IndexOutOfRangeException();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m15199x1(int i) {
        if (i < 0 || i >= this.f10353to) {
            throw new IndexOutOfRangeException("Glyph ID is out of bounds.");
        }
        return m15198kk(i + 1) - m15198kk(i);
    }
}
