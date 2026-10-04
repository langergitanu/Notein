package com.aspose.slides.internal.p270m9;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p231kk.InterfaceC5807up;
import com.aspose.slides.internal.p231kk.InterfaceC5808uz;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.m9.du */
/* JADX INFO: loaded from: classes4.dex */
public class C6334du implements InterfaceC6354wl {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, k4> f18007k4;

    /* JADX INFO: renamed from: kk */
    private C6334du f18008kk;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC12769ix f18009x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.m9.du$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: du */
        private int f18010du;

        /* JADX INFO: renamed from: h4 */
        private C6334du f18011h4;

        /* JADX INFO: renamed from: k4 */
        private String f18012k4;

        /* JADX INFO: renamed from: kk */
        private k4 f18013kk;

        /* JADX INFO: renamed from: m9 */
        private C6334du f18014m9;

        /* JADX INFO: renamed from: to */
        private int f18015to;

        /* JADX INFO: renamed from: x1 */
        private int f18016x1;

        public k4(String str, int i, C6334du c6334du) {
            this.f18012k4 = str;
            this.f18010du = i;
            this.f18015to = i;
            this.f18016x1 = i;
            this.f18011h4 = c6334du;
            this.f18014m9 = c6334du;
        }

        /* JADX INFO: renamed from: k4 */
        private int m25928k4(int i, int i2) {
            long j = ((long) i) + ((long) i2);
            if (j < -2147483648L) {
                return Integer.MIN_VALUE;
            }
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        /* JADX INFO: renamed from: du */
        public final int m25929du() {
            return this.f18010du;
        }

        /* JADX INFO: renamed from: kk */
        public final int m25933kk() {
            k4 k4Var = this.f18013kk;
            return k4Var != null ? k4Var.m25933kk() : this.f18016x1;
        }

        /* JADX INFO: renamed from: to */
        public final int m25934to() {
            return this.f18015to;
        }

        /* JADX INFO: renamed from: x1 */
        public final String m25935x1() {
            return this.f18012k4;
        }

        /* JADX INFO: renamed from: k4 */
        public final k4 m25930k4(C6334du c6334du) {
            k4 k4Var = new k4(this.f18012k4, this.f18016x1, c6334du);
            k4Var.f18013kk = this;
            k4Var.f18014m9 = this.f18014m9;
            return k4Var;
        }

        /* JADX INFO: renamed from: x1 */
        public final void m25936x1(int i, String str) {
            this.f18013kk = null;
            this.f18014m9 = this.f18011h4;
            if (str == null || "before".equals(str)) {
                this.f18016x1 = i;
                this.f18015to = i;
                this.f18010du = i;
            } else if ("after".equals(str)) {
                this.f18010du = i;
            }
        }

        /* JADX INFO: renamed from: k4 */
        public final C6334du m25931k4() {
            return this.f18014m9;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m25932k4(int i, String str) {
            k4 k4Var = this.f18013kk;
            if (k4Var != null) {
                k4Var.f18016x1 = m25928k4(i, k4Var.f18016x1);
            }
            this.f18016x1 = m25928k4(i, this.f18016x1);
            if (str == null || "before".equals(str)) {
                this.f18015to = m25928k4(i, this.f18015to);
            } else if (!"after".equals(str)) {
                return;
            }
            this.f18010du = m25928k4(i, this.f18010du);
        }
    }

    public C6334du(InterfaceC12769ix interfaceC12769ix) {
        this.f18009x1 = interfaceC12769ix;
        this.f18008kk = m25919k4(interfaceC12769ix);
        m25920x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m25920x1() {
        this.f18007k4 = new Dictionary<>();
        C6334du c6334du = this.f18008kk;
        if (c6334du == null) {
            return;
        }
        Dictionary.ValueCollection.Enumerator<String, k4> it = c6334du.f18007k4.getValues().iterator();
        while (it.hasNext()) {
            try {
                k4 next = it.next();
                this.f18007k4.addItem(next.m25935x1(), next.m25930k4(this));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5807up
    /* JADX INFO: renamed from: k4 */
    public final int mo23709k4(String str, String str2) {
        String strM67361du = C14113y2.m67361du(str);
        if ("before".equals(str2)) {
            if (this.f18007k4.containsKey(strM67361du)) {
                return this.f18007k4.get_Item(strM67361du).m25934to();
            }
            return 0;
        }
        if ("after".equals(str2) && this.f18007k4.containsKey(strM67361du)) {
            return this.f18007k4.get_Item(strM67361du).m25929du();
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p270m9.InterfaceC6354wl
    /* JADX INFO: renamed from: kk */
    public final void mo25925kk(String str, String str2) {
        mo25926x1(str, 0, str2);
    }

    /* JADX INFO: renamed from: k4 */
    private static C6334du m25919k4(InterfaceC12769ix interfaceC12769ix) {
        InterfaceC5807up interfaceC5807upMo8449x1;
        InterfaceC12777qq interfaceC12777qqMo22194ix = interfaceC12769ix.mo22194ix();
        while (true) {
            if (interfaceC12777qqMo22194ix != null) {
                InterfaceC5808uz interfaceC5808uz = (InterfaceC5808uz) C7019kk.m27452k4((Object) interfaceC12777qqMo22194ix, InterfaceC5808uz.class);
                if (interfaceC5808uz != null) {
                    interfaceC5807upMo8449x1 = interfaceC5808uz.mo8449x1();
                    break;
                }
                interfaceC12777qqMo22194ix = interfaceC12777qqMo22194ix.mo22654sv();
            } else {
                if (interfaceC12769ix.mo22646kp() == null || interfaceC12769ix.mo22646kp().mo22608fa() != 1) {
                    return null;
                }
                InterfaceC12769ix interfaceC12769ix2 = (InterfaceC12769ix) C7019kk.m27452k4((Object) interfaceC12769ix.mo22646kp(), InterfaceC12769ix.class);
                InterfaceC5808uz interfaceC5808uz2 = (InterfaceC5808uz) C7019kk.m27452k4((Object) interfaceC12769ix2, InterfaceC5808uz.class);
                if (interfaceC5808uz2 == null) {
                    return m25919k4(interfaceC12769ix2);
                }
                interfaceC5807upMo8449x1 = interfaceC5808uz2.mo8449x1();
            }
        }
        return (C6334du) interfaceC5807upMo8449x1;
    }

    @Override // com.aspose.slides.internal.p270m9.InterfaceC6354wl
    /* JADX INFO: renamed from: x1 */
    public final void mo25926x1(String str, int i, String str2) {
        String strM67361du = C14113y2.m67361du(str);
        if (this.f18007k4.containsKey(strM67361du)) {
            this.f18007k4.get_Item(strM67361du).m25936x1(i, str2);
        } else {
            this.f18007k4.addItem(strM67361du, new k4(strM67361du, i, this));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C6334du m25921k4(String str) {
        return this.f18007k4.containsKey(str) ? this.f18007k4.get_Item(str).m25931k4() : this;
    }

    @Override // com.aspose.slides.internal.p270m9.InterfaceC6354wl
    /* JADX INFO: renamed from: x1 */
    public final void mo25927x1(String str, String str2) {
        mo25923k4(str, 1, str2);
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC12769ix m25922k4() {
        return this.f18009x1;
    }

    @Override // com.aspose.slides.internal.p270m9.InterfaceC6354wl
    /* JADX INFO: renamed from: k4 */
    public final void mo25923k4(String str, int i, String str2) {
        String strM67361du = C14113y2.m67361du(str);
        if (this.f18007k4.containsKey(strM67361du)) {
            this.f18007k4.get_Item(strM67361du).m25932k4(i, str2);
        } else {
            this.f18007k4.addItem(strM67361du, new k4(strM67361du, i, this));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m25924k4(String str, int[] iArr) {
        if (this.f18007k4.containsKey(str)) {
            iArr[0] = this.f18007k4.get_Item(str).m25933kk();
            return true;
        }
        iArr[0] = 0;
        return false;
    }
}
