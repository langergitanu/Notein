package o0oooOO0;

import java.util.Arrays;
import o0ooO00.C31416OooO00o;

/* JADX INFO: renamed from: o0oooOO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31837OooO0OO implements Cloneable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public float[] f113464OooOo0o;

    public C31837OooO0OO() {
        this.f113464OooOo0o = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public final C31416OooO00o OooO00o() {
        float[] fArr = this.f113464OooOo0o;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[6];
        float f6 = fArr[7];
        C31416OooO00o c31416OooO00o = new C31416OooO00o();
        c31416OooO00o.f112185OooOoo = -1;
        c31416OooO00o.f112181OooOo0o = f;
        c31416OooO00o.f112180OooOo = f2;
        c31416OooO00o.f112183OooOoO0 = f3;
        c31416OooO00o.f112182OooOoO = f4;
        c31416OooO00o.f112184OooOoOO = f5;
        c31416OooO00o.f112186OooOoo0 = f6;
        return c31416OooO00o;
    }

    public final Object clone() throws CloneNotSupportedException {
        float[] fArr = (float[]) this.f113464OooOo0o.clone();
        C31837OooO0OO c31837OooO0OO = new C31837OooO0OO();
        c31837OooO0OO.f113464OooOo0o = fArr;
        return c31837OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C31837OooO0OO.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f113464OooOo0o, ((C31837OooO0OO) obj).f113464OooOo0o);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f113464OooOo0o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        float[] fArr = this.f113464OooOo0o;
        sb.append(fArr[0]);
        sb.append(",");
        sb.append(fArr[1]);
        sb.append(",");
        sb.append(fArr[3]);
        sb.append(",");
        sb.append(fArr[4]);
        sb.append(",");
        sb.append(fArr[6]);
        sb.append(",");
        return Oooo00o.OooO0OO.OooO0OO(sb, fArr[7], "]");
    }

    public C31837OooO0OO(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f113464OooOo0o = new float[]{f, f2, 0.0f, f3, f4, 0.0f, f5, f6, 1.0f};
    }
}
