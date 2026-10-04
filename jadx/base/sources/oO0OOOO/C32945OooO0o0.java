package oO0OOOO;

import OooOoo0.C20706o00000oO;
import com.aspose.words.ControlChar;
import com.huawei.hms.network.embedded.C18358t1;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.InterfaceC33348OooooOO;

/* JADX INFO: renamed from: oO0OOOO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32945OooO0o0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<InterfaceC33348OooooOO, CharSequence> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C32944OooO0Oo f118982OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32945OooO0o0(C32944OooO0Oo c32944OooO0Oo) {
        super(1);
        this.f118982OooOo0o = c32944OooO0Oo;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final CharSequence invoke(InterfaceC33348OooooOO interfaceC33348OooooOO) {
        InterfaceC33348OooooOO it = interfaceC33348OooooOO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        if (it.OooO00o()) {
            return C18358t1.g.f56183c;
        }
        AbstractC33320OooOoo type = it.getType();
        kotlin.jvm.internal.OooOOO0.OooO0o(type, "it.type");
        String strOoooOOo = this.f118982OooOo0o.OoooOOo(type);
        if (it.OooO0OO() == 1) {
            return strOoooOOo;
        }
        return C20706o00000oO.OooO0OO(it.OooO0OO()) + ControlChar.SPACE_CHAR + strOoooOOo;
    }
}
