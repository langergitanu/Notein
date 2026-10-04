package o0ooOO0o;

import android.util.Log;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooOoo.InterfaceC31671OooO0OO;

/* JADX INFO: renamed from: o0ooOO0o.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31618OooO0oo implements InterfaceC31671OooO0OO, Iterable<C31615OooO0o> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C31611OooO00o f113035OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31436OooO0Oo f113036OooOo0o;

    /* JADX INFO: renamed from: o0ooOO0o.OooO0oo$OooO00o */
    public final class OooO00o implements Iterator<C31615OooO0o> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final HashSet f113037OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final ArrayDeque f113038OooOo0o = new ArrayDeque();

        public OooO00o(C31436OooO0Oo c31436OooO0Oo) {
            this.f113037OooOo = new HashSet();
            OooO00o(c31436OooO0Oo);
            this.f113037OooOo = null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
        
            if (r5.f112222OooOoO0.containsKey(o0ooO0Oo.C31441OooOO0.f112330o000Oo) != false) goto L7;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO00o(C31436OooO0Oo c31436OooO0Oo) {
            if (c31436OooO0Oo != null) {
                if (c31436OooO0Oo.o0Oo0oo(C31441OooOO0.f112403o00OO) != C31441OooOO0.f112375o00O00Oo) {
                }
                for (C31436OooO0Oo c31436OooO0Oo2 : C31618OooO0oo.OooO0Oo(c31436OooO0Oo)) {
                    HashSet hashSet = this.f113037OooOo;
                    if (hashSet.contains(c31436OooO0Oo2)) {
                        Log.e("PdfBox-Android", "This page tree node has already been visited");
                    } else {
                        if (c31436OooO0Oo2.f112222OooOoO0.containsKey(C31441OooOO0.f112330o000Oo)) {
                            hashSet.add(c31436OooO0Oo2);
                        }
                        OooO00o(c31436OooO0Oo2);
                    }
                }
                return;
            }
            this.f113038OooOo0o.add(c31436OooO0Oo);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f113038OooOo0o.isEmpty();
        }

        @Override // java.util.Iterator
        public final C31615OooO0o next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            C31436OooO0Oo c31436OooO0Oo = (C31436OooO0Oo) this.f113038OooOo0o.poll();
            C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112403o00OO;
            C31441OooOO0 c31441OooOO0O0Oo0oo = c31436OooO0Oo.o0Oo0oo(c31441OooOO0);
            if (c31441OooOO0O0Oo0oo == null) {
                c31436OooO0Oo.o000OoOO(c31441OooOO0, C31441OooOO0.f112373o00O00O);
            } else if (!C31441OooOO0.f112373o00O00O.equals(c31441OooOO0O0Oo0oo)) {
                throw new IllegalStateException("Expected 'Page' but found " + c31441OooOO0O0Oo0oo);
            }
            C31611OooO00o c31611OooO00o = C31618OooO0oo.this.f113035OooOo;
            return new C31615OooO0o(c31436OooO0Oo, c31611OooO00o != null ? c31611OooO00o.f113014OooOooO : null);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: o0ooOO0o.OooO0oo$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C31436OooO0Oo f113040OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f113041OooO0O0 = -1;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f113042OooO0OO;

        public OooO0O0(C31615OooO0o c31615OooO0o) {
            this.f113040OooO00o = c31615OooO0o.f113022OooOo0o;
        }
    }

    public C31618OooO0oo(C31436OooO0Oo c31436OooO0Oo, C31611OooO00o c31611OooO00o) {
        if (c31436OooO0Oo == null) {
            throw new IllegalArgumentException("page tree root cannot be null");
        }
        if (C31441OooOO0.f112373o00O00O.equals(c31436OooO0Oo.o0Oo0oo(C31441OooOO0.f112403o00OO))) {
            C31433OooO00o c31433OooO00o = new C31433OooO00o();
            c31433OooO00o.OooOooo(c31436OooO0Oo);
            C31436OooO0Oo c31436OooO0Oo2 = new C31436OooO0Oo();
            this.f113036OooOo0o = c31436OooO0Oo2;
            c31436OooO0Oo2.o000OoOO(C31441OooOO0.f112330o000Oo, c31433OooO00o);
            c31436OooO0Oo2.o000Oo(C31441OooOO0.f112453oo000o, 1);
        } else {
            this.f113036OooOo0o = c31436OooO0Oo;
        }
        this.f113035OooOo = c31611OooO00o;
    }

    public static boolean OooO0O0(OooO0O0 oooO0O0, C31436OooO0Oo c31436OooO0Oo) {
        for (C31436OooO0Oo c31436OooO0Oo2 : OooO0Oo(c31436OooO0Oo)) {
            if (oooO0O0.f113042OooO0OO) {
                break;
            }
            if (c31436OooO0Oo2 != null) {
                if (c31436OooO0Oo2.o0Oo0oo(C31441OooOO0.f112403o00OO) != C31441OooOO0.f112375o00O00Oo) {
                    if (c31436OooO0Oo2.f112222OooOoO0.containsKey(C31441OooOO0.f112330o000Oo)) {
                    }
                }
                OooO0O0(oooO0O0, c31436OooO0Oo2);
            }
            oooO0O0.f113041OooO0O0++;
            oooO0O0.f113042OooO0OO = oooO0O0.f113040OooO00o == c31436OooO0Oo2;
        }
        return oooO0O0.f113042OooO0OO;
    }

    public static AbstractC31434OooO0O0 OooO0OO(C31436OooO0Oo c31436OooO0Oo, C31441OooOO0 c31441OooOO0) {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = c31436OooO0Oo.o0000O0O(c31441OooOO0);
        if (abstractC31434OooO0O0O0000O0O != null) {
            return abstractC31434OooO0O0O0000O0O;
        }
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O = c31436OooO0Oo.o0000O(C31441OooOO0.f112376o00O00o, C31441OooOO0.o00O00);
        if (!(abstractC31434OooO0O0O0000O instanceof C31436OooO0Oo)) {
            return null;
        }
        C31436OooO0Oo c31436OooO0Oo2 = (C31436OooO0Oo) abstractC31434OooO0O0O0000O;
        if (C31441OooOO0.f112375o00O00Oo.equals(c31436OooO0Oo2.o0000O0O(C31441OooOO0.f112403o00OO))) {
            return OooO0OO(c31436OooO0Oo2, c31441OooOO0);
        }
        return null;
    }

    public static ArrayList OooO0Oo(C31436OooO0Oo c31436OooO0Oo) {
        ArrayList arrayList = new ArrayList();
        C31433OooO00o c31433OooO00oOooo0 = c31436OooO0Oo.Oooo0(C31441OooOO0.f112330o000Oo);
        if (c31433OooO00oOooo0 != null) {
            int size = c31433OooO00oOooo0.f112214OooOo.size();
            for (int i = 0; i < size; i++) {
                AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO = c31433OooO00oOooo0.Oooo0OO(i);
                if (abstractC31434OooO0O0Oooo0OO instanceof C31436OooO0Oo) {
                    arrayList.add((C31436OooO0Oo) abstractC31434OooO0O0Oooo0OO);
                } else {
                    Log.w("PdfBox-Android", "COSDictionary expected, but got ".concat(abstractC31434OooO0O0Oooo0OO == null ? CloudMetaExtra.DEFINE_NON_PARENT_ID : abstractC31434OooO0O0Oooo0OO.getClass().getSimpleName()));
                }
            }
        }
        return arrayList;
    }

    @Override // o0ooOoo.InterfaceC31671OooO0OO
    public final AbstractC31434OooO0O0 OooOOo0() {
        return this.f113036OooOo0o;
    }

    @Override // java.lang.Iterable
    public final Iterator<C31615OooO0o> iterator() {
        return new OooO00o(this.f113036OooOo0o);
    }
}
