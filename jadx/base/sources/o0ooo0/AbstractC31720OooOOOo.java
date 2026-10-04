package o0ooo0;

import android.util.Log;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o0oo0o0o.C31325OooO0OO;
import o0oo0oO.C31327OooO0O0;
import o0oo0oO.C31328OooO0OO;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.AbstractC31443OooOO0o;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31440OooO0oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31448OooOOo;
import o0ooO0o.C31455OooO00o;
import o0ooOoo.C31669OooO00o;
import o0ooOoo.InterfaceC31671OooO0OO;
import o0oooOO0.C31837OooO0OO;

/* JADX INFO: renamed from: o0ooo0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31720OooOOOo implements InterfaceC31671OooO0OO, InterfaceC31721OooOOo {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final C31837OooO0OO f113307OooOoo = new C31837OooO0OO(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C31327OooO0O0 f113308OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31436OooO0Oo f113309OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C31722OooOOo0 f113310OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C31325OooO0OO f113311OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public List<Float> f113312OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final AbstractMap f113313OooOoo0;

    public AbstractC31720OooOOOo() {
        C31436OooO0Oo c31436OooO0Oo = new C31436OooO0Oo();
        this.f113309OooOo0o = c31436OooO0Oo;
        c31436OooO0Oo.o000OoOO(C31441OooOO0.f112403o00OO, C31441OooOO0.f112300o0000o);
        this.f113308OooOo = null;
        this.f113310OooOoO = null;
        this.f113311OooOoO0 = null;
        this.f113313OooOoo0 = new HashMap();
    }

    public static C31327OooO0O0 OooOOO(AbstractC31434OooO0O0 abstractC31434OooO0O0) throws IOException {
        if (abstractC31434OooO0O0 instanceof C31441OooOO0) {
            return C31708OooO0OO.OooO00o(((C31441OooOO0) abstractC31434OooO0O0).f112461OooOo);
        }
        if (!(abstractC31434OooO0O0 instanceof C31448OooOOo)) {
            throw new IOException("Expected Name or Stream");
        }
        C31440OooO0oo c31440OooO0ooO000o00O = null;
        try {
            c31440OooO0ooO000o00O = ((C31448OooOOo) abstractC31434OooO0O0).o000o00O();
            Map<String, C31327OooO0O0> map = C31708OooO0OO.f113247OooO00o;
            return new C31328OooO0OO(0).OooO0oo(c31440OooO0ooO000o00O);
        } finally {
            C31455OooO00o.OooO0O0(c31440OooO0ooO000o00O);
        }
    }

    public abstract float OooO(int i);

    @Override // o0ooo0.InterfaceC31721OooOOo
    public C31837OooO0OO OooO00o() {
        return f113307OooOoo;
    }

    public abstract byte[] OooO0o(int i) throws IOException;

    public abstract void OooO0o0(int i);

    public final byte[] OooO0oO(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int iCharCount = 0;
        while (iCharCount < str.length()) {
            int iCodePointAt = str.codePointAt(iCharCount);
            byteArrayOutputStream.write(OooO0o(iCodePointAt));
            iCharCount += Character.charCount(iCodePointAt);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public C31722OooOOo0 OooO0oo() {
        return this.f113310OooOoO;
    }

    public float OooOO0(String str) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(OooO0oO(str));
        float fOooOO0O = 0.0f;
        while (byteArrayInputStream.available() > 0) {
            fOooOO0O += OooOO0O(OooOOOO(byteArrayInputStream));
        }
        return fOooOO0O;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float OooOO0O(int i) throws IOException {
        AbstractMap abstractMap = this.f113313OooOoo0;
        Float f = (Float) abstractMap.get(Integer.valueOf(i));
        if (f != null) {
            return f.floatValue();
        }
        C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112424o00OOOoO;
        C31436OooO0Oo c31436OooO0Oo = this.f113309OooOo0o;
        if (c31436OooO0Oo.o0000O0O(c31441OooOO0) == null) {
            if (c31436OooO0Oo.f112222OooOoO0.containsKey(C31441OooOO0.f112352o000o0oO)) {
                int iO000O00O = c31436OooO0Oo.o000O00O(C31441OooOO0.f112296o0000Oo, null, -1);
                int iO000O00O2 = c31436OooO0Oo.o000O00O(C31441OooOO0.f112339o000Ooo0, null, -1);
                int size = OooOO0o().size();
                int i2 = i - iO000O00O;
                if (size > 0 && i >= iO000O00O && i <= iO000O00O2 && i2 < size) {
                    Float fValueOf = OooOO0o().get(i2);
                    if (fValueOf == null) {
                        fValueOf = Float.valueOf(0.0f);
                    }
                    abstractMap.put(Integer.valueOf(i), fValueOf);
                    return fValueOf.floatValue();
                }
                C31722OooOOo0 c31722OooOOo0OooO0oo = OooO0oo();
                if (c31722OooOOo0OooO0oo != null) {
                    float fO0000ooO = c31722OooOOo0OooO0oo.f113315OooOo0o.o0000ooO(C31441OooOO0.f112352o000o0oO, 0.0f);
                    abstractMap.put(Integer.valueOf(i), Float.valueOf(fO0000ooO));
                    return fO0000ooO;
                }
            }
        }
        if (OooOOO0()) {
            float fOooO = OooO(i);
            abstractMap.put(Integer.valueOf(i), Float.valueOf(fOooO));
            return fOooO;
        }
        float fOooO0O0 = OooO0O0(i);
        abstractMap.put(Integer.valueOf(i), Float.valueOf(fOooO0O0));
        return fOooO0O0;
    }

    public final List<Float> OooOO0o() {
        if (this.f113312OooOoOO == null) {
            C31433OooO00o c31433OooO00oOooo0 = this.f113309OooOo0o.Oooo0(C31441OooOO0.f112424o00OOOoO);
            if (c31433OooO00oOooo0 != null) {
                ArrayList arrayList = c31433OooO00oOooo0.f112214OooOo;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (int i = 0; i < arrayList.size(); i++) {
                    AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO = c31433OooO00oOooo0.Oooo0OO(i);
                    if (abstractC31434OooO0O0Oooo0OO instanceof AbstractC31443OooOO0o) {
                        arrayList2.add(Float.valueOf(((AbstractC31443OooOO0o) abstractC31434OooO0O0Oooo0OO).OooOooo()));
                    } else {
                        arrayList2.add(null);
                    }
                }
                this.f113312OooOoOO = new C31669OooO00o(arrayList2, c31433OooO00oOooo0);
            } else {
                this.f113312OooOoOO = Collections.EMPTY_LIST;
            }
        }
        return this.f113312OooOoOO;
    }

    public boolean OooOOO0() {
        if (OooO0Oo()) {
            return false;
        }
        return C31733OooOooO.f113356OooO00o.containsKey(getName());
    }

    public abstract int OooOOOO(ByteArrayInputStream byteArrayInputStream) throws IOException;

    public abstract void OooOOOo() throws IOException;

    public abstract boolean OooOOo();

    @Override // o0ooOoo.InterfaceC31671OooO0OO
    public final AbstractC31434OooO0O0 OooOOo0() {
        return this.f113309OooOo0o;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC31720OooOOOo) && ((AbstractC31720OooOOOo) obj).f113309OooOo0o == this.f113309OooOo0o;
    }

    public final int hashCode() {
        return this.f113309OooOo0o.hashCode();
    }

    public String toString() {
        return getClass().getSimpleName() + " " + getName();
    }

    public AbstractC31720OooOOOo(String str) {
        C31436OooO0Oo c31436OooO0Oo = new C31436OooO0Oo();
        this.f113309OooOo0o = c31436OooO0Oo;
        c31436OooO0Oo.o000OoOO(C31441OooOO0.f112403o00OO, C31441OooOO0.f112300o0000o);
        this.f113308OooOo = null;
        C31325OooO0OO c31325OooO0OOOooO00o = C31733OooOooO.OooO00o(str);
        this.f113311OooOoO0 = c31325OooO0OOOooO00o;
        if (c31325OooO0OOOooO00o != null) {
            this.f113310OooOoO = OooO.OooO00o.OooO00o(c31325OooO0OOOooO00o);
            this.f113313OooOoo0 = new ConcurrentHashMap();
            return;
        }
        throw new IllegalArgumentException("No AFM for font ".concat(str));
    }

    public AbstractC31720OooOOOo(C31436OooO0Oo c31436OooO0Oo) throws Throwable {
        C31722OooOOo0 c31722OooOOo0OooO00o;
        this.f113309OooOo0o = c31436OooO0Oo;
        this.f113313OooOoo0 = new HashMap();
        C31325OooO0OO c31325OooO0OOOooO00o = C31733OooOooO.OooO00o(getName());
        this.f113311OooOoO0 = c31325OooO0OOOooO00o;
        C31436OooO0Oo c31436OooO0OoOooo0OO = c31436OooO0Oo.Oooo0OO(C31441OooOO0.f112305o0000oOO);
        C31327OooO0O0 c31327OooO0O0OooOOO = null;
        if (c31436OooO0OoOooo0OO != null) {
            c31722OooOOo0OooO00o = new C31722OooOOo0(c31436OooO0OoOooo0OO);
        } else {
            c31722OooOOo0OooO00o = c31325OooO0OOOooO00o != null ? OooO.OooO00o.OooO00o(c31325OooO0OOOooO00o) : null;
        }
        this.f113310OooOoO = c31722OooOOo0OooO00o;
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = c31436OooO0Oo.o0000O0O(C31441OooOO0.f112413o00OO0oO);
        if (abstractC31434OooO0O0O0000O0O != null) {
            try {
                c31327OooO0O0OooOOO = OooOOO(abstractC31434OooO0O0O0000O0O);
                if (c31327OooO0O0OooOOO.f111867OooO0oO.isEmpty()) {
                    Log.w("PdfBox-Android", "Invalid ToUnicode CMap in font " + getName());
                    String str = c31327OooO0O0OooOOO.f111861OooO00o;
                    str = str == null ? "" : str;
                    String str2 = c31327OooO0O0OooOOO.f111863OooO0OO;
                    String str3 = str2 != null ? str2 : "";
                    AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O2 = c31436OooO0Oo.o0000O0O(C31441OooOO0.f112291o0000O0O);
                    if (str.contains(AbstractDevicePopManager.CertificateProperties.ORGANIZATION_UNIT) || str3.contains(AbstractDevicePopManager.CertificateProperties.ORGANIZATION_UNIT) || C31441OooOO0.f112323o000OO00.equals(abstractC31434OooO0O0O0000O0O2) || C31441OooOO0.f112445o0OoO0o.equals(abstractC31434OooO0O0O0000O0O2)) {
                        c31327OooO0O0OooOOO = C31708OooO0OO.OooO00o(C31441OooOO0.f112323o000OO00.f112461OooOo);
                        Log.w("PdfBox-Android", "Using predefined identity CMap instead");
                    }
                }
            } catch (IOException e) {
                Log.e("PdfBox-Android", "Could not read ToUnicode CMap in font " + getName(), e);
            }
        }
        this.f113308OooOo = c31327OooO0O0OooOOO;
    }
}
