package com.aspose.slides.internal.p407st;

import androidx.appcompat.app.OooOOO;
import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.StyleIdentifier;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.ii */
/* JADX INFO: loaded from: classes4.dex */
public class C10480ii implements IGenericEnumerable<AbstractC10739yw> {

    /* JADX INFO: renamed from: k4 */
    private final SortedList<Integer, AbstractC10739yw> f37063k4 = new SortedList<>();

    @Override // java.lang.Iterable
    public final IGenericEnumerator<AbstractC10739yw> iterator() {
        return this.f37063k4.getValues().iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m50921k4() {
        return this.f37063k4.size();
    }

    /* JADX INFO: renamed from: kk */
    public int m50927kk() {
        IGenericEnumerator<KeyValuePair<Integer, AbstractC10739yw>> it = this.f37063k4.iterator();
        int iMo50416k4 = 0;
        while (it.hasNext()) {
            try {
                iMo50416k4 += it.next().getValue().mo50416k4();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return iMo50416k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50929x1() {
        this.f37063k4.clear();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m50922k4(C3149x1 c3149x1) {
        int position = (int) c3149x1.m13442k4().getPosition();
        IGenericEnumerator<KeyValuePair<Integer, AbstractC10739yw>> it = this.f37063k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().getValue().mo50419k4(c3149x1);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = this.f37063k4.iterator();
        while (it.hasNext()) {
            try {
                C10355ai c10355ai = (C10355ai) C7019kk.m27452k4((Object) it.next().getValue(), C10355ai.class);
                if (c10355ai != null) {
                    c10355ai.m50422x1(c3149x1);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return ((int) c3149x1.m13442k4().getPosition()) - position;
    }

    /* JADX INFO: renamed from: kk */
    public final void m50928kk(int i) {
        this.f37063k4.removeItemByKey(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50930x1(AbstractC10739yw abstractC10739yw) {
        if (this.f37063k4.containsKey(Integer.valueOf(abstractC10739yw.m52116up()))) {
            this.f37063k4.set_Item(Integer.valueOf(abstractC10739yw.m52116up()), abstractC10739yw);
        } else {
            m50926k4(abstractC10739yw);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC10739yw m50923k4(int i) {
        AbstractC10739yw[] abstractC10739ywArr = {null};
        boolean zTryGetValue = this.f37063k4.tryGetValue(Integer.valueOf(i), abstractC10739ywArr);
        AbstractC10739yw abstractC10739yw = abstractC10739ywArr[0];
        if (zTryGetValue) {
            return abstractC10739yw;
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m50931x1(int i) {
        return this.f37063k4.containsKey(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50924k4(int i, AbstractC10739yw abstractC10739yw) {
        this.f37063k4.set_Item(Integer.valueOf(i), abstractC10739yw);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50925k4(C3134k4 c3134k4, int i, int i2) {
        AbstractC10739yw c10397d4;
        AbstractC10739yw c10707x5;
        boolean z = false;
        for (int i3 = 0; i3 < i2; i3++) {
            int iM13382u4 = c3134k4.m13382u4();
            int i4 = iM13382u4 & 16383;
            boolean z2 = (iM13382u4 & 16384) != 0;
            boolean z3 = (iM13382u4 & 32768) != 0;
            long jM13384uz = c3134k4.m13384uz();
            if (z3) {
                int i5 = (int) jM13384uz;
                switch (i4) {
                    case 192:
                        c10707x5 = new C10707x5(i4, i5);
                        break;
                    case 197:
                        c10707x5 = new C10450gf(i4, i5);
                        break;
                    case StyleIdentifier.LIST_TABLE_4 /* 325 */:
                    case StyleIdentifier.LIST_TABLE_5_DARK /* 326 */:
                    case StyleIdentifier.LIST_TABLE_2_ACCENT_2 /* 337 */:
                    case StyleIdentifier.LIST_TABLE_3_ACCENT_2 /* 338 */:
                    case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_2 /* 341 */:
                    case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_2 /* 342 */:
                    case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3 /* 343 */:
                    case 407:
                    case 463:
                    case 899:
                    case 928:
                    case 1284:
                    case 1288:
                    case 1359:
                    case 1423:
                    case 1487:
                    case 1551:
                        c10707x5 = new C10749ze(i4, i5);
                        break;
                    case 896:
                        c10707x5 = new C10729y9(i4, i5);
                        break;
                    case 937:
                        c10707x5 = new C10558na(i4, i5);
                        break;
                    default:
                        c10707x5 = new C10355ai(i4, i5);
                        break;
                }
                m50926k4(c10707x5);
                z = true;
            } else if (!this.f37063k4.containsKey(Integer.valueOf(i4))) {
                switch (i4) {
                    case 127:
                        c10397d4 = new C10397d4(jM13384uz);
                        break;
                    case 133:
                        c10397d4 = new C10354af(jM13384uz);
                        break;
                    case 191:
                        c10397d4 = new C10622rq(jM13384uz);
                        break;
                    case 195:
                        c10397d4 = new C10479ig(jM13384uz);
                        break;
                    case 196:
                        c10397d4 = new C10453gk(jM13384uz);
                        break;
                    case 255:
                        c10397d4 = new C10533m2(jM13384uz);
                        break;
                    case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6 /* 319 */:
                        c10397d4 = new C10424em(jM13384uz);
                        break;
                    case 383:
                        c10397d4 = new C10500jw(jM13384uz);
                        break;
                    case 385:
                        c10397d4 = new C10387ca(jM13384uz);
                        break;
                    case 447:
                        c10397d4 = new C10374bs(jM13384uz);
                        break;
                    case FrameMetricsAggregator.EVERY_DURATION /* 511 */:
                        c10397d4 = new C10736yo(jM13384uz);
                        break;
                    case 575:
                        c10397d4 = new C10726y4(jM13384uz);
                        break;
                    case 703:
                        c10397d4 = new C10701wz(jM13384uz);
                        break;
                    case 767:
                        c10397d4 = new C10607qk(jM13384uz);
                        break;
                    case 831:
                        c10397d4 = new C10685vw(jM13384uz);
                        break;
                    case 927:
                        c10397d4 = new C10564nv(jM13384uz);
                        break;
                    case 959:
                        c10397d4 = new C10489j5(jM13384uz);
                        break;
                    default:
                        OooOOO.OooO0O0(i4, z2, jM13384uz, this);
                        continue;
                }
                m50926k4(c10397d4);
            }
        }
        if (z) {
            IGenericEnumerator<KeyValuePair<Integer, AbstractC10739yw>> it = this.f37063k4.iterator();
            while (it.hasNext()) {
                try {
                    C10355ai c10355ai = (C10355ai) C7019kk.m27452k4((Object) it.next().getValue(), C10355ai.class);
                    if (c10355ai != null) {
                        c10355ai.mo50418k4(c3134k4);
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50926k4(AbstractC10739yw abstractC10739yw) {
        this.f37063k4.addItem(Integer.valueOf(abstractC10739yw.m52116up()), abstractC10739yw);
    }
}
