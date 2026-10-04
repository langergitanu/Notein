package OooOoOO;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000<T> implements InterfaceC20526OooOO0o<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C20546Oooo00O f58682OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final EnumC20551Oooo0o0 f58683OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f58684OooO0OO;

    public Oooo000() {
        throw null;
    }

    public Oooo000(C20546Oooo00O c20546Oooo00O, EnumC20551Oooo0o0 enumC20551Oooo0o0, long j) {
        this.f58682OooO00o = c20546Oooo00O;
        this.f58683OooO0O0 = enumC20551Oooo0o0;
        this.f58684OooO0OO = j;
    }

    @Override // OooOoOO.InterfaceC20526OooOO0o
    public final <V extends AbstractC20531OooOOo> o00O0O<V> OooO00o(InterfaceC20574Ooooooo<T, V> converter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(converter, "converter");
        return new o00oO0O(this.f58682OooO00o.OooO00o(converter), this.f58683OooO0O0, this.f58684OooO0OO);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Oooo000)) {
            return false;
        }
        Oooo000 oooo000 = (Oooo000) obj;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(oooo000.f58682OooO00o, this.f58682OooO00o) && oooo000.f58683OooO0O0 == this.f58683OooO0O0) {
            return oooo000.f58684OooO0OO == this.f58684OooO0OO;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f58684OooO0OO) + ((this.f58683OooO0O0.hashCode() + (this.f58682OooO00o.f58685OooO00o.hashCode() * 31)) * 31);
    }
}
