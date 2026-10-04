package o0oo0oO0;

import android.graphics.Path;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o0000o0O.AbstractC24304ooOO;
import o000o0O0.AbstractC24602Oooo0o0;
import o0oo0o0O.InterfaceC31321OooO00o;
import o0oo0ooO.InterfaceC31408OooO0OO;

/* JADX INFO: renamed from: o0oo0oO0.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31348OooOOO0 extends AbstractC31337OooO0oO implements InterfaceC31321OooO00o {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public AbstractC31333OooO0OO f111932OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final LinkedHashMap f111933OooOoo0 = new LinkedHashMap();

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final ConcurrentHashMap f111934OooOooO = new ConcurrentHashMap();

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final OooO00o f111935OooOooo = new OooO00o();

    /* JADX INFO: renamed from: o0oo0oO0.OooOOO0$OooO00o */
    public class OooO00o implements InterfaceC31408OooO0OO {
        public OooO00o() {
        }

        @Override // o0oo0ooO.InterfaceC31408OooO0OO
        public final C31352OooOOo0 OooO0Oo(String str) throws IOException {
            return C31348OooOOO0.this.OooO0o(str);
        }
    }

    @Override // o0oo0o0O.InterfaceC31322OooO0O0
    public final List<Number> OooO00o() {
        return (List) this.f111895OooOo.get("FontMatrix");
    }

    @Override // o0oo0o0O.InterfaceC31321OooO00o
    public final AbstractC24304ooOO OooO0O0() throws IOException {
        return this.f111932OooOoo;
    }

    public final C31352OooOOo0 OooO0o(String str) throws IOException {
        AbstractC24602Oooo0o0 abstractC24602Oooo0o0 = this.f111898OooOoO0;
        if (abstractC24602Oooo0o0.f83367OooO00o) {
            throw new IllegalStateException("Not a Type 1-equivalent font");
        }
        Integer num = (Integer) ((HashMap) abstractC24602Oooo0o0.f83370OooO0Oo).get(str);
        return OooO0oO(this.f111898OooOoO0.OooO0o0(num == null ? 0 : num.intValue()), str);
    }

    @Override // o0oo0oO0.AbstractC31337OooO0oO
    public final C31355OooOo00 OooO0o0(int i) throws IOException {
        return OooO0oO(i, "GID+" + i);
    }

    public final C31355OooOo00 OooO0oO(int i, String str) throws IOException {
        ConcurrentHashMap concurrentHashMap = this.f111934OooOooO;
        C31355OooOo00 c31355OooOo00 = (C31355OooOo00) concurrentHashMap.get(Integer.valueOf(i));
        if (c31355OooOo00 != null) {
            return c31355OooOo00;
        }
        byte[][] bArr = this.f111897OooOoO;
        byte[] bArr2 = i < bArr.length ? bArr[i] : null;
        if (bArr2 == null) {
            bArr2 = bArr[0];
        }
        C31354OooOo0 c31354OooOo0 = new C31354OooOo0();
        c31354OooOo0.f111958OooO00o = 0;
        c31354OooOo0.f111959OooO0O0 = 0;
        c31354OooOo0.f111960OooO0OO = null;
        byte[][] bArr3 = this.f111899OooOoOO;
        LinkedHashMap linkedHashMap = this.f111933OooOoo0;
        List<Object> listOooO00o = c31354OooOo0.OooO00o(bArr2, bArr3, (byte[][]) linkedHashMap.get("Subrs"), true);
        String str2 = this.f111896OooOo0o;
        LinkedHashMap linkedHashMap2 = this.f111895OooOo;
        Object obj = linkedHashMap2.get("defaultWidthX");
        if (obj == null) {
            obj = linkedHashMap.get("defaultWidthX");
        }
        Number number = (Number) obj;
        int iIntValue = number == null ? 1000 : number.intValue();
        Object obj2 = linkedHashMap2.get("nominalWidthX");
        if (obj2 == null) {
            obj2 = linkedHashMap.get("nominalWidthX");
        }
        Number number2 = (Number) obj2;
        C31355OooOo00 c31355OooOo002 = new C31355OooOo00(this.f111935OooOooo, str2, str, listOooO00o, iIntValue, number2 != null ? number2.intValue() : 0);
        concurrentHashMap.put(Integer.valueOf(i), c31355OooOo002);
        return c31355OooOo002;
    }

    @Override // o0oo0o0O.InterfaceC31322OooO0O0
    public final Path OooOOO0(String str) throws IOException {
        return OooO0o(str).OooO00o();
    }

    @Override // o0oo0o0O.InterfaceC31322OooO0O0
    public final boolean OooOOo0(String str) {
        AbstractC24602Oooo0o0 abstractC24602Oooo0o0 = this.f111898OooOoO0;
        if (abstractC24602Oooo0o0.f83367OooO00o) {
            throw new IllegalStateException("Not a Type 1-equivalent font");
        }
        Integer num = (Integer) ((HashMap) abstractC24602Oooo0o0.f83370OooO0Oo).get(str);
        return this.f111898OooOoO0.OooO0o0(num == null ? 0 : num.intValue()) != 0;
    }

    @Override // o0oo0o0O.InterfaceC31322OooO0O0
    public final float OooOOoo(String str) throws IOException {
        return OooO0o(str).OooO0O0();
    }
}
