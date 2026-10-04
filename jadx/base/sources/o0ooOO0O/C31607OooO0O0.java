package o0ooOO0O;

import com.orion.notein.domain.models.backup.BackupFile;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31438OooO0o0;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31444OooOOO;
import o0ooO0Oo.C31445OooOOO0;
import o0ooO0Oo.C31450OooOOoo;
import o0ooO0Oo.InterfaceC31452OooOo00;
import o0ooOO0o.C31611OooO00o;
import o0ooOoo.InterfaceC31671OooO0OO;
import o0ooo000.AbstractC31745OooOO0O;
import o0oooOO0.C31835OooO00o;
import o0oooOO0.C31836OooO0O0;

/* JADX INFO: renamed from: o0ooOO0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31607OooO0O0 implements Closeable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final byte[] f112961Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final byte[] f112962Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final byte[] f112963Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public static final byte[] f112964OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final byte[] f112965OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final byte[] f112966OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final byte[] f112967OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static final byte[] f112968OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static final byte[] f112969OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public static final byte[] f112970OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public static final byte[] f112971OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public static final byte[] f112972OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public static final byte[] f112973OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public static final byte[] f112974Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public static final byte[] f112975Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final byte[] f112976OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public static final byte[] f112977OooooOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public static final byte[] f112978o000oOoO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final DecimalFormat f112979OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final DecimalFormat f112980OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C31606OooO00o f112981OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OutputStream f112982OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f112983OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final Hashtable f112984OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f112985OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final HashMap f112986OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final ArrayList f112987OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final HashSet f112988Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final HashSet f112989Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final LinkedList f112990Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final HashSet f112991Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public C31444OooOOO f112992Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public C31611OooO00o f112993Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f112994Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f112995Oooo0o0;

    static {
        Charset charset = C31835OooO00o.f113456OooO00o;
        f112962Oooo0oO = "<<".getBytes(charset);
        f112963Oooo0oo = ">>".getBytes(charset);
        f112961Oooo = new byte[]{32};
        f112966OoooO00 = new byte[]{37};
        "PDF-1.4".getBytes(charset);
        f112965OoooO0 = new byte[]{-10, -28, -4, -33};
        f112967OoooO0O = "%%EOF".getBytes(charset);
        f112964OoooO = "R".getBytes(charset);
        f112968OoooOO0 = "xref".getBytes(charset);
        f112978o000oOoO = "f".getBytes(charset);
        f112969OoooOOO = BackupFile.PREFIX_NOTE_DIR.getBytes(charset);
        f112970OoooOOo = "trailer".getBytes(charset);
        f112971OoooOo0 = "startxref".getBytes(charset);
        f112972OoooOoO = "obj".getBytes(charset);
        f112973OoooOoo = "endobj".getBytes(charset);
        f112974Ooooo00 = "[".getBytes(charset);
        f112975Ooooo0o = "]".getBytes(charset);
        f112976OooooO0 = "stream".getBytes(charset);
        f112977OooooOO = "endstream".getBytes(charset);
    }

    public C31607OooO0O0(OutputStream outputStream) {
        Locale locale = Locale.US;
        this.f112980OooOo0o = new DecimalFormat("0000000000", DecimalFormatSymbols.getInstance(locale));
        this.f112979OooOo = new DecimalFormat("00000", DecimalFormatSymbols.getInstance(locale));
        this.f112983OooOoOO = 0L;
        this.f112985OooOoo0 = 0L;
        this.f112984OooOoo = new Hashtable();
        this.f112986OooOooO = new HashMap();
        this.f112987OooOooo = new ArrayList();
        this.f112989Oooo000 = new HashSet();
        this.f112990Oooo00O = new LinkedList();
        this.f112991Oooo00o = new HashSet();
        this.f112988Oooo0 = new HashSet();
        this.f112992Oooo0O0 = null;
        this.f112993Oooo0OO = null;
        this.f112995Oooo0o0 = false;
        this.f112994Oooo0o = false;
        this.f112982OooOoO0 = outputStream;
        C31606OooO00o c31606OooO00o = new C31606OooO00o(this.f112982OooOoO0);
        c31606OooO00o.f112960OooOo0o = 0L;
        c31606OooO00o.f112959OooOo = false;
        this.f112981OooOoO = c31606OooO00o;
    }

    public static void Oooo0(byte[] bArr, OutputStream outputStream) throws IOException {
        int i = 0;
        for (byte b : bArr) {
            if (b < 0 || b == 13 || b == 10) {
                outputStream.write(60);
                int length = bArr.length;
                while (i < length) {
                    C31836OooO0O0.OooO0O0(bArr[i], outputStream);
                    i++;
                }
                outputStream.write(62);
                return;
            }
        }
        outputStream.write(40);
        int length2 = bArr.length;
        while (i < length2) {
            int i2 = bArr[i];
            if (i2 == 40 || i2 == 41 || i2 == 92) {
                outputStream.write(92);
                outputStream.write(i2);
            } else {
                outputStream.write(i2);
            }
            i++;
        }
        outputStream.write(41);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO00o(AbstractC31434OooO0O0 abstractC31434OooO0O0) {
        C31444OooOOO c31444OooOOO;
        Object obj = abstractC31434OooO0O0 instanceof C31445OooOOO0 ? ((C31445OooOOO0) abstractC31434OooO0O0).f112467OooOo : abstractC31434OooO0O0;
        if (this.f112991Oooo00o.contains(abstractC31434OooO0O0)) {
            return;
        }
        HashSet hashSet = this.f112989Oooo000;
        if (hashSet.contains(abstractC31434OooO0O0)) {
            return;
        }
        HashSet hashSet2 = this.f112988Oooo0;
        if (hashSet2.contains(obj)) {
            return;
        }
        if (obj != null && (c31444OooOOO = (C31444OooOOO) this.f112984OooOoo.get(obj)) != null) {
            InterfaceC31671OooO0OO interfaceC31671OooO0OO = (AbstractC31434OooO0O0) this.f112986OooOooO.get(c31444OooOOO);
            if (!(abstractC31434OooO0O0 instanceof InterfaceC31452OooOo00 ? ((InterfaceC31452OooOo00) abstractC31434OooO0O0).OooO0OO() : false)) {
                if (!(interfaceC31671OooO0OO instanceof InterfaceC31452OooOo00 ? ((InterfaceC31452OooOo00) interfaceC31671OooO0OO).OooO0OO() : false)) {
                    return;
                }
            }
        }
        this.f112990Oooo00O.add(abstractC31434OooO0O0);
        hashSet.add(abstractC31434OooO0O0);
        if (obj != null) {
            hashSet2.add(obj);
        }
    }

    public final void OooO0OO(AbstractC31434OooO0O0 abstractC31434OooO0O0) throws IOException {
        this.f112991Oooo00o.add(abstractC31434OooO0O0);
        this.f112992Oooo0O0 = OooOOoo(abstractC31434OooO0O0);
        this.f112987OooOooo.add(new C31608OooO0OO(this.f112981OooOoO.f112960OooOo0o, abstractC31434OooO0O0, this.f112992Oooo0O0));
        C31606OooO00o c31606OooO00o = this.f112981OooOoO;
        String strValueOf = String.valueOf(this.f112992Oooo0O0.f112466OooOo0o);
        Charset charset = C31835OooO00o.f113459OooO0Oo;
        c31606OooO00o.write(strValueOf.getBytes(charset));
        C31606OooO00o c31606OooO00o2 = this.f112981OooOoO;
        byte[] bArr = f112961Oooo;
        c31606OooO00o2.write(bArr);
        this.f112981OooOoO.write(String.valueOf(this.f112992Oooo0O0.f112465OooOo).getBytes(charset));
        this.f112981OooOoO.write(bArr);
        this.f112981OooOoO.write(f112972OoooOoO);
        this.f112981OooOoO.OooO00o();
        abstractC31434OooO0O0.OooOOoo(this);
        this.f112981OooOoO.OooO00o();
        this.f112981OooOoO.write(f112973OoooOoo);
        this.f112981OooOoO.OooO00o();
    }

    public final void OooOOO0(C31438OooO0o0 c31438OooO0o0) throws IOException {
        this.f112981OooOoO.write(f112970OoooOOo);
        this.f112981OooOoO.OooO00o();
        C31436OooO0Oo c31436OooO0Oo = c31438OooO0o0.f112230OooOoo0;
        ArrayList arrayList = this.f112987OooOooo;
        Collections.sort(arrayList);
        c31436OooO0Oo.o000Ooo0(C31441OooOO0.f112396o00O0o0o, ((C31608OooO0OO) arrayList.get(arrayList.size() - 1)).f113000OooOoO0.f112466OooOo0o + 1);
        c31436OooO0Oo.o000OOoO(C31441OooOO0.f112382o00O0O0O);
        if (!c31438OooO0o0.f112233Oooo000) {
            c31436OooO0Oo.o000OOoO(C31441OooOO0.f112429o00Oo00);
        }
        c31436OooO0Oo.o000OOoO(C31441OooOO0.f112286o00000o0);
        C31433OooO00o c31433OooO00oOooo0 = c31436OooO0Oo.Oooo0(C31441OooOO0.f112320o000O0oO);
        if (c31433OooO00oOooo0 != null) {
            c31433OooO00oOooo0.f112215OooOo0o = true;
        }
        c31436OooO0Oo.OooOOoo(this);
    }

    public final void OooOOo0() throws IOException {
        C31608OooO0OO c31608OooO0OO = C31608OooO0OO.f112996OooOoOO;
        ArrayList arrayList = this.f112987OooOooo;
        arrayList.add(c31608OooO0OO);
        Collections.sort(arrayList);
        C31606OooO00o c31606OooO00o = this.f112981OooOoO;
        this.f112983OooOoOO = c31606OooO00o.f112960OooOo0o;
        c31606OooO00o.write(f112968OoooOO0);
        this.f112981OooOoO.OooO00o();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        long j = -2;
        long j2 = 1;
        while (it.hasNext()) {
            long j3 = ((C31608OooO0OO) it.next()).f113000OooOoO0.f112466OooOo0o;
            if (j3 == j + 1) {
                j2++;
            } else if (j != -2) {
                arrayList2.add(Long.valueOf((j - j2) + 1));
                arrayList2.add(Long.valueOf(j2));
                j2 = 1;
            }
            j = j3;
        }
        if (arrayList.size() > 0) {
            arrayList2.add(Long.valueOf((j - j2) + 1));
            arrayList2.add(Long.valueOf(j2));
        }
        Long[] lArr = (Long[]) arrayList2.toArray(new Long[arrayList2.size()]);
        int length = lArr.length;
        if (length % 2 == 0) {
            int i = 0;
            for (int i2 = 0; i2 < length; i2 += 2) {
                long jLongValue = lArr[i2 + 1].longValue();
                long jLongValue2 = lArr[i2].longValue();
                C31606OooO00o c31606OooO00o2 = this.f112981OooOoO;
                String strValueOf = String.valueOf(jLongValue2);
                Charset charset = C31835OooO00o.f113459OooO0Oo;
                c31606OooO00o2.write(strValueOf.getBytes(charset));
                C31606OooO00o c31606OooO00o3 = this.f112981OooOoO;
                byte[] bArr = f112961Oooo;
                c31606OooO00o3.write(bArr);
                this.f112981OooOoO.write(String.valueOf(jLongValue).getBytes(charset));
                this.f112981OooOoO.OooO00o();
                int i3 = 0;
                while (i3 < jLongValue) {
                    int i4 = i + 1;
                    C31608OooO0OO c31608OooO0OO2 = (C31608OooO0OO) arrayList.get(i);
                    String str = this.f112980OooOo0o.format(c31608OooO0OO2.f112998OooOo0o);
                    String str2 = this.f112979OooOo.format(c31608OooO0OO2.f113000OooOoO0.f112465OooOo);
                    C31606OooO00o c31606OooO00o4 = this.f112981OooOoO;
                    Charset charset2 = C31835OooO00o.f113459OooO0Oo;
                    c31606OooO00o4.write(str.getBytes(charset2));
                    this.f112981OooOoO.write(bArr);
                    this.f112981OooOoO.write(str2.getBytes(charset2));
                    this.f112981OooOoO.write(bArr);
                    this.f112981OooOoO.write(c31608OooO0OO2.f112999OooOoO ? f112978o000oOoO : f112969OoooOOO);
                    this.f112981OooOoO.write(C31606OooO00o.f112958OooOoO0);
                    i3++;
                    i = i4;
                }
            }
        }
    }

    public final C31444OooOOO OooOOoo(AbstractC31434OooO0O0 abstractC31434OooO0O0) {
        AbstractC31434OooO0O0 abstractC31434OooO0O02 = abstractC31434OooO0O0 instanceof C31445OooOOO0 ? ((C31445OooOOO0) abstractC31434OooO0O0).f112467OooOo : abstractC31434OooO0O0;
        Hashtable hashtable = this.f112984OooOoo;
        C31444OooOOO c31444OooOOO = (C31444OooOOO) hashtable.get(abstractC31434OooO0O0);
        if (c31444OooOOO == null && abstractC31434OooO0O02 != null) {
            c31444OooOOO = (C31444OooOOO) hashtable.get(abstractC31434OooO0O02);
        }
        if (c31444OooOOO != null) {
            return c31444OooOOO;
        }
        long j = this.f112985OooOoo0 + 1;
        this.f112985OooOoo0 = j;
        C31444OooOOO c31444OooOOO2 = new C31444OooOOO(j, 0);
        hashtable.put(abstractC31434OooO0O0, c31444OooOOO2);
        if (abstractC31434OooO0O02 != null) {
            hashtable.put(abstractC31434OooO0O02, c31444OooOOO2);
        }
        return c31444OooOOO2;
    }

    public final void OooOooo(C31436OooO0Oo c31436OooO0Oo) throws IOException {
        if (!this.f112994Oooo0o) {
            AbstractC31434OooO0O0 abstractC31434OooO0O0O0OoO0o = c31436OooO0Oo.o0OoO0o(C31441OooOO0.f112403o00OO);
            if (C31441OooOO0.f112395o00O0o0O.equals(abstractC31434OooO0O0O0OoO0o) || C31441OooOO0.f112299o0000Ooo.equals(abstractC31434OooO0O0O0OoO0o)) {
                this.f112994Oooo0o = true;
            }
        }
        this.f112981OooOoO.write(f112962Oooo0oO);
        this.f112981OooOoO.OooO00o();
        for (Map.Entry entry : c31436OooO0Oo.f112222OooOoO0.entrySet()) {
            AbstractC31434OooO0O0 abstractC31434OooO0O0 = (AbstractC31434OooO0O0) entry.getValue();
            if (abstractC31434OooO0O0 != null) {
                ((C31441OooOO0) entry.getKey()).OooOOoo(this);
                this.f112981OooOoO.write(f112961Oooo);
                if (abstractC31434OooO0O0 instanceof C31436OooO0Oo) {
                    C31436OooO0Oo c31436OooO0Oo2 = (C31436OooO0Oo) abstractC31434OooO0O0;
                    C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112432o00OoOoO;
                    AbstractC31434OooO0O0 abstractC31434OooO0O0O0OoO0o2 = c31436OooO0Oo2.o0OoO0o(c31441OooOO0);
                    if (abstractC31434OooO0O0O0OoO0o2 != null && !c31441OooOO0.equals(entry.getKey())) {
                        abstractC31434OooO0O0O0OoO0o2.f112215OooOo0o = true;
                    }
                    C31441OooOO0 c31441OooOO02 = C31441OooOO0.f112389o00O0Oo0;
                    AbstractC31434OooO0O0 abstractC31434OooO0O0O0OoO0o3 = c31436OooO0Oo2.o0OoO0o(c31441OooOO02);
                    if (abstractC31434OooO0O0O0OoO0o3 != null && !c31441OooOO02.equals(entry.getKey())) {
                        abstractC31434OooO0O0O0OoO0o3.f112215OooOo0o = true;
                    }
                    if (c31436OooO0Oo2.f112215OooOo0o) {
                        OooOooo(c31436OooO0Oo2);
                    } else {
                        OooO00o(c31436OooO0Oo2);
                        Oooo00o(c31436OooO0Oo2);
                    }
                } else if (abstractC31434OooO0O0 instanceof C31445OooOOO0) {
                    AbstractC31434OooO0O0 abstractC31434OooO0O02 = ((C31445OooOOO0) abstractC31434OooO0O0).f112467OooOo;
                    if (this.f112995Oooo0o0 || (abstractC31434OooO0O02 instanceof C31436OooO0Oo) || abstractC31434OooO0O02 == null) {
                        OooO00o(abstractC31434OooO0O0);
                        Oooo00o(abstractC31434OooO0O0);
                    } else {
                        abstractC31434OooO0O02.OooOOoo(this);
                    }
                } else if (this.f112994Oooo0o && C31441OooOO0.f112439o00ooo.equals(entry.getKey())) {
                    long j = this.f112981OooOoO.f112960OooOo0o;
                    abstractC31434OooO0O0.OooOOoo(this);
                    long j2 = this.f112981OooOoO.f112960OooOo0o;
                } else if (this.f112994Oooo0o && C31441OooOO0.f112264OoooOoO.equals(entry.getKey())) {
                    long j3 = this.f112981OooOoO.f112960OooOo0o;
                    abstractC31434OooO0O0.OooOOoo(this);
                    long j4 = this.f112981OooOoO.f112960OooOo0o;
                    this.f112994Oooo0o = false;
                } else {
                    abstractC31434OooO0O0.OooOOoo(this);
                }
                this.f112981OooOoO.OooO00o();
            }
        }
        this.f112981OooOoO.write(f112963Oooo0oo);
        this.f112981OooOoO.OooO00o();
    }

    public final void Oooo000(C31611OooO00o c31611OooO00o) throws IOException {
        C31433OooO00o c31433OooO00o;
        c31611OooO00o.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f112993Oooo0OO = c31611OooO00o;
        boolean z = true;
        if (c31611OooO00o.OooOOO0() != null) {
            AbstractC31745OooOO0O abstractC31745OooOO0OOooO0O0 = this.f112993Oooo0OO.OooOOO0().OooO0O0();
            if (abstractC31745OooOO0OOooO0O0.f113378OooO0oO == null) {
                throw new IllegalStateException("PDF contains an encryption dictionary, please remove it with setAllSecurityToBeRemoved() or set a protection policy with protect()");
            }
            abstractC31745OooOO0OOooO0O0.OooO0oo(this.f112993Oooo0OO);
            this.f112995Oooo0o0 = true;
        } else {
            this.f112995Oooo0o0 = false;
        }
        C31438OooO0o0 c31438OooO0o0 = this.f112993Oooo0OO.f113008OooOo0o;
        C31436OooO0Oo c31436OooO0Oo = c31438OooO0o0.f112230OooOoo0;
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = c31436OooO0Oo.o0000O0O(C31441OooOO0.f112320o000O0oO);
        if (abstractC31434OooO0O0O0000O0O instanceof C31433OooO00o) {
            c31433OooO00o = (C31433OooO00o) abstractC31434OooO0O0O0000O0O;
            if (c31433OooO00o.f112214OooOo.size() == 2) {
                z = false;
            }
        } else {
            c31433OooO00o = null;
        }
        if (c31433OooO00o != null && c31433OooO00o.f112214OooOo.size() == 2) {
            z = false;
        }
        if (z) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(Long.toString(jCurrentTimeMillis).getBytes(C31835OooO00o.f113459OooO0Oo));
                C31436OooO0Oo c31436OooO0OoOooo0OO = c31436OooO0Oo.Oooo0OO(C31441OooOO0.f112328o000OOo0);
                if (c31436OooO0OoOooo0OO != null) {
                    Iterator it = c31436OooO0OoOooo0OO.f112222OooOoO0.values().iterator();
                    while (it.hasNext()) {
                        messageDigest.update(((AbstractC31434OooO0O0) it.next()).toString().getBytes(C31835OooO00o.f113459OooO0Oo));
                    }
                }
                C31450OooOOoo c31450OooOOoo = z ? new C31450OooOOoo(messageDigest.digest()) : (C31450OooOOoo) c31433OooO00o.Oooo0(0);
                C31450OooOOoo c31450OooOOoo2 = z ? c31450OooOOoo : new C31450OooOOoo(messageDigest.digest());
                C31433OooO00o c31433OooO00o2 = new C31433OooO00o();
                c31433OooO00o2.OooOooo(c31450OooOOoo);
                c31433OooO00o2.OooOooo(c31450OooOOoo2);
                c31436OooO0Oo.o000OoOO(C31441OooOO0.f112320o000O0oO, c31433OooO00o2);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
        c31438OooO0o0.OooOOoo(this);
    }

    public final void Oooo00o(AbstractC31434OooO0O0 abstractC31434OooO0O0) throws IOException {
        C31444OooOOO c31444OooOOOOooOOoo = OooOOoo(abstractC31434OooO0O0);
        C31606OooO00o c31606OooO00o = this.f112981OooOoO;
        String strValueOf = String.valueOf(c31444OooOOOOooOOoo.f112466OooOo0o);
        Charset charset = C31835OooO00o.f113459OooO0Oo;
        c31606OooO00o.write(strValueOf.getBytes(charset));
        C31606OooO00o c31606OooO00o2 = this.f112981OooOoO;
        byte[] bArr = f112961Oooo;
        c31606OooO00o2.write(bArr);
        this.f112981OooOoO.write(String.valueOf(c31444OooOOOOooOOoo.f112465OooOo).getBytes(charset));
        this.f112981OooOoO.write(bArr);
        this.f112981OooOoO.write(f112964OoooO);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C31606OooO00o c31606OooO00o = this.f112981OooOoO;
        if (c31606OooO00o != null) {
            c31606OooO00o.close();
        }
    }
}
