package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p151gj.C4321k4;
import com.aspose.slides.internal.p151gj.C4329x6;
import com.aspose.slides.internal.p172hu.AbstractC4682du;
import com.aspose.slides.internal.p269m8.C6328k4;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12023wl;

/* JADX INFO: renamed from: com.aspose.slides.bx */
/* JADX INFO: loaded from: classes3.dex */
final class C0834bx {

    /* JADX INFO: renamed from: k4 */
    public final C12009k4 f4254k4;

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC1225hv f4255x1;

    public C0834bx(C12023wl c12023wl, InterfaceC1225hv interfaceC1225hv) {
        if (interfaceC1225hv == null) {
            throw new ArgumentNullException("input");
        }
        this.f4255x1 = interfaceC1225hv;
        this.f4254k4 = new C12009k4(c12023wl.m56865x1(), c12023wl.m56862kk());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static int m4345x1(int i, int i2) {
        C4321k4 c4321k4Clone = C4321k4.m17379k4(i).Clone();
        c4321k4Clone.f11802x1 = C22202OooO0oo.OooO00o((C4321k4.m17379k4(i2).Clone().f11800kk & 255) / 255.0f, c4321k4Clone.f11802x1 & 255, 13);
        return c4321k4Clone.m17384x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4346k4() {
        this.f4254k4.dispose();
        this.f4255x1.dispose();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4347k4(float f) {
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) this.f4254k4);
        try {
            abstractC12008jdM56582k4.mo17517k4(C12003du.m56460uz().Clone());
            this.f4255x1.mo3090k4(f, abstractC12008jdM56582k4);
            abstractC12008jdM56582k4.dispose();
        } catch (Throwable th) {
            if (abstractC12008jdM56582k4 != null) {
                abstractC12008jdM56582k4.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4348k4(C4329x6 c4329x6, C12009k4 c12009k4) {
        C4329x6 c4329x62 = new C4329x6(this.f4254k4.mo15760yj(), this.f4254k4.mo15757m9());
        C4329x6 c4329x6Clone = C4329x6.f11825k4.Clone();
        C4329x6[] c4329x6Arr = {c4329x6};
        C4329x6[] c4329x6Arr2 = {c4329x6Clone};
        C4329x6[] c4329x6Arr3 = {c4329x62};
        C6328k4.m25899k4(new C4329x6(c12009k4.mo15760yj(), c12009k4.mo15757m9()), c4329x6Arr3[0].Clone(), c4329x6Arr, c4329x6Arr2, c4329x6Arr3);
        c4329x6Arr[0].CloneTo(c4329x6);
        c4329x6Arr2[0].CloneTo(c4329x6Clone);
        c4329x6Arr3[0].CloneTo(c4329x62);
        if (c4329x62.f11827kk <= 0 || c4329x62.f11828to <= 0) {
            return;
        }
        C6328k4.m25901k4(c12009k4, this.f4254k4, c4329x6.Clone(), c4329x6Clone.Clone(), c4329x62.Clone(), new AbstractC4682du<Integer, Integer, Integer>() { // from class: com.aspose.slides.bx.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Export.FramesStream.PixelEffects.BlendEffect.BlendFunction(int,int)";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4682du
            /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public Integer mo445k4(Integer num, Integer num2) {
                return Integer.valueOf(C0834bx.m4345x1(num.intValue(), num2.intValue()));
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4349k4(C12009k4 c12009k4) {
        m4344k4(c12009k4, this.f4254k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4344k4(C12009k4 c12009k4, C12009k4 c12009k42) {
        C6328k4.m25903k4(c12009k4, c12009k42, new AbstractC4682du<Integer, Integer, Integer>() { // from class: com.aspose.slides.bx.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Export.FramesStream.PixelEffects.BlendEffect.BlendFunction(int,int)";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4682du
            /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public Integer mo445k4(Integer num, Integer num2) {
                return Integer.valueOf(C0834bx.m4345x1(num.intValue(), num2.intValue()));
            }
        });
    }
}
