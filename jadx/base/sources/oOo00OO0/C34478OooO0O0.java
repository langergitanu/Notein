package oOo00OO0;

import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: oOo00OO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34478OooO0O0 extends OooOOOO implements InterfaceC32508OooOOOo<Object, Integer, Character> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C34478OooO0O0 f123542OooOo0o = new C34478OooO0O0(2);

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Character invoke(Object obj, Integer num) {
        CharSequence s = (CharSequence) obj;
        int iIntValue = num.intValue();
        OooOOO0.OooO0oO(s, "s");
        return Character.valueOf(s.charAt(iIntValue));
    }
}
