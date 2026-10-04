package OoooOOo;

import com.aspose.words.StyleIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32484OooO0oo;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0O.AbstractC33570OooOO0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: OoooOOo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21196OooOO0 implements Iterable<Integer>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final C21196OooOO0 f61478OooOoOO = new C21196OooOO0(0, 0, 0, null);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final long f61479OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final long f61480OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int[] f61481OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f61482OooOoO0;

    /* JADX INFO: renamed from: OoooOOo.OooOO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", m80623f = "SnapshotIdSet.kt", m80624l = {StyleIdentifier.GRID_TABLE_2_ACCENT_3, 300, 307}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32484OooO0oo implements InterfaceC32508OooOOOo<AbstractC33570OooOO0<? super Integer>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f61483OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int[] f61484OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f61485OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f61486OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public /* synthetic */ Object f61487OooOoOO;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = C21196OooOO0.this.new OooO00o(continuation);
            oooO00o.f61487OooOoOO = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(AbstractC33570OooOO0<? super Integer> abstractC33570OooOO0, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(abstractC33570OooOO0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0084 -> B:26:0x009a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00aa -> B:36:0x00c1). Please report as a decompilation issue!!! */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long j;
            AbstractC33570OooOO0 abstractC33570OooOO0;
            int[] iArr;
            int length;
            int i;
            AbstractC33570OooOO0 abstractC33570OooOO02;
            int i2;
            AbstractC33570OooOO0 abstractC33570OooOO03;
            int i3;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i4 = this.f61485OooOoO;
            C21196OooOO0 c21196OooOO0 = C21196OooOO0.this;
            long j2 = c21196OooOO0.f61480OooOo0o;
            int i5 = c21196OooOO0.f61482OooOoO0;
            long j3 = c21196OooOO0.f61479OooOo;
            if (i4 == 0) {
                j = 0;
                C32446OooOOOo.OooO0O0(obj);
                abstractC33570OooOO0 = (AbstractC33570OooOO0) this.f61487OooOoOO;
                iArr = c21196OooOO0.f61481OooOoO;
                if (iArr != null) {
                    length = iArr.length;
                    i = 0;
                }
                if (j3 != j) {
                    abstractC33570OooOO02 = abstractC33570OooOO0;
                    i2 = 0;
                    if (i2 >= 64) {
                    }
                }
                if (j2 != j) {
                }
                return C32460OooOooO.f116667OooO00o;
            }
            if (i4 == 1) {
                length = this.f61486OooOoO0;
                int i6 = this.f61483OooOo;
                j = 0;
                iArr = this.f61484OooOo0o;
                abstractC33570OooOO0 = (AbstractC33570OooOO0) this.f61487OooOoOO;
                C32446OooOOOo.OooO0O0(obj);
                i = i6 + 1;
            } else {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = this.f61483OooOo;
                    abstractC33570OooOO03 = (AbstractC33570OooOO0) this.f61487OooOoOO;
                    C32446OooOOOo.OooO0O0(obj);
                    j = 0;
                    i3++;
                    if (i3 < 64) {
                        if (((1 << i3) & j2) != j) {
                            Integer num = new Integer(64 + i3 + i5);
                            this.f61487OooOoOO = abstractC33570OooOO03;
                            this.f61484OooOo0o = null;
                            this.f61483OooOo = i3;
                            this.f61485OooOoO = 3;
                            abstractC33570OooOO03.OooO00o(num, this);
                            EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
                            return enumC32485OooO00o;
                        }
                        i3++;
                        if (i3 < 64) {
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                i2 = this.f61483OooOo;
                abstractC33570OooOO02 = (AbstractC33570OooOO0) this.f61487OooOoOO;
                C32446OooOOOo.OooO0O0(obj);
                j = 0;
                i2++;
                if (i2 >= 64) {
                    abstractC33570OooOO0 = abstractC33570OooOO02;
                    if (j2 != j) {
                        abstractC33570OooOO03 = abstractC33570OooOO0;
                        i3 = 0;
                        if (i3 < 64) {
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                if (((1 << i2) & j3) != j) {
                    Integer num2 = new Integer(i5 + i2);
                    this.f61487OooOoOO = abstractC33570OooOO02;
                    this.f61484OooOo0o = null;
                    this.f61483OooOo = i2;
                    this.f61485OooOoO = 2;
                    abstractC33570OooOO02.OooO00o(num2, this);
                    EnumC32485OooO00o enumC32485OooO00o3 = EnumC32485OooO00o.f116726OooOo0o;
                    return enumC32485OooO00o;
                }
                i2++;
                if (i2 >= 64) {
                }
            }
            if (i < length) {
                Integer num3 = new Integer(iArr[i]);
                this.f61487OooOoOO = abstractC33570OooOO0;
                this.f61484OooOo0o = iArr;
                this.f61483OooOo = i;
                this.f61486OooOoO0 = length;
                this.f61485OooOoO = 1;
                abstractC33570OooOO0.OooO00o(num3, this);
                return enumC32485OooO00o;
            }
            if (j3 != j) {
            }
            if (j2 != j) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C21196OooOO0(long j, long j2, int i, int[] iArr) {
        this.f61480OooOo0o = j;
        this.f61479OooOo = j2;
        this.f61482OooOoO0 = i;
        this.f61481OooOoO = iArr;
    }

    public final C21196OooOO0 OooO0O0(C21196OooOO0 c21196OooOO0) {
        C21196OooOO0 c21196OooOO0OooO0Oo;
        int[] iArr;
        C21196OooOO0 c21196OooOO02 = f61478OooOoOO;
        if (c21196OooOO0 == c21196OooOO02) {
            return this;
        }
        if (this == c21196OooOO02) {
            return c21196OooOO02;
        }
        int i = c21196OooOO0.f61482OooOoO0;
        int[] iArr2 = c21196OooOO0.f61481OooOoO;
        long j = c21196OooOO0.f61479OooOo;
        long j2 = c21196OooOO0.f61480OooOo0o;
        int i2 = this.f61482OooOoO0;
        if (i == i2 && iArr2 == (iArr = this.f61481OooOoO)) {
            return new C21196OooOO0(this.f61480OooOo0o & (~j2), this.f61479OooOo & (~j), i2, iArr);
        }
        if (iArr2 != null) {
            c21196OooOO0OooO0Oo = this;
            for (int i3 : iArr2) {
                c21196OooOO0OooO0Oo = c21196OooOO0OooO0Oo.OooO0Oo(i3);
            }
        } else {
            c21196OooOO0OooO0Oo = this;
        }
        int i4 = c21196OooOO0.f61482OooOoO0;
        if (j != 0) {
            for (int i5 = 0; i5 < 64; i5++) {
                if (((1 << i5) & j) != 0) {
                    c21196OooOO0OooO0Oo = c21196OooOO0OooO0Oo.OooO0Oo(i5 + i4);
                }
            }
        }
        if (j2 != 0) {
            for (int i6 = 0; i6 < 64; i6++) {
                if (((1 << i6) & j2) != 0) {
                    c21196OooOO0OooO0Oo = c21196OooOO0OooO0Oo.OooO0Oo(i6 + 64 + i4);
                }
            }
        }
        return c21196OooOO0OooO0Oo;
    }

    public final C21196OooOO0 OooO0Oo(int i) {
        int[] iArr;
        int iOooO00o;
        int i2 = this.f61482OooOoO0;
        int i3 = i - i2;
        if (i3 >= 0 && i3 < 64) {
            long j = 1 << i3;
            long j2 = this.f61479OooOo;
            if ((j2 & j) != 0) {
                return new C21196OooOO0(this.f61480OooOo0o, j2 & (~j), i2, this.f61481OooOoO);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j3 = 1 << (i3 - 64);
            long j4 = this.f61480OooOo0o;
            if ((j4 & j3) != 0) {
                return new C21196OooOO0((~j3) & j4, this.f61479OooOo, i2, this.f61481OooOoO);
            }
        } else if (i3 < 0 && (iArr = this.f61481OooOoO) != null && (iOooO00o = C21197OooOO0O.OooO00o(iArr, i)) >= 0) {
            int length = iArr.length;
            int i4 = length - 1;
            if (i4 == 0) {
                return new C21196OooOO0(this.f61480OooOo0o, this.f61479OooOo, this.f61482OooOoO0, null);
            }
            int[] iArr2 = new int[i4];
            if (iOooO00o > 0) {
                Oooo.OooO0OO.OooO0oO(iArr, iArr2, 0, 0, iOooO00o);
            }
            if (iOooO00o < i4) {
                Oooo.OooO0OO.OooO0oO(iArr, iArr2, iOooO00o, iOooO00o + 1, length);
            }
            return new C21196OooOO0(this.f61480OooOo0o, this.f61479OooOo, this.f61482OooOoO0, iArr2);
        }
        return this;
    }

    public final C21196OooOO0 OooO0o(C21196OooOO0 c21196OooOO0) {
        C21196OooOO0 c21196OooOO0OooO0oO;
        int[] iArr;
        C21196OooOO0 c21196OooOO0OooO0oO2 = c21196OooOO0;
        C21196OooOO0 c21196OooOO02 = f61478OooOoOO;
        if (c21196OooOO0OooO0oO2 == c21196OooOO02) {
            return this;
        }
        if (this == c21196OooOO02) {
            return c21196OooOO0OooO0oO2;
        }
        int i = c21196OooOO0OooO0oO2.f61482OooOoO0;
        long j = this.f61479OooOo;
        long j2 = this.f61480OooOo0o;
        int[] iArr2 = c21196OooOO0OooO0oO2.f61481OooOoO;
        long j3 = c21196OooOO0OooO0oO2.f61479OooOo;
        long j4 = c21196OooOO0OooO0oO2.f61480OooOo0o;
        int i2 = this.f61482OooOoO0;
        if (i == i2 && iArr2 == (iArr = this.f61481OooOoO)) {
            return new C21196OooOO0(j2 | j4, j | j3, i2, iArr);
        }
        int i3 = 0;
        int[] iArr3 = this.f61481OooOoO;
        if (iArr3 == null) {
            if (iArr3 != null) {
                for (int i4 : iArr3) {
                    c21196OooOO0OooO0oO2 = c21196OooOO0OooO0oO2.OooO0oO(i4);
                }
            }
            int i5 = this.f61482OooOoO0;
            if (j != 0) {
                for (int i6 = 0; i6 < 64; i6++) {
                    if (((1 << i6) & j) != 0) {
                        c21196OooOO0OooO0oO2 = c21196OooOO0OooO0oO2.OooO0oO(i6 + i5);
                    }
                }
            }
            if (j2 != 0) {
                while (i3 < 64) {
                    if (((1 << i3) & j2) != 0) {
                        c21196OooOO0OooO0oO2 = c21196OooOO0OooO0oO2.OooO0oO(i3 + 64 + i5);
                    }
                    i3++;
                }
            }
            return c21196OooOO0OooO0oO2;
        }
        if (iArr2 != null) {
            c21196OooOO0OooO0oO = this;
            for (int i7 : iArr2) {
                c21196OooOO0OooO0oO = c21196OooOO0OooO0oO.OooO0oO(i7);
            }
        } else {
            c21196OooOO0OooO0oO = this;
        }
        int i8 = c21196OooOO0OooO0oO2.f61482OooOoO0;
        if (j3 != 0) {
            for (int i9 = 0; i9 < 64; i9++) {
                if (((1 << i9) & j3) != 0) {
                    c21196OooOO0OooO0oO = c21196OooOO0OooO0oO.OooO0oO(i9 + i8);
                }
            }
        }
        if (j4 != 0) {
            while (i3 < 64) {
                if (((1 << i3) & j4) != 0) {
                    c21196OooOO0OooO0oO = c21196OooOO0OooO0oO.OooO0oO(i3 + 64 + i8);
                }
                i3++;
            }
        }
        return c21196OooOO0OooO0oO;
    }

    public final boolean OooO0o0(int i) {
        int[] iArr;
        int i2 = i - this.f61482OooOoO0;
        return (i2 < 0 || i2 >= 64) ? (i2 < 64 || i2 >= 128) ? i2 <= 0 && (iArr = this.f61481OooOoO) != null && C21197OooOO0O.OooO00o(iArr, i) >= 0 : ((1 << (i2 - 64)) & this.f61480OooOo0o) != 0 : ((1 << i2) & this.f61479OooOo) != 0;
    }

    public final C21196OooOO0 OooO0oO(int i) {
        long j;
        int i2;
        long j2;
        int i3 = this.f61482OooOoO0;
        int i4 = i - i3;
        long j3 = this.f61479OooOo;
        long j4 = 1;
        if (i4 < 0 || i4 >= 64) {
            long j5 = this.f61480OooOo0o;
            if (i4 < 64 || i4 >= 128) {
                int[] iArrO00oO0O = this.f61481OooOoO;
                if (i4 < 128) {
                    if (iArrO00oO0O == null) {
                        return new C21196OooOO0(j5, j3, i3, new int[]{i});
                    }
                    int iOooO00o = C21197OooOO0O.OooO00o(iArrO00oO0O, i);
                    if (iOooO00o < 0) {
                        int i5 = -(iOooO00o + 1);
                        int length = iArrO00oO0O.length;
                        int[] iArr = new int[length + 1];
                        Oooo.OooO0OO.OooO0oO(iArrO00oO0O, iArr, 0, 0, i5);
                        Oooo.OooO0OO.OooO0oO(iArrO00oO0O, iArr, i5 + 1, i5, length);
                        iArr[i5] = i;
                        return new C21196OooOO0(this.f61480OooOo0o, this.f61479OooOo, this.f61482OooOoO0, iArr);
                    }
                } else if (!OooO0o0(i)) {
                    int i6 = ((i + 1) / 64) * 64;
                    int i7 = this.f61482OooOoO0;
                    ArrayList arrayList = null;
                    long j6 = j5;
                    while (true) {
                        if (i7 >= i6) {
                            j = j3;
                            i2 = i7;
                            break;
                        }
                        if (j3 != 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                if (iArrO00oO0O != null) {
                                    int length2 = iArrO00oO0O.length;
                                    int i8 = 0;
                                    while (i8 < length2) {
                                        arrayList.add(Integer.valueOf(iArrO00oO0O[i8]));
                                        i8++;
                                        j4 = j4;
                                    }
                                }
                            }
                            j2 = j4;
                            for (int i9 = 0; i9 < 64; i9++) {
                                if (((j2 << i9) & j3) != 0) {
                                    arrayList.add(Integer.valueOf(i9 + i7));
                                }
                            }
                        } else {
                            j2 = j4;
                        }
                        if (j6 == 0) {
                            i2 = i6;
                            j = 0;
                            break;
                        }
                        i7 += 64;
                        j3 = j6;
                        j4 = j2;
                        j6 = 0;
                    }
                    if (arrayList != null) {
                        iArrO00oO0O = oOo000Oo.OooOo.o00oO0O(arrayList);
                    }
                    return new C21196OooOO0(j6, j, i2, iArrO00oO0O).OooO0oO(i);
                }
            } else {
                long j7 = 1 << (i4 - 64);
                if ((j5 & j7) == 0) {
                    return new C21196OooOO0(j7 | j5, j3, i3, this.f61481OooOoO);
                }
            }
        } else {
            long j8 = 1 << i4;
            if ((j3 & j8) == 0) {
                return new C21196OooOO0(this.f61480OooOo0o, j3 | j8, i3, this.f61481OooOoO);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return OooO0O0.OooO0O0.OooO0o0(new OooO00o(null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(this, 10));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
