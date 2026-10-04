package oO0O00oo;

import java.util.NoSuchElementException;
import oOo000Oo.Oooo000;

/* JADX INFO: renamed from: oO0O00oo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32520OooO0oo extends Oooo000 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f116814OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f116815OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f116816OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f116817OooOoO0;

    public C32520OooO0oo(int i, int i2, int i3) {
        this.f116815OooOo0o = i3;
        this.f116814OooOo = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f116817OooOoO0 = z;
        this.f116816OooOoO = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f116817OooOoO0;
    }

    @Override // oOo000Oo.Oooo000
    public final int nextInt() {
        int i = this.f116816OooOoO;
        if (i != this.f116814OooOo) {
            this.f116816OooOoO = this.f116815OooOo0o + i;
            return i;
        }
        if (!this.f116817OooOoO0) {
            throw new NoSuchElementException();
        }
        this.f116817OooOoO0 = false;
        return i;
    }
}
