package oO0O00oo;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.AbstractC34427OooOOOo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 extends AbstractC34427OooOOOo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f116807OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f116808OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f116809OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f116810OooOoO0;

    public OooO0O0(char c, char c2, int i) {
        this.f116808OooOo0o = i;
        this.f116807OooOo = c2;
        boolean z = false;
        if (i <= 0 ? OooOOO0.OooO(c, c2) >= 0 : OooOOO0.OooO(c, c2) <= 0) {
            z = true;
        }
        this.f116810OooOoO0 = z;
        this.f116809OooOoO = z ? c : c2;
    }

    @Override // oOo000Oo.AbstractC34427OooOOOo
    public final char OooO00o() {
        int i = this.f116809OooOoO;
        if (i != this.f116807OooOo) {
            this.f116809OooOoO = this.f116808OooOo0o + i;
        } else {
            if (!this.f116810OooOoO0) {
                throw new NoSuchElementException();
            }
            this.f116810OooOoO0 = false;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f116810OooOoO0;
    }
}
