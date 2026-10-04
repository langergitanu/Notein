package o0ooo0;

import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import o0oo0oo.C31386OooOo0o;
import o0oo0oo.C31401Oooo0oO;
import o0ooO0Oo.C31432OooO;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooOO0o.C31611OooO00o;
import o0ooOoo.C31668OooO;
import o0oooOO0.C31835OooO00o;
import o0oooOO0.C31836OooO0O0;

/* JADX INFO: renamed from: o0ooo0.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31717OooOOO extends AbstractC31734OooOooo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C31611OooO00o f113290OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C31436OooO0Oo f113291OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOo f113292OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C31436OooO0Oo f113293OooO0oO;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o0ooo0.OooOOO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f113294OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f113295OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f113296OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f113297OooOoO0;

        static {
            OooO00o oooO00o = new OooO00o("FIRST", 0);
            f113295OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("BRACKET", 1);
            f113294OooOo = oooO00o2;
            OooO00o oooO00o3 = new OooO00o("SERIAL", 2);
            f113297OooOoO0 = oooO00o3;
            f113296OooOoO = new OooO00o[]{oooO00o, oooO00o2, oooO00o3};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f113296OooOoO.clone();
        }
    }

    public C31717OooOOO(C31611OooO00o c31611OooO00o, C31436OooO0Oo c31436OooO0Oo, C31401Oooo0oO c31401Oooo0oO, OooOo oooOo) throws IOException {
        int i;
        int[] iArr;
        super(c31611OooO00o, c31436OooO0Oo, c31401Oooo0oO);
        this.f113290OooO0Oo = c31611OooO00o;
        this.f113291OooO0o = c31436OooO0Oo;
        this.f113292OooO0o0 = oooOo;
        C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112404o00OO0;
        c31436OooO0Oo.o000OoOO(c31441OooOO0, C31441OooOO0.f112417o00OOO00);
        C31441OooOO0 c31441OooOO02 = C31441OooOO0.f112259OoooO0O;
        c31436OooO0Oo.o000OooO(c31441OooOO02, this.f113359OooO0O0.OooO0OO());
        c31436OooO0Oo.o000OoOO(C31441OooOO0.f112291o0000O0O, C31441OooOO0.f112323o000OO00);
        C31436OooO0Oo c31436OooO0Oo2 = new C31436OooO0Oo();
        c31436OooO0Oo2.o000OoOO(C31441OooOO0.f112403o00OO, C31441OooOO0.f112300o0000o);
        c31436OooO0Oo2.o000OoOO(c31441OooOO0, C31441OooOO0.f112446o0OoOo0);
        c31436OooO0Oo2.o000OooO(c31441OooOO02, this.f113359OooO0O0.OooO0OO());
        C31436OooO0Oo c31436OooO0Oo3 = new C31436OooO0Oo();
        c31436OooO0Oo3.o000o000(C31441OooOO0.f112387o00O0OOo, "Adobe");
        c31436OooO0Oo3.o000o000(C31441OooOO0.f112441o0O0ooO, AbstractDevicePopManager.CertificateProperties.ORGANIZATION_UNIT);
        c31436OooO0Oo3.o000Oo(C31441OooOO0.f112409o00OO0O0, 0);
        c31436OooO0Oo2.o000OoOO(C31441OooOO0.f112379o00O0O, c31436OooO0Oo3);
        c31436OooO0Oo2.o000OoOO(C31441OooOO0.f112305o0000oOO, this.f113359OooO0O0.f113315OooOo0o);
        int iOooo0OO = this.f113358OooO00o.Oooo0OO();
        int i2 = iOooo0OO * 2;
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < iOooo0OO; i3++) {
            int i4 = i3 * 2;
            iArr2[i4] = i3;
            iArr2[i4 + 1] = this.f113358OooO00o.Oooo0().OooO0O0(i3);
        }
        C31441OooOO0 c31441OooOO03 = C31441OooOO0.f112452oOooo0o;
        if (i2 == 0) {
            throw new IllegalArgumentException("length of widths must be > 0");
        }
        float f = 1000.0f / this.f113358OooO00o.Oooo000().f112057OooO0o;
        long j = iArr2[0];
        long jRound = Math.round(iArr2[1] * f);
        C31433OooO00o c31433OooO00o = new C31433OooO00o();
        C31433OooO00o c31433OooO00o2 = new C31433OooO00o();
        c31433OooO00o2.OooOooo(C31432OooO.o0Oo0oo(j));
        OooO00o oooO00o = OooO00o.f113295OooOo0o;
        OooO00o oooO00o2 = oooO00o;
        int i5 = 2;
        while (true) {
            OooO00o oooO00o3 = OooO00o.f113294OooOo;
            OooO00o oooO00o4 = OooO00o.f113297OooOoO0;
            if (i5 >= i2) {
                break;
            }
            float f2 = f;
            long j2 = iArr2[i5];
            int i6 = i2;
            long jRound2 = Math.round(iArr2[i5 + 1] * f2);
            int iOrdinal = oooO00o2.ordinal();
            if (iOrdinal != 0) {
                iArr = iArr2;
                if (iOrdinal == 1) {
                    long j3 = j + 1;
                    if (j2 == j3 && jRound2 == jRound) {
                        c31433OooO00o2.OooOooo(c31433OooO00o);
                        c31433OooO00o2.OooOooo(C31432OooO.o0Oo0oo(j));
                        oooO00o2 = oooO00o4;
                    } else if (j2 == j3) {
                        c31433OooO00o.OooOooo(C31432OooO.o0Oo0oo(jRound));
                    } else {
                        c31433OooO00o.OooOooo(C31432OooO.o0Oo0oo(jRound));
                        c31433OooO00o2.OooOooo(c31433OooO00o);
                        c31433OooO00o2.OooOooo(C31432OooO.o0Oo0oo(j2));
                        oooO00o2 = oooO00o;
                    }
                } else if (iOrdinal == 2 && (j2 != j + 1 || jRound2 != jRound)) {
                    c31433OooO00o2.OooOooo(C31432OooO.o0Oo0oo(j));
                    c31433OooO00o2.OooOooo(C31432OooO.o0Oo0oo(jRound));
                    c31433OooO00o2.OooOooo(C31432OooO.o0Oo0oo(j2));
                    oooO00o2 = oooO00o;
                }
            } else {
                iArr = iArr2;
                long j4 = j + 1;
                if (j2 == j4 && jRound2 == jRound) {
                    oooO00o2 = oooO00o4;
                } else if (j2 == j4) {
                    C31433OooO00o c31433OooO00o3 = new C31433OooO00o();
                    c31433OooO00o3.OooOooo(C31432OooO.o0Oo0oo(jRound));
                    c31433OooO00o = c31433OooO00o3;
                    oooO00o2 = oooO00o3;
                } else {
                    C31433OooO00o c31433OooO00o4 = new C31433OooO00o();
                    c31433OooO00o4.OooOooo(C31432OooO.o0Oo0oo(jRound));
                    c31433OooO00o2.OooOooo(c31433OooO00o4);
                    c31433OooO00o2.OooOooo(C31432OooO.o0Oo0oo(j2));
                    c31433OooO00o = c31433OooO00o4;
                }
            }
            i5 += 2;
            jRound = jRound2;
            iArr2 = iArr;
            i2 = i6;
            j = j2;
            f = f2;
        }
        int iOrdinal2 = oooO00o2.ordinal();
        if (iOrdinal2 == 0) {
            C31433OooO00o c31433OooO00o5 = new C31433OooO00o();
            c31433OooO00o5.OooOooo(C31432OooO.o0Oo0oo(jRound));
            c31433OooO00o2.OooOooo(c31433OooO00o5);
        } else if (iOrdinal2 == 1) {
            c31433OooO00o.OooOooo(C31432OooO.o0Oo0oo(jRound));
            c31433OooO00o2.OooOooo(c31433OooO00o);
        } else if (iOrdinal2 == 2) {
            c31433OooO00o2.OooOooo(C31432OooO.o0Oo0oo(j));
            c31433OooO00o2.OooOooo(C31432OooO.o0Oo0oo(jRound));
        }
        c31436OooO0Oo2.o000OoOO(c31441OooOO03, c31433OooO00o2);
        c31436OooO0Oo2.o000OoOO(C31441OooOO0.f112459ooOO, C31441OooOO0.f112310o000O);
        this.f113293OooO0oO = c31436OooO0Oo2;
        C31433OooO00o c31433OooO00o6 = new C31433OooO00o();
        c31433OooO00o6.OooOooo(c31436OooO0Oo2);
        c31436OooO0Oo.o000OoOO(C31441OooOO0.f112279o000000, c31433OooO00o6);
        TreeMap treeMap = new TreeMap();
        int i7 = ((C31386OooOo0o) this.f113358OooO00o.o0Oo0oo("maxp")).f112072OooO0o;
        int i8 = 1;
        int i9 = 0;
        boolean z = false;
        for (int i10 = 1; i10 <= i7; i10++) {
            ArrayList arrayListOooO00o = this.f113360OooO0OO.OooO00o(i10);
            if (arrayListOooO00o != null) {
                int iIntValue = ((Integer) arrayListOooO00o.get(0)).intValue();
                z = iIntValue > 65535 ? true : z;
                String str = new String(new int[]{iIntValue}, 0, 1);
                if (i10 < 0 || i10 > 65535) {
                    throw new IllegalArgumentException("CID is not valid");
                }
                if (str.isEmpty()) {
                    throw new IllegalArgumentException("Text is null or empty");
                }
                treeMap.put(Integer.valueOf(i10), str);
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, C31835OooO00o.f113456OooO00o));
        bufferedWriter.write("/CIDInit /ProcSet findresource begin");
        bufferedWriter.write(10);
        bufferedWriter.write("12 dict begin\n");
        bufferedWriter.write(10);
        bufferedWriter.write("begincmap");
        bufferedWriter.write(10);
        bufferedWriter.write("/CIDSystemInfo");
        bufferedWriter.write(10);
        bufferedWriter.write("<< /Registry (Adobe)");
        bufferedWriter.write(10);
        bufferedWriter.write("/Ordering (UCS)");
        bufferedWriter.write(10);
        bufferedWriter.write("/Supplement 0");
        bufferedWriter.write(10);
        bufferedWriter.write(">> def\n");
        bufferedWriter.write(10);
        bufferedWriter.write("/CMapName /Adobe-Identity-UCS def");
        bufferedWriter.write(10);
        bufferedWriter.write("/CMapType 2 def\n");
        bufferedWriter.write(10);
        bufferedWriter.write("1 begincodespacerange");
        bufferedWriter.write(10);
        bufferedWriter.write("<0000> <FFFF>");
        bufferedWriter.write(10);
        bufferedWriter.write("endcodespacerange\n");
        bufferedWriter.write(10);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i11 = -1;
        String str2 = null;
        int i12 = -1;
        for (Map.Entry entry : treeMap.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int iIntValue2 = num.intValue();
            String str3 = (String) entry.getValue();
            if (iIntValue2 == i11 + i8 && str2.codePointCount(0, str2.length()) == i8) {
                i = i8;
                if (str3.codePointAt(0) == str2.codePointAt(0) + 1 && str2.codePointAt(0) + 1 <= 255 - (iIntValue2 - i12)) {
                    arrayList2.set(arrayList2.size() - 1, num);
                }
                i8 = i;
                i11 = iIntValue2;
                str2 = str3;
            } else {
                i = i8;
            }
            arrayList.add(num);
            arrayList2.add(num);
            arrayList3.add(str3);
            i12 = iIntValue2;
            i8 = i;
            i11 = iIntValue2;
            str2 = str3;
        }
        int iCeil = (int) Math.ceil(((double) arrayList.size()) / 100.0d);
        int i13 = 0;
        while (i13 < iCeil) {
            int size = i13 == iCeil + (-1) ? arrayList.size() - (i13 * 100) : 100;
            bufferedWriter.write(size + " beginbfrange\n");
            int i14 = i9;
            while (i14 < size) {
                int i15 = (i13 * 100) + i14;
                bufferedWriter.write(60);
                bufferedWriter.write(C31836OooO0O0.OooO00o(((Integer) arrayList.get(i15)).shortValue()));
                bufferedWriter.write("> ");
                bufferedWriter.write(60);
                bufferedWriter.write(C31836OooO0O0.OooO00o(((Integer) arrayList2.get(i15)).shortValue()));
                bufferedWriter.write("> ");
                bufferedWriter.write(60);
                String str4 = (String) arrayList3.get(i15);
                char[] cArr = new char[str4.length() * 4];
                int i16 = i9;
                int i17 = i16;
                while (i16 < str4.length()) {
                    char cCharAt = str4.charAt(i16);
                    char[] cArr2 = C31836OooO0O0.f113463OooO0O0;
                    cArr[i17] = cArr2[(cCharAt >> '\f') & 15];
                    cArr[i17 + 1] = cArr2[(cCharAt >> '\b') & 15];
                    int i18 = i17 + 3;
                    cArr[i17 + 2] = cArr2[(cCharAt >> 4) & 15];
                    i17 += 4;
                    cArr[i18] = cArr2[cCharAt & 15];
                    i16++;
                }
                bufferedWriter.write(cArr);
                bufferedWriter.write(">\n");
                i14++;
                i9 = 0;
            }
            bufferedWriter.write("endbfrange\n");
            bufferedWriter.write(10);
            i13++;
            i9 = 0;
        }
        bufferedWriter.write("endcmap");
        bufferedWriter.write(10);
        bufferedWriter.write("CMapName currentdict /CMap defineresource pop");
        bufferedWriter.write(10);
        bufferedWriter.write("end");
        bufferedWriter.write(10);
        bufferedWriter.write("end");
        bufferedWriter.write(10);
        bufferedWriter.flush();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        C31441OooOO0 c31441OooOO04 = C31441OooOO0.f112301o0000o0O;
        C31611OooO00o c31611OooO00o2 = this.f113290OooO0Oo;
        C31668OooO c31668OooO = new C31668OooO(c31611OooO00o2, byteArrayInputStream, c31441OooOO04);
        if (z && c31611OooO00o2.OooOOo0() < 1.5d) {
            c31611OooO00o2.OooOooo(1.5f);
        }
        this.f113291OooO0o.o000OoOo(C31441OooOO0.f112413o00OO0oO, c31668OooO);
    }
}
