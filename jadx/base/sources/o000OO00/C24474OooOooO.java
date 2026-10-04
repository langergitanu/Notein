package o000OO00;

import androidx.ink.brush.TextureLayerNative;
import kotlin.jvm.internal.C24019OooOO0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o000OO00.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24474OooOooO extends C24019OooOO0o implements InterfaceC32507OooOO0o<Long, C32460OooOooO> {
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(Long l) {
        ((TextureLayerNative) this.receiver).free(l.longValue());
        return C32460OooOooO.f116667OooO00o;
    }
}
