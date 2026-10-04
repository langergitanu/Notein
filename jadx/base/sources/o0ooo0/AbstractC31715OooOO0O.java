package o0ooo0;

import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.AbstractC31443OooOO0o;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31440OooO0oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31448OooOOo;
import o0ooO0o.C31455OooO00o;
import o0ooOoo.InterfaceC31671OooO0OO;
import o0oooOO0.C31839OooO0o;

/* JADX INFO: renamed from: o0ooo0.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31715OooOO0O implements InterfaceC31671OooO0OO, InterfaceC31721OooOOo, InterfaceC31731OooOoo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooOo f113276OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f113278OooOoO0;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C31436OooO0Oo f113280OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public C31722OooOOo0 f113282OooOooO;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final HashMap f113277OooOoO = new HashMap();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final HashMap f113279OooOoOO = new HashMap();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final float[] f113281OooOoo0 = {880.0f, -1000.0f};

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final HashMap f113275OooOo = new HashMap();

    public AbstractC31715OooOO0O(C31436OooO0Oo c31436OooO0Oo, OooOo oooOo) {
        boolean z = true;
        this.f113280OooOoo = c31436OooO0Oo;
        this.f113276OooOo0o = oooOo;
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = c31436OooO0Oo.o0000O0O(C31441OooOO0.f112452oOooo0o);
        if (abstractC31434OooO0O0O0000O0O instanceof C31433OooO00o) {
            C31433OooO00o c31433OooO00o = (C31433OooO00o) abstractC31434OooO0O0O0000O0O;
            int size = c31433OooO00o.f112214OooOo.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO = c31433OooO00o.Oooo0OO(i);
                if (abstractC31434OooO0O0Oooo0OO instanceof AbstractC31443OooOO0o) {
                    AbstractC31443OooOO0o abstractC31443OooOO0o = (AbstractC31443OooOO0o) abstractC31434OooO0O0Oooo0OO;
                    int i3 = i + 2;
                    AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO2 = c31433OooO00o.Oooo0OO(i2);
                    if (abstractC31434OooO0O0Oooo0OO2 instanceof C31433OooO00o) {
                        C31433OooO00o c31433OooO00o2 = (C31433OooO00o) abstractC31434OooO0O0Oooo0OO2;
                        int iOooo0 = abstractC31443OooOO0o.Oooo0();
                        int size2 = c31433OooO00o2.f112214OooOo.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO3 = c31433OooO00o2.Oooo0OO(i4);
                            if (abstractC31434OooO0O0Oooo0OO3 instanceof AbstractC31443OooOO0o) {
                                this.f113275OooOo.put(Integer.valueOf(iOooo0 + i4), Float.valueOf(((AbstractC31443OooOO0o) abstractC31434OooO0O0Oooo0OO3).OooOooo()));
                            } else {
                                Log.w("PdfBox-Android", "Expected a number array member, got " + abstractC31434OooO0O0Oooo0OO3);
                            }
                        }
                        i = i3;
                    } else {
                        i += 3;
                        AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO4 = c31433OooO00o.Oooo0OO(i3);
                        if ((abstractC31434OooO0O0Oooo0OO2 instanceof AbstractC31443OooOO0o) && (abstractC31434OooO0O0Oooo0OO4 instanceof AbstractC31443OooOO0o)) {
                            int iOooo02 = ((AbstractC31443OooOO0o) abstractC31434OooO0O0Oooo0OO2).Oooo0();
                            float fOooOooo = ((AbstractC31443OooOO0o) abstractC31434OooO0O0Oooo0OO4).OooOooo();
                            for (int iOooo03 = abstractC31443OooOO0o.Oooo0(); iOooo03 <= iOooo02; iOooo03++) {
                                this.f113275OooOo.put(Integer.valueOf(iOooo03), Float.valueOf(fOooOooo));
                            }
                        } else {
                            Log.w("PdfBox-Android", "Expected two numbers, got " + abstractC31434OooO0O0Oooo0OO2 + " and " + abstractC31434OooO0O0Oooo0OO4);
                        }
                    }
                } else {
                    Log.w("PdfBox-Android", "Expected a number array member, got " + abstractC31434OooO0O0Oooo0OO);
                    i = i2;
                }
            }
        }
        C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112307o0000oo;
        C31436OooO0Oo c31436OooO0Oo2 = this.f113280OooOoo;
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O2 = c31436OooO0Oo2.o0000O0O(c31441OooOO0);
        if (abstractC31434OooO0O0O0000O0O2 instanceof C31433OooO00o) {
            C31433OooO00o c31433OooO00o3 = (C31433OooO00o) abstractC31434OooO0O0O0000O0O2;
            AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO5 = c31433OooO00o3.Oooo0OO(0);
            AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO6 = c31433OooO00o3.Oooo0OO(1);
            if ((abstractC31434OooO0O0Oooo0OO5 instanceof AbstractC31443OooOO0o) && (abstractC31434OooO0O0Oooo0OO6 instanceof AbstractC31443OooOO0o)) {
                float fOooOooo2 = ((AbstractC31443OooOO0o) abstractC31434OooO0O0Oooo0OO5).OooOooo();
                float[] fArr = this.f113281OooOoo0;
                fArr[0] = fOooOooo2;
                fArr[1] = ((AbstractC31443OooOO0o) abstractC31434OooO0O0Oooo0OO6).OooOooo();
            }
        }
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O3 = c31436OooO0Oo2.o0000O0O(C31441OooOO0.f112423o00OOOo0);
        if (abstractC31434OooO0O0O0000O0O3 instanceof C31433OooO00o) {
            C31433OooO00o c31433OooO00o4 = (C31433OooO00o) abstractC31434OooO0O0O0000O0O3;
            int i5 = 0;
            while (i5 < c31433OooO00o4.f112214OooOo.size()) {
                AbstractC31443OooOO0o abstractC31443OooOO0o2 = (AbstractC31443OooOO0o) c31433OooO00o4.Oooo0OO(i5);
                int i6 = i5 + 1;
                AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO7 = c31433OooO00o4.Oooo0OO(i6);
                boolean z2 = abstractC31434OooO0O0Oooo0OO7 instanceof C31433OooO00o;
                HashMap map = this.f113279OooOoOO;
                HashMap map2 = this.f113277OooOoO;
                if (z2) {
                    C31433OooO00o c31433OooO00o5 = (C31433OooO00o) abstractC31434OooO0O0Oooo0OO7;
                    for (int i7 = 0; i7 < c31433OooO00o5.f112214OooOo.size(); i7 += 3) {
                        int iOooo04 = (i7 / 3) + abstractC31443OooOO0o2.Oooo0();
                        AbstractC31443OooOO0o abstractC31443OooOO0o3 = (AbstractC31443OooOO0o) c31433OooO00o5.Oooo0OO(i7);
                        AbstractC31443OooOO0o abstractC31443OooOO0o4 = (AbstractC31443OooOO0o) c31433OooO00o5.Oooo0OO(i7 + 1);
                        AbstractC31443OooOO0o abstractC31443OooOO0o5 = (AbstractC31443OooOO0o) c31433OooO00o5.Oooo0OO(i7 + 2);
                        map2.put(Integer.valueOf(iOooo04), Float.valueOf(abstractC31443OooOO0o3.OooOooo()));
                        map.put(Integer.valueOf(iOooo04), new C31839OooO0o(abstractC31443OooOO0o4.OooOooo(), abstractC31443OooOO0o5.OooOooo()));
                    }
                } else {
                    int iOooo05 = abstractC31443OooOO0o2.Oooo0();
                    int iOooo06 = ((AbstractC31443OooOO0o) abstractC31434OooO0O0Oooo0OO7).Oooo0();
                    AbstractC31443OooOO0o abstractC31443OooOO0o6 = (AbstractC31443OooOO0o) c31433OooO00o4.Oooo0OO(i5 + 2);
                    AbstractC31443OooOO0o abstractC31443OooOO0o7 = (AbstractC31443OooOO0o) c31433OooO00o4.Oooo0OO(i5 + 3);
                    int i8 = i5 + 4;
                    AbstractC31443OooOO0o abstractC31443OooOO0o8 = (AbstractC31443OooOO0o) c31433OooO00o4.Oooo0OO(i8);
                    while (iOooo05 <= iOooo06) {
                        map2.put(Integer.valueOf(iOooo05), Float.valueOf(abstractC31443OooOO0o6.OooOooo()));
                        map.put(Integer.valueOf(iOooo05), new C31839OooO0o(abstractC31443OooOO0o7.OooOooo(), abstractC31443OooOO0o8.OooOooo()));
                        iOooo05++;
                        z = z;
                    }
                    i6 = i8;
                }
                i5 = i6 + 1;
                z = z;
            }
        }
    }

    public final C31719OooOOOO OooO() {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = this.f113280OooOoo.o0000O0O(C31441OooOO0.f112379o00O0O);
        if (abstractC31434OooO0O0O0000O0O instanceof C31436OooO0Oo) {
            return new C31719OooOOOO((C31436OooO0Oo) abstractC31434OooO0O0O0000O0O);
        }
        return null;
    }

    public abstract int OooO0o(int i) throws IOException;

    public abstract int OooO0o0(int i);

    public abstract byte[] OooO0oO(int i) throws IOException;

    public final String OooO0oo() {
        return this.f113280OooOoo.o000OOO(C31441OooOO0.f112259OoooO0O);
    }

    public final C31722OooOOo0 OooOO0() {
        C31436OooO0Oo c31436OooO0Oo;
        if (this.f113282OooOooO == null && (c31436OooO0Oo = (C31436OooO0Oo) this.f113280OooOoo.o0000O0O(C31441OooOO0.f112305o0000oOO)) != null) {
            this.f113282OooOooO = new C31722OooOOo0(c31436OooO0Oo);
        }
        return this.f113282OooOooO;
    }

    public final int[] OooOO0O() throws IOException {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = this.f113280OooOoo.o0000O0O(C31441OooOO0.f112459ooOO);
        if (!(abstractC31434OooO0O0O0000O0O instanceof C31448OooOOo)) {
            return null;
        }
        C31440OooO0oo c31440OooO0ooO000o00O = ((C31448OooOOo) abstractC31434OooO0O0O0000O0O).o000o00O();
        byte[] bArrOooO0Oo = C31455OooO00o.OooO0Oo(c31440OooO0ooO000o00O);
        C31455OooO00o.OooO0O0(c31440OooO0ooO000o00O);
        int length = bArrOooO0Oo.length / 2;
        int[] iArr = new int[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = ((bArrOooO0Oo[i] & 255) << 8) | (bArrOooO0Oo[i + 1] & 255);
            i += 2;
        }
        return iArr;
    }

    @Override // o0ooOoo.InterfaceC31671OooO0OO
    public final AbstractC31434OooO0O0 OooOOo0() {
        return this.f113280OooOoo;
    }
}
