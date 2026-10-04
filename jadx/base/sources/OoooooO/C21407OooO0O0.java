package OoooooO;

import OooooOO.C21334Oooo0o0;
import OooooOO.C21335Oooo0oO;
import OooooOO.C21355Ooooooo;
import Oooooo0.C21397OooO00o;
import Oooooo0.C21398OooO0O0;
import Oooooo0.InterfaceC21402OooO0o0;
import OoooooO.C21424OooOO0O;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.List;
import oO00ooO.C32460OooOooO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: OoooooO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21407OooO0O0 extends AbstractC21405OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public String f61934OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float[] f61935OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f61936OooO0OO = new ArrayList();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public List<? extends AbstractC21410OooO0o> f61937OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C21334Oooo0o0 f61938OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f61939OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public C21422OooO0oo f61940OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public C21424OooOO0O.OooO0OO f61941OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f61942OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f61943OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f61944OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f61945OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f61946OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f61947OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f61948OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f61949OooOOo0;

    public C21407OooO0O0() {
        int i = C21457OoooO0.f62122OooO00o;
        this.f61937OooO0Oo = C34434OooOoO.f123453OooOo0o;
        this.f61939OooO0o0 = true;
        this.f61934OooO = "";
        this.f61946OooOOO0 = 1.0f;
        this.f61945OooOOO = 1.0f;
        this.f61949OooOOo0 = true;
    }

    @Override // OoooooO.AbstractC21405OooO
    public final void OooO00o(InterfaceC21402OooO0o0 interfaceC21402OooO0o0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC21402OooO0o0, "<this>");
        if (this.f61949OooOOo0) {
            float[] fArrOooO00o = this.f61935OooO0O0;
            if (fArrOooO00o == null) {
                fArrOooO00o = C21355Ooooooo.OooO00o();
                this.f61935OooO0O0 = fArrOooO00o;
            } else {
                C21355Ooooooo.OooO0o(fArrOooO00o);
            }
            C21355Ooooooo.OooO0oo(this.f61947OooOOOO + this.f61943OooOO0O, this.f61948OooOOOo + this.f61944OooOO0o, fArrOooO00o);
            double d = (((double) this.f61942OooOO0) * 3.141592653589793d) / 180.0d;
            float fCos = (float) Math.cos(d);
            float fSin = (float) Math.sin(d);
            float f = fArrOooO00o[0];
            float f2 = fArrOooO00o[4];
            float f3 = (fSin * f2) + (fCos * f);
            float f4 = -fSin;
            float f5 = (f2 * fCos) + (f * f4);
            float f6 = fArrOooO00o[1];
            float f7 = fArrOooO00o[5];
            float f8 = (fSin * f7) + (fCos * f6);
            float f9 = (f7 * fCos) + (f6 * f4);
            float f10 = fArrOooO00o[2];
            float f11 = fArrOooO00o[6];
            float f12 = (fSin * f11) + (fCos * f10);
            float f13 = (f11 * fCos) + (f10 * f4);
            float f14 = fArrOooO00o[3];
            float f15 = fArrOooO00o[7];
            float f16 = (fSin * f15) + (fCos * f14);
            float f17 = (fCos * f15) + (f4 * f14);
            fArrOooO00o[0] = f3;
            fArrOooO00o[1] = f8;
            fArrOooO00o[2] = f12;
            fArrOooO00o[3] = f16;
            fArrOooO00o[4] = f5;
            fArrOooO00o[5] = f9;
            fArrOooO00o[6] = f13;
            fArrOooO00o[7] = f17;
            float f18 = this.f61946OooOOO0;
            float f19 = this.f61945OooOOO;
            fArrOooO00o[0] = f3 * f18;
            fArrOooO00o[1] = f8 * f18;
            fArrOooO00o[2] = f12 * f18;
            fArrOooO00o[3] = f16 * f18;
            fArrOooO00o[4] = f5 * f19;
            fArrOooO00o[5] = f9 * f19;
            fArrOooO00o[6] = f13 * f19;
            fArrOooO00o[7] = f17 * f19;
            fArrOooO00o[8] = fArrOooO00o[8] * 1.0f;
            fArrOooO00o[9] = fArrOooO00o[9] * 1.0f;
            fArrOooO00o[10] = fArrOooO00o[10] * 1.0f;
            fArrOooO00o[11] = fArrOooO00o[11] * 1.0f;
            C21355Ooooooo.OooO0oo(-this.f61943OooOO0O, -this.f61944OooOO0o, fArrOooO00o);
            this.f61949OooOOo0 = false;
        }
        if (this.f61939OooO0o0) {
            if (!this.f61937OooO0Oo.isEmpty()) {
                C21422OooO0oo c21422OooO0oo = this.f61940OooO0oO;
                if (c21422OooO0oo == null) {
                    c21422OooO0oo = new C21422OooO0oo();
                    this.f61940OooO0oO = c21422OooO0oo;
                } else {
                    c21422OooO0oo.f62051OooO00o.clear();
                }
                C21334Oooo0o0 c21334Oooo0o0OooO00o = this.f61938OooO0o;
                if (c21334Oooo0o0OooO00o == null) {
                    c21334Oooo0o0OooO00o = C21335Oooo0oO.OooO00o();
                    this.f61938OooO0o = c21334Oooo0o0OooO00o;
                } else {
                    c21334Oooo0o0OooO00o.reset();
                }
                List<? extends AbstractC21410OooO0o> nodes = this.f61937OooO0Oo;
                kotlin.jvm.internal.OooOOO0.OooO0oO(nodes, "nodes");
                c21422OooO0oo.f62051OooO00o.addAll(nodes);
                c21422OooO0oo.OooO0OO(c21334Oooo0o0OooO00o);
            }
            this.f61939OooO0o0 = false;
        }
        C21397OooO00o.OooO0O0 oooO0O0OoooOo0 = interfaceC21402OooO0o0.OoooOo0();
        long jOooO0O0 = oooO0O0OoooOo0.OooO0O0();
        oooO0O0OoooOo0.OooO00o().OooOOo0();
        C21398OooO0O0 c21398OooO0O0 = oooO0O0OoooOo0.f61919OooO00o;
        float[] fArr = this.f61935OooO0O0;
        C21397OooO00o.OooO0O0 oooO0O0 = c21398OooO0O0.f61921OooO00o;
        if (fArr != null) {
            oooO0O0.OooO00o().OooOOo(fArr);
        }
        C21334Oooo0o0 c21334Oooo0o0 = this.f61938OooO0o;
        if (!this.f61937OooO0Oo.isEmpty() && c21334Oooo0o0 != null) {
            oooO0O0.OooO00o().OooOOOo(c21334Oooo0o0);
        }
        ArrayList arrayList = this.f61936OooO0OO;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC21405OooO) arrayList.get(i)).OooO00o(interfaceC21402OooO0o0);
        }
        oooO0O0OoooOo0.OooO00o().OooOO0o();
        oooO0O0OoooOo0.OooO0OO(jOooO0O0);
    }

    @Override // OoooooO.AbstractC21405OooO
    public final oO0O000o.OooO00o<C32460OooOooO> OooO0O0() {
        return this.f61941OooO0oo;
    }

    @Override // OoooooO.AbstractC21405OooO
    public final void OooO0Oo(C21424OooOO0O.OooO0OO oooO0OO) {
        this.f61941OooO0oo = oooO0OO;
        ArrayList arrayList = this.f61936OooO0OO;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC21405OooO) arrayList.get(i)).OooO0Oo(oooO0OO);
        }
    }

    public final void OooO0o0(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList = this.f61936OooO0OO;
            if (i < arrayList.size()) {
                ((AbstractC21405OooO) arrayList.get(i)).OooO0Oo(null);
                arrayList.remove(i);
            }
        }
        OooO0OO();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f61934OooO);
        ArrayList arrayList = this.f61936OooO0OO;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC21405OooO abstractC21405OooO = (AbstractC21405OooO) arrayList.get(i);
            sb.append("\t");
            sb.append(abstractC21405OooO.toString());
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "sb.toString()");
        return string;
    }
}
