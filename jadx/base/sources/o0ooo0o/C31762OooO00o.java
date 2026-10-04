package o0ooo0o;

import java.util.ArrayList;
import java.util.Arrays;
import o0ooO0Oo.AbstractC31443OooOO0o;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31441OooOO0;

/* JADX INFO: renamed from: o0ooo0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31762OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float[] f113410OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C31441OooOO0 f113411OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractC31763OooO0O0 f113412OooO0OO;

    public C31762OooO00o(C31433OooO00o c31433OooO00o, AbstractC31763OooO0O0 abstractC31763OooO0O0) {
        int size = c31433OooO00o.f112214OooOo.size();
        ArrayList arrayList = c31433OooO00o.f112214OooOo;
        int i = 0;
        if (size <= 0 || !(c31433OooO00o.Oooo0(arrayList.size() - 1) instanceof C31441OooOO0)) {
            this.f113410OooO00o = new float[arrayList.size()];
            while (i < arrayList.size()) {
                this.f113410OooO00o[i] = ((AbstractC31443OooOO0o) c31433OooO00o.Oooo0(i)).OooOooo();
                i++;
            }
            this.f113411OooO0O0 = null;
        } else {
            this.f113410OooO00o = new float[arrayList.size() - 1];
            while (true) {
                float[] fArr = this.f113410OooO00o;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = ((AbstractC31443OooOO0o) c31433OooO00o.Oooo0(i)).OooOooo();
                i++;
            }
            this.f113411OooO0O0 = (C31441OooOO0) c31433OooO00o.Oooo0(arrayList.size() - 1);
        }
        this.f113412OooO0OO = abstractC31763OooO0O0;
    }

    public final float[] OooO00o() {
        float[] fArr = this.f113410OooO00o;
        AbstractC31763OooO0O0 abstractC31763OooO0O0 = this.f113412OooO0OO;
        return abstractC31763OooO0O0 == null ? (float[]) fArr.clone() : Arrays.copyOf(fArr, abstractC31763OooO0O0.OooO0O0());
    }

    public final String toString() {
        return "PDColor{components=" + Arrays.toString(this.f113410OooO00o) + ", patternName=" + this.f113411OooO0O0 + "}";
    }

    public C31762OooO00o(float[] fArr, C31765OooO0Oo c31765OooO0Oo) {
        this.f113410OooO00o = (float[]) fArr.clone();
        this.f113411OooO0O0 = null;
        this.f113412OooO0OO = c31765OooO0Oo;
    }
}
