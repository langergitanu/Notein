package o0ooO0oo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.AbstractC31443OooOO0o;
import o0ooO0Oo.C31432OooO;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31438OooO0o0;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31448OooOOo;

/* JADX INFO: renamed from: o0ooO0oo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31484OooO extends AbstractC31485OooO00o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int[] f112615OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C31495OooOO0o f112616OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooO00o f112617OooO0oO;

    /* JADX INFO: renamed from: o0ooO0oo.OooO$OooO00o */
    public static class OooO00o implements Iterator<Long> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final long[] f112618OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final long[] f112619OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public long f112620OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f112621OooOoO0 = 0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public long f112622OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final long f112623OooOoo0;

        public OooO00o(C31433OooO00o c31433OooO00o) throws IOException {
            this.f112620OooOoO = 0L;
            this.f112622OooOoOO = 0L;
            this.f112623OooOoo0 = 0L;
            ArrayList arrayList = c31433OooO00o.f112214OooOo;
            int size = arrayList.size() / 2;
            this.f112619OooOo0o = new long[size];
            this.f112618OooOo = new long[size];
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                AbstractC31434OooO0O0 abstractC31434OooO0O0 = (AbstractC31434OooO0O0) it.next();
                if (!(abstractC31434OooO0O0 instanceof C31432OooO)) {
                    throw new IOException("Xref stream must have integer in /Index array");
                }
                long j = ((C31432OooO) abstractC31434OooO0O0).f112212OooOo;
                if (!it.hasNext()) {
                    break;
                }
                AbstractC31434OooO0O0 abstractC31434OooO0O02 = (AbstractC31434OooO0O0) it.next();
                if (!(abstractC31434OooO0O02 instanceof C31432OooO)) {
                    throw new IOException("Xref stream must have integer in /Index array");
                }
                long j2 = ((C31432OooO) abstractC31434OooO0O02).f112212OooOo;
                this.f112619OooOo0o[i] = j;
                this.f112618OooOo[i] = j + j2;
                i++;
            }
            this.f112622OooOoOO = this.f112619OooOo0o[0];
            long[] jArr = this.f112618OooOo;
            this.f112620OooOoO = jArr[0];
            this.f112623OooOoo0 = jArr[i - 1];
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public final Long next() {
            long j = this.f112622OooOoOO;
            if (j >= this.f112623OooOoo0) {
                throw new NoSuchElementException();
            }
            if (j < this.f112620OooOoO) {
                this.f112622OooOoOO = 1 + j;
                return Long.valueOf(j);
            }
            int i = this.f112621OooOoO0 + 1;
            this.f112621OooOoO0 = i;
            long j2 = this.f112619OooOo0o[i];
            this.f112622OooOoOO = j2;
            this.f112620OooOoO = this.f112618OooOo[i];
            this.f112622OooOoOO = 1 + j2;
            return Long.valueOf(j2);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f112622OooOoOO < this.f112623OooOoo0;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C31484OooO(C31448OooOOo c31448OooOOo, C31438OooO0o0 c31438OooO0o0, C31495OooOO0o c31495OooOO0o) throws IOException {
        super(new C31488OooO0Oo(c31448OooOOo.o000o00O()));
        this.f112615OooO0o = new int[3];
        this.f112617OooO0oO = null;
        this.f112627OooO0OO = c31438OooO0o0;
        this.f112616OooO0o0 = c31495OooOO0o;
        try {
            OooOo0O(c31448OooOOo);
        } catch (IOException unused) {
            InterfaceC31494OooOO0O interfaceC31494OooOO0O = this.f112626OooO0O0;
            if (interfaceC31494OooOO0O != null) {
                interfaceC31494OooOO0O.close();
            }
            this.f112627OooO0OO = null;
        }
    }

    public static long OooOo0o(int i, int i2, byte[] bArr) {
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j += (((long) bArr[i3 + i]) & 255) << (((i2 - i3) - 1) * 8);
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOo0O(C31448OooOOo c31448OooOOo) throws IOException {
        int iOooo0;
        C31433OooO00o c31433OooO00oOooo0 = c31448OooOOo.Oooo0(C31441OooOO0.f112452oOooo0o);
        if (c31433OooO00oOooo0 == null) {
            throw new IOException("/W array is missing in Xref stream");
        }
        ArrayList arrayList = c31433OooO00oOooo0.f112214OooOo;
        int size = arrayList.size();
        int[] iArr = this.f112615OooO0o;
        if (size != 3) {
            throw new IOException("Wrong number of values for /W array in XRef: " + Arrays.toString(iArr));
        }
        for (int i = 0; i < 3; i++) {
            if (i < arrayList.size()) {
                Object obj = arrayList.get(i);
                iOooo0 = obj instanceof AbstractC31443OooOO0o ? ((AbstractC31443OooOO0o) obj).Oooo0() : 0;
            }
            iArr[i] = iOooo0;
        }
        if (iArr[0] < 0 || iArr[1] < 0 || iArr[2] < 0) {
            throw new IOException("Incorrect /W array in XRef: " + Arrays.toString(iArr));
        }
        C31433OooO00o c31433OooO00oOooo02 = c31448OooOOo.Oooo0(C31441OooOO0.f112326o000OOO);
        if (c31433OooO00oOooo02 == null) {
            c31433OooO00oOooo02 = new C31433OooO00o();
            c31433OooO00oOooo02.OooOooo(C31432OooO.f112209OooOoOO);
            c31433OooO00oOooo02.OooOooo(C31432OooO.o0Oo0oo(c31448OooOOo.o000O00O(C31441OooOO0.f112396o00O0o0o, null, 0)));
        }
        if (c31433OooO00oOooo02.f112214OooOo.size() % 2 == 1) {
            throw new IOException("Wrong number of values for /Index array in XRef: " + Arrays.toString(iArr));
        }
        this.f112617OooO0oO = new OooO00o(c31433OooO00oOooo02);
    }
}
