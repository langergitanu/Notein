package Oooo0oO;

import OooOo.C20481OooOOoo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: Oooo0oO.o0000o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21093o0000o0O implements Iterable<Object>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f61154OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f61156OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f61158OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f61159OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f61160OooOoo0;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public HashMap<C21025OooO0o0, C21068OoooOoO> f61162OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public C20481OooOOoo<OooOo.OooOo00> f61163Oooo000;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int[] f61155OooOo0o = new int[0];

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object[] f61157OooOoO0 = new Object[0];

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public ArrayList<C21025OooO0o0> f61161OooOooO = new ArrayList<>();

    public final C21025OooO0o0 OooO0O0() {
        if (this.f61160OooOoo0) {
            C21038OooOo.OooO0OO("use active SlotWriter to create an anchor location instead");
            throw null;
        }
        int i = this.f61154OooOo;
        if (i <= 0) {
            o000000O.OooO0O0("Parameter index is out of range");
            throw null;
        }
        ArrayList<C21025OooO0o0> arrayList = this.f61161OooOooO;
        int iOooOOOo = C21091o0000o.OooOOOo(arrayList, 0, i);
        if (iOooOOOo >= 0) {
            return arrayList.get(iOooOOOo);
        }
        C21025OooO0o0 c21025OooO0o0 = new C21025OooO0o0(0);
        arrayList.add(-(iOooOOOo + 1), c21025OooO0o0);
        return c21025OooO0o0;
    }

    public final int OooO0Oo(C21025OooO0o0 c21025OooO0o0) {
        if (this.f61160OooOoo0) {
            C21038OooOo.OooO0OO("Use active SlotWriter to determine anchor location instead");
            throw null;
        }
        if (c21025OooO0o0.OooO00o()) {
            return c21025OooO0o0.f60884OooO00o;
        }
        o000000O.OooO0O0("Anchor refers to a group that was removed");
        throw null;
    }

    public final C21092o0000o0 OooO0o() {
        if (this.f61160OooOoo0) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f61158OooOoOO++;
        return new C21092o0000o0(this);
    }

    public final void OooO0o0() {
        this.f61162OooOooo = new HashMap<>();
    }

    public final C21096o0000oO0 OooO0oO() {
        if (this.f61160OooOoo0) {
            C21038OooOo.OooO0OO("Cannot start a writer when another writer is pending");
            throw null;
        }
        if (this.f61158OooOoOO > 0) {
            C21038OooOo.OooO0OO("Cannot start a writer when a reader is pending");
            throw null;
        }
        this.f61160OooOoo0 = true;
        this.f61159OooOoo++;
        return new C21096o0000oO0(this);
    }

    public final boolean OooO0oo(C21025OooO0o0 c21025OooO0o0) {
        int iOooOOOo;
        return c21025OooO0o0.OooO00o() && (iOooOOOo = C21091o0000o.OooOOOo(this.f61161OooOooO, c21025OooO0o0.f60884OooO00o, this.f61154OooOo)) >= 0 && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f61161OooOooO.get(iOooOOOo), c21025OooO0o0);
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new C21067OoooOo0(this, 0, this.f61154OooOo);
    }
}
