package o0oo0oO0;

import Oooo0oo.AbstractC21138OooO0oo;
import android.graphics.Path;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o0oo0ooO.InterfaceC31408OooO0OO;

/* JADX INFO: renamed from: o0oo0oO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31331OooO00o extends AbstractC31337OooO0oO {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public String f111882OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public String f111883OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f111884OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public LinkedList f111885OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public AbstractC21138OooO0oo f111886Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final ConcurrentHashMap f111887Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C20171OooO00o f111888Oooo00o;

    /* JADX INFO: renamed from: o0oo0oO0.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C20171OooO00o implements InterfaceC31408OooO0OO {
        public C20171OooO00o() {
        }

        @Override // o0oo0ooO.InterfaceC31408OooO0OO
        public final C31352OooOOo0 OooO0Oo(String str) throws IOException {
            return C31331OooO00o.this.OooO0o0(0);
        }
    }

    public C31331OooO00o() {
        new LinkedList();
        this.f111885OooOooo = new LinkedList();
        this.f111887Oooo00O = new ConcurrentHashMap();
        this.f111888Oooo00o = new C20171OooO00o();
    }

    public static int OooO0oO(String str) {
        if (str.startsWith("\\")) {
            return Integer.parseInt(str.substring(1));
        }
        throw new IllegalArgumentException("Invalid selector");
    }

    @Override // o0oo0o0O.InterfaceC31322OooO0O0
    public final List<Number> OooO00o() {
        return (List) this.f111895OooOo.get("FontMatrix");
    }

    @Override // o0oo0oO0.AbstractC31337OooO0oO
    /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public final C31347OooOOO OooO0o0(int i) throws IOException {
        ConcurrentHashMap concurrentHashMap = this.f111887Oooo00O;
        C31347OooOOO c31347OooOOO = (C31347OooOOO) concurrentHashMap.get(Integer.valueOf(i));
        if (c31347OooOOO != null) {
            return c31347OooOOO;
        }
        int iOooO0Oo = this.f111898OooOoO0.OooO0Oo(i);
        byte[][] bArr = this.f111897OooOoO;
        byte[] bArr2 = bArr[iOooO0Oo];
        int iIntValue = 0;
        if (bArr2 == null) {
            bArr2 = bArr[0];
        }
        C31354OooOo0 c31354OooOo0 = new C31354OooOo0();
        c31354OooOo0.f111958OooO00o = 0;
        c31354OooOo0.f111959OooO0O0 = 0;
        c31354OooOo0.f111960OooO0OO = null;
        Locale locale = Locale.US;
        String.format(locale, "%04x", Integer.valueOf(i));
        byte[][] bArr3 = this.f111899OooOoOO;
        int iOoooO = this.f111886Oooo000.OoooO(iOooO0Oo);
        List<Object> listOooO00o = c31354OooOo0.OooO00o(bArr2, bArr3, iOoooO != -1 ? (byte[][]) ((Map) this.f111885OooOooo.get(iOoooO)).get("Subrs") : null, true);
        String str = this.f111896OooOo0o;
        int iOoooO2 = this.f111886Oooo000.OoooO(iOooO0Oo);
        int iIntValue2 = 1000;
        if (iOoooO2 != -1) {
            Map map = (Map) this.f111885OooOooo.get(iOoooO2);
            if (map.containsKey("defaultWidthX")) {
                iIntValue2 = ((Number) map.get("defaultWidthX")).intValue();
            }
        }
        int i2 = iIntValue2;
        int iOoooO3 = this.f111886Oooo000.OoooO(iOooO0Oo);
        if (iOoooO3 != -1) {
            Map map2 = (Map) this.f111885OooOooo.get(iOoooO3);
            if (map2.containsKey("nominalWidthX")) {
                iIntValue = ((Number) map2.get("nominalWidthX")).intValue();
            }
        }
        C31347OooOOO c31347OooOOO2 = new C31347OooOOO(this.f111888Oooo00o, str, String.format(locale, "%04x", Integer.valueOf(i)), listOooO00o, i2, iIntValue);
        concurrentHashMap.put(Integer.valueOf(i), c31347OooOOO2);
        return c31347OooOOO2;
    }

    @Override // o0oo0o0O.InterfaceC31322OooO0O0
    public final Path OooOOO0(String str) throws IOException {
        return OooO0o0(OooO0oO(str)).OooO00o();
    }

    @Override // o0oo0o0O.InterfaceC31322OooO0O0
    public final boolean OooOOo0(String str) throws IOException {
        return OooO0oO(str) != 0;
    }

    @Override // o0oo0o0O.InterfaceC31322OooO0O0
    public final float OooOOoo(String str) throws IOException {
        return OooO0o0(OooO0oO(str)).OooO0O0();
    }
}
