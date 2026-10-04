package oOo000Oo;

import java.util.Iterator;

/* JADX INFO: renamed from: oOo000Oo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34427OooOOOo implements Iterator<Character>, oO0O00.OooO00o {
    public abstract char OooO00o();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Character next() {
        return Character.valueOf(OooO00o());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
