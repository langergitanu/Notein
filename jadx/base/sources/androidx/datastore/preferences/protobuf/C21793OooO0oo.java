package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.OooO;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21793OooO0oo extends OooO.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f64414OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f64415OooOo0o = 0;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooO f64416OooOoO0;

    public C21793OooO0oo(OooO oooO) {
        this.f64416OooOoO0 = oooO;
        this.f64414OooOo = oooO.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f64415OooOo0o < this.f64414OooOo;
    }
}
