package o0ooo0O;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o0000o0O.AbstractC24304ooOO;
import o0oo0o0o.C31324OooO0O0;
import o0oo0o0o.C31325OooO0OO;
import o0ooO0Oo.AbstractC31434OooO0O0;

/* JADX INFO: renamed from: o0ooo0O.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31759OooOO0 extends AbstractC31753OooO0OO {
    public C31759OooOO0(C31325OooO0OO c31325OooO0OO) {
        for (C31324OooO0O0 c31324OooO0O0 : Collections.unmodifiableList(c31325OooO0OO.f111855OooOO0o)) {
            OooO00o(c31324OooO0O0.f111840OooO00o, c31324OooO0O0.f111842OooO0OO);
        }
    }

    public static C31759OooOO0 OooO0o0(AbstractC24304ooOO abstractC24304ooOO) {
        Map mapUnmodifiableMap = Collections.unmodifiableMap((HashMap) abstractC24304ooOO.f81814OooO0O0);
        C31759OooOO0 c31759OooOO0 = new C31759OooOO0();
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            c31759OooOO0.OooO00o(((Integer) entry.getKey()).intValue(), (String) entry.getValue());
        }
        return c31759OooOO0;
    }

    @Override // o0ooo0O.AbstractC31753OooO0OO
    public final String OooO0O0() {
        return "built-in (Type 1)";
    }

    @Override // o0ooOoo.InterfaceC31671OooO0OO
    public final AbstractC31434OooO0O0 OooOOo0() {
        return null;
    }
}
