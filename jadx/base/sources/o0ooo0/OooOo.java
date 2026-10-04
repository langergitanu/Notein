package o0ooo0;

import OooO0o.C20424OooO0Oo;
import OooOo.C20485OooOoO;
import android.graphics.Path;
import android.util.Log;
import com.huawei.hms.network.embedded.C18198h4;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import o0oo0oO.C31327OooO0O0;
import o0oo0oO.C31329OooO0Oo;
import o0oo0oo.C31401Oooo0oO;
import o0oo0oo.InterfaceC31361OooO0OO;
import o0oo0ooo.C31412OooO00o;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.AbstractC31443OooOO0o;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooOO0o.C31611OooO00o;
import o0oooOO0.C31837OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOo extends AbstractC31720OooOOOo implements InterfaceC31731OooOoo {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final AbstractC31715OooOO0O f113317OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public C31327OooO0O0 f113318OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final HashSet f113319Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public C31327OooO0O0 f113320Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f113321Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f113322Oooo00o;

    public OooOo(C31436OooO0Oo c31436OooO0Oo) throws Throwable {
        AbstractC31715OooOO0O c31718OooOOO0;
        super(c31436OooO0Oo);
        this.f113319Oooo0 = new HashSet();
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = c31436OooO0Oo.o0000O0O(C31441OooOO0.f112279o000000);
        if (!(abstractC31434OooO0O0O0000O0O instanceof C31433OooO00o)) {
            throw new IOException("Missing descendant font array");
        }
        C31433OooO00o c31433OooO00o = (C31433OooO00o) abstractC31434OooO0O0O0000O0O;
        if (c31433OooO00o.f112214OooOo.size() == 0) {
            throw new IOException("Descendant font array is empty");
        }
        AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO = c31433OooO00o.Oooo0OO(0);
        if (!(abstractC31434OooO0O0Oooo0OO instanceof C31436OooO0Oo)) {
            throw new IOException("Missing descendant font dictionary");
        }
        C31436OooO0Oo c31436OooO0Oo2 = (C31436OooO0Oo) abstractC31434OooO0O0Oooo0OO;
        C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112403o00OO;
        C31441OooOO0 c31441OooOO02 = C31441OooOO0.f112300o0000o;
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O2 = c31436OooO0Oo2.o0000O0O(c31441OooOO0);
        C31441OooOO0 c31441OooOO03 = abstractC31434OooO0O0O0000O0O2 instanceof C31441OooOO0 ? (C31441OooOO0) abstractC31434OooO0O0O0000O0O2 : c31441OooOO02;
        if (!c31441OooOO02.equals(c31441OooOO03)) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("Expected 'Font' dictionary but found '"), c31441OooOO03.f112461OooOo, "'"));
        }
        C31441OooOO0 c31441OooOO0O0Oo0oo = c31436OooO0Oo2.o0Oo0oo(C31441OooOO0.f112404o00OO0);
        if (C31441OooOO0.f112274Ooooooo.equals(c31441OooOO0O0Oo0oo)) {
            c31718OooOOO0 = new C31716OooOO0o(c31436OooO0Oo2, this);
        } else {
            if (!C31441OooOO0.f112446o0OoOo0.equals(c31441OooOO0O0Oo0oo)) {
                throw new IOException("Invalid font type: " + c31441OooOO03);
            }
            c31718OooOOO0 = new C31718OooOOO0(c31436OooO0Oo2, this, null);
        }
        this.f113317OooOooO = c31718OooOOO0;
        OooOo00();
        OooOOoo();
    }

    @Override // o0ooo0.AbstractC31720OooOOOo
    public final float OooO(int i) {
        throw new UnsupportedOperationException(C18198h4.f55026d);
    }

    @Override // o0ooo0.AbstractC31720OooOOOo, o0ooo0.InterfaceC31721OooOOo
    public final C31837OooO0OO OooO00o() {
        return this.f113317OooOooO.OooO00o();
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final float OooO0O0(int i) throws IOException {
        return this.f113317OooOooO.OooO0O0(i);
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final C31412OooO00o OooO0OO() throws IOException {
        return this.f113317OooOooO.OooO0OO();
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final boolean OooO0Oo() {
        return this.f113317OooOooO.OooO0Oo();
    }

    @Override // o0ooo0.AbstractC31720OooOOOo
    public final byte[] OooO0o(int i) throws IOException {
        return this.f113317OooOooO.OooO0oO(i);
    }

    @Override // o0ooo0.AbstractC31720OooOOOo
    public final void OooO0o0(int i) {
        throw new IllegalStateException("This font was created with subsetting disabled");
    }

    @Override // o0ooo0.AbstractC31720OooOOOo
    public final C31722OooOOo0 OooO0oo() {
        return this.f113317OooOooO.OooOO0();
    }

    @Override // o0ooo0.AbstractC31720OooOOOo
    public final float OooOO0O(int i) throws IOException {
        AbstractC31715OooOO0O abstractC31715OooOO0O = this.f113317OooOooO;
        Float fValueOf = (Float) abstractC31715OooOO0O.f113275OooOo.get(Integer.valueOf(abstractC31715OooOO0O.OooO0o0(i)));
        if (fValueOf == null) {
            if (abstractC31715OooOO0O.f113278OooOoO0 == 0.0f) {
                AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = abstractC31715OooOO0O.f113280OooOoo.o0000O0O(C31441OooOO0.f112290o0000O00);
                if (abstractC31434OooO0O0O0000O0O instanceof AbstractC31443OooOO0o) {
                    abstractC31715OooOO0O.f113278OooOoO0 = ((AbstractC31443OooOO0o) abstractC31434OooO0O0O0000O0O).OooOooo();
                } else {
                    abstractC31715OooOO0O.f113278OooOoO0 = 1000.0f;
                }
            }
            fValueOf = Float.valueOf(abstractC31715OooOO0O.f113278OooOoO0);
        }
        return fValueOf.floatValue();
    }

    @Override // o0ooo0.AbstractC31720OooOOOo
    public final boolean OooOOO0() {
        return false;
    }

    @Override // o0ooo0.AbstractC31720OooOOOo
    public final int OooOOOO(ByteArrayInputStream byteArrayInputStream) throws IOException {
        C31327OooO0O0 c31327OooO0O0 = this.f113318OooOooo;
        byte[] bArr = new byte[c31327OooO0O0.f111866OooO0o0];
        byteArrayInputStream.read(bArr, 0, c31327OooO0O0.f111864OooO0Oo);
        byteArrayInputStream.mark(c31327OooO0O0.f111866OooO0o0);
        int i = c31327OooO0O0.f111864OooO0Oo - 1;
        while (i < c31327OooO0O0.f111866OooO0o0) {
            i++;
            for (C31329OooO0Oo c31329OooO0Oo : c31327OooO0O0.f111865OooO0o) {
                int i2 = c31329OooO0Oo.f111876OooO0OO;
                if (i2 == i) {
                    for (int i3 = 0; i3 < i2; i3++) {
                        int i4 = bArr[i3] & 255;
                        if (i4 < c31329OooO0Oo.f111874OooO00o[i3] || i4 > c31329OooO0Oo.f111875OooO0O0[i3]) {
                            break;
                        }
                    }
                    return C31327OooO0O0.OooO0OO(i, bArr);
                }
            }
            if (i < c31327OooO0O0.f111866OooO0o0) {
                bArr[i] = (byte) byteArrayInputStream.read();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < c31327OooO0O0.f111866OooO0o0; i5++) {
            sb.append(String.format("0x%02X (%04o) ", Byte.valueOf(bArr[i5]), Byte.valueOf(bArr[i5])));
        }
        Log.w("PdfBox-Android", "Invalid character code sequence " + ((Object) sb) + "in CMap " + c31327OooO0O0.f111861OooO00o);
        if (byteArrayInputStream.markSupported()) {
            byteArrayInputStream.reset();
        } else {
            StringBuilder sb2 = new StringBuilder("mark() and reset() not supported, ");
            sb2.append(c31327OooO0O0.f111866OooO0o0 - 1);
            sb2.append(" bytes have been skipped");
            Log.w("PdfBox-Android", sb2.toString());
        }
        return C31327OooO0O0.OooO0OO(c31327OooO0O0.f111864OooO0Oo, bArr);
    }

    @Override // o0ooo0.AbstractC31720OooOOOo
    public final void OooOOOo() throws IOException {
        throw new IllegalStateException("This font was created with subsetting disabled");
    }

    @Override // o0ooo0.AbstractC31720OooOOOo
    public final boolean OooOOo() {
        return false;
    }

    public final void OooOOoo() throws Throwable {
        C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112291o0000O0O;
        C31436OooO0Oo c31436OooO0Oo = this.f113309OooOo0o;
        C31441OooOO0 c31441OooOO0O0Oo0oo = c31436OooO0Oo.o0Oo0oo(c31441OooOO0);
        if ((!this.f113321Oooo00O || c31441OooOO0O0Oo0oo == C31441OooOO0.f112323o000OO00 || c31441OooOO0O0Oo0oo == C31441OooOO0.f112445o0OoO0o) && !this.f113322Oooo00o) {
            return;
        }
        String string = null;
        if (this.f113322Oooo00o) {
            StringBuilder sb = new StringBuilder();
            AbstractC31715OooOO0O abstractC31715OooOO0O = this.f113317OooOooO;
            sb.append(abstractC31715OooOO0O.OooO().f113306OooOo0o.o000OOO(C31441OooOO0.f112387o00O0OOo));
            sb.append(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
            sb.append(abstractC31715OooOO0O.OooO().OooO00o());
            sb.append(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
            C31719OooOOOO c31719OooOOOOOooO = abstractC31715OooOO0O.OooO();
            c31719OooOOOOOooO.getClass();
            sb.append(c31719OooOOOOOooO.f113306OooOo0o.o000O00O(C31441OooOO0.f112409o00OO0O0, null, -1));
            string = sb.toString();
        } else if (c31441OooOO0O0Oo0oo != null) {
            string = c31441OooOO0O0Oo0oo.f112461OooOo;
        }
        if (string != null) {
            try {
                C31327OooO0O0 c31327OooO0O0OooO00o = C31708OooO0OO.OooO00o(string);
                this.f113320Oooo000 = C31708OooO0OO.OooO00o(c31327OooO0O0OooO00o.f111862OooO0O0 + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + c31327OooO0O0OooO00o.f111863OooO0OO + "-UCS2");
            } catch (IOException e) {
                StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Could not get ", string, " UC2 map for font ");
                sbOooO0o0.append(c31436OooO0Oo.o000OOO(C31441OooOO0.f112259OoooO0O));
                Log.w("PdfBox-Android", sbOooO0o0.toString(), e);
            }
        }
    }

    public final String OooOo0(int i) throws IOException {
        String str;
        C31401Oooo0oO c31401Oooo0oO;
        C31436OooO0Oo c31436OooO0Oo = this.f113309OooOo0o;
        C31327OooO0O0 c31327OooO0O0 = this.f113308OooOo;
        if (c31327OooO0O0 != null) {
            String str2 = c31327OooO0O0.f111861OooO00o;
            HashMap map = c31327OooO0O0.f111867OooO0oO;
            str = (str2 != null && str2.startsWith("Identity-") && ((c31436OooO0Oo.o0000O0O(C31441OooOO0.f112413o00OO0oO) instanceof C31441OooOO0) || map.isEmpty())) ? new String(new char[]{(char) i}) : (String) map.get(Integer.valueOf(i));
        } else {
            str = null;
        }
        if (str != null) {
            return str;
        }
        boolean z = this.f113321Oooo00O;
        AbstractC31715OooOO0O abstractC31715OooOO0O = this.f113317OooOooO;
        if ((z || this.f113322Oooo00o) && this.f113320Oooo000 != null) {
            return (String) this.f113320Oooo000.f111867OooO0oO.get(Integer.valueOf(abstractC31715OooOO0O.OooO0o0(i)));
        }
        if ((abstractC31715OooOO0O instanceof C31718OooOOO0) && (c31401Oooo0oO = ((C31718OooOOO0) abstractC31715OooOO0O).f113298OooOooo) != null) {
            try {
                InterfaceC31361OooO0OO interfaceC31361OooO0OOO0000oO = c31401Oooo0oO.o0000oO(false);
                if (interfaceC31361OooO0OOO0000oO != null) {
                    ArrayList arrayListOooO00o = interfaceC31361OooO0OOO0000oO.OooO00o(((C31718OooOOO0) abstractC31715OooOO0O).f113301Oooo00O ? abstractC31715OooOO0O.OooO0o(i) : abstractC31715OooOO0O.OooO0o0(i));
                    if (arrayListOooO00o != null && !arrayListOooO00o.isEmpty()) {
                        return Character.toString((char) ((Integer) arrayListOooO00o.get(0)).intValue());
                    }
                }
            } catch (IOException e) {
                Log.w("PdfBox-Android", "get unicode from font cmap fail", e);
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        HashSet hashSet = this.f113319Oooo0;
        if (!hashSet.contains(numValueOf)) {
            StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "No Unicode mapping for ", "CID+" + abstractC31715OooOO0O.OooO0o0(i), " (", ") in font ");
            sbOooO0OO.append(c31436OooO0Oo.o000OOO(C31441OooOO0.f112259OoooO0O));
            Log.w("PdfBox-Android", sbOooO0OO.toString());
            hashSet.add(Integer.valueOf(i));
        }
        return null;
    }

    public final void OooOo00() throws IOException {
        C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112291o0000O0O;
        C31436OooO0Oo c31436OooO0Oo = this.f113309OooOo0o;
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = c31436OooO0Oo.o0000O0O(c31441OooOO0);
        boolean z = true;
        if (abstractC31434OooO0O0O0000O0O instanceof C31441OooOO0) {
            this.f113318OooOooo = C31708OooO0OO.OooO00o(((C31441OooOO0) abstractC31434OooO0O0O0000O0O).f112461OooOo);
            this.f113321Oooo00O = true;
        } else if (abstractC31434OooO0O0O0000O0O != null) {
            C31327OooO0O0 c31327OooO0O0OooOOO = AbstractC31720OooOOOo.OooOOO(abstractC31434OooO0O0O0000O0O);
            this.f113318OooOooo = c31327OooO0O0OooOOO;
            if (c31327OooO0O0OooOOO.f111860OooO.isEmpty() && c31327OooO0O0OooOOO.f111869OooOO0.isEmpty()) {
                Log.w("PdfBox-Android", "Invalid Encoding CMap in font " + c31436OooO0Oo.o000OOO(C31441OooOO0.f112259OoooO0O));
            }
        }
        C31719OooOOOO c31719OooOOOOOooO = this.f113317OooOooO.OooO();
        if (c31719OooOOOOOooO != null) {
            if (!"Adobe".equals(c31719OooOOOOOooO.f113306OooOo0o.o000OOO(C31441OooOO0.f112387o00O0OOo)) || (!"GB1".equals(c31719OooOOOOOooO.OooO00o()) && !"CNS1".equals(c31719OooOOOOOooO.OooO00o()) && !"Japan1".equals(c31719OooOOOOOooO.OooO00o()) && !"Korea1".equals(c31719OooOOOOOooO.OooO00o()))) {
                z = false;
            }
            this.f113322Oooo00o = z;
        }
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final String getName() {
        return this.f113309OooOo0o.o000OOO(C31441OooOO0.f112259OoooO0O);
    }

    @Override // o0ooo0.InterfaceC31731OooOoo
    public final Path getPath(int i) throws IOException {
        return this.f113317OooOooO.getPath(i);
    }

    @Override // o0ooo0.AbstractC31720OooOOOo
    public final String toString() {
        AbstractC31715OooOO0O abstractC31715OooOO0O = this.f113317OooOooO;
        return OooOo.class.getSimpleName() + "/" + (abstractC31715OooOO0O != null ? abstractC31715OooOO0O.getClass().getSimpleName() : null) + ", PostScript name: " + this.f113309OooOo0o.o000OOO(C31441OooOO0.f112259OoooO0O);
    }

    public OooOo(C31611OooO00o c31611OooO00o, C31401Oooo0oO c31401Oooo0oO) throws Throwable {
        this.f113319Oooo0 = new HashSet();
        C31717OooOOO c31717OooOOO = new C31717OooOOO(c31611OooO00o, this.f113309OooOo0o, c31401Oooo0oO, this);
        this.f113317OooOooO = new C31718OooOOO0(c31717OooOOO.f113293OooO0oO, c31717OooOOO.f113292OooO0o0, c31717OooOOO.f113358OooO00o);
        OooOo00();
        OooOOoo();
    }
}
