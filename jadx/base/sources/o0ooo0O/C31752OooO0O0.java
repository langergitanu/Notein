package o0ooo0O;

import java.util.HashMap;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.AbstractC31443OooOO0o;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;

/* JADX INFO: renamed from: o0ooo0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31752OooO0O0 extends AbstractC31753OooO0OO {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final AbstractC31753OooO0OO f113388OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C31436OooO0Oo f113389OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final HashMap f113390OooOoOO;

    public C31752OooO0O0(C31436OooO0Oo c31436OooO0Oo) {
        this.f113390OooOoOO = new HashMap();
        this.f113389OooOoO0 = c31436OooO0Oo;
        this.f113388OooOoO = null;
        OooO0o0();
    }

    @Override // o0ooo0O.AbstractC31753OooO0OO
    public final String OooO0O0() {
        AbstractC31753OooO0OO abstractC31753OooO0OO = this.f113388OooOoO;
        if (abstractC31753OooO0OO == null) {
            return "differences";
        }
        return abstractC31753OooO0OO.OooO0O0() + " with differences";
    }

    public final void OooO0o0() {
        Integer num;
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = this.f113389OooOoO0.o0000O0O(C31441OooOO0.f112284o00000OO);
        if (abstractC31434OooO0O0O0000O0O instanceof C31433OooO00o) {
            C31433OooO00o c31433OooO00o = (C31433OooO00o) abstractC31434OooO0O0O0000O0O;
            int iOooo0 = -1;
            for (int i = 0; i < c31433OooO00o.f112214OooOo.size(); i++) {
                AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO = c31433OooO00o.Oooo0OO(i);
                if (abstractC31434OooO0O0Oooo0OO instanceof AbstractC31443OooOO0o) {
                    iOooo0 = ((AbstractC31443OooOO0o) abstractC31434OooO0O0Oooo0OO).Oooo0();
                } else if (abstractC31434OooO0O0Oooo0OO instanceof C31441OooOO0) {
                    C31441OooOO0 c31441OooOO0 = (C31441OooOO0) abstractC31434OooO0O0Oooo0OO;
                    String str = c31441OooOO0.f112461OooOo;
                    HashMap map = this.f113392OooOo0o;
                    String str2 = (String) map.get(Integer.valueOf(iOooo0));
                    HashMap map2 = this.f113391OooOo;
                    if (str2 != null && (num = (Integer) map2.get(str2)) != null && num.intValue() == iOooo0) {
                        map2.remove(str2);
                    }
                    map2.put(str, Integer.valueOf(iOooo0));
                    map.put(Integer.valueOf(iOooo0), str);
                    this.f113390OooOoOO.put(Integer.valueOf(iOooo0), c31441OooOO0.f112461OooOo);
                    iOooo0++;
                }
            }
        }
    }

    @Override // o0ooOoo.InterfaceC31671OooO0OO
    public final AbstractC31434OooO0O0 OooOOo0() {
        return this.f113389OooOoO0;
    }

    public C31752OooO0O0(C31436OooO0Oo c31436OooO0Oo, boolean z, AbstractC31753OooO0OO abstractC31753OooO0OO) {
        this.f113390OooOoOO = new HashMap();
        this.f113389OooOoO0 = c31436OooO0Oo;
        C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112257OoooO0;
        AbstractC31753OooO0OO abstractC31753OooO0OOOooO0OO = c31436OooO0Oo.f112222OooOoO0.containsKey(c31441OooOO0) ? AbstractC31753OooO0OO.OooO0OO(c31436OooO0Oo.o0Oo0oo(c31441OooOO0)) : null;
        if (abstractC31753OooO0OOOooO0OO != null) {
            abstractC31753OooO0OO = abstractC31753OooO0OOOooO0OO;
        } else if (z) {
            abstractC31753OooO0OO = C31758OooO0oo.f113404OooOoO;
        } else if (abstractC31753OooO0OO == null) {
            throw new IllegalArgumentException("Symbolic fonts must have a built-in encoding");
        }
        this.f113388OooOoO = abstractC31753OooO0OO;
        this.f113392OooOo0o.putAll(abstractC31753OooO0OO.f113392OooOo0o);
        this.f113391OooOo.putAll(abstractC31753OooO0OO.f113391OooOo);
        OooO0o0();
    }
}
