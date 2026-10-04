package o0ooO0Oo;

import com.huawei.hms.network.embedded.C18241k5;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import o0ooO0o.C31455OooO00o;
import o0ooO0o.C31460OooO0o0;
import o0ooOO0O.C31607OooO0O0;
import o0ooOoo.InterfaceC31671OooO0OO;
import o0oooOO0.C31840OooO0o0;

/* JADX INFO: renamed from: o0ooO0Oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C31436OooO0Oo extends AbstractC31434OooO0O0 implements InterfaceC31452OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f112221OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C31840OooO0o0 f112222OooOoO0 = new C31840OooO0o0();

    public static String o0000Oo0(AbstractC31434OooO0O0 abstractC31434OooO0O0, ArrayList arrayList) throws IOException {
        if (abstractC31434OooO0O0 == null) {
            return CloudMetaExtra.DEFINE_NON_PARENT_ID;
        }
        if (arrayList.contains(abstractC31434OooO0O0)) {
            return String.valueOf(abstractC31434OooO0O0.hashCode());
        }
        arrayList.add(abstractC31434OooO0O0);
        if (!(abstractC31434OooO0O0 instanceof C31436OooO0Oo)) {
            if (!(abstractC31434OooO0O0 instanceof C31433OooO00o)) {
                if (!(abstractC31434OooO0O0 instanceof C31445OooOOO0)) {
                    return abstractC31434OooO0O0.toString();
                }
                return "COSObject{" + o0000Oo0(((C31445OooOOO0) abstractC31434OooO0O0).f112467OooOo, arrayList) + "}";
            }
            StringBuilder sb = new StringBuilder("COSArray{");
            Iterator it = ((C31433OooO00o) abstractC31434OooO0O0).f112214OooOo.iterator();
            while (it.hasNext()) {
                sb.append(o0000Oo0((AbstractC31434OooO0O0) it.next(), arrayList));
                sb.append(";");
            }
            sb.append("}");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("COSDictionary{");
        for (Map.Entry entry : ((C31436OooO0Oo) abstractC31434OooO0O0).f112222OooOoO0.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(C18241k5.f55433h);
            sb2.append(o0000Oo0((AbstractC31434OooO0O0) entry.getValue(), arrayList));
            sb2.append(";");
        }
        sb2.append("}");
        if (abstractC31434OooO0O0 instanceof C31448OooOOo) {
            C31460OooO0o0 c31460OooO0o0Oooo00o = ((C31448OooOOo) abstractC31434OooO0O0).oooo00o();
            byte[] bArrOooO0Oo = C31455OooO00o.OooO0Oo(c31460OooO0o0Oooo00o);
            sb2.append("COSStream{");
            sb2.append(Arrays.hashCode(bArrOooO0Oo));
            sb2.append("}");
            c31460OooO0o0Oooo00o.close();
        }
        return sb2.toString();
    }

    @Override // o0ooO0Oo.InterfaceC31452OooOo00
    public final boolean OooO0OO() {
        return this.f112221OooOo;
    }

    @Override // o0ooO0Oo.AbstractC31434OooO0O0
    public Object OooOOoo(C31607OooO0O0 c31607OooO0O0) throws IOException {
        c31607OooO0O0.OooOooo(this);
        return null;
    }

    public void OooOooo(C31436OooO0Oo c31436OooO0Oo) {
        for (Map.Entry entry : c31436OooO0Oo.f112222OooOoO0.entrySet()) {
            o000OoOO((C31441OooOO0) entry.getKey(), (AbstractC31434OooO0O0) entry.getValue());
        }
    }

    public final C31433OooO00o Oooo0(C31441OooOO0 c31441OooOO0) {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = o0000O0O(c31441OooOO0);
        if (abstractC31434OooO0O0O0000O0O instanceof C31433OooO00o) {
            return (C31433OooO00o) abstractC31434OooO0O0O0000O0O;
        }
        return null;
    }

    public final boolean Oooo00o(C31441OooOO0 c31441OooOO0) {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O = o0000O(c31441OooOO0, null);
        return (abstractC31434OooO0O0O0000O instanceof C31435OooO0OO) && abstractC31434OooO0O0O0000O == C31435OooO0OO.f112218OooOoOO;
    }

    public final C31436OooO0Oo Oooo0OO(C31441OooOO0 c31441OooOO0) {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = o0000O0O(c31441OooOO0);
        if (abstractC31434OooO0O0O0000O0O instanceof C31436OooO0Oo) {
            return (C31436OooO0Oo) abstractC31434OooO0O0O0000O0O;
        }
        return null;
    }

    public void clear() {
        this.f112222OooOoO0.f113469OooOo0o = null;
    }

    public final AbstractC31434OooO0O0 o0000O(C31441OooOO0 c31441OooOO0, C31441OooOO0 c31441OooOO02) {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = o0000O0O(c31441OooOO0);
        return (abstractC31434OooO0O0O0000O0O != null || c31441OooOO02 == null) ? abstractC31434OooO0O0O0000O0O : o0000O0O(c31441OooOO02);
    }

    public final AbstractC31434OooO0O0 o0000O0O(C31441OooOO0 c31441OooOO0) {
        AbstractC31434OooO0O0 abstractC31434OooO0O0 = (AbstractC31434OooO0O0) this.f112222OooOoO0.get(c31441OooOO0);
        if (abstractC31434OooO0O0 instanceof C31445OooOOO0) {
            abstractC31434OooO0O0 = ((C31445OooOOO0) abstractC31434OooO0O0).f112467OooOo;
        }
        if (abstractC31434OooO0O0 instanceof C31442OooOO0O) {
            return null;
        }
        return abstractC31434OooO0O0;
    }

    public final boolean o0000o0(C31441OooOO0 c31441OooOO0, int i) {
        return (o000O00O(c31441OooOO0, null, 0) & i) == i;
    }

    public final float o0000ooO(C31441OooOO0 c31441OooOO0, float f) {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = o0000O0O(c31441OooOO0);
        return abstractC31434OooO0O0O0000O0O instanceof AbstractC31443OooOO0o ? ((AbstractC31443OooOO0o) abstractC31434OooO0O0O0000O0O).OooOooo() : f;
    }

    public final int o000O00O(C31441OooOO0 c31441OooOO0, C31441OooOO0 c31441OooOO02, int i) {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O = o0000O(c31441OooOO0, c31441OooOO02);
        return abstractC31434OooO0O0O0000O instanceof AbstractC31443OooOO0o ? ((AbstractC31443OooOO0o) abstractC31434OooO0O0O0000O).Oooo0() : i;
    }

    public final long o000OO0o(C31441OooOO0 c31441OooOO0) {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = o0000O0O(c31441OooOO0);
        if (abstractC31434OooO0O0O0000O0O instanceof AbstractC31443OooOO0o) {
            return ((AbstractC31443OooOO0o) abstractC31434OooO0O0O0000O0O).Oooo0OO();
        }
        return -1L;
    }

    public final String o000OOO(C31441OooOO0 c31441OooOO0) {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = o0000O0O(c31441OooOO0);
        if (abstractC31434OooO0O0O0000O0O instanceof C31441OooOO0) {
            return ((C31441OooOO0) abstractC31434OooO0O0O0000O0O).f112461OooOo;
        }
        if (abstractC31434OooO0O0O0000O0O instanceof C31450OooOOoo) {
            return ((C31450OooOOoo) abstractC31434OooO0O0O0000O0O).OooOooo();
        }
        return null;
    }

    public final String o000OOo0(C31441OooOO0 c31441OooOO0) {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = o0000O0O(c31441OooOO0);
        if (abstractC31434OooO0O0O0000O0O instanceof C31450OooOOoo) {
            return ((C31450OooOOoo) abstractC31434OooO0O0O0000O0O).OooOooo();
        }
        return null;
    }

    public void o000OOoO(C31441OooOO0 c31441OooOO0) {
        this.f112222OooOoO0.remove(c31441OooOO0);
    }

    public void o000Oo(C31441OooOO0 c31441OooOO0, int i) {
        o000OoOO(c31441OooOO0, C31432OooO.o0Oo0oo(i));
    }

    public void o000Oo00(String str, boolean z) {
        o000OoOO(C31441OooOO0.OooOooo(str), z ? C31435OooO0OO.f112218OooOoOO : C31435OooO0OO.f112219OooOoo0);
    }

    public void o000Oo0O(C31441OooOO0 c31441OooOO0, boolean z) {
        o000OoOO(c31441OooOO0, z ? C31435OooO0OO.f112218OooOoOO : C31435OooO0OO.f112219OooOoo0);
    }

    public void o000Oo0o(C31441OooOO0 c31441OooOO0, float f) {
        o000OoOO(c31441OooOO0, new C31437OooO0o(f));
    }

    public void o000OoOO(C31441OooOO0 c31441OooOO0, AbstractC31434OooO0O0 abstractC31434OooO0O0) {
        if (abstractC31434OooO0O0 == null) {
            o000OOoO(c31441OooOO0);
        } else {
            this.f112222OooOoO0.put(c31441OooOO0, abstractC31434OooO0O0);
        }
    }

    public void o000OoOo(C31441OooOO0 c31441OooOO0, InterfaceC31671OooO0OO interfaceC31671OooO0OO) {
        o000OoOO(c31441OooOO0, interfaceC31671OooO0OO != null ? interfaceC31671OooO0OO.OooOOo0() : null);
    }

    public void o000Ooo0(C31441OooOO0 c31441OooOO0, long j) {
        o000OoOO(c31441OooOO0, C31432OooO.o0Oo0oo(j));
    }

    public void o000OooO(C31441OooOO0 c31441OooOO0, String str) {
        o000OoOO(c31441OooOO0, str != null ? C31441OooOO0.OooOooo(str) : null);
    }

    public void o000Oooo() {
        this.f112221OooOo = true;
    }

    public void o000o000(C31441OooOO0 c31441OooOO0, String str) {
        o000OoOO(c31441OooOO0, str != null ? new C31450OooOOoo(str) : null);
    }

    public final C31441OooOO0 o0Oo0oo(C31441OooOO0 c31441OooOO0) {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = o0000O0O(c31441OooOO0);
        if (abstractC31434OooO0O0O0000O0O instanceof C31441OooOO0) {
            return (C31441OooOO0) abstractC31434OooO0O0O0000O0O;
        }
        return null;
    }

    public final AbstractC31434OooO0O0 o0OoO0o(C31441OooOO0 c31441OooOO0) {
        return (AbstractC31434OooO0O0) this.f112222OooOoO0.get(c31441OooOO0);
    }

    public final String toString() {
        try {
            return o0000Oo0(this, new ArrayList());
        } catch (IOException e) {
            return "COSDictionary{" + e.getMessage() + "}";
        }
    }
}
