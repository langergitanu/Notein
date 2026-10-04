package oO0O00oo;

import java.util.Iterator;
import o0000OOo.C24217OooO0O0;

/* JADX INFO: renamed from: oO0O00oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C32516OooO00o implements Iterable<Character>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final char f116804OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final char f116805OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f116806OooOoO0 = 1;

    public C32516OooO00o(char c, char c2) {
        this.f116805OooOo0o = c;
        this.f116804OooOo = (char) C24217OooO0O0.OooO0oo(c, c2, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new OooO0O0(this.f116805OooOo0o, this.f116804OooOo, this.f116806OooOoO0);
    }
}
