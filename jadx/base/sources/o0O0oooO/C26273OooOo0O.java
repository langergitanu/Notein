package o0O0oooO;

import java.io.File;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0O0oooO.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26273OooOo0O implements InterfaceC32508OooOOOo {
    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Object obj, Object obj2) {
        String name = ((File) obj).getName();
        String name2 = ((File) obj2).getName();
        kotlin.jvm.internal.OooOOO0.OooO0o(name2, "getName(...)");
        return Integer.valueOf(name.compareTo(name2));
    }
}
