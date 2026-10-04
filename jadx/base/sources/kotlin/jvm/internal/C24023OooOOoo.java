package kotlin.jvm.internal;

import java.util.Objects;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: renamed from: kotlin.jvm.internal.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C24023OooOOoo extends AbstractC24021OooOOo {
    public C24023OooOOoo(InterfaceC34595OooO0Oo interfaceC34595OooO0Oo, String str, String str2) {
        super(AbstractC24015OooO0Oo.NO_RECEIVER, ((InterfaceC24016OooO0o0) interfaceC34595OooO0Oo).OooO(), str, str2, !Objects.nonNull(interfaceC34595OooO0Oo) ? 1 : 0);
    }

    @Override // oOoo0.InterfaceC34603OooOOO
    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public C24023OooOOoo(Class cls, String str, String str2, int i) {
        super(AbstractC24015OooO0Oo.NO_RECEIVER, cls, str, str2, i);
    }
}
