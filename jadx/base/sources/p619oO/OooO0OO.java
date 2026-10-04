package p619oO;

import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f113618OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C31901OooOo0 f113619OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f113620OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f113621OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f113622OooOoOO = false;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f113623OooOoo0 = false;

    public OooO0OO(int i) {
        this.f113618OooOo = i;
    }

    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final OooO0OO clone() {
        OooO0OO oooO0OO = new OooO0OO(this.f113618OooOo);
        oooO0OO.f113619OooOo0o = this.f113619OooOo0o;
        oooO0OO.f113621OooOoO0 = this.f113621OooOoO0;
        oooO0OO.f113620OooOoO = this.f113620OooOoO;
        oooO0OO.f113622OooOoOO = this.f113622OooOoOO;
        oooO0OO.f113623OooOoo0 = this.f113623OooOoo0;
        return oooO0OO;
    }

    public final int OooO0O0() {
        if (!this.f113622OooOoOO || this.f113623OooOoo0) {
            return Integer.MAX_VALUE;
        }
        return this.f113621OooOoO0;
    }
}
