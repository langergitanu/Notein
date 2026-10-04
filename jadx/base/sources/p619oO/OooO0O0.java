package p619oO;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.TreeMap;
import oO0oO0Oo.C34032OooOo0O;
import p619oO.OooOO0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 implements Serializable {
    private static final long serialVersionUID = -3464451825208522308L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public transient long f113616OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final TreeMap f113617OooOo0o = new TreeMap();

    public OooO0O0(long j) {
        this.f113616OooOo = j;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f113616OooOo = objectInputStream.available() != 0 ? objectInputStream.readLong() : 0L;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(this.f113616OooOo);
    }

    public final OooO0O0 OooO00o(C34032OooOo0O c34032OooOo0O) {
        OooO0O0 oooO0O0 = new OooO0O0(this.f113616OooOo);
        TreeMap treeMap = this.f113617OooOo0o;
        for (Integer num : treeMap.keySet()) {
            OooO00o oooO00o = (OooO00o) treeMap.get(num);
            oooO00o.getClass();
            oooO0O0.f113617OooOo0o.put(num, new OooO00o(oooO00o, c34032OooOo0O));
        }
        return oooO0O0;
    }

    public OooO0O0(OooO0O0 oooO0O0, long j) {
        for (Integer num : oooO0O0.f113617OooOo0o.keySet()) {
            this.f113617OooOo0o.put(num, new OooO00o((OooO00o) oooO0O0.f113617OooOo0o.get(num)));
        }
        this.f113616OooOo = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OooO0O0(C31898OooOOo c31898OooOOo, long j, byte[] bArr, byte[] bArr2) {
        int i;
        long j2;
        long j3;
        int i2;
        long j4 = 1;
        this.f113616OooOo = (1 << c31898OooOOo.f113667OooO0OO) - 1;
        long j5 = 0;
        while (j5 < j) {
            C31903OooOo0o c31903OooOo0o = c31898OooOOo.f113666OooO0O0;
            int i3 = c31903OooOo0o.f113711OooO0O0;
            long j6 = j5 >> i3;
            long j7 = (j4 << i3) - j4;
            long j8 = j4;
            int i4 = (int) (j5 & j7);
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o();
            oooO00o.f113661OooO0OO = j6;
            oooO00o.f113642OooO0o0 = i4;
            OooOO0 oooOO02 = new OooOO0(oooO00o);
            int i5 = 1 << i3;
            int i6 = i5 - 1;
            long j9 = j5;
            TreeMap treeMap = this.f113617OooOo0o;
            if (i4 < i6) {
                if (((OooO00o) treeMap.get(0)) == null || i4 == 0) {
                    treeMap.put(0, new OooO00o(c31903OooOo0o, bArr, bArr2, oooOO02));
                }
                i = i3;
                TreeMap treeMap2 = this.f113617OooOo0o;
                OooO00o oooO00o2 = (OooO00o) treeMap2.get(0);
                oooO00o2.getClass();
                j2 = j6;
            } else {
                i = i3;
                j2 = j6;
            }
            int i7 = 1;
            while (true) {
                long j10 = j2;
                if (i7 < c31898OooOOo.f113668OooO0Oo) {
                    int i8 = (int) (j10 & j7);
                    long j11 = j10 >> i;
                    OooOO0.OooO00o oooO00o3 = new OooOO0.OooO00o();
                    oooO00o3.f113660OooO0O0 = i7;
                    oooO00o3.f113661OooO0OO = j11;
                    oooO00o3.f113642OooO0o0 = i8;
                    OooOO0 oooOO03 = new OooOO0(oooO00o3);
                    if (treeMap.get(Integer.valueOf(i7)) != null) {
                        j2 = j11;
                        if (j9 == 0) {
                            j3 = j7;
                        } else {
                            j3 = j7;
                            if (j9 % ((long) Math.pow(i5, i7 + 1)) == 0) {
                            }
                        }
                        if (i8 < i6 || j9 == 0) {
                            i2 = i6;
                        } else {
                            i2 = i6;
                            if ((j9 + j8) % ((long) Math.pow(i5, i7)) == 0) {
                                Integer numValueOf = Integer.valueOf(i7);
                                Integer numValueOf2 = Integer.valueOf(i7);
                                TreeMap treeMap3 = this.f113617OooOo0o;
                                OooO00o oooO00o4 = (OooO00o) treeMap3.get(numValueOf2);
                                oooO00o4.getClass();
                            }
                        }
                        i7++;
                        i6 = i2;
                        j7 = j3;
                    } else {
                        j2 = j11;
                        j3 = j7;
                    }
                    treeMap.put(Integer.valueOf(i7), new OooO00o(c31903OooOo0o, bArr, bArr2, oooOO03));
                    if (i8 < i6) {
                        i2 = i6;
                    }
                    i7++;
                    i6 = i2;
                    j7 = j3;
                }
            }
            j5 = j9 + j8;
            j4 = j8;
        }
    }
}
