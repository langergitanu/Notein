package com.aspose.slides.internal.p556zr;

import com.aspose.slides.internal.p066cl.InterfaceC2624k4;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p129fe.C3979dy;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;
import java.util.Hashtable;

/* JADX INFO: renamed from: com.aspose.slides.internal.zr.kk */
/* JADX INFO: loaded from: classes5.dex */
public class C13631kk implements InterfaceC14059g8 {

    /* JADX INFO: renamed from: du */
    private C3977ck f45296du;

    /* JADX INFO: renamed from: h4 */
    private float f45298h4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC2624k4[] f45300kk;

    /* JADX INFO: renamed from: m9 */
    private float f45301m9;

    /* JADX INFO: renamed from: to */
    private C3979dy f45302to;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC2624k4 f45303x1;

    /* JADX INFO: renamed from: dy */
    private int f45297dy = 0;

    /* JADX INFO: renamed from: k4 */
    Hashtable f45299k4 = new Hashtable();

    public C13631kk() {
    }

    /* JADX INFO: renamed from: h4 */
    private InterfaceC2624k4 m62927h4() {
        return this.f45303x1;
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        return m62931k4(true);
    }

    /* JADX INFO: renamed from: du */
    public float m62929du() {
        return this.f45301m9;
    }

    /* JADX INFO: renamed from: k4 */
    public InterfaceC2624k4 m62930k4() {
        return m62927h4();
    }

    /* JADX INFO: renamed from: kk */
    public C3979dy m62936kk() {
        return this.f45302to;
    }

    /* JADX INFO: renamed from: to */
    public float m62937to() {
        return this.f45298h4;
    }

    /* JADX INFO: renamed from: x1 */
    public C3977ck m62938x1() {
        return this.f45296du;
    }

    public C13631kk(InterfaceC2624k4 interfaceC2624k4, InterfaceC2624k4[] interfaceC2624k4Arr, C3977ck c3977ck, float f, float f2, C3979dy c3979dy) {
        this.f45303x1 = interfaceC2624k4;
        this.f45300kk = interfaceC2624k4Arr;
        this.f45296du = c3977ck;
        this.f45298h4 = f;
        this.f45301m9 = f2;
        this.f45302to = c3979dy;
    }

    /* JADX INFO: renamed from: k4 */
    public C13631kk m62931k4(boolean z) {
        InterfaceC2624k4 interfaceC2624k4M62930k4 = m62930k4();
        InterfaceC2624k4[] interfaceC2624k4Arr = this.f45300kk;
        if (z) {
            interfaceC2624k4M62930k4 = interfaceC2624k4M62930k4.mo11983k4((Hashtable) this.f45299k4.clone());
            InterfaceC2624k4[] interfaceC2624k4Arr2 = this.f45300kk;
            if (interfaceC2624k4Arr2 != null) {
                interfaceC2624k4Arr = new InterfaceC2624k4[interfaceC2624k4Arr2.length];
                int i = 0;
                while (true) {
                    InterfaceC2624k4[] interfaceC2624k4Arr3 = this.f45300kk;
                    if (i >= interfaceC2624k4Arr3.length) {
                        break;
                    }
                    interfaceC2624k4Arr[i] = interfaceC2624k4Arr3[i].mo11983k4((Hashtable) this.f45299k4.clone());
                    i++;
                }
            }
        }
        return new C13631kk(interfaceC2624k4M62930k4, interfaceC2624k4Arr, m62938x1(), m62937to(), m62929du(), m62936kk());
    }

    /* JADX INFO: renamed from: x1 */
    public void m62939x1(float f) {
        this.f45301m9 = f;
    }

    /* JADX INFO: renamed from: x1 */
    private void m62928x1(InterfaceC2624k4 interfaceC2624k4) {
        this.f45303x1 = interfaceC2624k4;
    }

    /* JADX INFO: renamed from: k4 */
    public Object m62932k4(String str) {
        return this.f45299k4.get(str);
    }

    /* JADX INFO: renamed from: k4 */
    public Object m62933k4(String str, Object obj) {
        return this.f45299k4.put(str, obj);
    }

    /* JADX INFO: renamed from: k4 */
    public void m62934k4(float f) {
        this.f45298h4 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public void m62935k4(InterfaceC2624k4 interfaceC2624k4) {
        m62928x1(interfaceC2624k4);
    }
}
