package p619oO;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import oO0oO0Oo.C34032OooOo0O;
import p619oO.C31894OooO0oO;
import p619oO.OooO;
import p619oO.OooOO0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f113605OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final transient OooOO0O f113606OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f113607OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ArrayList f113608OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final ArrayList f113609OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final Stack<C31901OooOo0> f113610OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final TreeMap f113611OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final TreeMap f113612OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f113613OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f113614Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public transient int f113615Oooo00O;

    public OooO00o(OooO00o oooO00o) {
        this.f113606OooOo0o = new OooOO0O(oooO00o.f113606OooOo0o.f113644OooO00o);
        this.f113605OooOo = oooO00o.f113605OooOo;
        this.f113607OooOoO = oooO00o.f113607OooOoO;
        ArrayList arrayList = new ArrayList();
        this.f113609OooOoOO = arrayList;
        arrayList.addAll(oooO00o.f113609OooOoOO);
        this.f113611OooOoo0 = new TreeMap();
        for (Integer num : oooO00o.f113611OooOoo0.keySet()) {
            this.f113611OooOoo0.put(num, (LinkedList) ((LinkedList) oooO00o.f113611OooOoo0.get(num)).clone());
        }
        Stack<C31901OooOo0> stack = new Stack<>();
        this.f113610OooOoo = stack;
        stack.addAll(oooO00o.f113610OooOoo);
        this.f113608OooOoO0 = new ArrayList();
        Iterator it = oooO00o.f113608OooOoO0.iterator();
        while (it.hasNext()) {
            this.f113608OooOoO0.add(((OooO0OO) it.next()).clone());
        }
        this.f113612OooOooO = new TreeMap((Map) oooO00o.f113612OooOooO);
        this.f113613OooOooo = oooO00o.f113613OooOooo;
        this.f113615Oooo00O = oooO00o.f113615Oooo00O;
        this.f113614Oooo000 = oooO00o.f113614Oooo000;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int iAvailable = objectInputStream.available();
        int i = this.f113605OooOo;
        this.f113615Oooo00O = iAvailable != 0 ? objectInputStream.readInt() : (1 << i) - 1;
        int i2 = this.f113615Oooo00O;
        if (i2 > (1 << i) - 1 || this.f113613OooOooo > i2 + 1 || objectInputStream.available() != 0) {
            throw new IOException("inconsistent BDS data detected");
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f113615Oooo00O);
    }

    public final void OooO00o(byte[] bArr, byte[] bArr2, OooOO0 oooOO02) {
        OooOO0 oooOO03;
        int i;
        OooOO0 oooOO04 = oooOO02;
        OooO.OooO00o oooO00o = new OooO.OooO00o();
        int i2 = oooOO04.f113655OooO00o;
        oooO00o.f113660OooO0O0 = i2;
        long j = oooOO04.f113656OooO0O0;
        oooO00o.f113661OooO0OO = j;
        OooO oooO = new OooO(oooO00o);
        C31894OooO0oO.OooO00o oooO00o2 = new C31894OooO0oO.OooO00o();
        oooO00o2.f113660OooO0O0 = i2;
        oooO00o2.f113661OooO0OO = j;
        C31894OooO0oO c31894OooO0oO = new C31894OooO0oO(oooO00o2);
        int i3 = 0;
        while (true) {
            int i4 = this.f113605OooOo;
            int i5 = 1 << i4;
            Stack<C31901OooOo0> stack = this.f113610OooOoo;
            if (i3 >= i5) {
                stack.pop();
                return;
            }
            OooOO0.OooO00o oooO00o3 = new OooOO0.OooO00o();
            oooO00o3.f113660OooO0O0 = oooOO04.f113655OooO00o;
            oooO00o3.f113661OooO0OO = oooOO04.f113656OooO0O0;
            oooO00o3.f113642OooO0o0 = i3;
            oooO00o3.f113641OooO0o = oooOO04.f113638OooO0o;
            oooO00o3.f113643OooO0oO = oooOO04.f113640OooO0oO;
            oooO00o3.f113662OooO0Oo = oooOO04.f113658OooO0Oo;
            OooOO0 oooOO05 = new OooOO0(oooO00o3);
            OooOO0O oooOO0O = this.f113606OooOo0o;
            oooOO0O.OooO0Oo(oooOO0O.OooO0OO(bArr2, oooOO05), bArr);
            OooOOO oooOOOOooO0O0 = oooOO0O.OooO0O0(oooOO05);
            OooO.OooO00o oooO00o4 = new OooO.OooO00o();
            oooO00o4.f113660OooO0O0 = oooO.f113655OooO00o;
            oooO00o4.f113661OooO0OO = oooO.f113656OooO0O0;
            oooO00o4.f113603OooO0o0 = i3;
            oooO00o4.f113602OooO0o = oooO.f113599OooO0o;
            oooO00o4.f113604OooO0oO = oooO.f113601OooO0oO;
            oooO00o4.f113662OooO0Oo = oooO.f113658OooO0Oo;
            oooO = new OooO(oooO00o4);
            C31901OooOo0 c31901OooOo0OooO00o = C31902OooOo0O.OooO00o(oooOO0O, oooOOOOooO0O0, oooO);
            C31894OooO0oO.OooO00o oooO00o5 = new C31894OooO0oO.OooO00o();
            oooO00o5.f113660OooO0O0 = c31894OooO0oO.f113655OooO00o;
            oooO00o5.f113661OooO0OO = c31894OooO0oO.f113656OooO0O0;
            oooO00o5.f113634OooO0o = i3;
            oooO00o5.f113662OooO0Oo = c31894OooO0oO.f113658OooO0Oo;
            c31894OooO0oO = new C31894OooO0oO(oooO00o5);
            while (!stack.isEmpty()) {
                int i6 = stack.peek().f113700OooOo0o;
                int i7 = c31901OooOo0OooO00o.f113700OooOo0o;
                if (i6 == i7) {
                    int i8 = i3 / (1 << i7);
                    if (i8 == 1) {
                        this.f113609OooOoOO.add(c31901OooOo0OooO00o);
                    }
                    int i9 = this.f113607OooOoO;
                    int i10 = c31901OooOo0OooO00o.f113700OooOo0o;
                    if (i8 == 3) {
                        if (i10 < i4 - i9) {
                            OooO0OO oooO0OO = (OooO0OO) this.f113608OooOoO0.get(i10);
                            oooO0OO.f113619OooOo0o = c31901OooOo0OooO00o;
                            oooO0OO.f113621OooOoO0 = i10;
                            oooOO03 = oooOO05;
                            if (i10 == oooO0OO.f113618OooOo) {
                                oooO0OO.f113623OooOoo0 = true;
                            }
                        } else {
                            oooOO03 = oooOO05;
                        }
                        i = 3;
                    } else {
                        oooOO03 = oooOO05;
                        i = 3;
                    }
                    if (i8 >= i && (i8 & 1) == 1 && i10 >= i4 - i9 && i10 <= i4 - 2) {
                        Integer numValueOf = Integer.valueOf(i10);
                        TreeMap treeMap = this.f113611OooOoo0;
                        if (treeMap.get(numValueOf) == null) {
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(c31901OooOo0OooO00o);
                            treeMap.put(Integer.valueOf(i10), linkedList);
                        } else {
                            ((LinkedList) treeMap.get(Integer.valueOf(i10))).add(c31901OooOo0OooO00o);
                        }
                    }
                    C31894OooO0oO.OooO00o oooO00o6 = new C31894OooO0oO.OooO00o();
                    oooO00o6.f113660OooO0O0 = c31894OooO0oO.f113655OooO00o;
                    oooO00o6.f113661OooO0OO = c31894OooO0oO.f113656OooO0O0;
                    oooO00o6.f113635OooO0o0 = c31894OooO0oO.f113633OooO0o0;
                    oooO00o6.f113634OooO0o = (c31894OooO0oO.f113632OooO0o - 1) / 2;
                    oooO00o6.f113662OooO0Oo = c31894OooO0oO.f113658OooO0Oo;
                    C31894OooO0oO c31894OooO0oO2 = new C31894OooO0oO(oooO00o6);
                    C31901OooOo0 c31901OooOo0OooO0O0 = C31902OooOo0O.OooO0O0(oooOO0O, stack.pop(), c31901OooOo0OooO00o, c31894OooO0oO2);
                    c31901OooOo0OooO00o = new C31901OooOo0(c31901OooOo0OooO0O0.f113700OooOo0o + 1, C31904OooOoO.OooO0O0(c31901OooOo0OooO0O0.f113699OooOo));
                    C31894OooO0oO.OooO00o oooO00o7 = new C31894OooO0oO.OooO00o();
                    oooO00o7.f113660OooO0O0 = c31894OooO0oO2.f113655OooO00o;
                    oooO00o7.f113661OooO0OO = c31894OooO0oO2.f113656OooO0O0;
                    oooO00o7.f113635OooO0o0 = c31894OooO0oO2.f113633OooO0o0 + 1;
                    oooO00o7.f113634OooO0o = c31894OooO0oO2.f113632OooO0o;
                    oooO00o7.f113662OooO0Oo = c31894OooO0oO2.f113658OooO0Oo;
                    c31894OooO0oO = new C31894OooO0oO(oooO00o7);
                    oooOO05 = oooOO03;
                }
            }
            stack.push(c31901OooOo0OooO00o);
            i3++;
            oooOO04 = oooOO05;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    public final void OooO0O0(byte[] bArr, byte[] bArr2, OooOO0 oooOO02) {
        int i;
        ArrayList<OooO0OO> arrayList;
        int i2;
        boolean z;
        ArrayList arrayList2;
        Object objRemoveFirst;
        OooOO0 oooOO03;
        Stack<C31901OooOo0> stack;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        int i7;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        OooOO0 oooOO04 = oooOO02;
        if (this.f113614Oooo000) {
            throw new IllegalStateException("index already used");
        }
        int i8 = this.f113613OooOooo;
        if (i8 > this.f113615Oooo00O - 1) {
            throw new IllegalStateException("index out of bounds");
        }
        int i9 = 0;
        while (true) {
            i = this.f113605OooOo;
            if (i9 >= i) {
                i9 = 0;
                break;
            } else if (((i8 >> i9) & 1) == 0) {
                break;
            } else {
                i9++;
            }
        }
        int i10 = (this.f113613OooOooo >> (i9 + 1)) & 1;
        TreeMap treeMap = this.f113612OooOooO;
        ArrayList arrayList3 = this.f113609OooOoOO;
        if (i10 == 0 && i9 < i - 1) {
            treeMap.put(Integer.valueOf(i9), arrayList3.get(i9));
        }
        OooO.OooO00o oooO00o = new OooO.OooO00o();
        int i11 = oooOO04.f113655OooO00o;
        oooO00o.f113660OooO0O0 = i11;
        long j2 = oooOO04.f113656OooO0O0;
        oooO00o.f113661OooO0OO = j2;
        int i12 = oooO00o.f113660OooO0O0;
        int i13 = i9;
        long j3 = oooO00o.f113661OooO0OO;
        boolean z2 = true;
        int i14 = oooO00o.f113662OooO0Oo;
        int i15 = oooO00o.f113602OooO0o;
        int i16 = oooO00o.f113604OooO0oO;
        C31894OooO0oO.OooO00o oooO00o2 = new C31894OooO0oO.OooO00o();
        oooO00o2.f113660OooO0O0 = i11;
        oooO00o2.f113661OooO0OO = j2;
        int i17 = oooO00o2.f113660OooO0O0;
        long j4 = oooO00o2.f113661OooO0OO;
        int i18 = oooO00o2.f113662OooO0Oo;
        ArrayList arrayList4 = this.f113608OooOoO0;
        int i19 = this.f113607OooOoO;
        OooOO0O oooOO0O = this.f113606OooOo0o;
        OooO0OO oooO0OO = null;
        if (i13 == 0) {
            OooOO0.OooO00o oooO00o3 = new OooOO0.OooO00o();
            oooO00o3.f113660OooO0O0 = i11;
            oooO00o3.f113661OooO0OO = j2;
            oooO00o3.f113642OooO0o0 = this.f113613OooOooo;
            oooO00o3.f113641OooO0o = oooOO04.f113638OooO0o;
            oooO00o3.f113643OooO0oO = oooOO04.f113640OooO0oO;
            oooO00o3.f113662OooO0Oo = oooOO04.f113658OooO0Oo;
            oooOO04 = new OooOO0(oooO00o3);
            oooOO0O.OooO0Oo(oooOO0O.OooO0OO(bArr4, oooOO04), bArr3);
            OooOOO oooOOOOooO0O0 = oooOO0O.OooO0O0(oooOO04);
            OooO.OooO00o oooO00o4 = new OooO.OooO00o();
            oooO00o4.f113660OooO0O0 = i12;
            oooO00o4.f113661OooO0OO = j3;
            oooO00o4.f113603OooO0o0 = this.f113613OooOooo;
            oooO00o4.f113602OooO0o = i15;
            oooO00o4.f113604OooO0oO = i16;
            oooO00o4.f113662OooO0Oo = i14;
            arrayList3.set(0, C31902OooOo0O.OooO00o(oooOO0O, oooOOOOooO0O0, new OooO(oooO00o4)));
            i2 = 0;
            arrayList = arrayList4;
        } else {
            C31894OooO0oO.OooO00o oooO00o5 = new C31894OooO0oO.OooO00o();
            oooO00o5.f113660OooO0O0 = i17;
            oooO00o5.f113661OooO0OO = j4;
            int i20 = i13 - 1;
            oooO00o5.f113635OooO0o0 = i20;
            oooO00o5.f113634OooO0o = this.f113613OooOooo >> i13;
            oooO00o5.f113662OooO0Oo = i18;
            C31894OooO0oO c31894OooO0oO = new C31894OooO0oO(oooO00o5);
            oooOO0O.OooO0Oo(oooOO0O.OooO0OO(bArr4, oooOO04), bArr3);
            C31901OooOo0 c31901OooOo0OooO0O0 = C31902OooOo0O.OooO0O0(oooOO0O, (C31901OooOo0) arrayList3.get(i20), (C31901OooOo0) treeMap.get(Integer.valueOf(i20)), c31894OooO0oO);
            arrayList3.set(i13, new C31901OooOo0(c31901OooOo0OooO0O0.f113700OooOo0o + 1, C31904OooOoO.OooO0O0(c31901OooOo0OooO0O0.f113699OooOo)));
            treeMap.remove(Integer.valueOf(i20));
            int i21 = 0;
            while (i21 < i13) {
                if (i21 < i - i19) {
                    arrayList2 = arrayList4;
                    objRemoveFirst = ((OooO0OO) arrayList2.get(i21)).f113619OooOo0o;
                } else {
                    arrayList2 = arrayList4;
                    objRemoveFirst = ((LinkedList) this.f113611OooOoo0.get(Integer.valueOf(i21))).removeFirst();
                }
                arrayList3.set(i21, objRemoveFirst);
                i21++;
                arrayList4 = arrayList2;
            }
            arrayList = arrayList4;
            int iMin = Math.min(i13, i - i19);
            int i22 = 0;
            while (i22 < iMin) {
                int i23 = (((z2 ? 1 : 0) << i22) * 3) + this.f113613OooOooo + 1;
                if (i23 < ((z2 ? 1 : 0) << i)) {
                    OooO0OO oooO0OO2 = (OooO0OO) arrayList.get(i22);
                    oooO0OO2.f113619OooOo0o = null;
                    oooO0OO2.f113621OooOoO0 = oooO0OO2.f113618OooOo;
                    oooO0OO2.f113620OooOoO = i23;
                    z = z2 ? 1 : 0;
                    oooO0OO2.f113622OooOoOO = z;
                    oooO0OO2.f113623OooOoo0 = false;
                } else {
                    z = z2 ? 1 : 0;
                }
                i22++;
                z2 = z;
            }
            i2 = 0;
        }
        int i24 = i2;
        for (?? r15 = z2; i24 < ((i - i19) >> r15); r15 = 1) {
            OooO0OO oooO0OO3 = oooO0OO;
            for (OooO0OO oooO0OO4 : arrayList) {
                if (!oooO0OO4.f113623OooOoo0 && oooO0OO4.f113622OooOoOO && (oooO0OO3 == null || oooO0OO4.OooO0O0() < oooO0OO3.OooO0O0() || (oooO0OO4.OooO0O0() == oooO0OO3.OooO0O0() && oooO0OO4.f113620OooOoO < oooO0OO3.f113620OooOoO))) {
                    oooO0OO3 = oooO0OO4;
                }
            }
            if (oooO0OO3 == null) {
                oooOO03 = oooOO04;
            } else {
                if (oooO0OO3.f113623OooOoo0 || !oooO0OO3.f113622OooOoOO) {
                    throw new IllegalStateException("finished or not initialized");
                }
                OooOO0.OooO00o oooO00o6 = new OooOO0.OooO00o();
                oooO00o6.f113660OooO0O0 = oooOO04.f113655OooO00o;
                oooO00o6.f113661OooO0OO = oooOO04.f113656OooO0O0;
                oooO00o6.f113642OooO0o0 = oooO0OO3.f113620OooOoO;
                oooO00o6.f113641OooO0o = oooOO04.f113638OooO0o;
                oooO00o6.f113643OooO0oO = oooOO04.f113640OooO0oO;
                oooO00o6.f113662OooO0Oo = oooOO04.f113658OooO0Oo;
                OooOO0 oooOO05 = new OooOO0(oooO00o6);
                OooO.OooO00o oooO00o7 = new OooO.OooO00o();
                int i25 = oooOO05.f113655OooO00o;
                oooO00o7.f113660OooO0O0 = i25;
                long j5 = oooOO05.f113656OooO0O0;
                oooO00o7.f113661OooO0OO = j5;
                oooO00o7.f113603OooO0o0 = oooO0OO3.f113620OooOoO;
                OooO oooO = new OooO(oooO00o7);
                C31894OooO0oO.OooO00o oooO00o8 = new C31894OooO0oO.OooO00o();
                oooO00o8.f113660OooO0O0 = i25;
                oooO00o8.f113661OooO0OO = j5;
                oooO00o8.f113634OooO0o = oooO0OO3.f113620OooOoO;
                C31894OooO0oO c31894OooO0oO2 = new C31894OooO0oO(oooO00o8);
                oooOO0O.OooO0Oo(oooOO0O.OooO0OO(bArr4, oooOO05), bArr3);
                C31901OooOo0 c31901OooOo0OooO00o = C31902OooOo0O.OooO00o(oooOO0O, oooOO0O.OooO0O0(oooOO05), oooO);
                while (true) {
                    stack = this.f113610OooOoo;
                    boolean zIsEmpty = stack.isEmpty();
                    i3 = oooO0OO3.f113618OooOo;
                    i4 = c31894OooO0oO2.f113658OooO0Oo;
                    i5 = c31894OooO0oO2.f113632OooO0o;
                    i6 = c31894OooO0oO2.f113633OooO0o0;
                    j = c31894OooO0oO2.f113656OooO0O0;
                    i7 = c31894OooO0oO2.f113655OooO00o;
                    if (zIsEmpty) {
                        oooOO03 = oooOO04;
                        break;
                    }
                    oooOO03 = oooOO04;
                    if (stack.peek().f113700OooOo0o != c31901OooOo0OooO00o.f113700OooOo0o || stack.peek().f113700OooOo0o == i3) {
                        break;
                    }
                    C31894OooO0oO.OooO00o oooO00o9 = new C31894OooO0oO.OooO00o();
                    oooO00o9.f113660OooO0O0 = i7;
                    oooO00o9.f113661OooO0OO = j;
                    oooO00o9.f113635OooO0o0 = i6;
                    oooO00o9.f113634OooO0o = (i5 - 1) / 2;
                    oooO00o9.f113662OooO0Oo = i4;
                    C31894OooO0oO c31894OooO0oO3 = new C31894OooO0oO(oooO00o9);
                    C31901OooOo0 c31901OooOo0OooO0O02 = C31902OooOo0O.OooO0O0(oooOO0O, stack.pop(), c31901OooOo0OooO00o, c31894OooO0oO3);
                    c31901OooOo0OooO00o = new C31901OooOo0(c31901OooOo0OooO0O02.f113700OooOo0o + 1, C31904OooOoO.OooO0O0(c31901OooOo0OooO0O02.f113699OooOo));
                    C31894OooO0oO.OooO00o oooO00o10 = new C31894OooO0oO.OooO00o();
                    oooO00o10.f113660OooO0O0 = c31894OooO0oO3.f113655OooO00o;
                    oooO00o10.f113661OooO0OO = c31894OooO0oO3.f113656OooO0O0;
                    oooO00o10.f113635OooO0o0 = c31894OooO0oO3.f113633OooO0o0 + 1;
                    oooO00o10.f113634OooO0o = c31894OooO0oO3.f113632OooO0o;
                    oooO00o10.f113662OooO0Oo = c31894OooO0oO3.f113658OooO0Oo;
                    c31894OooO0oO2 = new C31894OooO0oO(oooO00o10);
                    oooOO04 = oooOO03;
                }
                C31901OooOo0 c31901OooOo0 = oooO0OO3.f113619OooOo0o;
                if (c31901OooOo0 == null) {
                    oooO0OO3.f113619OooOo0o = c31901OooOo0OooO00o;
                } else {
                    if (c31901OooOo0.f113700OooOo0o == c31901OooOo0OooO00o.f113700OooOo0o) {
                        C31894OooO0oO.OooO00o oooO00o11 = new C31894OooO0oO.OooO00o();
                        oooO00o11.f113660OooO0O0 = i7;
                        oooO00o11.f113661OooO0OO = j;
                        oooO00o11.f113635OooO0o0 = i6;
                        oooO00o11.f113634OooO0o = (i5 - 1) / 2;
                        oooO00o11.f113662OooO0Oo = i4;
                        C31894OooO0oO c31894OooO0oO4 = new C31894OooO0oO(oooO00o11);
                        c31901OooOo0OooO00o = new C31901OooOo0(oooO0OO3.f113619OooOo0o.f113700OooOo0o + 1, C31904OooOoO.OooO0O0(C31902OooOo0O.OooO0O0(oooOO0O, oooO0OO3.f113619OooOo0o, c31901OooOo0OooO00o, c31894OooO0oO4).f113699OooOo));
                        oooO0OO3.f113619OooOo0o = c31901OooOo0OooO00o;
                        C31894OooO0oO.OooO00o oooO00o12 = new C31894OooO0oO.OooO00o();
                        oooO00o12.f113660OooO0O0 = c31894OooO0oO4.f113655OooO00o;
                        oooO00o12.f113661OooO0OO = c31894OooO0oO4.f113656OooO0O0;
                        oooO00o12.f113635OooO0o0 = c31894OooO0oO4.f113633OooO0o0 + 1;
                        oooO00o12.f113634OooO0o = c31894OooO0oO4.f113632OooO0o;
                        oooO00o12.f113662OooO0Oo = c31894OooO0oO4.f113658OooO0Oo;
                        new C31894OooO0oO(oooO00o12);
                    } else {
                        stack.push(c31901OooOo0OooO00o);
                    }
                }
                if (oooO0OO3.f113619OooOo0o.f113700OooOo0o == i3) {
                    oooO0OO3.f113623OooOoo0 = true;
                } else {
                    oooO0OO3.f113621OooOoO0 = c31901OooOo0OooO00o.f113700OooOo0o;
                    oooO0OO3.f113620OooOoO++;
                }
            }
            i24++;
            bArr3 = bArr;
            bArr4 = bArr2;
            oooOO04 = oooOO03;
            oooO0OO = null;
        }
        this.f113613OooOooo++;
    }

    public OooO00o(OooO00o oooO00o, C34032OooOo0O c34032OooOo0O) {
        this.f113606OooOo0o = new OooOO0O(new OooOOO0(c34032OooOo0O));
        this.f113605OooOo = oooO00o.f113605OooOo;
        this.f113607OooOoO = oooO00o.f113607OooOoO;
        ArrayList arrayList = new ArrayList();
        this.f113609OooOoOO = arrayList;
        arrayList.addAll(oooO00o.f113609OooOoOO);
        this.f113611OooOoo0 = new TreeMap();
        for (Integer num : oooO00o.f113611OooOoo0.keySet()) {
            this.f113611OooOoo0.put(num, (LinkedList) ((LinkedList) oooO00o.f113611OooOoo0.get(num)).clone());
        }
        Stack<C31901OooOo0> stack = new Stack<>();
        this.f113610OooOoo = stack;
        stack.addAll(oooO00o.f113610OooOoo);
        this.f113608OooOoO0 = new ArrayList();
        Iterator it = oooO00o.f113608OooOoO0.iterator();
        while (it.hasNext()) {
            this.f113608OooOoO0.add(((OooO0OO) it.next()).clone());
        }
        this.f113612OooOooO = new TreeMap((Map) oooO00o.f113612OooOooO);
        int i = oooO00o.f113613OooOooo;
        this.f113613OooOooo = i;
        this.f113615Oooo00O = oooO00o.f113615Oooo00O;
        this.f113614Oooo000 = oooO00o.f113614Oooo000;
        if (this.f113609OooOoOO == null) {
            throw new IllegalStateException("authenticationPath == null");
        }
        if (this.f113611OooOoo0 == null) {
            throw new IllegalStateException("retain == null");
        }
        if (this.f113610OooOoo == null) {
            throw new IllegalStateException("stack == null");
        }
        if (this.f113608OooOoO0 == null) {
            throw new IllegalStateException("treeHashInstances == null");
        }
        if (!C31904OooOoO.OooO0oO(this.f113605OooOo, i)) {
            throw new IllegalStateException("index in BDS state out of bounds");
        }
    }

    public OooO00o(OooO00o oooO00o, byte[] bArr, byte[] bArr2, OooOO0 oooOO02) {
        this.f113606OooOo0o = new OooOO0O(oooO00o.f113606OooOo0o.f113644OooO00o);
        this.f113605OooOo = oooO00o.f113605OooOo;
        this.f113607OooOoO = oooO00o.f113607OooOoO;
        ArrayList arrayList = new ArrayList();
        this.f113609OooOoOO = arrayList;
        arrayList.addAll(oooO00o.f113609OooOoOO);
        this.f113611OooOoo0 = new TreeMap();
        for (Integer num : oooO00o.f113611OooOoo0.keySet()) {
            this.f113611OooOoo0.put(num, (LinkedList) ((LinkedList) oooO00o.f113611OooOoo0.get(num)).clone());
        }
        Stack<C31901OooOo0> stack = new Stack<>();
        this.f113610OooOoo = stack;
        stack.addAll(oooO00o.f113610OooOoo);
        this.f113608OooOoO0 = new ArrayList();
        Iterator it = oooO00o.f113608OooOoO0.iterator();
        while (it.hasNext()) {
            this.f113608OooOoO0.add(((OooO0OO) it.next()).clone());
        }
        this.f113612OooOooO = new TreeMap((Map) oooO00o.f113612OooOooO);
        this.f113613OooOooo = oooO00o.f113613OooOooo;
        this.f113615Oooo00O = oooO00o.f113615Oooo00O;
        this.f113614Oooo000 = false;
        OooO0O0(bArr, bArr2, oooOO02);
    }

    public OooO00o(OooOO0O oooOO0O, int i, int i2, int i3) {
        this.f113606OooOo0o = oooOO0O;
        this.f113605OooOo = i;
        this.f113615Oooo00O = i3;
        this.f113607OooOoO = i2;
        if (i2 <= i && i2 >= 2) {
            int i4 = i - i2;
            if (i4 % 2 == 0) {
                this.f113609OooOoOO = new ArrayList();
                this.f113611OooOoo0 = new TreeMap();
                this.f113610OooOoo = new Stack<>();
                this.f113608OooOoO0 = new ArrayList();
                for (int i5 = 0; i5 < i4; i5++) {
                    this.f113608OooOoO0.add(new OooO0OO(i5));
                }
                this.f113612OooOooO = new TreeMap();
                this.f113613OooOooo = 0;
                this.f113614Oooo000 = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    public OooO00o(C31903OooOo0o c31903OooOo0o, byte[] bArr, byte[] bArr2, OooOO0 oooOO02) {
        OooOO0O oooOO0O = new OooOO0O(c31903OooOo0o.f113716OooO0oO);
        int i = c31903OooOo0o.f113711OooO0O0;
        this(oooOO0O, i, c31903OooOo0o.f113712OooO0OO, (1 << i) - 1);
        OooO00o(bArr, bArr2, oooOO02);
    }
}
