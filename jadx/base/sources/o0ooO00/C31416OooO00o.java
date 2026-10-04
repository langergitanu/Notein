package o0ooO00;

import androidx.datastore.preferences.protobuf.C21825OoooOO0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: o0ooO00.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31416OooO00o implements Cloneable, Serializable {
    private static final long serialVersionUID = 1330973210523860834L;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public transient int f112185OooOoo = 0;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public double f112182OooOoO = 1.0d;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public double f112181OooOo0o = 1.0d;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public double f112186OooOoo0 = 0.0d;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public double f112184OooOoOO = 0.0d;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public double f112183OooOoO0 = 0.0d;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public double f112180OooOo = 0.0d;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f112185OooOoo = -1;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
    }

    public final void OooO00o() {
        C31416OooO00o c31416OooO00o = new C31416OooO00o();
        c31416OooO00o.f112181OooOo0o = 1000.0d;
        c31416OooO00o.f112182OooOoO = 1000.0d;
        c31416OooO00o.f112186OooOoo0 = 0.0d;
        c31416OooO00o.f112184OooOoOO = 0.0d;
        c31416OooO00o.f112183OooOoO0 = 0.0d;
        c31416OooO00o.f112180OooOo = 0.0d;
        c31416OooO00o.f112185OooOoo = -1;
        double d = this.f112181OooOo0o;
        double d2 = this.f112183OooOoO0;
        double d3 = 0.0d * d2;
        double d4 = (1000.0d * d) + d3;
        double d5 = this.f112180OooOo;
        double d6 = this.f112182OooOoO;
        double d7 = 0.0d * d6;
        double d8 = d7 + (1000.0d * d5);
        double d9 = 0.0d * d;
        double d10 = d5 * 0.0d;
        double d11 = d3 + d9 + this.f112184OooOoOO;
        double d12 = d7 + d10 + this.f112186OooOoo0;
        this.f112185OooOoo = -1;
        this.f112181OooOo0o = d4;
        this.f112180OooOo = d8;
        this.f112183OooOoO0 = (d2 * 1000.0d) + d9;
        this.f112182OooOoO = (d6 * 1000.0d) + d10;
        this.f112184OooOoOO = d11;
        this.f112186OooOoo0 = d12;
    }

    public final void OooO0O0(float[] fArr, float[] fArr2) {
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            float f = fArr[i];
            double d = f;
            double d2 = fArr[i + 1];
            fArr2[i3] = (float) ((this.f112183OooOoO0 * d2) + (this.f112181OooOo0o * d) + this.f112184OooOoOO);
            fArr2[i3 + 1] = (float) ((d2 * this.f112182OooOoO) + (d * this.f112180OooOo) + this.f112186OooOoo0);
            i += 2;
            i3 += 2;
        }
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31416OooO00o) {
            C31416OooO00o c31416OooO00o = (C31416OooO00o) obj;
            if (this.f112181OooOo0o == c31416OooO00o.f112181OooOo0o && this.f112183OooOoO0 == c31416OooO00o.f112183OooOoO0 && this.f112184OooOoOO == c31416OooO00o.f112184OooOoOO && this.f112180OooOo == c31416OooO00o.f112180OooOo && this.f112182OooOoO == c31416OooO00o.f112182OooOoO && this.f112186OooOoo0 == c31416OooO00o.f112186OooOoo0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C21825OoooOO0.OooO0OO(C31416OooO00o.class, sb, "[[");
        sb.append(this.f112181OooOo0o);
        sb.append(", ");
        sb.append(this.f112183OooOoO0);
        sb.append(", ");
        sb.append(this.f112184OooOoOO);
        sb.append("], [");
        sb.append(this.f112180OooOo);
        sb.append(", ");
        sb.append(this.f112182OooOoO);
        sb.append(", ");
        sb.append(this.f112186OooOoo0);
        sb.append("]]");
        return sb.toString();
    }
}
