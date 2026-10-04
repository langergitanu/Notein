package oO0o0O0o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: oO0o0O0o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33585OooO0o0 implements Iterator<String>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f121252OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f121253OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f121254OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f121255OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f121256OooOoOO;

    public C33585OooO0o0(String string) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(string, "string");
        this.f121253OooOo0o = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f121252OooOo;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f121256OooOoOO < 0) {
            this.f121252OooOo = 2;
            return false;
        }
        String str = this.f121253OooOo0o;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.f121255OooOoO0; i4 < length2; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f121252OooOo = 1;
                this.f121256OooOoOO = i;
                this.f121254OooOoO = length;
                return true;
            }
        }
        i = -1;
        this.f121252OooOo = 1;
        this.f121256OooOoOO = i;
        this.f121254OooOoO = length;
        return true;
    }

    @Override // java.util.Iterator
    public final String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f121252OooOo = 0;
        int i = this.f121254OooOoO;
        int i2 = this.f121255OooOoO0;
        this.f121255OooOoO0 = this.f121256OooOoOO + i;
        return this.f121253OooOo0o.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
