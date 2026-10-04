package com.aspose.slides.internal.p419tg;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IDictionary;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p174hz.AbstractC4720he;
import com.aspose.slides.internal.p174hz.AbstractC4723ix;
import com.aspose.slides.internal.p174hz.AbstractC4732lr;
import com.aspose.slides.internal.p174hz.AbstractC4736my;
import com.aspose.slides.internal.p174hz.C4762wl;
import com.aspose.slides.internal.p174hz.C4764wy;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p419tg.C10939k4;
import com.aspose.slides.internal.p525yi.C12828kk;
import com.aspose.slides.internal.p525yi.C12837um;
import com.aspose.slides.internal.p525yi.C12842x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;
import com.google.common.primitives.UnsignedBytes;
import java.util.Iterator;
import o000o0o.C24611OooO00o;
import org.json.JSONStringer;

/* JADX INFO: renamed from: com.aspose.slides.internal.tg.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C10938jd implements InterfaceC14059g8 {

    /* JADX INFO: renamed from: fa */
    private static int f38048fa = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: k4 */
    private static int f38049k4 = 2000;

    /* JADX INFO: renamed from: up */
    private static final C7017h4 f38050up = new C7017h4("1.2.840.113549.1.5.1", "1.2.840.113549.1.5.3", "1.2.840.113549.1.5.4", "1.2.840.113549.1.5.6", "1.2.840.113549.1.5.10", "1.2.840.113549.1.5.11", "1.2.840.113549.1.12.1.1", "1.2.840.113549.1.12.1.2", "1.2.840.113549.1.12.1.3", "1.2.840.113549.1.12.1.4", "1.2.840.113549.1.12.1.5", "1.2.840.113549.1.12.1.6", "1.2.840.113549.1.12.10.1.1", "1.2.840.113549.1.12.10.1.2", "1.2.840.113549.1.12.10.1.3", "1.2.840.113549.1.12.10.1.4", "1.2.840.113549.1.12.10.1.5", "1.2.840.113549.1.12.10.1.6", "1.2.840.113549.1.9.20", "1.2.840.113549.1.9.21");

    /* JADX INFO: renamed from: c5 */
    private int f38051c5;

    /* JADX INFO: renamed from: ck */
    private AbstractC4720he f38052ck;

    /* JADX INFO: renamed from: du */
    private C10940kk f38053du;

    /* JADX INFO: renamed from: dy */
    private boolean f38054dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f38055h4;

    /* JADX INFO: renamed from: jd */
    private ArrayList f38056jd;

    /* JADX INFO: renamed from: kk */
    private ArrayList f38057kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f38058m9;

    /* JADX INFO: renamed from: to */
    private ArrayList f38059to;

    /* JADX INFO: renamed from: x1 */
    private byte[] f38060x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.tg.jd$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: du */
        private int f38064du;

        /* JADX INFO: renamed from: h4 */
        private byte[] f38065h4;

        /* JADX INFO: renamed from: m9 */
        private byte[] f38066m9;

        /* JADX INFO: renamed from: to */
        private String f38067to;

        /* JADX INFO: renamed from: k4 */
        private static byte[] f38061k4 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        /* JADX INFO: renamed from: x1 */
        private static byte[] f38063x1 = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        /* JADX INFO: renamed from: kk */
        private static byte[] f38062kk = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};

        /* JADX INFO: renamed from: k4 */
        public void m52757k4(int i) {
            this.f38064du = i;
        }

        /* JADX INFO: renamed from: kk */
        public byte[] m52760kk(int i) {
            return m52756k4(f38063x1, i);
        }

        /* JADX INFO: renamed from: to */
        public byte[] m52761to(int i) {
            return m52756k4(f38062kk, i);
        }

        /* JADX INFO: renamed from: x1 */
        public void m52762x1(byte[] bArr) {
            if (bArr != null) {
                this.f38066m9 = (byte[]) bArr.clone();
            } else {
                this.f38066m9 = null;
            }
        }

        /* JADX INFO: renamed from: k4 */
        public void m52758k4(String str) {
            this.f38067to = str;
        }

        /* JADX INFO: renamed from: x1 */
        public byte[] m52763x1(int i) {
            return m52756k4(f38061k4, i);
        }

        /* JADX INFO: renamed from: k4 */
        public void m52759k4(byte[] bArr) {
            if (bArr == null) {
                this.f38065h4 = new byte[0];
            } else {
                this.f38065h4 = (byte[]) bArr.clone();
            }
        }

        /* JADX INFO: renamed from: k4 */
        private void m52755k4(byte[] bArr, int i, byte[] bArr2) {
            int i2 = (bArr2[bArr2.length - 1] & 255) + (bArr[(bArr2.length + i) - 1] & 255) + 1;
            bArr[(bArr2.length + i) - 1] = (byte) i2;
            int i3 = i2 >> 8;
            for (int length = bArr2.length - 2; length >= 0; length--) {
                int i4 = i + length;
                int i5 = (bArr2[length] & 255) + (bArr[i4] & 255) + i3;
                bArr[i4] = (byte) i5;
                i3 = i5 >> 8;
            }
        }

        /* JADX INFO: renamed from: k4 */
        private byte[] m52756k4(byte[] bArr, int i) {
            byte[] bArr2;
            byte[] bArr3;
            AbstractC4705c6 abstractC4705c6M19582kk = AbstractC4705c6.m19582kk(this.f38067to);
            int iM19587up = abstractC4705c6M19582kk.m19587up() >> 3;
            byte[] bArr4 = new byte[i];
            byte[] bArr5 = this.f38066m9;
            if (bArr5 == null || bArr5.length == 0) {
                bArr2 = new byte[0];
            } else {
                int length = ((bArr5.length + 63) / 64) * 64;
                bArr2 = new byte[length];
                for (int i2 = 0; i2 != length; i2++) {
                    byte[] bArr6 = this.f38066m9;
                    bArr2[i2] = bArr6[i2 % bArr6.length];
                }
            }
            byte[] bArr7 = this.f38065h4;
            if (bArr7 == null || bArr7.length == 0) {
                bArr3 = new byte[0];
            } else {
                int length2 = ((bArr7.length + 63) / 64) * 64;
                bArr3 = new byte[length2];
                for (int i3 = 0; i3 != length2; i3++) {
                    byte[] bArr8 = this.f38065h4;
                    bArr3[i3] = bArr8[i3 % bArr8.length];
                }
            }
            int length3 = bArr2.length + bArr3.length;
            byte[] bArr9 = new byte[length3];
            C14058fa.m66596k4(bArr2, 0, bArr9, 0, bArr2.length);
            C14058fa.m66596k4(bArr3, 0, bArr9, bArr2.length, bArr3.length);
            byte[] bArr10 = new byte[64];
            int iOooO00o = C24611OooO00o.OooO00o(i, iM19587up, 1, iM19587up);
            int i4 = 1;
            while (i4 <= iOooO00o) {
                int i5 = i4;
                int i6 = iOooO00o;
                abstractC4705c6M19582kk.mo19562k4(bArr, 0, bArr.length, bArr, 0);
                abstractC4705c6M19582kk.mo19564k4(bArr9, 0, length3);
                byte[] bArrM19584fa = abstractC4705c6M19582kk.m19584fa();
                abstractC4705c6M19582kk.mo18846c5();
                for (int i7 = 1; i7 != this.f38064du; i7++) {
                    bArrM19584fa = abstractC4705c6M19582kk.m19586kk(bArrM19584fa, 0, bArrM19584fa.length);
                }
                for (int i8 = 0; i8 != 64; i8++) {
                    bArr10[i8] = bArrM19584fa[i8 % bArrM19584fa.length];
                }
                for (int i9 = 0; i9 != length3 / 64; i9++) {
                    m52755k4(bArr9, i9 * 64, bArr10);
                }
                int i10 = (i5 - 1) * iM19587up;
                C14058fa.m66596k4(bArrM19584fa, 0, bArr4, i10, i5 == i6 ? i - i10 : bArrM19584fa.length);
                i4 = i5 + 1;
                iOooO00o = i6;
            }
            return bArr4;
        }
    }

    public C10938jd() {
        this.f38051c5 = f38049k4;
        this.f38057kk = new ArrayList();
        this.f38059to = new ArrayList();
        this.f38053du = new C10940kk();
        this.f38055h4 = false;
        this.f38058m9 = false;
        this.f38054dy = false;
        this.f38056jd = new ArrayList();
    }

    /* JADX INFO: renamed from: h4 */
    public static int m52731h4() {
        return f38048fa;
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        C10938jd c10938jd = this.f38060x1 != null ? new C10938jd(m52741du(), AbstractC6747ar.m26649x6().m26681x1(this.f38060x1)) : new C10938jd(m52741du());
        c10938jd.m52743k4(m52742k4());
        return c10938jd;
    }

    /* JADX INFO: renamed from: du */
    public byte[] m52741du() {
        C12842x1 c12842x1 = new C12842x1(PatternStyle.Wave);
        ArrayList<C10945x1> arrayList = new ArrayList();
        for (C10933ck c10933ck : this.f38056jd) {
            if (C14113y2.m67363du(c10933ck.m52718k4(), "1.2.840.113549.1.12.10.1.3")) {
                arrayList.addItem(new C10945x1(new C10939k4.k4(c10933ck.m52719x1().m59710k4(1).m59717to()).m52771x1().m59710k4(0).m59717to()));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C10945x1 c10945x1 : m52749kk()) {
            Iterator<E> it = arrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (m52738k4(c10945x1.m52823c5(), ((C10945x1) it.next()).m52823c5())) {
                    z = true;
                }
            }
            if (!z) {
                arrayList2.addItem(c10945x1);
            }
        }
        for (C10945x1 c10945x12 : arrayList) {
            Iterator<T> it2 = m52749kk().iterator();
            boolean z2 = false;
            while (it2.hasNext()) {
                if (m52738k4(c10945x12.m52823c5(), ((C10945x1) it2.next()).m52823c5())) {
                    z2 = true;
                }
            }
            if (!z2) {
                arrayList3.addItem(c10945x12);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            m52752x1((C10945x1) it3.next());
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            m52744k4((C10945x1) it4.next());
        }
        if (this.f38056jd.size() > 0) {
            C12842x1 c12842x12 = new C12842x1(PatternStyle.Wave);
            for (C10933ck c10933ck2 : this.f38056jd) {
                if (C14113y2.m67363du(c10933ck2.m52718k4(), "1.2.840.113549.1.12.10.1.3")) {
                    c12842x12.m59712k4(c10933ck2.m52719x1());
                }
            }
            if (c12842x12.m59709k4() > 0) {
                c12842x1.m59712k4(m52734k4(c12842x12, "1.2.840.113549.1.12.1.3").m52766k4());
            }
        }
        if (this.f38056jd.size() > 0) {
            C12842x1 c12842x13 = new C12842x1(PatternStyle.Wave);
            for (C10933ck c10933ck3 : this.f38056jd) {
                if (C14113y2.m67363du(c10933ck3.m52718k4(), "1.2.840.113549.1.12.10.1.1") || C14113y2.m67363du(c10933ck3.m52718k4(), "1.2.840.113549.1.12.10.1.2")) {
                    c12842x13.m59712k4(c10933ck3.m52719x1());
                }
            }
            if (c12842x13.m59709k4() > 0) {
                C12842x1 c12842x14 = new C12842x1((byte) -96);
                c12842x14.m59712k4(new C12842x1((byte) 4, c12842x13.m59708du()));
                C10939k4.k4 k4Var = new C10939k4.k4("1.2.840.113549.1.7.1");
                k4Var.m52767k4(c12842x14);
                c12842x1.m59712k4(k4Var.m52766k4());
            }
        }
        if (this.f38056jd.size() > 0) {
            C12842x1 c12842x15 = new C12842x1(PatternStyle.Wave);
            for (C10933ck c10933ck4 : this.f38056jd) {
                if (C14113y2.m67363du(c10933ck4.m52718k4(), "1.2.840.113549.1.12.10.1.5")) {
                    c12842x15.m59712k4(c10933ck4.m52719x1());
                }
            }
            if (c12842x15.m59709k4() > 0) {
                c12842x1.m59712k4(m52734k4(c12842x15, "1.2.840.113549.1.12.1.3").m52766k4());
            }
        }
        C12842x1 c12842x16 = new C12842x1((byte) 4, c12842x1.m59708du());
        C12842x1 c12842x17 = new C12842x1((byte) -96);
        c12842x17.m59712k4(c12842x16);
        C10939k4.k4 k4Var2 = new C10939k4.k4("1.2.840.113549.1.7.1");
        k4Var2.m52767k4(c12842x17);
        C12842x1 c12842x18 = new C12842x1(PatternStyle.Wave);
        if (this.f38060x1 != null) {
            byte[] bArr = new byte[20];
            m52750to().mo19624k4(bArr);
            byte[] bArrM52739k4 = m52739k4(this.f38060x1, bArr, this.f38051c5, k4Var2.m52771x1().m59710k4(0).m59717to());
            C12842x1 c12842x19 = new C12842x1(PatternStyle.Wave);
            c12842x19.m59712k4(C12828kk.m59650k4("1.3.14.3.2.26"));
            c12842x19.m59712k4(new C12842x1((byte) 5));
            C12842x1 c12842x110 = new C12842x1(PatternStyle.Wave);
            c12842x110.m59712k4(c12842x19);
            c12842x110.m59712k4(new C12842x1((byte) 4, bArrM52739k4));
            c12842x18.m59712k4(c12842x110);
            c12842x18.m59712k4(new C12842x1((byte) 4, bArr));
            c12842x18.m59712k4(C12828kk.m59649k4(this.f38051c5));
        }
        C12842x1 c12842x111 = new C12842x1((byte) 2, new byte[]{3});
        C12842x1 c12842x112 = new C12842x1(PatternStyle.Wave);
        c12842x112.m59712k4(c12842x111);
        c12842x112.m59712k4(k4Var2.m52766k4());
        if (c12842x18.m59709k4() > 0) {
            c12842x112.m59712k4(c12842x18);
        }
        return c12842x112.m59708du();
    }

    /* JADX INFO: renamed from: k4 */
    public int m52742k4() {
        return this.f38051c5;
    }

    /* JADX INFO: renamed from: kk */
    public C10940kk m52749kk() {
        if (this.f38054dy) {
            this.f38053du.clear();
            for (C10933ck c10933ck : this.f38056jd) {
                if (C14113y2.m67363du(c10933ck.m52718k4(), "1.2.840.113549.1.12.10.1.3")) {
                    this.f38053du.m52783k4(new C10945x1(new C10939k4.k4(c10933ck.m52719x1().m59710k4(1).m59717to()).m52771x1().m59710k4(0).m59717to()));
                }
            }
            this.f38054dy = false;
        }
        return this.f38053du;
    }

    /* JADX INFO: renamed from: to */
    public AbstractC4720he m52750to() {
        if (this.f38052ck == null) {
            this.f38052ck = AbstractC4720he.m19622k4();
        }
        return this.f38052ck;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.aspose.slides.Collections.ArrayList, java.lang.String] */
    /* JADX INFO: renamed from: x1 */
    public ArrayList m52751x1() throws Throwable {
        if (this.f38055h4) {
            this.f38057kk.clear();
            for (C10933ck c10933ck : this.f38056jd) {
                if (C14113y2.m67363du(c10933ck.m52718k4(), "1.2.840.113549.1.12.10.1.1")) {
                    byte[] bArrM59693k4 = new C12837um.x1(c10933ck.m52719x1().m59710k4(1).m59717to()).m59693k4();
                    byte b = bArrM59693k4[0];
                    if (b == 2) {
                        this.f38057kk.addItem(C12837um.x1.m59688k4(bArrM59693k4, new C4762wl().Clone()));
                    } else if (b == 48) {
                        this.f38057kk.addItem(C12837um.x1.m59689k4(bArrM59693k4));
                    }
                    AbstractC14092to.m67225k4(bArrM59693k4, 0, bArrM59693k4.length);
                } else if (C14113y2.m67363du(c10933ck.m52718k4(), "1.2.840.113549.1.12.10.1.2")) {
                    C12837um.k4 k4Var = new C12837um.k4(c10933ck.m52719x1().m59710k4(1).m59717to());
                    byte[] bArrM52748k4 = m52748k4(k4Var.m59684k4(), k4Var.m59685kk(), k4Var.m59686to(), k4Var.m59687x1());
                    byte[] bArrM59693k42 = new C12837um.x1(bArrM52748k4).m59693k4();
                    byte b2 = bArrM59693k42[0];
                    if (b2 == 2) {
                        this.f38057kk.addItem(C12837um.x1.m59688k4(bArrM59693k42, new C4762wl().Clone()));
                    } else if (b2 == 48) {
                        this.f38057kk.addItem(C12837um.x1.m59689k4(bArrM59693k42));
                    }
                    AbstractC14092to.m67225k4(bArrM59693k42, 0, bArrM59693k42.length);
                    AbstractC14092to.m67225k4(bArrM52748k4, 0, bArrM52748k4.length);
                }
            }
            this.f38055h4 = false;
        }
        ArrayList arrayList = this.f38057kk;
        return JSONStringer.toString();
    }

    public C10938jd(byte[] bArr) throws Throwable {
        this();
        m52746k4((String) null);
        m52737k4(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AbstractC4736my m52732k4(String str, byte[] bArr, int i) {
        k4 k4Var = new k4();
        k4Var.m52759k4(this.f38060x1);
        k4Var.m52762x1(bArr);
        k4Var.m52757k4(i);
        int i2 = 0;
        String str2 = "RC4";
        int i3 = 5;
        switch (f38050up.m27428k4(str)) {
            case 0:
                k4Var.m52758k4("MD2");
                str2 = "DES";
                i2 = 8;
                i3 = 8;
                AbstractC4736my abstractC4736myM19679x1 = AbstractC4736my.m19679x1(str2);
                abstractC4736myM19679x1.mo19688kk(k4Var.m52763x1(i3));
                if (i2 > 0) {
                    abstractC4736myM19679x1.mo19692to(k4Var.m52760kk(i2));
                    abstractC4736myM19679x1.m19687kk(1);
                }
                return abstractC4736myM19679x1;
            case 1:
                k4Var.m52758k4("MD5");
                str2 = "DES";
                i2 = 8;
                i3 = 8;
                AbstractC4736my abstractC4736myM19679x12 = AbstractC4736my.m19679x1(str2);
                abstractC4736myM19679x12.mo19688kk(k4Var.m52763x1(i3));
                if (i2 > 0) {
                }
                return abstractC4736myM19679x12;
            case 2:
                k4Var.m52758k4("MD2");
                i3 = 4;
                str2 = "RC2";
                i2 = 8;
                AbstractC4736my abstractC4736myM19679x122 = AbstractC4736my.m19679x1(str2);
                abstractC4736myM19679x122.mo19688kk(k4Var.m52763x1(i3));
                if (i2 > 0) {
                }
                return abstractC4736myM19679x122;
            case 3:
                k4Var.m52758k4("MD5");
                i3 = 4;
                str2 = "RC2";
                i2 = 8;
                AbstractC4736my abstractC4736myM19679x1222 = AbstractC4736my.m19679x1(str2);
                abstractC4736myM19679x1222.mo19688kk(k4Var.m52763x1(i3));
                if (i2 > 0) {
                }
                return abstractC4736myM19679x1222;
            case 4:
                k4Var.m52758k4("SHA1");
                str2 = "DES";
                i2 = 8;
                i3 = 8;
                AbstractC4736my abstractC4736myM19679x12222 = AbstractC4736my.m19679x1(str2);
                abstractC4736myM19679x12222.mo19688kk(k4Var.m52763x1(i3));
                if (i2 > 0) {
                }
                return abstractC4736myM19679x12222;
            case 5:
                k4Var.m52758k4("SHA1");
                i3 = 4;
                str2 = "RC2";
                i2 = 8;
                AbstractC4736my abstractC4736myM19679x122222 = AbstractC4736my.m19679x1(str2);
                abstractC4736myM19679x122222.mo19688kk(k4Var.m52763x1(i3));
                if (i2 > 0) {
                }
                return abstractC4736myM19679x122222;
            case 6:
                k4Var.m52758k4("SHA1");
                i3 = 16;
                AbstractC4736my abstractC4736myM19679x1222222 = AbstractC4736my.m19679x1(str2);
                abstractC4736myM19679x1222222.mo19688kk(k4Var.m52763x1(i3));
                if (i2 > 0) {
                }
                return abstractC4736myM19679x1222222;
            case 7:
                k4Var.m52758k4("SHA1");
                AbstractC4736my abstractC4736myM19679x12222222 = AbstractC4736my.m19679x1(str2);
                abstractC4736myM19679x12222222.mo19688kk(k4Var.m52763x1(i3));
                if (i2 > 0) {
                }
                return abstractC4736myM19679x12222222;
            case 8:
                k4Var.m52758k4("SHA1");
                i3 = 24;
                str2 = "TripleDES";
                i2 = 8;
                AbstractC4736my abstractC4736myM19679x122222222 = AbstractC4736my.m19679x1(str2);
                abstractC4736myM19679x122222222.mo19688kk(k4Var.m52763x1(i3));
                if (i2 > 0) {
                }
                return abstractC4736myM19679x122222222;
            case 9:
                k4Var.m52758k4("SHA1");
                str2 = "TripleDES";
                i3 = 16;
                i2 = 8;
                AbstractC4736my abstractC4736myM19679x1222222222 = AbstractC4736my.m19679x1(str2);
                abstractC4736myM19679x1222222222.mo19688kk(k4Var.m52763x1(i3));
                if (i2 > 0) {
                }
                return abstractC4736myM19679x1222222222;
            case 10:
                k4Var.m52758k4("SHA1");
                i3 = 16;
                str2 = "RC2";
                i2 = 8;
                AbstractC4736my abstractC4736myM19679x12222222222 = AbstractC4736my.m19679x1(str2);
                abstractC4736myM19679x12222222222.mo19688kk(k4Var.m52763x1(i3));
                if (i2 > 0) {
                }
                return abstractC4736myM19679x12222222222;
            case 11:
                k4Var.m52758k4("SHA1");
                str2 = "RC2";
                i2 = 8;
                AbstractC4736my abstractC4736myM19679x122222222222 = AbstractC4736my.m19679x1(str2);
                abstractC4736myM19679x122222222222.mo19688kk(k4Var.m52763x1(i3));
                if (i2 > 0) {
                }
                return abstractC4736myM19679x122222222222;
            default:
                throw new NotSupportedException(C14113y2.m67408k4("unknown oid ", null));
        }
    }

    /* JADX INFO: renamed from: kk */
    private C12842x1 m52740kk(C10945x1 c10945x1, IDictionary iDictionary) {
        C12842x1 c12842x1;
        C12842x1 c12842x12;
        C12842x1 c12842x13 = new C12842x1((byte) 4, c10945x1.m52823c5());
        C10939k4.k4 k4Var = new C10939k4.k4();
        k4Var.m52768k4("1.2.840.113549.1.9.22.1");
        k4Var.m52771x1().m59712k4(c12842x13);
        C12842x1 c12842x14 = new C12842x1((byte) -96);
        c12842x14.m59712k4(k4Var.m52766k4());
        C12842x1 c12842x15 = new C12842x1(PatternStyle.Wave);
        c12842x15.m59712k4(C12828kk.m59650k4("1.2.840.113549.1.12.10.1.3"));
        c12842x15.m59712k4(c12842x14);
        if (iDictionary != null) {
            C12842x1 c12842x16 = new C12842x1(PatternStyle.Horizontal);
            IDictionaryEnumerator it = iDictionary.iterator();
            while (it.hasNext()) {
                int iM27428k4 = f38050up.m27428k4((String) it.getKey());
                if (iM27428k4 == 18) {
                    ArrayList<byte[]> arrayList = (ArrayList) it.getValue();
                    if (arrayList.size() > 0) {
                        c12842x1 = new C12842x1(PatternStyle.Wave);
                        c12842x1.m59712k4(C12828kk.m59650k4("1.2.840.113549.1.9.20"));
                        c12842x12 = new C12842x1(PatternStyle.Horizontal);
                        for (byte[] bArr : arrayList) {
                            C12842x1 c12842x17 = new C12842x1((byte) 30);
                            c12842x17.m59713k4(bArr);
                            c12842x12.m59712k4(c12842x17);
                        }
                        c12842x1.m59712k4(c12842x12);
                        c12842x16.m59712k4(c12842x1);
                    }
                } else if (iM27428k4 == 19) {
                    ArrayList<byte[]> arrayList2 = (ArrayList) it.getValue();
                    if (arrayList2.size() > 0) {
                        c12842x1 = new C12842x1(PatternStyle.Wave);
                        c12842x1.m59712k4(C12828kk.m59650k4("1.2.840.113549.1.9.21"));
                        c12842x12 = new C12842x1(PatternStyle.Horizontal);
                        for (byte[] bArr2 : arrayList2) {
                            C12842x1 c12842x18 = new C12842x1((byte) 4);
                            c12842x18.m59713k4(bArr2);
                            c12842x12.m59712k4(c12842x18);
                        }
                        c12842x1.m59712k4(c12842x12);
                        c12842x16.m59712k4(c12842x1);
                    }
                }
            }
            if (c12842x16.m59709k4() > 0) {
                c12842x15.m59712k4(c12842x16);
            }
        }
        return c12842x15;
    }

    /* JADX INFO: renamed from: x1 */
    public void m52752x1(C10945x1 c10945x1) {
        m52753x1(c10945x1, null);
    }

    public C10938jd(byte[] bArr, String str) throws Throwable {
        this();
        m52746k4(str);
        m52737k4(bArr);
    }

    /* JADX INFO: renamed from: k4 */
    private C4762wl m52733k4(boolean[] zArr) {
        AbstractC4723ix abstractC4723ixM52831k4;
        for (C10945x1 c10945x1 : m52749kk()) {
            if (c10945x1.m52828h4() != null && (abstractC4723ixM52831k4 = c10945x1.m52831k4()) != null) {
                zArr[0] = true;
                return abstractC4723ixM52831k4.mo19633x1(false);
            }
        }
        zArr[0] = false;
        return new C4762wl();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m52753x1(C10945x1 c10945x1, IDictionary iDictionary) {
        int i = -1;
        for (int i2 = 0; i == -1 && i2 < this.f38056jd.size(); i2++) {
            C10933ck c10933ck = (C10933ck) this.f38056jd.get_Item(i2);
            if (C14113y2.m67363du(c10933ck.m52718k4(), "1.2.840.113549.1.12.10.1.3")) {
                C12842x1 c12842x1M52719x1 = c10933ck.m52719x1();
                if (m52738k4(c10945x1.m52823c5(), new C10945x1(new C10939k4.k4(c12842x1M52719x1.m59710k4(1).m59717to()).m52771x1().m59710k4(0).m59717to()).m52823c5())) {
                    if (iDictionary == null) {
                        i = i2;
                    } else if (c12842x1M52719x1.m59709k4() == 3) {
                        C12842x1 c12842x1M59710k4 = c12842x1M52719x1.m59710k4(2);
                        int i3 = 0;
                        for (int i4 = 0; i4 < c12842x1M59710k4.m59709k4(); i4++) {
                            C12842x1 c12842x1M59710k42 = c12842x1M59710k4.m59710k4(i4);
                            ArrayList arrayList = (ArrayList) iDictionary.get_Item(C12828kk.m59652x1(c12842x1M59710k42.m59710k4(0)));
                            if (arrayList != null) {
                                C12842x1 c12842x1M59710k43 = c12842x1M59710k42.m59710k4(1);
                                if (arrayList.size() == c12842x1M59710k43.m59709k4()) {
                                    int i5 = 0;
                                    for (int i6 = 0; i6 < c12842x1M59710k43.m59709k4(); i6++) {
                                        if (m52738k4((byte[]) arrayList.get_Item(i6), c12842x1M59710k43.m59710k4(i6).m59717to())) {
                                            i5++;
                                        }
                                    }
                                    if (i5 == c12842x1M59710k43.m59709k4()) {
                                        i3++;
                                    }
                                }
                            }
                        }
                        if (i3 == c12842x1M59710k4.m59709k4()) {
                        }
                    }
                }
            }
        }
        if (i != -1) {
            this.f38056jd.removeAt(i);
            this.f38054dy = true;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C10939k4.k4 m52734k4(C12842x1 c12842x1, String str) {
        byte[] bArr = new byte[8];
        m52750to().mo19624k4(bArr);
        C12842x1 c12842x12 = new C12842x1(PatternStyle.Wave);
        c12842x12.m59712k4(new C12842x1((byte) 4, bArr));
        c12842x12.m59712k4(C12828kk.m59649k4(this.f38051c5));
        C12842x1 c12842x13 = new C12842x1(PatternStyle.Wave);
        c12842x13.m59712k4(C12828kk.m59650k4(str));
        c12842x13.m59712k4(c12842x12);
        C12842x1 c12842x14 = new C12842x1(UnsignedBytes.MAX_POWER_OF_TWO, m52754x1(str, bArr, this.f38051c5, c12842x1.m59708du()));
        C12842x1 c12842x15 = new C12842x1(PatternStyle.Wave);
        c12842x15.m59712k4(C12828kk.m59650k4("1.2.840.113549.1.7.1"));
        c12842x15.m59712k4(c12842x13);
        c12842x15.m59712k4(c12842x14);
        C12842x1 c12842x16 = new C12842x1((byte) 2, new byte[]{0});
        C12842x1 c12842x17 = new C12842x1(PatternStyle.Wave);
        c12842x17.m59712k4(c12842x16);
        c12842x17.m59712k4(c12842x15);
        C12842x1 c12842x18 = new C12842x1((byte) -96);
        c12842x18.m59712k4(c12842x17);
        C10939k4.k4 k4Var = new C10939k4.k4("1.2.840.113549.1.7.6");
        k4Var.m52767k4(c12842x18);
        return k4Var;
    }

    /* JADX INFO: renamed from: x1 */
    public byte[] m52754x1(String str, byte[] bArr, int i, byte[] bArr2) {
        AbstractC4736my abstractC4736myM52732k4 = m52732k4(str, bArr, i);
        try {
            byte[] bArrMo19564k4 = abstractC4736myM52732k4.m19689ks().mo19564k4(bArr2, 0, bArr2.length);
            abstractC4736myM52732k4.dispose();
            return bArrMo19564k4;
        } catch (Throwable th) {
            if (abstractC4736myM52732k4 != null) {
                abstractC4736myM52732k4.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m52743k4(int i) {
        this.f38051c5 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m52744k4(C10945x1 c10945x1) {
        m52745k4(c10945x1, (IDictionary) null);
    }

    /* JADX INFO: renamed from: k4 */
    public void m52745k4(C10945x1 c10945x1, IDictionary iDictionary) {
        boolean z = false;
        for (int i = 0; !z && i < this.f38056jd.size(); i++) {
            C10933ck c10933ck = (C10933ck) this.f38056jd.get_Item(i);
            if (C14113y2.m67363du(c10933ck.m52718k4(), "1.2.840.113549.1.12.10.1.3")) {
                if (m52738k4(c10945x1.m52823c5(), new C10945x1(new C10939k4.k4(c10933ck.m52719x1().m59710k4(1).m59717to()).m52771x1().m59710k4(0).m59717to()).m52823c5())) {
                    z = true;
                }
            }
        }
        if (z) {
            return;
        }
        this.f38056jd.addItem(new C10933ck("1.2.840.113549.1.12.10.1.3", m52740kk(c10945x1, iDictionary)));
        this.f38054dy = true;
    }

    /* JADX INFO: renamed from: k4 */
    private void m52735k4(C12837um.x1 x1Var) {
        ArrayList arrayList;
        Object objM59688k4;
        byte[] bArrM59693k4 = x1Var.m59693k4();
        byte b = bArrM59693k4[0];
        if (b == 2) {
            boolean[] zArr = {false};
            C4762wl c4762wlClone = m52733k4(zArr).Clone();
            if (zArr[0]) {
                arrayList = this.f38057kk;
                objM59688k4 = C12837um.x1.m59688k4(bArrM59693k4, c4762wlClone.Clone());
            }
            AbstractC14092to.m67225k4(bArrM59693k4, 0, bArrM59693k4.length);
        }
        if (b != 48) {
            AbstractC14092to.m67225k4(bArrM59693k4, 0, bArrM59693k4.length);
            throw new CryptographicException("Unknown private key format");
        }
        arrayList = this.f38057kk;
        objM59688k4 = C12837um.x1.m59689k4(bArrM59693k4);
        arrayList.addItem(objM59688k4);
        AbstractC14092to.m67225k4(bArrM59693k4, 0, bArrM59693k4.length);
    }

    /* JADX INFO: renamed from: k4 */
    private void m52736k4(C12842x1 c12842x1) throws Throwable {
        if (c12842x1.m59718x1() != 48) {
            throw new ArgumentException("invalid safeBag");
        }
        C12842x1 c12842x1M59710k4 = c12842x1.m59710k4(0);
        if (c12842x1M59710k4.m59718x1() != 6) {
            throw new ArgumentException("invalid safeBag id");
        }
        C12842x1 c12842x1M59710k42 = c12842x1.m59710k4(1);
        String strM59652x1 = C12828kk.m59652x1(c12842x1M59710k4);
        switch (f38050up.m27428k4(strM59652x1)) {
            case 12:
                m52735k4(new C12837um.x1(c12842x1M59710k42.m59717to()));
                break;
            case 13:
                C12837um.k4 k4Var = new C12837um.k4(c12842x1M59710k42.m59717to());
                byte[] bArrM52748k4 = m52748k4(k4Var.m59684k4(), k4Var.m59685kk(), k4Var.m59686to(), k4Var.m59687x1());
                m52735k4(new C12837um.x1(bArrM52748k4));
                AbstractC14092to.m67225k4(bArrM52748k4, 0, bArrM52748k4.length);
                break;
            case 14:
                C10939k4.k4 k4Var2 = new C10939k4.k4(c12842x1M59710k42.m59717to());
                if (!"1.2.840.113549.1.9.22.1".equals(k4Var2.m52769kk())) {
                    throw new NotSupportedException("unsupport certificate type");
                }
                this.f38053du.m52783k4(new C10945x1(k4Var2.m52771x1().m59710k4(0).m59717to()));
                break;
                break;
            case 15:
            case 17:
                break;
            case 16:
                this.f38059to.addItem(c12842x1M59710k42.m59717to());
                break;
            default:
                throw new ArgumentException("unknown safeBag oid");
        }
        if (c12842x1.m59709k4() > 2) {
            C12842x1 c12842x1M59710k43 = c12842x1.m59710k4(2);
            if (c12842x1M59710k43.m59718x1() != 49) {
                throw new ArgumentException("invalid safeBag attributes id");
            }
            for (int i = 0; i < c12842x1M59710k43.m59709k4(); i++) {
                C12842x1 c12842x1M59710k44 = c12842x1M59710k43.m59710k4(i);
                if (c12842x1M59710k44.m59718x1() != 48) {
                    throw new ArgumentException("invalid PKCS12 attributes id");
                }
                C12842x1 c12842x1M59710k45 = c12842x1M59710k44.m59710k4(0);
                if (c12842x1M59710k45.m59718x1() != 6) {
                    throw new ArgumentException("invalid attribute id");
                }
                String strM59652x12 = C12828kk.m59652x1(c12842x1M59710k45);
                C12842x1 c12842x1M59710k46 = c12842x1M59710k44.m59710k4(1);
                for (int i2 = 0; i2 < c12842x1M59710k46.m59709k4(); i2++) {
                    C12842x1 c12842x1M59710k47 = c12842x1M59710k46.m59710k4(i2);
                    int iM27428k4 = f38050up.m27428k4(strM59652x12);
                    if (iM27428k4 != 18) {
                        if (iM27428k4 == 19 && c12842x1M59710k47.m59718x1() != 4) {
                            throw new ArgumentException("invalid attribute value id");
                        }
                    } else if (c12842x1M59710k47.m59718x1() != 30) {
                        throw new ArgumentException("invalid attribute value id");
                    }
                }
            }
        }
        this.f38056jd.addItem(new C10933ck(strM59652x1, c12842x1));
    }

    /* JADX INFO: renamed from: k4 */
    public void m52746k4(String str) {
        int iM52731h4;
        if (str == null) {
            this.f38060x1 = null;
            return;
        }
        if (str.length() <= 0) {
            this.f38060x1 = new byte[2];
            return;
        }
        int length = str.length();
        int i = 0;
        if (length < m52731h4()) {
            iM52731h4 = length;
            if (str.charAt(length - 1) != 0) {
                i = 1;
            }
        } else {
            iM52731h4 = m52731h4();
        }
        this.f38060x1 = new byte[(i + iM52731h4) << 1];
        AbstractC6747ar.m26649x6().mo26659k4(str, 0, iM52731h4, this.f38060x1, 0);
    }

    /* JADX INFO: renamed from: k4 */
    private void m52737k4(byte[] bArr) throws Throwable {
        C12842x1 c12842x1 = new C12842x1(bArr);
        if (c12842x1.m59718x1() != 48) {
            throw new ArgumentException("invalid data");
        }
        if (c12842x1.m59710k4(0).m59718x1() != 2) {
            throw new ArgumentException("invalid PFX version");
        }
        C10939k4.k4 k4Var = new C10939k4.k4(c12842x1.m59710k4(1));
        if (!k4Var.m52769kk().equals("1.2.840.113549.1.7.1")) {
            throw new ArgumentException("invalid authenticated safe");
        }
        if (c12842x1.m59709k4() > 2) {
            C12842x1 c12842x1M59710k4 = c12842x1.m59710k4(2);
            if (c12842x1M59710k4.m59718x1() != 48) {
                throw new ArgumentException("invalid MAC");
            }
            C12842x1 c12842x1M59710k42 = c12842x1M59710k4.m59710k4(0);
            if (c12842x1M59710k42.m59718x1() != 48) {
                throw new ArgumentException("invalid MAC");
            }
            if (!"1.3.14.3.2.26".equals(C12828kk.m59652x1(c12842x1M59710k42.m59710k4(0).m59710k4(0)))) {
                throw new ArgumentException("unsupported HMAC");
            }
            byte[] bArrM59717to = c12842x1M59710k42.m59710k4(1).m59717to();
            C12842x1 c12842x1M59710k43 = c12842x1M59710k4.m59710k4(1);
            if (c12842x1M59710k43.m59718x1() != 4) {
                throw new ArgumentException("missing MAC salt");
            }
            this.f38051c5 = 1;
            if (c12842x1M59710k4.m59709k4() > 2) {
                C12842x1 c12842x1M59710k44 = c12842x1M59710k4.m59710k4(2);
                if (c12842x1M59710k44.m59718x1() != 2) {
                    throw new ArgumentException("invalid MAC iteration");
                }
                this.f38051c5 = C12828kk.m59648k4(c12842x1M59710k44);
            }
            if (!m52738k4(bArrM59717to, m52739k4(this.f38060x1, c12842x1M59710k43.m59717to(), this.f38051c5, k4Var.m52771x1().m59710k4(0).m59717to()))) {
                throw new C10932c5("Invalid MAC - file may have been tampered!");
            }
        }
        C12842x1 c12842x12 = new C12842x1(k4Var.m52771x1().m59710k4(0).m59717to());
        for (int i = 0; i < c12842x12.m59709k4(); i++) {
            C10939k4.k4 k4Var2 = new C10939k4.k4(c12842x12.m59710k4(i));
            if (k4Var2.m52769kk().equals("1.2.840.113549.1.7.1")) {
                C12842x1 c12842x13 = new C12842x1(k4Var2.m52771x1().m59710k4(0).m59717to());
                for (int i2 = 0; i2 < c12842x13.m59709k4(); i2++) {
                    m52736k4(c12842x13.m59710k4(i2));
                }
            } else {
                if (!k4Var2.m52769kk().equals("1.2.840.113549.1.7.6")) {
                    if (!k4Var2.m52769kk().equals("1.2.840.113549.1.7.3")) {
                        throw new ArgumentException("unknown authenticatedSafe");
                    }
                    throw new NotImplementedException("public key encrypted");
                }
                C12842x1 c12842x14 = new C12842x1(m52747k4(new C10939k4.x1(k4Var2.m52771x1().m59710k4(0))));
                for (int i3 = 0; i3 < c12842x14.m59709k4(); i3++) {
                    m52736k4(c12842x14.m59710k4(i3));
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m52738k4(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m52747k4(C10939k4.x1 x1Var) {
        return m52748k4(x1Var.m52780k4().m52769kk(), x1Var.m52780k4().m52771x1().m59710k4(0).m59717to(), C12828kk.m59648k4(x1Var.m52780k4().m52771x1().m59710k4(1)), x1Var.m52781x1());
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m52748k4(String str, byte[] bArr, int i, byte[] bArr2) throws Throwable {
        AbstractC4736my abstractC4736myM52732k4;
        try {
            abstractC4736myM52732k4 = m52732k4(str, bArr, i);
            try {
                byte[] bArrMo19564k4 = abstractC4736myM52732k4.m19696yj().mo19564k4(bArr2, 0, bArr2.length);
                abstractC4736myM52732k4.m19690m9();
                return bArrMo19564k4;
            } catch (Throwable th) {
                th = th;
                if (abstractC4736myM52732k4 != null) {
                    abstractC4736myM52732k4.m19690m9();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            abstractC4736myM52732k4 = null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m52739k4(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        k4 k4Var = new k4();
        k4Var.m52758k4("SHA1");
        k4Var.m52759k4(bArr);
        k4Var.m52762x1(bArr2);
        k4Var.m52757k4(i);
        C4764wy c4764wy = (C4764wy) AbstractC4732lr.m19671jd();
        c4764wy.mo19577k4(k4Var.m52761to(20));
        return c4764wy.m19586kk(bArr3, 0, bArr3.length);
    }
}
