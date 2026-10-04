package o0oo0oO0;

import OooO0Oo.C20398OooO0O0;
import Oooo0oO.C21023OooO0Oo;
import Oooo0oO.o0Oo0oo;
import Oooo0oo.AbstractC21138OooO0oo;
import android.util.Log;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.datastore.preferences.protobuf.C21825OoooOO0;
import com.aspose.slides.o000oOoO;
import com.aspose.words.StyleIdentifier;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.orion.notein.domain.models.backup.BackupEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import o000OO00.C24472OooOoo;
import o000o0O0.AbstractC24602Oooo0o0;
import o0oo0oO0.C31330OooO;
import o0oo0ooo.C31413OooO0O0;

/* JADX INFO: renamed from: o0oo0oO0.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31339OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String[] f111902OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f111903OooO0O0;

    /* JADX INFO: renamed from: o0oo0oO0.OooOO0$OooO */
    public static class OooO extends AbstractC31340OooO0Oo {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f111904OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public ArrayList f111905OooO0oo;

        @Override // o000o0O0.AbstractC24602Oooo0o0
        public final int OooO0Oo(int i) {
            int i2;
            if (this.f83367OooO00o) {
                for (OooOOO oooOOO : this.f111905OooO0oo) {
                    int i3 = oooOOO.f111926OooO0OO;
                    if (i >= i3 && i <= (i2 = oooOOO.f111927OooO0Oo)) {
                        if (i < i3 || i > i2) {
                            return 0;
                        }
                        return (i - i3) + oooOOO.f111924OooO00o;
                    }
                }
            }
            return super.OooO0Oo(i);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            C21825OoooOO0.OooO0OO(OooO.class, sb, "[format=");
            return C21023OooO0Oo.OooO0OO("]", this.f111904OooO0oO, sb);
        }
    }

    /* JADX INFO: renamed from: o0oo0oO0.OooOO0$OooO00o */
    public interface OooO00o {
    }

    /* JADX INFO: renamed from: o0oo0oO0.OooOO0$OooO0O0 */
    public static abstract class OooO0O0 extends AbstractC31333OooO0OO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooO00o[] f111906OooO0Oo;

        /* JADX INFO: renamed from: o0oo0oO0.OooOO0$OooO0O0$OooO00o */
        public static class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public int f111907OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public int f111908OooO0O0;

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                C21825OoooOO0.OooO0OO(OooO00o.class, sb, "[code=");
                sb.append(this.f111907OooO00o);
                sb.append(", sid=");
                return C21023OooO0Oo.OooO0OO("]", this.f111908OooO0O0, sb);
            }
        }
    }

    /* JADX INFO: renamed from: o0oo0oO0.OooOO0$OooO0OO */
    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final HashMap f111909OooO00o = new HashMap();

        /* JADX INFO: renamed from: o0oo0oO0.OooOO0$OooO0OO$OooO00o */
        public static class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final ArrayList f111910OooO00o = new ArrayList();

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public C31330OooO f111911OooO0O0 = null;

            public final Number OooO00o(int i) {
                return (Number) this.f111910OooO00o.get(i);
            }

            public final boolean OooO0O0() {
                return !this.f111910OooO00o.isEmpty();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                C21825OoooOO0.OooO0OO(OooO00o.class, sb, "[operands=");
                sb.append(this.f111910OooO00o);
                sb.append(", operator=");
                sb.append(this.f111911OooO0O0);
                sb.append("]");
                return sb.toString();
            }
        }

        public final List<Number> OooO00o(String str, List<Number> list) {
            OooO00o oooO00oOooO0Oo = OooO0Oo(str);
            if (oooO00oOooO0Oo != null) {
                ArrayList arrayList = oooO00oOooO0Oo.f111910OooO00o;
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
            }
            return list;
        }

        public final Boolean OooO0O0(String str) {
            Boolean bool;
            OooO00o oooO00oOooO0Oo = OooO0Oo(str);
            boolean zBooleanValue = false;
            if (oooO00oOooO0Oo != null) {
                ArrayList arrayList = oooO00oOooO0Oo.f111910OooO00o;
                if (!arrayList.isEmpty()) {
                    Number number = (Number) arrayList.get(0);
                    if (number instanceof Integer) {
                        int iIntValue = number.intValue();
                        if (iIntValue == 0) {
                            bool = Boolean.FALSE;
                        } else if (iIntValue == 1) {
                            bool = Boolean.TRUE;
                        }
                        zBooleanValue = bool.booleanValue();
                    }
                    throw new IllegalArgumentException();
                }
            }
            return Boolean.valueOf(zBooleanValue);
        }

        public final List OooO0OO(String str) {
            OooO00o oooO00oOooO0Oo = OooO0Oo(str);
            if (oooO00oOooO0Oo == null) {
                return null;
            }
            ArrayList arrayList = oooO00oOooO0Oo.f111910OooO00o;
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int i = 1; i < arrayList2.size(); i++) {
                Number number = (Number) arrayList2.get(i - 1);
                arrayList2.set(i, Integer.valueOf(((Number) arrayList2.get(i)).intValue() + number.intValue()));
            }
            return arrayList2;
        }

        public final OooO00o OooO0Oo(String str) {
            return (OooO00o) this.f111909OooO00o.get(str);
        }

        public final Number OooO0o0(String str, Number number) {
            OooO00o oooO00oOooO0Oo = OooO0Oo(str);
            return (oooO00oOooO0Oo == null || oooO00oOooO0Oo.f111910OooO00o.isEmpty()) ? number : oooO00oOooO0Oo.OooO00o(0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            C21825OoooOO0.OooO0OO(OooO0OO.class, sb, "[entries=");
            sb.append(this.f111909OooO00o);
            sb.append("]");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: o0oo0oO0.OooOO0$OooO0Oo, reason: case insensitive filesystem */
    public static abstract class AbstractC31340OooO0Oo extends AbstractC24602Oooo0o0 {
    }

    /* JADX INFO: renamed from: o0oo0oO0.OooOO0$OooO0o */
    public static class OooO0o extends AbstractC31340OooO0Oo {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f111912OooO0oO;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            C21825OoooOO0.OooO0OO(OooO0o.class, sb, "[format=");
            return C21023OooO0Oo.OooO0OO("]", this.f111912OooO0oO, sb);
        }
    }

    /* JADX INFO: renamed from: o0oo0oO0.OooOO0$OooO0o0, reason: case insensitive filesystem */
    public static class C31341OooO0o0 extends AbstractC31340OooO0Oo {
        public final String toString() {
            return C31341OooO0o0.class.getName();
        }
    }

    /* JADX INFO: renamed from: o0oo0oO0.OooOO0$OooO0oO, reason: case insensitive filesystem */
    public static class C31342OooO0oO extends OooO0O0 {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f111913OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f111914OooO0o0;

        @Override // o0000o0O.AbstractC24304ooOO
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            C21825OoooOO0.OooO0OO(C31342OooO0oO.class, sb, "[format=");
            sb.append(this.f111914OooO0o0);
            sb.append(", nCodes=");
            sb.append(this.f111913OooO0o);
            sb.append(", supplement=");
            sb.append(Arrays.toString(this.f111906OooO0Oo));
            sb.append("]");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: o0oo0oO0.OooOO0$OooO0oo, reason: case insensitive filesystem */
    public static class C31343OooO0oo extends AbstractC21138OooO0oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int[] f111915OooO00o;

        @Override // Oooo0oo.AbstractC21138OooO0oo
        public final int OoooO(int i) {
            int[] iArr = this.f111915OooO00o;
            if (i < iArr.length) {
                return iArr[i];
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            C21825OoooOO0.OooO0OO(C31343OooO0oo.class, sb, "[fds=");
            sb.append(Arrays.toString(this.f111915OooO00o));
            sb.append("]");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: o0oo0oO0.OooOO0$OooOO0, reason: collision with other inner class name */
    public static class C20172OooOO0 extends OooO0O0 {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f111916OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f111917OooO0o0;

        @Override // o0000o0O.AbstractC24304ooOO
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            C21825OoooOO0.OooO0OO(C20172OooOO0.class, sb, "[format=");
            sb.append(this.f111917OooO0o0);
            sb.append(", nRanges=");
            sb.append(this.f111916OooO0o);
            sb.append(", supplement=");
            sb.append(Arrays.toString(this.f111906OooO0Oo));
            sb.append("]");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: o0oo0oO0.OooOO0$OooOO0O */
    public static class OooOO0O extends AbstractC31340OooO0Oo {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f111918OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public ArrayList f111919OooO0oo;

        @Override // o000o0O0.AbstractC24602Oooo0o0
        public final int OooO0Oo(int i) {
            int i2;
            for (OooOOO oooOOO : this.f111919OooO0oo) {
                int i3 = oooOOO.f111926OooO0OO;
                if (i >= i3 && i <= (i2 = oooOOO.f111927OooO0Oo)) {
                    if (i < i3 || i > i2) {
                        return 0;
                    }
                    return (i - i3) + oooOOO.f111924OooO00o;
                }
            }
            return super.OooO0Oo(i);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            C21825OoooOO0.OooO0OO(OooOO0O.class, sb, "[format=");
            return C21023OooO0Oo.OooO0OO("]", this.f111918OooO0oO, sb);
        }
    }

    /* JADX INFO: renamed from: o0oo0oO0.OooOO0$OooOO0o, reason: case insensitive filesystem */
    public static final class C31344OooOO0o extends AbstractC21138OooO0oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f111920OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f111921OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public OooOOO0[] f111922OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f111923OooO0Oo;

        @Override // Oooo0oo.AbstractC21138OooO0oo
        public final int OoooO(int i) {
            int i2 = 0;
            while (true) {
                int i3 = this.f111921OooO0O0;
                if (i2 >= i3) {
                    return 0;
                }
                OooOOO0[] oooOOO0Arr = this.f111922OooO0OO;
                OooOOO0 oooOOO0 = oooOOO0Arr[i2];
                if (oooOOO0.f111928OooO00o <= i) {
                    int i4 = i2 + 1;
                    if (i4 >= i3) {
                        if (this.f111923OooO0Oo > i) {
                            return oooOOO0.f111929OooO0O0;
                        }
                        return -1;
                    }
                    if (oooOOO0Arr[i4].f111928OooO00o > i) {
                        return oooOOO0.f111929OooO0O0;
                    }
                }
                i2++;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            C21825OoooOO0.OooO0OO(C31344OooOO0o.class, sb, "[format=");
            sb.append(this.f111920OooO00o);
            sb.append(" nbRanges=");
            sb.append(this.f111921OooO0O0);
            sb.append(", range3=");
            sb.append(Arrays.toString(this.f111922OooO0OO));
            sb.append(" sentinel=");
            return C21023OooO0Oo.OooO0OO("]", this.f111923OooO0Oo, sb);
        }
    }

    /* JADX INFO: renamed from: o0oo0oO0.OooOO0$OooOOO */
    public static final class OooOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f111924OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f111925OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f111926OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f111927OooO0Oo;

        public OooOOO(int i, int i2, int i3) {
            this.f111924OooO00o = i;
            this.f111925OooO0O0 = i + i3;
            this.f111926OooO0OO = i2;
            this.f111927OooO0Oo = i2 + i3;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            C21825OoooOO0.OooO0OO(OooOOO.class, sb, "[start value=");
            sb.append(this.f111924OooO00o);
            sb.append(", end value=");
            sb.append(this.f111925OooO0O0);
            sb.append(", start mapped-value=");
            sb.append(this.f111926OooO0OO);
            sb.append(", end mapped-value=");
            return C21023OooO0Oo.OooO0OO("]", this.f111927OooO0Oo, sb);
        }
    }

    /* JADX INFO: renamed from: o0oo0oO0.OooOO0$OooOOO0 */
    public static final class OooOOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f111928OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f111929OooO0O0;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            C21825OoooOO0.OooO0OO(OooOOO0.class, sb, "[first=");
            sb.append(this.f111928OooO00o);
            sb.append(", fd=");
            return C21023OooO0Oo.OooO0OO("]", this.f111929OooO0O0, sb);
        }
    }

    public static String[] OooO(C31332OooO0O0 c31332OooO0O0) throws IOException {
        int[] iArrOooO0o0 = OooO0o0(c31332OooO0O0);
        if (iArrOooO0o0 == null) {
            return null;
        }
        int length = iArrOooO0o0.length - 1;
        String[] strArr = new String[length];
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int i3 = iArrOooO0o0[i2] - iArrOooO0o0[i];
            if (i3 < 0) {
                StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("Negative index data length + ", i3, " at ", ": offsets[", i);
                sbOooO0O0.append(i2);
                sbOooO0O0.append("]=");
                C24472OooOoo.OooO0O0(sbOooO0O0, ", offsets[", "]=", iArrOooO0o0[i2], i);
                sbOooO0O0.append(iArrOooO0o0[i]);
                throw new IOException(sbOooO0O0.toString());
            }
            strArr[i] = new String(c31332OooO0O0.OooO0Oo(i3), C31413OooO0O0.f112169OooO00o);
            i = i2;
        }
        return strArr;
    }

    public static OooO0OO.OooO00o OooO0OO(C31332OooO0O0 c31332OooO0O0) throws IOException {
        int iOooO0o;
        Double dValueOf;
        OooO0OO.OooO00o oooO00o = new OooO0OO.OooO00o();
        while (true) {
            iOooO0o = c31332OooO0O0.OooO0o();
            if (iOooO0o >= 0 && iOooO0o <= 21) {
                oooO00o.f111911OooO0O0 = (C31330OooO) C31330OooO.f111877OooO0OO.get(iOooO0o == 12 ? new C31330OooO.OooO00o(iOooO0o, c31332OooO0O0.OooO0o()) : new C31330OooO.OooO00o(iOooO0o));
                return oooO00o;
            }
            if (iOooO0o == 28 || iOooO0o == 29) {
                oooO00o.f111910OooO00o.add(OooO0o(c31332OooO0O0, iOooO0o));
            } else if (iOooO0o == 30) {
                ArrayList arrayList = oooO00o.f111910OooO00o;
                StringBuilder sb = new StringBuilder();
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                while (!z) {
                    int iOooO0o2 = c31332OooO0O0.OooO0o();
                    int[] iArr = {iOooO0o2 / 16, iOooO0o2 % 16};
                    for (int i = 0; i < 2; i++) {
                        int i2 = iArr[i];
                        switch (i2) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                                sb.append(i2);
                                z2 = false;
                                break;
                            case 10:
                                sb.append(".");
                                break;
                            case 11:
                                if (z3) {
                                    Log.w("PdfBox-Android", "duplicate 'E' ignored after " + ((Object) sb));
                                } else {
                                    sb.append("E");
                                    z2 = true;
                                    z3 = true;
                                }
                                break;
                            case 12:
                                if (z3) {
                                    Log.w("PdfBox-Android", "duplicate 'E-' ignored after " + ((Object) sb));
                                } else {
                                    sb.append("E-");
                                    z2 = true;
                                    z3 = true;
                                }
                                break;
                            case 13:
                                break;
                            case 14:
                                sb.append(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
                                break;
                            case 15:
                                z = true;
                                break;
                            default:
                                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i2, "illegal nibble "));
                        }
                    }
                }
                if (z2) {
                    sb.append("0");
                }
                if (sb.length() == 0) {
                    dValueOf = Double.valueOf(0.0d);
                } else {
                    try {
                        dValueOf = Double.valueOf(sb.toString());
                    } catch (NumberFormatException e) {
                        throw new IOException(e);
                    }
                }
                arrayList.add(dValueOf);
            } else if (iOooO0o >= 32 && iOooO0o <= 254) {
                oooO00o.f111910OooO00o.add(OooO0o(c31332OooO0O0, iOooO0o));
            }
        }
        throw new IOException(C21532OooOOo.OooO0OO(iOooO0o, "invalid DICT data b0 byte: "));
    }

    public static byte[][] OooO0Oo(C31332OooO0O0 c31332OooO0O0) throws IOException {
        int[] iArrOooO0o0 = OooO0o0(c31332OooO0O0);
        if (iArrOooO0o0 == null) {
            return null;
        }
        int length = iArrOooO0o0.length - 1;
        byte[][] bArr = new byte[length][];
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            bArr[i] = c31332OooO0O0.OooO0Oo(iArrOooO0o0[i2] - iArrOooO0o0[i]);
            i = i2;
        }
        return bArr;
    }

    public static Integer OooO0o(C31332OooO0O0 c31332OooO0O0, int i) throws IOException {
        if (i == 28) {
            return Integer.valueOf((short) c31332OooO0O0.OooO0oO());
        }
        if (i == 29) {
            return Integer.valueOf(c31332OooO0O0.OooO0o0());
        }
        if (i >= 32 && i <= 246) {
            return Integer.valueOf(i - 139);
        }
        if (i >= 247 && i <= 250) {
            return Integer.valueOf(((i - StyleIdentifier.LIGHT_LIST_ACCENT_6) * 256) + c31332OooO0O0.OooO0o() + 108);
        }
        if (i < 251 || i > 254) {
            throw new IllegalArgumentException();
        }
        return Integer.valueOf((((-(i - StyleIdentifier.MEDIUM_LIST_1_ACCENT_6)) * 256) - c31332OooO0O0.OooO0o()) + BackupEvent.ERROR_UID_NOT_EXIST);
    }

    public static int[] OooO0o0(C31332OooO0O0 c31332OooO0O0) throws IOException {
        int iOooO0oO = c31332OooO0O0.OooO0oO();
        if (iOooO0oO == 0) {
            return null;
        }
        int iOooO0oo = c31332OooO0O0.OooO0oo();
        int[] iArr = new int[iOooO0oO + 1];
        for (int i = 0; i <= iOooO0oO; i++) {
            int iOooO0o = 0;
            for (int i2 = 0; i2 < iOooO0oo; i2++) {
                iOooO0o = (iOooO0o << 8) | c31332OooO0O0.OooO0o();
            }
            if (iOooO0o > c31332OooO0O0.f111941OooO00o.length) {
                throw new IOException(o0Oo0oo.OooO0O0(iOooO0o, "illegal offset value ", " in CFF font"));
            }
            iArr[i] = iOooO0o;
        }
        return iArr;
    }

    public static LinkedHashMap OooO0oO(OooO0OO oooO0OO) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(17);
        linkedHashMap.put("BlueValues", oooO0OO.OooO0OO("BlueValues"));
        linkedHashMap.put("OtherBlues", oooO0OO.OooO0OO("OtherBlues"));
        linkedHashMap.put("FamilyBlues", oooO0OO.OooO0OO("FamilyBlues"));
        linkedHashMap.put("FamilyOtherBlues", oooO0OO.OooO0OO("FamilyOtherBlues"));
        linkedHashMap.put("BlueScale", oooO0OO.OooO0o0("BlueScale", Double.valueOf(0.039625d)));
        linkedHashMap.put("BlueShift", oooO0OO.OooO0o0("BlueShift", 7));
        linkedHashMap.put("BlueFuzz", oooO0OO.OooO0o0("BlueFuzz", 1));
        linkedHashMap.put("StdHW", oooO0OO.OooO0o0("StdHW", null));
        linkedHashMap.put("StdVW", oooO0OO.OooO0o0("StdVW", null));
        linkedHashMap.put("StemSnapH", oooO0OO.OooO0OO("StemSnapH"));
        linkedHashMap.put("StemSnapV", oooO0OO.OooO0OO("StemSnapV"));
        linkedHashMap.put("ForceBold", oooO0OO.OooO0O0("ForceBold"));
        linkedHashMap.put("LanguageGroup", oooO0OO.OooO0o0("LanguageGroup", 0));
        linkedHashMap.put("ExpansionFactor", oooO0OO.OooO0o0("ExpansionFactor", Double.valueOf(0.06d)));
        linkedHashMap.put("initialRandomSeed", oooO0OO.OooO0o0("initialRandomSeed", 0));
        linkedHashMap.put("defaultWidthX", oooO0OO.OooO0o0("defaultWidthX", 0));
        linkedHashMap.put("nominalWidthX", oooO0OO.OooO0o0("nominalWidthX", 0));
        return linkedHashMap;
    }

    public final String OooO00o(OooO0OO oooO0OO, String str) {
        OooO0OO.OooO00o oooO00oOooO0Oo = oooO0OO.OooO0Oo(str);
        if (oooO00oOooO0Oo == null || !oooO00oOooO0Oo.OooO0O0()) {
            return null;
        }
        return OooO0oo(oooO00oOooO0Oo.OooO00o(0).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v54, types: [o000o0O0.Oooo0o0, o0oo0oO0.OooOO0$OooO] */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v58, types: [o000o0O0.Oooo0o0, o0oo0oO0.OooOO0$OooOO0O] */
    /* JADX WARN: Type inference failed for: r27v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object, o0oo0oO0.OooOO0$OooO0oo] */
    /* JADX WARN: Type inference failed for: r2v37, types: [Oooo0oo.OooO0oo] */
    /* JADX WARN: Type inference failed for: r2v53, types: [java.lang.Object, o0oo0oO0.OooOO0$OooOO0o] */
    /* JADX WARN: Type inference failed for: r47v0, types: [o0oo0oO0.OooOO0] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v11, types: [o0oo0oO0.OooO0oo] */
    /* JADX WARN: Type inference failed for: r8v12, types: [o000o0O0.Oooo0o0] */
    /* JADX WARN: Type inference failed for: r8v13, types: [o000o0O0.Oooo0o0] */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v35, types: [o0oo0oO0.OooO0oo] */
    /* JADX WARN: Type inference failed for: r8v38 */
    public final ArrayList OooO0O0(byte[] bArr, OooO00o oooO00o) throws IOException {
        int i;
        int i2;
        AbstractC31337OooO0oO c31348OooOOO0;
        String[] strArr;
        byte[][] bArr2;
        byte[][] bArr3;
        String str;
        ArrayList arrayList;
        int i3;
        ?? c31341OooO0o0;
        AbstractC31333OooO0OO abstractC31333OooO0OO;
        LinkedHashMap linkedHashMap;
        int i4;
        byte[][] bArr4;
        ?? c31343OooO0oo;
        int i5;
        int i6;
        int i7;
        ?? oooO;
        byte[][] bArr5;
        String str2;
        ArrayList arrayList2;
        Object obj;
        int i8 = 3;
        int i9 = 0;
        int i10 = 4;
        int i11 = 1;
        C31332OooO0O0 c31332OooO0O0 = new C31332OooO0O0(bArr);
        String str3 = new String(c31332OooO0O0.OooO0Oo(4), C31413OooO0O0.f112169OooO00o);
        if ("OTTO".equals(str3)) {
            short sOooO0oO = (short) c31332OooO0O0.OooO0oO();
            c31332OooO0O0.OooO0oO();
            c31332OooO0O0.OooO0oO();
            c31332OooO0O0.OooO0oO();
            for (int i12 = 0; i12 < sOooO0oO; i12++) {
                String str4 = new String(c31332OooO0O0.OooO0Oo(4), C31413OooO0O0.f112169OooO00o);
                c31332OooO0O0.OooO0oO();
                c31332OooO0O0.OooO0oO();
                long jOooO0oO = (c31332OooO0O0.OooO0oO() << 16) | c31332OooO0O0.OooO0oO();
                i = 5;
                long jOooO0oO2 = (c31332OooO0O0.OooO0oO() << 16) | c31332OooO0O0.OooO0oO();
                if ("CFF ".equals(str4)) {
                    c31332OooO0O0 = new C31332OooO0O0(Arrays.copyOfRange(bArr, (int) jOooO0oO, (int) (jOooO0oO + jOooO0oO2)));
                }
            }
            throw new IOException("CFF tag not found in this OpenType font.");
        }
        i = 5;
        if ("ttcf".equals(str3)) {
            throw new IOException("True Type Collection fonts are not supported.");
        }
        if ("\u0000\u0001\u0000\u0000".equals(str3)) {
            throw new IOException("OpenType fonts containing a true type font are not supported.");
        }
        c31332OooO0O0.f111942OooO0O0 = 0;
        c31332OooO0O0.OooO0o();
        c31332OooO0O0.OooO0o();
        c31332OooO0O0.OooO0o();
        c31332OooO0O0.OooO0oo();
        String[] strArrOooO = OooO(c31332OooO0O0);
        if (strArrOooO == null) {
            throw new IOException("Name index missing in CFF font");
        }
        byte[][] bArrOooO0Oo = OooO0Oo(c31332OooO0O0);
        this.f111902OooO00o = OooO(c31332OooO0O0);
        byte[][] bArrOooO0Oo2 = OooO0Oo(c31332OooO0O0);
        ArrayList arrayList3 = new ArrayList(strArrOooO.length);
        int i13 = 0;
        while (i13 < strArrOooO.length) {
            String str5 = strArrOooO[i13];
            C31332OooO0O0 c31332OooO0O02 = new C31332OooO0O0(bArrOooO0Oo[i13]);
            OooO0OO oooO0OO = new OooO0OO();
            while (true) {
                i2 = i10;
                if (c31332OooO0O02.f111942OooO0O0 >= c31332OooO0O02.f111941OooO00o.length) {
                    break;
                }
                OooO0OO.OooO00o oooO00oOooO0OO = OooO0OO(c31332OooO0O02);
                C31330OooO c31330OooO = oooO00oOooO0OO.f111911OooO0O0;
                if (c31330OooO != null) {
                    oooO0OO.f111909OooO00o.put(c31330OooO.f111880OooO0O0, oooO00oOooO0OO);
                }
                i10 = i2;
            }
            if (oooO0OO.OooO0Oo("SyntheticBase") != null) {
                throw new IOException("Synthetic Fonts are not supported");
            }
            ?? r7 = oooO0OO.OooO0Oo("ROS") != null ? i11 : i9;
            if (r7 != 0) {
                C31331OooO00o c31331OooO00o = new C31331OooO00o();
                OooO0OO.OooO00o oooO00oOooO0Oo = oooO0OO.OooO0Oo("ROS");
                if (oooO00oOooO0Oo == null || oooO00oOooO0Oo.f111910OooO00o.size() < i8) {
                    throw new IOException("ROS entry must have 3 elements");
                }
                c31331OooO00o.f111883OooOoo0 = OooO0oo(oooO00oOooO0Oo.OooO00o(i9).intValue());
                c31331OooO00o.f111882OooOoo = OooO0oo(oooO00oOooO0Oo.OooO00o(i11).intValue());
                c31331OooO00o.f111884OooOooO = oooO00oOooO0Oo.OooO00o(2).intValue();
                c31348OooOOO0 = c31331OooO00o;
            } else {
                c31348OooOOO0 = new C31348OooOOO0();
            }
            this.f111903OooO0O0 = str5;
            c31348OooOOO0.f111896OooOo0o = str5;
            c31348OooOOO0.OooO0Oo(OooO00o(oooO0OO, "version"), "version");
            c31348OooOOO0.OooO0Oo(OooO00o(oooO0OO, "Notice"), "Notice");
            c31348OooOOO0.OooO0Oo(OooO00o(oooO0OO, "Copyright"), "Copyright");
            c31348OooOOO0.OooO0Oo(OooO00o(oooO0OO, "FullName"), "FullName");
            c31348OooOOO0.OooO0Oo(OooO00o(oooO0OO, "FamilyName"), "FamilyName");
            c31348OooOOO0.OooO0Oo(OooO00o(oooO0OO, "Weight"), "Weight");
            c31348OooOOO0.OooO0Oo(oooO0OO.OooO0O0("isFixedPitch"), "isFixedPitch");
            c31348OooOOO0.OooO0Oo(oooO0OO.OooO0o0("ItalicAngle", Integer.valueOf(i9)), "ItalicAngle");
            c31348OooOOO0.OooO0Oo(oooO0OO.OooO0o0("UnderlinePosition", -100), "UnderlinePosition");
            c31348OooOOO0.OooO0Oo(oooO0OO.OooO0o0("UnderlineThickness", 50), "UnderlineThickness");
            c31348OooOOO0.OooO0Oo(oooO0OO.OooO0o0("PaintType", Integer.valueOf(i9)), "PaintType");
            c31348OooOOO0.OooO0Oo(oooO0OO.OooO0o0("CharstringType", 2), "CharstringType");
            Double dValueOf = Double.valueOf(0.001d);
            Double dValueOf2 = Double.valueOf(0.0d);
            Double dValueOf3 = Double.valueOf(0.0d);
            Double dValueOf4 = Double.valueOf(0.001d);
            Double dValueOf5 = Double.valueOf(0.0d);
            Double dValueOf6 = Double.valueOf(0.0d);
            int i14 = i8;
            ?? r27 = i11;
            Number[] numberArr = new Number[6];
            numberArr[i9] = dValueOf;
            numberArr[r27 == true ? 1 : 0] = dValueOf2;
            numberArr[2] = dValueOf3;
            numberArr[i14] = dValueOf4;
            numberArr[i2] = dValueOf5;
            numberArr[i] = dValueOf6;
            String str6 = "FontMatrix";
            c31348OooOOO0.OooO0Oo(oooO0OO.OooO00o("FontMatrix", Arrays.asList(numberArr)), "FontMatrix");
            c31348OooOOO0.OooO0Oo(oooO0OO.OooO0o0("UniqueID", null), "UniqueID");
            Integer numValueOf = Integer.valueOf(i9);
            Integer numValueOf2 = Integer.valueOf(i9);
            Integer numValueOf3 = Integer.valueOf(i9);
            Integer numValueOf4 = Integer.valueOf(i9);
            int i15 = i9;
            Number[] numberArr2 = new Number[i2];
            numberArr2[i15] = numValueOf;
            numberArr2[r27 == true ? 1 : 0] = numValueOf2;
            numberArr2[2] = numValueOf3;
            numberArr2[i14] = numValueOf4;
            String str7 = "FontBBox";
            c31348OooOOO0.OooO0Oo(oooO0OO.OooO00o("FontBBox", Arrays.asList(numberArr2)), "FontBBox");
            c31348OooOOO0.OooO0Oo(oooO0OO.OooO0o0("StrokeWidth", Integer.valueOf(i15)), "StrokeWidth");
            c31348OooOOO0.OooO0Oo(oooO0OO.OooO00o("XUID", null), "XUID");
            OooO0OO.OooO00o oooO00oOooO0Oo2 = oooO0OO.OooO0Oo("CharStrings");
            if (oooO00oOooO0Oo2 == null || !oooO00oOooO0Oo2.OooO0O0()) {
                throw new IOException("CharStrings is missing or empty");
            }
            c31332OooO0O0.f111942OooO0O0 = oooO00oOooO0Oo2.OooO00o(i15).intValue();
            byte[][] bArrOooO0Oo3 = OooO0Oo(c31332OooO0O0);
            OooO0OO.OooO00o oooO00oOooO0Oo3 = oooO0OO.OooO0Oo("charset");
            if (oooO00oOooO0Oo3 == null || !oooO00oOooO0Oo3.OooO0O0()) {
                strArr = strArrOooO;
                bArr2 = bArrOooO0Oo;
                bArr3 = bArrOooO0Oo2;
                str = "FontMatrix";
                arrayList = arrayList3;
                i3 = i13;
                if (r7 != 0) {
                    int length = bArrOooO0Oo3.length;
                    c31341OooO0o0 = new C31341OooO0o0(r27);
                    c31341OooO0o0.OooO00o(0, 0);
                    for (int i16 = r27 == true ? 1 : 0; i16 <= length; i16 += r27 == true ? 1 : 0) {
                        c31341OooO0o0.OooO00o(i16, i16);
                    }
                } else {
                    c31341OooO0o0 = C31338OooO0oo.f111901OooO0oo;
                }
            } else {
                int iIntValue = oooO00oOooO0Oo3.OooO00o(0).intValue();
                if (r7 == 0 && iIntValue == 0) {
                    c31341OooO0o0 = C31338OooO0oo.f111901OooO0oo;
                    strArr = strArrOooO;
                    bArr2 = bArrOooO0Oo;
                    bArr3 = bArrOooO0Oo2;
                    str = "FontMatrix";
                    arrayList = arrayList3;
                    i3 = i13;
                } else {
                    if (r7 == 0 && iIntValue == r27) {
                        obj = C31334OooO0Oo.f111891OooO0oo;
                    } else if (r7 == 0 && iIntValue == 2) {
                        obj = C31335OooO0o.f111893OooO0oo;
                    } else {
                        c31332OooO0O0.f111942OooO0O0 = iIntValue;
                        int length2 = bArrOooO0Oo3.length;
                        int iOooO0o = c31332OooO0O0.OooO0o();
                        if (iOooO0o != 0) {
                            strArr = strArrOooO;
                            if (iOooO0o == 1) {
                                bArr2 = bArrOooO0Oo;
                                bArr3 = bArrOooO0Oo2;
                                str = "FontMatrix";
                                arrayList = arrayList3;
                                i3 = i13;
                                oooO = new OooO(r7);
                                oooO.f111904OooO0oO = iOooO0o;
                                if (r7 != 0) {
                                    oooO.OooO00o(0, 0);
                                    oooO.f111905OooO0oo = new ArrayList();
                                } else {
                                    oooO.OooO0O0(0, 0, ".notdef");
                                }
                                int i17 = 1;
                                while (i17 < length2) {
                                    int iOooO0oO = c31332OooO0O0.OooO0oO();
                                    int iOooO0o2 = c31332OooO0O0.OooO0o();
                                    if (r7 == 0) {
                                        for (int i18 = 0; i18 < iOooO0o2 + 1; i18++) {
                                            int i19 = iOooO0oO + i18;
                                            oooO.OooO0O0(i17 + i18, i19, OooO0oo(i19));
                                        }
                                    } else {
                                        oooO.f111905OooO0oo.add(new OooOOO(i17, iOooO0oO, iOooO0o2));
                                    }
                                    i17 = i17 + iOooO0o2 + 1;
                                }
                            } else {
                                if (iOooO0o != 2) {
                                    throw new IllegalArgumentException();
                                }
                                oooO = new OooOO0O(r7);
                                oooO.f111918OooO0oO = iOooO0o;
                                if (r7 != 0) {
                                    oooO.OooO00o(0, 0);
                                    oooO.f111919OooO0oo = new ArrayList();
                                } else {
                                    oooO.OooO0O0(0, 0, ".notdef");
                                }
                                int i20 = 1;
                                while (i20 < length2) {
                                    byte[][] bArr6 = bArrOooO0Oo;
                                    int iOooO0oO2 = c31332OooO0O0.OooO0oO();
                                    int i21 = i13;
                                    int iOooO0oO3 = c31332OooO0O0.OooO0oO();
                                    if (r7 == 0) {
                                        bArr5 = bArrOooO0Oo2;
                                        arrayList2 = arrayList3;
                                        int i22 = 0;
                                        while (i22 < iOooO0oO3 + 1) {
                                            int i23 = iOooO0oO2 + i22;
                                            int i24 = i22;
                                            oooO.OooO0O0(i20 + i24, i23, OooO0oo(i23));
                                            i22 = i24 + 1;
                                            str6 = str6;
                                        }
                                        str2 = str6;
                                    } else {
                                        bArr5 = bArrOooO0Oo2;
                                        str2 = str6;
                                        arrayList2 = arrayList3;
                                        oooO.f111919OooO0oo.add(new OooOOO(i20, iOooO0oO2, iOooO0oO3));
                                    }
                                    i20 = i20 + iOooO0oO3 + 1;
                                    bArrOooO0Oo = bArr6;
                                    i13 = i21;
                                    arrayList3 = arrayList2;
                                    bArrOooO0Oo2 = bArr5;
                                    str6 = str2;
                                }
                                bArr2 = bArrOooO0Oo;
                                bArr3 = bArrOooO0Oo2;
                                str = str6;
                                arrayList = arrayList3;
                                i3 = i13;
                            }
                            c31341OooO0o0 = oooO;
                        } else {
                            strArr = strArrOooO;
                            bArr2 = bArrOooO0Oo;
                            bArr3 = bArrOooO0Oo2;
                            str = "FontMatrix";
                            arrayList = arrayList3;
                            i3 = i13;
                            OooO0o oooO0o = new OooO0o(r7);
                            oooO0o.f111912OooO0oO = iOooO0o;
                            if (r7 != 0) {
                                oooO0o.OooO00o(0, 0);
                            } else {
                                oooO0o.OooO0O0(0, 0, ".notdef");
                            }
                            for (int i25 = 1; i25 < length2; i25++) {
                                int iOooO0oO4 = c31332OooO0O0.OooO0oO();
                                if (r7 != 0) {
                                    oooO0o.OooO00o(i25, iOooO0oO4);
                                } else {
                                    oooO0o.OooO0O0(i25, iOooO0oO4, OooO0oo(iOooO0oO4));
                                }
                            }
                            c31341OooO0o0 = oooO0o;
                        }
                    }
                    strArr = strArrOooO;
                    bArr2 = bArrOooO0Oo;
                    bArr3 = bArrOooO0Oo2;
                    str = "FontMatrix";
                    arrayList = arrayList3;
                    i3 = i13;
                    c31341OooO0o0 = obj;
                }
            }
            c31348OooOOO0.f111898OooOoO0 = c31341OooO0o0;
            c31348OooOOO0.f111897OooOoO = bArrOooO0Oo3;
            if (r7 != 0) {
                C31331OooO00o c31331OooO00o2 = (C31331OooO00o) c31348OooOOO0;
                int length3 = bArrOooO0Oo3.length;
                OooO0OO.OooO00o oooO00oOooO0Oo4 = oooO0OO.OooO0Oo("FDArray");
                if (oooO00oOooO0Oo4 == null || !oooO00oOooO0Oo4.OooO0O0()) {
                    throw new IOException("FDArray is missing for a CIDKeyed Font.");
                }
                c31332OooO0O0.f111942OooO0O0 = oooO00oOooO0Oo4.OooO00o(0).intValue();
                byte[][] bArrOooO0Oo4 = OooO0Oo(c31332OooO0O0);
                if (bArrOooO0Oo4 == null) {
                    throw new IOException("Font dict index is missing for a CIDKeyed Font");
                }
                LinkedList linkedList = new LinkedList();
                LinkedList linkedList2 = new LinkedList();
                int length4 = bArrOooO0Oo4.length;
                int i26 = 0;
                while (i26 < length4) {
                    C31332OooO0O0 c31332OooO0O03 = new C31332OooO0O0(bArrOooO0Oo4[i26]);
                    OooO0OO oooO0OO2 = new OooO0OO();
                    byte[][] bArr7 = bArrOooO0Oo4;
                    while (true) {
                        i5 = length4;
                        if (c31332OooO0O03.f111942OooO0O0 >= c31332OooO0O03.f111941OooO00o.length) {
                            break;
                        }
                        OooO0OO.OooO00o oooO00oOooO0OO2 = OooO0OO(c31332OooO0O03);
                        C31330OooO c31330OooO2 = oooO00oOooO0OO2.f111911OooO0O0;
                        if (c31330OooO2 != null) {
                            i7 = i26;
                            oooO0OO2.f111909OooO00o.put(c31330OooO2.f111880OooO0O0, oooO00oOooO0OO2);
                        } else {
                            i7 = i26;
                        }
                        length4 = i5;
                        i26 = i7;
                    }
                    int i27 = i26;
                    OooO0OO.OooO00o oooO00oOooO0Oo5 = oooO0OO2.OooO0Oo("Private");
                    if (oooO00oOooO0Oo5 == null || oooO00oOooO0Oo5.f111910OooO00o.size() < 2) {
                        throw new IOException("Font DICT invalid without \"Private\" entry");
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(4);
                    linkedHashMap2.put("FontName", OooO00o(oooO0OO2, "FontName"));
                    linkedHashMap2.put("FontType", oooO0OO2.OooO0o0("FontType", 0));
                    linkedHashMap2.put(str7, oooO0OO2.OooO00o(str7, null));
                    String str8 = str;
                    linkedHashMap2.put(str8, oooO0OO2.OooO00o(str8, null));
                    linkedList2.add(linkedHashMap2);
                    int iIntValue2 = oooO00oOooO0Oo5.OooO00o(1).intValue();
                    c31332OooO0O0.f111942OooO0O0 = iIntValue2;
                    int iIntValue3 = oooO00oOooO0Oo5.OooO00o(0).intValue();
                    OooO0OO oooO0OO3 = new OooO0OO();
                    int i28 = c31332OooO0O0.f111942OooO0O0 + iIntValue3;
                    while (c31332OooO0O0.f111942OooO0O0 < i28) {
                        OooO0OO.OooO00o oooO00oOooO0OO3 = OooO0OO(c31332OooO0O0);
                        String str9 = str7;
                        C31330OooO c31330OooO3 = oooO00oOooO0OO3.f111911OooO0O0;
                        if (c31330OooO3 != null) {
                            i6 = iIntValue2;
                            oooO0OO3.f111909OooO00o.put(c31330OooO3.f111880OooO0O0, oooO00oOooO0OO3);
                        } else {
                            i6 = iIntValue2;
                        }
                        str7 = str9;
                        iIntValue2 = i6;
                    }
                    String str10 = str7;
                    int i29 = iIntValue2;
                    LinkedHashMap linkedHashMapOooO0oO = OooO0oO(oooO0OO3);
                    linkedList.add(linkedHashMapOooO0oO);
                    Number numberOooO0o0 = oooO0OO3.OooO0o0("Subrs", 0);
                    if (numberOooO0o0 instanceof Integer) {
                        Integer num = (Integer) numberOooO0o0;
                        if (num.intValue() > 0) {
                            c31332OooO0O0.f111942OooO0O0 = num.intValue() + i29;
                            linkedHashMapOooO0oO.put("Subrs", OooO0Oo(c31332OooO0O0));
                        }
                    }
                    i26 = i27 + 1;
                    bArrOooO0Oo4 = bArr7;
                    str7 = str10;
                    length4 = i5;
                    str = str8;
                }
                String str11 = str;
                OooO0OO.OooO00o oooO00oOooO0Oo6 = oooO0OO.OooO0Oo("FDSelect");
                if (oooO00oOooO0Oo6 == null || !oooO00oOooO0Oo6.OooO0O0()) {
                    throw new IOException("FDSelect is missing or empty");
                }
                c31332OooO0O0.f111942OooO0O0 = oooO00oOooO0Oo6.OooO00o(0).intValue();
                int iOooO0o3 = c31332OooO0O0.OooO0o();
                if (iOooO0o3 == 0) {
                    c31343OooO0oo = new C31343OooO0oo();
                    c31343OooO0oo.f111915OooO00o = new int[length3];
                    int i30 = 0;
                    while (true) {
                        int[] iArr = c31343OooO0oo.f111915OooO00o;
                        if (i30 >= iArr.length) {
                            break;
                        }
                        iArr[i30] = c31332OooO0O0.OooO0o();
                        i30++;
                    }
                } else {
                    if (iOooO0o3 != i14) {
                        throw new IllegalArgumentException();
                    }
                    c31343OooO0oo = new C31344OooOO0o();
                    c31343OooO0oo.f111920OooO00o = iOooO0o3;
                    int iOooO0oO5 = c31332OooO0O0.OooO0oO();
                    c31343OooO0oo.f111921OooO0O0 = iOooO0oO5;
                    c31343OooO0oo.f111922OooO0OO = new OooOOO0[iOooO0oO5];
                    for (int i31 = 0; i31 < c31343OooO0oo.f111921OooO0O0; i31++) {
                        OooOOO0 oooOOO0 = new OooOOO0();
                        oooOOO0.f111928OooO00o = c31332OooO0O0.OooO0oO();
                        oooOOO0.f111929OooO0O0 = c31332OooO0O0.OooO0o();
                        c31343OooO0oo.f111922OooO0OO[i31] = oooOOO0;
                    }
                    c31343OooO0oo.f111923OooO0Oo = c31332OooO0O0.OooO0oO();
                }
                c31331OooO00o2.f111885OooOooo = linkedList;
                c31331OooO00o2.f111886Oooo000 = c31343OooO0oo;
                List list = (linkedList2.isEmpty() || !((Map) linkedList2.get(0)).containsKey(str11)) ? null : (List) ((Map) linkedList2.get(0)).get(str11);
                List<Number> listOooO00o = oooO0OO.OooO00o(str11, null);
                if (listOooO00o == null) {
                    if (list != null) {
                        c31348OooOOO0.OooO0Oo(list, str11);
                    } else {
                        Double dValueOf7 = Double.valueOf(0.001d);
                        Double dValueOf8 = Double.valueOf(0.0d);
                        Double dValueOf9 = Double.valueOf(0.0d);
                        Double dValueOf10 = Double.valueOf(0.001d);
                        Double dValueOf11 = Double.valueOf(0.0d);
                        Double dValueOf12 = Double.valueOf(0.0d);
                        Number[] numberArr3 = new Number[6];
                        numberArr3[0] = dValueOf7;
                        numberArr3[1] = dValueOf8;
                        numberArr3[2] = dValueOf9;
                        numberArr3[3] = dValueOf10;
                        numberArr3[4] = dValueOf11;
                        numberArr3[i] = dValueOf12;
                        c31348OooOOO0.OooO0Oo(oooO0OO.OooO00o(str11, Arrays.asList(numberArr3)), str11);
                        i4 = 0;
                        bArr4 = bArr3;
                        c31348OooOOO0.f111899OooOoOO = bArr4;
                        ArrayList arrayList4 = arrayList;
                        arrayList4.add(c31348OooOOO0);
                        i13 = i3 + 1;
                        bArrOooO0Oo2 = bArr4;
                        arrayList3 = arrayList4;
                        strArrOooO = strArr;
                        i9 = i4;
                        bArrOooO0Oo = bArr2;
                        i11 = 1;
                        i8 = 3;
                        i10 = 4;
                        i = 5;
                    }
                } else if (list != null) {
                    double dDoubleValue = listOooO00o.get(0).doubleValue();
                    double dDoubleValue2 = listOooO00o.get(1).doubleValue();
                    double dDoubleValue3 = listOooO00o.get(2).doubleValue();
                    double dDoubleValue4 = listOooO00o.get(3).doubleValue();
                    double dDoubleValue5 = listOooO00o.get(4).doubleValue();
                    double dDoubleValue6 = listOooO00o.get(i).doubleValue();
                    double dDoubleValue7 = ((Number) list.get(0)).doubleValue();
                    double dDoubleValue8 = ((Number) list.get(1)).doubleValue();
                    double dDoubleValue9 = ((Number) list.get(2)).doubleValue();
                    double dDoubleValue10 = ((Number) list.get(3)).doubleValue();
                    double dDoubleValue11 = ((Number) list.get(4)).doubleValue();
                    double dDoubleValue12 = ((Number) list.get(5)).doubleValue();
                    listOooO00o.set(0, Double.valueOf((dDoubleValue2 * dDoubleValue9) + (dDoubleValue * dDoubleValue7)));
                    listOooO00o.set(1, Double.valueOf((dDoubleValue2 * dDoubleValue4) + (dDoubleValue * dDoubleValue8)));
                    listOooO00o.set(2, Double.valueOf((dDoubleValue4 * dDoubleValue9) + (dDoubleValue3 * dDoubleValue7)));
                    listOooO00o.set(3, Double.valueOf((dDoubleValue4 * dDoubleValue10) + (dDoubleValue3 * dDoubleValue8)));
                    listOooO00o.set(4, Double.valueOf(o000oOoO.OooO00o(dDoubleValue6, dDoubleValue9, dDoubleValue5 * dDoubleValue7, dDoubleValue11)));
                    listOooO00o.set(5, Double.valueOf(o000oOoO.OooO00o(dDoubleValue6, dDoubleValue10, dDoubleValue5 * dDoubleValue8, dDoubleValue12)));
                } else {
                    i4 = 0;
                }
                bArr4 = bArr3;
                i4 = 0;
                c31348OooOOO0.f111899OooOoOO = bArr4;
                ArrayList arrayList42 = arrayList;
                arrayList42.add(c31348OooOOO0);
                i13 = i3 + 1;
                bArrOooO0Oo2 = bArr4;
                arrayList3 = arrayList42;
                strArrOooO = strArr;
                i9 = i4;
                bArrOooO0Oo = bArr2;
                i11 = 1;
                i8 = 3;
                i10 = 4;
                i = 5;
            } else {
                C31348OooOOO0 c31348OooOOO02 = (C31348OooOOO0) c31348OooOOO0;
                OooO0OO.OooO00o oooO00oOooO0Oo7 = oooO0OO.OooO0Oo("Encoding");
                int iIntValue4 = (oooO00oOooO0Oo7 == null || !oooO00oOooO0Oo7.OooO0O0()) ? 0 : oooO00oOooO0Oo7.OooO00o(0).intValue();
                if (iIntValue4 == 0) {
                    abstractC31333OooO0OO = C31345OooOO0O.f111930OooO0Oo;
                } else if (iIntValue4 != 1) {
                    c31332OooO0O0.f111942OooO0O0 = iIntValue4;
                    int iOooO0o4 = c31332OooO0O0.OooO0o();
                    int i32 = iOooO0o4 & 127;
                    if (i32 == 0) {
                        C31342OooO0oO c31342OooO0oO = new C31342OooO0oO(1);
                        c31342OooO0oO.f111914OooO0o0 = iOooO0o4;
                        c31342OooO0oO.f111913OooO0o = c31332OooO0O0.OooO0o();
                        c31342OooO0oO.OooO00o(0, ".notdef");
                        for (int i33 = 1; i33 <= c31342OooO0oO.f111913OooO0o; i33++) {
                            c31342OooO0oO.OooO00o(c31332OooO0O0.OooO0o(), OooO0oo(c31341OooO0o0.OooO0o(i33)));
                        }
                        abstractC31333OooO0OO = c31342OooO0oO;
                        if ((iOooO0o4 & 128) != 0) {
                            OooOO0(c31332OooO0O0, c31342OooO0oO);
                            abstractC31333OooO0OO = c31342OooO0oO;
                        }
                    } else {
                        if (i32 != 1) {
                            throw new IllegalArgumentException();
                        }
                        C20172OooOO0 c20172OooOO0 = new C20172OooOO0(1);
                        c20172OooOO0.f111917OooO0o0 = iOooO0o4;
                        c20172OooOO0.f111916OooO0o = c31332OooO0O0.OooO0o();
                        c20172OooOO0.OooO00o(0, ".notdef");
                        int i34 = 1;
                        for (int i35 = 0; i35 < c20172OooOO0.f111916OooO0o; i35++) {
                            int iOooO0o5 = c31332OooO0O0.OooO0o();
                            int iOooO0o6 = c31332OooO0O0.OooO0o();
                            int i36 = 0;
                            while (i36 <= iOooO0o6) {
                                int i37 = iOooO0o5;
                                c20172OooOO0.OooO00o(i37 + i36, OooO0oo(c31341OooO0o0.OooO0o(i34)));
                                i34++;
                                i36++;
                                iOooO0o5 = i37;
                            }
                        }
                        abstractC31333OooO0OO = c20172OooOO0;
                        if ((iOooO0o4 & 128) != 0) {
                            OooOO0(c31332OooO0O0, c20172OooOO0);
                            abstractC31333OooO0OO = c20172OooOO0;
                        }
                    }
                } else {
                    abstractC31333OooO0OO = C31336OooO0o0.f111894OooO0Oo;
                }
                c31348OooOOO02.f111932OooOoo = abstractC31333OooO0OO;
                OooO0OO.OooO00o oooO00oOooO0Oo8 = oooO0OO.OooO0Oo("Private");
                if (oooO00oOooO0Oo8 == null || oooO00oOooO0Oo8.f111910OooO00o.size() < 2) {
                    throw new IOException("Private dictionary entry missing for font " + c31348OooOOO02.f111896OooOo0o);
                }
                int iIntValue5 = oooO00oOooO0Oo8.OooO00o(1).intValue();
                c31332OooO0O0.f111942OooO0O0 = iIntValue5;
                int iIntValue6 = oooO00oOooO0Oo8.OooO00o(0).intValue();
                OooO0OO oooO0OO4 = new OooO0OO();
                int i38 = c31332OooO0O0.f111942OooO0O0 + iIntValue6;
                while (c31332OooO0O0.f111942OooO0O0 < i38) {
                    OooO0OO.OooO00o oooO00oOooO0OO4 = OooO0OO(c31332OooO0O0);
                    C31330OooO c31330OooO4 = oooO00oOooO0OO4.f111911OooO0O0;
                    if (c31330OooO4 != null) {
                        oooO0OO4.f111909OooO00o.put(c31330OooO4.f111880OooO0O0, oooO00oOooO0OO4);
                    }
                }
                Iterator it = OooO0oO(oooO0OO4).entrySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    linkedHashMap = c31348OooOOO02.f111933OooOoo0;
                    if (!zHasNext) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    String str12 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        linkedHashMap.put(str12, value);
                    }
                }
                i4 = 0;
                Number numberOooO0o02 = oooO0OO4.OooO0o0("Subrs", 0);
                if (numberOooO0o02 instanceof Integer) {
                    Integer num2 = (Integer) numberOooO0o02;
                    if (num2.intValue() > 0) {
                        c31332OooO0O0.f111942OooO0O0 = num2.intValue() + iIntValue5;
                        byte[][] bArrOooO0Oo5 = OooO0Oo(c31332OooO0O0);
                        if (bArrOooO0Oo5 != null) {
                            linkedHashMap.put("Subrs", bArrOooO0Oo5);
                        }
                    }
                }
            }
            bArr4 = bArr3;
            c31348OooOOO0.f111899OooOoOO = bArr4;
            ArrayList arrayList422 = arrayList;
            arrayList422.add(c31348OooOOO0);
            i13 = i3 + 1;
            bArrOooO0Oo2 = bArr4;
            arrayList3 = arrayList422;
            strArrOooO = strArr;
            i9 = i4;
            bArrOooO0Oo = bArr2;
            i11 = 1;
            i8 = 3;
            i10 = 4;
            i = 5;
        }
        return arrayList3;
    }

    public final String OooO0oo(int i) {
        if (i >= 0 && i <= 390) {
            return C31346OooOO0o.f111931OooO00o[i];
        }
        int i2 = i - 391;
        String[] strArr = this.f111902OooO00o;
        return i2 < strArr.length ? strArr[i2] : C21532OooOOo.OooO0OO(i, "SID");
    }

    public final void OooOO0(C31332OooO0O0 c31332OooO0O0, OooO0O0 oooO0O0) throws IOException {
        oooO0O0.f111906OooO0Oo = new OooO0O0.OooO00o[c31332OooO0O0.OooO0o()];
        for (int i = 0; i < oooO0O0.f111906OooO0Oo.length; i++) {
            OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o();
            oooO00o.f111907OooO00o = c31332OooO0O0.OooO0o();
            int iOooO0oO = c31332OooO0O0.OooO0oO();
            oooO00o.f111908OooO0O0 = iOooO0oO;
            OooO0oo(iOooO0oO);
            oooO0O0.f111906OooO0Oo[i] = oooO00o;
            oooO0O0.OooO00o(oooO00o.f111907OooO00o, OooO0oo(oooO00o.f111908OooO0O0));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C31339OooOO0.class.getSimpleName());
        sb.append("[");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f111903OooO0O0, "]");
    }
}
