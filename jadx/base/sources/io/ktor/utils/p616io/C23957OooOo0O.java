package io.ktor.utils.p616io;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.C24030OooOoo;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: io.ktor.utils.io.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23957OooOo0O extends OooOOOO implements InterfaceC32507OooOO0o<ByteBuffer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C24030OooOoo f80644OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23957OooOo0O(C24030OooOoo c24030OooOoo) {
        super(1);
        this.f80644OooOo0o = c24030OooOoo;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(ByteBuffer byteBuffer) {
        ByteBuffer it = byteBuffer;
        OooOOO0.OooO0oO(it, "it");
        if (it.get(it.position()) == 10) {
            it.position(it.position() + 1);
            this.f80644OooOo0o.f80938OooOo0o = true;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
