package o0ooO0oo;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31444OooOOO;

/* JADX INFO: renamed from: o0ooO0oo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31495OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f112670OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO0O0 f112671OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO0O0 f112672OooO0OO = null;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o0ooO0oo.OooOO0o$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f112673OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f112674OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f112675OooOoO0;

        static {
            OooO00o oooO00o = new OooO00o("TABLE", 0);
            f112674OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("STREAM", 1);
            f112673OooOo = oooO00o2;
            f112675OooOoO0 = new OooO00o[]{oooO00o, oooO00o2};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f112675OooOoO0.clone();
        }
    }

    /* JADX INFO: renamed from: o0ooO0oo.OooOO0o$OooO0O0 */
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public C31436OooO0Oo f112676OooO00o = null;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final HashMap f112678OooO0OO = new HashMap();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooO00o f112677OooO0O0 = OooO00o.f112674OooOo0o;
    }

    public final void OooO00o(long j, OooO00o oooO00o) {
        this.f112671OooO0O0 = new OooO0O0();
        this.f112670OooO00o.put(Long.valueOf(j), this.f112671OooO0O0);
        this.f112671OooO0O0.f112677OooO0O0 = oooO00o;
    }

    public final void OooO0O0(long j) {
        if (this.f112672OooO0OO != null) {
            Log.w("PdfBox-Android", "Method must be called only ones with last startxref value.");
            return;
        }
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f112672OooO0OO = oooO0O0;
        oooO0O0.f112676OooO00o = new C31436OooO0Oo();
        HashMap map = this.f112670OooO00o;
        OooO0O0 oooO0O02 = (OooO0O0) map.get(Long.valueOf(j));
        ArrayList arrayList = new ArrayList();
        if (oooO0O02 == null) {
            Log.w("PdfBox-Android", "Did not found XRef object at specified startxref position " + j);
            arrayList.addAll(map.keySet());
            Collections.sort(arrayList);
        } else {
            this.f112672OooO0OO.f112677OooO0O0 = oooO0O02.f112677OooO0O0;
            arrayList.add(Long.valueOf(j));
            while (true) {
                C31436OooO0Oo c31436OooO0Oo = oooO0O02.f112676OooO00o;
                if (c31436OooO0Oo == null) {
                    break;
                }
                long jO000OO0o = c31436OooO0Oo.o000OO0o(C31441OooOO0.f112382o00O0O0O);
                if (jO000OO0o == -1) {
                    break;
                }
                oooO0O02 = (OooO0O0) map.get(Long.valueOf(jO000OO0o));
                if (oooO0O02 == null) {
                    Log.w("PdfBox-Android", "Did not found XRef object pointed to by 'Prev' key at position " + jO000OO0o);
                    break;
                } else {
                    arrayList.add(Long.valueOf(jO000OO0o));
                    if (arrayList.size() >= map.size()) {
                        break;
                    }
                }
            }
            Collections.reverse(arrayList);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OooO0O0 oooO0O03 = (OooO0O0) map.get((Long) it.next());
            C31436OooO0Oo c31436OooO0Oo2 = oooO0O03.f112676OooO00o;
            if (c31436OooO0Oo2 != null) {
                this.f112672OooO0OO.f112676OooO00o.OooOooo(c31436OooO0Oo2);
            }
            this.f112672OooO0OO.f112678OooO0OO.putAll(oooO0O03.f112678OooO0OO);
        }
    }

    public final void OooO0OO(C31444OooOOO c31444OooOOO, long j) {
        OooO0O0 oooO0O0 = this.f112671OooO0O0;
        if (oooO0O0 != null) {
            if (oooO0O0.f112678OooO0OO.containsKey(c31444OooOOO)) {
                return;
            }
            this.f112671OooO0O0.f112678OooO0OO.put(c31444OooOOO, Long.valueOf(j));
        } else {
            Log.w("PdfBox-Android", "Cannot add XRef entry for '" + c31444OooOOO.f112466OooOo0o + "' because XRef start was not signalled.");
        }
    }
}
