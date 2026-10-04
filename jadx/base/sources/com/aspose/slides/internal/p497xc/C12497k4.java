package com.aspose.slides.internal.p497xc;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p151gj.C4321k4;
import com.aspose.slides.internal.p151gj.C4325rv;
import com.aspose.slides.internal.p151gj.C4329x6;
import com.aspose.slides.internal.p158gz.C4425k4;
import com.aspose.slides.internal.p158gz.C4426kk;
import com.aspose.slides.internal.p163h9.C4512k4;
import com.aspose.slides.internal.p163h9.C4513kk;
import com.aspose.slides.internal.p163h9.C4514x1;
import com.aspose.slides.internal.p172hu.AbstractC4687to;
import com.aspose.slides.internal.p233kn.C5888k4;
import com.aspose.slides.internal.p269m8.C6328k4;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.p559ms.System.AbstractC14071k4;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.xc.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12497k4 implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC12500x1 f41814k4;

    /* JADX INFO: renamed from: kk */
    private final C4514x1 f41815kk;

    /* JADX INFO: renamed from: to */
    private final C12023wl f41816to;

    /* JADX INFO: renamed from: x1 */
    private final C4321k4[] f41817x1;

    public C12497k4(AbstractC3150x6 abstractC3150x6, C12023wl c12023wl) {
        C12023wl c12023wl2 = new C12023wl();
        this.f41816to = c12023wl2;
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("stream");
        }
        c12023wl.CloneTo(c12023wl2);
        this.f41815kk = C4514x1.m18603k4(abstractC3150x6, new C4329x6(c12023wl.m56865x1(), c12023wl.m56862kk()), null, (byte) 0);
        int iM56862kk = c12023wl.m56862kk() * c12023wl.m56865x1();
        this.f41817x1 = (C4321k4[]) C22200OooO0o0.OooO00o(C4321k4.class, iM56862kk);
        this.f41814k4 = new C12496h4(new C12498kk(iM56862kk));
    }

    /* JADX INFO: renamed from: k4 */
    private C4426kk<C4321k4> m58050k4(C12009k4 c12009k4) {
        final C4426kk<C4321k4> c4426kk = new C4426kk<>(this.f41817x1, 0, 0);
        final C4425k4 c4425k4 = new C4425k4(new AbstractC14071k4<C4321k4>() { // from class: com.aspose.slides.internal.xc.k4.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c4426kk) + "Aspose.Foundation.Gif.Common.Portable.ArraySegmentAsIList<T>.Add(T)";
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14071k4
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public void invoke(C4321k4 c4321k4) {
                c4426kk.addItem(c4321k4);
            }
        }, new AbstractC4687to<Integer, C4321k4>() { // from class: com.aspose.slides.internal.xc.k4.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Foundation.Drawing.ArgbColor.FromArgbInt(int)";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4687to
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C4321k4 invoke(Integer num) {
                return C4321k4.m17379k4(num.intValue());
            }
        });
        C6328k4.m25906k4(c12009k4, new AbstractC14071k4<Integer>() { // from class: com.aspose.slides.internal.xc.k4.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c4425k4) + "Aspose.Foundation.Gif.Common.Portable.ActionWithConvert<TArg,TResult>.Do(TArg)";
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14071k4
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public void invoke(Integer num) {
                c4425k4.m18033k4(num);
            }
        });
        return c4426kk;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f41815kk.dispose();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58051k4(C12009k4 c12009k4, int i) {
        if (c12009k4 == null) {
            throw new ArgumentNullException("frame");
        }
        if (C12023wl.m56856k4(c12009k4.m56329fa(), this.f41816to)) {
            throw new ArgumentOutOfRangeException("frame", "frame.Size != FrameSize");
        }
        C4426kk<C4321k4> c4426kkM58050k4 = m58050k4(c12009k4);
        byte[] bArr = new byte[c4426kkM58050k4.m18035k4()];
        IGenericList<C4325rv> iGenericListMo58049k4 = this.f41814k4.mo58049k4(c4426kkM58050k4, bArr);
        C4513kk c4513kkM18605k4 = this.f41815kk.m18605k4(i);
        try {
            C4512k4 c4512k4 = new C4512k4();
            c4512k4.f12571kk = iGenericListMo58049k4;
            c4512k4.f12572x1 = bArr;
            c4512k4.f12570k4 = new C5888k4<>(new C4329x6(0, 0), new C4329x6(c12009k4.mo15760yj(), c12009k4.mo15757m9()));
            c4513kkM18605k4.m18602k4(c4512k4.Clone());
            c4513kkM18605k4.dispose();
        } catch (Throwable th) {
            if (c4513kkM18605k4 != null) {
                c4513kkM18605k4.dispose();
            }
            throw th;
        }
    }
}
