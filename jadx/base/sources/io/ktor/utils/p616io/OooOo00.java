package io.ktor.utils.p616io;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C24030OooOoo;
import kotlin.jvm.internal.C24033OooOooo;
import kotlin.jvm.internal.C24034Oooo00O;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.utils.io.ByteBufferChannel", m80623f = "ByteBufferChannel.kt", m80624l = {1954, 2030}, m80625m = "readUTF8LineToUtf8Suspend")
public final class OooOo00 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f80631OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO00o f80632OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Serializable f80633OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Serializable f80634OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C24030OooOoo f80635OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public char[] f80636OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public C24030OooOoo f80637OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public C24034Oooo00O f80638OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public C24033OooOooo f80639OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public int f80640Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f80641Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public /* synthetic */ Object f80642Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final /* synthetic */ OooO00o f80643Oooo00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f80643Oooo00o = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f80642Oooo00O = obj;
        this.f80640Oooo0 |= Integer.MIN_VALUE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooO00o.f80497OooOO0O;
        return this.f80643Oooo00o.o0OoOo0(null, 0, this);
    }
}
