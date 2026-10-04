package o00o0O0;

/* JADX INFO: renamed from: o00o0O0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25309OooO0O0<K, V> extends OooOo.OooO00o<K, V> {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f86143OooOoo;

    @Override // OooOo.C20493Oooo00o
    public final V OooO(int i) {
        this.f86143OooOoo = 0;
        return (V) super.OooO(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // OooOo.C20493Oooo00o
    public final void OooO0oo(OooOo.OooO00o oooO00o) {
        this.f86143OooOoo = 0;
        super((String) oooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // OooOo.C20493Oooo00o
    public final V OooOO0(int i, V v) {
        this.f86143OooOoo = 0;
        return (V) super/*java.io.File*/.exists();
    }

    @Override // OooOo.C20493Oooo00o, java.util.Map
    public final void clear() {
        this.f86143OooOoo = 0;
        super.clear();
    }

    @Override // OooOo.C20493Oooo00o, java.util.Map
    public final int hashCode() {
        if (this.f86143OooOoo == 0) {
            this.f86143OooOoo = super.hashCode();
        }
        return this.f86143OooOoo;
    }

    @Override // OooOo.C20493Oooo00o, java.util.Map
    public final V put(K k, V v) {
        this.f86143OooOoo = 0;
        return (V) super.put(k, v);
    }
}
