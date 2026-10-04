package OoooO00;

import OoooO0.AbstractC21143OooO0O0;
import OoooOO0.C21174OooO0OO;
import java.util.List;
import oOo000Oo.AbstractC34421OooO0Oo;

/* JADX INFO: renamed from: OoooO00.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21149OooO00o<E> extends AbstractC34421OooO0Oo<E> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f61372OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AbstractC21143OooO0O0 f61373OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f61374OooOoO0;

    public C21149OooO00o(AbstractC21143OooO0O0 abstractC21143OooO0O0, int i, int i2) {
        this.f61373OooOo0o = abstractC21143OooO0O0;
        this.f61372OooOo = i;
        C21174OooO0OO.OooO0OO(i, i2, abstractC21143OooO0O0.OooO0O0());
        this.f61374OooOoO0 = i2 - i;
    }

    @Override // oOo000Oo.AbstractC34419OooO0O0
    public final int OooO0O0() {
        return this.f61374OooOoO0;
    }

    @Override // java.util.List
    public final E get(int i) {
        C21174OooO0OO.OooO00o(i, this.f61374OooOoO0);
        return this.f61373OooOo0o.get(this.f61372OooOo + i);
    }

    @Override // oOo000Oo.AbstractC34421OooO0Oo, java.util.List
    public final List subList(int i, int i2) {
        C21174OooO0OO.OooO0OO(i, i2, this.f61374OooOoO0);
        int i3 = this.f61372OooOo;
        return new C21149OooO00o(this.f61373OooOo0o, i + i3, i3 + i2);
    }
}
