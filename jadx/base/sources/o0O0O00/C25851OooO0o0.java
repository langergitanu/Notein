package o0O0O00;

import java.text.CharacterIterator;

/* JADX INFO: renamed from: o0O0O00.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25851OooO0o0 implements CharacterIterator {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f88215OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final CharSequence f88216OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f88217OooOoO0;

    public C25851OooO0o0(int i, CharSequence charSequence) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(charSequence, "charSequence");
        this.f88216OooOo0o = charSequence;
        this.f88215OooOo = i;
        this.f88217OooOoO0 = 0;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            Object objClone = super.clone();
            kotlin.jvm.internal.OooOOO0.OooO0o(objClone, "{\n            @Suppress(…  super.clone()\n        }");
            return objClone;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.f88217OooOoO0;
        if (i == this.f88215OooOo) {
            return (char) 65535;
        }
        return this.f88216OooOo0o.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f88217OooOoO0 = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f88215OooOo;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f88217OooOoO0;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.f88215OooOo;
        if (i == 0) {
            this.f88217OooOoO0 = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f88217OooOoO0 = i2;
        return this.f88216OooOo0o.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.f88217OooOoO0 + 1;
        this.f88217OooOoO0 = i;
        int i2 = this.f88215OooOo;
        if (i < i2) {
            return this.f88216OooOo0o.charAt(i);
        }
        this.f88217OooOoO0 = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.f88217OooOoO0;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f88217OooOoO0 = i2;
        return this.f88216OooOo0o.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.f88215OooOo || i < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f88217OooOoO0 = i;
        return current();
    }
}
