package oOo0000O;

import kotlin.jvm.internal.OooOOO0;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo0000O.InterfaceC34415OooO0oo.OooO0O0;

/* JADX INFO: renamed from: oOo0000O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34409OooO0O0<B extends InterfaceC34415OooO0oo.OooO0O0, E extends B> implements InterfaceC34415OooO0oo.OooO0OO<E> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC34415OooO0oo.OooO0OO<?> f123418OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<InterfaceC34415OooO0oo.OooO0O0, E> f123419OooOo0o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [oOo0000O.OooO0oo$OooO0OO<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [oO0O000o.OooOO0o<? super oOo0000O.OooO0oo$OooO0O0, ? extends E extends B>, oO0O000o.OooOO0o<oOo0000O.OooO0oo$OooO0O0, E extends B>] */
    public AbstractC34409OooO0O0(InterfaceC34415OooO0oo.OooO0OO<B> baseKey, InterfaceC32507OooOO0o<? super InterfaceC34415OooO0oo.OooO0O0, ? extends E> interfaceC32507OooOO0o) {
        OooOOO0.OooO0oO(baseKey, "baseKey");
        this.f123419OooOo0o = interfaceC32507OooOO0o;
        this.f123418OooOo = baseKey instanceof AbstractC34409OooO0O0 ? (InterfaceC34415OooO0oo.OooO0OO<B>) ((AbstractC34409OooO0O0) baseKey).f123418OooOo : baseKey;
    }
}
