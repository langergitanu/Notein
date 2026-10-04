package oO000Oo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import oO000Oo.o0000O;
import oO000Oo.o00Ooo;
import oO0OOo0o.C33065OooOOOo;
import oO0OOo0o.C33094OoooO;
import oO0OOo0o.C33101OoooOO0;
import oO0OOo0o.OooO;
import oO0OOo0o.OooO0OO;

/* JADX INFO: renamed from: oO000Oo.o0ooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32068o0ooOoO<ReqT> extends o0000O<ReqT> {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ C33101OoooOO0 f114762OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ oO0OOo0o.OooO0OO f114763Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final /* synthetic */ C33065OooOOOo f114764Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final /* synthetic */ o00Ooo.C32056OooO0o0 f114765Oooo00o;

    /* JADX WARN: Illegal instructions before constructor call */
    public C32068o0ooOoO(o00Ooo.C32056OooO0o0 c32056OooO0o0, C33101OoooOO0 c33101OoooOO0, C33094OoooO c33094OoooO, oO0OOo0o.OooO0OO oooO0OO, o0000OO o0000oo2, C31994OoooOO0 c31994OoooOO0, C33065OooOOOo c33065OooOOOo) {
        this.f114765Oooo00o = c32056OooO0o0;
        this.f114762OooOooo = c33101OoooOO0;
        this.f114763Oooo000 = oooO0OO;
        this.f114764Oooo00O = c33065OooOOOo;
        o00Ooo o00ooo2 = o00Ooo.this;
        o0000O.C32027OooOOo c32027OooOOo = o00ooo2.f114662OoooOOo;
        long j = o00ooo2.f114663OoooOo0;
        long j2 = o00ooo2.f114664OoooOoO;
        Executor executor = oooO0OO.f119526OooO0O0;
        super(c33101OoooOO0, c33094OoooO, c32027OooOOo, j, j2, executor == null ? o00ooo2.f114614OooO : executor, o00ooo2.f114621OooO0oO.f113976OooOo0o.Oooo0o0(), o0000oo2, c31994OoooOO0, c32056OooO0o0.f114681OooO00o);
    }

    @Override // oO000Oo.o0000O
    public final InterfaceC31946OooOOo OooOo0(C33094OoooO c33094OoooO, o0000O.OooOOO0 oooOOO0, int i, boolean z) {
        oO0OOo0o.OooO0OO oooO0OO = this.f114763Oooo000;
        oooO0OO.getClass();
        List<OooO.OooO00o> list = oooO0OO.f119529OooO0o;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(oooOOO0);
        OooO0OO.OooO00o oooO00oOooO0O0 = oO0OOo0o.OooO0OO.OooO0O0(oooO0OO);
        oooO00oOooO0O0.f119538OooO0o = Collections.unmodifiableList(arrayList);
        oO0OOo0o.OooO0OO oooO0OO2 = new oO0OOo0o.OooO0OO(oooO00oOooO0O0);
        oO0OOo0o.OooO[] oooOArrOooO0OO = C31989OoooO0O.OooO0OO(oooO0OO2, c33094OoooO, i, z);
        C33101OoooOO0<?, ?> c33101OoooOO0 = this.f114762OooOooo;
        OooOo00 oooOo00OooO00o = this.f114765Oooo00o.OooO00o(new o0000O00(c33101OoooOO0, c33094OoooO, oooO0OO2));
        C33065OooOOOo c33065OooOOOo = this.f114764Oooo00O;
        C33065OooOOOo c33065OooOOOoOooO0OO = c33065OooOOOo.OooO0OO();
        try {
            return oooOo00OooO00o.OooO0Oo(c33101OoooOO0, c33094OoooO, oooO0OO2, oooOArrOooO0OO);
        } finally {
            c33065OooOOOo.OooOooo(c33065OooOOOoOooO0OO);
        }
    }

    @Override // oO000Oo.o0000O
    public final void OooOo0O() {
        oO0OOo0o.o00Oo0 o00oo02;
        o00Ooo.C32063OooOOo0 c32063OooOOo0 = o00Ooo.this.f114649Oooo00o;
        synchronized (c32063OooOOo0.f114734OooO00o) {
            try {
                c32063OooOOo0.f114735OooO0O0.remove(this);
                if (c32063OooOOo0.f114735OooO0O0.isEmpty()) {
                    o00oo02 = c32063OooOOo0.f114736OooO0OO;
                    c32063OooOOo0.f114735OooO0O0 = new HashSet();
                } else {
                    o00oo02 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (o00oo02 != null) {
            o00Ooo.this.f114648Oooo00O.OooO0o(o00oo02);
        }
    }

    @Override // oO000Oo.o0000O
    public final oO0OOo0o.o00Oo0 OooOo0o() {
        o00Ooo.C32063OooOOo0 c32063OooOOo0 = o00Ooo.this.f114649Oooo00o;
        synchronized (c32063OooOOo0.f114734OooO00o) {
            try {
                oO0OOo0o.o00Oo0 o00oo02 = c32063OooOOo0.f114736OooO0OO;
                if (o00oo02 != null) {
                    return o00oo02;
                }
                c32063OooOOo0.f114735OooO0O0.add(this);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
