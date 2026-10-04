package oO0o0OO0;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: oO0o0OO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33680OooO0O0 implements Externalizable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f121418OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f121419OooOo0o;

    public C33680OooO0O0(long j, long j2) {
        this.f121419OooOo0o = j;
        this.f121418OooOo = j2;
    }

    private final Object readResolve() {
        long j = this.f121419OooOo0o;
        long j2 = this.f121418OooOo;
        return (j == 0 && j2 == 0) ? C33679OooO00o.f121415OooOoO0 : new C33679OooO00o(j, j2);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput input) {
        OooOOO0.OooO0oO(input, "input");
        this.f121419OooOo0o = input.readLong();
        this.f121418OooOo = input.readLong();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput output) throws IOException {
        OooOOO0.OooO0oO(output, "output");
        output.writeLong(this.f121419OooOo0o);
        output.writeLong(this.f121418OooOo);
    }

    public C33680OooO0O0() {
        this(0L, 0L);
    }
}
